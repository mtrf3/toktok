package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.AgeGateYearOnlyRegistrationFragment;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import kotlin.jvm.internal.o;

/* renamed from: X.Xq4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86060Xq4 implements InterfaceC86100Xqi {
    public final Bundle LIZ;
    public final AgeGateSdkRegistrationFlow LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC86100Xqi
    public final Bundle data() {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("flow", this.LIZIZ.getFlow());
            bundle2.putBoolean("isFtc", this.LIZJ);
            return bundle2;
        }
        return bundle;
    }

    @Override // X.InterfaceC86100Xqi
    public final PNSAgeGateBaseFragment LIZ() {
        if (C62960OnM.LIZ() != 0) {
            return new AgeGateYearOnlyRegistrationFragment();
        }
        return new TTKAgeGateRegistrationFragment();
    }

    public C86060Xq4(Bundle bundle, AgeGateSdkRegistrationFlow flow, boolean z) {
        o.LJIIIZ(flow, "flow");
        this.LIZ = bundle;
        this.LIZIZ = flow;
        this.LIZJ = z;
    }
}
