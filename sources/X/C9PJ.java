package X;

import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentPromoteListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9PJ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9PJ extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C9PJ LJLIL = new C9PJ();

    public C9PJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(PaidContentPromoteListAssem.class);
        uiContentAssem.LJIIIIZZ = new PaidContentPromoteListAssem();
        uiContentAssem.LJI = R.id.hgp;
        return C76800UCe.LIZ;
    }
}
