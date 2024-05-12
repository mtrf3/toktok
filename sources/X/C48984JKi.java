package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JKi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48984JKi {
    public static View LIZIZ(JQX jqx) {
        if (jqx.LLLLIIL().LIZ() == 1 && (jqx.getPlayerView() instanceof View)) {
            Object playerView = jqx.getPlayerView();
            o.LJII(playerView, "null cannot be cast to non-null type android.view.View");
            return (View) playerView;
        }
        return jqx.LLLLIIL().LJIIIIZZ();
    }

    public static void LIZ(JQX jqx, C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        InterfaceC48907JHj playerView = jqx.getPlayerView();
        if (playerView instanceof JHC) {
            ((JHC) playerView).setPhotoPlayerCompleteListener(new C48985JKj(listener));
        } else {
            if (!(playerView instanceof C48887JGp)) {
                return;
            }
            ((C48887JGp) playerView).setVideoPlayerStatusListener(new C48981JKf(listener));
        }
    }

    public static void LIZJ(JQX jqx, C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        InterfaceC48907JHj playerView = jqx.getPlayerView();
        if (playerView instanceof JHC) {
            ((JHC) playerView).setPhotoPlayerCompleteListener(null);
        } else {
            if (!(playerView instanceof C48887JGp)) {
                return;
            }
            ((C48887JGp) playerView).setVideoPlayerStatusListener(null);
        }
    }
}
