package Y;

import X.C36922EeM;
import X.C38987FRv;
import X.C39179FZf;
import X.C46728IVo;
import X.C47497IkX;
import X.C48658J7u;
import X.C76800UCe;
import X.C78963Uyt;
import X.IT4;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS0S0203100_8 implements Callable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public long j5;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S0203100_8 aCallableS0S0203100_8) {
        int i;
        try {
            VideoUrlModel playAddr = ((Video) aCallableS0S0203100_8.l0).getPlayAddr();
            int videoLength = ((Video) aCallableS0S0203100_8.l0).getVideoLength();
            int LJIILL = C78963Uyt.LJIILL(playAddr);
            int LIZJ = C47497IkX.LIZJ();
            int LJ = C46728IVo.LJ(((Video) aCallableS0S0203100_8.l0).getPlayAddr()) / 1024;
            boolean isBytevc1 = ((IT4) aCallableS0S0203100_8.l1).isBytevc1();
            Integer cpuRate = C39179FZf.LIZIZ;
            if (cpuRate == null) {
                cpuRate = -1;
            }
            JSONObject jSONObject = new JSONObject();
            long j = aCallableS0S0203100_8.j5;
            int i2 = aCallableS0S0203100_8.i2;
            int i3 = aCallableS0S0203100_8.i3;
            int i4 = aCallableS0S0203100_8.i4;
            jSONObject.put("duration", j);
            jSONObject.put("vduration", videoLength * 1000);
            jSONObject.put("video_quality", LJIILL);
            jSONObject.put("internet_speed", LIZJ);
            jSONObject.put("pre_cache_size", LJ);
            jSONObject.put("video_bitrate", i2);
            jSONObject.put("play_bitrate", i3);
            jSONObject.put("is_bytevc1", isBytevc1);
            jSONObject.put("codec_name", i4);
            o.LJIIIIZZ(cpuRate, "cpuRate");
            jSONObject.put("cpu_rate", cpuRate.intValue());
            jSONObject.put("enter_from", "TEMAI");
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            if (LIZLLL.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i);
            C48658J7u.LIZIZ("video_play_quality", jSONObject);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS0S0203100_8 aCallableS0S0203100_8) {
        int i;
        try {
            VideoUrlModel playAddr = ((Video) aCallableS0S0203100_8.l0).getPlayAddr();
            int videoLength = ((Video) aCallableS0S0203100_8.l0).getVideoLength();
            int LJIILL = C78963Uyt.LJIILL(playAddr);
            int LIZJ = C47497IkX.LIZJ();
            int LJ = C46728IVo.LJ(((Video) aCallableS0S0203100_8.l0).getPlayAddr()) / 1024;
            boolean isBytevc1 = ((IT4) aCallableS0S0203100_8.l1).isBytevc1();
            Integer cpuRate = C39179FZf.LIZIZ;
            if (cpuRate == null) {
                cpuRate = -1;
            }
            JSONObject jSONObject = new JSONObject();
            long j = aCallableS0S0203100_8.j5;
            int i2 = aCallableS0S0203100_8.i2;
            int i3 = aCallableS0S0203100_8.i3;
            int i4 = aCallableS0S0203100_8.i4;
            jSONObject.put("duration", j);
            jSONObject.put("vduration", videoLength * 1000);
            jSONObject.put("video_quality", LJIILL);
            jSONObject.put("internet_speed", LIZJ);
            jSONObject.put("pre_cache_size", LJ);
            jSONObject.put("video_bitrate", i2);
            jSONObject.put("play_bitrate", i3);
            jSONObject.put("is_bytevc1", isBytevc1);
            jSONObject.put("codec_name", i4);
            o.LJIIIIZZ(cpuRate, "cpuRate");
            jSONObject.put("cpu_rate", cpuRate.intValue());
            jSONObject.put("enter_from", "TEMAI");
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            if (LIZLLL.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i);
            C48658J7u.LIZIZ("video_play_quality", jSONObject);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS0S0203100_8(int i, int i2, int i3, long j, Video video, IT4 it4, int i4) {
        this.$t = i4;
        this.l0 = video;
        this.l1 = it4;
        this.j5 = j;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
    }
}
