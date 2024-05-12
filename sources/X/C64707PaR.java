package X;

import com.bytedance.common.utility.Logger;
import java.util.HashMap;
import java.util.Observable;

/* renamed from: X.PaR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64707PaR extends Observable {
    public static volatile C64707PaR LIZ = null;
    public static volatile String LIZIZ = "";
    public static volatile String LIZJ = "";
    public static volatile String LIZLLL = "";
    public static volatile String LJ = "";

    public static C64707PaR LIZ() {
        if (LIZ == null) {
            synchronized (C64707PaR.class) {
                if (LIZ == null) {
                    LIZ = new C64707PaR();
                }
            }
        }
        return LIZ;
    }

    public final void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        Logger.debug();
        LIZIZ = str;
        LIZJ = str2;
        LIZLLL = str3;
        LJ = str4;
        HashMap LIZ2 = C45243HpH.LIZ("store_idc", str, "store_region", str2);
        LIZ2.put("region_source", str3);
        LIZ2.put("sec_uid", str4);
        LIZ2.put("logid", str5);
        setChanged();
        notifyObservers(LIZ2);
    }
}
