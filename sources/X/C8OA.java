package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8OA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OA extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8OA LJLIL = new C8OA();

    public C8OA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.view_rootview;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(CellAdaptionComponent.class);
        reusedUiContentAssem.LIZJ = new CellAdaptionComponent();
        return C76800UCe.LIZ;
    }
}
