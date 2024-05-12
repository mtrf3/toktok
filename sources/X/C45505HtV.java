package X;

import Y.ACallableS56S0300000_7;
import Y.AObjectS51S0201000_7;
import Y.ARunnableS11S0400000_7;
import Y.AgS43S0400000_7;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* renamed from: X.HtV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45505HtV extends TAT {
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ MyMediaModel LJLJJL;
    public final /* synthetic */ C45507HtX LJLJJLL;
    public final /* synthetic */ boolean[] LJLJL;
    public final /* synthetic */ C45498HtO LJLJLJ;

    @Override // X.TAT
    public final void LIZ(View view) {
        boolean z;
        C41865Gbt.LIZ(new AObjectS51S0201000_7(this.LJLJJI, this, this.LJLJJL, 1));
        C45507HtX c45507HtX = this.LJLJJLL;
        if (c45507HtX.LJLLILLLL.selectIndex < 0 && this.LJLJLJ.LLFF(c45507HtX)) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LJLJL[0]) {
            C45498HtO c45498HtO = this.LJLJLJ;
            if (c45498HtO.LJLL != null) {
                if (c45498HtO.LLF.LIZLLL || !z) {
                    if (C45609HvB.LIZ() && C45871HzP.LIZ()) {
                        C10K.LIZJ(new ACallableS56S0300000_7(this, this.LJLJJLL, this.LJLJJL, 3));
                        if (this.LJLJLJ.LJLLILLLL && C53099Ksh.LIZIZ()) {
                            C10K.LIZJ(new ACallableS56S0300000_7(this, this.LJLJJLL, this.LJLJJL, 4));
                        }
                        this.LJLJLJ.LJLL.LIZ(view, this.LJLJJL);
                        return;
                    }
                    if (!C45609HvB.LIZ() || !C53099Ksh.LIZIZ()) {
                        this.LJLJLJ.LJLL.LIZ(view, this.LJLJJL);
                        return;
                    }
                    C45498HtO c45498HtO2 = this.LJLJLJ;
                    boolean[] zArr = this.LJLJL;
                    MyMediaModel myMediaModel = this.LJLJJL;
                    C45507HtX c45507HtX2 = this.LJLJJLL;
                    c45498HtO2.getClass();
                    zArr[0] = true;
                    ExecutorC149205tM executorC149205tM = ExecutorC149205tM.LJLILLLLZI;
                    executorC149205tM.LJLIL.postDelayed(new ARunnableS11S0400000_7(myMediaModel, c45498HtO2, zArr, view, 4), 200L);
                    C10K.LIZIZ(new ACallableS56S0300000_7(c45507HtX2, c45498HtO2, myMediaModel, 6), C38995FSd.LIZLLL(), null).LJ(new AgS43S0400000_7(c45498HtO2, zArr, view, myMediaModel, 0), C10K.LJIIIIZZ, null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45505HtV(C45498HtO c45498HtO, int i, MyMediaModel myMediaModel, C45507HtX c45507HtX, boolean[] zArr) {
        super(600L);
        this.LJLJLJ = c45498HtO;
        this.LJLJJI = i;
        this.LJLJJL = myMediaModel;
        this.LJLJJLL = c45507HtX;
        this.LJLJL = zArr;
    }
}
