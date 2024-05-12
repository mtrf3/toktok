package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CaA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31566CaA implements Runnable {
    public final /* synthetic */ C56K LJLIL;
    public final /* synthetic */ C31563Ca7 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL = 200;

    public final void LIZ() {
        float f = this.LJLIL.element;
        float f2 = 20;
        if (f >= f2) {
            this.LJLILLLLZI.getHandler1().removeCallbacks(this);
            return;
        }
        C31563Ca7 c31563Ca7 = this.LJLILLLLZI;
        float f3 = f / f2;
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        c31563Ca7.getClass();
        float f4 = ((i >> 24) & 255) / 255.0f;
        o.LJII(Integer.valueOf(i2), "null cannot be cast to non-null type kotlin.Int");
        float f5 = ((i2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
        float LIZIZ = C06420Na.LIZIZ(f5, f4, f3, f4);
        float LIZIZ2 = C06420Na.LIZIZ(pow4, pow, f3, pow);
        float LIZIZ3 = C06420Na.LIZIZ(pow5, pow2, f3, pow2);
        float LIZIZ4 = C06420Na.LIZIZ(pow6, pow3, f3, pow3);
        float pow7 = ((float) Math.pow(LIZIZ2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(LIZIZ3, 0.45454545454545453d)) * 255.0f;
        this.LJLILLLLZI.LJZI.setBorderColor(Math.round(((float) Math.pow(LIZIZ4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(LIZIZ * 255.0f) << 24) | (Math.round(pow8) << 8));
        this.LJLIL.element++;
        this.LJLILLLLZI.getHandler1().postDelayed(this, this.LJLJJL / 20);
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

    public RunnableC31566CaA(C56K c56k, C31563Ca7 c31563Ca7, int i, int i2) {
        this.LJLIL = c56k;
        this.LJLILLLLZI = c31563Ca7;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
