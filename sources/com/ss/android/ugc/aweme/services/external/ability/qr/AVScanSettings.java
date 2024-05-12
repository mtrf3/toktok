package com.ss.android.ugc.aweme.services.external.ability.qr;

/* loaded from: classes11.dex */
public class AVScanSettings {
    public String detectModelDir;
    public float detectRectHeight;
    public float detectRectLeft;
    public float detectRectTop;
    public float detectRectWidth;
    public boolean enableDetectRect;
    public int width = -1;
    public int height = -1;
    public long detectRequirement = 65536;
    public int buildChainFlag = 1;

    /* loaded from: classes11.dex */
    public interface Requirement {
    }

    public int getBuildChainFlag() {
        return this.buildChainFlag;
    }

    public String getDetectModelDir() {
        return this.detectModelDir;
    }

    public long getDetectRequirement() {
        return this.detectRequirement;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
