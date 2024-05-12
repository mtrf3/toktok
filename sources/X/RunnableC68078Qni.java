package X;

import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qni, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68078Qni implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ zzlo LJLJI;
    public final /* synthetic */ C68022Qmo LJLJJI;

    public RunnableC68078Qni(C68022Qmo c68022Qmo, zzq zzqVar, boolean z, zzlo zzloVar) {
        this.LJLJJI = c68022Qmo;
        this.LJLIL = zzqVar;
        this.LJLILLLLZI = z;
        this.LJLJI = zzloVar;
    }

    public final void LIZ() {
        zzlo zzloVar;
        C68022Qmo c68022Qmo = this.LJLJJI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Discarding data. Failed to set user property");
            return;
        }
        QH7.LJIIIIZZ(this.LJLIL);
        C68022Qmo c68022Qmo2 = this.LJLJJI;
        if (this.LJLILLLLZI) {
            zzloVar = null;
        } else {
            zzloVar = this.LJLJI;
        }
        c68022Qmo2.LJIIIZ(interfaceC68041Qn7, zzloVar, this.LJLIL);
        this.LJLJJI.LJIILLIIL();
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
