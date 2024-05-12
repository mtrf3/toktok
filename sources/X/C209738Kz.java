package X;

import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.seekbar.LandscapeCellSeekBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209738Kz extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C209738Kz LJLIL = new C209738Kz();

    public C209738Kz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.ian;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(LandscapeCellSeekBarAssem.class);
        reusedUiContentAssem.LIZJ = new LandscapeCellSeekBarAssem();
        if (LandscapeOptExperiment.LIZ()) {
            reusedUiContentAssem.LIZLLL(C8VK.LAZY);
        }
        return C76800UCe.LIZ;
    }
}
