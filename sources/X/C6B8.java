package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.6B8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B8 implements Serializable {
    public AudioRecorderParam LJLIL;
    public MultiEditVideoRecordData LJLILLLLZI;
    public float LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public boolean LJLJL;
    public int LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public String LJLJJLL = "";
    public String LJLJLJ = "";

    public final AudioRecorderParam getAudioRecordParam() {
        return this.LJLIL;
    }

    public final MultiEditVideoRecordData getEditRecordData() {
        return this.LJLILLLLZI;
    }

    public final boolean getHasAudioChangeInEditorPro() {
        return this.LJLJL;
    }

    public final String getLastNle() {
        return this.LJLJJLL;
    }

    public final int getMusicEndTime() {
        return this.LJLL;
    }

    public final String getMusicId() {
        return this.LJLJLJ;
    }

    public final int getMusicStartTime() {
        return this.LJLJLLL;
    }

    public final float getMusicVolume() {
        return this.LJLLI;
    }

    public final long getRecordEndTime() {
        return this.LJLJJL;
    }

    public final long getRecordStartTime() {
        return this.LJLJJI;
    }

    public final float getVoiceVolume() {
        return this.LJLJI;
    }

    public final void getData(VideoPublishEditModel model) {
        long j;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        o.LJIIIZ(model, "model");
        MultiEditVideoRecordData multiEditVideoRecordData4 = null;
        if (model.veAudioRecorderParam == null) {
            this.LJLIL = null;
        } else {
            if (this.LJLIL == null) {
                this.LJLIL = new AudioRecorderParam();
            }
            AudioRecorderParam audioRecorderParam = this.LJLIL;
            o.LJI(audioRecorderParam);
            audioRecorderParam.copyFrom(model.veAudioRecorderParam);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData3 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            multiEditVideoRecordData4 = multiEditVideoRecordData3.cloneSegmentDataList();
        }
        this.LJLILLLLZI = multiEditVideoRecordData4;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = model.multiEditVideoRecordData;
        long j2 = 0;
        if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) != null) {
            j = multiEditVideoRecordData2.startTime;
        } else {
            j = 0;
        }
        this.LJLJJI = j;
        if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) != null) {
            j2 = multiEditVideoRecordData.endTime;
        }
        this.LJLJJL = j2;
        this.LJLJI = model.voiceVolume;
        String str = model.nleData;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LJLJJLL = str;
        if (C133195Kp.LIZ()) {
            String musicId = model.getMusicId();
            if (musicId != null) {
                str2 = musicId;
            }
            this.LJLJLJ = str2;
            this.LJLJLLL = model.getMMusicStart();
            this.LJLL = model.getMMusicEnd();
            this.LJLLI = model.musicVolume;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
    
        if (r12.veAudioRecorderParam == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
    
        if (r12.hasOriginalAudio(false) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r11.LJLJI != r12.voiceVolume) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r11.LJLJL != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (X.C133195Kp.LIZ() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (hasMusicChange(r12) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        if (kotlin.jvm.internal.o.LIZLLL(r1, r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ba, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0.curMultiEditVideoRecordData != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasChanged(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12) {
        /*
            r11 = this;
            java.lang.String r0 = "newData"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r11.LJLILLLLZI
            r9 = 0
            r8 = 1
            r7 = 0
            if (r1 != 0) goto L90
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r0 = r12.multiEditVideoRecordData
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r0.curMultiEditVideoRecordData
            if (r0 != 0) goto L3a
        L14:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r11.LJLIL
            if (r0 != 0) goto L43
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r12.veAudioRecorderParam
            if (r0 != 0) goto L76
        L1c:
            boolean r0 = r12.hasOriginalAudio(r7)
            if (r0 == 0) goto L2a
            float r1 = r11.LJLJI
            float r0 = r12.voiceVolume
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L3a
        L2a:
            boolean r0 = r11.LJLJL
            if (r0 != 0) goto L3a
            boolean r0 = X.C133195Kp.LIZ()
            if (r0 == 0) goto L41
            boolean r0 = r11.hasMusicChange(r12)
            if (r0 == 0) goto L41
        L3a:
            boolean r0 = r11.LJLJL
            if (r0 == 0) goto L40
            r11.LJLJL = r7
        L40:
            return r8
        L41:
            r8 = 0
            goto L3a
        L43:
            boolean r0 = r0.hasRecord()
            if (r0 != r8) goto L76
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r12.veAudioRecorderParam
            if (r0 == 0) goto L76
            boolean r0 = r0.hasRecord()
            if (r0 != r8) goto L76
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r11.LJLIL
            if (r0 == 0) goto L74
            float r0 = r0.getRecordVolume()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L5f:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r12.veAudioRecorderParam
            if (r0 == 0) goto L72
            float r0 = r0.getRecordVolume()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L6b:
            boolean r0 = kotlin.jvm.internal.o.LIZLLL(r1, r0)
            if (r0 != 0) goto L76
            goto L3a
        L72:
            r0 = r9
            goto L6b
        L74:
            r1 = r9
            goto L5f
        L76:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r11.LJLIL
            r2 = 2
            if (r1 != 0) goto L89
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r12.veAudioRecorderParam
            kotlin.jvm.internal.o.LJI(r1)
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r11.LJLIL
            boolean r0 = com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam.hasChange$default(r1, r0, r7, r2, r9)
        L86:
            if (r0 != 0) goto L3a
            goto L1c
        L89:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r12.veAudioRecorderParam
            boolean r0 = com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam.hasChange$default(r1, r0, r7, r2, r9)
            goto L86
        L90:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r0 = r12.multiEditVideoRecordData
            if (r0 == 0) goto Lc1
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r0.curMultiEditVideoRecordData
        L96:
            boolean r0 = r1.isEqual(r0)
            if (r0 == 0) goto L3a
            long r5 = r11.LJLJJI
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r10 = r12.multiEditVideoRecordData
            r3 = 0
            if (r10 == 0) goto Lbe
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r10.curMultiEditVideoRecordData
            if (r0 == 0) goto Lbe
            long r1 = r0.startTime
        Laa:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L3a
            long r1 = r11.LJLJJL
            if (r10 == 0) goto Lb8
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r10.curMultiEditVideoRecordData
            if (r0 == 0) goto Lb8
            long r3 = r0.endTime
        Lb8:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L14
            goto L3a
        Lbe:
            r1 = 0
            goto Laa
        Lc1:
            r0 = r9
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6B8.hasChanged(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public final boolean hasMusicChange(VideoPublishEditModel newData) {
        o.LJIIIZ(newData, "newData");
        String str = this.LJLJLJ;
        String musicId = newData.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        if (!o.LJ(str, musicId) || this.LJLJLLL != newData.getMMusicStart() || this.LJLL != newData.getMMusicEnd() || this.LJLLI != newData.musicVolume) {
            return true;
        }
        return false;
    }

    public final void setAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.LJLIL = audioRecorderParam;
    }

    public final void setEditRecordData(MultiEditVideoRecordData multiEditVideoRecordData) {
        this.LJLILLLLZI = multiEditVideoRecordData;
    }

    public final void setHasAudioChangeInEditorPro(boolean z) {
        this.LJLJL = z;
    }

    public final void setLastNle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJLL = str;
    }

    public final void setMusicEndTime(int i) {
        this.LJLL = i;
    }

    public final void setMusicId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJLJ = str;
    }

    public final void setMusicStartTime(int i) {
        this.LJLJLLL = i;
    }

    public final void setMusicVolume(float f) {
        this.LJLLI = f;
    }

    public final void setRecordEndTime(long j) {
        this.LJLJJL = j;
    }

    public final void setRecordStartTime(long j) {
        this.LJLJJI = j;
    }

    public final void setVoiceVolume(float f) {
        this.LJLJI = f;
    }
}
