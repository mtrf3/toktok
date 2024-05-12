package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xyo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86602Xyo implements InterfaceC53758L7y {
    public final String LIZ;
    public final String LIZIZ;
    public final /* synthetic */ RunnableC86598Xyk LIZJ;

    public C86602Xyo(RunnableC86598Xyk runnableC86598Xyk) {
        this.LIZJ = runnableC86598Xyk;
        this.LIZ = runnableC86598Xyk.LJLJI.LIZ();
        this.LIZIZ = runnableC86598Xyk.LJLJI.getUrl();
    }

    @Override // X.InterfaceC53758L7y
    public final void LIZ(Integer num, Integer num2, Throwable th) {
        int i;
        Integer num3;
        int i2;
        if (th instanceof C64698PaI) {
            i = -1001;
        } else {
            i = 0;
        }
        C86599Xyl c86599Xyl = this.LIZJ.LJLIL;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        if (num != null) {
            num3 = num;
        } else {
            num3 = -408;
        }
        c86599Xyl.LJIILIIL(i, str, str2, th.toString(), num3, this.LIZJ.LJLJJL.name());
        InterfaceC86631XzH interfaceC86631XzH = this.LIZJ.LJLJJLL;
        C86616Xz2 c86616Xz2 = new C86616Xz2();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -408;
        }
        c86616Xz2.LIZ = Integer.valueOf(i2);
        c86616Xz2.LIZIZ = num2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num == null) {
            num = -408;
        }
        linkedHashMap.put("errCode", num);
        if (num2 == null) {
            num2 = 0;
        }
        linkedHashMap.put("clientCode", num2);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("message", message);
        linkedHashMap.put("prompts", "");
        c86616Xz2.LIZLLL = linkedHashMap;
        interfaceC86631XzH.LIZ(i, "", c86616Xz2);
    }

    @Override // X.InterfaceC53758L7y
    public final void LIZIZ(JSONObject body, LinkedHashMap<String, String> responseHeader, Integer num, Integer num2) {
        int i;
        o.LJIIJ(body, "body");
        o.LJIIJ(responseHeader, "responseHeader");
        InterfaceC86631XzH interfaceC86631XzH = this.LIZJ.LJLJJLL;
        C86616Xz2 c86616Xz2 = new C86616Xz2();
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        c86616Xz2.LIZ = Integer.valueOf(i);
        c86616Xz2.LIZIZ = num2;
        c86616Xz2.LIZJ = responseHeader;
        try {
            String str = responseHeader.get("x-tt-logid");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = body.keys();
            o.LJFF(keys, "body.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJFF(key, "key");
                Object obj = body.get(key);
                o.LJFF(obj, "body.get(key)");
                linkedHashMap.put(key, obj);
            }
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("_Header_RequestID", str);
            c86616Xz2.LIZLLL = linkedHashMap;
        } catch (Throwable unused) {
        }
        interfaceC86631XzH.LIZIZ(c86616Xz2, "");
    }

    @Override // X.InterfaceC53758L7y
    public final C76800UCe LIZJ(JSONObject jSONObject, LinkedHashMap responseHeader, String str, Throwable th, Integer num, Integer num2) {
        int i;
        o.LJIIJ(responseHeader, "responseHeader");
        this.LIZJ.LJLIL.LJIILIIL(0, this.LIZ, this.LIZIZ, th.toString(), num, this.LIZJ.LJLJJL.name());
        InterfaceC86631XzH interfaceC86631XzH = this.LIZJ.LJLJJLL;
        String th2 = th.toString();
        C86616Xz2 c86616Xz2 = new C86616Xz2();
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        c86616Xz2.LIZ = Integer.valueOf(i);
        c86616Xz2.LIZIZ = num2;
        c86616Xz2.LIZJ = responseHeader;
        try {
            String str2 = (String) responseHeader.get("x-tt-logid");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            o.LJFF(keys, "body.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJFF(key, "key");
                Object obj = jSONObject.get(key);
                o.LJFF(obj, "body.get(key)");
                linkedHashMap.put(key, obj);
            }
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("_Header_RequestID", str2);
            c86616Xz2.LIZLLL = linkedHashMap;
        } catch (Throwable unused) {
        }
        c86616Xz2.LJ = str;
        interfaceC86631XzH.LIZ(0, th2, c86616Xz2);
        return C76800UCe.LIZ;
    }
}
