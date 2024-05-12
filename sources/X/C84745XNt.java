package X;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.XNt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84745XNt extends AbstractC007001a {
    public final /* synthetic */ MediaSessionCompat LJFF;
    public final /* synthetic */ C84742XNq LJI;

    @Override // X.AbstractC007001a
    public final void LJFF() {
    }

    @Override // X.AbstractC007001a
    public final void LJI() {
    }

    @Override // X.AbstractC007001a
    public final void LIZJ() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJ(new C84735XNj("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LIZLLL() {
        if (this.LJFF.LIZJ()) {
            XOH.LIZ(this.LJI.LIZIZ, null, 3);
        }
    }

    @Override // X.AbstractC007001a
    public final void LJII() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJII(new C84735XNj("STOP_FROM_MEDIA_SESSION_CALLBACK"));
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
        this.LJI.LJ.LJ(true);
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJI(j);
            XOX LIZIZ = this.LJI.LIZIZ.LIZIZ();
            if (LIZIZ.isPauseState()) {
                if (j >= this.LJI.LIZIZ.LIZLLL()) {
                    XOH.LIZ(this.LJI.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
                }
            } else if (LIZIZ.isStopState()) {
                XOH.LIZ(this.LJI.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
            } else if (LIZIZ.isErrorState()) {
                XOH.LIZ(this.LJI.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
            }
            C84742XNq c84742XNq = this.LJI;
            C85062XZy.LIZLLL((int) c84742XNq.LIZIZ.LIZLLL(), 1, c84742XNq.LIZJ);
        }
    }

    public C84745XNt(MediaSessionCompat mediaSessionCompat, C84742XNq c84742XNq) {
        this.LJFF = mediaSessionCompat;
        this.LJI = c84742XNq;
    }
}
