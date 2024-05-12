package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$setSwitch$2", f = "BaAutoMessageServiceImpl.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XRY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XRY(int i, boolean z, BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super XRY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XRY(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        C9ZN c9zn;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        boolean z2 = false;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                int i3 = this.LJLILLLLZI;
                if (this.LJLJI) {
                    i = 2;
                } else {
                    i = 1;
                }
                C84657XKj LIZ = XPR.LIZ(AutoMsgSettingApiManager.LJFF(i3, i));
                this.LJLIL = 1;
                obj = LIZ.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            WelMsgStatusResponse welMsgStatusResponse = (WelMsgStatusResponse) obj;
            WelMsgStatusStruct welMsgStatusStruct = welMsgStatusResponse.welMessageStatus;
            if (welMsgStatusStruct != null) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LJLJJI;
                long j = welMsgStatusStruct.welcomeMessageId;
                int i4 = welMsgStatusStruct.reviewStatus;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                c9zn = new C9ZN(4, new Long(j), welMsgStatusStruct.content, welMsgStatusStruct.reviewReason);
                            } else {
                                c9zn = new C9ZN(0, new Long(j), "", null);
                            }
                        } else {
                            c9zn = new C9ZN(3, new Long(j), welMsgStatusStruct.content, null);
                        }
                    } else {
                        c9zn = new C9ZN(2, new Long(j), welMsgStatusStruct.content, null);
                    }
                } else {
                    if (welMsgStatusStruct.content.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        c9zn = new C9ZN(0, new Long(j), "", null);
                    } else {
                        c9zn = new C9ZN(1, new Long(j), welMsgStatusStruct.content, null);
                    }
                }
                baAutoMessageServiceImpl.LJFF = c9zn;
            }
            if (welMsgStatusResponse.status_code == 0) {
                z2 = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
