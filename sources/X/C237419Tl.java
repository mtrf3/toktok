package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.ui.profiletab.BottomProfileObserver$beforePageChangeHandle$1", f = "BottomProfileObserver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237419Tl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C237419Tl(InterfaceC67352kd<? super C237419Tl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237419Tl(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C237409Tk.LIZIZ("load_page_model_click_tab");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C237419Tl(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
