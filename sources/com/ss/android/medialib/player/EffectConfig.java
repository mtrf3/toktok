package com.ss.android.medialib.player;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.medialib.model.EffectFileInfo;
import com.ss.android.medialib.model.EffectModel;

/* loaded from: classes8.dex */
public class EffectConfig {
    public String deviceName;
    public String effect8File;
    public String effect9File;
    public EffectFileInfo[] effectFileInfos;
    public String effectModelDir;
    public EffectModel[] effectModels;
    public int effectType;
    public String leftFilter;
    public float pos;
    public String rightFilter;
    public String snowflakeFile;
    public String vertigoFile;
    public int effectBuildChainType = 1;
    public float filterIntensity = -1.0f;

    public String getDeviceName() {
        String str = this.deviceName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEffectModelDir() {
        String str = this.effectModelDir;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEffect8File() {
        return this.effect8File;
    }

    public String getEffect9File() {
        return this.effect9File;
    }

    public int getEffectBuildChainType() {
        return this.effectBuildChainType;
    }

    public EffectFileInfo[] getEffectFileInfos() {
        return this.effectFileInfos;
    }

    public EffectModel[] getEffectModels() {
        return this.effectModels;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public float getFilterIntensity() {
        return this.filterIntensity;
    }

    public String getLeftFilter() {
        return this.leftFilter;
    }

    public float getPos() {
        return this.pos;
    }

    public String getRightFilter() {
        return this.rightFilter;
    }

    public String getSnowflakeFile() {
        return this.snowflakeFile;
    }

    public String getVertigoFile() {
        return this.vertigoFile;
    }

    public EffectConfig setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public void setEffect8File(String str) {
        this.effect8File = str;
    }

    public void setEffect9File(String str) {
        this.effect9File = str;
    }

    public EffectConfig setEffectBuildChainType(int i) {
        this.effectBuildChainType = i;
        return this;
    }

    public EffectConfig setEffectFileInfos(EffectFileInfo[] effectFileInfoArr) {
        this.effectFileInfos = effectFileInfoArr;
        return this;
    }

    public EffectConfig setEffectModelDir(String str) {
        this.effectModelDir = str;
        return this;
    }

    public EffectConfig setEffectModels(String[] strArr) {
        String[] split;
        if (strArr == null) {
            return this;
        }
        this.effectModels = new EffectModel[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null && (split = str.split(",")) != null && split.length == 3) {
                this.effectModels[i] = new EffectModel(CastIntegerProtector.parseInt(split[0]), CastIntegerProtector.parseInt(split[1]), CastIntegerProtector.parseInt(split[2]));
            }
        }
        return this;
    }

    public EffectConfig setEffectType(int i) {
        this.effectType = i;
        return this;
    }

    public EffectConfig setFilter(String str) {
        this.leftFilter = str;
        this.rightFilter = str;
        this.pos = 1.0f;
        return this;
    }

    public EffectConfig setFilterIntensity(float f) {
        this.filterIntensity = f;
        return this;
    }

    public void setSnowflakeFile(String str) {
        this.snowflakeFile = str;
    }

    public void setVertigoFile(String str) {
        this.vertigoFile = str;
    }

    public EffectConfig setEffectModels(EffectModel[] effectModelArr) {
        this.effectModels = effectModelArr;
        return this;
    }

    public EffectConfig setEffectModels(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return this;
        }
        int length = (iArr.length / 3) + 1;
        this.effectModels = new EffectModel[length];
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (i3 < i4) {
                int i5 = i3 * 3;
                this.effectModels[i3] = new EffectModel(iArr[i5], iArr[i5 + 1], iArr[i5 + 2]);
                i3++;
            } else {
                this.effectModels[i4] = new EffectModel(i, i2, i2);
                return this;
            }
        }
    }

    public EffectConfig setFilter(String str, String str2, float f) {
        this.leftFilter = str;
        this.rightFilter = str2;
        this.pos = f;
        return this;
    }

    public EffectConfig setEffectFiles(String str, String str2, String str3, String str4) {
        this.effect8File = str;
        this.effect9File = str2;
        this.vertigoFile = str3;
        this.snowflakeFile = str4;
        return this;
    }
}
