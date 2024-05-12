package com.ss.android.ugc.aweme.services.edit;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class VideoInfoData {
    public float rusumeVolumeMusic;
    public float rusumeVolumeOrigin;
    public float rusumeVolumeRecord;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoInfoData() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.edit.VideoInfoData.<init>():void");
    }

    public final float getRusumeVolumeMusic() {
        return this.rusumeVolumeMusic;
    }

    public final float getRusumeVolumeOrigin() {
        return this.rusumeVolumeOrigin;
    }

    public final float getRusumeVolumeRecord() {
        return this.rusumeVolumeRecord;
    }

    public final void setRusumeVolumeMusic(float f) {
        this.rusumeVolumeMusic = f;
    }

    public final void setRusumeVolumeOrigin(float f) {
        this.rusumeVolumeOrigin = f;
    }

    public final void setRusumeVolumeRecord(float f) {
        this.rusumeVolumeRecord = f;
    }

    public VideoInfoData(float f, float f2, float f3) {
        this.rusumeVolumeOrigin = f;
        this.rusumeVolumeMusic = f2;
        this.rusumeVolumeRecord = f3;
    }

    public /* synthetic */ VideoInfoData(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }
}
