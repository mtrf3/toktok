package X;

import Y.ALAdapterS1S0400000_13;
import Y.AUListenerS79S0300000_13;
import android.animation.ValueAnimator;

/* renamed from: X.Teb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75157Teb extends V1B {
    public final /* synthetic */ C47061t0 LJLJJL;
    public final /* synthetic */ C47061t0 LJLJJLL;
    public final /* synthetic */ C75150TeU LJLJL;
    public final /* synthetic */ C2A4 LJLJLJ;
    public final /* synthetic */ C75156Tea LJLJLLL;

    @Override // X.V1B
    public final void LJLIIIL(boolean z) {
        if (z) {
            this.LJLJJL.setScaleX(0.0f);
            this.LJLJJL.setScaleY(0.0f);
            C87277YNd.LJJIJ(this.LJLJJL);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            C47061t0 c47061t0 = this.LJLJJL;
            C47061t0 c47061t02 = this.LJLJJLL;
            C75150TeU c75150TeU = this.LJLJL;
            C2A4 c2a4 = this.LJLJLJ;
            C75156Tea c75156Tea = this.LJLJLLL;
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new AUListenerS79S0300000_13(c47061t0, c47061t02, c75150TeU, 1));
            ofFloat.addListener(new ALAdapterS1S0400000_13(c2a4, c47061t02, c75150TeU, c75156Tea, 0));
            ofFloat.start();
        }
    }

    public C75157Teb(C47061t0 c47061t0, C47061t0 c47061t02, C75150TeU c75150TeU, C2A4 c2a4, C75156Tea c75156Tea) {
        this.LJLJJL = c47061t0;
        this.LJLJJLL = c47061t02;
        this.LJLJL = c75150TeU;
        this.LJLJLJ = c2a4;
        this.LJLJLLL = c75156Tea;
    }
}
