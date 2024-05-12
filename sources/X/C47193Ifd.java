package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.vcloud.strategy.IAppService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ifd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47193Ifd implements IAppService {
    public final WeakReference<C47529Il3> LIZ;

    public C47193Ifd(C47529Il3 c47529Il3) {
        this.LIZ = new WeakReference<>(c47529Il3);
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getPortrait(String str, String str2) {
        C47529Il3 c47529Il3 = this.LIZ.get();
        if (c47529Il3 == null || c47529Il3.LIZJ == null) {
            return null;
        }
        HashMap LIZ = C45243HpH.LIZ("type", "one", "from", str);
        LIZ.put("name", str2);
        c47529Il3.LIZJ.getClass();
        HashMap hashMap = (HashMap) C47192Ifc.LIZ(LIZ);
        if (hashMap.containsKey(str2)) {
            return (String) hashMap.get(str2);
        }
        return "";
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getPortraits(String str, String str2) {
        C47529Il3 c47529Il3 = this.LIZ.get();
        if (c47529Il3 == null || c47529Il3.LIZJ == null) {
            return null;
        }
        HashMap LIZ = C45243HpH.LIZ("type", "group", "name", str2);
        LIZ.put("from", str);
        c47529Il3.LIZJ.getClass();
        return new JSONObject(C47192Ifc.LIZ(LIZ)).toString();
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final void addGroupConfig(String str, String str2, String str3) {
        C47529Il3 c47529Il3 = this.LIZ.get();
        if (c47529Il3 == null || c47529Il3.LIZJ == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str3);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
        } catch (Throwable unused) {
        }
        HashMap LIZ = C45243HpH.LIZ("from", str, "name", str2);
        c47529Il3.LIZJ.getClass();
        C47189IfZ c47189IfZ = C47190Ifa.LIZ;
        c47189IfZ.getClass();
        if (LIZ.isEmpty() || arrayList.isEmpty()) {
            return;
        }
        String str4 = (String) LIZ.get("from");
        String str5 = (String) LIZ.get("name");
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (c47189IfZ.LIZ != null && "smart".equals(str4)) {
            c47189IfZ.LIZ.addGroupConfig(str5, arrayList2);
        } else {
            if (!"video".equals(str4)) {
                return;
            }
            ((HashMap) c47189IfZ.LIZIZ).put(str5, arrayList2);
        }
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getMediaPortrait(String str, String str2, String str3) {
        C47529Il3 c47529Il3 = this.LIZ.get();
        if (c47529Il3 == null || c47529Il3.LIZJ == null) {
            return null;
        }
        HashMap LIZ = C45243HpH.LIZ("type", "one", "name", str3);
        LIZ.put("video_id", str2);
        LIZ.put("from", str);
        c47529Il3.LIZJ.getClass();
        return new JSONObject(C47192Ifc.LIZ(LIZ)).toString();
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getMediaPortraits(String str, String str2, String str3) {
        C47529Il3 c47529Il3 = this.LIZ.get();
        if (c47529Il3 == null || c47529Il3.LIZJ == null) {
            return null;
        }
        HashMap LIZ = C45243HpH.LIZ("type", "group", "name", str3);
        LIZ.put("video_id", str2);
        LIZ.put("from", str);
        c47529Il3.LIZJ.getClass();
        return new JSONObject(C47192Ifc.LIZ(LIZ)).toString();
    }
}
