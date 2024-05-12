package X;

import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopAreaContainerAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209718Kx extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C209718Kx LJLIL = new C209718Kx();

    public C209718Kx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(TopAreaContainerAssem.class);
        reusedUiContentAssem.LIZJ = new TopAreaContainerAssem();
        reusedUiContentAssem.LIZLLL = R.id.lfa;
        if (LandscapeOptExperiment.LIZ()) {
            reusedUiContentAssem.LIZLLL(C8VK.LAZY);
        }
        return C76800UCe.LIZ;
    }
}
