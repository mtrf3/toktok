package com.ss.ttm.player;

import android.media.audiofx.AudioEffect;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;

/* loaded from: classes9.dex */
public class AudioFormats {
    public static final int[] LIZ = {LivePlayerResourceReleaseSetting.ENABLE, LiveCenterDelayLoadSetting.DEFAULT, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, LiveExchangeConfirmThreshold.DEFAULT, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static boolean isLicencedDolbyDevice() {
        if (LIZIZ) {
            return LIZJ;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        int length = queryEffects.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (queryEffects[i].implementor.contains("Dolby Laboratories")) {
                LIZJ = true;
                break;
            }
            i++;
        }
        LIZIZ = true;
        return LIZJ;
    }
}
