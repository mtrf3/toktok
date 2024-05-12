package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SimpleTextStickerData implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SimpleTextStickerData> CREATOR = new Parcelable.Creator<SimpleTextStickerData>() { // from class: X.5Zu
        @Override // android.os.Parcelable.Creator
        public final SimpleTextStickerData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
            for (int i = 0; i != readInt3; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new SimpleTextStickerData(z, readString, readInt, readString2, readInt2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, z2, readLong, readLong2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleTextStickerData[] newArray(int i) {
            return new SimpleTextStickerData[i];
        }
    };

    @InterfaceC65349Pkn("old_text")
    public String audioText;

    @InterfaceC65349Pkn("audio_track_duration")
    public int audioTrackDuration;

    @InterfaceC65349Pkn("audio_track_file_path")
    public String audioTrackFilePath;

    @InterfaceC65349Pkn("audio_track_index")
    public int audioTrackIndex;

    @InterfaceC65349Pkn("has_read_text_audio")
    public boolean hasReadTextAudio;

    @InterfaceC65349Pkn("is_creator")
    public boolean isCreatorVoice;

    @InterfaceC65349Pkn("speaker_id")
    public String speakerID;

    @InterfaceC65349Pkn("tts_anchor_release_date")
    public final long ttsAnchorReleaseDate;

    @InterfaceC65349Pkn("tts_extra")
    public final Map<String, String> ttsExtraMap;

    @InterfaceC65349Pkn("tts_release_date")
    public final long ttsReleaseDate;

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
    public SimpleTextStickerData() {
        /*
            r21 = this;
            r1 = 0
            r2 = 0
            r14 = 0
            r19 = 65535(0xffff, float:9.1834E-41)
            r0 = r21
            r3 = r1
            r4 = r2
            r5 = r1
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r1
            r16 = r14
            r18 = r2
            r20 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22) {
        /*
            r21 = this;
            r2 = 0
            r3 = 0
            r14 = 0
            r19 = 65534(0xfffe, float:9.1833E-41)
            r0 = r21
            r1 = r22
            r4 = r2
            r5 = r3
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r3
            r16 = r14
            r18 = r2
            r20 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23) {
        /*
            r21 = this;
            r3 = 0
            r4 = 0
            r14 = 0
            r19 = 65532(0xfffc, float:9.183E-41)
            r1 = r22
            r2 = r23
            r0 = r21
            r5 = r3
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r3
            r16 = r14
            r18 = r4
            r20 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24) {
        /*
            r21 = this;
            r4 = 0
            r5 = 0
            r14 = 0
            r19 = 65528(0xfff8, float:9.1824E-41)
            r1 = r22
            r0 = r21
            r3 = r24
            r2 = r23
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r5
            r16 = r14
            r18 = r4
            r20 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25) {
        /*
            r21 = this;
            r5 = 0
            r6 = 0
            r14 = 0
            r19 = 65520(0xfff0, float:9.1813E-41)
            r1 = r22
            r0 = r21
            r2 = r23
            r4 = r25
            r3 = r24
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r5
            r16 = r14
            r18 = r6
            r20 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26) {
        /*
            r21 = this;
            r6 = 0
            r13 = 0
            r14 = 0
            r19 = 65504(0xffe0, float:9.179E-41)
            r1 = r22
            r0 = r21
            r2 = r23
            r3 = r24
            r5 = r26
            r4 = r25
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r16 = r14
            r18 = r6
            r20 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27) {
        /*
            r21 = this;
            r7 = 0
            r13 = 0
            r14 = 0
            r19 = 65472(0xffc0, float:9.1746E-41)
            r5 = r26
            r1 = r22
            r6 = r27
            r0 = r21
            r2 = r23
            r3 = r24
            r4 = r25
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r16 = r14
            r18 = r7
            r20 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28) {
        /*
            r21 = this;
            r8 = 0
            r13 = 0
            r14 = 0
            r19 = 65408(0xff80, float:9.1656E-41)
            r5 = r26
            r4 = r25
            r6 = r27
            r7 = r28
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r16 = r14
            r18 = r8
            r20 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r21 = this;
            r9 = 0
            r13 = 0
            r14 = 0
            r19 = 65280(0xff00, float:9.1477E-41)
            r5 = r26
            r4 = r25
            r3 = r24
            r7 = r28
            r0 = r21
            r8 = r29
            r1 = r22
            r6 = r27
            r2 = r23
            r10 = r9
            r11 = r9
            r12 = r9
            r16 = r14
            r18 = r9
            r20 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
            r21 = this;
            r10 = 0
            r13 = 0
            r14 = 0
            r19 = 65024(0xfe00, float:9.1118E-41)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r8 = r29
            r1 = r22
            r9 = r30
            r7 = r28
            r0 = r21
            r6 = r27
            r11 = r10
            r12 = r10
            r16 = r14
            r18 = r10
            r20 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r21 = this;
            r11 = 0
            r13 = 0
            r14 = 0
            r19 = 64512(0xfc00, float:9.04E-41)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r0 = r21
            r9 = r30
            r10 = r31
            r8 = r29
            r1 = r22
            r7 = r28
            r6 = r27
            r12 = r11
            r16 = r14
            r18 = r11
            r20 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            r21 = this;
            java.lang.String r0 = "voiceCreatorUserId"
            r11 = r32
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            r12 = 0
            r13 = 0
            r14 = 0
            r19 = 63488(0xf800, float:8.8966E-41)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r0 = r21
            r1 = r22
            r10 = r31
            r9 = r30
            r8 = r29
            r7 = r28
            r6 = r27
            r16 = r14
            r18 = r12
            r20 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r21 = this;
            java.lang.String r0 = "voiceCreatorUserId"
            r11 = r32
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "voiceCreatorUserName"
            r12 = r33
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r13 = 0
            r14 = 0
            r18 = 0
            r19 = 61440(0xf000, float:8.6096E-41)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r0 = r21
            r1 = r22
            r6 = r27
            r10 = r31
            r9 = r30
            r8 = r29
            r7 = r28
            r16 = r14
            r20 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleTextStickerData(boolean r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34) {
        /*
            r21 = this;
            java.lang.String r0 = "voiceCreatorUserId"
            r11 = r32
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "voiceCreatorUserName"
            r12 = r33
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r14 = 0
            r18 = 0
            r19 = 57344(0xe000, float:8.0356E-41)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r0 = r21
            r1 = r22
            r6 = r27
            r7 = r28
            r13 = r34
            r10 = r31
            r9 = r30
            r8 = r29
            r16 = r14
            r20 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData.<init>(boolean, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String voiceCreatorUserId, String voiceCreatorUserName, boolean z2, long j) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, voiceCreatorUserId, voiceCreatorUserName, z2, j, 0L, null, 49152, 0 == true ? 1 : 0);
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String voiceCreatorUserId, String voiceCreatorUserName, boolean z2, long j, long j2) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, voiceCreatorUserId, voiceCreatorUserName, z2, j, j2, null, 32768, 0 == true ? 1 : 0);
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasReadTextAudio ? 1 : 0);
        out.writeString(this.speakerID);
        out.writeInt(this.audioTrackIndex);
        out.writeString(this.audioTrackFilePath);
        out.writeInt(this.audioTrackDuration);
        out.writeString(this.audioText);
        out.writeString(this.voiceEffectId);
        out.writeString(this.voiceEffectIconUrl);
        out.writeString(this.voiceAnchorName);
        out.writeString(this.voiceEffectResourceId);
        out.writeString(this.voiceCreatorUserId);
        out.writeString(this.voiceCreatorUserName);
        out.writeInt(this.isCreatorVoice ? 1 : 0);
        out.writeLong(this.ttsAnchorReleaseDate);
        out.writeLong(this.ttsReleaseDate);
        Map<String, String> map = this.ttsExtraMap;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public final long getTtsAnchorReleaseDate() {
        return this.ttsAnchorReleaseDate;
    }

    public final Map<String, String> getTtsExtraMap() {
        return this.ttsExtraMap;
    }

    public final long getTtsReleaseDate() {
        return this.ttsReleaseDate;
    }

    public final String getVoiceAnchorName() {
        return this.voiceAnchorName;
    }

    public final String getVoiceCreatorUserId() {
        return this.voiceCreatorUserId;
    }

    public final String getVoiceCreatorUserName() {
        return this.voiceCreatorUserName;
    }

    public final String getVoiceEffectIconUrl() {
        return this.voiceEffectIconUrl;
    }

    public final String getVoiceEffectId() {
        return this.voiceEffectId;
    }

    public final String getVoiceEffectResourceId() {
        return this.voiceEffectResourceId;
    }

    public final boolean isCreatorVoice() {
        return this.isCreatorVoice;
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setCreatorVoice(boolean z) {
        this.isCreatorVoice = z;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public final void setVoiceAnchorName(String str) {
        this.voiceAnchorName = str;
    }

    public final void setVoiceCreatorUserId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.voiceCreatorUserId = str;
    }

    public final void setVoiceCreatorUserName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.voiceCreatorUserName = str;
    }

    public final void setVoiceEffectIconUrl(String str) {
        this.voiceEffectIconUrl = str;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceEffectResourceId(String str) {
        this.voiceEffectResourceId = str;
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String voiceCreatorUserId, String voiceCreatorUserName, boolean z2, long j, long j2, Map<String, String> ttsExtraMap) {
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(ttsExtraMap, "ttsExtraMap");
        this.hasReadTextAudio = z;
        this.speakerID = str;
        this.audioTrackIndex = i;
        this.audioTrackFilePath = str2;
        this.audioTrackDuration = i2;
        this.audioText = str3;
        this.voiceEffectId = str4;
        this.voiceEffectIconUrl = str5;
        this.voiceAnchorName = str6;
        this.voiceEffectResourceId = str7;
        this.voiceCreatorUserId = voiceCreatorUserId;
        this.voiceCreatorUserName = voiceCreatorUserName;
        this.isCreatorVoice = z2;
        this.ttsAnchorReleaseDate = j;
        this.ttsReleaseDate = j2;
        this.ttsExtraMap = ttsExtraMap;
    }

    public /* synthetic */ SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, long j, long j2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : str6, (i3 & 512) == 0 ? str7 : null, (i3 & 1024) != 0 ? "" : str8, (i3 & 2048) == 0 ? str9 : "", (i3 & 4096) == 0 ? z2 : false, (i3 & FileUtils.BUFFER_SIZE) != 0 ? 0L : j, (i3 & 16384) == 0 ? j2 : 0L, (i3 & 32768) != 0 ? new LinkedHashMap() : map);
    }
}
