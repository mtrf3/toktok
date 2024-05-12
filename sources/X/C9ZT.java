package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$checkChatEveryone$1", f = "BaMessageSettingActivity.kt", l = {296}, m = "invokeSuspend")
/* renamed from: X.9ZT, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaMessageSettingActivity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZT(BaMessageSettingActivity baMessageSettingActivity, InterfaceC67352kd<? super C9ZT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baMessageSettingActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZT(this.LJLILLLLZI, interfaceC67352kd);
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
            C84661XKn c84661XKn = this.LJLILLLLZI.LJLJI;
            if (c84661XKn != null) {
                this.LJLIL = 1;
                obj = c84661XKn.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("pushSettingDeferred");
                throw null;
            }
        }
        PushSettings pushSettings = (PushSettings) obj;
        if (pushSettings == null) {
            return C76800UCe.LIZ;
        }
        BaMessageSettingActivity baMessageSettingActivity = this.LJLILLLLZI;
        int i2 = pushSettings.chatSet;
        if (i2 == 0 || i2 == 1) {
            Boolean enableTImChatEveryone = C2YJ.LIZIZ.LIZ.getEnableTImChatEveryone();
            o.LJIIIIZZ(enableTImChatEveryone, "get().enableTImChatEveryone");
            enableTImChatEveryone.booleanValue();
        }
        baMessageSettingActivity.LJLLLL = i2;
        BaMessageSettingActivity baMessageSettingActivity2 = this.LJLILLLLZI;
        if (baMessageSettingActivity2.LJLLLL != 1) {
            C26227ARb LIZIZ = C77413UZt.LIZIZ(baMessageSettingActivity2);
            LIZIZ.LJII = false;
            LIZIZ.LIZ(R.string.skp);
            UC0.LIZJ(LIZIZ, new AqS170S0100000_4(this.LJLILLLLZI, 1361));
            LIZIZ.LJI().LIZLLL();
            return C76800UCe.LIZ;
        }
        C9ZU eventSender = C9ZU.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("dm_permission_status", "Y");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …s)\n            .builder()");
        eventSender.invoke("ttelite_auto_message_entrance", map);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
