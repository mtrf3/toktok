package X;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.XNu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84746XNu extends AbstractC007001a {
    public final /* synthetic */ MediaSessionCompat LJFF;
    public final /* synthetic */ C84741XNp LJI;

    @Override // X.AbstractC007001a
    public final void LIZJ() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LIZIZ(new C48651J7n("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LIZLLL() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJIIIZ(null);
        }
    }

    @Override // X.AbstractC007001a
    public final void LJFF() {
        if (this.LJFF.LIZJ() && this.LJI.LIZJ.LJFF()) {
            this.LJI.LIZLLL.LJIIL(new C48651J7n("operation_from_media_session_skip_to_next"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LJI() {
        if (this.LJFF.LIZJ() && this.LJI.LIZJ.LIZLLL()) {
            this.LJI.LIZLLL.LJJ(new C48651J7n("operation_from_media_session_skip_to_prev"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LJII() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJII(new C48651J7n("STOP_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final boolean LIZIZ(Intent mediaButtonEvent) {
        Integer num;
        o.LJIIIZ(mediaButtonEvent, "mediaButtonEvent");
        KeyEvent keyEvent = (KeyEvent) mediaButtonEvent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            num = Integer.valueOf(keyEvent.getKeyCode());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 86) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_STOP");
            } else if (num.intValue() == 79) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_HEADSETHOOK");
            } else if (num.intValue() == 85) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PLAY_PAUSE");
            } else if (num.intValue() == 87) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_NEXT");
            } else if (num.intValue() == 88) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PREVIOUS");
            } else if (num.intValue() == 127) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PAUSE");
            } else if (num.intValue() == 126) {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PLAY");
            }
        }
        return super.LIZIZ(mediaButtonEvent);
    }

    @Override // X.AbstractC007001a
    public final void LJ(long j) {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJIILIIL(j, null);
        }
    }

    public C84746XNu(MediaSessionCompat mediaSessionCompat, C84741XNp c84741XNp) {
        this.LJFF = mediaSessionCompat;
        this.LJI = c84741XNp;
    }
}
