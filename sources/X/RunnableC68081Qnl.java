package X;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Iterator;

/* renamed from: X.Qnl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68081Qnl implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    C68022Qmo LJIJJ = ((AppMeasurementDynamiteService) this.LJLJI).LJLIL.LJIJJ();
                    InterfaceC68139Qoh interfaceC68139Qoh = (InterfaceC68139Qoh) this.LJLILLLLZI;
                    LJIJJ.LJFF();
                    LJIJJ.LJI();
                    LJIJJ.LJIIZILJ(new RunnableC68036Qn2(LJIJJ, LJIJJ.LJIILJJIL(false), interfaceC68139Qoh));
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    Iterator it = ((java.util.Set) this.LJLILLLLZI).iterator();
                    while (it.hasNext()) {
                        C39649FhF.LIZLLL(((C39647FhD) this.LJLJI).LIZ.LIZIZ((String) it.next()));
                    }
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    if (C39223FaN.LIZ(th)) {
                        return;
                    } else {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ RunnableC68081Qnl(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
