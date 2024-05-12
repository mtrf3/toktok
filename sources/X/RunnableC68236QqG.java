package X;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.QqG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68236QqG implements Runnable {
    public final /* synthetic */ zzac LJLIL;
    public final /* synthetic */ zzq LJLILLLLZI;
    public final /* synthetic */ BinderC68232QqC LJLJI;

    public RunnableC68236QqG(BinderC68232QqC binderC68232QqC, zzac zzacVar, zzq zzqVar) {
        this.LJLJI = binderC68232QqC;
        this.LJLIL = zzacVar;
        this.LJLILLLLZI = zzqVar;
    }

    public final void LIZ() {
        this.LJLJI.LJLIL.LJFF();
        if (this.LJLIL.zzc.LJJJJL() == null) {
            this.LJLJI.LJLIL.LJIILIIL(this.LJLIL, this.LJLILLLLZI);
        } else {
            this.LJLJI.LJLIL.LJIILLIIL(this.LJLIL, this.LJLILLLLZI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
