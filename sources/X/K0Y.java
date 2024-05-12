package X;

import androidx.fragment.app.FragmentManager;

/* loaded from: classes9.dex */
public final class K0Y {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ActivityC45651qj activityC45651qj) {
        FragmentManager supportFragmentManager;
        InterfaceC36571c5 LJJJIL;
        K0Z k0z;
        if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("voice_search_contaienr")) != null && (LJJJIL instanceof K0Z) && (k0z = (K0Z) LJJJIL) != null) {
            k0z.onBackPressed();
            return true;
        }
        return false;
    }
}
