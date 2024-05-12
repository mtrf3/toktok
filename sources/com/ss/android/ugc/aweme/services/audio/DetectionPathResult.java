package com.ss.android.ugc.aweme.services.audio;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DetectionPathResult {
    public final VoiceDetectionResult detectionResult;
    public final String path;

    public static /* synthetic */ DetectionPathResult copy$default(DetectionPathResult detectionPathResult, String str, VoiceDetectionResult voiceDetectionResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detectionPathResult.path;
        }
        if ((i & 2) != 0) {
            voiceDetectionResult = detectionPathResult.detectionResult;
        }
        return detectionPathResult.copy(str, voiceDetectionResult);
    }

    public final DetectionPathResult copy(String str, VoiceDetectionResult voiceDetectionResult) {
        return new DetectionPathResult(str, voiceDetectionResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetectionPathResult)) {
            return false;
        }
        DetectionPathResult detectionPathResult = (DetectionPathResult) obj;
        return o.LJ(this.path, detectionPathResult.path) && o.LJ(this.detectionResult, detectionPathResult.detectionResult);
    }

    public int hashCode() {
        String str = this.path;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VoiceDetectionResult voiceDetectionResult = this.detectionResult;
        return hashCode + (voiceDetectionResult != null ? voiceDetectionResult.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DetectionPathResult(path=");
        LIZ.append(this.path);
        LIZ.append(", detectionResult=");
        LIZ.append(this.detectionResult);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final VoiceDetectionResult getDetectionResult() {
        return this.detectionResult;
    }

    public final String getPath() {
        return this.path;
    }

    public DetectionPathResult(String str, VoiceDetectionResult voiceDetectionResult) {
        this.path = str;
        this.detectionResult = voiceDetectionResult;
    }
}
