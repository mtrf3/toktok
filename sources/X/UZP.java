package X;

import Y.IDuS19S0300000_9;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZP extends AbstractC77394UZa implements UZW {
    public final C29701Eo LJLLLL;
    public final C29701Eo LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public boolean LL;

    @Override // X.AbstractC77394UZa
    public final void LIZIZ() {
    }

    @Override // X.AbstractC77394UZa
    public final void LIZLLL() {
        super.LIZLLL();
        if (this.LJLLJ) {
            if (this.LJLLLL.getVisibility() == 0) {
                if (this.LL) {
                    C29701Eo c29701Eo = this.LJLLLL;
                    c29701Eo.setMinAndMaxFrame(0, this.LJZI);
                    c29701Eo.setRepeatCount(-1);
                    c29701Eo.setRepeatMode(1);
                } else {
                    C29701Eo c29701Eo2 = this.LJLLLL;
                    c29701Eo2.setMinAndMaxFrame(0, this.LJLZ);
                    c29701Eo2.setRepeatCount(-1);
                    c29701Eo2.setRepeatMode(1);
                }
                if (!this.LJLLLL.isAnimating()) {
                    this.LJLLLL.playAnimation();
                }
            }
            if (this.LJLLLLLL.getVisibility() == 0) {
                if (this.LL) {
                    C29701Eo c29701Eo3 = this.LJLLLLLL;
                    c29701Eo3.setMinAndMaxFrame(0, this.LJZL);
                    c29701Eo3.setRepeatCount(-1);
                    c29701Eo3.setRepeatMode(1);
                } else {
                    C29701Eo c29701Eo4 = this.LJLLLLLL;
                    c29701Eo4.setMinAndMaxFrame(0, this.LJZ);
                    c29701Eo4.setRepeatCount(-1);
                    c29701Eo4.setRepeatMode(1);
                }
                if (!this.LJLLLLLL.isAnimating()) {
                    this.LJLLLLLL.playAnimation();
                }
            }
        }
    }

    @Override // X.UZW
    public final boolean getTimeLimitState() {
        return this.LL;
    }

    @Override // X.UZX
    public final void LIZ(UZR uzr) {
        InputStream inputStream = uzr.LIZ;
        InputStream inputStream2 = uzr.LIZIZ;
        String str = uzr.LIZJ;
        if (inputStream == null || inputStream2 == null || str == null || TextUtils.isEmpty(str)) {
            return;
        }
        PO6 po6 = new PO6(str);
        AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJIIJ(new IDuS19S0300000_9(this, po6, inputStream, 1)), AbstractC73672Svk.LJIIJ(new IDuS19S0300000_9(this, po6, inputStream2, 2)), C1JD.LJLILLLLZI).LIZ(new UZO(this, inputStream2, inputStream));
    }

    @Override // X.UZW
    public final void setTimeLimitState(boolean z) {
        if (this.LL != z) {
            this.LL = z;
            this.LJLJJLL.getClass();
            if (this.LJLLILLLL && z) {
                LIZJ(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZP(Context context, View view, C72833SiD c72833SiD, C72833SiD c72833SiD2, View view2, RelativeLayout relativeLayout, C77395UZb c77395UZb) {
        super(context, view, c72833SiD, c72833SiD2, view2, relativeLayout, c77395UZb);
        o.LJIIIZ(context, "context");
        this.LJLLLL = c72833SiD;
        this.LJLLLLLL = c72833SiD2;
        this.LJLZ = Integer.MAX_VALUE;
        this.LJZ = Integer.MAX_VALUE;
        this.LJZI = Integer.MAX_VALUE;
        this.LJZL = Integer.MAX_VALUE;
    }
}
