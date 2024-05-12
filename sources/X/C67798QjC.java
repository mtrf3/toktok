package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* renamed from: X.QjC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67798QjC extends AbstractC67791Qj5 {
    public static final C67718Qhu LJIIJJI = new C67718Qhu("Auth.Api.Identity.SignIn.API", new C67804QjI(), new C67728Qi4());
    public final String LJIIJ;

    public final AbstractC67638Qgc<Void> LJI() {
        F9J.LIZIZ(this.LIZ, 0, "com.google.android.gms.signin").edit().clear().apply();
        java.util.Set<AbstractC67709Qhl> set = AbstractC67709Qhl.LJLIL;
        synchronized (set) {
        }
        Iterator<AbstractC67709Qhl> it = set.iterator();
        while (it.hasNext()) {
            it.next().LJIIL();
        }
        C67824Qjc.LIZ();
        C67887Qkd c67887Qkd = new C67887Qkd();
        c67887Qkd.LIZJ = new Feature[]{C67811QjP.LIZIZ};
        c67887Qkd.LIZ = new C67984QmC(this);
        c67887Qkd.LIZIZ = false;
        c67887Qkd.LIZLLL = 1554;
        return LIZLLL(1, c67887Qkd.LIZ());
    }

    public static final SignInCredential LJFF(Intent intent) {
        SafeParcelable LIZ;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            SafeParcelable safeParcelable = null;
            if (byteArrayExtra == null) {
                LIZ = null;
            } else {
                LIZ = C64476PSe.LIZ(byteArrayExtra, creator);
            }
            Status status = (Status) LIZ;
            if (status != null) {
                if (status.LJJJJL()) {
                    Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        safeParcelable = C64476PSe.LIZ(byteArrayExtra2, creator2);
                    }
                    SignInCredential signInCredential = (SignInCredential) safeParcelable;
                    if (signInCredential != null) {
                        return signInCredential;
                    }
                    throw new ETK(Status.RESULT_INTERNAL_ERROR);
                }
                throw new ETK(status);
            }
            throw new ETK(Status.RESULT_CANCELED);
        }
        throw new ETK(Status.RESULT_INTERNAL_ERROR);
    }

    public final C67646Qgk LJ(BeginSignInRequest beginSignInRequest) {
        C68864R0y LJJJJL = BeginSignInRequest.LJJJJL(beginSignInRequest);
        LJJJJL.LJ = this.LJIIJ;
        BeginSignInRequest LIZ = LJJJJL.LIZ();
        C67887Qkd c67887Qkd = new C67887Qkd();
        c67887Qkd.LIZJ = new Feature[]{C67811QjP.LIZ};
        c67887Qkd.LIZ = new C284919x(this, LIZ);
        c67887Qkd.LIZIZ = false;
        c67887Qkd.LIZLLL = 1553;
        return LIZLLL(0, c67887Qkd.LIZ());
    }

    public C67798QjC(Activity activity, C67675QhD c67675QhD) {
        super(activity, (C67718Qhu<C67675QhD>) LJIIJJI, c67675QhD, C67795Qj9.LIZJ);
        this.LJIIJ = C66574QAw.LIZ();
    }

    public C67798QjC(Context context, C67675QhD c67675QhD) {
        super(context, (C67718Qhu<C67675QhD>) LJIIJJI, c67675QhD, C67795Qj9.LIZJ);
        this.LJIIJ = C66574QAw.LIZ();
    }
}
