package X;

import Y.ARunnableS10S0301000_10;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7D {
    public static volatile O7D LIZ;

    public static boolean LIZLLL(O7E o7e, long[][] jArr) {
        if (o7e == null) {
            return false;
        }
        long LJII = o7e.LJII();
        long LJI = o7e.LJI();
        for (long[] jArr2 : jArr) {
            if (jArr2.length >= 2) {
                long j = jArr2[0];
                if (LJII <= jArr2[1] && LJI >= j) {
                    o7e.LJLJL = 10016;
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ(long[] jArr, long[][] jArr2) {
        synchronized (O74.class) {
            LIZIZ(O7I.LIZIZ().LIZ, jArr, jArr2);
            LIZIZ(O7I.LIZIZ().LIZIZ, jArr, jArr2);
        }
        C61359O6h.LJFF.execute(new ARunnableS10S0301000_10(this, jArr, jArr2, 1));
    }

    public static void LIZIZ(List list, long[] jArr, long[][] jArr2) {
        if (!C30591Hz.LJIILLIIL(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O7E o7e = (O7E) it.next();
                if (jArr != null) {
                    for (long j : jArr) {
                        if (o7e != null) {
                            if (o7e.LJLL == j) {
                                o7e.LJLJL = 10016;
                                break;
                            } else if (!C30591Hz.LJIILLIIL(o7e.LLFF)) {
                                Iterator it2 = ((ArrayList) o7e.LLFF).iterator();
                                while (it2.hasNext()) {
                                    O7E o7e2 = (O7E) it2.next();
                                    if (o7e2 != null && o7e2.LJLL == j) {
                                        o7e2.LJLJL = 10016;
                                    }
                                }
                            }
                        }
                    }
                }
                if (jArr2 != null && !LIZLLL(o7e, jArr2) && o7e != null && !C30591Hz.LJIILLIIL(o7e.LLFF)) {
                    Iterator it3 = ((ArrayList) o7e.LLFF).iterator();
                    while (it3.hasNext()) {
                        LIZLLL((O7E) it3.next(), jArr2);
                    }
                }
            }
        }
    }

    public static boolean LJ(JSONObject jSONObject, long[][] jArr, int i) {
        boolean z = false;
        if (jSONObject == null) {
            return false;
        }
        long optLong = (jSONObject.optLong("display_after") * 1000) + jSONObject.optLong("model_fetch_time");
        long optLong2 = (jSONObject.optLong("expire_seconds") * 1000) + optLong;
        for (long[] jArr2 : jArr) {
            if (jArr2.length >= 2) {
                long j = jArr2[0];
                if (optLong <= jArr2[1] && optLong2 >= j) {
                    try {
                        jSONObject.putOpt("callback_code", Integer.valueOf(i));
                        z = true;
                        return true;
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                        return z;
                    }
                }
            }
        }
        return false;
    }

    public static void LIZJ(String str, long[] jArr, long[][] jArr2, boolean z, int i) {
        JSONArray optJSONArray;
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            boolean z3 = false;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (jArr != null && optJSONObject != null) {
                    int length2 = jArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            long j = jArr[i3];
                            z2 = true;
                            if (optJSONObject.optLong("id") != j) {
                                JSONArray optJSONArray2 = optJSONObject.optJSONArray("interval_creative");
                                if (optJSONArray2 != null) {
                                    int length3 = optJSONArray2.length();
                                    for (int i4 = 0; i4 < length3; i4++) {
                                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i4);
                                        if (optJSONObject2 != null && optJSONObject2.optLong("id") == j) {
                                            optJSONObject2.put("callback_code", i);
                                            z3 = true;
                                        }
                                    }
                                }
                                i3++;
                            } else {
                                optJSONObject.put("callback_code", i);
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    z3 |= z2;
                    if (z2) {
                    }
                }
                if (jArr2 != null) {
                    boolean LJ = LJ(optJSONObject, jArr2, i);
                    z3 |= LJ;
                    if (!LJ && optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("interval_creative")) != null) {
                        int length4 = optJSONArray.length();
                        for (int i5 = 0; i5 < length4; i5++) {
                            z3 |= LJ(optJSONArray.optJSONObject(i5), jArr2, i);
                        }
                    }
                }
            }
            if (z3) {
                if (z) {
                    O76 LJI = O76.LJI();
                    LJI.LIZJ.LJI("splash_ad_first_show_data", jSONArray.toString());
                    LJI.LIZJ();
                } else {
                    O76 LJI2 = O76.LJI();
                    LJI2.LJIILIIL(jSONArray.toString());
                    LJI2.LIZJ();
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
