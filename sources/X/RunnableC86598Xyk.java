package X;

import android.util.Base64;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xyk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86598Xyk implements Runnable {
    public final /* synthetic */ C86599Xyl LJLIL;
    public final /* synthetic */ InterfaceC78280Uns LJLILLLLZI;
    public final /* synthetic */ C86609Xyv LJLJI;
    public final /* synthetic */ InterfaceC78280Uns LJLJJI;
    public final /* synthetic */ EnumC37847EtH LJLJJL;
    public final /* synthetic */ InterfaceC86631XzH LJLJJLL;
    public final /* synthetic */ EnumC66626QCw LJLJL;
    public final /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ boolean LJLLI;
    public final /* synthetic */ boolean LJLLILLLL;

    public RunnableC86598Xyk(C86599Xyl c86599Xyl, InterfaceC78280Uns interfaceC78280Uns, C86609Xyv c86609Xyv, InterfaceC78280Uns interfaceC78280Uns2, EnumC37847EtH enumC37847EtH, C86611Xyx c86611Xyx, EnumC66626QCw enumC66626QCw, Object obj, String str, int i, boolean z, boolean z2) {
        this.LJLIL = c86599Xyl;
        this.LJLILLLLZI = interfaceC78280Uns;
        this.LJLJI = c86609Xyv;
        this.LJLJJI = interfaceC78280Uns2;
        this.LJLJJL = enumC37847EtH;
        this.LJLJJLL = c86611Xyx;
        this.LJLJL = enumC66626QCw;
        this.LJLJLJ = obj;
        this.LJLJLLL = str;
        this.LJLL = i;
        this.LJLLI = z;
        this.LJLLILLLL = z2;
    }

    public final void LIZ() {
        String str;
        InterfaceC86629XzF interfaceC86629XzF;
        boolean z;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z2;
        boolean z3;
        boolean z4;
        JSONObject jSONObject3;
        byte[] bytes;
        C86597Xyj c86597Xyj = C86597Xyj.LIZ;
        InterfaceC78280Uns interfaceC78280Uns = this.LJLILLLLZI;
        c86597Xyj.getClass();
        LinkedHashMap<String, String> LIZIZ = C86597Xyj.LIZIZ(interfaceC78280Uns);
        if (LIZIZ.containsKey("content-type")) {
            str = LIZIZ.get("content-type");
        } else if (LIZIZ.containsKey("Content-Type")) {
            str = LIZIZ.get("Content-Type");
        } else {
            str = null;
        }
        String targetUrl = C86597Xyj.LIZ(this.LJLJI.getUrl(), this.LJLJJI, this.LJLJJL);
        C86602Xyo c86602Xyo = new C86602Xyo(this);
        C86608Xyu c86608Xyu = new C86608Xyu(this);
        C86609Xyv c86609Xyv = this.LJLJI;
        C86628XzE c86628XzE = c86609Xyv.LJIIJ;
        C86291Xtn c86291Xtn = C86291Xtn.LJIIL;
        if (c86291Xtn != null) {
            interfaceC86629XzF = c86291Xtn.LJIIJJI;
        } else {
            interfaceC86629XzF = null;
        }
        if (c86609Xyv.LJIIJJI && c86628XzE != null && interfaceC86629XzF != null && interfaceC86629XzF.LJFF(c86628XzE.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (interfaceC86629XzF != null) {
                interfaceC86629XzF.LJJLIIIJJIZ(LIZIZ);
            }
            C86599Xyl c86599Xyl = this.LJLIL;
            if (c86628XzE != null) {
                String channel = c86628XzE.LIZ;
                String dataMessage = c86628XzE.LIZIZ;
                EnumC66626QCw enumC66626QCw = this.LJLJL;
                Object obj = this.LJLJLJ;
                int i = this.LJLL;
                boolean z5 = this.LJLLI;
                Boolean valueOf = Boolean.valueOf(this.LJLLILLLL);
                c86599Xyl.getClass();
                String method = enumC66626QCw.getMethod();
                int hashCode = method.hashCode();
                if (hashCode != 102230) {
                    if (hashCode != 3446944 || !method.equals("post")) {
                        return;
                    }
                    if (str == null) {
                        str = "application/x-www-form-urlencoded";
                    }
                    LIZIZ.put("Content-Type", str);
                    if (obj != null) {
                        if (obj instanceof InterfaceC78502UrS) {
                            String jSONArray = C78501UrR.LIZ((InterfaceC78502UrS) obj).toString();
                            o.LJFF(jSONArray, "XReadableJSONUtils.xRead…SONArray(body).toString()");
                            byte[] bytes2 = jSONArray.getBytes(PVC.LIZ);
                            o.LJFF(bytes2, "(this as java.lang.String).getBytes(charset)");
                            C86597Xyj.LJIIJJI(channel, dataMessage, targetUrl, LIZIZ, str, z5, valueOf, bytes2, c86602Xyo, c86599Xyl.LJIIJJI(), c86599Xyl.LJIIL());
                            return;
                        }
                        jSONObject3 = C78501UrR.LIZIZ((InterfaceC78280Uns) obj);
                    } else {
                        jSONObject3 = new JSONObject();
                    }
                    IHostNetworkDepend LJIIJJI = c86599Xyl.LJIIJJI();
                    InterfaceC86629XzF LJIIL = c86599Xyl.LJIIL();
                    Integer valueOf2 = Integer.valueOf(i);
                    o.LJIIJ(channel, "channel");
                    o.LJIIJ(dataMessage, "dataMessage");
                    o.LJIIJ(targetUrl, "targetUrl");
                    if (valueOf2 != null) {
                        if (valueOf2.intValue() != 0) {
                            if (valueOf2 != null) {
                                if (valueOf2.intValue() != 2) {
                                    if (valueOf2.intValue() == 1) {
                                        String jSONObject4 = jSONObject3.toString(2);
                                        o.LJFF(jSONObject4, "postData.toString(2)");
                                        Charset forName = Charset.forName("UTF-8");
                                        o.LJFF(forName, "Charset.forName(charsetName)");
                                        bytes = jSONObject4.getBytes(forName);
                                        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                                        C86597Xyj.LJIIJJI(channel, dataMessage, targetUrl, LIZIZ, str, z5, valueOf, bytes, c86602Xyo, LJIIJJI, LJIIL);
                                        return;
                                    }
                                }
                            }
                        }
                        String jSONObject5 = jSONObject3.toString();
                        o.LJFF(jSONObject5, "postData.toString()");
                        Charset forName2 = Charset.forName("UTF-8");
                        o.LJFF(forName2, "Charset.forName(charsetName)");
                        bytes = jSONObject5.getBytes(forName2);
                        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                        C86597Xyj.LJIIJJI(channel, dataMessage, targetUrl, LIZIZ, str, z5, valueOf, bytes, c86602Xyo, LJIIJJI, LJIIL);
                        return;
                    }
                    bytes = null;
                    C86597Xyj.LJIIJJI(channel, dataMessage, targetUrl, LIZIZ, str, z5, valueOf, bytes, c86602Xyo, LJIIJJI, LJIIL);
                    return;
                }
                if (!method.equals("get")) {
                    return;
                }
                IHostNetworkDepend LJIIJJI2 = c86599Xyl.LJIIJJI();
                InterfaceC86629XzF LJIIL2 = c86599Xyl.LJIIL();
                o.LJIIJ(channel, "channel");
                o.LJIIJ(dataMessage, "dataMessage");
                o.LJIIJ(targetUrl, "targetUrl");
                EZA eza = new EZA(targetUrl);
                eza.LIZ = LIZIZ;
                if (valueOf != null) {
                    z4 = valueOf.booleanValue();
                } else {
                    z4 = true;
                }
                eza.LIZIZ = z4;
                eza.LIZJ = z5;
                EZ9 ez9 = EZ9.LIZ;
                EZC ezc = EZC.GET;
                ez9.getClass();
                C86597Xyj.LJFF(channel, dataMessage, LJIIL2, EZ9.LIZLLL(ezc, eza, LJIIJJI2), c86602Xyo);
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        C86599Xyl c86599Xyl2 = this.LJLIL;
        EnumC66626QCw enumC66626QCw2 = this.LJLJL;
        Object obj2 = this.LJLJLJ;
        String str2 = this.LJLJLLL;
        int i2 = this.LJLL;
        boolean z6 = this.LJLLI;
        Boolean valueOf3 = Boolean.valueOf(this.LJLLILLLL);
        c86599Xyl2.getClass();
        String method2 = enumC66626QCw2.getMethod();
        switch (method2.hashCode()) {
            case -1335458389:
                if (!method2.equals("delete")) {
                    return;
                }
                IHostNetworkDepend LJIIJJI3 = c86599Xyl2.LJIIJJI();
                o.LJIIJ(targetUrl, "targetUrl");
                EZA eza2 = new EZA(targetUrl);
                eza2.LIZ = LIZIZ;
                if (valueOf3 != null) {
                    z3 = valueOf3.booleanValue();
                } else {
                    z3 = true;
                }
                eza2.LIZIZ = z3;
                eza2.LIZJ = z6;
                EZ9 ez92 = EZ9.LIZ;
                EZC ezc2 = EZC.DELETE;
                ez92.getClass();
                C86597Xyj.LIZLLL(EZ9.LJ(ezc2, eza2, LJIIJJI3), c86602Xyo);
                return;
            case 102230:
                if (!method2.equals("get")) {
                    return;
                }
                C86597Xyj.LIZJ(targetUrl, LIZIZ, z6, valueOf3, c86602Xyo, c86599Xyl2.LJIIJJI());
                return;
            case 111375:
                if (!method2.equals("put")) {
                    return;
                }
                if (obj2 != null) {
                    jSONObject2 = C78501UrR.LIZIZ((InterfaceC78280Uns) obj2);
                } else {
                    jSONObject2 = new JSONObject();
                }
                if (str == null) {
                    str = "application/x-www-form-urlencoded";
                }
                IHostNetworkDepend LJIIJJI4 = c86599Xyl2.LJIIJJI();
                o.LJIIJ(targetUrl, "targetUrl");
                EZA eza3 = new EZA(targetUrl);
                eza3.LIZ = LIZIZ;
                eza3.LJFF = str;
                if (valueOf3 != null) {
                    z2 = valueOf3.booleanValue();
                } else {
                    z2 = true;
                }
                eza3.LIZIZ = z2;
                eza3.LIZJ = z6;
                String jSONObject6 = jSONObject2.toString();
                o.LJFF(jSONObject6, "postData.toString()");
                Charset forName3 = Charset.forName("UTF-8");
                o.LJFF(forName3, "Charset.forName(charsetName)");
                byte[] bytes3 = jSONObject6.getBytes(forName3);
                o.LJFF(bytes3, "(this as java.lang.String).getBytes(charset)");
                eza3.LJ = bytes3;
                EZ9 ez93 = EZ9.LIZ;
                EZC ezc3 = EZC.PUT;
                ez93.getClass();
                C86597Xyj.LIZLLL(EZ9.LJ(ezc3, eza3, LJIIJJI4), c86602Xyo);
                return;
            case 3446944:
                if (!method2.equals("post")) {
                    return;
                }
                if (str == null) {
                    str = "application/x-www-form-urlencoded";
                }
                LIZIZ.put("Content-Type", str);
                if (obj2 instanceof String) {
                    if (o.LJ(str2, "base64")) {
                        byte[] decode = Base64.decode((String) obj2, 0);
                        o.LJFF(decode, "Base64.decode(body, Base64.DEFAULT)");
                        C86597Xyj.LJIIJ(targetUrl, LIZIZ, str, z6, valueOf3, decode, c86608Xyu, c86599Xyl2.LJIIJJI());
                        return;
                    }
                    byte[] bytes4 = ((String) obj2).getBytes(PVC.LIZ);
                    o.LJFF(bytes4, "(this as java.lang.String).getBytes(charset)");
                    C86597Xyj.LJIIIZ(targetUrl, LIZIZ, str, z6, valueOf3, bytes4, c86602Xyo, c86599Xyl2.LJIIJJI());
                    return;
                }
                if (obj2 != null) {
                    if (obj2 instanceof InterfaceC78502UrS) {
                        String jSONArray2 = C78501UrR.LIZ((InterfaceC78502UrS) obj2).toString();
                        o.LJFF(jSONArray2, "XReadableJSONUtils.xRead…SONArray(body).toString()");
                        byte[] bytes5 = jSONArray2.getBytes(PVC.LIZ);
                        o.LJFF(bytes5, "(this as java.lang.String).getBytes(charset)");
                        C86597Xyj.LJIIIZ(targetUrl, LIZIZ, str, z6, valueOf3, bytes5, c86602Xyo, c86599Xyl2.LJIIJJI());
                        return;
                    }
                    jSONObject = C78501UrR.LIZIZ((InterfaceC78280Uns) obj2);
                } else {
                    jSONObject = new JSONObject();
                }
                C86597Xyj.LJIIIIZZ(targetUrl, LIZIZ, str, z6, valueOf3, jSONObject, c86602Xyo, c86599Xyl2.LJIIJJI(), Integer.valueOf(i2));
                return;
            default:
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
