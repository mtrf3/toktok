package X;

import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LrN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55565LrN extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C55565LrN LJLIL = new C55565LrN();

    public C55565LrN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(LoadMorePanelComponent.class);
        uiContentAssem.LJIIIIZZ = new LoadMorePanelComponent();
        uiContentAssem.LJI = R.id.g99;
        return C76800UCe.LIZ;
    }
}