package X;

import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailPageContainerAssem;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186497Tp extends AbstractC65781Prl implements InterfaceC88472Yns<C7TM, C76800UCe> {
    public static final C186497Tp LJLIL = new C186497Tp();

    public C186497Tp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C7TM c7tm) {
        C7TM dynamicAssem = c7tm;
        o.LJIIIZ(dynamicAssem, "$this$dynamicAssem");
        dynamicAssem.LIZ = C65352Pkq.LIZ(PoiDetailPageContainerAssem.class);
        dynamicAssem.LJI = R.id.bul;
        dynamicAssem.LJ(Boolean.valueOf(!C186557Tv.LIZ()), "prop_disable_refresh");
        dynamicAssem.LJI("navbar", C186507Tq.LJLIL);
        if (PoiEnableExperiment.LIZIZ()) {
            dynamicAssem.LJI("status", C7TC.LJLIL);
            dynamicAssem.LJI("header", C189937cr.LJLIL);
            dynamicAssem.LJI("content", C186517Tr.LJLIL);
            if (C186537Tt.LIZ()) {
                dynamicAssem.LJI("bottom_bar", C186527Ts.LJLIL);
            }
        } else {
            dynamicAssem.LJI("status", C7TJ.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
