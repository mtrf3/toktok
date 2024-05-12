package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl$onSessionDataUpdated$1$1", f = "FocusedSessionListViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C787137b extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FocusedSessionListViewModelImpl LJLIL;
    public final /* synthetic */ List<C3L4> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C787137b(FocusedSessionListViewModelImpl focusedSessionListViewModelImpl, List<C3L4> list, InterfaceC67352kd<? super C787137b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = focusedSessionListViewModelImpl;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C787137b(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJI.invoke(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
