package X;

import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.view.ECommerceCustomMultiAnchorView$bindData$1", f = "ECommerceCustomMultiAnchorView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S0C extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ S03 LJLIL;
    public final /* synthetic */ AnchorCommonStruct LJLILLLLZI;
    public final /* synthetic */ InterfaceC44105HSr LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0C(S03 s03, AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, boolean z, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super S0C> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = s03;
        this.LJLILLLLZI = anchorCommonStruct;
        this.LJLJI = interfaceC44105HSr;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S0C(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        S0E s00;
        C141335gf.LIZJ(obj);
        this.LJLIL.getViewModel().qv0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, null);
        S03 s03 = this.LJLIL;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = s03.getViewModel().LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        List<ShopWindowAnchorModel> list = this.LJLIL.getViewModel().LJLJJL;
        c71361RzZ.getClass();
        if (C71361RzZ.LJIILL(aweme, list)) {
            s00 = new S01(this.LJLIL);
        } else {
            s00 = new S00(this.LJLIL);
        }
        s03.LJLJLJ = s00;
        S0E s0e = this.LJLIL.LJLJLJ;
        if (s0e != null) {
            s0e.LIZLLL();
        }
        S0E s0e2 = this.LJLIL.LJLJLJ;
        if (s0e2 != null) {
            s0e2.onInit();
        }
        S0E s0e3 = this.LJLIL.LJLJLJ;
        if (s0e3 != null) {
            s0e3.LJFF(this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
