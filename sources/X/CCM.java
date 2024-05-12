package X;

import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel$selectNormalPoll$1", f = "SelectPollViewModel.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CCM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ SelectPollViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CCM(long j, long j2, int i, SelectPollViewModel selectPollViewModel, InterfaceC67352kd<? super CCM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
        this.LJLJJL = selectPollViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CCM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
                C65814PsI.LIZ().getClass();
                InterfaceC68342mE<C28467BFf<VoteResponseData>> vote = ((PollApi) C65814PsI.LIZJ(PollApi.class)).vote(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
                this.LJLIL = 1;
                obj = vote.LJI(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            ((NextLiveData) this.LJLJJL.LJLJJL.getValue()).setValue(((C28467BFf) obj).data);
        } catch (Throwable th) {
            this.LJLJJL.gv0().setValue(th);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
