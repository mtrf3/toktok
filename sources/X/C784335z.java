package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.view.FullSessionListViewV2$onSessionDataUpdated$1$1", f = "FullSessionListViewV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C784335z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C3L4> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C784335z(List<C3L4> list, InterfaceC67352kd<? super C784335z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C784335z(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3E6.LIZLLL(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}