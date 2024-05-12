package X;

import android.view.MotionEvent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerActionSimulation$doAction$2", f = "StickerActionSimulation.kt", l = {55}, m = "invokeSuspend")
/* renamed from: X.6Ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156446Ca extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6CZ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156446Ca(C6CZ c6cz, InterfaceC67352kd<? super C156446Ca> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6cz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C156446Ca(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLILLLLZI.LIZIZ();
            this.LJLILLLLZI.LIZJ();
            this.LJLIL = 1;
            if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LIZIZ();
        MotionEvent LIZJ = this.LJLILLLLZI.LIZJ();
        if (LIZJ != null) {
            ((C6P6) this.LJLILLLLZI.LIZIZ.getValue()).LJJJ(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
