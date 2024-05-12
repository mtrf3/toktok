package X;

/* loaded from: classes12.dex */
public class PQ2 implements InterfaceC64405PPl {
    public final /* synthetic */ PQ0 LIZ;

    @Override // X.InterfaceC64405PPl
    public final void LIZ() {
        C66063PwJ.LIZIZ("Helios-Log-Page-State", "EnterForeground");
        synchronized (this.LIZ.LIZIZ) {
            C66138PxW.LIZLLL(null, "onAppForeground");
        }
    }

    @Override // X.InterfaceC64405PPl
    public final void LIZIZ() {
        C66063PwJ.LIZIZ("Helios-Log-Page-State", "EnterBackground");
        synchronized (this.LIZ.LIZIZ) {
            C66138PxW.LIZLLL(null, "onAppBackground");
        }
    }

    @Override // X.InterfaceC64405PPl
    public final void onAppBackground() {
        C66063PwJ.LIZIZ("Helios-Log-Page-State", "EnterAppBackground");
    }

    @Override // X.InterfaceC64405PPl
    public final void onAppForeground() {
        C66063PwJ.LIZIZ("Helios-Log-Page-State", "EnterAppForeground");
    }

    public PQ2(PQ0 pq0) {
        this.LIZ = pq0;
    }
}
