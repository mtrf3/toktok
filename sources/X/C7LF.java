package X;

import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem.ContactListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LF extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LF LJLIL = new C7LF();

    public C7LF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(ContactListAssem.class);
        uiContentAssem.LJIIIIZZ = new ContactListAssem();
        uiContentAssem.LJI = R.id.bs5;
        return C76800UCe.LIZ;
    }
}
