package X;

import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209728Ky extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C209728Ky LJLIL = new C209728Ky();

    public C209728Ky() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.k_9;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(LandscapeCellSpeedAssem.class);
        reusedUiContentAssem.LIZJ = new LandscapeCellSpeedAssem();
        if (LandscapeOptExperiment.LIZ()) {
            reusedUiContentAssem.LIZLLL(C8VK.LAZY);
        }
        return C76800UCe.LIZ;
    }
}
