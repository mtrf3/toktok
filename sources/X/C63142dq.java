package X;

import com.bytedance.android.livesdk.hotword.HotWordGiftWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.HotWordGiftWidget$onPostCreate$1", f = "HotWordGiftWidget.kt", l = {79}, m = "invokeSuspend")
/* renamed from: X.2dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63142dq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ HotWordGiftWidget LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63142dq(HotWordGiftWidget hotWordGiftWidget, InterfaceC67352kd<? super C63142dq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = hotWordGiftWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63142dq(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(1500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
