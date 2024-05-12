package X;

import java.util.TimerTask;

/* renamed from: X.O7k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61388O7k extends TimerTask {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC61390O7m LJLILLLLZI;
    public final /* synthetic */ C61380O7c LJLJI;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                float currentPosition = this.LJLIL * this.LJLILLLLZI.getCurrentPosition();
                float f = this.LJLJI.LIZLLL;
                if (currentPosition >= f) {
                    this.LJLILLLLZI.setVolume(f, f);
                    this.LJLJI.LIZIZ.cancel();
                } else {
                    this.LJLILLLLZI.setVolume(currentPosition, currentPosition);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C61388O7k(C61380O7c c61380O7c, float f, InterfaceC61390O7m interfaceC61390O7m) {
        this.LJLJI = c61380O7c;
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC61390O7m;
    }
}
