package X;

import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVM extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SVM LJLIL = new SVM();

    public SVM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(EdgeSlideGuideAssem.class);
        uiSlotAssem.LJIIIZ = new EdgeSlideGuideAssem();
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZIZ;
        uiSlotAssem.LJI = R.id.dhy;
        return C76800UCe.LIZ;
    }
}
