package X;

import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LrR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55569LrR extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C55569LrR LJLIL = new C55569LrR();

    public C55569LrR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(AutoScrollComponent.class);
        uiContentAssem.LJIIIIZZ = new AutoScrollComponent();
        uiContentAssem.LJI = R.id.aan;
        return C76800UCe.LIZ;
    }
}