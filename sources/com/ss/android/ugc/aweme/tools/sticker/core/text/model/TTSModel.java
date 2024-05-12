package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.AnonymousClass391;
import X.C79062V1e;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.JBR;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSModel implements Parcelable {
    public static final Parcelable.Creator<TTSModel> CREATOR = new Parcelable.Creator<TTSModel>() { // from class: X.5Zn
        @Override // android.os.Parcelable.Creator
        public final TTSModel createFromParcel(Parcel parcel) {
            boolean z;
            TTSVoiceModel createFromParcel;
            boolean z2;
            boolean z3;
            boolean z4;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = TTSVoiceModel.CREATOR.createFromParcel(parcel);
            }
            TTSVoiceModel tTSVoiceModel = createFromParcel;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            TTSAudioBean createFromParcel2 = TTSAudioBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String readString12 = parcel.readString();
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
            for (int i = 0; i != readInt3; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new TTSModel(z, readInt, readString, readString2, readString3, readString4, readInt2, readString5, createStringArrayList, tTSVoiceModel, z2, readString6, readString7, readString8, readString9, readString10, readString11, z3, readLong, readLong2, createStringArrayList2, createFromParcel2, z4, readString12, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TTSModel[] newArray(int i) {
            return new TTSModel[i];
        }
    };

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_path_list")
    public List<String> audioPathList;

    @InterfaceC65349Pkn("old_text")
    public String audioText;

    @InterfaceC65349Pkn("audio_track_duration")
    public int audioTrackDuration;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_track_file_path")
    public String audioTrackFilePath;

    @InterfaceC65349Pkn("audio_track_index")
    public int audioTrackIndex;

    @InterfaceC65349Pkn("auto_add_tts_flag")
    public boolean autoAddTtsFlag;

    @InterfaceC65349Pkn("editorpro_tts_tone_id")
    public String editorProTTSID;

    @InterfaceC65349Pkn("has_read_text_audio")
    public boolean hasReadTextAudio;

    @InterfaceC65349Pkn("is_creator")
    public boolean isCreatorVoice;

    @InterfaceC65349Pkn("is_editorpro_tts")
    public boolean isEditorProTTS;

    @InterfaceC65349Pkn("nle_uuid")
    public String nleUuid;

    @InterfaceC65349Pkn("speaker_id")
    public String speakerID;

    @InterfaceC65349Pkn("speaker_name")
    public String speakerName;

    @InterfaceC65349Pkn("tts_anchor_release_date")
    public long ttsAnchorReleaseDate;

    @InterfaceC65349Pkn("tts_audio_bean")
    public TTSAudioBean ttsAudioBean;

    @InterfaceC65349Pkn("tts_extra")
    public final Map<String, String> ttsExtraMap;

    @InterfaceC65349Pkn("tts_hash_tag_ids")
    public List<String> ttsHashTagIds;

    @InterfaceC65349Pkn("tts_release_date")
    public long ttsReleaseDate;

    @InterfaceC65349Pkn("tts_voice_model")
    public TTSVoiceModel ttsVoiceModel;

    @InterfaceC65349Pkn("voice_anchor_name")
    public String voiceAnchorName;

    @InterfaceC65349Pkn("creator_user_id")
    public String voiceCreatorUserId;

    @InterfaceC65349Pkn("creator_user_name")
    public String voiceCreatorUserName;

    @InterfaceC65349Pkn("voice_effect_icon_url")
    public String voiceEffectIconUrl;

    @InterfaceC65349Pkn("voice_effect_id")
    public String voiceEffectId;

    @InterfaceC65349Pkn("voice_effect_resource_id")
    public String voiceEffectResourceId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTSModel() {
        /*
            r30 = this;
            r1 = 0
            r3 = 0
            r19 = 0
            r28 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r30
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r1
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r1
            r12 = r3
            r13 = r3
            r14 = r3
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r1
            r21 = r19
            r23 = r3
            r24 = r3
            r25 = r1
            r26 = r3
            r27 = r3
            r29 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSModel)) {
            return false;
        }
        TTSModel tTSModel = (TTSModel) obj;
        return this.hasReadTextAudio == tTSModel.hasReadTextAudio && this.audioTrackIndex == tTSModel.audioTrackIndex && o.LJ(this.nleUuid, tTSModel.nleUuid) && o.LJ(this.audioTrackFilePath, tTSModel.audioTrackFilePath) && o.LJ(this.speakerID, tTSModel.speakerID) && o.LJ(this.speakerName, tTSModel.speakerName) && this.audioTrackDuration == tTSModel.audioTrackDuration && o.LJ(this.audioText, tTSModel.audioText) && o.LJ(this.audioPathList, tTSModel.audioPathList) && o.LJ(this.ttsVoiceModel, tTSModel.ttsVoiceModel) && this.autoAddTtsFlag == tTSModel.autoAddTtsFlag && o.LJ(this.voiceEffectId, tTSModel.voiceEffectId) && o.LJ(this.voiceEffectResourceId, tTSModel.voiceEffectResourceId) && o.LJ(this.voiceAnchorName, tTSModel.voiceAnchorName) && o.LJ(this.voiceEffectIconUrl, tTSModel.voiceEffectIconUrl) && o.LJ(this.voiceCreatorUserId, tTSModel.voiceCreatorUserId) && o.LJ(this.voiceCreatorUserName, tTSModel.voiceCreatorUserName) && this.isCreatorVoice == tTSModel.isCreatorVoice && this.ttsAnchorReleaseDate == tTSModel.ttsAnchorReleaseDate && this.ttsReleaseDate == tTSModel.ttsReleaseDate && o.LJ(this.ttsHashTagIds, tTSModel.ttsHashTagIds) && o.LJ(this.ttsAudioBean, tTSModel.ttsAudioBean) && this.isEditorProTTS == tTSModel.isEditorProTTS && o.LJ(this.editorProTTSID, tTSModel.editorProTTSID) && o.LJ(this.ttsExtraMap, tTSModel.ttsExtraMap);
    }

    public final String toString() {
        return "TTSModel(hasReadTextAudio=" + this.hasReadTextAudio + ", audioTrackIndex=" + this.audioTrackIndex + ", nleUuid=" + this.nleUuid + ", audioTrackFilePath=" + this.audioTrackFilePath + ", speakerID=" + this.speakerID + ", speakerName=" + this.speakerName + ", audioTrackDuration=" + this.audioTrackDuration + ", audioText=" + this.audioText + ", audioPathList=" + this.audioPathList + ", ttsVoiceModel=" + this.ttsVoiceModel + ", autoAddTtsFlag=" + this.autoAddTtsFlag + ", voiceEffectId=" + this.voiceEffectId + ", voiceEffectResourceId=" + this.voiceEffectResourceId + ", voiceAnchorName=" + this.voiceAnchorName + ", voiceEffectIconUrl=" + this.voiceEffectIconUrl + ", voiceCreatorUserId=" + this.voiceCreatorUserId + ", voiceCreatorUserName=" + this.voiceCreatorUserName + ", isCreatorVoice=" + this.isCreatorVoice + ", ttsAnchorReleaseDate=" + this.ttsAnchorReleaseDate + ", ttsReleaseDate=" + this.ttsReleaseDate + ", ttsHashTagIds=" + this.ttsHashTagIds + ", ttsAudioBean=" + this.ttsAudioBean + ", isEditorProTTS=" + this.isEditorProTTS + ", editorProTTSID=" + this.editorProTTSID + ", ttsExtraMap=" + this.ttsExtraMap + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasReadTextAudio ? 1 : 0);
        out.writeInt(this.audioTrackIndex);
        out.writeString(this.nleUuid);
        out.writeString(this.audioTrackFilePath);
        out.writeString(this.speakerID);
        out.writeString(this.speakerName);
        out.writeInt(this.audioTrackDuration);
        out.writeString(this.audioText);
        out.writeStringList(this.audioPathList);
        TTSVoiceModel tTSVoiceModel = this.ttsVoiceModel;
        if (tTSVoiceModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            tTSVoiceModel.writeToParcel(out, i);
        }
        out.writeInt(this.autoAddTtsFlag ? 1 : 0);
        out.writeString(this.voiceEffectId);
        out.writeString(this.voiceEffectResourceId);
        out.writeString(this.voiceAnchorName);
        out.writeString(this.voiceEffectIconUrl);
        out.writeString(this.voiceCreatorUserId);
        out.writeString(this.voiceCreatorUserName);
        out.writeInt(this.isCreatorVoice ? 1 : 0);
        out.writeLong(this.ttsAnchorReleaseDate);
        out.writeLong(this.ttsReleaseDate);
        out.writeStringList(this.ttsHashTagIds);
        this.ttsAudioBean.writeToParcel(out, i);
        out.writeInt(this.isEditorProTTS ? 1 : 0);
        out.writeString(this.editorProTTSID);
        Map<String, String> map = this.ttsExtraMap;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        boolean z = this.hasReadTextAudio;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.nleUuid, ((r0 * 31) + this.audioTrackIndex) * 31, 31);
        String str = this.audioTrackFilePath;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (LJ + hashCode) * 31;
        String str2 = this.speakerID;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.speakerName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (((i4 + hashCode3) * 31) + this.audioTrackDuration) * 31;
        String str4 = this.audioText;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.audioPathList, (i5 + hashCode4) * 31, 31);
        TTSVoiceModel tTSVoiceModel = this.ttsVoiceModel;
        if (tTSVoiceModel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = tTSVoiceModel.hashCode();
        }
        int i6 = (LIZIZ + hashCode5) * 31;
        ?? r02 = this.autoAddTtsFlag;
        int i7 = r02;
        if (r02 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str5 = this.voiceEffectId;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str6 = this.voiceEffectResourceId;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        String str7 = this.voiceAnchorName;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str8 = this.voiceEffectIconUrl;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.voiceCreatorUserName, C79062V1e.LJ(this.voiceCreatorUserId, (i11 + i2) * 31, 31), 31);
        ?? r03 = this.isCreatorVoice;
        int i12 = r03;
        if (r03 != 0) {
            i12 = 1;
        }
        int hashCode9 = (this.ttsAudioBean.hashCode() + AnonymousClass391.LIZIZ(this.ttsHashTagIds, JBR.LIZJ(this.ttsReleaseDate, JBR.LIZJ(this.ttsAnchorReleaseDate, (LJ2 + i12) * 31, 31), 31), 31)) * 31;
        if (!this.isEditorProTTS) {
            i = 0;
        }
        return this.ttsExtraMap.hashCode() + C79062V1e.LJ(this.editorProTTSID, (hashCode9 + i) * 31, 31);
    }

    public static TTSModel LIZ(TTSModel tTSModel) {
        boolean z = tTSModel.hasReadTextAudio;
        int i = tTSModel.audioTrackIndex;
        String nleUuid = tTSModel.nleUuid;
        String str = tTSModel.audioTrackFilePath;
        String str2 = tTSModel.speakerID;
        String str3 = tTSModel.speakerName;
        int i2 = tTSModel.audioTrackDuration;
        String str4 = tTSModel.audioText;
        List<String> audioPathList = tTSModel.audioPathList;
        TTSVoiceModel tTSVoiceModel = tTSModel.ttsVoiceModel;
        boolean z2 = tTSModel.autoAddTtsFlag;
        String str5 = tTSModel.voiceEffectId;
        String str6 = tTSModel.voiceEffectResourceId;
        String str7 = tTSModel.voiceAnchorName;
        String str8 = tTSModel.voiceEffectIconUrl;
        String voiceCreatorUserId = tTSModel.voiceCreatorUserId;
        String voiceCreatorUserName = tTSModel.voiceCreatorUserName;
        boolean z3 = tTSModel.isCreatorVoice;
        long j = tTSModel.ttsAnchorReleaseDate;
        long j2 = tTSModel.ttsReleaseDate;
        List<String> ttsHashTagIds = tTSModel.ttsHashTagIds;
        TTSAudioBean ttsAudioBean = tTSModel.ttsAudioBean;
        boolean z4 = tTSModel.isEditorProTTS;
        String editorProTTSID = tTSModel.editorProTTSID;
        Map<String, String> ttsExtraMap = tTSModel.ttsExtraMap;
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(ttsAudioBean, "ttsAudioBean");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(ttsExtraMap, "ttsExtraMap");
        return new TTSModel(z, i, nleUuid, str, str2, str3, i2, str4, audioPathList, tTSVoiceModel, z2, str5, str6, str7, str8, voiceCreatorUserId, voiceCreatorUserName, z3, j, j2, ttsHashTagIds, ttsAudioBean, z4, editorProTTSID, ttsExtraMap);
    }

    public TTSModel(boolean z, int i, String nleUuid, String str, String str2, String str3, int i2, String str4, List<String> audioPathList, TTSVoiceModel tTSVoiceModel, boolean z2, String str5, String str6, String str7, String str8, String voiceCreatorUserId, String voiceCreatorUserName, boolean z3, long j, long j2, List<String> ttsHashTagIds, TTSAudioBean ttsAudioBean, boolean z4, String editorProTTSID, Map<String, String> ttsExtraMap) {
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(ttsAudioBean, "ttsAudioBean");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(ttsExtraMap, "ttsExtraMap");
        this.hasReadTextAudio = z;
        this.audioTrackIndex = i;
        this.nleUuid = nleUuid;
        this.audioTrackFilePath = str;
        this.speakerID = str2;
        this.speakerName = str3;
        this.audioTrackDuration = i2;
        this.audioText = str4;
        this.audioPathList = audioPathList;
        this.ttsVoiceModel = tTSVoiceModel;
        this.autoAddTtsFlag = z2;
        this.voiceEffectId = str5;
        this.voiceEffectResourceId = str6;
        this.voiceAnchorName = str7;
        this.voiceEffectIconUrl = str8;
        this.voiceCreatorUserId = voiceCreatorUserId;
        this.voiceCreatorUserName = voiceCreatorUserName;
        this.isCreatorVoice = z3;
        this.ttsAnchorReleaseDate = j;
        this.ttsReleaseDate = j2;
        this.ttsHashTagIds = ttsHashTagIds;
        this.ttsAudioBean = ttsAudioBean;
        this.isEditorProTTS = z4;
        this.editorProTTSID = editorProTTSID;
        this.ttsExtraMap = ttsExtraMap;
    }

    public /* synthetic */ TTSModel(boolean z, int i, String str, String str2, String str3, String str4, int i2, String str5, List list, TTSVoiceModel tTSVoiceModel, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, long j, long j2, List list2, TTSAudioBean tTSAudioBean, boolean z4, String str12, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? new ArrayList() : list, (i3 & 512) != 0 ? null : tTSVoiceModel, (i3 & 1024) != 0 ? false : z2, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : str7, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : str8, (i3 & 16384) != 0 ? null : str9, (32768 & i3) != 0 ? "" : str10, (65536 & i3) != 0 ? "" : str11, (131072 & i3) != 0 ? false : z3, (262144 & i3) != 0 ? 0L : j, (524288 & i3) == 0 ? j2 : 0L, (1048576 & i3) != 0 ? new ArrayList() : list2, (2097152 & i3) != 0 ? new TTSAudioBean(null, 1, null) : tTSAudioBean, (4194304 & i3) != 0 ? false : z4, (8388608 & i3) == 0 ? str12 : "", (i3 & 16777216) != 0 ? new LinkedHashMap() : map);
    }
}
