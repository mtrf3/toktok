package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.Pj8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65246Pj8 {
    public static final Object LJ = new Object();
    public static volatile C65246Pj8 LJFF;
    public final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C65248PjA> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C65247Pj9> LIZJ = new ConcurrentHashMap<>();
    public final boolean LIZLLL = true;

    public static C65246Pj8 LIZ() {
        if (LJFF == null) {
            synchronized (LJ) {
                if (LJFF == null) {
                    LJFF = new C65246Pj8();
                }
            }
        }
        return LJFF;
    }

    public final void LIZIZ(long j, boolean z, boolean z2, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j2;
        if (this.LIZLLL && !C38354F3m.LJ(str)) {
            int i5 = 0;
            if (C64747Pb5.LJFF != null) {
                i = C48189Ivh.LJ(C64747Pb5.LJFF.LIZ).getValue();
            } else {
                i = 0;
            }
            if (i == EnumC48190Ivi.WIFI.getValue() || i == EnumC48190Ivi.MOBILE_4G.getValue() || i == EnumC48190Ivi.MOBILE_3G.getValue() || i == EnumC48190Ivi.MOBILE_3G_H.getValue() || i == EnumC48190Ivi.MOBILE_3G_HP.getValue() || i == EnumC48190Ivi.MOBILE_5G.getValue()) {
                try {
                    if ((C64747Pb5.LJFF == null || C64747Pb5.LJFF.LIZIZ != 2) && z2) {
                        if (this.LIZJ.containsKey("p.pstap.com")) {
                            C65247Pj9 c65247Pj9 = this.LIZJ.get("p.pstap.com");
                            if (!z || j <= 0) {
                                c65247Pj9.LIZIZ++;
                            } else {
                                c65247Pj9.LIZ++;
                                c65247Pj9.LIZJ += j;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - c65247Pj9.LIZLLL > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                                int i6 = c65247Pj9.LIZ;
                                if (i6 > 0) {
                                    j2 = c65247Pj9.LIZJ / i6;
                                } else {
                                    j2 = 0;
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("error", c65247Pj9.LIZIZ);
                                jSONObject.put("success", c65247Pj9.LIZ);
                                jSONObject.put("average_duration", j2);
                                if (C64747Pb5.LJFF != null && C64747Pb5.LJFF.LIZIZ == 1) {
                                    jSONObject.put("has_opt", 1);
                                }
                                c65247Pj9.LIZIZ = 0;
                                c65247Pj9.LIZ = 0;
                                c65247Pj9.LIZJ = 0L;
                                c65247Pj9.LIZLLL = currentTimeMillis;
                            }
                        } else {
                            if (z) {
                                i4 = 0;
                            } else {
                                i4 = 1;
                            }
                            this.LIZJ.put("p.pstap.com", new C65247Pj9(z ? 1 : 0, i4, j));
                        }
                    }
                } catch (Throwable unused) {
                }
                if (C64747Pb5.LJFF != null && C64747Pb5.LJFF.LIZIZ == 1) {
                    try {
                        String host = android.net.Uri.parse(str).getHost();
                        if (this.LIZIZ.containsKey(host)) {
                            C65248PjA c65248PjA = this.LIZIZ.get(host);
                            if (c65248PjA == null || c65248PjA.LIZJ) {
                                return;
                            }
                            if (!z) {
                                c65248PjA.LIZ++;
                            }
                            c65248PjA.LIZIZ++;
                            int i7 = c65248PjA.LIZ;
                            if (C64747Pb5.LJFF != null && C64747Pb5.LJFF.LIZLLL > 0) {
                                i3 = C64747Pb5.LJFF.LIZLLL;
                            } else {
                                i3 = 5;
                            }
                            if (i7 >= i3 && (c65248PjA.LIZ * 100) / c65248PjA.LIZIZ >= 10) {
                                c65248PjA.LIZJ = true;
                                c65248PjA.LIZIZ = 0;
                                c65248PjA.LIZ = 0;
                                this.LIZ.put(host, Long.valueOf(System.currentTimeMillis()));
                                return;
                            }
                            if (c65248PjA.LIZIZ > c65248PjA.LIZLLL) {
                                c65248PjA.LIZIZ = 0;
                                c65248PjA.LIZ = 0;
                                c65248PjA.LIZJ = false;
                                return;
                            }
                            return;
                        }
                        if (!z) {
                            i5 = 1;
                        }
                        if (C64747Pb5.LJFF != null && C64747Pb5.LJFF.LJ > 0) {
                            i2 = C64747Pb5.LJFF.LJ;
                        } else {
                            i2 = 50;
                        }
                        this.LIZIZ.put(host, new C65248PjA(i5, i2));
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }
}
