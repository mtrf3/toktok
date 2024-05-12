package com.ss.android.ugc.playerkit.model;

import X.X1D;
import defpackage.b0;

/* loaded from: classes9.dex */
public class PlayerSessionThreadPriorityConfig {
    public int prepareStory;
    public int preprepareStory;
    public int recycleStory;
    public int releaseStory;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerSessionThreadPriorityConfig{preprepareStory=");
        LIZ.append(this.preprepareStory);
        LIZ.append(", prepareStory=");
        LIZ.append(this.prepareStory);
        LIZ.append(", recycleStory=");
        LIZ.append(this.recycleStory);
        LIZ.append(", releaseStory=");
        return b0.LIZJ(LIZ, this.releaseStory, '}', LIZ);
    }

    public PlayerSessionThreadPriorityConfig() {
    }

    public PlayerSessionThreadPriorityConfig(int i, int i2, int i3, int i4) {
        this.preprepareStory = i;
        this.prepareStory = i2;
        this.recycleStory = i3;
        this.releaseStory = i4;
    }
}
