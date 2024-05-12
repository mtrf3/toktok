package Y;

import X.C03660Ck;
import X.C09970aH;
import X.C0K2;
import X.C0M2;
import X.C0NB;
import X.C19820qA;
import X.C25500zK;
import X.C38921fs;
import X.C64089PDh;
import X.C64125PEr;
import X.EnumC18150nT;
import X.InterfaceC31203CMl;
import X.O5Y;
import X.PEE;
import X.PGQ;
import X.WM7;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS3S0100100 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C0M2 c0m2 = (C0M2) this.l0;
        long j = this.j1;
        c0m2.getClass();
        try {
            String LIZJ = C25500zK.LIZJ(SystemClock.uptimeMillis(), C25500zK.LIZIZ(0L, j));
            if (!TextUtils.isEmpty(LIZJ)) {
                JSONObject LIZ = C64125PEr.LIZLLL().LIZ();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
                jSONObject.put("block_duration", 5000L);
                jSONObject.put("stack", LIZJ);
                jSONObject.put("stack_key", "1048574\n");
                jSONObject.put(WM7.SCENE_SERVICE, "anr");
                jSONObject.put("cost_time", 5000L);
                jSONObject.put("method_time", 5000L);
                jSONObject.put("message", "anr");
                jSONObject.put("event_type", "lag_drop_frame");
                JSONObject LIZJ2 = PGQ.LIZ().LIZJ(true);
                LIZJ2.put("crash_section", C09970aH.LJI(System.currentTimeMillis()));
                LIZJ2.put("trace_type", "ANR");
                jSONObject.put("custom", LIZ);
                jSONObject.put("filters", LIZJ2);
                C64089PDh.LJIIJ().LIZLLL(new PEE("drop_frame_stack", jSONObject));
            }
        } catch (Throwable unused) {
        }
        Iterator<PEE> it = ((C0M2) this.l0).LIZLLL.iterator();
        while (it.hasNext()) {
            PEE next = it.next();
            try {
                JSONObjectProtectorUtils.getJSONObject(next.LIZIZ, "filters").put("before_anr", "true");
                next.LIZJ = true;
            } catch (Throwable unused2) {
            }
            C64089PDh.LJIIJ().LIZLLL(next);
        }
        ((C0M2) this.l0).LIZLLL.clear();
    }

    public static final void run$0(IDRunnableS3S0100100 iDRunnableS3S0100100) {
        boolean LIZ;
        try {
            iDRunnableS3S0100100.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS3S0100100 iDRunnableS3S0100100) {
        Uri uri = (Uri) iDRunnableS3S0100100.l0;
        long j = iDRunnableS3S0100100.j1;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri);
        } catch (JSONException unused) {
        }
        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
        if (interfaceC31203CMl != null) {
            interfaceC31203CMl.LJII(0, jSONObject);
        }
        if (j > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put("url", uri);
            } catch (JSONException unused2) {
            }
            C0K2.LIZJ("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
            float f = (float) j;
            InterfaceC31203CMl interfaceC31203CMl2 = C0K2.LIZ;
            if (interfaceC31203CMl2 != null) {
                interfaceC31203CMl2.LJIIZILJ(f);
            }
            C0NB.LIZIZ("image_monitor", "no cache = " + uri + " duration = " + j);
        }
        String uri2 = uri.toString();
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(O5Y.LJJL("ttlive_image_load_status"))) {
            C0K2.LJIILJJIL(0, j, O5Y.LJJL("ttlive_image_load_status"), C03660Ck.LIZJ("url", uri2));
        }
    }

    public static final void run$2(IDRunnableS3S0100100 iDRunnableS3S0100100) {
        boolean LIZ;
        try {
            ((C19820qA) iDRunnableS3S0100100.l0).LIZ(EnumC18150nT.LOW_DEVICE_TIP, iDRunnableS3S0100100.j1, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS3S0100100 iDRunnableS3S0100100) {
        boolean LIZ;
        try {
            ((C38921fs) iDRunnableS3S0100100.l0).LJIIIZ(iDRunnableS3S0100100.j1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS3S0100100(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
