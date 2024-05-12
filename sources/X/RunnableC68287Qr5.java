package X;

import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qr5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68287Qr5 implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ BinderC68232QqC LJLILLLLZI;

    public RunnableC68287Qr5(BinderC68232QqC binderC68232QqC, zzq zzqVar) {
        this.LJLILLLLZI = binderC68232QqC;
        this.LJLIL = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LJLIL.LJFF();
            this.LJLILLLLZI.LJLIL.LJIILL(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
