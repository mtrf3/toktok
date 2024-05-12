package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CPlusSettings;
import com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.A7w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25728A7w {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ() {
        boolean z;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null) {
            curUser.getRegisterTime();
            if ((System.currentTimeMillis() / 1000) - curUser.getRegisterTime() < 2592000) {
                z = true;
            } else {
                z = false;
            }
            Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(LIZIZ("vgv_is_new_user_account"), z);
        }
    }

    public static final boolean LIZJ() {
        GiftSettings giftSettings;
        CPlusSettings LIZIZ = A80.LIZIZ();
        if (LIZIZ != null && LIZIZ.allowCreatorPlus) {
            return false;
        }
        boolean z = Keva.getRepo("video_gift_settings_keva_repo").getBoolean(LIZIZ("vgc_visiting_first_time"), true);
        try {
            SettingsManager.LIZLLL().getClass();
            giftSettings = (GiftSettings) SettingsManager.LJII("nlg_creators", GiftSettings.class);
        } catch (Throwable unused) {
        }
        if (giftSettings != null && giftSettings.allowVideoGift && z) {
            return true;
        }
        return false;
    }

    static {
        LIZ();
    }

    public static String LIZIZ(String str) {
        String shortId;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null) {
            return str;
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            shortId = curUser.getShortId();
        } else {
            shortId = curUser.getUniqueId();
        }
        return C00F.LIZIZ(str, '_', shortId);
    }
}
