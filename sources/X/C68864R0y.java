package X;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: X.R0y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68864R0y {
    public BeginSignInRequest.PasswordRequestOptions LIZ;
    public BeginSignInRequest.GoogleIdTokenRequestOptions LIZIZ;
    public BeginSignInRequest.PasskeysRequestOptions LIZJ;
    public BeginSignInRequest.PasskeyJsonRequestOptions LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJI;

    public final BeginSignInRequest LIZ() {
        return new BeginSignInRequest(this.LIZ, this.LIZIZ, this.LJ, this.LJFF, this.LJI, this.LIZJ, this.LIZLLL);
    }

    public C68864R0y() {
        R13 r13 = new R13();
        r13.LIZ = false;
        this.LIZ = new BeginSignInRequest.PasswordRequestOptions(r13.LIZ);
        C67671Qh9 c67671Qh9 = new C67671Qh9();
        c67671Qh9.LIZ = false;
        this.LIZIZ = c67671Qh9.LIZ();
        R11 r11 = new R11();
        r11.LIZ = false;
        boolean z = r11.LIZ;
        this.LIZJ = new BeginSignInRequest.PasskeysRequestOptions(r11.LIZJ, r11.LIZIZ, z);
        R12 r12 = new R12();
        r12.LIZ = false;
        this.LIZLLL = new BeginSignInRequest.PasskeyJsonRequestOptions(r12.LIZ, r12.LIZIZ);
    }
}
