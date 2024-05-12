package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EbJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36733EbJ {
    public static final /* synthetic */ InterfaceC74236TBo[] LJII;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final java.util.Map<String, String> LJFF;
    public final List<String> LJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36733EbJ.class), "hostRegMatcher", "getHostRegMatcher()Lkotlin/text/Regex;");
        C65352Pkq.LIZ.getClass();
        LJII = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C36733EbJ.class), "hashRegMatcher", "getHashRegMatcher()Lkotlin/text/Regex;")};
    }

    public final List LIZ(C36730EbG c36730EbG) {
        if (TextUtils.isEmpty(this.LIZLLL) && TextUtils.isEmpty(this.LJ) && this.LJFF == null) {
            LIZIZ(c36730EbG);
            return this.LJI;
        }
        String str = (String) c36730EbG.LIZIZ.getValue();
        if (TextUtils.isEmpty(this.LIZLLL) || ((OJD) this.LIZ.getValue()).matches(str)) {
            String str2 = (String) c36730EbG.LIZLLL.getValue();
            if (TextUtils.isEmpty(this.LJ) || ((OJD) this.LIZIZ.getValue()).matches(str2)) {
                SortedMap sortedMap = (SortedMap) c36730EbG.LIZJ.getValue();
                if (this.LJFF != null) {
                    if (sortedMap.size() < this.LJFF.size()) {
                        return null;
                    }
                    for (Map.Entry<String, String> entry : this.LJFF.entrySet()) {
                        if (!sortedMap.containsKey(entry.getKey())) {
                            return null;
                        }
                        String value = entry.getValue();
                        if (value.length() != 0) {
                            OJD ojd = new OJD(value);
                            String str3 = (String) sortedMap.get(entry.getKey());
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (!ojd.matches(str3)) {
                                return null;
                            }
                        }
                    }
                }
                LIZIZ(c36730EbG);
                return this.LJI;
            }
            return null;
        }
        return null;
    }

    public final void LIZIZ(C36730EbG c36730EbG) {
        String LLD = ORZ.LLD(this.LJI, null, null, null, C35434DvS.LJLIL, 31);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[scheme:");
        LIZ.append(c36730EbG.LJ);
        LIZ.append("] matchRule:");
        LIZ.append(this.LIZJ);
        LIZ.append(" matchApis:");
        LIZ.append(LLD);
        C36762Ebm.LIZ(X1D.LIZIZ(LIZ));
    }

    public C36733EbJ(String str, JSONObject jsonObject) {
        o.LJIIJ(jsonObject, "jsonObject");
        LinkedHashMap linkedHashMap = null;
        String optString = jsonObject.optString("host", null);
        String optString2 = jsonObject.optString("hash", null);
        JSONArray optJSONArray = jsonObject.optJSONArray("query");
        if (optJSONArray != null) {
            linkedHashMap = new LinkedHashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                String optString3 = jSONObject.optString("key");
                o.LJFF(optString3, "obj.optString(\"key\")");
                String optString4 = jSONObject.optString("value");
                o.LJFF(optString4, "obj.optString(\"value\")");
                linkedHashMap.put(optString3, optString4);
            }
        }
        List<String> LIZJ = C36748EbY.LIZJ(JSONObjectProtectorUtils.getJSONArray(jsonObject, "prefetch_apis"));
        this.LIZJ = str;
        this.LIZLLL = optString;
        this.LJ = optString2;
        this.LJFF = linkedHashMap;
        this.LJI = LIZJ;
        this.LIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 82));
        this.LIZIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 81));
    }
}
