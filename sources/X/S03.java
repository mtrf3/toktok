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
public final class S03 extends C8IM {
    public final ECommerceAnchorPanelViewModel LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public S0E LJLJLJ;

    @Override // X.C8IM
    public final boolean LJIIIIZZ() {
        return true;
    }

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
        Aweme aweme;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJJL.LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        c71361RzZ.getClass();
        if (C71361RzZ.LJIILJJIL(aweme) && !this.LJLJJLL) {
            LJIIJ();
        }
    }

    public final void LJIIJ() {
        S0E s0e = this.LJLJLJ;
        if (((s0e instanceof S00) || (s0e instanceof S01)) && ECommerceAnchorPanelViewModel.hv0(this.LJLJJL)) {
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

    @Override // X.C8IM
    public HashMap<String, String> getShowContentInfo() {
        S0E s0e = this.LJLJLJ;
        if (s0e != null) {
            return s0e.LJ();
        }
        return null;
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
    public S03(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJL = new ECommerceAnchorPanelViewModel();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // X.C8IM
    public final String LIZ(C188727au c188727au) {
        String LJI;
        this.LJLJJL.getClass();
        S0E s0e = this.LJLJLJ;
        if (s0e == null || (LJI = s0e.LJI()) == null) {
            return "click_list";
        }
        return LJI;
    }

    @Override // X.C8IM
    public final void LJFF(double d) {
        Aweme aweme;
        this.LJLJI = d;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJJL.LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        c71361RzZ.getClass();
        if (C71361RzZ.LJIILJJIL(aweme)) {
            InterfaceC44105HSr interfaceC44105HSr2 = this.LJLJJL.LJLIL;
            if (interfaceC44105HSr2 != null) {
                interfaceC44105HSr2.LJJLL();
            }
            if (d >= S0O.LIZIZ().delayShowSubtitle && !this.LJLJJLL) {
                LJIIJ();
            }
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
        o.LJIIIZ(useCustomAction, "useCustomAction");
        this.LJLJJL.getClass();
        useCustomAction.invoke(Boolean.TRUE);
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
        if (!this.LJLJL) {
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new S0C(this, anchorCommonStruct, interfaceC44105HSr, false, i, commonClickAction, null), 2);
            this.LJLJL = true;
        }
    }
}
