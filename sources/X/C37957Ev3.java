package X;

import Y.ARunnableS2S1201000_6;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ev3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37957Ev3 extends AbstractC37959Ev5 implements InterfaceC37901Eu9 {
    public final String LJ;
    public final String LJFF;
    public final C37904EuC LJI;

    @Override // X.InterfaceC37901Eu9
    public final void LIZLLL(String url) {
        o.LJIIJ(url, "url");
    }

    @Override // X.AbstractC37959Ev5
    public final String LJIIL() {
        return "";
    }

    @Override // X.AbstractC37959Ev5
    public final void LJIILJJIL(String event, JSONObject jSONObject) {
        o.LJIIJ(event, "event");
    }

    @Override // X.InterfaceC37901Eu9
    public final void onDestroy() {
    }

    @Override // X.AbstractC37959Ev5, X.AbstractC37899Eu7
    public final void LJIIIIZZ() {
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZ.LIZLLL;
        if (interfaceC37958Ev4 != null) {
            interfaceC37958Ev4.LJFF(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37957Ev3(C37904EuC context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJI = context;
        this.LJ = "bytedance";
        this.LJFF = "IESJSBridgeSupport";
    }

    @Override // X.InterfaceC37901Eu9
    public final boolean LIZIZ(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.LJ)) {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJFF(parse, "Uri.parse(url)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase();
                o.LJFF(str2, "(this as java.lang.String).toLowerCase()");
            } else {
                str2 = null;
            }
            if (o.LJ(this.LJ, str2) && LJIILL(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37901Eu9
    public final void LIZJ(String url) {
        o.LJIIJ(url, "url");
        LJIILL(url);
    }

    @Override // X.AbstractC37959Ev5
    public final C37955Ev1 LJIIJ(String msg) {
        String str;
        o.LJIIJ(msg, "msg");
        JSONObject jSONObject = new JSONObject(msg);
        C37955Ev1 c37955Ev1 = new C37955Ev1(this.LJI);
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
            o.LJFF(string, "o.getString(\"__msg_type\")");
            c37955Ev1.LJFF = string;
            String optString = jSONObject.optString("__callback_id", null);
            o.LJFF(optString, "o.optString(\"__callback_id\", null)");
            c37955Ev1.LIZJ = optString;
            String optString2 = jSONObject.optString("func");
            o.LJFF(optString2, "o.optString(\"func\")");
            c37955Ev1.LIZLLL = optString2;
            c37955Ev1.LJI = jSONObject.opt("params");
            String optString3 = jSONObject.optString("JSSDK");
            o.LJFF(optString3, "o.optString(\"JSSDK\")");
            c37955Ev1.LJII = optString3;
            c37955Ev1.LJIIJ = jSONObject.optLong("__timestamp", System.currentTimeMillis());
            String optString4 = jSONObject.optString("namespace");
            o.LJFF(optString4, "o.optString(\"namespace\")");
            c37955Ev1.LJIIIIZZ = optString4;
            String optString5 = jSONObject.optString("__iframe_url");
            o.LJFF(optString5, "o.optString(\"__iframe_url\")");
            c37955Ev1.LJIIIZ = optString5;
            c37955Ev1.LJIIJJI = msg;
            String optString6 = jSONObject.optString("token");
            o.LJFF(optString6, "o.optString(\"token\")");
            c37955Ev1.LJIIL = optString6;
            InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZIZ;
            if (interfaceC37958Ev4 == null || (str = interfaceC37958Ev4.getUrl()) == null) {
                str = "";
            }
            c37955Ev1.LJ = str;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseMsQueue:");
            LIZ.append(C16880lQ.LLLLIIIILLL());
            C37887Etv.LIZ("JsBridge", X1D.LIZIZ(LIZ));
            c37955Ev1.LIZIZ(EnumC37907EuF.Web);
            String optString7 = jSONObject.optString("secure_token");
            if (optString7 == null || optString7.length() == 0) {
                Object obj = c37955Ev1.LJI;
                if (obj instanceof JSONObject) {
                    if (obj != null) {
                        String optString8 = ((JSONObject) obj).optString("_jsb_secure_token");
                        o.LJFF(optString8, "(call.params as JSONObje…ring(\"_jsb_secure_token\")");
                        c37955Ev1.LIZ = optString8;
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
            } else {
                String optString9 = jSONObject.optString("secure_token");
                o.LJFF(optString9, "o.optString(\"secure_token\")");
                c37955Ev1.LIZ = optString9;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c37955Ev1;
    }

    public final boolean LJIILL(String str) {
        if (!ujb.o.LJJJLIIL(str, this.LJ, false)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, this.LJ, "://dispatch_message/", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        String LJFF2 = JBR.LJFF(LIZ2, this.LJ, "://private/setresult/", LIZ2);
        if (str.equals(LJFF)) {
            C37213Ej3 c37213Ej3 = new C37213Ej3(this);
            InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZIZ;
            if (interfaceC37958Ev4 != null) {
                interfaceC37958Ev4.LJII(c37213Ej3, "javascript:ToutiaoJSBridge._fetchQueue()");
            }
            return true;
        }
        if (!ujb.o.LJJJLIIL(str, LJFF2, false)) {
            return false;
        }
        return true;
    }

    public final void LJIIZILJ(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.LIZLLL.execute(new ARunnableS2S1201000_6(1, JSONArrayProtectorUtils.getJSONObject(jSONArray, i).toString(), this, null, 1));
            }
        } catch (Exception unused) {
        }
    }

    public static JSONObject LJIILLIIL(C37955Ev1 c37955Ev1, C37911EuJ c37911EuJ) {
        String str;
        JSONObject LIZJ = C65232Piu.LIZJ("__msg_type", "callback");
        if (c37955Ev1 != null) {
            str = c37955Ev1.LIZJ;
        } else {
            str = null;
        }
        LIZJ.put("__callback_id", str);
        LIZJ.put("__params", c37911EuJ.LIZIZ(c37955Ev1));
        return LIZJ;
    }

    @Override // X.AbstractC37959Ev5
    public final String LJIIJJI(C37955Ev1 call, C37911EuJ c37911EuJ) {
        o.LJIIJ(call, "call");
        if (!TextUtils.isEmpty(call.LJIIIZ)) {
            String LLLZ = C16880lQ.LLLZ("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", Arrays.copyOf(new Object[]{call.LJIIIZ, LJIILLIIL(call, c37911EuJ).toString(), call.LJIIIZ}, 3));
            o.LJFF(LLLZ, "java.lang.String.format(format, *args)");
            return LLLZ;
        }
        JSONObject LJIILLIIL = LJIILLIIL(call, c37911EuJ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("javascript:ToutiaoJSBridge._handleMessageFromToutiao(");
        LIZ.append(LJIILLIIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
