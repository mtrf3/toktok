package X;

import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SeL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72593SeL {
    public static final C72593SeL LIZ = new C72593SeL();
    public static C72582SeA LIZIZ;
    public static C72653SfJ LIZJ;
    public static C72653SfJ LIZLLL;
    public static HashMap<String, InterfaceC72580Se8> LJ;
    public static ProfileNaviDataModel LJFF;

    public final synchronized void LIZ() {
        LIZIZ = null;
        LIZLLL = null;
        LIZJ = null;
        LJFF = null;
    }

    public final synchronized void LIZIZ(ProfileNaviDataModel navi) {
        o.LJIIIZ(navi, "navi");
        if (LJ == null) {
            LJFF = navi;
        } else {
            HashMap<String, InterfaceC72580Se8> hashMap = LJ;
            o.LJI(hashMap);
            LIZJ(C72581Se9.LIZ(navi, hashMap));
        }
    }

    public final synchronized void LIZJ(C72582SeA c72582SeA) {
        LIZ();
        LIZIZ = c72582SeA;
    }
}
