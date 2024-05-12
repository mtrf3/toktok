package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report.ChatReportAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LL extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LL LJLIL = new C7LL();

    public C7LL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(ChatReportAssem.class);
        uiContentAssem.LJIIIIZZ = new ChatReportAssem();
        uiContentAssem.LJI = R.id.b_1;
        return C76800UCe.LIZ;
    }
}
