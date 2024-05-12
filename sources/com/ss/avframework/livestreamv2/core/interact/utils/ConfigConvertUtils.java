package com.ss.avframework.livestreamv2.core.interact.utils;

import com.ss.avframework.livestreamv2.core.interact.model.Config;

/* loaded from: classes12.dex */
public class ConfigConvertUtils {
    public static Config.AudioSampleRate convertInt2SampleRate(int i) {
        if (i != 16000) {
            if (i != 32000) {
                if (i != 48000) {
                    return Config.AudioSampleRate.SAMPLE_RATE_44K;
                }
                return Config.AudioSampleRate.SAMPLE_RATE_48K;
            }
            return Config.AudioSampleRate.SAMPLE_RATE_32K;
        }
        return Config.AudioSampleRate.SAMPLE_RATE_16K;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r2.equals("hev2") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r2.equals("hev1") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.avframework.livestreamv2.core.interact.model.Config.AudioProfile convertStr2AudioProfile(java.lang.String r2) {
        /*
            java.lang.String r2 = r2.toLowerCase()
            int r1 = r2.hashCode()
            if (r1 == 0) goto L3f
            r0 = 3447(0xd77, float:4.83E-42)
            if (r1 == r0) goto L36
            r0 = 3343801(0x3305b9, float:4.685663E-39)
            if (r1 == r0) goto L2d
            switch(r1) {
                case 3199032: goto L22;
                case 3199033: goto L19;
                default: goto L16;
            }
        L16:
            com.ss.avframework.livestreamv2.core.interact.model.Config$AudioProfile r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioProfile.LC
            return r0
        L19:
            java.lang.String r0 = "hev2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            goto L2a
        L22:
            java.lang.String r0 = "hev1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
        L2a:
            com.ss.avframework.livestreamv2.core.interact.model.Config$AudioProfile r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioProfile.HE
            return r0
        L2d:
            java.lang.String r0 = "main"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            goto L16
        L36:
            java.lang.String r0 = "lc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            goto L16
        L3f:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.utils.ConfigConvertUtils.convertStr2AudioProfile(java.lang.String):com.ss.avframework.livestreamv2.core.interact.model.Config$AudioProfile");
    }

    public static Config.VideoCodec convertStr2VideoCodec(String str) {
        String lowerCase = str.toLowerCase();
        int hashCode = lowerCase.hashCode();
        if (hashCode != 0) {
            if (hashCode != 3148040) {
                if (hashCode == 355428636 && lowerCase.equals("bytevc1")) {
                    return Config.VideoCodec.BYTEVC1;
                }
            } else if (lowerCase.equals("h264")) {
            }
        } else if (lowerCase.equals("")) {
            return null;
        }
        return Config.VideoCodec.H264;
    }
}
