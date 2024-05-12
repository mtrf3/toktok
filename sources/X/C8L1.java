package X;

import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8L1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8L1 extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8L1 LJLIL = new C8L1();

    public C8L1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.ian;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(LandscapeCellCaptionSwitchAssem.class);
        reusedUiContentAssem.LIZJ = new LandscapeCellCaptionSwitchAssem();
        if (LandscapeOptExperiment.LIZ()) {
            reusedUiContentAssem.LIZLLL(C8VK.LAZY);
        }
        return C76800UCe.LIZ;
    }
}
