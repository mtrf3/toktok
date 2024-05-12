package com.ss.android.ugc.aweme.creative.model;

import X.C46137I8v;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReuseSoundAndEffectModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ReuseSoundAndEffectModel> CREATOR = new C46137I8v();

    @GPV
    public String effectId;

    @GPV
    public boolean isFromReuseMusic;

    @GPV
    public boolean isFromReuseProp;

    @GPV
    public boolean isMusicFromDiscoveryPage;

    @GPV
    public int musicEndTime;

    @GPV
    public int musicStartTime;

    @GPV
    public String soundId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReuseSoundAndEffectModel() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.soundId);
        out.writeString(this.effectId);
        out.writeInt(this.musicStartTime);
        out.writeInt(this.musicEndTime);
        out.writeInt(this.isFromReuseMusic ? 1 : 0);
        out.writeInt(this.isFromReuseProp ? 1 : 0);
        out.writeInt(this.isMusicFromDiscoveryPage ? 1 : 0);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final int getMusicEndTime() {
        return this.musicEndTime;
    }

    public final int getMusicStartTime() {
        return this.musicStartTime;
    }

    public final String getSoundId() {
        return this.soundId;
    }

    public final boolean isFromReuseMusic() {
        return this.isFromReuseMusic;
    }

    public final boolean isFromReuseProp() {
        return this.isFromReuseProp;
    }

    public final boolean isMusicFromDiscoveryPage() {
        return this.isMusicFromDiscoveryPage;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setFromReuseMusic(boolean z) {
        this.isFromReuseMusic = z;
    }

    public final void setFromReuseProp(boolean z) {
        this.isFromReuseProp = z;
    }

    public final void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public final void setMusicFromDiscoveryPage(boolean z) {
        this.isMusicFromDiscoveryPage = z;
    }

    public final void setMusicStartTime(int i) {
        this.musicStartTime = i;
    }

    public final void setSoundId(String str) {
        this.soundId = str;
    }

    public ReuseSoundAndEffectModel(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.soundId = str;
        this.effectId = str2;
        this.musicStartTime = i;
        this.musicEndTime = i2;
        this.isFromReuseMusic = z;
        this.isFromReuseProp = z2;
        this.isMusicFromDiscoveryPage = z3;
    }

    public /* synthetic */ ReuseSoundAndEffectModel(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) == 0 ? str2 : null, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }
}
