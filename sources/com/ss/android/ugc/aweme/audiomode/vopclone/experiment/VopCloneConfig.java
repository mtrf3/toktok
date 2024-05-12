package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.InterfaceC65349Pkn;
import X.UC7;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VopCloneConfig {

    @InterfaceC65349Pkn("channel")
    public final Integer channel;

    @InterfaceC65349Pkn("connection_timeout")
    public final Integer connectionTimeout;

    @InterfaceC65349Pkn("cut_off_length")
    public final Float cutoffLength;

    @InterfaceC65349Pkn("vop_hashtag_ids")
    public final List<HashtagId> hashtagIdGroup;

    @InterfaceC65349Pkn("show_vop_entry")
    public final Integer isShowVopEntry;

    @InterfaceC65349Pkn("language")
    public final Integer language;

    @InterfaceC65349Pkn("max_block_size")
    public final Integer maxBlockSize;

    @InterfaceC65349Pkn("model_key")
    public final String modelKey;

    @InterfaceC65349Pkn("record_max_duration")
    public final Integer recordMaxDuration;

    @InterfaceC65349Pkn("resample_rate")
    public final Integer resampleRate;

    @InterfaceC65349Pkn("sample_rate")
    public final Integer sampleRate;

    @InterfaceC65349Pkn("sample_text_content")
    public final String sampleTextContent;

    @InterfaceC65349Pkn("snr_threshold")
    public final Float snrThreshold;

    @InterfaceC65349Pkn("text_type")
    public final Integer textType;

    @InterfaceC65349Pkn("tts_server_url")
    public final String ttsServerUrl;

    @InterfaceC65349Pkn("vop_server_url")
    public final String vopServerUrl;

    @InterfaceC65349Pkn("vop_url")
    public final String webUrl;

    @InterfaceC65349Pkn("wer_failed_max_times")
    public final Integer werFailedMaxTimes;

    @InterfaceC65349Pkn("wer_threshold")
    public final Float werThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public VopCloneConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VopCloneConfig)) {
            return false;
        }
        VopCloneConfig vopCloneConfig = (VopCloneConfig) obj;
        return o.LJ(this.isShowVopEntry, vopCloneConfig.isShowVopEntry) && o.LJ(this.hashtagIdGroup, vopCloneConfig.hashtagIdGroup) && o.LJ(this.webUrl, vopCloneConfig.webUrl) && o.LJ(this.language, vopCloneConfig.language) && o.LJ(this.vopServerUrl, vopCloneConfig.vopServerUrl) && o.LJ(this.ttsServerUrl, vopCloneConfig.ttsServerUrl) && o.LJ(this.connectionTimeout, vopCloneConfig.connectionTimeout) && o.LJ(this.modelKey, vopCloneConfig.modelKey) && o.LJ(this.recordMaxDuration, vopCloneConfig.recordMaxDuration) && o.LJ(this.werThreshold, vopCloneConfig.werThreshold) && o.LJ(this.snrThreshold, vopCloneConfig.snrThreshold) && o.LJ(this.werFailedMaxTimes, vopCloneConfig.werFailedMaxTimes) && o.LJ(this.cutoffLength, vopCloneConfig.cutoffLength) && o.LJ(this.resampleRate, vopCloneConfig.resampleRate) && o.LJ(this.sampleTextContent, vopCloneConfig.sampleTextContent) && o.LJ(this.textType, vopCloneConfig.textType) && o.LJ(this.sampleRate, vopCloneConfig.sampleRate) && o.LJ(this.channel, vopCloneConfig.channel) && o.LJ(this.maxBlockSize, vopCloneConfig.maxBlockSize);
    }

    public final int hashCode() {
        Integer num = this.isShowVopEntry;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<HashtagId> list = this.hashtagIdGroup;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.webUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.language;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.vopServerUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ttsServerUrl;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.connectionTimeout;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.modelKey;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.recordMaxDuration;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.werThreshold;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.snrThreshold;
        int hashCode11 = (hashCode10 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num5 = this.werFailedMaxTimes;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f3 = this.cutoffLength;
        int hashCode13 = (hashCode12 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num6 = this.resampleRate;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.sampleTextContent;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num7 = this.textType;
        int hashCode16 = (hashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.sampleRate;
        int hashCode17 = (hashCode16 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.channel;
        int hashCode18 = (hashCode17 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.maxBlockSize;
        return hashCode18 + (num10 != null ? num10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VopCloneConfig(isShowVopEntry=");
        sb.append(this.isShowVopEntry);
        sb.append(", hashtagIdGroup=");
        sb.append(this.hashtagIdGroup);
        sb.append(", webUrl=");
        sb.append(this.webUrl);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", vopServerUrl=");
        sb.append(this.vopServerUrl);
        sb.append(", ttsServerUrl=");
        sb.append(this.ttsServerUrl);
        sb.append(", connectionTimeout=");
        sb.append(this.connectionTimeout);
        sb.append(", modelKey=");
        sb.append(this.modelKey);
        sb.append(", recordMaxDuration=");
        sb.append(this.recordMaxDuration);
        sb.append(", werThreshold=");
        sb.append(this.werThreshold);
        sb.append(", snrThreshold=");
        sb.append(this.snrThreshold);
        sb.append(", werFailedMaxTimes=");
        sb.append(this.werFailedMaxTimes);
        sb.append(", cutoffLength=");
        sb.append(this.cutoffLength);
        sb.append(", resampleRate=");
        sb.append(this.resampleRate);
        sb.append(", sampleTextContent=");
        sb.append(this.sampleTextContent);
        sb.append(", textType=");
        sb.append(this.textType);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channel=");
        sb.append(this.channel);
        sb.append(", maxBlockSize=");
        return UC7.LIZ(sb, this.maxBlockSize, ')');
    }

    public VopCloneConfig(Integer num, List<HashtagId> list, String str, Integer num2, String str2, String str3, Integer num3, String str4, Integer num4, Float f, Float f2, Integer num5, Float f3, Integer num6, String str5, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.isShowVopEntry = num;
        this.hashtagIdGroup = list;
        this.webUrl = str;
        this.language = num2;
        this.vopServerUrl = str2;
        this.ttsServerUrl = str3;
        this.connectionTimeout = num3;
        this.modelKey = str4;
        this.recordMaxDuration = num4;
        this.werThreshold = f;
        this.snrThreshold = f2;
        this.werFailedMaxTimes = num5;
        this.cutoffLength = f3;
        this.resampleRate = num6;
        this.sampleTextContent = str5;
        this.textType = num7;
        this.sampleRate = num8;
        this.channel = num9;
        this.maxBlockSize = num10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VopCloneConfig(java.lang.Integer r23, java.util.List r24, java.lang.String r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.String r30, java.lang.Integer r31, java.lang.Float r32, java.lang.Float r33, java.lang.Integer r34, java.lang.Float r35, java.lang.Integer r36, java.lang.String r37, java.lang.Integer r38, java.lang.Integer r39, java.lang.Integer r40, java.lang.Integer r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r21 = r41
            r0 = r42
            r20 = r40
            r9 = r29
            r8 = r28
            r7 = r27
            r5 = r25
            r3 = r23
            r4 = r24
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r2 = r0 & 1
            r1 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            if (r2 == 0) goto L30
            r3 = r6
        L30:
            r1 = r0 & 2
            if (r1 == 0) goto L35
            r4 = 0
        L35:
            r1 = r0 & 4
            if (r1 == 0) goto L3b
            java.lang.String r5 = "aweme://webview?url=https%3A%2F%2Fsami.tiktokv.com%2Fvop_h5%2Findex.html%3Fuse_spark%3D1%26sign_up_origin%3Dinbox%26is_first_enter%3D0"
        L3b:
            r1 = r0 & 8
            if (r1 == 0) goto Ld2
        L3f:
            r1 = r0 & 16
            if (r1 == 0) goto L45
            java.lang.String r7 = "http://sami-va.tiktokv.com/internal"
        L45:
            r1 = r0 & 32
            if (r1 == 0) goto L4b
            java.lang.String r8 = "http://sami-sg.tiktokv.com/internal"
        L4b:
            r1 = r0 & 64
            if (r1 == 0) goto L56
            r1 = 50000(0xc350, float:7.0065E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
        L56:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L5c
            java.lang.String r10 = "audio_metrics"
        L5c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L66
            r1 = 30000(0x7530, float:4.2039E-41)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
        L66:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L71
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
        L71:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L7b
            r1 = 1101004800(0x41a00000, float:20.0)
            java.lang.Float r13 = java.lang.Float.valueOf(r1)
        L7b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L84
            r1 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
        L84:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L8f
            r1 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r15 = java.lang.Float.valueOf(r1)
        L8f:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L99
            r1 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
        L99:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L9f
            java.lang.String r17 = ""
        L9f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto Lab
            r1 = 50
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
        Lab:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto Lb7
            r1 = 44100(0xac44, float:6.1797E-41)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
        Lb7:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto Lc1
            r1 = 1
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)
        Lc1:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto Lcc
            r0 = 512(0x200, float:7.17E-43)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
        Lcc:
            r2 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        Ld2:
            r6 = r26
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopCloneConfig.<init>(java.lang.Integer, java.util.List, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Float, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
