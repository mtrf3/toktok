package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget$newAuthDialogCenter$1", f = "UserCardAdapterWidget.kt", l = {SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70712q3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UserCardAdapterWidget LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70712q3(UserCardAdapterWidget userCardAdapterWidget, InterfaceC67352kd<? super C70712q3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = userCardAdapterWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70712q3 c70712q3 = new C70712q3(this.LJLJI, interfaceC67352kd);
        c70712q3.LJLILLLLZI = obj;
        return c70712q3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C3 LIZJ;
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
            InterfaceC70542pm LJJIII = C78609UtB.LJJIII(this.LJLJI.LJLIL, new AqS175S0100000_9((InterfaceC70422pa) this.LJLILLLLZI, 474));
            if (LJJIII != null && (LIZJ = ((C77202URq) LJJIII).LIZJ()) != null) {
                this.LJLIL = 1;
                if (V1M.LJII(LIZJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}