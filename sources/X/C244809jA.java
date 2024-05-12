package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.CreatorCenterURLSetting;

/* renamed from: X.9jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244809jA {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        if (Q7K.LIZIZ("inapp_cc_reverse", 0) != 0 || C244849jE.LIZ() == 0 || SettingsManager.LIZLLL().LJIIIIZZ("creator_center_inapp_url", CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel.class, null) == null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ() {
        int LIZ2 = C244849jE.LIZ();
        if (LIZ() && (LIZ2 == 1 || LIZ2 == 5)) {
            return true;
        }
        return false;
    }
}
