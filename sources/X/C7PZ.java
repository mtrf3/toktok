package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$2$1$3", f = "TopicRecommendListVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7PZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLIL;
    public final /* synthetic */ C7PV LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ TopicRawInfo LJLJJL;
    public final /* synthetic */ InterfaceC70422pa LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7PZ(XGX<? extends InterfaceC199277rv> xgx, C7PV c7pv, String str, boolean z, TopicRawInfo topicRawInfo, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C7PZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = c7pv;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = topicRawInfo;
        this.LJLJJLL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7PZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C16880lQ.LLLLIIL(((XGT) this.LJLIL).LJFF);
        C7OG.LIZLLL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        C2U8.LIZ(new C184807Nc(this.LJLJJL, this.LJLJJI));
        C48841JEv.LIZJ(this.LJLJJLL, null);
        return C76800UCe.LIZ;
    }
}
