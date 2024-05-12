package X;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import kotlin.jvm.internal.o;

/* renamed from: X.XNs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84744XNs extends AbstractC007001a {
    public final /* synthetic */ MediaSessionCompat LJFF;
    public final /* synthetic */ C84743XNr LJI;

    @Override // X.AbstractC007001a
    public final void LIZJ() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZLLL.LIZIZ(new C48651J7n("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LIZLLL() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZLLL.LJIIIZ(null);
        }
    }

    @Override // X.AbstractC007001a
    public final void LJFF() {
        if (this.LJFF.LIZJ() && this.LJI.LJ.LJFF()) {
            this.LJI.LJFF.LJIIL(new C48651J7n("operation_from_media_session_skip_to_next"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LJI() {
        if (this.LJFF.LIZJ() && this.LJI.LJ.LIZLLL()) {
            this.LJI.LJFF.LJJ(new C48651J7n("operation_from_media_session_skip_to_prev"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LJII() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZLLL.LJII(new C48651J7n("STOP_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final boolean LIZIZ(Intent mediaButtonEvent) {
        o.LJIIJ(mediaButtonEvent, "mediaButtonEvent");
        KeyEvent event = (KeyEvent) mediaButtonEvent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        o.LJFF(event, "event");
        int keyCode = event.getKeyCode();
        if (keyCode != 79) {
            if (keyCode != 126) {
                if (keyCode != 127) {
                    switch (keyCode) {
                        case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                            J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PLAY_PAUSE");
                            break;
                        case 86:
                            J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_STOP");
                            break;
                        case 87:
                            J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_NEXT");
                            break;
                        case 88:
                            J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PREVIOUS");
                            break;
                    }
                } else {
                    J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PAUSE");
                }
            } else {
                J7Z.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PLAY");
            }
        } else {
            J7Z.LIZIZ("MediaSessionController", "KEYCODE_HEADSETHOOK");
        }
        return super.LIZIZ(mediaButtonEvent);
    }

    @Override // X.AbstractC007001a
    public final void LJ(long j) {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZLLL.LJIILIIL(j, null);
        }
    }

    public C84744XNs(MediaSessionCompat mediaSessionCompat, C84743XNr c84743XNr) {
        this.LJFF = mediaSessionCompat;
        this.LJI = c84743XNr;
    }
}
