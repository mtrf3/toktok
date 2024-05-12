package com.ss.ttlivestreamer.core.utils;

import X.C16880lQ;
import X.X1D;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AudioLoudnessCalculator {

    /* loaded from: classes12.dex */
    public interface EventListener {
        void onError(int i, String str);

        void onSuccess(double d);
    }

    public static native String nativeCalculateLoudness(String str);

    public static void calcLoudness(final String str, final EventListener eventListener) {
        final SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("audio_loudness_cal");
        lockThread.start();
        lockThread.getHandler().post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.AudioLoudnessCalculator.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_AudioLoudnessCalculator$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_AudioLoudnessCalculator$1__run$___twin___() {
                AudioLoudnessCalculator.parseLoudnessMessage(AudioLoudnessCalculator.nativeCalculateLoudness(str), eventListener);
                SafeHandlerThreadPoolExecutor.unlockThread(lockThread);
            }

            public static void com_ss_ttlivestreamer_core_utils_AudioLoudnessCalculator$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_utils_AudioLoudnessCalculator$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void parseLoudnessMessage(String str, EventListener eventListener) {
        try {
            double d = JSONObjectProtectorUtils.getDouble(new JSONObject(str), "loudness");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loudness: ");
            LIZ.append(d);
            AVLog.ioi("AudioLoudnessCalculator", X1D.LIZIZ(LIZ));
            eventListener.onSuccess(d);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
