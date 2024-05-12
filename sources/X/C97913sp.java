package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2$refreshData$1", f = "SessionListFragmentV2.kt", l = {506}, m = "invokeSuspend")
/* renamed from: X.3sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97913sp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SessionListFragmentV2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C97913sp(SessionListFragmentV2 sessionListFragmentV2, InterfaceC67352kd<? super C97913sp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sessionListFragmentV2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C97913sp(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SessionListFragmentV2 sessionListFragmentV2 = this.LJLILLLLZI;
        if (!sessionListFragmentV2.viewValid || !sessionListFragmentV2.xl().LJLZ()) {
            return C76800UCe.LIZ;
        }
        ((C73305Spp) this.LJLILLLLZI._$_findCachedViewById(R.id.kf_)).setVisibility(0);
        C73305Spp c73305Spp = (C73305Spp) this.LJLILLLLZI._$_findCachedViewById(R.id.kf_);
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new C97923sq(this.LJLILLLLZI));
        c73305Spp.setStatus(c73306Spq);
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
