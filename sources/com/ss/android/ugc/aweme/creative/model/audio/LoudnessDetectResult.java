package com.ss.android.ugc.aweme.creative.model.audio;

import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class LoudnessDetectResult implements Parcelable {
    public static final Parcelable.Creator<LoudnessDetectResult> CREATOR = new Parcelable.Creator<LoudnessDetectResult>() { // from class: X.5XX
        @Override // android.os.Parcelable.Creator
        public final LoudnessDetectResult createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new LoudnessDetectResult(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LoudnessDetectResult[] newArray(int i) {
            return new LoudnessDetectResult[i];
        }
    };

    @InterfaceC36436ERs
    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_path")
    public String audioPath;

    @InterfaceC65349Pkn("avg_loudness")
    public double avgLoudness;

    @InterfaceC65349Pkn("peak_loudness")
    public double peakLoudness;

    @InterfaceC65349Pkn("result")
    public int result;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LoudnessDetectResult() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 15
            r0 = r9
            r4 = r2
            r8 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.result);
        out.writeDouble(this.avgLoudness);
        out.writeDouble(this.peakLoudness);
        out.writeString(this.audioPath);
    }

    public LoudnessDetectResult(int i, double d, double d2, String audioPath) {
        o.LJIIIZ(audioPath, "audioPath");
        this.result = i;
        this.avgLoudness = d;
        this.peakLoudness = d2;
        this.audioPath = audioPath;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoudnessDetectResult(int r8, double r9, double r11, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r6 = r13
            r1 = r8
            r2 = r9
            r0 = r14 & 1
            if (r0 == 0) goto L8
            r1 = -1
        L8:
            r0 = r14 & 2
            r4 = 0
            if (r0 == 0) goto L10
            r2 = 0
        L10:
            r0 = r14 & 4
            if (r0 == 0) goto L1f
        L14:
            r0 = r14 & 8
            if (r0 == 0) goto L1a
            java.lang.String r6 = ""
        L1a:
            r0 = r7
            r0.<init>(r1, r2, r4, r6)
            return
        L1f:
            r4 = r11
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult.<init>(int, double, double, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
