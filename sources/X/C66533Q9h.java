package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import net.openid.appauth.AuthorizationManagementActivity;

/* renamed from: X.Q9h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66533Q9h {
    public final Context LIZ;
    public final C66534Q9i LIZIZ;
    public final Q6S LIZJ;
    public final C39240Fae LIZLLL;
    public boolean LJ;

    public C66533Q9h(Context context) {
        C66534Q9i c66534Q9i = C66534Q9i.LIZJ;
        C39240Fae LIZ = C39021FTd.LIZ(context, c66534Q9i.LIZ);
        Q6S q6s = new Q6S(context);
        this.LIZ = context;
        this.LIZIZ = c66534Q9i;
        this.LIZJ = q6s;
        this.LIZLLL = LIZ;
        if (LIZ != null && LIZ.LIZLLL.booleanValue()) {
            String str = LIZ.LIZ;
            synchronized (q6s) {
                if (q6s.LIZLLL == null) {
                    q6s.LIZLLL = new Q6R(q6s);
                    Context context2 = q6s.LIZ.get();
                    if (context2 == null || !AnonymousClass003.LIZ(context2, str, q6s.LIZLLL)) {
                        Q6T.LIZIZ().LIZJ(4, "Unable to bind custom tabs service", null, new Object[0]);
                        q6s.LIZJ.countDown();
                    }
                }
            }
        }
    }

    public final Intent LIZ(C66544Q9s c66544Q9s, AnonymousClass005 anonymousClass005) {
        Intent intent;
        if (!this.LJ) {
            if (this.LIZLLL != null) {
                android.net.Uri LIZJ = c66544Q9s.LIZJ();
                if (this.LIZLLL.LIZLLL.booleanValue()) {
                    intent = anonymousClass005.LIZ;
                } else {
                    intent = new Intent("android.intent.action.VIEW");
                }
                intent.setPackage(this.LIZLLL.LIZ);
                intent.setData(LIZJ);
                Q6T.LIZ("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.LIZLLL.LIZLLL.toString());
                Q6T.LIZ("Initiating authorization request to %s", c66544Q9s.LIZ.LIZ);
                Intent intent2 = new Intent(this.LIZ, (Class<?>) AuthorizationManagementActivity.class);
                intent2.putExtra("authIntent", intent);
                intent2.putExtra("authRequest", c66544Q9s.LIZIZ().toString());
                intent2.putExtra("completeIntent", (Parcelable) null);
                intent2.putExtra("cancelIntent", (Parcelable) null);
                return intent2;
            }
            throw new ActivityNotFoundException();
        }
        throw new IllegalStateException("Service has been disposed and rendered inoperable");
    }

    public final void LIZIZ(C65474Pmo c65474Pmo, QAN qan) {
        if (!this.LJ) {
            Q6T.LIZ("Initiating code exchange request to %s", c65474Pmo.LIZ.LIZIZ);
            new AsyncTaskC66537Q9l(c65474Pmo, this.LIZIZ.LIZIZ, qan).execute1(new Void[0]);
            return;
        }
        throw new IllegalStateException("Service has been disposed and rendered inoperable");
    }
}
