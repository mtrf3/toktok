package X;

import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem.SelectedListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LD extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LD LJLIL = new C7LD();

    public C7LD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(SelectedListAssem.class);
        uiContentAssem.LJIIIIZZ = new SelectedListAssem();
        uiContentAssem.LJI = R.id.jmg;
        return C76800UCe.LIZ;
    }
}
