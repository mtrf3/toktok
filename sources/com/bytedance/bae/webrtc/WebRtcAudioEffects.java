package com.bytedance.bae.webrtc;

import X.C06540Nm;
import X.C16880lQ;
import X.X1D;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes12.dex */
public class WebRtcAudioEffects {
    public static AudioEffect.Descriptor[] cachedEffects;
    public AcousticEchoCanceler aec;
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableNs;
    public static Map<String, List<String>> audioEffectBlackList = new HashMap();
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    public static boolean canUseAcousticEchoCanceler() {
        boolean z;
        if (isAcousticEchoCancelerEffectAvailable() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted()) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canUseAcousticEchoCanceler: ");
        LIZ.append(z);
        RXLogging.i("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z;
        if (isNoiseSuppressorEffectAvailable() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted()) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canUseNoiseSuppressor: ");
        LIZ.append(z);
        RXLogging.i("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
        return z;
    }

    public static boolean IsAudioEffectSupported() {
        if (audioEffectBlackList.isEmpty()) {
            initAudioEffectBlackList();
        }
        String productBrand = WebRtcAudioUtils.getProductBrand();
        if (productBrand.isEmpty() || !audioEffectBlackList.containsKey(productBrand)) {
            return true;
        }
        String romVersion = WebRtcAudioUtils.getRomVersion(productBrand);
        boolean contains = audioEffectBlackList.get(productBrand).contains(romVersion);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("IsAudioEffectSupported, ", productBrand, ", ", romVersion, ", in black list = ");
        LIZLLL.append(contains);
        RXLogging.w("WebRtcAudioEffects", X1D.LIZIZ(LIZLLL));
        return !contains;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        try {
            AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
            cachedEffects = queryEffects;
            return queryEffects;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return cachedEffects;
        }
    }

    public static void initAudioEffectBlackList() {
        audioEffectBlackList.put("vivo", new ArrayList());
        audioEffectBlackList.get("vivo").add("Funtouch OS_3.1_PD1616_D_7.17.5");
    }

    public static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public void release() {
        RXLogging.i("WebRtcAudioEffects", "release");
        try {
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
                this.aec = null;
            }
            NoiseSuppressor noiseSuppressor = this.ns;
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
                this.ns = null;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            this.aec = null;
            this.ns = null;
        }
    }

    public WebRtcAudioEffects() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ctor");
        LIZ.append(WebRtcAudioUtils.getThreadInfo());
        RXLogging.i("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" is blacklisted for HW AEC usage!");
            RXLogging.w("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
        }
        return contains;
    }

    public static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" is blacklisted for HW NS usage!");
            RXLogging.w("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
        }
        return contains;
    }

    public static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerEffectAvailable()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorEffectAvailable())) {
            return true;
        }
        return false;
    }

    public static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:55|(2:57|58)|(2:60|(7:62|63|64|(1:66)|67|68|(5:70|(1:72)(1:78)|73|(1:75)(1:77)|76)(1:79)))|85|63|64|(0)|67|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0069, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0074, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1 A[Catch: Exception -> 0x00ed, TryCatch #1 {Exception -> 0x00ed, blocks: (B:19:0x00d9, B:21:0x00e1, B:22:0x00e6), top: B:18:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d A[Catch: Exception -> 0x0069, TryCatch #2 {Exception -> 0x0069, blocks: (B:64:0x0055, B:66:0x005d, B:67:0x0062), top: B:63:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable(int r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.webrtc.WebRtcAudioEffects.enable(int):void");
    }

    public boolean setAEC(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAEC(");
        LIZ.append(z);
        LIZ.append(")");
        RXLogging.i("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
        if (!canUseAcousticEchoCanceler()) {
            RXLogging.w("WebRtcAudioEffects", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z != this.shouldEnableAec) {
            RXLogging.e("WebRtcAudioEffects", "Platform AEC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAec = z;
        return true;
    }

    public boolean setNS(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNS(");
        LIZ.append(z);
        LIZ.append(")");
        RXLogging.i("WebRtcAudioEffects", X1D.LIZIZ(LIZ));
        if (!canUseNoiseSuppressor()) {
            RXLogging.w("WebRtcAudioEffects", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns != null && z != this.shouldEnableNs) {
            RXLogging.e("WebRtcAudioEffects", "Platform NS state can't be modified while recording");
            return false;
        }
        this.shouldEnableNs = z;
        return true;
    }
}
