package X;

import com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A2K extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final A2K LJLIL = new A2K();

    public A2K() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(SeriesPostUIAssem.class);
        uiContentAssem.LJIIIIZZ = new SeriesPostUIAssem();
        uiContentAssem.LJI = R.id.bs8;
        return C76800UCe.LIZ;
    }
}
