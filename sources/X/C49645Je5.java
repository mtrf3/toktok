package X;

import com.ss.android.ugc.aweme.search.common.ui.component.searchguide.SearchSwipeGuideUIComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.Je5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49645Je5 implements InterfaceC55623LsJ {
    public static final C49645Je5 LIZ = new C49645Je5();

    @Override // X.InterfaceC55623LsJ
    public final C65776Prg LIZIZ() {
        return C65352Pkq.LIZ(SearchSwipeGuideUIComponent.class);
    }

    @Override // X.InterfaceC55623LsJ
    public final boolean LIZ(M89 m89) {
        if (!JZV.LIZJ() || !JZV.LIZ(m89)) {
            return false;
        }
        C50322Jp0 c50322Jp0 = (C50322Jp0) KNV.LIZ();
        int i = c50322Jp0.LJLIL;
        if ((i != 0 && i != 1) || !o.LJ(c50322Jp0.LJLJJL, "Pass") || c50322Jp0.LJLJJLL == 80 || Z9N.LIZIZ.LLJILJILJ() == EnumC223268pW.AUTO_SCROLL_STATE_START) {
            return false;
        }
        return true;
    }
}
