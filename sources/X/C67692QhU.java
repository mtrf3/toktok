package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* renamed from: X.QhU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67692QhU {
    public static final C64061PCf LIZ = new C64061PCf("GoogleSignInCommon", new String[0]);

    public static void LIZJ(Context context) {
        C67691QhT.LIZ(context).LIZIZ();
        java.util.Set<AbstractC67709Qhl> set = AbstractC67709Qhl.LJLIL;
        synchronized (set) {
        }
        Iterator<AbstractC67709Qhl> it = set.iterator();
        while (it.hasNext()) {
            it.next().LJIIL();
        }
        C67824Qjc.LIZ();
    }

    public static Intent LIZ(Context context, GoogleSignInOptions googleSignInOptions) {
        LIZ.getClass();
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static BasePendingResult LIZIZ(AbstractC67709Qhl abstractC67709Qhl, Context context, boolean z) {
        LIZ.getClass();
        LIZJ(context);
        if (z) {
            Status status = Status.RESULT_SUCCESS;
            QH7.LJIIIZ(status, "Result must not be null");
            C67742QiI c67742QiI = new C67742QiI(abstractC67709Qhl);
            c67742QiI.LIZ(status);
            return c67742QiI;
        }
        return abstractC67709Qhl.LJI(new C67986QmE(abstractC67709Qhl));
    }
}
