package X;

import com.bytedance.poplayer.core.PopupManager;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class RCM extends AbstractC68941R3x {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        QTX qtx;
        R4V r4v2 = r4v;
        if (r4v2 != null && (qtx = r4v2.LJIIIZ) != null) {
            ActivityC45651qj activityC45651qj = this.LIZ;
            int i = this.LIZIZ;
            JSONObject jSONObject = qtx.LJIIL;
            if (jSONObject != null && jSONObject.optBoolean("email_collected", false)) {
                RCN.LIZ();
                return;
            }
            boolean z = RCN.LJ;
            switch (C35260Dse.LIZ()) {
                case 1:
                    if (i != 1 && i != 2) {
                        return;
                    }
                    PopupManager.LJIIL(new C85718XkY(activityC45651qj, i, z));
                    return;
                case 2:
                    if (i != 0) {
                        return;
                    }
                    PopupManager.LJIIL(new C85704XkK(i, activityC45651qj, z));
                    return;
                case 3:
                    if (i != 0) {
                        return;
                    }
                    PopupManager.LJIIL(new C85718XkY(activityC45651qj, i, z));
                    return;
                case 4:
                case 5:
                    if (i == 0) {
                        PopupManager.LJIIL(new C85704XkK(i, activityC45651qj, z));
                    } else {
                        PopupManager.LJIIL(new C85718XkY(activityC45651qj, i, z));
                    }
                    C61851OPf.LIZLLL(false);
                    return;
                case 6:
                    PopupManager.LJIIL(new C85718XkY(activityC45651qj, i, z));
                    C61851OPf.LIZLLL(false);
                    return;
                default:
                    return;
            }
        }
        RCN.LIZ();
    }

    public RCM(int i, ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(R4V r4v, int i) {
        String str;
        R4V r4v2 = r4v;
        RCN.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request user info failed, ");
        if (r4v2 != null) {
            str = r4v2.LJIILJJIL;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }
}
