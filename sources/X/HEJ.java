package X;

import com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEJ implements InterfaceC80245VeT {
    public final /* synthetic */ StitchTrimmingActivity LIZ;

    public HEJ(StitchTrimmingActivity stitchTrimmingActivity) {
        this.LIZ = stitchTrimmingActivity;
    }

    @Override // X.InterfaceC80245VeT
    public final WM7 LIZ(ClassLoader classLoader, String className) {
        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
        o.LJIIIZ(className, "className");
        if (!o.LJ(C46004I3s.class.getName(), className)) {
            return null;
        }
        C46004I3s c46004I3s = this.LIZ.LJLJLLL;
        if (c46004I3s != null) {
            return c46004I3s;
        }
        o.LJIJI("mRootScene");
        throw null;
    }
}
