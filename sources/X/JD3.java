package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$doPrepareVideoOnMainThread$1", f = "SearchVideoHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class JD3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchVideoHolder LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JD3(SearchVideoHolder searchVideoHolder, InterfaceC67352kd<? super JD3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchVideoHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new JD3(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C76800UCe c76800UCe;
        JGI core;
        C141335gf.LIZJ(obj);
        try {
            C48887JGp w0 = this.LJLIL.w0();
            if (w0 != null && (core = w0.getCore()) != null) {
                core.LJIJ();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
