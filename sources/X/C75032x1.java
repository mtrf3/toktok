package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.EcAnchorApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$onCreate$3$2", f = "QuickProductSlot.kt", l = {137}, m = "invokeSuspend")
/* renamed from: X.2x1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75032x1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71256Rxs LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75032x1(C71256Rxs c71256Rxs, InterfaceC67352kd<? super C75032x1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71256Rxs;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75032x1(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
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
            C74952wt c74952wt = EcAnchorApi.LIZ;
            Room room = this.LJLILLLLZI.LJLLI;
            if (room != null) {
                l = new Long(room.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            this.LJLIL = 1;
            obj = c74952wt.LIZ(valueOf, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        IFrameSlot.SlotViewModel slotViewModel = this.LJLILLLLZI.LJLLLLLL;
        if (slotViewModel != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel), (MB6) this.LJLILLLLZI.LJLLLL.getValue(), null, new C75042x2(baseResponse, this.LJLILLLLZI, null), 2);
            return C76800UCe.LIZ;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
