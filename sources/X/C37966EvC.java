package X;

import Y.ARunnableS2S1201000_6;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EvC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37966EvC extends AbstractC37959Ev5 {
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final C37904EuC LJIIIIZZ;

    @Override // X.AbstractC37959Ev5
    public final String LJIIL() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37966EvC(C37904EuC context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJIIIIZZ = context;
        this.LJ = "JSB3BridgeImpl";
        this.LJFF = "JSBridge";
        this.LJI = "Native2JSBridge";
        this.LJII = "JS2NativeBridge";
    }

    @Override // X.AbstractC37959Ev5
    public final C37955Ev1 LJIIJ(String msg) {
        String str;
        o.LJIIJ(msg, "msg");
        JSONObject jSONObject = new JSONObject(msg);
        C37955Ev1 c37955Ev1 = new C37955Ev1(this.LJIIIIZZ);
        String optString = jSONObject.optString("__callback_id");
        o.LJFF(optString, "obj.optString(\"__callback_id\")");
        c37955Ev1.LIZJ = optString;
        String optString2 = jSONObject.optString("func");
        o.LJFF(optString2, "obj.optString(\"func\")");
        c37955Ev1.LIZLLL = optString2;
        String optString3 = jSONObject.optString("token");
        o.LJFF(optString3, "obj.optString(\"token\")");
        c37955Ev1.LJIIL = optString3;
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZIZ;
        if (interfaceC37958Ev4 == null || (str = interfaceC37958Ev4.getUrl()) == null) {
            str = "";
        }
        c37955Ev1.LJ = str;
        String optString4 = jSONObject.optString("__msg_type");
        o.LJFF(optString4, "obj.optString(\"__msg_type\")");
        c37955Ev1.LJFF = optString4;
        c37955Ev1.LJIIJ = jSONObject.optLong("__timestamp", System.currentTimeMillis());
        c37955Ev1.LJI = jSONObject.opt("params");
        String optString5 = jSONObject.optString("JSSDK");
        o.LJFF(optString5, "obj.optString(\"JSSDK\")");
        c37955Ev1.LJII = optString5;
        String optString6 = jSONObject.optString("namespace");
        o.LJFF(optString6, "obj.optString(\"namespace\")");
        c37955Ev1.LJIIIIZZ = optString6;
        String optString7 = jSONObject.optString("__iframe_url");
        o.LJFF(optString7, "obj.optString(\"__iframe_url\")");
        c37955Ev1.LJIIIZ = optString7;
        c37955Ev1.LIZIZ(EnumC37907EuF.Web);
        c37955Ev1.LJIIJJI = msg;
        String optString8 = jSONObject.optString("secure_token");
        if (optString8 == null || optString8.length() == 0) {
            Object obj = c37955Ev1.LJI;
            if (obj instanceof JSONObject) {
                if (obj != null) {
                    String optString9 = ((JSONObject) obj).optString("_jsb_secure_token");
                    o.LJFF(optString9, "(params as JSONObject).o…ring(\"_jsb_secure_token\")");
                    c37955Ev1.LIZ = optString9;
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type org.json.JSONObject");
                }
            }
        } else {
            String optString10 = jSONObject.optString("secure_token");
            o.LJFF(optString10, "obj.optString(\"secure_token\")");
            c37955Ev1.LIZ = optString10;
        }
        return c37955Ev1;
    }

    public final String LJIILLIIL(JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("javascript:if(window.");
        LIZ.append(this.LJFF);
        LIZ.append(" && window.");
        C1DI.LIZIZ(LIZ, this.LJFF, "._handleMessageFromApp){ ", "window.");
        LIZ.append(this.LJFF);
        LIZ.append(" && window.");
        LIZ.append(this.LJFF);
        LIZ.append("._handleMessageFromApp(");
        LIZ.append(jSONObject);
        LIZ.append(')');
        LIZ.append("} else if(window.");
        LIZ.append(this.LJI);
        LIZ.append(" && window.");
        C1DI.LIZIZ(LIZ, this.LJI, "._handleMessageFromApp){ ", "window.");
        LIZ.append(this.LJI);
        LIZ.append(" && window.");
        LIZ.append(this.LJI);
        LIZ.append("._handleMessageFromApp(");
        LIZ.append(jSONObject);
        LIZ.append(')');
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @JavascriptInterface
    public final String _invokeMethod(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "5767719041941913890");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "_invokeMethod", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "_invokeMethod", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        LJIIZILJ(null, str);
        c03880Dg.LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "_invokeMethod", null, objArr, this, c65300Pk0, true);
        return null;
    }

    public static JSONObject LJIILL(String str, String str2) {
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.opt("func") == null) {
                String optString = jSONObject.optString("namespace", "");
                o.LJFF(optString, "msg.optString(\"namespace\", \"\")");
                if (optString.length() != 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(jSONObject.optString("namespace", ""));
                    LIZ.append('.');
                    LIZ.append(str);
                    str = X1D.LIZIZ(LIZ);
                }
                jSONObject.put("func", str);
            }
            return jSONObject;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC37959Ev5
    public final String LJIIJJI(C37955Ev1 call, C37911EuJ c37911EuJ) {
        o.LJIIJ(call, "call");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__callback_id", call.LIZJ);
            jSONObject.put("__params", c37911EuJ.LIZIZ(call));
            jSONObject.put("__msg_type", "callback");
            return LJIILLIIL(jSONObject);
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return "";
        }
    }

    @Override // X.AbstractC37959Ev5
    public final void LJIILJJIL(String event, JSONObject jSONObject) {
        Object LIZ;
        o.LJIIJ(event, "event");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__msg_type", "event");
            jSONObject3.put("__event_id", event);
            jSONObject3.put("__callback_id", event);
            jSONObject3.put("__params", jSONObject2);
            AbstractC37959Ev5.LJIILIIL(this, LJIILLIIL(jSONObject3));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            String str = this.LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parse event failed,reason=");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            C37887Etv.LIZIZ(str, X1D.LIZIZ(LIZ2));
        }
    }

    public final void LJIIZILJ(String str, String str2) {
        try {
            this.LIZLLL.execute(new ARunnableS2S1201000_6(3, LJIILL(str, str2).toString(), this, new C37970EvG(), 1));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            C37970EvG c37970EvG = new C37970EvG();
            String type = EnumC37971EvH.H5.getType();
            o.LJIIJ(type, "type");
            c37970EvG.LJ = type;
            String channel = C39130FXi.LIZJ;
            o.LJIIJ(channel, "channel");
            c37970EvG.LIZLLL = channel;
            c37970EvG.LIZIZ = 0;
            C37932Eue.LIZLLL.getClass();
            C39130FXi c39130FXi = C37932Eue.LIZJ;
            if (c39130FXi != null) {
                c39130FXi.LIZ(c37970EvG.LIZ());
            }
        }
    }

    @JavascriptInterface
    public final String call(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "5767719041941913890");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "call", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "call", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        LJIIZILJ(str, str2);
        c03880Dg.LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "call", null, objArr, this, c65300Pk0, true);
        return null;
    }
}
