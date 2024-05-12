package com.ss.android.ugc.aweme.jsbridge;

import X.C16880lQ;
import X.C37876Etk;
import X.C37962Ev8;
import X.C38066Ewo;
import X.C38943FQd;
import X.C65083PgV;
import X.E8M;
import X.EJ6;
import X.EnumC38015Evz;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC37276Ek4;
import X.InterfaceC38033EwH;
import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class JsBridge2PermissionConfigurator implements InterfaceC38033EwH {

    /* loaded from: classes7.dex */
    public interface NetRequest {
        @E8M
        InterfaceC37276Ek4<String> postBody(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);
    }

    public final Collection<String> LIZJ() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("webcast");
        return linkedList;
    }

    public final String LIZIZ() {
        return C38943FQd.LIZ();
    }

    public final String LIZLLL() {
        String LIZIZ = C37962Ev8.LIZIZ();
        try {
            JSONObject put = new JSONObject().put("is_empty", TextUtils.isEmpty(LIZIZ));
            if (!TextUtils.isEmpty(LIZIZ)) {
                put.put("res_length", LIZIZ.length());
            }
            C37876Etk.LIZJ("jsb_auth_jsb2_PermissionConfigResponse", put);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return LIZIZ;
    }

    public final EnumC38015Evz LJ() {
        return EnumC38015Evz.US;
    }

    public static void LJFF(String str) {
        Boolean valueOf;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = null;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Boolean.valueOf(str.isEmpty());
            } catch (Exception e) {
                try {
                    jSONObject.put("exception", e.getMessage());
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        jSONObject.put("body_null_or_empty", valueOf);
        if (str != null && !"".equals(str)) {
            JSONObject jSONObject3 = new JSONObject(str);
            JSONObject optJSONObject = jSONObject3.optJSONObject("data");
            if (optJSONObject != null) {
                jSONObject2 = optJSONObject.optJSONObject("packages");
            }
            JSONObject put = jSONObject.put("status", jSONObject3.optInt("status", -1128));
            boolean z2 = false;
            if (optJSONObject == null) {
                z = true;
            } else {
                z = false;
            }
            JSONObject put2 = put.put("currentData_is_null", z);
            if (jSONObject2 == null) {
                z2 = true;
            }
            put2.put("currentPackages_is_null", z2);
        }
        C37876Etk.LIZJ("jsb_auth_jsb2_do_post_success", jSONObject);
    }

    public final void LIZ(String str, byte[] bArr, C38066Ewo c38066Ewo) {
        try {
            NetRequest netRequest = (NetRequest) C65083PgV.LJIIIIZZ(NetRequest.class, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EJ6("ContentType", "application/json"));
            String str2 = netRequest.postBody(str, new TypedByteArray(null, bArr, new String[0]), arrayList).execute().LIZIZ;
            c38066Ewo.LIZIZ(str2);
            LJFF(str2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            c38066Ewo.LIZ(e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", e.getMessage());
            } catch (Exception unused) {
            }
            C37876Etk.LIZJ("jsb_auth_jsb2_do_post_failed", jSONObject);
        }
    }
}
