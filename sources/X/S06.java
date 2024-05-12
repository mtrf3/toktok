package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.view.ECommerceCustomSingleAnchorView$bindData$1", f = "ECommerceCustomSingleAnchorView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S06 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ S04 LJLIL;
    public final /* synthetic */ AnchorCommonStruct LJLILLLLZI;
    public final /* synthetic */ InterfaceC44105HSr LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S06(S04 s04, AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, boolean z, int i, InterfaceC67352kd<? super S06> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = s04;
        this.LJLILLLLZI = anchorCommonStruct;
        this.LJLJI = interfaceC44105HSr;
        this.LJLJJI = z;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S06(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        S0E s05;
        boolean z;
        boolean z2;
        Aweme LJJLL;
        C141335gf.LIZJ(obj);
        Aweme aweme2 = null;
        this.LJLIL.getViewModel().qv0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, null);
        S04 s04 = this.LJLIL;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = s04.getViewModel().LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        c71361RzZ.getClass();
        if (aweme == null || !aweme.isAd() ? C19N.LJ("ec_use_custom_anchor", false) : C19N.LJ("ec_use_custom_anchor_ads", false)) {
            InterfaceC44105HSr interfaceC44105HSr2 = this.LJLIL.getViewModel().LJLIL;
            if (interfaceC44105HSr2 != null) {
                interfaceC44105HSr2.LJJLL();
            }
            C71395S0h.LIZ.getClass();
            if (C71395S0h.LIZ() == -1) {
                s05 = new S05(this.LJLIL);
            } else {
                InterfaceC44105HSr interfaceC44105HSr3 = this.LJLIL.getViewModel().LJLIL;
                if (interfaceC44105HSr3 == null || (aweme2 = interfaceC44105HSr3.LJJLL()) == null || !aweme2.isAd() ? C71395S0h.LIZ() == 1 : !(!S0O.LIZ() || C71395S0h.LIZ() != 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (C71395S0h.LIZ() == 0 && C71361RzZ.LJIILJJIL(aweme2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    s05 = new S02(this.LJLIL);
                } else {
                    InterfaceC44105HSr interfaceC44105HSr4 = this.LJLIL.getViewModel().LJLIL;
                    if (interfaceC44105HSr4 == null || (LJJLL = interfaceC44105HSr4.LJJLL()) == null || !LJJLL.isAd() ? C71395S0h.LIZJ() : !(!S0O.LIZ() || !C71395S0h.LIZJ())) {
                        s05 = new S07(this.LJLIL);
                    } else {
                        s05 = new S05(this.LJLIL);
                    }
                }
            }
        } else {
            s05 = new S05(this.LJLIL);
        }
        s04.LJLJLJ = s05;
        S0E s0e = this.LJLIL.LJLJLJ;
        if (s0e != null) {
            s0e.LIZLLL();
        }
        S0E s0e2 = this.LJLIL.LJLJLJ;
        if (s0e2 != null) {
            s0e2.onInit();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
