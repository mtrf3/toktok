package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$showTip$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {291}, m = "invokeSuspend")
/* renamed from: X.Eda, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36874Eda extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71219RxH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36874Eda(C71219RxH c71219RxH, InterfaceC67352kd<? super C36874Eda> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71219RxH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36874Eda(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C71219RxH c71219RxH;
        IIconSlot.SlotViewModel slotViewModel;
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(800L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (DJ1.LIZ.getBoolean("need_show_ec_tip_in_living_room", true) && (slotViewModel = (c71219RxH = this.LJLILLLLZI).LJLJJLL) != null) {
            slotViewModel.LL = LivePlayEnforceIntervalSetting.DEFAULT;
            MutableLiveData<String> mutableLiveData = slotViewModel.LJLLJ;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(c71219RxH.LJLJJL.getResources().getString(R.string.tb));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
