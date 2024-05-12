package X;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Zuf, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91441Zuf extends AbstractC007001a {
    public final /* synthetic */ MediaSessionCompat LJFF;
    public final /* synthetic */ C91443Zuh LJI;

    @Override // X.AbstractC007001a
    public final void LIZJ() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJIL(new C91299ZsN("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final void LIZLLL() {
        if (this.LJFF.LIZJ()) {
            C91287ZsB.LIZ(this.LJI.LIZIZ, null, 3);
        }
    }

    @Override // X.AbstractC007001a
    public final void LJFF() {
        if (this.LJFF.LIZJ() && this.LJI.LIZIZ.LJFF()) {
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = C91219Zr5.LIZ;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
                YBM.LIZ.getClass();
                if (!YBM.LIZJ()) {
                    return;
                }
            }
            InterfaceC91459Zux interfaceC91459Zux = this.LJI.LIZIZ.LJLJJI.LJLILLLLZI.get(C91483ZvL.class);
            if (!(interfaceC91459Zux instanceof C91483ZvL)) {
                interfaceC91459Zux = null;
            }
            C91483ZvL c91483ZvL = (C91483ZvL) interfaceC91459Zux;
            if (c91483ZvL != null) {
                c91483ZvL.LJIJJ(new C91299ZsN("operation_from_media_session_skip_to_next"));
            }
        }
    }

    @Override // X.AbstractC007001a
    public final void LJI() {
        if (this.LJFF.LIZJ() && this.LJI.LIZIZ.LIZLLL()) {
            InterfaceC91459Zux interfaceC91459Zux = this.LJI.LIZIZ.LJLJJI.LJLILLLLZI.get(C91483ZvL.class);
            if (!(interfaceC91459Zux instanceof C91483ZvL)) {
                interfaceC91459Zux = null;
            }
            C91483ZvL c91483ZvL = (C91483ZvL) interfaceC91459Zux;
            if (c91483ZvL != null) {
                c91483ZvL.LJIJJLI(new C91299ZsN("operation_from_media_session_skip_to_prev"));
            }
        }
    }

    @Override // X.AbstractC007001a
    public final void LJII() {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJJIFFI(new C91299ZsN("STOP_FROM_MEDIA_SESSION_CALLBACK"));
        }
    }

    @Override // X.AbstractC007001a
    public final boolean LIZIZ(Intent mediaButtonEvent) {
        Integer valueOf;
        o.LJIIIZ(mediaButtonEvent, "mediaButtonEvent");
        KeyEvent keyEvent = (KeyEvent) mediaButtonEvent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key event code: ");
        Integer num = null;
        if (keyEvent != null) {
            num = Integer.valueOf(keyEvent.getKeyCode());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (this.LJFF.LIZJ()) {
            KeyEvent keyEvent2 = (KeyEvent) mediaButtonEvent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent2 != null && (valueOf = Integer.valueOf(keyEvent2.getKeyCode())) != null && valueOf.intValue() != 86 && valueOf.intValue() != 79 && valueOf.intValue() != 85 && valueOf.intValue() != 87 && valueOf.intValue() != 88 && valueOf.intValue() != 127) {
                valueOf.intValue();
            }
            return super.LIZIZ(mediaButtonEvent);
        }
        return false;
    }

    @Override // X.AbstractC007001a
    public final void LJ(long j) {
        if (this.LJFF.LIZJ()) {
            this.LJI.LIZIZ.LJJI(j);
        }
    }

    public C91441Zuf(MediaSessionCompat mediaSessionCompat, C91443Zuh c91443Zuh) {
        this.LJFF = mediaSessionCompat;
        this.LJI = c91443Zuh;
    }
}
