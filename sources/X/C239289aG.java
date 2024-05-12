package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.9aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239289aG implements InterfaceC87283bg {
    public final String LJLIL;
    public final Intent LJLILLLLZI;
    public final Context LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C239289aG)) {
            return false;
        }
        C239289aG c239289aG = (C239289aG) obj;
        return o.LJ(this.LJLIL, c239289aG.LJLIL) && o.LJ(this.LJLILLLLZI, c239289aG.LJLILLLLZI) && o.LJ(this.LJLJI, c239289aG.LJLJI);
    }

    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        Context context = this.LJLJI;
        return hashCode + (context == null ? 0 : context.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwoStepVerificationManagementHierarchyData(interstitialToken=");
        LIZ.append(this.LJLIL);
        LIZ.append(", activityIntent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", activityContext=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C239289aG(TwoStepVerificationManagementActivity twoStepVerificationManagementActivity, Intent activityIntent, String str) {
        o.LJIIIZ(activityIntent, "activityIntent");
        this.LJLIL = str;
        this.LJLILLLLZI = activityIntent;
        this.LJLJI = twoStepVerificationManagementActivity;
    }
}
