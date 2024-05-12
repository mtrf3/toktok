package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.5sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148545sI {
    public static C6MP LIZ(int i) {
        switch (i) {
            case 1:
                return C6MP.CHOOSE_MUSIC;
            case 2:
                return C6MP.EFFECT;
            case 3:
                return C6MP.TEXT;
            case 4:
                return C6MP.EDIT_STICKER;
            case 5:
                return C6MP.FILTER;
            case 6:
                return C6MP.VOICE;
            case 7:
                return C6MP.VOLUME;
            case 8:
                return C6MP.CUT_MUSIC;
            case 9:
                return C6MP.AUTO_ENHANCE;
            case 10:
                return C6MP.AUDIO_RECORD;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return C6MP.CAPTION;
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 24:
            default:
                return C6MP.EMPTY;
            case 14:
                return C6MP.AUDIO_ENHANCE;
            case 15:
                return C6MP.CUT_OPTIMIZED;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return C6MP.IMAGE_CROP;
            case 17:
                return C6MP.PRIVACY_SETTING;
            case 18:
                return C6MP.CAP_CUT;
            case 19:
                return C6MP.LIBRARY;
            case 20:
                return C6MP.AUDIO_RECORD;
            case 21:
                return C6MP.AUTO_CUT;
            case 22:
                return C6MP.BACKGROUND;
            case 23:
                return C6MP.DRAFTS;
            case 25:
                return C6MP.EDIT_SAVE_LOCAL;
        }
    }
}
