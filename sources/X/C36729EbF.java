package X;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.TreeMap;

/* renamed from: X.EbF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36729EbF {
    public static int[] LIZ = null;
    public static int[] LIZIZ = null;
    public static long LIZJ = -1;
    public static final TreeMap<Long, LinkedList<Integer>> LIZLLL = new TreeMap<>();
    public static volatile boolean LJ = false;
    public static volatile boolean LJFF = false;

    public static synchronized boolean LIZ() {
        boolean z;
        synchronized (C36729EbF.class) {
            if (LJ) {
                return LJFF;
            }
            boolean z2 = false;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 50);
                int i = 0;
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (readLine.startsWith("processor")) {
                                i++;
                            }
                        } catch (Throwable th) {
                            bufferedReader.close();
                            throw th;
                        }
                    } catch (Throwable unused) {
                    }
                }
                bufferedReader.close();
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    try {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("/sys/devices/system/cpu/cpu");
                        LIZ2.append(i3);
                        LIZ2.append("/cpufreq/scaling_available_frequencies");
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(X1D.LIZIZ(LIZ2)), 5);
                        try {
                            String readLine2 = bufferedReader2.readLine();
                            String substring = readLine2.substring(0, readLine2.length() - 1);
                            i2++;
                            long max = Math.max(Long.parseLong(substring.substring(substring.lastIndexOf(" ") + 1)), Long.parseLong(substring.substring(0, substring.indexOf(" "))));
                            LIZJ = Math.max(LIZJ, max);
                            TreeMap<Long, LinkedList<Integer>> treeMap = LIZLLL;
                            LinkedList<Integer> linkedList = treeMap.get(Long.valueOf(max));
                            if (linkedList == null) {
                                linkedList = new LinkedList<>();
                                treeMap.put(Long.valueOf(max), linkedList);
                            }
                            linkedList.add(Integer.valueOf(i3));
                            bufferedReader2.close();
                            bufferedReader = bufferedReader2;
                        } catch (Exception unused2) {
                            bufferedReader = bufferedReader2;
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            bufferedReader.close();
                            throw th;
                        }
                    } catch (Exception unused3) {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (i2 < 4) {
                    LJFF = false;
                    LJ = true;
                    return false;
                }
                LinkedList linkedList2 = new LinkedList();
                LinkedList linkedList3 = new LinkedList();
                try {
                    if (i2 == 4) {
                        boolean z3 = true;
                        for (LinkedList<Integer> linkedList4 : LIZLLL.values()) {
                            if (z3) {
                                if (linkedList4.size() == 2) {
                                    linkedList2.addAll(linkedList4);
                                } else {
                                    z = false;
                                    break;
                                }
                            } else {
                                linkedList3.addAll(linkedList4);
                            }
                            z3 = false;
                        }
                    } else {
                        int i4 = i2 / 2;
                        boolean z4 = true;
                        for (LinkedList<Integer> linkedList5 : LIZLLL.values()) {
                            if (z4) {
                                linkedList2.addAll(linkedList5);
                            } else {
                                linkedList3.addAll(linkedList5);
                            }
                            if (linkedList2.size() >= i4) {
                                z4 = false;
                            }
                        }
                    }
                    z = true;
                    try {
                        LIZ = new int[linkedList2.size()];
                        for (int i5 = 0; i5 < linkedList2.size(); i5++) {
                            LIZ[i5] = ((Integer) linkedList2.get(i5)).intValue();
                        }
                        LIZIZ = new int[linkedList3.size()];
                        for (int i6 = 0; i6 < linkedList3.size(); i6++) {
                            LIZIZ[i6] = ((Integer) linkedList3.get(i6)).intValue();
                        }
                        LJFF = z;
                        LJ = true;
                    } catch (Throwable unused4) {
                        z2 = true;
                        LJFF = z2;
                        LJ = true;
                        z = z2;
                        return z;
                    }
                } catch (Throwable unused5) {
                    z2 = true;
                }
                return z;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
