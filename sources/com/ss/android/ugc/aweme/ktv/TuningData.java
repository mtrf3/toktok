package com.ss.android.ugc.aweme.ktv;

import X.F9E;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TuningData extends F9E implements Serializable {
    public List<Integer> audioDurations;
    public List<String> audioPaths;
    public int audioTrackStartTimeOffset;
    public int delayByUser;
    public ArrayList<Boolean> globalWiredHeadset;
    public boolean isDuetSing;
    public KtvAudioParam originTrack;
    public String originTrackPath;
    public boolean processTuningSuccess;
    public Integer recordBGMDelay;
    public ReverberationData reverberation;
    public KtvAudioParam subTrack;
    public String subTrackPath;
    public String tuningAudioOutputPath;
    public KtvAudioParam tuningAudioTrack;
    public String tuningMidiPath;
    public ReverberationData tuningReverberation;
    public boolean useRecommendVolume;
    public int videoDuration;
    public KtvAudioParam voiceTrack;
    public boolean wiredHeadset;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuningData() {
        /*
            r24 = this;
            r1 = 0
            r2 = 0
            r22 = 2097151(0x1fffff, float:2.938734E-39)
            r0 = r24
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r2
            r11 = r1
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r1
            r16 = r1
            r17 = r2
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r2
            r23 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ktv.TuningData.<init>():void");
    }

    public static /* synthetic */ TuningData copy$default(TuningData tuningData, KtvAudioParam ktvAudioParam, boolean z, Integer num, List list, List list2, KtvAudioParam ktvAudioParam2, String str, KtvAudioParam ktvAudioParam3, String str2, int i, ReverberationData reverberationData, boolean z2, int i2, boolean z3, String str3, ArrayList arrayList, boolean z4, KtvAudioParam ktvAudioParam4, String str4, ReverberationData reverberationData2, int i3, int i4, Object obj) {
        boolean z5 = z;
        KtvAudioParam ktvAudioParam5 = ktvAudioParam;
        Integer num2 = num;
        List list3 = list;
        List list4 = list2;
        KtvAudioParam ktvAudioParam6 = ktvAudioParam2;
        boolean z6 = z3;
        int i5 = i2;
        KtvAudioParam ktvAudioParam7 = ktvAudioParam3;
        String str5 = str;
        String str6 = str2;
        int i6 = i;
        ReverberationData reverberationData3 = reverberationData;
        boolean z7 = z2;
        int i7 = i3;
        ArrayList arrayList2 = arrayList;
        boolean z8 = z4;
        String str7 = str3;
        ReverberationData reverberationData4 = reverberationData2;
        KtvAudioParam ktvAudioParam8 = ktvAudioParam4;
        String str8 = str4;
        if ((i4 & 1) != 0) {
            ktvAudioParam5 = tuningData.voiceTrack;
        }
        if ((i4 & 2) != 0) {
            z5 = tuningData.wiredHeadset;
        }
        if ((i4 & 4) != 0) {
            num2 = tuningData.recordBGMDelay;
        }
        if ((i4 & 8) != 0) {
            list3 = tuningData.audioPaths;
        }
        if ((i4 & 16) != 0) {
            list4 = tuningData.audioDurations;
        }
        if ((i4 & 32) != 0) {
            ktvAudioParam6 = tuningData.originTrack;
        }
        if ((i4 & 64) != 0) {
            str5 = tuningData.originTrackPath;
        }
        if ((i4 & 128) != 0) {
            ktvAudioParam7 = tuningData.subTrack;
        }
        if ((i4 & 256) != 0) {
            str6 = tuningData.subTrackPath;
        }
        if ((i4 & 512) != 0) {
            i6 = tuningData.videoDuration;
        }
        if ((i4 & 1024) != 0) {
            reverberationData3 = tuningData.reverberation;
        }
        if ((i4 & 2048) != 0) {
            z7 = tuningData.useRecommendVolume;
        }
        if ((i4 & 4096) != 0) {
            i5 = tuningData.delayByUser;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            z6 = tuningData.isDuetSing;
        }
        if ((i4 & 16384) != 0) {
            str7 = tuningData.tuningMidiPath;
        }
        if ((32768 & i4) != 0) {
            arrayList2 = tuningData.globalWiredHeadset;
        }
        if ((65536 & i4) != 0) {
            z8 = tuningData.processTuningSuccess;
        }
        if ((131072 & i4) != 0) {
            ktvAudioParam8 = tuningData.tuningAudioTrack;
        }
        if ((262144 & i4) != 0) {
            str8 = tuningData.tuningAudioOutputPath;
        }
        if ((524288 & i4) != 0) {
            reverberationData4 = tuningData.tuningReverberation;
        }
        if ((i4 & 1048576) != 0) {
            i7 = tuningData.audioTrackStartTimeOffset;
        }
        String str9 = str6;
        int i8 = i6;
        ReverberationData reverberationData5 = reverberationData3;
        boolean z9 = z7;
        int i9 = i5;
        return tuningData.copy(ktvAudioParam5, z5, num2, list3, list4, ktvAudioParam6, str5, ktvAudioParam7, str9, i8, reverberationData5, z9, i9, z6, str7, arrayList2, z8, ktvAudioParam8, str8, reverberationData4, i7);
    }

    public final TuningData copy(KtvAudioParam ktvAudioParam, boolean z, Integer num, List<String> audioPaths, List<Integer> audioDurations, KtvAudioParam ktvAudioParam2, String str, KtvAudioParam ktvAudioParam3, String str2, int i, ReverberationData reverberationData, boolean z2, int i2, boolean z3, String str3, ArrayList<Boolean> globalWiredHeadset, boolean z4, KtvAudioParam ktvAudioParam4, String str4, ReverberationData reverberationData2, int i3) {
        o.LJIIIZ(audioPaths, "audioPaths");
        o.LJIIIZ(audioDurations, "audioDurations");
        o.LJIIIZ(globalWiredHeadset, "globalWiredHeadset");
        return new TuningData(ktvAudioParam, z, num, audioPaths, audioDurations, ktvAudioParam2, str, ktvAudioParam3, str2, i, reverberationData, z2, i2, z3, str3, globalWiredHeadset, z4, ktvAudioParam4, str4, reverberationData2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.voiceTrack, Boolean.valueOf(this.wiredHeadset), this.recordBGMDelay, this.audioPaths, this.audioDurations, this.originTrack, this.originTrackPath, this.subTrack, this.subTrackPath, Integer.valueOf(this.videoDuration), this.reverberation, Boolean.valueOf(this.useRecommendVolume), Integer.valueOf(this.delayByUser), Boolean.valueOf(this.isDuetSing), this.tuningMidiPath, this.globalWiredHeadset, Boolean.valueOf(this.processTuningSuccess), this.tuningAudioTrack, this.tuningAudioOutputPath, this.tuningReverberation, Integer.valueOf(this.audioTrackStartTimeOffset)};
    }

    public final List<Integer> getAudioDurations() {
        return this.audioDurations;
    }

    public final List<String> getAudioPaths() {
        return this.audioPaths;
    }

    public final int getAudioTrackStartTimeOffset() {
        return this.audioTrackStartTimeOffset;
    }

    public final int getDelayByUser() {
        return this.delayByUser;
    }

    public final ArrayList<Boolean> getGlobalWiredHeadset() {
        return this.globalWiredHeadset;
    }

    public final KtvAudioParam getOriginTrack() {
        return this.originTrack;
    }

    public final String getOriginTrackPath() {
        return this.originTrackPath;
    }

    public final boolean getProcessTuningSuccess() {
        return this.processTuningSuccess;
    }

    public final Integer getRecordBGMDelay() {
        return this.recordBGMDelay;
    }

    public final ReverberationData getReverberation() {
        return this.reverberation;
    }

    public final KtvAudioParam getSubTrack() {
        return this.subTrack;
    }

    public final String getSubTrackPath() {
        return this.subTrackPath;
    }

    public final String getTuningAudioOutputPath() {
        return this.tuningAudioOutputPath;
    }

    public final KtvAudioParam getTuningAudioTrack() {
        return this.tuningAudioTrack;
    }

    public final String getTuningMidiPath() {
        return this.tuningMidiPath;
    }

    public final ReverberationData getTuningReverberation() {
        return this.tuningReverberation;
    }

    public final boolean getUseRecommendVolume() {
        return this.useRecommendVolume;
    }

    public final int getVideoDuration() {
        return this.videoDuration;
    }

    public final KtvAudioParam getVoiceTrack() {
        return this.voiceTrack;
    }

    public final boolean getWiredHeadset() {
        return this.wiredHeadset;
    }

    public final boolean isDuetSing() {
        return this.isDuetSing;
    }

    public final void setAudioDurations(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.audioDurations = list;
    }

    public final void setAudioPaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.audioPaths = list;
    }

    public final void setAudioTrackStartTimeOffset(int i) {
        this.audioTrackStartTimeOffset = i;
    }

    public final void setDelayByUser(int i) {
        this.delayByUser = i;
    }

    public final void setDuetSing(boolean z) {
        this.isDuetSing = z;
    }

    public final void setGlobalWiredHeadset(ArrayList<Boolean> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.globalWiredHeadset = arrayList;
    }

    public final void setOriginTrack(KtvAudioParam ktvAudioParam) {
        this.originTrack = ktvAudioParam;
    }

    public final void setOriginTrackPath(String str) {
        this.originTrackPath = str;
    }

    public final void setProcessTuningSuccess(boolean z) {
        this.processTuningSuccess = z;
    }

    public final void setRecordBGMDelay(Integer num) {
        this.recordBGMDelay = num;
    }

    public final void setReverberation(ReverberationData reverberationData) {
        this.reverberation = reverberationData;
    }

    public final void setSubTrack(KtvAudioParam ktvAudioParam) {
        this.subTrack = ktvAudioParam;
    }

    public final void setSubTrackPath(String str) {
        this.subTrackPath = str;
    }

    public final void setTuningAudioOutputPath(String str) {
        this.tuningAudioOutputPath = str;
    }

    public final void setTuningAudioTrack(KtvAudioParam ktvAudioParam) {
        this.tuningAudioTrack = ktvAudioParam;
    }

    public final void setTuningMidiPath(String str) {
        this.tuningMidiPath = str;
    }

    public final void setTuningReverberation(ReverberationData reverberationData) {
        this.tuningReverberation = reverberationData;
    }

    public final void setUseRecommendVolume(boolean z) {
        this.useRecommendVolume = z;
    }

    public final void setVideoDuration(int i) {
        this.videoDuration = i;
    }

    public final void setVoiceTrack(KtvAudioParam ktvAudioParam) {
        this.voiceTrack = ktvAudioParam;
    }

    public final void setWiredHeadset(boolean z) {
        this.wiredHeadset = z;
    }

    public TuningData(KtvAudioParam ktvAudioParam, boolean z, Integer num, List<String> audioPaths, List<Integer> audioDurations, KtvAudioParam ktvAudioParam2, String str, KtvAudioParam ktvAudioParam3, String str2, int i, ReverberationData reverberationData, boolean z2, int i2, boolean z3, String str3, ArrayList<Boolean> globalWiredHeadset, boolean z4, KtvAudioParam ktvAudioParam4, String str4, ReverberationData reverberationData2, int i3) {
        o.LJIIIZ(audioPaths, "audioPaths");
        o.LJIIIZ(audioDurations, "audioDurations");
        o.LJIIIZ(globalWiredHeadset, "globalWiredHeadset");
        this.voiceTrack = ktvAudioParam;
        this.wiredHeadset = z;
        this.recordBGMDelay = num;
        this.audioPaths = audioPaths;
        this.audioDurations = audioDurations;
        this.originTrack = ktvAudioParam2;
        this.originTrackPath = str;
        this.subTrack = ktvAudioParam3;
        this.subTrackPath = str2;
        this.videoDuration = i;
        this.reverberation = reverberationData;
        this.useRecommendVolume = z2;
        this.delayByUser = i2;
        this.isDuetSing = z3;
        this.tuningMidiPath = str3;
        this.globalWiredHeadset = globalWiredHeadset;
        this.processTuningSuccess = z4;
        this.tuningAudioTrack = ktvAudioParam4;
        this.tuningAudioOutputPath = str4;
        this.tuningReverberation = reverberationData2;
        this.audioTrackStartTimeOffset = i3;
    }

    public /* synthetic */ TuningData(KtvAudioParam ktvAudioParam, boolean z, Integer num, List list, List list2, KtvAudioParam ktvAudioParam2, String str, KtvAudioParam ktvAudioParam3, String str2, int i, ReverberationData reverberationData, boolean z2, int i2, boolean z3, String str3, ArrayList arrayList, boolean z4, KtvAudioParam ktvAudioParam4, String str4, ReverberationData reverberationData2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : ktvAudioParam, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? new ArrayList() : list, (i4 & 16) != 0 ? new ArrayList() : list2, (i4 & 32) != 0 ? null : ktvAudioParam2, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? null : ktvAudioParam3, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) != 0 ? null : reverberationData, (i4 & 2048) != 0 ? true : z2, (i4 & 4096) != 0 ? 0 : i2, (i4 & FileUtils.BUFFER_SIZE) != 0 ? false : z3, (i4 & 16384) != 0 ? null : str3, (32768 & i4) != 0 ? new ArrayList() : arrayList, (65536 & i4) != 0 ? false : z4, (131072 & i4) != 0 ? null : ktvAudioParam4, (262144 & i4) != 0 ? null : str4, (524288 & i4) != 0 ? null : reverberationData2, (i4 & 1048576) != 0 ? 0 : i3);
    }
}
