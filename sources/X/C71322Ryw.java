package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$processItemView$1$1", f = "AnchorPanelAdapter.kt", l = {719}, m = "invokeSuspend")
/* renamed from: X.Ryw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71322Ryw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ SHA LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ AnchorPanelAdapter LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ ShopWindowAnchorModel LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71322Ryw(InterfaceC43919HLn<C76800UCe> interfaceC43919HLn, boolean z, SHA sha, String str, AnchorPanelAdapter anchorPanelAdapter, int i, ShopWindowAnchorModel shopWindowAnchorModel, InterfaceC67352kd<? super C71322Ryw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC43919HLn;
        this.LJLJI = z;
        this.LJLJJI = sha;
        this.LJLJJL = str;
        this.LJLJJLL = anchorPanelAdapter;
        this.LJLJL = i;
        this.LJLJLJ = shopWindowAnchorModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71322Ryw(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC43919HLn<C76800UCe> interfaceC43919HLn = this.LJLILLLLZI;
            if (interfaceC43919HLn != null) {
                this.LJLIL = 1;
                if (interfaceC43919HLn.LJI(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        boolean z2 = this.LJLJI;
        SHA sha = this.LJLJJI;
        String str = this.LJLJJL;
        AnchorPanelAdapter anchorPanelAdapter = this.LJLJJLL;
        int i2 = this.LJLJL;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLJLJ;
        if (z2) {
            z = true;
        } else {
            z = false;
        }
        try {
            AnchorPanelAdapter.LLFFF(i2, sha, anchorPanelAdapter, shopWindowAnchorModel, str, z);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
