package X;

import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchDefaultAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LH extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LH LJLIL = new C7LH();

    public C7LH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(IMSearchDefaultAssem.class);
        uiContentAssem.LJIIIIZZ = new IMSearchDefaultAssem();
        uiContentAssem.LJI = R.id.bsj;
        return C76800UCe.LIZ;
    }
}
