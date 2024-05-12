package X;

import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEK implements InterfaceC80245VeT {
    public final /* synthetic */ VECutVideoActivity LIZ;

    public HEK(VECutVideoActivity vECutVideoActivity) {
        this.LIZ = vECutVideoActivity;
    }

    @Override // X.InterfaceC80245VeT
    public final WM7 LIZ(ClassLoader classLoader, String className) {
        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
        o.LJIIIZ(className, "className");
        if (!o.LJ(C46005I3t.class.getName(), className)) {
            return null;
        }
        C46005I3t c46005I3t = this.LIZ.LJLJLLL;
        if (c46005I3t != null) {
            return c46005I3t;
        }
        o.LJIJI("cutVideoRootScene");
        throw null;
    }
}
