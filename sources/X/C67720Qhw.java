package X;

import com.google.android.gms.common.api.Scope;

/* renamed from: X.Qhw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67720Qhw {
    public static final C67724Qi0 LIZ;
    public static final C67718Qhu<C67725Qi1> LIZIZ;

    static {
        C67728Qi4 c67728Qi4 = new C67728Qi4();
        C67728Qi4 c67728Qi42 = new C67728Qi4();
        C67724Qi0 c67724Qi0 = new C67724Qi0();
        LIZ = c67724Qi0;
        C67723Qhz c67723Qhz = new C67723Qhz();
        new Scope(1, "profile");
        new Scope(1, "email");
        LIZIZ = new C67718Qhu<>("SignIn.API", c67724Qi0, c67728Qi4);
        new C67718Qhu("SignIn.INTERNAL_API", c67723Qhz, c67728Qi42);
    }
}
