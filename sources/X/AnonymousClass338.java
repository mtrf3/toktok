package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.IMSearchDefaultRepository$refreshDefaultPage$1$1", f = "IMSearchDefaultRepository.kt", l = {123}, m = "invokeSuspend")
/* renamed from: X.338, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass338 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super AnonymousClass336>, Object> {
    public AnonymousClass336 LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C33A LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass338(C33A c33a, C34K c34k, InterfaceC67352kd<? super AnonymousClass338> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLJI = c33a;
        this.LJLJJI = c34k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass338(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super AnonymousClass336> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 == 1) {
                AnonymousClass336 anonymousClass336 = this.LJLIL;
                C141335gf.LIZJ(obj);
                return anonymousClass336;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C141335gf.LIZJ(obj);
        AnonymousClass336 LIZIZ = this.LJLJI.LIZIZ.LIZIZ();
        if (!LIZIZ.LJLILLLLZI.isEmpty()) {
            this.LJLJJI.element = false;
        }
        C3BJ c3bj = (C3BJ) this.LJLJI.LJI.getValue();
        if (this.LJLJI.LJII) {
            i = 3;
        } else {
            i = -1;
        }
        C33C c33c = new C33C(i, LIZIZ.LJLIL, LIZIZ.LJLILLLLZI);
        this.LJLIL = LIZIZ;
        this.LJLILLLLZI = 1;
        if (c3bj.emit(c33c, this) != enumC58928NAu) {
            return LIZIZ;
        }
        return enumC58928NAu;
    }
}
