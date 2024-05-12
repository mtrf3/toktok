package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S04 extends C8IM {
    public final ECommerceAnchorPanelViewModel LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public S0E LJLJLJ;

    @Override // X.C8IG
    public final void LIZIZ() {
        Aweme LJJLL;
        String aid;
        Aweme LJJLL2;
        S0E s0e = this.LJLJLJ;
        if (s0e != null) {
            s0e.LIZIZ();
        }
        this.LJLJJLL = false;
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJJL.LJLIL;
        String str = null;
        if (interfaceC44105HSr != null && (LJJLL2 = interfaceC44105HSr.LJJLL()) != null) {
            str = LJJLL2.getAid();
        }
        C71370Rzi.LIZJ(str);
        InterfaceC44105HSr interfaceC44105HSr2 = this.LJLJJL.LJLIL;
        if (interfaceC44105HSr2 == null || (LJJLL = interfaceC44105HSr2.LJJLL()) == null || (aid = LJJLL.getAid()) == null || aid.length() == 0) {
            return;
        }
        C71370Rzi.LIZJ.remove(aid);
    }

    @Override // X.C8IM
    public final void LJIIIZ() {
        if (!this.LJLJJLL) {
            LJIIJ();
        }
    }

    public final void LJIIJ() {
        S0E s0e = this.LJLJLJ;
        if (!(s0e instanceof S02) ? (s0e instanceof S07) : ECommerceAnchorPanelViewModel.hv0(this.LJLJJL)) {
            S0E s0e2 = this.LJLJLJ;
            if (s0e2 != null) {
                s0e2.LIZJ();
            }
            this.LJLJJL.getClass();
        } else {
            this.LJLJJL.getClass();
        }
        this.LJLJJLL = true;
    }

    public final boolean getHasAnim() {
        return this.LJLJJLL;
    }

    public final boolean getHasInit() {
        return this.LJLJL;
    }

    public final ECommerceAnchorPanelViewModel getViewModel() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S04(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJL = new ECommerceAnchorPanelViewModel();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // X.C8IM
    public final void LJFF(double d) {
        this.LJLJI = d;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJJL.LJLIL;
        if (interfaceC44105HSr != null) {
            interfaceC44105HSr.LJJLL();
        }
        c71361RzZ.getClass();
        if (d >= S0O.LIZIZ().delayShowSubtitle && !this.LJLJJLL) {
            LJIIJ();
        }
    }

    @Override // X.C8IM
    public final boolean LJII(C188727au c188727au) {
        S0E s0e = this.LJLJLJ;
        if (s0e != null) {
            s0e.LIZ(c188727au);
        }
        this.LJLJJLL = false;
        return true;
    }

    public final void setHasAnim(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setHasInit(boolean z) {
        this.LJLJL = z;
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        HashMap<String, String> hashMap;
        o.LJIIIZ(useCustomAction, "useCustomAction");
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LJLJJL;
        Context context = getContext();
        S0E s0e = this.LJLJLJ;
        if (s0e != null) {
            hashMap = s0e.LJ();
        } else {
            hashMap = null;
        }
        o.LJIIIIZZ(context, "context");
        ECommerceAnchorPanelViewModel.tv0(eCommerceAnchorPanelViewModel, context, null, "pdp", hashMap, 30);
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
        if (!this.LJLJL) {
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new S06(this, anchorCommonStruct, interfaceC44105HSr, false, i, null), 2);
            this.LJLJL = true;
        }
    }
}
