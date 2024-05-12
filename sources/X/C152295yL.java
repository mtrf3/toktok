package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152295yL {
    public static boolean LIZ;

    public static final boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (LIZ) {
            H7B.LIZ("hdrConfigEnable use cache");
            LIZ = false;
        } else if (!C1539462k.LIZ() && !C136345Ws.LIZ(model, false)) {
            return false;
        }
        if (C1DG.LJIIIIZZ() || !C1B8.LIZJ() || C00F.LIZ(31744, 1, "use_open_gl_three", true) != 1) {
            return false;
        }
        return true;
    }
}
