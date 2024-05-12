package X;

/* loaded from: classes12.dex */
public final class QBE {
    public static final boolean LIZ = LIZ("com.google.android.gms.auth.api.signin.GoogleSignInClient");
    public static final boolean LIZIZ = LIZ("com.google.android.gms.auth.api.identity.SignInCredential");
    public static final boolean LIZJ = LIZ("com.facebook.login.LoginManager");
    public static final boolean LIZLLL = LIZ("com.linecorp.linesdk.auth.LineLoginApi");
    public static final boolean LJ = LIZ("com.twitter.sdk.android.core.identity.TwitterAuthClient");
    public static final boolean LJFF = LIZ("com.kakao.sdk.user.UserApiClient");
    public static final boolean LJI = LIZ("com.vk.api.sdk.VK");

    public static boolean LIZ(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
