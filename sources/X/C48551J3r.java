package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.J3r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48551J3r implements InterfaceC48527J2t {
    public final OnePlaytimePredictRealConfig LIZ;

    public C48551J3r(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.LIZ = onePlaytimePredictRealConfig;
    }

    @Override // X.InterfaceC48527J2t
    public final boolean LIZ(JSONObject json, C47322Ihi input) {
        int i;
        String str;
        o.LJIIIZ(input, "input");
        o.LJIIIZ(json, "json");
        MLDataCenterService.Companion.getClass();
        C48585J4z feedTrackRangeInfo = C48563J4d.LIZ.getFeedTrackRangeInfo(null, this.LIZ.getCount(), false);
        if (feedTrackRangeInfo == null) {
            return false;
        }
        if (feedTrackRangeInfo.LJ.size() <= 0) {
            return true;
        }
        ArrayList<Long> arrayList = feedTrackRangeInfo.LJ;
        int type = this.LIZ.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            if (type != 5) {
                                i = 0;
                            } else {
                                C40675Fxn.LJJLIIIIJ(arrayList);
                                i = (int) ((Number) ListProtector.get(arrayList, arrayList.size() / 2)).longValue();
                            }
                        } else {
                            Iterator<Long> it = arrayList.iterator();
                            i = 1000000000;
                            while (it.hasNext()) {
                                Long duration = it.next();
                                o.LJIIIIZZ(duration, "duration");
                                if (duration.longValue() < i) {
                                    i = (int) duration.longValue();
                                }
                            }
                        }
                    } else {
                        Iterator<Long> it2 = arrayList.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            Long duration2 = it2.next();
                            o.LJIIIIZZ(duration2, "duration");
                            if (duration2.longValue() > i) {
                                i = (int) duration2.longValue();
                            }
                        }
                    }
                } else {
                    Iterator<Long> it3 = arrayList.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        i2 += (int) it3.next().longValue();
                    }
                    i = i2 / arrayList.size();
                }
            } else {
                Iterator<Long> it4 = arrayList.iterator();
                i = 0;
                while (it4.hasNext()) {
                    i += (int) it4.next().longValue();
                }
            }
            if (i >= this.LIZ.getDuration()) {
                str = "gt";
            } else {
                str = "lt";
            }
            json.put("ss_result", str);
            json.put("ff_result", Float.valueOf(i));
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<Long> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Long duration3 = it5.next();
                o.LJIIIIZZ(duration3, "duration");
                jSONArray.put(duration3.longValue());
            }
            json.put("ss_result", jSONArray.toString());
        }
        return false;
    }
}
