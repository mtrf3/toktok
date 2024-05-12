package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubHeaderComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVP extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SVP LJLIL = new SVP();

    public SVP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(SearchHubHeaderComponent.class);
        uiSlotAssem.LJIIIZ = new SearchHubHeaderComponent();
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZJ;
        uiSlotAssem.LJI = R.id.de1;
        return C76800UCe.LIZ;
    }
}
