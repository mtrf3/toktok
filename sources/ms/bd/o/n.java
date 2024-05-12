package ms.bd.o;

import X.C64009PAf;
import X.InterfaceC64016PAm;
import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class n extends m {
    public C64009PAf LIZIZ;

    /* loaded from: classes7.dex */
    public class a implements InterfaceC64016PAm {
        public final /* synthetic */ JSONObject LIZ;
        public final /* synthetic */ String LIZIZ;

        public a(JSONObject jSONObject, String str) {
            this.LIZ = jSONObject;
            this.LIZIZ = str;
        }

        @Override // X.InterfaceC64016PAm
        public final Map<String, String> getCommonParams() {
            int i;
            HashMap hashMap = new HashMap();
            try {
                i = 0;
                hashMap.put(k.a(16777217, 0, 0L, "46dc3b", new byte[]{42, 34, 18, 5, 31, 112, 54}), JSONObjectProtectorUtils.getBoolean(this.LIZ, (String) k.a(16777217, 0, 0L, "92ec25", new byte[]{39, 38, 19, 5, 30, 39, 59})) ? k.a(16777217, 0, 0L, "d63885", new byte[]{36}) : k.a(16777217, 0, 0L, "ae0dee", new byte[]{32}));
            } catch (JSONException unused) {
                i = 0;
                k.a(16777217, 0, 0L, "1ab70f", new byte[]{51, 102, 28, 124, 8, 98});
            }
            hashMap.put(k.a(16777217, i, 0L, "f3c721", new byte[]{Byte.MAX_VALUE, 62, 3, 87, 50, 39, 108, 22}), this.LIZIZ);
            return hashMap;
        }

        @Override // X.InterfaceC64016PAm
        public final String getSessionId() {
            return null;
        }
    }

    @Override // ms.bd.o.m
    public final void LIZJ(long j, long j2, String str, String str2, int i) {
        C64009PAf c64009PAf = this.LIZIZ;
        if (c64009PAf == null) {
            return;
        }
        c64009PAf.LJIIIZ(j, j2, str, null, str2, i, null);
    }

    @Override // ms.bd.o.m
    public final void LIZLLL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZIZ == null) {
            return;
        }
        if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
            this.LIZIZ.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    @Override // ms.bd.o.m
    public final void LJFF(long j, long j2, String str, String str2, int i) {
        C64009PAf c64009PAf = this.LIZIZ;
        if (c64009PAf == null) {
            return;
        }
        c64009PAf.LJIIJJI(j, j2, str, null, str2, i, null);
    }

    @Override // ms.bd.o.m
    public final boolean LJ(String str) {
        JSONObject jSONObject;
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Context context = ms.bd.o.a.LIZIZ.LIZ;
        String str4 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            k.a(16777217, 0, 0L, "0f1158", new byte[]{50, 97, 79});
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            str3 = JSONObjectProtectorUtils.getString(jSONObject, (String) k.a(16777217, 0, 0L, "92a5b6", new byte[]{59, 52, 25, 126, 92, 40, 62}));
            try {
                str4 = JSONObjectProtectorUtils.getString(jSONObject, (String) k.a(16777217, 0, 0L, "69a3d8", new byte[]{47, 52, 1, 83, 100, 46, 60, 28}));
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, (String) k.a(16777217, 0, 0L, "aedb78", new byte[]{115, 104, 25, 16, 1, 40, 87, 118, 25, 33}));
                JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, (String) k.a(16777217, 0, 0L, "454d79", new byte[]{55, 50, 87, 31, 26, 58, 2, 38, 73, 39}));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                }
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(JSONArrayProtectorUtils.getString(jSONArray2, i2));
                }
            } catch (JSONException unused2) {
                str2 = str4;
                str4 = str3;
                k.a(16777217, 0, 0L, "f3d8bc", new byte[]{100, 52, 26, 115, 84});
                str3 = str4;
                str4 = str2;
                jSONObject.remove((String) k.a(16777217, 0, 0L, "3ca93a", new byte[]{33, 110, 28, 75, 5, 113, 5, 112, 28, 122}));
                jSONObject.remove((String) k.a(16777217, 0, 0L, "1185d3", new byte[]{50, 54, 91, 78, 73, 48, 7, 34, 69, 118}));
                SDKMonitorUtils.LIZJ(context, str3, jSONObject, new a(jSONObject, str4));
                this.LIZIZ = SDKMonitorUtils.LIZIZ(str3);
                return true;
            }
        } catch (JSONException unused3) {
            str2 = null;
        }
        if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
            return false;
        }
        SDKMonitorUtils.LIZLLL(str3, arrayList);
        SDKMonitorUtils.LJ(str3, arrayList2);
        jSONObject.remove((String) k.a(16777217, 0, 0L, "3ca93a", new byte[]{33, 110, 28, 75, 5, 113, 5, 112, 28, 122}));
        jSONObject.remove((String) k.a(16777217, 0, 0L, "1185d3", new byte[]{50, 54, 91, 78, 73, 48, 7, 34, 69, 118}));
        SDKMonitorUtils.LIZJ(context, str3, jSONObject, new a(jSONObject, str4));
        this.LIZIZ = SDKMonitorUtils.LIZIZ(str3);
        return true;
    }
}
