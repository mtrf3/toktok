package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$setEffect$1", f = "LiveEffectTestHelper.kt", l = {23}, m = "invokeSuspend")
/* renamed from: X.2A9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2A9(String str, String str2, InterfaceC67352kd<? super C2A9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2A9(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C1KC c1kc = C1KC.LIZ;
            String str = this.LJLILLLLZI;
            String STICKER = C0TY.LIZIZ;
            o.LJIIIIZZ(STICKER, "STICKER");
            String str2 = this.LJLJI;
            this.LJLIL = 1;
            obj = C0WK.LIZ(c1kc, str, STICKER, str2, null, null, null, this, LiveTryModeCountDownThresholdSetting.DEFAULT);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C30868C9o.LJI("set effect fail");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
