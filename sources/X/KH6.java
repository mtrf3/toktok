package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import fjb.a;
import kotlin.jvm.internal.AqS174S0100000_8;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel$searchLiveLoadMore$1", f = "SearchLiveViewModel.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KH6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchLiveViewModel LJLILLLLZI;
    public final /* synthetic */ C50031JkJ LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KH6(SearchLiveViewModel searchLiveViewModel, C50031JkJ c50031JkJ, InterfaceC67352kd<? super KH6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchLiveViewModel;
        this.LJLJI = c50031JkJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KH6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                KH7 kh7 = (KH7) this.LJLILLLLZI.LJLIL.getValue().getOperator();
                C50031JkJ c50031JkJ = this.LJLJI;
                this.LJLIL = 1;
                obj = kh7.LJFF(c50031JkJ);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLILLLLZI.setState(new AqS174S0100000_8((SearchLiveList) obj, 185));
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new AqS174S0100000_8(e, 186));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
