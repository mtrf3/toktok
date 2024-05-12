package X;

import Y.ARunnableS2S1201000_6;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EvE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37968EvE extends AbstractC37959Ev5 {
    public final String LJ;
    public final C37904EuC LJFF;

    @Override // X.AbstractC37959Ev5
    public final String LJIIL() {
        return "ToutiaoJSBridge";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37968EvE(C37904EuC context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJFF = context;
        this.LJ = "JSB3BridgeImpl";
    }

    @Override // X.AbstractC37959Ev5
    public final C37955Ev1 LJIIJ(String msg) {
        String str;
        o.LJIIJ(msg, "msg");
        C37955Ev1 c37955Ev1 = new C37955Ev1(this.LJFF);
        try {
            JSONObject jSONObject = new JSONObject(msg);
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
            c37955Ev1.LJIIJ = jSONObject.optLong("__timestamp", System.currentTimeMillis());
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
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c37955Ev1;
    }

    @JavascriptInterface
    public final void invokeMethod(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "5767719041940990369");
        if (c03880Dg.LIZJ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB2Impl", "invokeMethod", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB2Impl", "invokeMethod", null, objArr, this, c65300Pk0, false);
        } else {
            this.LIZLLL.execute(new ARunnableS2S1201000_6(2, str, this, null, 1));
            c03880Dg.LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB2Impl", "invokeMethod", null, objArr, this, c65300Pk0, true);
        }
    }

    @Override // X.AbstractC37959Ev5
    public final String LJIIJJI(C37955Ev1 call, C37911EuJ c37911EuJ) {
        o.LJIIJ(call, "call");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__callback_id", call.LIZJ);
        jSONObject.put("__params", c37911EuJ.LIZIZ(call));
        jSONObject.put("__msg_type", "callback");
        if (!TextUtils.isEmpty(call.LJIIIZ)) {
            String str = call.LJIIIZ;
            Charset charset = PVC.LIZ;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 2);
                o.LJFF(encodeToString, "Base64.encodeToString(iF…eArray(), Base64.NO_WRAP)");
                String LLLZ = C16880lQ.LLLZ("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                o.LJFF(LLLZ, "java.lang.String.format(format, *args)");
                byte[] bytes2 = LLLZ.getBytes(charset);
                o.LJFF(bytes2, "(this as java.lang.String).getBytes(charset)");
                String encodeToString2 = Base64.encodeToString(bytes2, 2);
                o.LJFF(encodeToString2, "Base64.encodeToString(\n …e64.NO_WRAP\n            )");
                String LLLZ2 = C16880lQ.LLLZ("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Arrays.copyOf(new Object[]{encodeToString2, jSONObject, encodeToString}, 3));
                o.LJFF(LLLZ2, "java.lang.String.format(format, *args)");
                return LLLZ2;
            }
            throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("javascript:");
        LIZ.append("ToutiaoJSBridge");
        LIZ.append("._handleMessageFromToutiao(");
        LIZ.append(jSONObject);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC37959Ev5
    public final void LJIILJJIL(String event, JSONObject jSONObject) {
        o.LJIIJ(event, "event");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", event);
            jSONObject2.put("__params", jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("javascript:window.");
            LIZ.append("ToutiaoJSBridge");
            LIZ.append(" && ");
            LIZ.append("ToutiaoJSBridge");
            LIZ.append("._handleMessageFromToutiao && ");
            LIZ.append("ToutiaoJSBridge");
            LIZ.append("._handleMessageFromToutiao(");
            LIZ.append(jSONObject2);
            LIZ.append(')');
            AbstractC37959Ev5.LJIILIIL(this, X1D.LIZIZ(LIZ));
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                String str = this.LJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("parse event failed,reason=");
                LIZ2.append(LJFF.getMessage());
                C37887Etv.LIZIZ(str, X1D.LIZIZ(LIZ2));
            }
        }
    }
}
