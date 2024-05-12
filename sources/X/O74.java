package X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O74 {
    public static volatile O74 LJIIJJI;
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public O7E LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final List<Runnable> LJIIIZ = FII.LIZ();
    public final List<Runnable> LJIIJ = FII.LIZ();

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(3:3|(1:5)(1:7)|6)|8|(2:10|(4:12|13|(1:15)|16))(1:77)|18|(2:20|ce)|34|(8:(1:39)(1:66)|40|(1:42)(1:65)|43|(2:45|(2:46|(2:48|(5:51|52|53|54|55)(1:50))(1:63)))(1:64)|56|(1:58)|59)|67|(1:69)|70|71|72|73|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c6, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.O8F LIZ() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O74.LIZ():X.O8F");
    }

    public static O74 LIZIZ() {
        if (LJIIJJI == null) {
            synchronized (O74.class) {
                if (LJIIJJI == null) {
                    LJIIJJI = new O74();
                }
            }
        }
        return LJIIJJI;
    }

    public static Pair LIZJ() {
        java.util.Map<String, int[][]> map;
        int[] iArr;
        Pair pair;
        if (O7I.LIZIZ().LJIIIZ != null) {
            map = O7I.LIZIZ().LJIIIZ.LIZ;
        } else {
            map = null;
        }
        long LJII = O77.LJII();
        int i = 14;
        int i2 = 13;
        int i3 = 12;
        int i4 = 11;
        boolean z = true;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                String str = (String) entry.getKey();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        long parseLong = CastLongProtector.parseLong(str) * 1000;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(LJII);
                        calendar.set(i4, 0);
                        calendar.set(i3, 0);
                        calendar.set(i2, 0);
                        calendar.set(i, 0);
                        if (parseLong == calendar.getTimeInMillis()) {
                            int[][] iArr2 = (int[][]) entry.getValue();
                            if (iArr2 != null && iArr2.length > 0) {
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.setTimeInMillis(LJII);
                                calendar2.set(i4, 0);
                                calendar2.set(i3, 0);
                                calendar2.set(i2, 0);
                                calendar2.set(i, 0);
                                long timeInMillis = LJII - calendar2.getTimeInMillis();
                                for (int i5 = 0; i5 < iArr2.length; i5++) {
                                    if (iArr2[i5].length >= 2) {
                                        long j = r5[0] * 1000;
                                        long j2 = r5[1] * 1000;
                                        if (j <= timeInMillis && timeInMillis <= j2) {
                                            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
                                            break;
                                        }
                                    }
                                }
                            }
                            pair = null;
                            if (pair == null) {
                                break;
                            }
                            iArr = iArr2[((Integer) pair.second).intValue()];
                            break;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i = 14;
                    i2 = 13;
                    i3 = 12;
                    i4 = 11;
                }
            }
        }
        iArr = null;
        long LIZJ = O76.LJI().LIZJ.LIZJ("key_splash_ad_showed_time", -1L);
        if (LIZJ > LJII) {
            LIZJ = 0;
        }
        if (iArr != null) {
            C1DJ.LJIJJ(", is skippable: ");
            if (iArr.length >= 2) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(LJII);
                calendar3.set(11, 0);
                calendar3.set(12, 0);
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                long timeInMillis2 = calendar3.getTimeInMillis();
                long j3 = (iArr[0] * 1000) + timeInMillis2;
                if (LIZJ > (iArr[1] * 1000) + timeInMillis2 || LIZJ < j3) {
                    z = false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" whether first-show-timegap opportunity has been consumed : ");
                LIZ.append(z);
                C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
            }
            if (!z) {
                LJFF("hour_show", iArr);
                C1DJ.LJIJJ("It is currently within the time range of the first refresh of the time period, and there is no excessive time period for the first refresh of the advertisement, and the selection of the first refresh of the time period begins.");
                return new Pair(Boolean.TRUE, iArr);
            }
        }
        return new Pair(Boolean.FALSE, iArr);
    }

    public static void LIZLLL(int i) {
        C61352O6a.LIZ().getClass();
        O8O.LIZLLL().LJIIIZ("service_splash_ad_show_result", i, null);
    }

    public final void LJ(boolean z) {
        this.LJIIIIZZ = false;
        if (C61359O6h.LJII().LJIILLIIL) {
            boolean z2 = C61359O6h.LJJIIZ;
            if (!C61359O6h.LJII().LJIILLIIL) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (z2) {
                if (Math.abs(currentTimeMillis - this.LIZJ) < O7I.LIZIZ().LJI) {
                    return;
                }
            } else if (Math.abs(currentTimeMillis - C61359O6h.LJII) < O7I.LIZIZ().LIZLLL || Math.abs(currentTimeMillis - this.LIZIZ) < O7I.LIZIZ().LIZJ) {
                return;
            }
        }
        O76 LJI = O76.LJI();
        LJI.LIZJ.LJ(LJI.LJII() + 1, "key_splash_ad_show_sequence");
        LJI.LIZJ();
        HashMap<String, Object> hashMap = new HashMap<>(1);
        hashMap.put("ad_sequence", Integer.valueOf(O76.LJI().LJII()));
        hashMap.put("show_limit", Integer.valueOf(z ? 1 : 0));
        int i = C61359O6h.LJJIJIIJI;
        if (i != -1) {
            hashMap.put("is_cold_start", Integer.valueOf(i));
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(1);
        hashMap2.put("log_extra", O76.LJI().LJ());
        O79.LIZIZ().LJI(null, 84378473382L, "valid_stock", hashMap2, hashMap);
        C1DJ.LJIJJ("sending stock request");
        if (C61359O6h.LIZJ != null) {
            long j = C61359O6h.LJJIJL;
            if (j <= 0) {
                j = 2000;
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new O7P(z), j);
        }
        O76 LJI2 = O76.LJI();
        LJI2.LIZJ.LJFF(System.currentTimeMillis(), "splash_last_stock_time");
        LJI2.LIZJ();
        this.LIZIZ = System.currentTimeMillis();
        if (this.LJFF && C61359O6h.LJJJJZ) {
            C1DJ.LJIJJ(" consuming first-show ad opportunity ");
            O76 LJI3 = O76.LJI();
            LJI3.LIZJ.LIZ.LIZIZ.putBoolean("splash_ad_has_first_refresh", true);
            LJI3.LIZJ();
        }
        this.LJIIIIZZ = true;
    }

    public final void LJII(int i) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("today_show_count", Integer.valueOf(O76.LJI().LJIIIZ()));
        hashMap.put("failed_reason", Integer.valueOf(i));
        hashMap.put("stock_time_interval_valid", Integer.valueOf(this.LJIIIIZZ ? 1 : 0));
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("log_extra", O76.LJI().LJ());
        O79.LIZIZ().LJI(null, 84378473382L, "splash_show_failed", hashMap2, hashMap);
    }

    public static void LJFF(String str, int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length == 2) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("log_extra", O7I.LIZIZ().LIZJ());
                    jSONObject2.put("first_show_period", jSONArray);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("is_ad_event", "1");
                    O79.LIZIZ().LIZLLL("splash_ad", str, jSONObject, 84378473382L);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void LJI(int i, O7E o7e) {
        String str;
        String LJIIJJI2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", o7e.LJLZ);
            JSONObject jSONObject2 = new JSONObject();
            if (i != 1) {
                if (i != 2) {
                    str = "";
                    LJIIJJI2 = "";
                } else {
                    str = "not_download_video";
                    LJIIJJI2 = O77.LJIJ(o7e.LLI);
                }
            } else {
                str = "not_download_image";
                LJIIJJI2 = O77.LJIIJJI(o7e.LJLIL);
            }
            jSONObject2.putOpt("reason", str);
            jSONObject2.putOpt("url", LJIIJJI2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(o7e.LJLILLLLZI));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        O79.LIZIZ().LIZLLL("splash_ad", "not_showing_reason", jSONObject, o7e.LJLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x042e, code lost:
    
        if (r7 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0430, code lost:
    
        r15 = 0;
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0434, code lost:
    
        r15 = 0;
        r4 = 4;
        r14 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x042b, code lost:
    
        if (r7 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r7 == 4) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.util.List<X.O7E> r31, X.O8F r32) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O74.LJIIL(java.util.List, X.O8F):void");
    }

    public static void LJIIIIZZ(boolean z, long j, boolean z2, boolean z3) {
        Object obj;
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1");
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject2.putOpt("status", obj);
            jSONObject.putOpt("log_extra", O7I.LIZIZ().LIZJ());
            if (!z) {
                if (!z2) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.putOpt("is_penalty_period", str);
            } else {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                if (!z3) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.putOpt("stop_show", str);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        O79.LIZIZ().LIZLLL("splash_ad", "stop_showing_monitor", jSONObject, 84378473382L);
    }

    public static void LJIIIZ(O7E o7e, int i, int i2, int i3) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("status", Integer.valueOf(i));
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("index", Integer.valueOf(i3));
        hashMap.put("load_type", Integer.valueOf(o7e.LLII));
        if (O77.LJIJJ(o7e)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_topview", str);
        O79.LIZIZ().LJI(o7e, 0L, "pick_model", null, hashMap);
    }

    public final O7E LJIIJ(List<O7E> list, int[] iArr, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return LJIIJJI(list, iArr, i, z, z2, z3, z4, -1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.O7E LJIIJJI(java.util.List<X.O7E> r24, int[] r25, int r26, boolean r27, boolean r28, boolean r29, boolean r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O74.LJIIJJI(java.util.List, int[], int, boolean, boolean, boolean, boolean, int, boolean):X.O7E");
    }
}
