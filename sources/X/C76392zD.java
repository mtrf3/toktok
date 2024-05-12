package X;

import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1$state$1$1", f = "SharedVideoDeepLinkHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76392zD extends AbstractC65782Prm implements InterfaceC88471Ynr<C33Y, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C76392zD(InterfaceC67352kd<? super C76392zD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C76392zD c76392zD = new C76392zD(interfaceC67352kd);
        c76392zD.LJLIL = obj;
        return c76392zD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        AbstractC72932td<User> abstractC72932td = ((C33Y) this.LJLIL).LIZIZ;
        if ((abstractC72932td instanceof C72912tb) || (abstractC72932td instanceof C3C1)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C33Y c33y, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c33y, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
