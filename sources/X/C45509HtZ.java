package X;

import Y.ACallableS56S0300000_7;
import Y.AObjectS51S0201000_7;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* renamed from: X.HtZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45509HtZ extends TAT {
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ MyMediaModel LJLJJL;
    public final /* synthetic */ C45507HtX LJLJJLL;
    public final /* synthetic */ C45498HtO LJLJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        C41865Gbt.LIZ(new AObjectS51S0201000_7(this.LJLJJI, this, this.LJLJJL, 2));
        C45498HtO c45498HtO = this.LJLJL;
        C45507HtX c45507HtX = this.LJLJJLL;
        c45498HtO.LLF(c45507HtX.LJLLILLLL, c45507HtX.LJLLLL, true);
        if (C45609HvB.LIZ() && C53099Ksh.LIZIZ()) {
            C10K.LIZJ(new ACallableS56S0300000_7(this, this.LJLJJLL, this.LJLJJL, 5));
        }
    }

    public C45509HtZ(C45498HtO c45498HtO, int i, MyMediaModel myMediaModel, C45507HtX c45507HtX) {
        this.LJLJL = c45498HtO;
        this.LJLJJI = i;
        this.LJLJJL = myMediaModel;
        this.LJLJJLL = c45507HtX;
    }
}
