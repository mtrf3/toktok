package X;

import Y.AUListenerS79S0300000_13;
import android.animation.ValueAnimator;

/* renamed from: X.TjE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75444TjE extends V1B {
    public final /* synthetic */ C47061t0 LJLJJL;
    public final /* synthetic */ C75525TkX LJLJJLL;
    public final /* synthetic */ C47061t0 LJLJL;
    public final /* synthetic */ C2A4 LJLJLJ;
    public final /* synthetic */ C75526TkY LJLJLLL;
    public final /* synthetic */ EnumC75445TjF LJLL;

    @Override // X.V1B
    public final void LJLIIIL(boolean z) {
        C2A4 c2a4;
        if (z) {
            this.LJLJJL.setScaleX(0.0f);
            this.LJLJJL.setScaleY(0.0f);
            C87277YNd.LJJIJ(this.LJLJJL);
            C75525TkX c75525TkX = this.LJLJJLL;
            if (c75525TkX.LJZ && (c2a4 = c75525TkX.LJZL) != null) {
                C87277YNd.LJJIIZI(c2a4);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            C47061t0 c47061t0 = this.LJLJJL;
            C47061t0 c47061t02 = this.LJLJL;
            C75525TkX c75525TkX2 = this.LJLJJLL;
            C2A4 c2a42 = this.LJLJLJ;
            C75526TkY c75526TkY = this.LJLJLLL;
            EnumC75445TjF enumC75445TjF = this.LJLL;
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new AUListenerS79S0300000_13(c47061t0, c47061t02, c75525TkX2, 3));
            ofFloat.addListener(new C75443TjD(c2a42, c47061t02, c75525TkX2, c75526TkY, enumC75445TjF));
            ofFloat.start();
        }
    }

    public C75444TjE(C47061t0 c47061t0, C75525TkX c75525TkX, C47061t0 c47061t02, C2A4 c2a4, C75526TkY c75526TkY, EnumC75445TjF enumC75445TjF) {
        this.LJLJJL = c47061t0;
        this.LJLJJLL = c75525TkX;
        this.LJLJL = c47061t02;
        this.LJLJLJ = c2a4;
        this.LJLJLLL = c75526TkY;
        this.LJLL = enumC75445TjF;
    }
}
