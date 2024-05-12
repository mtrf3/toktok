package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZV extends FrameLayout implements UZX, UZW {
    public final View LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final AbstractC77394UZa LJLJI;

    private final void setPendantType(int i) {
    }

    private final boolean getCollapsing() {
        AbstractC77394UZa abstractC77394UZa = this.LJLJI;
        if (abstractC77394UZa != null) {
            return abstractC77394UZa.LJLLL;
        }
        return false;
    }

    public final boolean getClosed() {
        AbstractC77394UZa abstractC77394UZa = this.LJLJI;
        if (abstractC77394UZa != null) {
            return abstractC77394UZa.LJLLI;
        }
        return false;
    }

    public final boolean getCollapsed() {
        AbstractC77394UZa abstractC77394UZa = this.LJLJI;
        if (abstractC77394UZa != null) {
            return abstractC77394UZa.LJLLILLLL;
        }
        return false;
    }

    @Override // X.UZW
    public boolean getTimeLimitState() {
        UZW uzw;
        UZX uzx = this.LJLJI;
        if ((uzx instanceof UZW) && (uzw = (UZW) uzx) != null) {
            return uzw.getTimeLimitState();
        }
        return false;
    }

    public final FrameLayout getContent() {
        return this.LJLILLLLZI;
    }

    @Override // X.UZX
    public final void LIZ(UZR uzr) {
        AbstractC77394UZa abstractC77394UZa = this.LJLJI;
        if (abstractC77394UZa != null) {
            abstractC77394UZa.LIZ(uzr);
        }
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AbstractC77394UZa abstractC77394UZa = this.LJLJI;
        if (abstractC77394UZa != null) {
            abstractC77394UZa.LIZJ(interfaceC65784Pro);
        }
    }

    @Override // X.UZW
    public void setTimeLimitState(boolean z) {
        UZW uzw;
        UZX uzx = this.LJLJI;
        if ((uzx instanceof UZW) && (uzw = (UZW) uzx) != null) {
            uzw.setTimeLimitState(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZV(int i, C77395UZb c77395UZb, Context context) {
        super(context, null, 0);
        AbstractC77394UZa uzq;
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.v3, this, true);
        this.LJLIL = LLLLIILL;
        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.hla);
        this.LJLILLLLZI = frameLayout;
        SmartImageView bigImage = (SmartImageView) frameLayout.findViewById(R.id.alb);
        SmartImageView smallImage = (SmartImageView) frameLayout.findViewById(R.id.k5n);
        C72833SiD bigLottie = (C72833SiD) frameLayout.findViewById(R.id.ald);
        C72833SiD smallLottie = (C72833SiD) frameLayout.findViewById(R.id.k5q);
        View closeBtn = frameLayout.findViewById(R.id.bfh);
        RelativeLayout capsule = (RelativeLayout) frameLayout.findViewById(R.id.b4c);
        UZZ uzz = UZZ.LJLIL;
        setPendantType(i);
        c77395UZb.LJ = uzz;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    uzq = null;
                } else {
                    o.LJIIIIZZ(bigLottie, "bigLottie");
                    o.LJIIIIZZ(smallLottie, "smallLottie");
                    o.LJIIIIZZ(closeBtn, "closeBtn");
                    o.LJIIIIZZ(capsule, "capsule");
                    uzq = new UZP(context, frameLayout, bigLottie, smallLottie, closeBtn, capsule, c77395UZb);
                }
            } else {
                o.LJIIIIZZ(bigImage, "bigImage");
                o.LJIIIIZZ(smallImage, "smallImage");
                o.LJIIIIZZ(closeBtn, "closeBtn");
                o.LJIIIIZZ(capsule, "capsule");
                uzq = new UZU(context, frameLayout, bigImage, smallImage, closeBtn, capsule, c77395UZb);
            }
        } else {
            o.LJIIIIZZ(bigImage, "bigImage");
            o.LJIIIIZZ(smallImage, "smallImage");
            o.LJIIIIZZ(closeBtn, "closeBtn");
            o.LJIIIIZZ(capsule, "capsule");
            uzq = new UZQ(context, frameLayout, bigImage, smallImage, closeBtn, capsule, c77395UZb);
        }
        this.LJLJI = uzq;
    }
}
