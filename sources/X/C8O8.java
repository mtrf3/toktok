package X;

import com.ss.android.ugc.feed.platform.cell.clean.CellCleanComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8O8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O8 extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8O8 LJLIL = new C8O8();

    public C8O8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.view_rootview;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(CellCleanComponent.class);
        reusedUiContentAssem.LIZJ = new CellCleanComponent();
        return C76800UCe.LIZ;
    }
}
