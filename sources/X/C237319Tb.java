package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.profile.platform.base.cache.ProfilePageModelStore$1$1", f = "ProfilePageModelStore.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237319Tb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C237319Tb(InterfaceC67352kd<? super C237319Tb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237319Tb(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C237409Tk.LIZ("load_page_model_switch_account", true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C237319Tb(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
