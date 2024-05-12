package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class AudioPropertiesInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public float[] spectrum;
    public int vad;
    public double voicePitch;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioPropertiesInfo{linearVolume='");
        LIZ.append(this.linearVolume);
        LIZ.append('\'');
        LIZ.append("nonlinearVolume='");
        LIZ.append(this.nonlinearVolume);
        LIZ.append('\'');
        LIZ.append("voicePitch='");
        LIZ.append(this.voicePitch);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public AudioPropertiesInfo(int i, int i2, float[] fArr, int i3) {
        float[] fArr2 = new float[257];
        this.spectrum = fArr2;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
        System.arraycopy(fArr, 0, fArr2, 0, 257);
        this.vad = i3;
    }
}
