package X;

import Y.IDComparatorS36S0000000_8;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class IU6 {
    public static String LIZ;
    public static List<IRY> LIZIZ;
    public static List<Integer> LIZJ;

    public static synchronized List<IRY> LIZ() {
        synchronized (IU6.class) {
            List<IRY> list = LIZIZ;
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles(new IU8());
            if (listFiles != null && listFiles.length > 0) {
                Arrays.sort(listFiles, new IDComparatorS36S0000000_8(0));
                for (File file : listFiles) {
                    IRY iry = new IRY(file.getName());
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(file.getAbsolutePath());
                    LIZ2.append("/scaling_available_frequencies");
                    IU9.LIZJ(X1D.LIZIZ(LIZ2), new IU4(arrayList2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(file.getAbsolutePath());
                    LIZ3.append("/affected_cpus");
                    IU9.LIZJ(X1D.LIZIZ(LIZ3), new IU7(arrayList3));
                    iry.LIZJ = arrayList2;
                    iry.LIZIZ = arrayList3;
                    arrayList.add(iry);
                }
            }
            LIZIZ = arrayList;
            return arrayList;
        }
    }
}
