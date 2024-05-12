package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import X.C165746ew;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioEffectParam implements IAudioEffectParam, Serializable, Parcelable {
    public static final C165746ew CREATOR = new Parcelable.Creator<AudioEffectParam>() { // from class: X.6ew
        @Override // android.os.Parcelable.Creator
        public final AudioEffectParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AudioEffectParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioEffectParam[] newArray(int i) {
            return new AudioEffectParam[i];
        }
    };

    @InterfaceC65349Pkn("challenge")
    public AVChallenge challenge;

    @InterfaceC65349Pkn("challenges")
    public List<AVChallenge> challenges;

    @InterfaceC65349Pkn("effectPath")
    public String effectPath;

    @InterfaceC65349Pkn("effectTag")
    public String effectTag;
    public String panel;

    @InterfaceC65349Pkn("preprocessResult")
    public byte[] preprocessResult;
    public String resId;

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
    public AudioEffectParam() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r2
            r8 = r1
            r9 = r1
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam.<init>():void");
    }

    public static /* synthetic */ void getChallenge$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public String getEffectPath() {
        return this.effectPath;
    }

    public String getEffectTag() {
        return this.effectTag;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public String getPanel() {
        return this.panel;
    }

    public byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public String getResId() {
        return this.resId;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public int getSeqIn() {
        return this.seqIn;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public int getSeqOut() {
        return this.seqOut;
    }

    public boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public int getTrackIndex() {
        return this.trackIndex;
    }

    public int getTrackType() {
        return this.trackType;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioEffectParam(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r2 = r13.readString()
            java.lang.String r6 = ""
            if (r2 != 0) goto Le
            r2 = r6
        Le:
            int r3 = r13.readInt()
            int r4 = r13.readInt()
            java.lang.String r5 = r13.readString()
            if (r5 != 0) goto L1d
            r5 = r6
        L1d:
            java.lang.String r0 = r13.readString()
            if (r0 != 0) goto L53
        L23:
            int r7 = r13.readInt()
            int r8 = r13.readInt()
            byte[] r9 = r13.createByteArray()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = com.ss.android.ugc.aweme.shortvideo.AVChallenge.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r10 = r13.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r10 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r10
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = com.ss.android.ugc.aweme.shortvideo.AVChallenge.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r1 = r13.readArrayList(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.util.List r11 = X.C65777Prh.LIZIZ(r1)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L53:
            r6 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam.<init>(android.os.Parcel):void");
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setChallenges(List<AVChallenge> list) {
        o.LJIIIZ(list, "<set-?>");
        this.challenges = list;
    }

    public void setEffectPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectPath = str;
    }

    public void setEffectTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectTag = str;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public void setResId(String str) {
        this.resId = str;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public void setSeqIn(int i) {
        this.seqIn = i;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public void setSeqOut(int i) {
        this.seqOut = i;
    }

    public void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public void setTrackType(int i) {
        this.trackType = i;
    }

    public void setUploadId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uploadId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(getUploadId());
        parcel.writeInt(getTrackType());
        parcel.writeInt(getTrackIndex());
        parcel.writeString(getEffectPath());
        parcel.writeString(getEffectTag());
        parcel.writeInt(getSeqIn());
        parcel.writeInt(getSeqOut());
        parcel.writeByteArray(getPreprocessResult());
        parcel.writeParcelable(this.challenge, i);
        parcel.writeList(this.challenges);
    }

    public AudioEffectParam(String uploadId, int i, int i2, String effectPath, String effectTag, int i3, int i4, byte[] bArr, AVChallenge aVChallenge, List<AVChallenge> challenges) {
        o.LJIIIZ(uploadId, "uploadId");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(effectTag, "effectTag");
        o.LJIIIZ(challenges, "challenges");
        this.uploadId = uploadId;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = effectPath;
        this.effectTag = effectTag;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
        this.challenges = challenges;
    }

    public /* synthetic */ AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? "" : str2, (i5 & 16) == 0 ? str3 : "", (i5 & 32) != 0 ? 0 : i3, (i5 & 64) == 0 ? i4 : 0, (i5 & 128) != 0 ? null : bArr, (i5 & 256) == 0 ? aVChallenge : null, (i5 & 512) != 0 ? new ArrayList() : list);
    }
}
