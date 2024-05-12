package X;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P35 {
    public static void LIZIZ(AudioRecord release, Cert cert) {
        o.LJIIJ(release, "$this$release");
        OHW LIZ = LIZ(100403, cert, "audio_release");
        C78929UyL.LIZIZ(LIZ, "android/media/AudioRecord", "release()V", null);
        C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(release, 37));
    }

    public static void LIZJ(AudioRecord startRecording, Cert cert) {
        o.LJIIJ(startRecording, "$this$startRecording");
        OHW LIZ = LIZ(100400, cert, "audio_start");
        C78929UyL.LIZIZ(LIZ, "android/media/AudioRecord", "startRecording()V", null);
        C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(startRecording, 38));
    }

    public static void LIZLLL(AudioRecord stop, Cert cert) {
        o.LJIIJ(stop, "$this$stop");
        OHW LIZ = LIZ(100401, cert, "audio_stop");
        C78929UyL.LIZIZ(LIZ, "android/media/AudioRecord", "stop()V", null);
        C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(stop, 39));
    }

    public static OHW LIZ(int i, Cert cert, String str) {
        return new OHW(cert, str, new String[]{"audio"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }
}
