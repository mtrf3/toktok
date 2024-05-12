package X;

import com.bytedance.hybrid.spark.SparkContext;
import org.json.JSONObject;

/* renamed from: X.ExS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38106ExS implements InterfaceC38137Exx {
    public final /* synthetic */ SparkContext LIZ;
    public final /* synthetic */ C37948Euu LIZIZ;

    @Override // X.InterfaceC38137Exx
    public final void LIZ(Object obj) {
        Object LIZ;
        JSONObject jSONObject;
        EnumC39924Flg enumC39924Flg;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj != null) {
            try {
                LIZ = new JSONObject(C65358Pkw.LIZ.LJIILL(obj));
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = jSONObject2;
            }
            jSONObject = (JSONObject) LIZ;
        } else {
            jSONObject = new JSONObject();
        }
        if (!jSONObject.has("code")) {
            jSONObject.put("code", 1);
        }
        InterfaceC60710NsA interfaceC60710NsA = this.LIZ.hybridParams;
        if (interfaceC60710NsA != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg != EnumC39924Flg.WEB) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("data", jSONObject);
            jSONObject3.put("code", jSONObject.optInt("code", 1));
            jSONObject = jSONObject3;
        }
        this.LIZIZ.LIZ(1, "success", jSONObject);
    }

    @Override // X.InterfaceC38137Exx
    public final void LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        EnumC39924Flg enumC39924Flg;
        JSONObject jSONObject3;
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        InterfaceC60710NsA interfaceC60710NsA = this.LIZ.hybridParams;
        if (interfaceC60710NsA != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg == EnumC39924Flg.WEB) {
            jSONObject3 = jSONObject2;
        } else {
            jSONObject3 = new JSONObject();
            if (jSONObject != null) {
                jSONObject3.put("data", jSONObject2);
            }
        }
        jSONObject3.put("code", jSONObject2.optInt("code", 1));
        this.LIZIZ.LIZ(1, "raw", jSONObject3);
    }

    @Override // X.InterfaceC38137Exx
    public final void onFailed(Throwable th) {
        int i;
        String str;
        EnumC39924Flg enumC39924Flg;
        Throwable cause;
        if (th instanceof C38138Exy) {
            i = ((C38138Exy) th).LJLIL;
        } else {
            i = 0;
        }
        JSONObject LIZLLL = C770830u.LIZLLL("code", i);
        if (th == null || (cause = th.getCause()) == null || (str = cause.getMessage()) == null) {
            str = "";
        }
        LIZLLL.put("error_msg", str);
        InterfaceC60710NsA interfaceC60710NsA = this.LIZ.hybridParams;
        if (interfaceC60710NsA != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg != EnumC39924Flg.WEB) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", LIZLLL);
            LIZLLL = jSONObject;
        }
        LIZLLL.put("code", i);
        this.LIZIZ.LIZ(0, "onfail", LIZLLL);
    }

    public C38106ExS(SparkContext sparkContext, C37945Eur c37945Eur) {
        this.LIZ = sparkContext;
        this.LIZIZ = c37945Eur;
    }
}
