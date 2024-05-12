package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVO extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SVO LJLIL = new SVO();

    public SVO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(SearchHubTabsComponent.class);
        uiSlotAssem.LJIIIZ = new SearchHubTabsComponent();
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZJ;
        uiSlotAssem.LJI = R.id.dh6;
        return C76800UCe.LIZ;
    }
}
