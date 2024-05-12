package com.ss.avframework.livestreamv2.core.interact.livertc;

import X.X1D;
import defpackage.b0;

/* loaded from: classes12.dex */
public class LiveInfo {
    public int mixType;

    /* loaded from: classes12.dex */
    public static class Builder {
        public int mixType;

        public LiveInfo build() {
            return new LiveInfo(this);
        }

        public Builder setMixType(int i) {
            this.mixType = i;
            return this;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveInfo{mixType=");
        return b0.LIZJ(LIZ, this.mixType, '}', LIZ);
    }

    public int getMixType() {
        return this.mixType;
    }

    /* loaded from: classes12.dex */
    public class LiveInfoBuilder {
        public int mixType;

        public LiveInfoBuilder() {
        }
    }

    public LiveInfo(Builder builder) {
        this.mixType = builder.mixType;
    }

    public void setMixType(int i) {
        this.mixType = i;
    }

    public LiveInfo(int i) {
        this.mixType = i;
    }
}
