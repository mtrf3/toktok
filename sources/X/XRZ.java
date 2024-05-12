package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchWelcomeMessage$1", f = "BaAutoMessageServiceImpl.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XRZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XRZ(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super XRZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XRZ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C9ZN c9zn;
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
                C84657XKj LIZ = XPR.LIZ(AutoMsgSettingApiManager.LIZLLL());
                this.LJLIL = 1;
                obj = LIZ.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            WelMsgStatusResponse welMsgStatusResponse = (WelMsgStatusResponse) obj;
            if (welMsgStatusResponse.status_code != 0) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LJLILLLLZI;
                baAutoMessageServiceImpl.LJ = null;
                baAutoMessageServiceImpl.LJFF = null;
                return C76800UCe.LIZ;
            }
            WelMsgStatusStruct welMsgStatusStruct = welMsgStatusResponse.welMessageStatus;
            if (welMsgStatusStruct == null) {
                this.LJLILLLLZI.LJFF = new C9ZN(0, new Long(0L), "", null);
                return C76800UCe.LIZ;
            }
            long j = welMsgStatusStruct.welcomeMessageId;
            BaAutoMessageServiceImpl baAutoMessageServiceImpl2 = this.LJLILLLLZI;
            int i2 = welMsgStatusStruct.reviewStatus;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            c9zn = new C9ZN(0, new Long(j), "", null);
                        } else {
                            c9zn = new C9ZN(4, new Long(j), welMsgStatusStruct.content, welMsgStatusStruct.reviewReason);
                        }
                    } else {
                        c9zn = new C9ZN(3, new Long(j), welMsgStatusStruct.content, null);
                    }
                } else {
                    c9zn = new C9ZN(2, new Long(j), welMsgStatusStruct.content, null);
                }
            } else if (welMsgStatusStruct.content.length() == 0) {
                c9zn = new C9ZN(0, new Long(j), "", null);
            } else {
                c9zn = new C9ZN(1, new Long(j), welMsgStatusStruct.content, null);
            }
            baAutoMessageServiceImpl2.LJFF = c9zn;
            return C76800UCe.LIZ;
        } catch (Exception unused) {
            BaAutoMessageServiceImpl baAutoMessageServiceImpl3 = this.LJLILLLLZI;
            baAutoMessageServiceImpl3.LJ = null;
            baAutoMessageServiceImpl3.LJFF = null;
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
