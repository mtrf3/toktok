package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import X.C165736ev;
import X.HH1;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCAudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCAudioEffectParam implements Serializable, Parcelable {
    public static final C165736ev CREATOR = new Parcelable.Creator<FTCAudioEffectParam>() { // from class: X.6ev
        @Override // android.os.Parcelable.Creator
        public final FTCAudioEffectParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new FTCAudioEffectParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FTCAudioEffectParam[] newArray(int i) {
            return new FTCAudioEffectParam[i];
        }
    };

    @InterfaceC65349Pkn("challenge")
    public AVChallenge challenge;

    @InterfaceC65349Pkn("effectPath")
    public String effectPath;

    @InterfaceC65349Pkn("effectTag")
    public String effectTag;

    @InterfaceC65349Pkn("preprocessResult")
    public byte[] preprocessResult;

    @InterfaceC65349Pkn("seqIn")
    public int seqIn;

    @InterfaceC65349Pkn("seqOut")
    public int seqOut;
    public boolean showErrorToast;

    @InterfaceC65349Pkn("trackIndex")
    public int trackIndex;

    @InterfaceC65349Pkn("trackType")
    public int trackType;

    @InterfaceC65349Pkn("uploadId")
    public String uploadId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FTCAudioEffectParam() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r2
            r8 = r1
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCAudioEffectParam.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getEffectTag() {
        return this.effectTag;
    }

    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    public final int getSeqIn() {
        return this.seqIn;
    }

    public final int getSeqOut() {
        return this.seqOut;
    }

    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FTCAudioEffectParam(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r1 = r11.readString()
            java.lang.String r5 = ""
            if (r1 != 0) goto Le
            r1 = r5
        Le:
            int r2 = r11.readInt()
            int r3 = r11.readInt()
            java.lang.String r4 = r11.readString()
            if (r4 != 0) goto L1d
            r4 = r5
        L1d:
            java.lang.String r0 = r11.readString()
            if (r0 != 0) goto L40
        L23:
            int r6 = r11.readInt()
            int r7 = r11.readInt()
            byte[] r8 = r11.createByteArray()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = com.ss.android.ugc.aweme.shortvideo.AVChallenge.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r9 = r11.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r9 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r9
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L40:
            r5 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCAudioEffectParam.<init>(android.os.Parcel):void");
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setEffectPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectPath = str;
    }

    public final void setEffectTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectTag = str;
    }

    public final void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public final void setSeqIn(int i) {
        this.seqIn = i;
    }

    public final void setSeqOut(int i) {
        this.seqOut = i;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setUploadId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uploadId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.uploadId);
        parcel.writeInt(this.trackType);
        parcel.writeInt(this.trackIndex);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectTag);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeByteArray(this.preprocessResult);
        parcel.writeParcelable(this.challenge, i);
    }

    public FTCAudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge) {
        HH1.LIZ(str, "uploadId", str2, "effectPath", str3, "effectTag");
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
    }

    public /* synthetic */ FTCAudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? "" : str2, (i5 & 16) == 0 ? str3 : "", (i5 & 32) != 0 ? 0 : i3, (i5 & 64) == 0 ? i4 : 0, (i5 & 128) != 0 ? null : bArr, (i5 & 256) == 0 ? aVChallenge : null);
    }
}
