package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$2$1$1", f = "TopicRecommendListVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7PX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super IEvent>, Object> {
    public final /* synthetic */ C7PV LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ TopicRawInfo LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7PX(C7PV c7pv, String str, C34K c34k, TopicRawInfo topicRawInfo, InterfaceC67352kd<? super C7PX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c7pv;
        this.LJLILLLLZI = str;
        this.LJLJI = c34k;
        this.LJLJJI = topicRawInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7PX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C7OG.LIZLLL(this.LJLIL, this.LJLILLLLZI, !this.LJLJI.element);
        C184807Nc c184807Nc = new C184807Nc(this.LJLJJI, !this.LJLJI.element);
        C2U8.LIZ(c184807Nc);
        return c184807Nc;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super IEvent> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
