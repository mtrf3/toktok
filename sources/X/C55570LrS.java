package X;

import com.ss.android.ugc.feed.platform.panel.autoscroll.TabletDefaultAutoScrollComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LrS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55570LrS extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C55570LrS LJLIL = new C55570LrS();

    public C55570LrS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(TabletDefaultAutoScrollComponent.class);
        uiContentAssem.LJIIIIZZ = new TabletDefaultAutoScrollComponent();
        uiContentAssem.LJI = R.id.aao;
        return C76800UCe.LIZ;
    }
}
