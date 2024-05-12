package com.ss.android.ugc.aweme.ktv;

import X.C44687HgJ;
import X.F9E;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KtvRecordParam extends F9E implements Serializable {
    public boolean adjustedStickerPosition;
    public List<Integer> audioDurations;
    public List<String> audioPaths;
    public int auditionDuration;
    public String author;
    public SimpleEffect authorEffect;
    public UrlModel coverLarge;
    public UrlModel coverMedium;
    public CustomSegmentInfo customSegmentInfo;
    public int duration;
    public String enterMethod;
    public SimpleEffect fontEffect;
    public int fullSongShootDuration;
    public String id;
    public boolean isFollowSing;
    public boolean isFull;
    public boolean isPgc;
    public boolean isQuickShoot;
    public SimpleEffect lyricEffect;
    public TreeMap<Integer, Object> lyricLines;
    public String lyricPath;
    public int lyricStartTime;
    public int lyricType;
    public UrlModel lyricUrl;
    public String musicId;
    public String musicSelectedFrom;
    public ArrayList<Integer> mvFileDurations;
    public ArrayList<String> mvFilePaths;
    public ArrayList<String> mvFileTypes;
    public String mvImageEffectPath;
    public int mvMode;
    public String mvVideoEffectPath;
    public SimpleEffect mvVideoResEffect;
    public boolean needFetchMusic;
    public KtvAudioParam originTrack;
    public String originTrackPath;
    public int recordMode;
    public int shootDuration;
    public String shootPageEnterMethod;
    public String shootWay;
    public boolean showAuthor;
    public KtvAudioParam subTrack;
    public String subTrackPath;
    public String title;
    public TuningData tuningData;
    public int videoDuration;
    public KtvAudioParam voiceTrack;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KtvRecordParam() {
        /*
            r51 = this;
            r1 = 0
            r3 = 0
            r48 = -1
            r49 = 32767(0x7fff, float:4.5916E-41)
            r0 = r51
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r3
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r3
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r3
            r23 = r3
            r24 = r1
            r25 = r1
            r26 = r3
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r3
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r3
            r38 = r3
            r39 = r1
            r40 = r1
            r41 = r1
            r42 = r3
            r43 = r1
            r44 = r3
            r45 = r3
            r46 = r3
            r47 = r1
            r50 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ktv.KtvRecordParam.<init>():void");
    }

    public static /* synthetic */ KtvRecordParam copy$default(KtvRecordParam ktvRecordParam, String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, List list, List list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, int i5, UrlModel urlModel, TreeMap treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z2, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i9, boolean z3, String str11, String str12, String str13, boolean z4, CustomSegmentInfo customSegmentInfo, boolean z5, boolean z6, boolean z7, TuningData tuningData, int i10, int i11, Object obj) {
        String str14 = str6;
        String str15 = str7;
        KtvAudioParam ktvAudioParam4 = ktvAudioParam2;
        List list3 = list2;
        List list4 = list;
        KtvAudioParam ktvAudioParam5 = ktvAudioParam3;
        KtvAudioParam ktvAudioParam6 = ktvAudioParam;
        int i12 = i;
        String str16 = str2;
        String str17 = str;
        boolean z8 = z;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        boolean z9 = z7;
        boolean z10 = z5;
        CustomSegmentInfo customSegmentInfo2 = customSegmentInfo;
        String str21 = str12;
        String str22 = str11;
        ArrayList arrayList4 = arrayList3;
        TuningData tuningData2 = tuningData;
        ArrayList arrayList5 = arrayList2;
        SimpleEffect simpleEffect5 = simpleEffect4;
        int i13 = i8;
        String str23 = str13;
        TreeMap treeMap2 = treeMap;
        UrlModel urlModel4 = urlModel;
        int i14 = i5;
        int i15 = i9;
        int i16 = i4;
        int i17 = i2;
        int i18 = i3;
        String str24 = str8;
        int i19 = i6;
        boolean z11 = z6;
        int i20 = i7;
        ArrayList arrayList6 = arrayList;
        UrlModel urlModel5 = urlModel2;
        UrlModel urlModel6 = urlModel3;
        boolean z12 = z2;
        boolean z13 = z3;
        SimpleEffect simpleEffect6 = simpleEffect;
        SimpleEffect simpleEffect7 = simpleEffect2;
        SimpleEffect simpleEffect8 = simpleEffect3;
        boolean z14 = z4;
        String str25 = str10;
        String str26 = str9;
        if ((i10 & 1) != 0) {
            str17 = ktvRecordParam.id;
        }
        if ((i10 & 2) != 0) {
            str16 = ktvRecordParam.musicId;
        }
        if ((i10 & 4) != 0) {
            z8 = ktvRecordParam.needFetchMusic;
        }
        if ((i10 & 8) != 0) {
            str18 = ktvRecordParam.musicSelectedFrom;
        }
        if ((i10 & 16) != 0) {
            str19 = ktvRecordParam.title;
        }
        if ((i10 & 32) != 0) {
            str20 = ktvRecordParam.author;
        }
        if ((i10 & 64) != 0) {
            i12 = ktvRecordParam.recordMode;
        }
        if ((i10 & 128) != 0) {
            ktvAudioParam6 = ktvRecordParam.voiceTrack;
        }
        if ((i10 & 256) != 0) {
            list4 = ktvRecordParam.audioPaths;
        }
        if ((i10 & 512) != 0) {
            list3 = ktvRecordParam.audioDurations;
        }
        if ((i10 & 1024) != 0) {
            ktvAudioParam4 = ktvRecordParam.originTrack;
        }
        if ((i10 & 2048) != 0) {
            str14 = ktvRecordParam.originTrackPath;
        }
        if ((i10 & 4096) != 0) {
            ktvAudioParam5 = ktvRecordParam.subTrack;
        }
        if ((i10 & FileUtils.BUFFER_SIZE) != 0) {
            str15 = ktvRecordParam.subTrackPath;
        }
        if ((i10 & 16384) != 0) {
            i17 = ktvRecordParam.duration;
        }
        if ((32768 & i10) != 0) {
            i18 = ktvRecordParam.shootDuration;
        }
        if ((65536 & i10) != 0) {
            i16 = ktvRecordParam.auditionDuration;
        }
        if ((131072 & i10) != 0) {
            i14 = ktvRecordParam.fullSongShootDuration;
        }
        if ((262144 & i10) != 0) {
            urlModel4 = ktvRecordParam.lyricUrl;
        }
        if ((524288 & i10) != 0) {
            treeMap2 = ktvRecordParam.lyricLines;
        }
        if ((1048576 & i10) != 0) {
            str24 = ktvRecordParam.lyricPath;
        }
        if ((2097152 & i10) != 0) {
            i19 = ktvRecordParam.lyricType;
        }
        if ((4194304 & i10) != 0) {
            i20 = ktvRecordParam.lyricStartTime;
        }
        if ((8388608 & i10) != 0) {
            urlModel5 = ktvRecordParam.coverMedium;
        }
        if ((16777216 & i10) != 0) {
            urlModel6 = ktvRecordParam.coverLarge;
        }
        if ((33554432 & i10) != 0) {
            z12 = ktvRecordParam.showAuthor;
        }
        if ((67108864 & i10) != 0) {
            simpleEffect6 = ktvRecordParam.lyricEffect;
        }
        if ((134217728 & i10) != 0) {
            simpleEffect7 = ktvRecordParam.fontEffect;
        }
        if ((268435456 & i10) != 0) {
            simpleEffect8 = ktvRecordParam.authorEffect;
        }
        if ((536870912 & i10) != 0) {
            str26 = ktvRecordParam.mvVideoEffectPath;
        }
        if ((1073741824 & i10) != 0) {
            str25 = ktvRecordParam.mvImageEffectPath;
        }
        if ((i10 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            i13 = ktvRecordParam.mvMode;
        }
        if ((i11 & 1) != 0) {
            simpleEffect5 = ktvRecordParam.mvVideoResEffect;
        }
        if ((i11 & 2) != 0) {
            arrayList6 = ktvRecordParam.mvFilePaths;
        }
        if ((i11 & 4) != 0) {
            arrayList5 = ktvRecordParam.mvFileTypes;
        }
        if ((i11 & 8) != 0) {
            arrayList4 = ktvRecordParam.mvFileDurations;
        }
        if ((i11 & 16) != 0) {
            i15 = ktvRecordParam.videoDuration;
        }
        if ((i11 & 32) != 0) {
            z13 = ktvRecordParam.adjustedStickerPosition;
        }
        if ((i11 & 64) != 0) {
            str22 = ktvRecordParam.enterMethod;
        }
        if ((i11 & 128) != 0) {
            str21 = ktvRecordParam.shootWay;
        }
        if ((i11 & 256) != 0) {
            str23 = ktvRecordParam.shootPageEnterMethod;
        }
        if ((i11 & 512) != 0) {
            z14 = ktvRecordParam.isPgc;
        }
        if ((i11 & 1024) != 0) {
            customSegmentInfo2 = ktvRecordParam.customSegmentInfo;
        }
        if ((i11 & 2048) != 0) {
            z10 = ktvRecordParam.isFull;
        }
        if ((i11 & 4096) != 0) {
            z11 = ktvRecordParam.isFollowSing;
        }
        if ((i11 & FileUtils.BUFFER_SIZE) != 0) {
            z9 = ktvRecordParam.isQuickShoot;
        }
        if ((i11 & 16384) != 0) {
            tuningData2 = ktvRecordParam.tuningData;
        }
        return ktvRecordParam.copy(str17, str16, z8, str18, str19, str20, i12, ktvAudioParam6, list4, list3, ktvAudioParam4, str14, ktvAudioParam5, str15, i17, i18, i16, i14, urlModel4, treeMap2, str24, i19, i20, urlModel5, urlModel6, z12, simpleEffect6, simpleEffect7, simpleEffect8, str26, str25, i13, simpleEffect5, arrayList6, arrayList5, arrayList4, i15, z13, str22, str21, str23, z14, customSegmentInfo2, z10, z11, z9, tuningData2);
    }

    public final KtvRecordParam copy(String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, List<String> audioPaths, List<Integer> audioDurations, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, int i5, UrlModel urlModel, TreeMap<Integer, Object> treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z2, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList<String> mvFilePaths, ArrayList<String> mvFileTypes, ArrayList<Integer> mvFileDurations, int i9, boolean z3, String str11, String str12, String str13, boolean z4, CustomSegmentInfo customSegmentInfo, boolean z5, boolean z6, boolean z7, TuningData tuningData) {
        o.LJIIIZ(audioPaths, "audioPaths");
        o.LJIIIZ(audioDurations, "audioDurations");
        o.LJIIIZ(mvFilePaths, "mvFilePaths");
        o.LJIIIZ(mvFileTypes, "mvFileTypes");
        o.LJIIIZ(mvFileDurations, "mvFileDurations");
        o.LJIIIZ(tuningData, "tuningData");
        return new KtvRecordParam(str, str2, z, str3, str4, str5, i, ktvAudioParam, audioPaths, audioDurations, ktvAudioParam2, str6, ktvAudioParam3, str7, i2, i3, i4, i5, urlModel, treeMap, str8, i6, i7, urlModel2, urlModel3, z2, simpleEffect, simpleEffect2, simpleEffect3, str9, str10, i8, simpleEffect4, mvFilePaths, mvFileTypes, mvFileDurations, i9, z3, str11, str12, str13, z4, customSegmentInfo, z5, z6, z7, tuningData);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.musicId, Boolean.valueOf(this.needFetchMusic), this.musicSelectedFrom, this.title, this.author, Integer.valueOf(this.recordMode), this.voiceTrack, this.audioPaths, this.audioDurations, this.originTrack, this.originTrackPath, this.subTrack, this.subTrackPath, Integer.valueOf(this.duration), Integer.valueOf(this.shootDuration), Integer.valueOf(this.auditionDuration), Integer.valueOf(this.fullSongShootDuration), this.lyricUrl, this.lyricLines, this.lyricPath, Integer.valueOf(this.lyricType), Integer.valueOf(this.lyricStartTime), this.coverMedium, this.coverLarge, Boolean.valueOf(this.showAuthor), this.lyricEffect, this.fontEffect, this.authorEffect, this.mvVideoEffectPath, this.mvImageEffectPath, Integer.valueOf(this.mvMode), this.mvVideoResEffect, this.mvFilePaths, this.mvFileTypes, this.mvFileDurations, Integer.valueOf(this.videoDuration), Boolean.valueOf(this.adjustedStickerPosition), this.enterMethod, this.shootWay, this.shootPageEnterMethod, Boolean.valueOf(this.isPgc), this.customSegmentInfo, Boolean.valueOf(this.isFull), Boolean.valueOf(this.isFollowSing), Boolean.valueOf(this.isQuickShoot), this.tuningData};
    }

    private final boolean checkTuningMidiFile() {
        if (this.tuningData.getTuningAudioTrack() == null || (this.tuningData.getTuningAudioTrack() != null && C44687HgJ.LIZIZ(this.tuningData.getTuningMidiPath()))) {
            return true;
        }
        return false;
    }

    public final List<AudioInterval> accompanimentTimeIntervals() {
        KtvAudioParam ktvAudioParam = this.subTrack;
        if (ktvAudioParam != null) {
            return ktvAudioParam.getTimeList();
        }
        return null;
    }

    public final boolean checkFiles() {
        if (C44687HgJ.LIZIZ(this.originTrackPath) && C44687HgJ.LIZIZ(this.subTrackPath) && C44687HgJ.LIZIZ(this.lyricPath) && checkTuningMidiFile()) {
            return true;
        }
        return false;
    }

    public final int getAudioStartTimeOffset() {
        CustomSegmentInfo customSegmentInfo = this.customSegmentInfo;
        if (customSegmentInfo != null) {
            o.LJI(customSegmentInfo);
            return customSegmentInfo.getStartTimeOffset();
        }
        return 0;
    }

    public final ReverberationData getReverberation() {
        return this.tuningData.getReverberation();
    }

    public final int getShootSegmentDuration() {
        CustomSegmentInfo customSegmentInfo = this.customSegmentInfo;
        if (customSegmentInfo != null) {
            o.LJI(customSegmentInfo);
            return customSegmentInfo.getShootDuration();
        }
        return this.shootDuration;
    }

    public final String getTuningAudioOutputPath() {
        return this.tuningData.getTuningAudioOutputPath();
    }

    public final KtvAudioParam getTuningAudioTrack() {
        return this.tuningData.getTuningAudioTrack();
    }

    public final String getTuningMidiPath() {
        return this.tuningData.getTuningMidiPath();
    }

    public final ReverberationData getTuningReverberation() {
        return this.tuningData.getTuningReverberation();
    }

    public final List<AudioInterval> originalTimeIntervals() {
        KtvAudioParam ktvAudioParam = this.originTrack;
        if (ktvAudioParam != null) {
            return ktvAudioParam.getTimeList();
        }
        return null;
    }

    public final boolean getAdjustedStickerPosition() {
        return this.adjustedStickerPosition;
    }

    public final List<Integer> getAudioDurations() {
        return this.audioDurations;
    }

    public final List<String> getAudioPaths() {
        return this.audioPaths;
    }

    public final int getAuditionDuration() {
        return this.auditionDuration;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final SimpleEffect getAuthorEffect() {
        return this.authorEffect;
    }

    public final UrlModel getCoverLarge() {
        return this.coverLarge;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final CustomSegmentInfo getCustomSegmentInfo() {
        return this.customSegmentInfo;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final SimpleEffect getFontEffect() {
        return this.fontEffect;
    }

    public final int getFullSongShootDuration() {
        return this.fullSongShootDuration;
    }

    public final String getId() {
        return this.id;
    }

    public final SimpleEffect getLyricEffect() {
        return this.lyricEffect;
    }

    public final TreeMap<Integer, Object> getLyricLines() {
        return this.lyricLines;
    }

    public final String getLyricPath() {
        return this.lyricPath;
    }

    public final int getLyricStartTime() {
        return this.lyricStartTime;
    }

    public final int getLyricType() {
        return this.lyricType;
    }

    public final UrlModel getLyricUrl() {
        return this.lyricUrl;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public final ArrayList<Integer> getMvFileDurations() {
        return this.mvFileDurations;
    }

    public final ArrayList<String> getMvFilePaths() {
        return this.mvFilePaths;
    }

    public final ArrayList<String> getMvFileTypes() {
        return this.mvFileTypes;
    }

    public final String getMvImageEffectPath() {
        return this.mvImageEffectPath;
    }

    public final int getMvMode() {
        return this.mvMode;
    }

    public final String getMvVideoEffectPath() {
        return this.mvVideoEffectPath;
    }

    public final SimpleEffect getMvVideoResEffect() {
        return this.mvVideoResEffect;
    }

    public final boolean getNeedFetchMusic() {
        return this.needFetchMusic;
    }

    public final KtvAudioParam getOriginTrack() {
        return this.originTrack;
    }

    public final String getOriginTrackPath() {
        return this.originTrackPath;
    }

    public final int getRecordMode() {
        return this.recordMode;
    }

    public final int getShootDuration() {
        return this.shootDuration;
    }

    public final String getShootPageEnterMethod() {
        return this.shootPageEnterMethod;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean getShowAuthor() {
        return this.showAuthor;
    }

    public final KtvAudioParam getSubTrack() {
        return this.subTrack;
    }

    public final String getSubTrackPath() {
        return this.subTrackPath;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TuningData getTuningData() {
        return this.tuningData;
    }

    public final int getVideoDuration() {
        return this.videoDuration;
    }

    public final KtvAudioParam getVoiceTrack() {
        return this.voiceTrack;
    }

    public final boolean isFollowSing() {
        return this.isFollowSing;
    }

    public final boolean isFull() {
        return this.isFull;
    }

    public final boolean isPgc() {
        return this.isPgc;
    }

    public final boolean isQuickShoot() {
        return this.isQuickShoot;
    }

    public final void setAdjustedStickerPosition(boolean z) {
        this.adjustedStickerPosition = z;
    }

    public final void setAudioDurations(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.audioDurations = list;
    }

    public final void setAudioPaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.audioPaths = list;
    }

    public final void setAuditionDuration(int i) {
        this.auditionDuration = i;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setAuthorEffect(SimpleEffect simpleEffect) {
        this.authorEffect = simpleEffect;
    }

    public final void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public final void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public final void setCustomSegmentInfo(CustomSegmentInfo customSegmentInfo) {
        this.customSegmentInfo = customSegmentInfo;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFollowSing(boolean z) {
        this.isFollowSing = z;
    }

    public final void setFontEffect(SimpleEffect simpleEffect) {
        this.fontEffect = simpleEffect;
    }

    public final void setFull(boolean z) {
        this.isFull = z;
    }

    public final void setFullSongShootDuration(int i) {
        this.fullSongShootDuration = i;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLyricEffect(SimpleEffect simpleEffect) {
        this.lyricEffect = simpleEffect;
    }

    public final void setLyricLines(TreeMap<Integer, Object> treeMap) {
        this.lyricLines = treeMap;
    }

    public final void setLyricPath(String str) {
        this.lyricPath = str;
    }

    public final void setLyricStartTime(int i) {
        this.lyricStartTime = i;
    }

    public final void setLyricType(int i) {
        this.lyricType = i;
    }

    public final void setLyricUrl(UrlModel urlModel) {
        this.lyricUrl = urlModel;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public final void setMvFileDurations(ArrayList<Integer> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.mvFileDurations = arrayList;
    }

    public final void setMvFilePaths(ArrayList<String> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.mvFilePaths = arrayList;
    }

    public final void setMvFileTypes(ArrayList<String> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.mvFileTypes = arrayList;
    }

    public final void setMvImageEffectPath(String str) {
        this.mvImageEffectPath = str;
    }

    public final void setMvMode(int i) {
        this.mvMode = i;
    }

    public final void setMvVideoEffectPath(String str) {
        this.mvVideoEffectPath = str;
    }

    public final void setMvVideoResEffect(SimpleEffect simpleEffect) {
        this.mvVideoResEffect = simpleEffect;
    }

    public final void setNeedFetchMusic(boolean z) {
        this.needFetchMusic = z;
    }

    public final void setOriginTrack(KtvAudioParam ktvAudioParam) {
        this.originTrack = ktvAudioParam;
    }

    public final void setOriginTrackPath(String str) {
        this.originTrackPath = str;
    }

    public final void setPgc(boolean z) {
        this.isPgc = z;
    }

    public final void setQuickShoot(boolean z) {
        this.isQuickShoot = z;
    }

    public final void setRecordMode(int i) {
        this.recordMode = i;
    }

    public final void setReverberation(ReverberationData reverberationData) {
        this.tuningData.setReverberation(reverberationData);
    }

    public final void setShootDuration(int i) {
        this.shootDuration = i;
    }

    public final void setShootPageEnterMethod(String str) {
        this.shootPageEnterMethod = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setShowAuthor(boolean z) {
        this.showAuthor = z;
    }

    public final void setSubTrack(KtvAudioParam ktvAudioParam) {
        this.subTrack = ktvAudioParam;
    }

    public final void setSubTrackPath(String str) {
        this.subTrackPath = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTuningAudioOutputPath(String str) {
        this.tuningData.setTuningAudioOutputPath(str);
    }

    public final void setTuningAudioTrack(KtvAudioParam ktvAudioParam) {
        this.tuningData.setTuningAudioTrack(ktvAudioParam);
    }

    public final void setTuningData(TuningData tuningData) {
        o.LJIIIZ(tuningData, "<set-?>");
        this.tuningData = tuningData;
    }

    public final void setTuningMidiPath(String str) {
        this.tuningData.setTuningMidiPath(str);
    }

    public final void setTuningReverberation(ReverberationData reverberationData) {
        this.tuningData.setTuningReverberation(reverberationData);
    }

    public final void setVideoDuration(int i) {
        this.videoDuration = i;
    }

    public final void setVoiceTrack(KtvAudioParam ktvAudioParam) {
        this.voiceTrack = ktvAudioParam;
    }

    public KtvRecordParam(String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, List<String> audioPaths, List<Integer> audioDurations, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, int i5, UrlModel urlModel, TreeMap<Integer, Object> treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z2, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList<String> mvFilePaths, ArrayList<String> mvFileTypes, ArrayList<Integer> mvFileDurations, int i9, boolean z3, String str11, String str12, String str13, boolean z4, CustomSegmentInfo customSegmentInfo, boolean z5, boolean z6, boolean z7, TuningData tuningData) {
        o.LJIIIZ(audioPaths, "audioPaths");
        o.LJIIIZ(audioDurations, "audioDurations");
        o.LJIIIZ(mvFilePaths, "mvFilePaths");
        o.LJIIIZ(mvFileTypes, "mvFileTypes");
        o.LJIIIZ(mvFileDurations, "mvFileDurations");
        o.LJIIIZ(tuningData, "tuningData");
        this.id = str;
        this.musicId = str2;
        this.needFetchMusic = z;
        this.musicSelectedFrom = str3;
        this.title = str4;
        this.author = str5;
        this.recordMode = i;
        this.voiceTrack = ktvAudioParam;
        this.audioPaths = audioPaths;
        this.audioDurations = audioDurations;
        this.originTrack = ktvAudioParam2;
        this.originTrackPath = str6;
        this.subTrack = ktvAudioParam3;
        this.subTrackPath = str7;
        this.duration = i2;
        this.shootDuration = i3;
        this.auditionDuration = i4;
        this.fullSongShootDuration = i5;
        this.lyricUrl = urlModel;
        this.lyricLines = treeMap;
        this.lyricPath = str8;
        this.lyricType = i6;
        this.lyricStartTime = i7;
        this.coverMedium = urlModel2;
        this.coverLarge = urlModel3;
        this.showAuthor = z2;
        this.lyricEffect = simpleEffect;
        this.fontEffect = simpleEffect2;
        this.authorEffect = simpleEffect3;
        this.mvVideoEffectPath = str9;
        this.mvImageEffectPath = str10;
        this.mvMode = i8;
        this.mvVideoResEffect = simpleEffect4;
        this.mvFilePaths = mvFilePaths;
        this.mvFileTypes = mvFileTypes;
        this.mvFileDurations = mvFileDurations;
        this.videoDuration = i9;
        this.adjustedStickerPosition = z3;
        this.enterMethod = str11;
        this.shootWay = str12;
        this.shootPageEnterMethod = str13;
        this.isPgc = z4;
        this.customSegmentInfo = customSegmentInfo;
        this.isFull = z5;
        this.isFollowSing = z6;
        this.isQuickShoot = z7;
        this.tuningData = tuningData;
    }

    public /* synthetic */ KtvRecordParam(String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, List list, List list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, int i5, UrlModel urlModel, TreeMap treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z2, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i9, boolean z3, String str11, String str12, String str13, boolean z4, CustomSegmentInfo customSegmentInfo, boolean z5, boolean z6, boolean z7, TuningData tuningData, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? -1 : i, (i10 & 128) != 0 ? null : ktvAudioParam, (i10 & 256) != 0 ? new ArrayList() : list, (i10 & 512) != 0 ? new ArrayList() : list2, (i10 & 1024) != 0 ? null : ktvAudioParam2, (i10 & 2048) != 0 ? null : str6, (i10 & 4096) != 0 ? null : ktvAudioParam3, (i10 & FileUtils.BUFFER_SIZE) != 0 ? null : str7, (i10 & 16384) != 0 ? 0 : i2, (32768 & i10) != 0 ? 0 : i3, (65536 & i10) != 0 ? 0 : i4, (131072 & i10) != 0 ? 0 : i5, (262144 & i10) != 0 ? null : urlModel, (524288 & i10) != 0 ? null : treeMap, (1048576 & i10) != 0 ? null : str8, (2097152 & i10) != 0 ? 0 : i6, (4194304 & i10) != 0 ? 0 : i7, (8388608 & i10) != 0 ? null : urlModel2, (16777216 & i10) != 0 ? null : urlModel3, (33554432 & i10) != 0 ? false : z2, (67108864 & i10) != 0 ? null : simpleEffect, (134217728 & i10) != 0 ? null : simpleEffect2, (268435456 & i10) != 0 ? null : simpleEffect3, (536870912 & i10) != 0 ? null : str9, (1073741824 & i10) != 0 ? null : str10, (i10 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? 0 : i8, (i11 & 1) != 0 ? null : simpleEffect4, (i11 & 2) != 0 ? new ArrayList() : arrayList, (i11 & 4) != 0 ? new ArrayList() : arrayList2, (i11 & 8) != 0 ? new ArrayList() : arrayList3, (i11 & 16) != 0 ? 0 : i9, (i11 & 32) != 0 ? false : z3, (i11 & 64) != 0 ? null : str11, (i11 & 128) != 0 ? null : str12, (i11 & 256) != 0 ? null : str13, (i11 & 512) != 0 ? true : z4, (i11 & 1024) != 0 ? null : customSegmentInfo, (i11 & 2048) != 0 ? false : z5, (i11 & 4096) != 0 ? false : z6, (i11 & FileUtils.BUFFER_SIZE) != 0 ? false : z7, (i11 & 16384) != 0 ? new TuningData(null, false, null, null, null, null, null, null, null, 0, null, false, 0, false, null, null, false, null, null, null, 0, 2097151, null) : tuningData);
    }
}
