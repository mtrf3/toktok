package X;

import com.ss.android.ugc.feed.platform.panel.refreshpanel.RefreshPanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LrM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55564LrM extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C55564LrM LJLIL = new C55564LrM();

    public C55564LrM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(RefreshPanelComponent.class);
        uiContentAssem.LJIIIIZZ = new RefreshPanelComponent();
        uiContentAssem.LJI = R.id.itq;
        return C76800UCe.LIZ;
    }
}
