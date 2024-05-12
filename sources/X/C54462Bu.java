package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleAction$1$1$2", f = "KaraokeViewModel.kt", l = {324}, m = "invokeSuspend")
/* renamed from: X.2Bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54462Bu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;
    public final /* synthetic */ AbstractC07650Rt LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54462Bu(KaraokeViewModel karaokeViewModel, AbstractC07650Rt abstractC07650Rt, InterfaceC67352kd<? super C54462Bu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
        this.LJLJI = abstractC07650Rt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54462Bu(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (!this.LJLILLLLZI.LJLIL.LJIILIIL()) {
                this.LJLILLLLZI.nv0().LIZJ = !((C31321Ku) this.LJLJI).LIZ;
            }
            C31321Ku c31321Ku = (C31321Ku) this.LJLJI;
            if (c31321Ku.LIZ) {
                C0EV c0ev = this.LJLILLLLZI.LJLIL;
                long j = c31321Ku.LIZIZ;
                c0ev.LJIJJLI();
                c0ev.LJJIIJ(j, C46401rw.LJLIL);
            } else {
                this.LJLILLLLZI.LJLIL.LJJIIJ(c31321Ku.LIZIZ, C46391rv.LJLIL);
            }
            KaraokeViewModel karaokeViewModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (karaokeViewModel.sv0(this) == enumC58928NAu) {
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
