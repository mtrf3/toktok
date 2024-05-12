package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel$startShufflePlay$realId$1", f = "MDAudioQueueViewModel.kt", l = {228}, m = "invokeSuspend")
/* renamed from: X.ZxP, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91611ZxP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends InterfaceC91296ZsK>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C91495ZvX LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91611ZxP(C91495ZvX c91495ZvX, String str, InterfaceC67352kd<? super C91611ZxP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c91495ZvX;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91611ZxP(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            AbstractC73672Svk<List<InterfaceC91296ZsK>> LIZIZ = this.LJLILLLLZI.LJLL.LIZIZ(this.LJLJI);
            this.LJLIL = 1;
            obj = C77318UWc.LIZIZ(LIZIZ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends InterfaceC91296ZsK>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
