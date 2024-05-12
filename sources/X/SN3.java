package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SN3 {
    public static final /* synthetic */ int LIZ = 0;

    public static SN0 LIZJ(PrivacySettingsRestrictionItem privacySettingsRestrictionItem) {
        int i;
        boolean z = false;
        if (privacySettingsRestrictionItem != null) {
            i = privacySettingsRestrictionItem.getShowType();
        } else {
            i = 0;
        }
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                z = true;
            } else {
                z2 = false;
            }
        }
        return new SN0(z, z2);
    }

    public static SN0 LIZLLL(PrivacySettingsRestrictionOption privacySettingsRestrictionOption) {
        int i;
        boolean z = false;
        if (privacySettingsRestrictionOption != null) {
            i = privacySettingsRestrictionOption.getShowType();
        } else {
            i = 0;
        }
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                z = true;
            } else {
                z2 = false;
            }
        }
        return new SN0(z, z2);
    }

    public static void LIZ(PrivacySettingsRestrictionOption privacySettingsRestrictionOption, SKL toastHolder) {
        o.LJIIIZ(toastHolder, "toastHolder");
        if (privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.getShowType() == 1 && privacySettingsRestrictionOption.getResType() == 2) {
            toastHolder.LIZ(R.string.g9h);
        }
    }

    public static boolean LIZIZ(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, SKL toastHolder) {
        o.LJIIIZ(toastHolder, "toastHolder");
        if (privacySettingsRestrictionItem == null || privacySettingsRestrictionItem.getShowType() != 1) {
            return true;
        }
        if (privacySettingsRestrictionItem.getResType() == 2) {
            toastHolder.LIZ(R.string.g9h);
            return false;
        }
        return false;
    }
}
