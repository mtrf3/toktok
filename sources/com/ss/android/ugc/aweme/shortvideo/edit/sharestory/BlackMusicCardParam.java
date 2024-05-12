package com.ss.android.ugc.aweme.shortvideo.edit.sharestory;

import X.C82796WeW;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BlackMusicCardParam implements Serializable, Parcelable {
    public static final Parcelable.Creator<BlackMusicCardParam> CREATOR = new C82796WeW();

    @InterfaceC65349Pkn("audio_wave_chroma_max")
    public final float audioChromaMax;

    @InterfaceC65349Pkn("audio_wave_chroma_min")
    public final float audioChromaMin;

    @InterfaceC65349Pkn("audio_wave_lightness_max")
    public final float audioLMax;

    @InterfaceC65349Pkn("audio_wave_lightness_min")
    public final float audioLMin;

    @InterfaceC65349Pkn("audio_wave_merging_tolerance")
    public final float audioTolerance;

    @InterfaceC65349Pkn("background_chroma_max")
    public final float bgChromaMax;

    @InterfaceC65349Pkn("background_chroma_min")
    public final float bgChromaMin;

    @InterfaceC65349Pkn("background_lightness_addition")
    public final float bgLAddition;

    @InterfaceC65349Pkn("background_lightness_max")
    public final float bgLMax;

    @InterfaceC65349Pkn("background_lightness_min")
    public final float bgLMin;

    @InterfaceC65349Pkn("background_merging_tolerance")
    public final float bgTolerance;

    @InterfaceC65349Pkn("text_lightness")
    public final float textL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BlackMusicCardParam() {
        /*
            r15 = this;
            r1 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r14 = 0
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.sharestory.BlackMusicCardParam.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.bgTolerance);
        out.writeFloat(this.bgChromaMin);
        out.writeFloat(this.bgChromaMax);
        out.writeFloat(this.bgLMin);
        out.writeFloat(this.bgLMax);
        out.writeFloat(this.bgLAddition);
        out.writeFloat(this.textL);
        out.writeFloat(this.audioTolerance);
        out.writeFloat(this.audioChromaMin);
        out.writeFloat(this.audioChromaMax);
        out.writeFloat(this.audioLMin);
        out.writeFloat(this.audioLMax);
    }

    public final float getAudioChromaMax() {
        return this.audioChromaMax;
    }

    public final float getAudioChromaMin() {
        return this.audioChromaMin;
    }

    public final float getAudioLMax() {
        return this.audioLMax;
    }

    public final float getAudioLMin() {
        return this.audioLMin;
    }

    public final float getAudioTolerance() {
        return this.audioTolerance;
    }

    public final float getBgChromaMax() {
        return this.bgChromaMax;
    }

    public final float getBgChromaMin() {
        return this.bgChromaMin;
    }

    public final float getBgLAddition() {
        return this.bgLAddition;
    }

    public final float getBgLMax() {
        return this.bgLMax;
    }

    public final float getBgLMin() {
        return this.bgLMin;
    }

    public final float getBgTolerance() {
        return this.bgTolerance;
    }

    public final float getTextL() {
        return this.textL;
    }

    public BlackMusicCardParam(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.bgTolerance = f;
        this.bgChromaMin = f2;
        this.bgChromaMax = f3;
        this.bgLMin = f4;
        this.bgLMax = f5;
        this.bgLAddition = f6;
        this.textL = f7;
        this.audioTolerance = f8;
        this.audioChromaMin = f9;
        this.audioChromaMax = f10;
        this.audioLMin = f11;
        this.audioLMax = f12;
    }

    public /* synthetic */ BlackMusicCardParam(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 8.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.12f : f3, (i & 8) != 0 ? 0.3f : f4, (i & 16) != 0 ? 0.6f : f5, (i & 32) == 0 ? f6 : 8.0f, (i & 64) != 0 ? 0.85f : f7, (i & 128) != 0 ? 50.0f : f8, (i & 256) == 0 ? f9 : 0.0f, (i & 512) != 0 ? 0.1f : f10, (i & 1024) != 0 ? 0.8f : f11, (i & 2048) != 0 ? 1.0f : f12);
    }
}
