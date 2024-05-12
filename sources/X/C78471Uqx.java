package X;

import Y.ARunnableS49S0100000_13;
import android.app.Activity;

/* renamed from: X.Uqx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78471Uqx implements R47 {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ ARN LIZIZ;
    public final /* synthetic */ JJ4 LIZJ;

    public C78471Uqx(Activity activity, ARN arn, JJ4 jj4) {
        this.LIZ = activity;
        this.LIZIZ = arn;
        this.LIZJ = jj4;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            if (!this.LIZ.isFinishing()) {
                this.LIZIZ.LIZ().LIZIZ(null);
            }
            C1DH.LJJIJIIJIL(200L, new ARunnableS49S0100000_13(this.LIZJ, 127));
        }
    }
}
