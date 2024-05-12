package com.ss.android.ugc.playerkit.model;

import X.C0JT;
import X.X1D;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class PlayerThreadPriorityConfig {
    public int[] cleanStory;
    public int cleanStoryValue;
    public int[] prepareStory;
    public int prepareStoryValue;
    public int[] preprepareStory;
    public int preprepareStoryValue;
    public int[] releaseStory;
    public int releaseStoryValue;

    public int getCleanStoryValue() {
        int i = this.cleanStoryValue;
        if (i != -1) {
            return i;
        }
        int storyValue = getStoryValue(this.cleanStory);
        this.cleanStoryValue = storyValue;
        return storyValue;
    }

    public int getPrepareStoryValue() {
        int i = this.prepareStoryValue;
        if (i != -1) {
            return i;
        }
        int storyValue = getStoryValue(this.prepareStory);
        this.prepareStoryValue = storyValue;
        return storyValue;
    }

    public int getPreprepareStoryValue() {
        int i = this.preprepareStoryValue;
        if (i != -1) {
            return i;
        }
        int storyValue = getStoryValue(this.preprepareStory);
        this.preprepareStoryValue = storyValue;
        return storyValue;
    }

    public int getReleaseStoryValue() {
        int i = this.releaseStoryValue;
        if (i != -1) {
            return i;
        }
        int storyValue = getStoryValue(this.releaseStory);
        this.releaseStoryValue = storyValue;
        return storyValue;
    }

    public PlayerThreadPriorityConfig() {
        this.preprepareStory = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        this.prepareStory = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        this.cleanStory = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        this.releaseStory = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        this.preprepareStoryValue = -1;
        this.prepareStoryValue = -1;
        this.cleanStoryValue = -1;
        this.releaseStoryValue = -1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerThreadPriorityConfig{preprepareStory=");
        C0JT.LIZLLL(this.preprepareStory, LIZ, ", prepareStory=");
        C0JT.LIZLLL(this.prepareStory, LIZ, ", cleanStory=");
        C0JT.LIZLLL(this.cleanStory, LIZ, ", releaseStory=");
        LIZ.append(Arrays.toString(this.releaseStory));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    private int getStoryValue(int[] iArr) {
        if (iArr == null || iArr.length != 8) {
            return 0;
        }
        return 0 | iArr[0] | (iArr[1] << 4) | (iArr[2] << 8) | (iArr[3] << 12) | (iArr[4] << 16) | (iArr[5] << 20) | (iArr[6] << 24) | (iArr[7] << 28);
    }

    public PlayerThreadPriorityConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.preprepareStory = iArr;
        this.prepareStory = iArr2;
        this.cleanStory = iArr3;
        this.releaseStory = iArr4;
        this.preprepareStoryValue = -1;
        this.prepareStoryValue = -1;
        this.cleanStoryValue = -1;
        this.releaseStoryValue = -1;
    }
}
