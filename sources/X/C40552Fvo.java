package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Fvo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40552Fvo implements InterfaceC39666FhW {
    public final /* synthetic */ AbstractC40550Fvm LIZ;
    public final /* synthetic */ Intent LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ C40551Fvn LIZLLL;

    public C40552Fvo(C40551Fvn c40551Fvn, C40549Fvl c40549Fvl, Intent intent, Context context) {
        this.LIZLLL = c40551Fvn;
        this.LIZ = c40549Fvl;
        this.LIZIZ = intent;
        this.LIZJ = context;
    }

    @Override // X.InterfaceC39666FhW
    public final void a() {
        C40551Fvn c40551Fvn = this.LIZLLL;
        c40551Fvn.LJI.post(new RunnableC40553Fvp(c40551Fvn, this.LIZ, 5, 0));
    }

    @Override // X.InterfaceC39666FhW
    public final void b() {
        if (!this.LIZIZ.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.LIZIZ.putExtra("triggered_from_app_after_verification", true);
            this.LIZJ.sendBroadcast(this.LIZIZ);
        } else {
            this.LIZLLL.LIZ.LIZJ("Splits copied and verified more than once.", 6, new Object[0]);
        }
    }

    @Override // X.InterfaceC39666FhW
    public final void LIZ(int i) {
        C40551Fvn c40551Fvn = this.LIZLLL;
        c40551Fvn.LJI.post(new RunnableC40553Fvp(c40551Fvn, this.LIZ, 6, i));
    }
}
