package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7L5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7L5 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7L5 LJLIL = new C7L5();

    public C7L5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(SingleChatNoticeAssem.class);
        uiContentAssem.LJIIIIZZ = new SingleChatNoticeAssem();
        uiContentAssem.LJI = R.id.b_1;
        return C76800UCe.LIZ;
    }
}