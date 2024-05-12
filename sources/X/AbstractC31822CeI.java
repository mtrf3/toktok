package X;

import com.bytedance.android.livesdk.livesetting.other.LiveFileMonitorSampleSetting;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CeI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31822CeI {
    public final String LIZ;
    public final EnumC31874Cf8 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public volatile boolean LJFF;
    public volatile Boolean LJII;
    public volatile String LJ = "";
    public volatile int LJI = 50;
    public volatile int LJIIIIZZ = -1;

    public final int LIZIZ() {
        if (this.LJIIIIZZ > 0) {
            return this.LJIIIIZZ;
        }
        int sampleRate = LiveFileMonitorSampleSetting.INSTANCE.getSampleRate(this.LJ);
        if (sampleRate > 0) {
            this.LJIIIIZZ = sampleRate;
            return this.LJIIIIZZ;
        }
        this.LJIIIIZZ = this.LJI;
        return this.LJIIIIZZ;
    }

    public AbstractC31822CeI(String str, EnumC31874Cf8 enumC31874Cf8, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = enumC31874Cf8;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    public void LIZ(String ioType, JSONObject category, JSONObject metric, JSONObject extra) {
        o.LJIIIZ(ioType, "ioType");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(metric, "metric");
        o.LJIIIZ(extra, "extra");
        if (this.LIZLLL.length() > 0) {
            category.putOpt("mime_type", this.LIZLLL);
        }
        if (this.LIZJ.length() > 0) {
            extra.putOpt("sub_dir", this.LIZJ);
        }
        if (this.LJ.length() > 0) {
            category.putOpt("file_scene", this.LJ);
        }
        extra.putOpt("sample_config", Integer.valueOf(this.LJI));
        extra.putOpt("real_sample", Integer.valueOf(LIZIZ()));
    }
}
