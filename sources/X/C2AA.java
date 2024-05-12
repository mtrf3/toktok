package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$updateBeauty$1", f = "LiveEffectTestHelper.kt", l = {41}, m = "invokeSuspend")
/* renamed from: X.2AA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AA(int i, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AA(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            String SMALL_ITEM_BEAUTY_PANEL = C0TY.LIZLLL;
            o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL, "SMALL_ITEM_BEAUTY_PANEL");
            String str2 = this.LJLJI;
            int i2 = this.LJLJJI;
            this.LJLIL = 1;
            c1kc.getClass();
            obj = C1KC.LJIIJJI(i2, str, SMALL_ITEM_BEAUTY_PANEL, str2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C30868C9o.LJI("update beauty fail");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
