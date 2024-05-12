package com.ss.bytertc.engine;

import X.X1D;
import java.util.Arrays;

/* loaded from: classes33.dex */
public class EffectInfo {
    public String category;
    public String panel;
    public int[] params;
    public String resID;
    public String resPath;
    public int tagNums;
    public String[] tags;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectInfo{resPath=");
        LIZ.append(this.resPath);
        LIZ.append('\'');
        LIZ.append(",resID='");
        LIZ.append(this.resID);
        LIZ.append('\'');
        LIZ.append(", panel='");
        LIZ.append(this.panel);
        LIZ.append('\'');
        LIZ.append(", category='");
        LIZ.append(this.category);
        LIZ.append('\'');
        LIZ.append(", tagNums=");
        LIZ.append(this.tagNums);
        LIZ.append(", params=");
        LIZ.append(Arrays.toString(this.params));
        LIZ.append(", tags=");
        LIZ.append(Arrays.toString(this.tags));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getCategory() {
        return this.category;
    }

    public String getPanel() {
        return this.panel;
    }

    public int[] getParams() {
        return this.params;
    }

    public String getResID() {
        return this.resID;
    }

    public String getResPath() {
        return this.resPath;
    }

    public int getTagNums() {
        return this.tagNums;
    }

    public String[] getTags() {
        return this.tags;
    }

    public EffectInfo(String str, String str2, String str3, int i, int[] iArr, String[] strArr) {
        this.resPath = str;
        this.panel = str2;
        this.category = str3;
        this.tagNums = i;
        this.params = iArr;
        this.tags = strArr;
        this.resID = "";
    }

    public EffectInfo(String str, String str2, String str3, String str4, int i, int[] iArr, String[] strArr) {
        this.resPath = str;
        this.resID = str2;
        this.panel = str3;
        this.category = str4;
        this.tagNums = i;
        this.params = iArr;
        this.tags = strArr;
    }
}
