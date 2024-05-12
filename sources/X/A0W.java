package X;

import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesNavBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A0W extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final A0W LJLIL = new A0W();

    public A0W() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(ManageSeriesNavBarAssem.class);
        uiContentAssem.LJIIIIZZ = new ManageSeriesNavBarAssem();
        uiContentAssem.LJI = R.id.gdq;
        return C76800UCe.LIZ;
    }
}
