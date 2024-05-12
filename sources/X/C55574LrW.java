package X;

import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LrW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55574LrW extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C55574LrW LJLIL = new C55574LrW();

    public C55574LrW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(DiggPanelComponent.class);
        uiContentAssem.LJIIIIZZ = new DiggPanelComponent();
        uiContentAssem.LJI = R.id.c_v;
        return C76800UCe.LIZ;
    }
}
