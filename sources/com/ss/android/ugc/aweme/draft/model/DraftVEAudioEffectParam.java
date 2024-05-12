package com.ss.android.ugc.aweme.draft.model;

import X.C1NE;
import X.InterfaceC36436ERs;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DraftVEAudioEffectParam {

    @InterfaceC65349Pkn("challenge")
    public AVChallenge challenge;

    @InterfaceC65349Pkn("challenges")
    public List<AVChallenge> challenges;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("effectPath")
    public String effectPath;

    @InterfaceC65349Pkn("effectTag")
    public String effectTag;

    @InterfaceC65349Pkn("seqIn")
    public int seqIn;

    @InterfaceC65349Pkn("seqOut")
    public int seqOut;

    @InterfaceC65349Pkn("trackIndex")
    public int trackIndex;

    @InterfaceC65349Pkn("trackType")
    public int trackType;

    @InterfaceC65349Pkn("uploadId")
    public final String uploadId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DraftVEAudioEffectParam() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam.<init>():void");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.trackType * 31;
        String str = this.uploadId;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((i3 + i) * 31) + this.trackIndex) * 31;
        String str2 = this.effectPath;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.effectTag;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + this.seqIn) * 31) + this.seqOut;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftVEAudioEffectParam(uploadId=");
        LIZ.append(this.uploadId);
        LIZ.append(", trackType=");
        LIZ.append(this.trackType);
        LIZ.append(", trackIndex=");
        LIZ.append(this.trackIndex);
        LIZ.append(", effectPath=");
        LIZ.append(this.effectPath);
        LIZ.append(", effectTag=");
        LIZ.append(this.effectTag);
        LIZ.append(", seqIn=");
        LIZ.append(this.seqIn);
        LIZ.append(", seqOut=");
        LIZ.append(this.seqOut);
        LIZ.append(", challenge=");
        LIZ.append(this.challenge);
        LIZ.append(", challenges=");
        return C1NE.LIZIZ(LIZ, this.challenges, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        AVChallenge aVChallenge;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(DraftVEAudioEffectParam.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam");
        DraftVEAudioEffectParam draftVEAudioEffectParam = (DraftVEAudioEffectParam) obj;
        if (this.trackType == draftVEAudioEffectParam.trackType && o.LJ(this.uploadId, draftVEAudioEffectParam.uploadId) && this.trackIndex == draftVEAudioEffectParam.trackIndex && ujb.o.LJJJJIZL(this.effectPath, draftVEAudioEffectParam.effectPath, false) && ujb.o.LJJJJIZL(this.effectTag, draftVEAudioEffectParam.effectTag, false) && this.seqIn == draftVEAudioEffectParam.seqIn && this.seqOut == draftVEAudioEffectParam.seqOut) {
            AVChallenge aVChallenge2 = this.challenge;
            if (aVChallenge2 != null && (aVChallenge = draftVEAudioEffectParam.challenge) != null && o.LJ(aVChallenge2, aVChallenge)) {
                return true;
            }
            if (this.challenge == null && draftVEAudioEffectParam.challenge == null) {
                return true;
            }
        }
        return false;
    }

    public DraftVEAudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, AVChallenge aVChallenge, List<AVChallenge> challenges) {
        o.LJIIIZ(challenges, "challenges");
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.challenge = aVChallenge;
        this.challenges = challenges;
    }

    public /* synthetic */ DraftVEAudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, AVChallenge aVChallenge, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? "" : str2, (i5 & 16) == 0 ? str3 : "", (i5 & 32) != 0 ? 0 : i3, (i5 & 64) == 0 ? i4 : 0, (i5 & 128) != 0 ? null : aVChallenge, (i5 & 256) != 0 ? new ArrayList() : list);
    }
}
