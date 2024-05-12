package X;

import androidx.navigation.NavBackStackEntry;
import ujb.s;

/* renamed from: X.a75, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92211a75 implements InterfaceC64672gJ<NavBackStackEntry> {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C92211a75(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2) {
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = interfaceC88472Yns2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64672gJ
    public final Object emit(NavBackStackEntry navBackStackEntry, InterfaceC67352kd interfaceC67352kd) {
        Object LJLLJ;
        String str = navBackStackEntry.LJLILLLLZI.LJLJL;
        if (str == null || (LJLLJ = ORZ.LJLLJ(s.LJLJJL(str, new String[]{"/"}, 0, 6))) == null) {
            LJLLJ = "";
        }
        this.LJLIL.invoke(LJLLJ);
        C76800UCe invoke = this.LJLILLLLZI.invoke(Boolean.valueOf(C47261Igj.LJJIJ("webview").contains(LJLLJ)));
        if (invoke == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return invoke;
        }
        return C76800UCe.LIZ;
    }
}
