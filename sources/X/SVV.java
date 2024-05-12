package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.LayoutSwitcherAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVV extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SVV LJLIL = new SVV();

    public SVV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(LayoutSwitcherAssem.class);
        uiSlotAssem.LJIIIZ = new LayoutSwitcherAssem();
        uiSlotAssem.LJI = R.id.jib;
        return C76800UCe.LIZ;
    }
}
