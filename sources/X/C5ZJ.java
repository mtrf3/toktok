package X;

import Y.IDObjectS384S0100000_2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.MusicShareStoryParser$prepareMusicShareStoryResource$1$downloadStickerTask$1", f = "MusicShareStoryParser.kt", l = {173}, m = "invokeSuspend")
/* renamed from: X.5ZJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C68322mC<Effect> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5ZJ(C68322mC<Effect> c68322mC, InterfaceC67352kd<? super C5ZJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5ZJ(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC<Effect> c68322mC;
        T t;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c68322mC = this.LJLIL;
                C141335gf.LIZJ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c68322mC = this.LJLJI;
            this.LJLIL = c68322mC;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            TN4.LIZ().LJJJJLI("sharemusictostoryeffect", false, false, new IDObjectS384S0100000_2(xks, 9));
            Object LJIIJJI = xks.LJIIJJI();
            t = LJIIJJI;
            if (LJIIJJI == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c68322mC.element = t;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
