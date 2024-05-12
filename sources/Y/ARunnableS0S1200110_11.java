package Y;

import X.C116304hO;
import X.C34903Dmt;
import X.C36152EGu;
import X.C38354F3m;
import X.C38861FMz;
import X.C38987FRv;
import X.C38995FSd;
import X.C53240Kuy;
import X.C56672Kh;
import X.C64350PNi;
import X.C64446PRa;
import X.C64447PRb;
import X.C64453PRh;
import X.C76W;
import X.EF7;
import X.FAK;
import X.FMX;
import X.FN1;
import X.HandlerThreadC36423ERf;
import X.InterfaceC64427PQh;
import X.J8Z;
import X.PH9;
import X.PRV;
import X.PRZ;
import X.Q8U;
import X.WM7;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import defpackage.i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS0S1200110_11 implements Runnable {
    public final int $t;
    public double d4;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        final String valueOf;
        Iterator<String> keys;
        String str;
        int i;
        String str2;
        InterfaceC64427PQh LIZ;
        Map<String, Long> LIZIZ;
        int i2;
        C76W c76w = (C76W) this.l1;
        final String str3 = this.s0;
        long j = this.j3;
        double d = this.d4;
        JSONObject jSONObject = (JSONObject) this.l2;
        c76w.LIZ("ui_scene", str3);
        c76w.LIZ("duration", String.valueOf(j));
        c76w.LIZ("is_first_launch_app", String.valueOf(C36152EGu.LJI()));
        if (d > 60.0d) {
            valueOf = "60";
        } else {
            valueOf = String.valueOf(((int) (100 * d)) / 100.0d);
        }
        c76w.LIZ("ui_fps", valueOf);
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            float f = PH9.LIZ;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                int parseInt = CastIntegerProtector.parseInt(key);
                int optInt = jSONObject.optInt(key);
                if (optInt > 0) {
                    if (i8 < parseInt) {
                        i8 = parseInt;
                    }
                    if (parseInt >= 3) {
                        i3 += (int) (optInt * parseInt * f);
                    } else if (parseInt != 0) {
                        if (parseInt < 3) {
                            i4 += optInt;
                        }
                    }
                    if (parseInt < 7) {
                        i5 += optInt;
                    } else if (parseInt < 14) {
                        i6 += optInt;
                    } else {
                        i7 += optInt;
                    }
                }
            }
            c76w.LIZ("block_duration", String.valueOf(i3));
            final float f2 = 0 + i5 + i6 + i7;
            c76w.LIZ("drop_x_count", String.valueOf(f2));
            c76w.LIZ("level_1", String.valueOf(i4));
            c76w.LIZ("level_2", String.valueOf(i5));
            c76w.LIZ("level_3", String.valueOf(i6));
            c76w.LIZ("level_4", String.valueOf(i7));
            if (C53240Kuy.LIZIZ(str3)) {
                c76w.LIZ("dropXDetail", C64453PRh.LIZ(str3).LIZLLL(f2).toString());
            }
            if (o.LJ(str3, "system_launch") || o.LJ(str3, "homepage_hot")) {
                C56672Kh.LIZ().LJIJI(CastFloatProtector.parseFloat(valueOf), i0.LJFF(str3, "_fps"));
                FAK LIZ2 = C56672Kh.LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str3);
                LIZ3.append("_dropXCount");
                LIZ2.LJIJI(f2, X1D.LIZIZ(LIZ3));
                if (C38354F3m.LIZJ(EF7.LJIILIIL, "qtp")) {
                    C38995FSd.LJFF().execute(new Runnable() { // from class: X.2rC
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ4;
                            try {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append(str3);
                                LIZ5.append(':');
                                LIZ5.append(valueOf);
                                LIZ5.append(':');
                                LIZ5.append(f2);
                                C74242vk.LIZ(X1D.LIZIZ(LIZ5));
                            } finally {
                                if (LIZ4) {
                                }
                            }
                        }
                    });
                }
            }
            C64446PRa c64446PRa = null;
            if (FN1.LIZ && (LIZ = C38861FMz.LIZ(str3)) != null && (LIZIZ = LIZ.LIZIZ()) != null && !LIZIZ.isEmpty()) {
                for (Map.Entry<String, Long> entry : LIZIZ.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        c76w.LIZ(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            PRV LIZ4 = PRZ.LIZ(str3);
            String str4 = "-1";
            String str5 = "unknow";
            if (LIZ4 instanceof C64447PRb) {
                str = "-1";
            } else {
                C64446PRa[] c64446PRaArr = LIZ4.LIZ;
                if (c64446PRaArr != null) {
                    int length = c64446PRaArr.length;
                    int i9 = LIZ4.LIZJ;
                    if (i9 < length) {
                        c64446PRa = c64446PRaArr[i9];
                    }
                }
                if (c64446PRa != null) {
                    str5 = c64446PRa.LIZ;
                    o.LJIIIIZZ(str5, "it.pidName");
                    i = 1;
                    str2 = Q8U.LIZIZ(new Object[]{Float.valueOf(c64446PRa.LJI)}, 1, "%.3f", "format(format, *args)");
                } else {
                    i = 1;
                    str2 = "-1";
                }
                C64446PRa c64446PRa2 = LIZ4.LIZIZ;
                if (c64446PRa2 != null) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Float.valueOf(c64446PRa2.LJI);
                    str4 = Q8U.LIZIZ(objArr, i, "%.3f", "format(format, *args)");
                }
                str = str4;
                str4 = str2;
            }
            c76w.LIZ("cpu_type", str5);
            c76w.LIZ("cpu_use", str4);
            c76w.LIZ("total_cpu_use", str);
            if (((Boolean) C34903Dmt.LIZ.getValue()).booleanValue()) {
                long j2 = J8Z.LIZ + 1;
                J8Z.LIZ = j2;
                if (j2 == Long.MAX_VALUE) {
                    J8Z.LIZ = 0L;
                }
                c76w.LIZ("index", String.valueOf(J8Z.LIZ));
            }
        }
        JSONObject LIZIZ2 = ((C76W) this.l1).LIZIZ();
        try {
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            if (LIZLLL.booleanValue()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            LIZIZ2.put("is_cold_start_first_launch", i2);
        } catch (Throwable unused) {
        }
        FMX.LJIILJJIL("ui_sample_report", LIZIZ2);
        C116304hO.LIZ(this.s0, LIZIZ2);
    }

    public final void LIZ$1() {
        String valueOf;
        HashMap hashMap = new HashMap();
        hashMap.put(WM7.SCENE_SERVICE, this.s0);
        hashMap.put("duration", String.valueOf(this.j3));
        double d = this.d4;
        if (d > 60.0d) {
            valueOf = "60";
        } else {
            valueOf = String.valueOf(d);
        }
        hashMap.put("fps", valueOf);
        C64350PNi c64350PNi = (C64350PNi) this.l1;
        JSONObject jSONObject = (JSONObject) this.l2;
        c64350PNi.getClass();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            float f = PH9.LIZ;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                int parseInt = CastIntegerProtector.parseInt(key);
                int optInt = jSONObject.optInt(key);
                if (optInt > 0) {
                    if (i3 < parseInt) {
                        i3 = parseInt;
                    }
                    if (parseInt >= 3) {
                        i2 += (int) (optInt * parseInt * f);
                    } else {
                        if (parseInt != 0) {
                            if (parseInt < 3) {
                                i4 += optInt;
                            }
                        }
                        i += optInt;
                    }
                    if (parseInt < 7) {
                        i5 += optInt;
                    } else if (parseInt < 14) {
                        i6 += optInt;
                    } else {
                        i7 += optInt;
                    }
                    i += optInt;
                }
            }
            hashMap.put("total_frame", String.valueOf(i));
            hashMap.put("block_duration", String.valueOf(i2));
            hashMap.put("drop_max", String.valueOf(i3));
            hashMap.put("weighted_drop_count", String.valueOf(0 + i5 + i6 + i7));
            hashMap.put("level_1", String.valueOf(i4));
            hashMap.put("level_2", String.valueOf(i5));
            hashMap.put("level_3", String.valueOf(i6));
            hashMap.put("level_4", String.valueOf(i7));
        }
        JSONObject jSONObject2 = new JSONObject(hashMap);
        C64350PNi c64350PNi2 = (C64350PNi) this.l1;
        synchronized (c64350PNi2) {
            LagDataCallback lagDataCallback = c64350PNi2.LJLILLLLZI;
            if (lagDataCallback != null) {
                o.LJI(lagDataCallback);
                lagDataCallback.onDataAvailable(jSONObject2);
            } else {
                HandlerThreadC36423ERf.LIZJ().LJ(new ARunnableS47S0100000_11(jSONObject2, 166));
            }
        }
    }

    public static final void run$0(ARunnableS0S1200110_11 aRunnableS0S1200110_11) {
        boolean LIZ;
        try {
            aRunnableS0S1200110_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1200110_11 aRunnableS0S1200110_11) {
        boolean LIZ;
        try {
            aRunnableS0S1200110_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1200110_11(Object obj, String str, long j, double d, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j3 = j;
        this.d4 = d;
        this.l2 = obj2;
    }
}
