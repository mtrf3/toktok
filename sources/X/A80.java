package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CPlusSettings;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes5.dex */
public final class A80 {
    public static final /* synthetic */ int LIZ = 0;

    public static final CPlusSettings LIZIZ() {
        try {
            return (CPlusSettings) SettingsManager.LIZLLL().LJIIIIZZ("creator_plus_settings", CPlusSettings.class, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String LIZ() {
        String shortId;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null) {
            return "ENROLL_DIALOG_SHOW_KEY";
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            shortId = curUser.getShortId();
        } else {
            shortId = curUser.getUniqueId();
        }
        return C00F.LIZIZ("ENROLL_DIALOG_SHOW_KEY", '_', shortId);
    }
}
