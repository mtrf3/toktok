package X;

import fjb.a;
import kotlin.jvm.internal.AqS171S0100000_5;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.PhotoModeImageLoader$fetchAndCacheImages$2$deferredList$1$1", f = "PhotoModeImageLoader.kt", l = {56}, m = "invokeSuspend")
/* renamed from: X.Chr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32043Chr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C78774Uvq LJLILLLLZI;
    public final /* synthetic */ W5O LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32043Chr(C78774Uvq c78774Uvq, W5O w5o, InterfaceC67352kd<? super C32043Chr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c78774Uvq;
        this.LJLJI = w5o;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32043Chr(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C78774Uvq c78774Uvq = this.LJLILLLLZI;
            W5O w5o = this.LJLJI;
            this.LJLIL = 1;
            c78774Uvq.getClass();
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            if (C78685UuP.LJJJZ(c78774Uvq.LIZIZ(w5o))) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                xks.resumeWith(c76800UCe);
            } else {
                AbstractC48384Iyq LJFF = W8E.LJII().LJI().LJFF(w5o, null);
                LJFF.LJ(new C78783Uvz(xks, c78774Uvq, w5o), C79561VKj.LJLIL);
                xks.LJIILIIL(new AqS171S0100000_5(LJFF, 505));
            }
            Object LJIIJJI = xks.LJIIJJI();
            if (LJIIJJI != enumC58928NAu) {
                LJIIJJI = C76800UCe.LIZ;
            }
            if (LJIIJJI == enumC58928NAu) {
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
