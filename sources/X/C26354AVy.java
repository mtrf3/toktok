package X;

import com.ss.android.ugc.aweme.experiment.ProfileViewersExpConfig;

/* renamed from: X.AVy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26354AVy {
    public static final C26354AVy LIZ = new C26354AVy();
    public static final ProfileViewersExpConfig LIZIZ = new ProfileViewersExpConfig(null, null, null, 7, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C26355AVz.LJLIL);

    public static boolean LIZIZ() {
        Boolean bool;
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) LIZJ.getValue();
        if (profileViewersExpConfig != null && (bool = profileViewersExpConfig.profileViewersEnable) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZ() {
        boolean z;
        Boolean bool;
        boolean LIZIZ2 = LIZIZ();
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) LIZJ.getValue();
        if (profileViewersExpConfig != null && (bool = profileViewersExpConfig.profileViewersFixedEntrance) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (!LIZIZ2 || !z) {
            return false;
        }
        return true;
    }
}
