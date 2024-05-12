package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationEdit$beginUpdateProgressTask$1", f = "StickerDurationEdit.kt", l = {267}, m = "invokeSuspend")
/* renamed from: X.6Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160326Qy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C160316Qx LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160326Qy(C160316Qx c160316Qx, C76732zl c76732zl, InterfaceC67352kd<? super C160326Qy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c160316Qx;
        this.LJLJI = c76732zl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C160326Qy(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i == 0 || i == 1) {
            C141335gf.LIZJ(obj);
            do {
                int LJZL = this.LJLILLLLZI.LJ.LIZIZ().LJZL();
                C76732zl c76732zl = this.LJLJI;
                if (LJZL != c76732zl.element) {
                    c76732zl.element = LJZL;
                }
                if (LJZL >= 0) {
                    C6R0 c6r0 = this.LJLILLLLZI.LJIIJ;
                    if (c6r0 != null) {
                        c6r0.getMultiVideoVideoModel().LJLJI.setValue(new Long(LJZL));
                    } else {
                        o.LJIJI("stickerDurationEditView");
                        throw null;
                    }
                }
                this.LJLIL = 1;
            } while (C1JD.LIZJ(36L, this) != enumC58928NAu);
            return enumC58928NAu;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
