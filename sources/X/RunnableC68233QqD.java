package X;

import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.QqD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68233QqD implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ BinderC68232QqC LJLILLLLZI;

    public RunnableC68233QqD(BinderC68232QqC binderC68232QqC, zzq zzqVar) {
        this.LJLILLLLZI = binderC68232QqC;
        this.LJLIL = zzqVar;
    }

    public final void LIZ() {
        this.LJLILLLLZI.LJLIL.LJFF();
        C68241QqL c68241QqL = this.LJLILLLLZI.LJLIL;
        zzq zzqVar = this.LJLIL;
        c68241QqL.LIZIZ().LJFF();
        c68241QqL.LJI();
        QH7.LJI(zzqVar.zza);
        C68090Qnu LIZIZ = C68090Qnu.LIZIZ(zzqVar.zzv);
        C68090Qnu LJJIJL = c68241QqL.LJJIJL(zzqVar.zza);
        c68241QqL.LIZJ().LJIILIIL.LIZJ(zzqVar.zza, LIZIZ, "Setting consent, package, consent");
        c68241QqL.LJIIZILJ(zzqVar.zza, LIZIZ);
        if (LIZIZ.LJI(LJJIJL, (EnumC68125QoT[]) LIZIZ.LIZ.keySet().toArray(new EnumC68125QoT[0]))) {
            c68241QqL.LJIILL(zzqVar);
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
