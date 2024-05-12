package X;

import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUU extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SUU LJLIL = new SUU();

    public SUU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(ManageSeriesListAssem.class);
        uiSlotAssem.LJIIIZ = new ManageSeriesListAssem();
        uiSlotAssem.LJI = R.id.gdi;
        return C76800UCe.LIZ;
    }
}
