package X;

import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LJ extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LJ LJLIL = new C7LJ();

    public C7LJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(IMSearchAssem.class);
        uiContentAssem.LJIIIIZZ = new IMSearchAssem();
        uiContentAssem.LJI = R.id.bsj;
        return C76800UCe.LIZ;
    }
}
