package com.ss.android.ugc.gamora.editor.audio.tts.base.model;

import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSAudioParam {

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_path_list")
    public List<String> audioPathList;

    @InterfaceC65349Pkn("old_text")
    public String audioText;

    @InterfaceC65349Pkn("audio_track_duration")
    public int audioTrackDuration;

    @InterfaceC65349Pkn("audio_track_file_path")
    public String audioTrackFilePath;

    @InterfaceC65349Pkn("audio_track_index")
    public int audioTrackIndex;

    @InterfaceC65349Pkn("mEndTime")
    public int endTime;

    @InterfaceC65349Pkn("has_read_text_audio")
    public boolean hasReadTextAudio;

    @InterfaceC65349Pkn("nle_uuid")
    public String nleUuid;

    @InterfaceC65349Pkn("mStartTime")
    public int startTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTSAudioParam() {
        /*
            r12 = this;
            r1 = 0
            r5 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r1
            r8 = r5
            r9 = r5
            r11 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam.<init>():void");
    }

    public TTSAudioParam(int i, int i2, int i3, int i4, String str, String nleUuid, boolean z, List<String> audioPathList, String str2) {
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        this.startTime = i;
        this.endTime = i2;
        this.audioTrackDuration = i3;
        this.audioTrackIndex = i4;
        this.audioTrackFilePath = str;
        this.nleUuid = nleUuid;
        this.hasReadTextAudio = z;
        this.audioPathList = audioPathList;
        this.audioText = str2;
    }

    public /* synthetic */ TTSAudioParam(int i, int i2, int i3, int i4, String str, String str2, boolean z, List list, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? -1 : i4, (i5 & 16) != 0 ? null : str, (i5 & 32) != 0 ? "" : str2, (i5 & 64) == 0 ? z : false, (i5 & 128) != 0 ? new ArrayList() : list, (i5 & 256) == 0 ? str3 : null);
    }
}
