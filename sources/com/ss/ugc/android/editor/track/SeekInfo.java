package com.ss.ugc.android.editor.track;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class SeekInfo extends F9E {
    public final boolean autoPlay;
    public final boolean isEnd;
    public final boolean isFromUser;
    public final long position;
    public final float seekDurationSpeed;
    public final int seekFlag;
    public final float seekPxSpeed;

    public static /* synthetic */ SeekInfo copy$default(SeekInfo seekInfo, long j, boolean z, int i, float f, float f2, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = seekInfo.position;
        }
        if ((i2 & 2) != 0) {
            z = seekInfo.autoPlay;
        }
        if ((i2 & 4) != 0) {
            i = seekInfo.seekFlag;
        }
        if ((i2 & 8) != 0) {
            f = seekInfo.seekPxSpeed;
        }
        if ((i2 & 16) != 0) {
            f2 = seekInfo.seekDurationSpeed;
        }
        if ((i2 & 32) != 0) {
            z2 = seekInfo.isFromUser;
        }
        if ((i2 & 64) != 0) {
            z3 = seekInfo.isEnd;
        }
        return seekInfo.copy(j, z, i, f, f2, z2, z3);
    }

    public final SeekInfo copy(long j, boolean z, int i, float f, float f2, boolean z2, boolean z3) {
        return new SeekInfo(j, z, i, f, f2, z2, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.position), Boolean.valueOf(this.autoPlay), Integer.valueOf(this.seekFlag), Float.valueOf(this.seekPxSpeed), Float.valueOf(this.seekDurationSpeed), Boolean.valueOf(this.isFromUser), Boolean.valueOf(this.isEnd)};
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final long getPosition() {
        return this.position;
    }

    public final float getSeekDurationSpeed() {
        return this.seekDurationSpeed;
    }

    public final int getSeekFlag() {
        return this.seekFlag;
    }

    public final float getSeekPxSpeed() {
        return this.seekPxSpeed;
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final boolean isFromUser() {
        return this.isFromUser;
    }

    public SeekInfo(long j, boolean z, int i, float f, float f2, boolean z2, boolean z3) {
        this.position = j;
        this.autoPlay = z;
        this.seekFlag = i;
        this.seekPxSpeed = f;
        this.seekDurationSpeed = f2;
        this.isFromUser = z2;
        this.isEnd = z3;
    }

    public /* synthetic */ SeekInfo(long j, boolean z, int i, float f, float f2, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? 0.0f : f2, (i2 & 32) != 0 ? true : z2, (i2 & 64) != 0 ? false : z3);
    }
}
