package X;

import defpackage.b0;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class IZB implements Serializable {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VolumeInfo{loudnessRange=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loudnessRangeStart=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", loudnessRangeEnd=");
        LIZ.append(this.LJLJI);
        LIZ.append(", maximumMomentaryLoudness=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", maximumShortTermLoudness=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", volumeInfoJson=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", disableInPhotoMode=");
        LIZ.append(this.LJLJL);
        LIZ.append(", version=");
        return b0.LIZJ(LIZ, this.LJLJLJ, '}', LIZ);
    }

    public float getLoudnessRange() {
        return this.LJLIL;
    }

    public float getLoudnessRangeEnd() {
        return this.LJLJI;
    }

    public float getLoudnessRangeStart() {
        return this.LJLILLLLZI;
    }

    public float getMaximumMomentaryLoudness() {
        return this.LJLJJI;
    }

    public float getMaximumShortTermLoudness() {
        return this.LJLJJL;
    }

    public int getVersion() {
        return this.LJLJLJ;
    }

    public String getVolumeInfoJson() {
        return this.LJLJJLL;
    }

    public boolean isDisableInPhotoMode() {
        return this.LJLJL;
    }

    public void setDisableInPhotoMode(boolean z) {
        this.LJLJL = z;
    }

    public void setLoudnessRange(float f) {
        this.LJLIL = f;
    }

    public void setLoudnessRangeEnd(float f) {
        this.LJLJI = f;
    }

    public void setLoudnessRangeStart(float f) {
        this.LJLILLLLZI = f;
    }

    public void setMaximumMomentaryLoudness(float f) {
        this.LJLJJI = f;
    }

    public void setMaximumShortTermLoudness(float f) {
        this.LJLJJL = f;
    }

    public void setVersion(int i) {
        this.LJLJLJ = i;
    }

    public void setVolumeInfoJson(String str) {
        this.LJLJJLL = str;
    }
}
