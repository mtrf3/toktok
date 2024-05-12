package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoMsgStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.MsgSwitchResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchMessageSwitches$1", f = "BaAutoMessageServiceImpl.kt", l = {SubscriptionExpireRemindHourSetting.DEFAULT}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XRX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XRX(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super XRX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XRX(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
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
                C84657XKj LIZ = XPR.LIZ(AutoMsgSettingApiManager.LIZIZ());
                this.LJLIL = 1;
                obj = LIZ.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            AutoMsgStruct[] autoMsgStructArr = ((MsgSwitchResponse) obj).messageSwitches;
            if (autoMsgStructArr != null) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LJLILLLLZI;
                for (AutoMsgStruct autoMsgStruct : autoMsgStructArr) {
                    int i2 = autoMsgStruct.messageType;
                    if (i2 == 1) {
                        if (autoMsgStruct.messageSwitch == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        baAutoMessageServiceImpl.LIZIZ = z;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            if (autoMsgStruct.messageSwitch == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            baAutoMessageServiceImpl.LIZLLL = z3;
                        }
                    } else {
                        if (autoMsgStruct.messageSwitch == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        baAutoMessageServiceImpl.LIZJ = z2;
                    }
                }
            }
        } catch (Exception unused) {
            this.LJLILLLLZI.LIZ = null;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
