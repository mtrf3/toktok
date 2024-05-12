package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.IRe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46614IRe extends ARS {
    public final List<File> LJ;
    public final List<Integer> LJFF;

    public C46614IRe() {
        super("");
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
    }

    public final InterfaceC46610IRa LIZJ() {
        C46613IRd c46613IRd = null;
        if (((ArrayList) this.LJ).isEmpty()) {
            List<IRY> LIZ = IU6.LIZ();
            if (LIZ == null) {
                return null;
            }
            for (IRY iry : LIZ) {
                List<File> list = this.LJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("/sys/devices/system/cpu/cpufreq/");
                ((ArrayList) list).add(new File(JBR.LJFF(LIZ2, iry.LIZ, "/stats/time_in_state", LIZ2)));
                ((ArrayList) this.LJFF).add(Integer.valueOf(((ArrayList) iry.LIZIZ).size()));
            }
        }
        List<File> list2 = this.LJ;
        List<Integer> list3 = this.LJFF;
        if (list2 != null) {
            ArrayList arrayList = (ArrayList) list2;
            if (!arrayList.isEmpty() && list3 != null) {
                ArrayList arrayList2 = (ArrayList) list3;
                if (!arrayList2.isEmpty() && arrayList.size() == arrayList2.size()) {
                    C46613IRd c46613IRd2 = new C46613IRd();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        File file = (File) ListProtector.get(list2, i);
                        int intValue = ((Integer) ListProtector.get(list3, i)).intValue();
                        BufferedReader LIZIZ = IU9.LIZIZ(file);
                        LinkedHashMap linkedHashMap = null;
                        if (LIZIZ != null) {
                            while (true) {
                                try {
                                    try {
                                        String readLine = LIZIZ.readLine();
                                        if (readLine == null || readLine.isEmpty()) {
                                            break;
                                        }
                                        String[] split = readLine.split(" ");
                                        if (split.length <= 1) {
                                            break;
                                        }
                                        if (linkedHashMap == null) {
                                            linkedHashMap = new LinkedHashMap();
                                        }
                                        linkedHashMap.put(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(intValue * 10 * Long.parseLong(split[1])));
                                    } catch (Exception e) {
                                        android.util.Log.getStackTraceString(e);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            IU9.LIZ(LIZIZ);
                            if (linkedHashMap != null) {
                                ((ArrayList) c46613IRd2.LIZ).add(linkedHashMap);
                            }
                        }
                    }
                    c46613IRd = c46613IRd2;
                }
            }
        }
        this.LIZIZ = c46613IRd;
        return c46613IRd;
    }
}
