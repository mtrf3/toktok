package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.c1;
import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.r;
import com.google.android.play.core.assetpacks.t;
import com.google.android.play.core.assetpacks.t0;

/* renamed from: X.FxN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40649FxN implements Runnable {
    public final /* synthetic */ int LJLIL = 0;
    public final Object LJLILLLLZI;
    public final Parcelable LJLJI;
    public final Object LJLJJI;

    public final void LIZ() {
        ((BinderC68232QqC) this.LJLJJI).LJLIL.LJFF();
        if (((zzlo) this.LJLILLLLZI).LJJJJL() == null) {
            ((BinderC68232QqC) this.LJLJJI).LJLIL.LJIILJJIL((zzlo) this.LJLILLLLZI, (zzq) this.LJLJI);
        } else {
            ((BinderC68232QqC) this.LJLJJI).LJLIL.LJIJ((zzlo) this.LJLILLLLZI, (zzq) this.LJLJI);
        }
    }

    public final void LIZIZ() {
        t tVar = (t) this.LJLILLLLZI;
        Bundle bundle = (Bundle) this.LJLJI;
        AssetPackState assetPackState = (AssetPackState) this.LJLJJI;
        c1 c1Var = tVar.LJI;
        c1Var.getClass();
        if (((Boolean) c1Var.LIZIZ(new t0(c1Var, bundle))).booleanValue()) {
            tVar.LJIILIIL.post(new r(tVar, assetPackState));
            tVar.LJIIIIZZ.a().LIZ();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public RunnableC40649FxN(BinderC68232QqC binderC68232QqC, zzlo zzloVar, zzq zzqVar) {
        this.LJLJJI = binderC68232QqC;
        this.LJLILLLLZI = zzloVar;
        this.LJLJI = zzqVar;
    }

    public RunnableC40649FxN(t tVar, Bundle bundle, d0 d0Var) {
        this.LJLILLLLZI = tVar;
        this.LJLJI = bundle;
        this.LJLJJI = d0Var;
    }
}
