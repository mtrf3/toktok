package X;

import android.media.session.MediaController;

/* renamed from: X.183, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass183 extends C01W {
    public final MediaController.TransportControls LIZ;

    @Override // X.C01W
    public final void LIZ() {
        this.LIZ.pause();
    }

    @Override // X.C01W
    public final void LIZIZ() {
        this.LIZ.play();
    }

    @Override // X.C01W
    public final void LIZJ() {
        this.LIZ.stop();
    }

    public AnonymousClass183(MediaController.TransportControls transportControls) {
        this.LIZ = transportControls;
    }
}
