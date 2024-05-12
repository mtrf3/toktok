package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.util.HashMap;

/* renamed from: X.0no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18360no {
    public static final C18350nn LIZ = new HashMap<String, InterfaceC18380nq>() { // from class: X.0nn
        {
            put("HUAWEI", new C1Y9());
        }
    };

    public static boolean LIZIZ() {
        InterfaceC18380nq interfaceC18380nq = LIZ.get(Build.MANUFACTURER.toUpperCase().trim());
        if (interfaceC18380nq == null) {
            return false;
        }
        return interfaceC18380nq.LIZIZ();
    }

    public static int LIZ() {
        Configuration configuration;
        Resources LJIIJ = C15380j0.LJIIJ();
        if (LJIIJ != null) {
            configuration = LJIIJ.getConfiguration();
        } else {
            configuration = null;
        }
        InterfaceC18380nq interfaceC18380nq = LIZ.get(Build.MANUFACTURER.toUpperCase().trim());
        if (interfaceC18380nq == null) {
            return -1;
        }
        return interfaceC18380nq.LIZJ(configuration);
    }
}
