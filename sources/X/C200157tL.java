package X;

import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageDiggAssem;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import kotlin.jvm.internal.AqS185S0100000_3;

/* renamed from: X.7tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C200157tL extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C200157tL(FullPageDiggAssem fullPageDiggAssem) {
        super(0, fullPageDiggAssem, FullPageDiggAssem.class, "handleDigg", "handleDigg()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        FullPageDiggAssem fullPageDiggAssem = (FullPageDiggAssem) this.receiver;
        PostModeContainerViewModel v3 = fullPageDiggAssem.v3();
        if ((v3 == null || !v3.hv0()) && !((PostDiggViewModel) fullPageDiggAssem.LJLJJI.getValue()).LJLILLLLZI && fullPageDiggAssem.A3().getAweme() != null) {
            ((PostDiggViewModel) fullPageDiggAssem.LJLJJI.getValue()).kv0(new AqS185S0100000_3(fullPageDiggAssem, 204));
        }
        return C76800UCe.LIZ;
    }
}
