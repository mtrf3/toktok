package X;

import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: X.HfC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44618HfC {
    public static final VEConfig LIZ = new VEConfig(false, 0, 0, null, 0, null, null, 127, null);

    public static VEVideoEncodeSettings.ENCODE_PROFILE LIZ() {
        String str = LIZ.encodeProfile;
        int hashCode = str.hashCode();
        if (hashCode != 3016401) {
            if (hashCode != 3202466) {
                if (hashCode == 3343801 && str.equals("main")) {
                    return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
                }
            } else if (str.equals("high")) {
                return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
            }
        } else if (str.equals("base")) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        }
        return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
    }
}
