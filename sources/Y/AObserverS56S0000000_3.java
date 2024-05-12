package Y;

import X.C194597kN;
import X.C7XD;
import X.C8GJ;
import X.C8GK;
import X.X1D;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeensApproveInfo;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import yq4.a;

/* loaded from: classes4.dex */
public class AObserverS56S0000000_3 implements Observer {
    public final int $t;

    public static final void onChanged$2(AObserverS56S0000000_3 aObserverS56S0000000_3, Object obj) {
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, t);
                return;
            case 1:
                onChanged$1(this, t);
                return;
            case 2:
                onChanged$2(this, t);
                return;
            default:
                return;
        }
    }

    public AObserverS56S0000000_3(int i) {
        this.$t = i;
    }

    public static final void onChanged$0(AObserverS56S0000000_3 aObserverS56S0000000_3, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on new value ");
        LIZ.append(obj);
        C7XD.LIZ("GlobalStateHolder", X1D.LIZIZ(LIZ));
        C194597kN.LIZ.LIZIZ.postValue(obj);
    }

    public static final void onChanged$1(AObserverS56S0000000_3 aObserverS56S0000000_3, Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        PrivacyHighlightsForTeensApproveInfo privacyHighlightsForTeensApproveInfo = (PrivacyHighlightsForTeensApproveInfo) obj;
        IPolicyNoticeService LJIIL = a.LJIIL();
        String str4 = null;
        if (privacyHighlightsForTeensApproveInfo != null) {
            str4 = privacyHighlightsForTeensApproveInfo.business;
            str = privacyHighlightsForTeensApproveInfo.policyVersion;
            str2 = privacyHighlightsForTeensApproveInfo.style;
            str3 = privacyHighlightsForTeensApproveInfo.extra;
            num = privacyHighlightsForTeensApproveInfo.operation;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            num = null;
        }
        C8GK.LIZ(LJIIL, str4, str, str2, str3, num, null, null, C8GJ.LJLIL, 192);
    }
}
