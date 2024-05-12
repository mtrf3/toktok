package X;

import Y.ALAdapterS1S0400000_13;
import Y.AUListenerS79S0300000_13;
import android.animation.ValueAnimator;

/* renamed from: X.TeO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75144TeO extends V1B {
    public final /* synthetic */ C47061t0 LJLJJL;
    public final /* synthetic */ C47061t0 LJLJJLL;
    public final /* synthetic */ C74893TaL LJLJL;
    public final /* synthetic */ C2A4 LJLJLJ;
    public final /* synthetic */ C75143TeN LJLJLLL;

    @Override // X.V1B
    public final void LJLIIIL(boolean z) {
        if (z) {
            this.LJLJJL.setScaleX(0.0f);
            this.LJLJJL.setScaleY(0.0f);
            C87277YNd.LJJIJ(this.LJLJJL);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            C47061t0 c47061t0 = this.LJLJJL;
            C47061t0 c47061t02 = this.LJLJJLL;
            C74893TaL c74893TaL = this.LJLJL;
            C2A4 c2a4 = this.LJLJLJ;
            C75143TeN c75143TeN = this.LJLJLLL;
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new AUListenerS79S0300000_13(c47061t0, c47061t02, c74893TaL, 8));
            ofFloat.addListener(new ALAdapterS1S0400000_13(c2a4, c47061t02, c74893TaL, c75143TeN, 2));
            ofFloat.start();
        }
    }

    public C75144TeO(C47061t0 c47061t0, C47061t0 c47061t02, C74893TaL c74893TaL, C2A4 c2a4, C75143TeN c75143TeN) {
        this.LJLJJL = c47061t0;
        this.LJLJJLL = c47061t02;
        this.LJLJL = c74893TaL;
        this.LJLJLJ = c2a4;
        this.LJLJLLL = c75143TeN;
    }
}
