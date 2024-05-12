package X;

import com.ss.android.ugc.aweme.im.service.appsettings.RecommendedChatDelaySettingsModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager$onInboxTabClicked$1", f = "RecommendedChatManager.kt", l = {246, 247}, m = "invokeSuspend")
/* renamed from: X.2zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76762zo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C76762zo(InterfaceC67352kd<? super C76762zo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76762zo(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            long j = ((RecommendedChatDelaySettingsModel) C76772zp.LIZIZ.getValue()).inboxClickDelay * 1000;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C76662ze c76662ze = C76662ze.LJLIL;
        this.LJLIL = 2;
        switch (AnonymousClass304.LIZ()) {
            case 1:
            case 2:
            case 4:
                i2 = 1;
                break;
            case 3:
            case 5:
            case 6:
                break;
            default:
                i2 = -1;
                break;
        }
        if (c76662ze.LJIIL(i2, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C76762zo(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
