package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class NDB implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ NDC LJLJJL;
    public final /* synthetic */ ND1 LJLJJLL;

    public NDB(Context context, ND1 nd1, ND3 nd3, Integer num, Integer num2, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJI = num2;
        this.LJLJJI = context;
        this.LJLJJL = nd3;
        this.LJLJJLL = nd1;
    }

    public final void LIZ() {
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LJLIL);
        int intValue = this.LJLILLLLZI.intValue();
        int intValue2 = this.LJLJI.intValue();
        LJIIIIZZ.LJII = intValue;
        LJIIIIZZ.LJIIIIZZ = intValue2;
        LJIIIIZZ.LJJI = KL0.HIGH;
        LJIIIIZZ.LIZIZ("commerce_native_display_card");
        LJIIIIZZ.LIZJ = this.LJLJJI;
        LJIIIIZZ.LJIIIZ(new NDA(this.LJLJJL, this.LJLJJLL));
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
