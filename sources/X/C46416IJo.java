package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.IJo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46416IJo {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        Keva repo = Keva.getRepo("TTSettingData");
        o.LJIIIIZZ(repo, "getRepo(SETTINGS_REPO_NAME)");
        return repo.getBoolean("IsBackgroundAudioEnabled", false);
    }

    public static ILC LIZ() {
        ILC ilc;
        ILC[] values = ILC.values();
        Keva repo = Keva.getRepo("TTSettingData");
        o.LJIIIIZZ(repo, "getRepo(SETTINGS_REPO_NAME)");
        if (C47957Irx.LIZ() == 2 || C47957Irx.LIZ() == 3) {
            ilc = ILC.PLAY_IN_ORDER;
        } else {
            ilc = ILC.REPEAT;
        }
        return values[repo.getInt("BackgroundAudioPlayOrder", ilc.ordinal())];
    }

    public static boolean LIZIZ() {
        if (LIZJ() && C47957Irx.LIZIZ()) {
            return true;
        }
        return false;
    }
}
