package X;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS177S0100000_11;

/* loaded from: classes12.dex */
public final class P3N {
    public static void LIZ(AudioRecord audioRecord, Cert cert) {
        try {
            P3K p3k = new P3K(audioRecord);
            OHW LIZ = C78946Uyc.LIZ(cert, new String[]{"audio"}, "audio_start", 100400);
            C78929UyL.LIZIZ(LIZ, "android/media/AudioRecord", "startRecording()V", null);
            C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(p3k, 3));
        } catch (Exception e) {
            P4Q.LIZIZ(P3N.class, "Exception occur:", e);
        }
    }

    public static void LIZIZ(AudioRecord audioRecord, Cert cert) {
        try {
            P3L p3l = new P3L(audioRecord);
            OHW LIZ = C78946Uyc.LIZ(cert, new String[]{"audio"}, "audio_stop", 100401);
            C78929UyL.LIZIZ(LIZ, "android/media/AudioRecord", "stop()V", null);
            C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(p3l, 4));
        } catch (Exception e) {
            P4Q.LIZIZ(P3N.class, "Exception occur:", e);
        }
    }
}
