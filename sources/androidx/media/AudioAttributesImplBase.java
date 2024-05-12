package androidx.media;

import X.KMP;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZLLL)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.LIZLLL != -1) {
            sb.append(" stream=");
            sb.append(this.LIZLLL);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.LIZ;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = KMP.LJ("unknown usage ", i);
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.LIZIZ);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.LIZJ).toUpperCase());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r4 == 7) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.media.AudioAttributesImplBase
            r7 = 0
            if (r0 != 0) goto L6
            return r7
        L6:
            androidx.media.AudioAttributesImplBase r9 = (androidx.media.AudioAttributesImplBase) r9
            int r1 = r8.LIZIZ
            int r0 = r9.LIZIZ
            if (r1 != r0) goto L2d
            int r6 = r8.LIZJ
            int r5 = r9.LIZJ
            int r4 = r9.LIZLLL
            r3 = -1
            r2 = 7
            r0 = 6
            r1 = 1
            if (r4 == r3) goto L31
            if (r4 != r0) goto L2e
        L1c:
            r5 = r5 | 4
        L1e:
            r0 = r5 & 273(0x111, float:3.83E-43)
            if (r6 != r0) goto L2d
            int r1 = r8.LIZ
            int r0 = r9.LIZ
            if (r1 != r0) goto L2d
            int r0 = r8.LIZLLL
            if (r0 != r4) goto L2d
            r7 = 1
        L2d:
            return r7
        L2e:
            if (r4 != r2) goto L1e
            goto L38
        L31:
            int r2 = r9.LIZ
            r0 = r5 & 1
            if (r0 != r1) goto L3b
        L38:
            r5 = r5 | 1
            goto L1e
        L3b:
            r1 = r5 & 4
            r0 = 4
            if (r1 != r0) goto L41
            goto L1c
        L41:
            switch(r2) {
                case 2: goto L1e;
                case 3: goto L1e;
                case 4: goto L1e;
                case 5: goto L1e;
                case 6: goto L1e;
                case 7: goto L1e;
                case 8: goto L1e;
                case 9: goto L1e;
                case 10: goto L1e;
                case 11: goto L1e;
                case 12: goto L1e;
                case 13: goto L1e;
                default: goto L44;
            }
        L44:
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }
}
