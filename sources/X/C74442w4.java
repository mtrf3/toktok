package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.EditAudioCopyrightDetectComponent$onCreate$1$1", f = "EditAudioCopyrightDetectComponent.kt", l = {143}, m = "invokeSuspend")
/* renamed from: X.2w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74442w4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6EC LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74442w4(C6EC c6ec, InterfaceC67352kd<? super C74442w4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6ec;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74442w4(this.LJLILLLLZI, interfaceC67352kd);
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
            boolean LIZIZ = this.LJLILLLLZI.LJJLI().LIZIZ(true);
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C74452w5 c74452w5 = new C74452w5(LIZIZ, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c74452w5, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
