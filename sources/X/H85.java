package X;

import fjb.a;
import kotlin.jvm.internal.AqS189S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$downloadTemplate$getTemplateUrlTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {754}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H85 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C08600Vk<? extends String, ? extends String, ? extends String, ? extends String>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C43544H7c LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H85(C43544H7c c43544H7c, InterfaceC67352kd<? super H85> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c43544H7c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H85(this.LJLILLLLZI, interfaceC67352kd);
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
            C43544H7c c43544H7c = this.LJLILLLLZI;
            String str = c43544H7c.LJIILJJIL;
            this.LJLIL = 1;
            OSZ<String, String> LJ = C60903NvH.LJIIJJI().LJI().LJ(str);
            String first = LJ.getFirst();
            if (first == null) {
                first = "";
            }
            String second = LJ.getSecond();
            if (second == null) {
                second = "";
            }
            c43544H7c.LJJII(10);
            if (first.length() > 0) {
                obj = new C08600Vk(first, second, "", "");
            } else {
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                C60903NvH.LJIIJJI().LJI().LIZLLL(str, 2, new H86(c84654XKg), new AqS189S0100000_7(c84654XKg, 16));
                obj = c84654XKg.LIZ();
            }
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C08600Vk<? extends String, ? extends String, ? extends String, ? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
