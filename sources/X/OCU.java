package X;

import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import o53.IDdS476S0100000_10;

/* loaded from: classes11.dex */
public final class OCU extends C78983UzD {
    public final /* synthetic */ int LJZL;
    public final /* synthetic */ W5G LL;
    public final /* synthetic */ View LLD;
    public final /* synthetic */ String LLF;

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        int i = this.LJZL;
        if (i > 0) {
            W5G w5g = this.LL;
            View view = this.LLD;
            String str = this.LLF;
            OCU ocu = new OCU(i - 1, view, w5g, str);
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJII(str);
            LIZJ.LJII = new IDdS476S0100000_10(ocu, 11);
            w5g.setController(LIZJ.LIZ());
            return;
        }
        this.LL.setVisibility(8);
        this.LLD.setVisibility(0);
    }

    public OCU(int i, View view, W5G w5g, String str) {
        this.LJZL = i;
        this.LL = w5g;
        this.LLD = view;
        this.LLF = str;
    }
}
