package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSmoothGoLiveConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.GoLiveChecker$runCheck$1$fetchStreamInfoDone$1", f = "GoLiveChecker.kt", l = {SubscriptionExpireRemindHourSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.Bd2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29196Bd2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Object>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29199Bd5 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29196Bd2(C29199Bd5 c29199Bd5, InterfaceC67352kd<? super C29196Bd2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29199Bd5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29196Bd2(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            long j = LiveBroadcastSmoothGoLiveConfigSetting.INSTANCE.getValue().streamInfoTimeOutThreshold;
            C29195Bd1 c29195Bd1 = new C29195Bd1(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj = C74209TAn.LIZJ(j, c29195Bd1, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (obj == null) {
            return "";
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
