package X;

import com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;

/* renamed from: X.Ih7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47285Ih7 {
    public static final boolean LIZ = DZG.LIZ;
    public static boolean LIZIZ = false;

    public static PlayerTypeAbConfig LIZ() {
        PlayerTypeAbConfigV2 decodeType;
        int i;
        int i2;
        try {
            FFL.LJIIIZ().getClass();
            int i3 = 0;
            PlayerTypeAbConfig playerTypeAbConfig = (PlayerTypeAbConfig) FFL.LJIJ(false, "player_type_v2", 31744, PlayerTypeAbConfig.class, null);
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.LJFF.LIZ;
            if (rateSettingsResponse != null && (decodeType = rateSettingsResponse.getDecodeType()) != null) {
                PlayerTypeAbConfig playerTypeAbConfig2 = new PlayerTypeAbConfig();
                int i4 = decodeType.playerType;
                if (i4 != -1) {
                    playerTypeAbConfig2.playerType = i4;
                } else {
                    if (playerTypeAbConfig == null) {
                        i = 0;
                    } else {
                        i = playerTypeAbConfig.playerType;
                    }
                    playerTypeAbConfig2.playerType = i;
                }
                int i5 = decodeType.bytevc1DecodeType;
                if (i5 != -1) {
                    playerTypeAbConfig2.bytevc1DecodeType = i5;
                } else {
                    if (playerTypeAbConfig == null) {
                        i2 = 0;
                    } else {
                        i2 = playerTypeAbConfig.bytevc1DecodeType;
                    }
                    playerTypeAbConfig2.bytevc1DecodeType = i2;
                }
                int i6 = decodeType.h264DecodeType;
                if (i6 != -1) {
                    playerTypeAbConfig2.h264DecodeType = i6;
                } else {
                    if (playerTypeAbConfig != null) {
                        i3 = playerTypeAbConfig.h264DecodeType;
                    }
                    playerTypeAbConfig2.h264DecodeType = i3;
                }
                return playerTypeAbConfig2;
            }
            return playerTypeAbConfig;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean LIZJ() {
        if (LIZIZ || LIZ) {
            return true;
        }
        return false;
    }

    public static ITZ LIZIZ() {
        if (LIZ() != null) {
            return ITZ.TT;
        }
        if (C00F.LIZ(31744, 0, "player_type", true) == 6) {
            return ITZ.TT_HARDWARE;
        }
        return ITZ.TT;
    }
}
