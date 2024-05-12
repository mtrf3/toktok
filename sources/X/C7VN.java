package X;

import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.ss.android.ugc.aweme.favorites.base.ui.VisibilityAware;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage$onPageSelected$1", f = "BaseFavoritePage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7VN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7VN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaseFavoritePage LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7VN(BaseFavoritePage baseFavoritePage, InterfaceC67352kd<? super C7VN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baseFavoritePage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7VN(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        VisibilityAware visibilityAware = (VisibilityAware) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LJLIL, null), VisibilityAware.class, null);
        if (visibilityAware != null) {
            visibilityAware.LLLFZ(true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
