package X;

import Y.IDComparatorS39S0000000_11;
import Y.IDRunnableS29S0200000;
import android.app.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.PIr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64229PIr {
    public static int LIZIZ(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    public static boolean LIZLLL(long j) {
        return ((j >> 63) & 1) == 1;
    }

    public static String LIZJ(List<C25510zL> list) {
        StringBuilder sb;
        Application application;
        StringBuilder sb2 = new StringBuilder();
        HashSet hashSet = new HashSet();
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new IDComparatorS39S0000000_11(18));
        for (int i = 0; i < linkedList.size(); i++) {
            int i2 = ((C25510zL) linkedList.get(i)).LIZ;
            if (i2 != 1048574) {
                if (((C25510zL) linkedList.get(i)).LJFF < 16 || hashSet.size() >= 5) {
                    break;
                }
                hashSet.add(Integer.valueOf(i2));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            sb2.append(num);
            sb2.append("\n");
            C25530zN c25530zN = C25520zM.LIZ;
            int intValue = num.intValue();
            c25530zN.getClass();
            if (PFC.LJLLL) {
                if (!((HashSet) c25530zN.LIZIZ).contains(Integer.valueOf(intValue))) {
                    if (((HashSet) c25530zN.LIZJ).size() <= c25530zN.LIZLLL) {
                        ((HashSet) c25530zN.LIZJ).add(Integer.valueOf(intValue));
                    } else {
                        c25530zN.LIZIZ.addAll(c25530zN.LIZJ);
                        Iterator it2 = ((HashSet) c25530zN.LIZJ).iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            sb = C25530zN.LJI;
                            if (!hasNext) {
                                break;
                            }
                            sb.append(it2.next());
                            sb.append(",");
                        }
                        if (sb.length() > c25530zN.LJ) {
                            String sb3 = sb.toString();
                            if (sb3 != null && (application = C78248UnM.LJLJJI) != null) {
                                C25550zP.LIZ(application);
                                String string = C25550zP.LIZ.getString("evil_method_SPUtils_key", null);
                                if (string != null) {
                                    sb3 = string.concat(sb3);
                                }
                                Application application2 = C78248UnM.LJLJJI;
                                if (application2 != null) {
                                    C25550zP.LIZ(application2);
                                    C25550zP.LIZ.edit().putString("evil_method_SPUtils_key", sb3).apply();
                                }
                            }
                            sb.setLength(0);
                        }
                        c25530zN.LJFF.post(new IDRunnableS29S0200000(new HashSet(c25530zN.LIZJ), c25530zN, 44));
                        ((HashSet) c25530zN.LIZJ).clear();
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static void LIZ(LinkedList linkedList, C25510zL c25510zL) {
        C25510zL c25510zL2;
        if (!linkedList.isEmpty() && (c25510zL2 = (C25510zL) linkedList.peek()) != null && c25510zL2.LIZ == c25510zL.LIZ) {
            int i = c25510zL2.LIZLLL;
            int i2 = c25510zL.LIZLLL;
            if (i == i2 && i2 != 0) {
                int i3 = c25510zL.LIZIZ;
                if (i3 == 5000) {
                    i3 = c25510zL2.LIZIZ;
                }
                c25510zL.LIZIZ = i3;
                c25510zL2.LJ++;
                c25510zL2.LIZIZ = (int) (c25510zL2.LIZIZ + i3);
                return;
            }
        }
        linkedList.push(c25510zL);
    }

    public static long LJ(LinkedList<C25510zL> linkedList, StringBuilder sb) {
        Iterator<C25510zL> it = linkedList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C25510zL next = it.next();
            sb.append(next.toString());
            sb.append('\n');
            long j2 = next.LIZIZ;
            if (j < j2) {
                j = j2;
            }
        }
        return j;
    }

    public static void LJI(int i, List list) {
        LinkedList linkedList = (LinkedList) list;
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            C25510zL c25510zL = (C25510zL) listIterator.previous();
            if (c25510zL != null && c25510zL.LIZIZ < i) {
                listIterator.remove();
            }
        }
    }

    public static void LJII(List list, PFO pfo) {
        LinkedList linkedList = (LinkedList) list;
        int size = linkedList.size();
        int i = 1;
        while (size > 30) {
            ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                if (((C25510zL) listIterator.previous()).LIZIZ < i * 5) {
                    listIterator.remove();
                    size--;
                    if (size <= 30) {
                        return;
                    }
                }
            }
            size = linkedList.size();
            i++;
            if (60 < i) {
                break;
            }
        }
        int size2 = linkedList.size();
        if (size2 > 30) {
            if (C09970aH.LJII()) {
                C64231PIt.LIZJ("[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(size2), 30, list);
            }
            ListIterator listIterator2 = linkedList.listIterator(Math.min(size2, 30));
            while (listIterator2.hasNext()) {
                listIterator2.next();
                listIterator2.remove();
            }
        }
    }

    public static void LJFF(long[] jArr, LinkedList linkedList, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        C25510zL c25510zL;
        int LIZIZ;
        if (jArr == null || jArr.length == 0) {
            return;
        }
        long j3 = 0;
        if (jArr[jArr.length - 1] != 0) {
            j2 = jArr[jArr.length - 1] & 8796093022207L;
        } else {
            j2 = Long.MAX_VALUE;
        }
        int i5 = 0;
        while (i5 < jArr.length && (jArr[i5] & 8796093022207L) >= j2) {
            i5++;
        }
        LinkedList linkedList2 = new LinkedList();
        int i6 = 0;
        boolean z = false;
        while (i5 < jArr.length) {
            long j4 = jArr[i5];
            if (j3 != j4) {
                if (LIZLLL(j4) && 1048574 == LIZIZ(j4)) {
                    z = true;
                } else if (!z) {
                    if (LIZIZ(j4) > 1048000) {
                        C64231PIt.LIZIZ("s2 pass this method[%s], isIn [%b] ", Integer.valueOf(LIZIZ(j4)), Boolean.valueOf(LIZLLL(j4)));
                    }
                }
                if (LIZLLL(j4)) {
                    if (LIZIZ(j4) == 1048574) {
                        linkedList2.clear();
                        i6 = 0;
                    }
                    i6++;
                    linkedList2.push(Long.valueOf(j4));
                } else {
                    int LIZIZ2 = LIZIZ(j4);
                    if (!linkedList2.isEmpty()) {
                        long longValue = ((Long) linkedList2.pop()).longValue();
                        i6--;
                        LinkedList linkedList3 = new LinkedList();
                        linkedList3.push(Long.valueOf(longValue));
                        while (true) {
                            LIZIZ = LIZIZ(longValue);
                            if (LIZIZ == LIZIZ2 || linkedList2.isEmpty()) {
                                break;
                            }
                            if (C09970aH.LJII()) {
                                C64231PIt.LIZJ("pop inMethodId[%s] to continue match ouMethodId[%s]", Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ2));
                            }
                            longValue = ((Long) linkedList2.pop()).longValue();
                            i6--;
                            linkedList3.push(Long.valueOf(longValue));
                        }
                        if (LIZIZ != LIZIZ2 && LIZIZ == 1048574) {
                            linkedList2.addAll(linkedList3);
                            i6 = linkedList2.size() + i6;
                        } else {
                            long j5 = (j4 & 8796093022207L) + C25500zK.LJII;
                            while (linkedList3.size() != 0) {
                                long longValue2 = (((Long) linkedList3.pop()).longValue() & 8796093022207L) + C25500zK.LJII;
                                long j6 = j5 - longValue2;
                                if (j6 < 0) {
                                    if (C09970aH.LJII()) {
                                        C64231PIt.LIZ("[structuredDataToStack] trace during invalid:%d", Long.valueOf(j6));
                                    }
                                    linkedList2.clear();
                                    linkedList.clear();
                                    return;
                                }
                                LIZ(linkedList, new C25510zL(LIZIZ2, (int) j6, longValue2, i6));
                            }
                        }
                    } else if (C09970aH.LJII()) {
                        C64231PIt.LIZJ("[structuredDataToStack] method[%s] not found in! ", Integer.valueOf(LIZIZ2));
                    }
                }
            }
            i5++;
            j3 = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("structuredDataToStack inner, result.size: ");
        LIZ.append(linkedList.size());
        LIZ.append(", ");
        LIZ.append(linkedList2.size());
        C64231PIt.LIZIZ(X1D.LIZIZ(LIZ), new Object[0]);
        while (!linkedList2.isEmpty()) {
            long longValue3 = ((Long) linkedList2.pop()).longValue();
            int LIZIZ3 = LIZIZ(longValue3);
            boolean LIZLLL = LIZLLL(longValue3);
            long j7 = (longValue3 & 8796093022207L) + C25500zK.LJII;
            if (C09970aH.LJII()) {
                C64231PIt.LIZJ("[structuredDataToStack] has never out method[%s], isIn:%s, inTime:%s, endTime:%s,rawData size:%s", Integer.valueOf(LIZIZ3), Boolean.valueOf(LIZLLL), Long.valueOf(j7), Long.valueOf(j), Integer.valueOf(linkedList2.size()));
            }
            if (!LIZLLL) {
                if (C09970aH.LJII()) {
                    C64231PIt.LIZ("[structuredDataToStack] why has out Method[%s]? is wrong! ", Integer.valueOf(LIZIZ3));
                }
            } else {
                LIZ(linkedList, new C25510zL(LIZIZ3, (int) (j - j7), j7, linkedList2.size()));
            }
        }
        C64230PIs c64230PIs = null;
        C64230PIs c64230PIs2 = new C64230PIs(null, null);
        ListIterator listIterator = linkedList.listIterator(0);
        int i7 = 0;
        while (true) {
            if (listIterator.hasNext()) {
                C64230PIs c64230PIs3 = new C64230PIs((C25510zL) listIterator.next(), c64230PIs);
                i7++;
                if (c64230PIs != null || (c25510zL = c64230PIs3.LIZ) == null || c25510zL.LIZLLL == 0) {
                    C25510zL c25510zL2 = c64230PIs3.LIZ;
                    if (c25510zL2 == null) {
                        i2 = 0;
                    } else {
                        i2 = c25510zL2.LIZLLL;
                    }
                    if (c64230PIs == null || i2 == 0) {
                        c64230PIs2.LIZJ.addFirst(c64230PIs3);
                    } else {
                        C25510zL c25510zL3 = c64230PIs.LIZ;
                        if (c25510zL3 == null) {
                            i3 = 0;
                        } else {
                            i3 = c25510zL3.LIZLLL;
                        }
                        if (i3 < i2) {
                            c64230PIs.LIZJ.addFirst(c64230PIs3);
                        }
                        do {
                            C25510zL c25510zL4 = c64230PIs.LIZ;
                            if (c25510zL4 == null) {
                                i4 = 0;
                            } else {
                                i4 = c25510zL4.LIZLLL;
                            }
                            if (i4 > i2) {
                                c64230PIs = c64230PIs.LIZIZ;
                            } else {
                                C64230PIs c64230PIs4 = c64230PIs.LIZIZ;
                                if (c64230PIs4 != null) {
                                    c64230PIs3.LIZIZ = c64230PIs4;
                                    c64230PIs.LIZIZ.LIZJ.addFirst(c64230PIs3);
                                }
                            }
                        } while (c64230PIs != null);
                    }
                    c64230PIs = c64230PIs3;
                } else if (C09970aH.LJII()) {
                    C64231PIt.LIZ("[stackToTree] SceneMethodsInfo begin error! why the first node'depth is not 0!", new Object[0]);
                }
            } else {
                C64231PIt.LIZIZ("[stackToTree] count [%d] ", Integer.valueOf(i7));
                break;
            }
        }
        linkedList.clear();
        LinkedList linkedList4 = new LinkedList();
        do {
            C25510zL c25510zL5 = c64230PIs2.LIZ;
            if (c25510zL5 != null) {
                if (c64230PIs2.LIZJ.isEmpty()) {
                    i = c64230PIs2.LIZ.LIZIZ;
                } else {
                    int i8 = 0;
                    for (int i9 = 0; i9 < c64230PIs2.LIZJ.size(); i9++) {
                        i8 += c64230PIs2.LIZJ.get(i9).LIZ.LIZIZ;
                    }
                    i = c64230PIs2.LIZ.LIZIZ - i8;
                }
                c25510zL5.LJFF = i;
                linkedList.add(c64230PIs2.LIZ);
            }
            LinkedList<C64230PIs> linkedList5 = c64230PIs2.LIZJ;
            if (!linkedList5.isEmpty()) {
                int size = linkedList5.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        linkedList4.add(linkedList5.get(size));
                    }
                }
            }
            c64230PIs2 = (C64230PIs) linkedList4.pollLast();
        } while (c64230PIs2 != null);
    }
}
