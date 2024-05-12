package X;

import java.io.File;

/* renamed from: X.GgL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42141GgL {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ = C00F.LIZ(31744, 0, "studio_synthesis_enable_ending_watermark", true);
    public final int LIZIZ = C00F.LIZ(31744, 0, "client_end_enable_ending_watermark", true);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C42140GgK.LJLIL);

    public final String LIZ() {
        return (String) this.LIZJ.getValue();
    }

    public final boolean LIZJ() {
        int i;
        int i2 = this.LIZIZ;
        if (i2 != 1 && i2 != 2 && (i = this.LIZ) != 1 && i != 2) {
            return false;
        }
        return true;
    }

    public final File LIZIZ() {
        return C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZIZ(C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(LIZ()), "watermark_video.mp4");
    }
}
