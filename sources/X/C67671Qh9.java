package X;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.List;

/* renamed from: X.Qh9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67671Qh9 {
    public boolean LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL = true;
    public String LJ;
    public List LJFF;
    public boolean LJI;

    public final BeginSignInRequest.GoogleIdTokenRequestOptions LIZ() {
        boolean z = this.LIZ;
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(this.LIZIZ, this.LIZJ, this.LJ, this.LJFF, z, this.LIZLLL, this.LJI);
    }
}
