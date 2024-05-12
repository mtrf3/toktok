package X;

import android.os.Build;
import android.os.SystemClock;
import dalvik.system.DexFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* renamed from: X.Eqp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37695Eqp {
    public static List LIZ(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        List<DexFile> arrayList = new ArrayList();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int i = Build.VERSION.SDK_INT;
            boolean z4 = true;
            if (i == 24 || i == 25) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i == 26 || i == 27) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (i == 28) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                }
            }
            if (z4 && DexFile.isDexOptNeeded(str)) {
                arrayList = C38234EzW.LIZIZ(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[");
                LIZ.append(str);
                LIZ.append("] need opt, loadDexFileInMemory took ");
                LIZ.append(SystemClock.uptimeMillis() - uptimeMillis);
                LIZ.append("ms");
                X1D.LIZIZ(LIZ);
            }
        } catch (Exception unused) {
        }
        try {
            if (arrayList.isEmpty()) {
                arrayList.add(DexFile.loadDex(str, null, 0));
            }
        } catch (IOException unused2) {
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        ArrayList arrayList2 = new ArrayList();
        for (DexFile dexFile : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            if (dexFile != null) {
                try {
                    Enumeration<String> entries = dexFile.entries();
                    while (entries.hasMoreElements()) {
                        arrayList3.add(entries.nextElement());
                    }
                } catch (Exception unused3) {
                }
            }
            arrayList2.addAll(arrayList3);
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("open dexfile[", str, "] took ");
        LIZIZ.append(uptimeMillis2 - uptimeMillis);
        LIZIZ.append("ms, dump classes took ");
        LIZIZ.append(SystemClock.uptimeMillis() - uptimeMillis2);
        LIZIZ.append("ms, classlist_size=");
        LIZIZ.append(arrayList2.size());
        X1D.LIZIZ(LIZIZ);
        return arrayList2;
    }
}
