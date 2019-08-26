
//Lists.java

import java.util.ArrayList;

public class Lists {

   // required method

   static void swapLargestAndSecondSmallest(ArrayList<Integer> a) {

         // initializing variables to store indices of largest, smallest and

         // second smallest values to -1

         int indexLargest = -1, indexSmallest = -1, indexSecondSmallest = -1;

         // looping through each item on the list

         for (int i = 0; i < a.size(); i++) {

               // if this is first item, setting i as indices of largest and

               // smallest

               if (i == 0) {

                     indexLargest = i;

                     indexSmallest = i;

               } else {

                     // checking if current element is greater than element at

                     // indexLargest

                     if (a.get(i) > a.get(indexLargest)) {

                           // setting i as indexLargest

                           indexLargest = i;

                     }

                     // checking if current element is smaller than element at

                     // indexSmallest

                     if (a.get(i) < a.get(indexSmallest)) {

                           // setting current indexSmallest as index of second smallest

                           indexSecondSmallest = indexSmallest;

                           // setting i as indexSmallest

                           indexSmallest = i;

                     }

                     // checking if indexSecondSmallest is still -1 or current

                     // element is smaller than element at indexSecondSmallest and

                     // not equal to element at indexSmallest

                     if (indexSecondSmallest == -1

                                 || (a.get(i) < a.get(indexSecondSmallest) && a.get(i) != a

                                              .get(indexSmallest))) {

                           // setting i as indexSecondSmallest

                           indexSecondSmallest = i;

                     }

               }

         }

         // finally, if all indices are valid (not -1), then swapping elements at

         // indexLargest and indexSecondSmallest

         if (indexLargest != -1 && indexSmallest != -1

                     && indexSecondSmallest != -1) {

               int temp = a.get(indexLargest);

               a.set(indexLargest, a.get(indexSecondSmallest));

               a.set(indexSecondSmallest, temp);

         }

   }

}