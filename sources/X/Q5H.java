package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* loaded from: classes12.dex */
public class Q5H {
    public Context LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public InterfaceC66401Q4f LIZLLL;
    public Bundle LJ;
    public final AccessToken LJFF;

    public Q5H(ActivityC45651qj activityC45651qj, String str, Bundle bundle) {
        AccessToken.Companion.getClass();
        this.LJFF = C66382Q3m.LIZIZ();
        if (!C66382Q3m.LIZJ()) {
            this.LIZIZ = C66373Q3d.LJIILIIL(activityC45651qj);
        }
        this.LIZ = activityC45651qj;
        this.LIZJ = str;
        if (bundle != null) {
            this.LJ = bundle;
        } else {
            this.LJ = new Bundle();
        }
    }

    public Q5H(ActivityC45651qj activityC45651qj, String str, Bundle bundle, int i) {
        str = str == null ? C66373Q3d.LJIILIIL(activityC45651qj) : str;
        Q4J.LJFF(str, "applicationId");
        this.LIZIZ = str;
        this.LIZ = activityC45651qj;
        this.LIZJ = "oauth";
        this.LJ = bundle;
    }
}
