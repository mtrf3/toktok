package com.ss.android.ugc.aweme.services.external.ability;

import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VEAudioFileInfo {
    public final Integer bitRate;
    public final Integer channelSize;
    public final Integer duration;
    public final Integer sampleFormat;
    public final Integer sampleRate;

    /* JADX WARN: Multi-variable type inference failed */
    public VEAudioFileInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VEAudioFileInfo copy$default(VEAudioFileInfo vEAudioFileInfo, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = vEAudioFileInfo.sampleRate;
        }
        if ((i & 2) != 0) {
            num2 = vEAudioFileInfo.channelSize;
        }
        if ((i & 4) != 0) {
            num3 = vEAudioFileInfo.sampleFormat;
        }
        if ((i & 8) != 0) {
            num4 = vEAudioFileInfo.duration;
        }
        if ((i & 16) != 0) {
            num5 = vEAudioFileInfo.bitRate;
        }
        return vEAudioFileInfo.copy(num, num2, num3, num4, num5);
    }

    public final VEAudioFileInfo copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        return new VEAudioFileInfo(num, num2, num3, num4, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VEAudioFileInfo)) {
            return false;
        }
        VEAudioFileInfo vEAudioFileInfo = (VEAudioFileInfo) obj;
        return o.LJ(this.sampleRate, vEAudioFileInfo.sampleRate) && o.LJ(this.channelSize, vEAudioFileInfo.channelSize) && o.LJ(this.sampleFormat, vEAudioFileInfo.sampleFormat) && o.LJ(this.duration, vEAudioFileInfo.duration) && o.LJ(this.bitRate, vEAudioFileInfo.bitRate);
    }

    public int hashCode() {
        Integer num = this.sampleRate;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.channelSize;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sampleFormat;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.duration;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.bitRate;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioFileInfo(sampleRate=");
        LIZ.append(this.sampleRate);
        LIZ.append(", channelSize=");
        LIZ.append(this.channelSize);
        LIZ.append(", sampleFormat=");
        LIZ.append(this.sampleFormat);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", bitRate=");
        return s0.LIZJ(LIZ, this.bitRate, ')', LIZ);
    }

    public final Integer getBitRate() {
        return this.bitRate;
    }

    public final Integer getChannelSize() {
        return this.channelSize;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Integer getSampleFormat() {
        return this.sampleFormat;
    }

    public final Integer getSampleRate() {
        return this.sampleRate;
    }

    public VEAudioFileInfo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.sampleRate = num;
        this.channelSize = num2;
        this.sampleFormat = num3;
        this.duration = num4;
        this.bitRate = num5;
    }

    public /* synthetic */ VEAudioFileInfo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) == 0 ? num5 : null);
    }
}
