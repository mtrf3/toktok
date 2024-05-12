package X;

import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.6pU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172286pU {
    public static C126944yY LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C172316pX.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C45245HpJ.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C151025wI.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C172296pV.LJLIL);

    public static void LIZ(C126944yY c126944yY) {
        InterfaceC172476pn value = c126944yY.LIZJ;
        o.LJIIIZ(value, "value");
        C172436pj.LIZ = value;
        InterfaceC172536pt value2 = c126944yY.LIZLLL;
        o.LJIIIZ(value2, "value");
        C172466pm.LIZ = value2;
        DavinciResource.INSTANCE.setHttpClient((IDAVHTTPClientDelegateWrapper) LIZIZ.getValue());
        LIZ = c126944yY;
        C172976qb.LIZ.LIZ();
        com.bytedance.ies.nleeditor.NLE.INSTANCE.loadNLELibrary(true);
    }
}
