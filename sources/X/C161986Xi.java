package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import kotlin.jvm.internal.o;

/* renamed from: X.6Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161986Xi {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ(Context context) {
        o.LJIIIZ(context, "context");
        C6FB LIZIZ = AnonymousClass668.LIZIZ();
        IVideoConfigService LJJIJIIJIL = C60903NvH.LJIIJJI().LJJIJIIJIL();
        int LIZJ = C81184Vtc.LIZJ(context);
        if (LIZJ != LIZIZ.LIZLLL()) {
            LIZIZ.LIZJ(LIZJ);
        }
        FrameLayout.LayoutParams LJ = AnonymousClass668.LIZIZ().LJ(LJJIJIIJIL.getVideoWidth(), LJJIJIIJIL.getVideoHeight());
        return new OSZ(Integer.valueOf(LJ.width), Integer.valueOf(LJ.height));
    }
}
