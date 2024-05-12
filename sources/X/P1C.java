package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchAutoReplyMessages$1", f = "BaAutoMessageServiceImpl.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P1C extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1C(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super P1C> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P1C(this.LJLILLLLZI, interfaceC67352kd);
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
                C84657XKj LIZ = XPR.LIZ(AutoMsgSettingApiManager.LIZ());
                this.LJLIL = 1;
                obj = LIZ.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            AutoReplyStatusResponse autoReplyStatusResponse = (AutoReplyStatusResponse) obj;
            if (autoReplyStatusResponse.status_code != 0) {
                this.LJLILLLLZI.LJI = new ArrayList();
                this.LJLILLLLZI.LJII = null;
                return C76800UCe.LIZ;
            }
            AutoReplyStatusStruct[] autoReplyStatusStructArr = autoReplyStatusResponse.autoReplyStatus;
            if (autoReplyStatusStructArr == null || autoReplyStatusStructArr.length == 0) {
                this.LJLILLLLZI.LJI = new ArrayList();
                this.LJLILLLLZI.LJII = null;
                return C76800UCe.LIZ;
            }
            this.LJLILLLLZI.LJI = OJ4.LJJLIIIJ(OJ4.LJJJJIZL(OJ4.LJJJJLL(ORY.LJJIIZ(autoReplyStatusStructArr), P1D.LJLIL)));
            return C76800UCe.LIZ;
        } catch (Exception unused) {
            this.LJLILLLLZI.LJII = null;
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
