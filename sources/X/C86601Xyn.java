package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xyn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86601Xyn implements InterfaceC53758L7y {
    public final String LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC86614Xz0> LIZIZ;
    public final /* synthetic */ EnumC37844EtE LIZJ;
    public final /* synthetic */ C86603Xyp LIZLLL;
    public final /* synthetic */ String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC53758L7y
    public final void LIZ(Integer num, Integer num2, Throwable th) {
        int i;
        int i2;
        Integer num3;
        int i3 = 0;
        if (th instanceof C64698PaI) {
            i = -1001;
        } else {
            i = 0;
        }
        C86603Xyp c86603Xyp = this.LIZLLL;
        String str = this.LIZ;
        String str2 = this.LJ;
        int i4 = -408;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -408;
        }
        c86603Xyp.LJIIIZ(i, str, str2, th.toString(), Integer.valueOf(i2), this.LIZJ.name());
        CompletionBlock<InterfaceC86614Xz0> completionBlock = this.LIZIZ;
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86614Xz0.class, null);
        InterfaceC86614Xz0 interfaceC86614Xz0 = (InterfaceC86614Xz0) LIZJ;
        if (num != null) {
            num3 = num;
        } else {
            num3 = -408;
        }
        interfaceC86614Xz0.setHttpCode(num3);
        interfaceC86614Xz0.setClientCode(num2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            i4 = num.intValue();
        }
        linkedHashMap.put("errCode", Integer.valueOf(i4));
        if (num2 != null) {
            i3 = num2.intValue();
        }
        linkedHashMap.put("clientCode", Integer.valueOf(i3));
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("message", message);
        linkedHashMap.put("prompts", "");
        interfaceC86614Xz0.setResponse(linkedHashMap);
        completionBlock.onFailure(i, "", (XBaseResultModel) LIZJ);
    }

    @Override // X.InterfaceC53758L7y
    public final void LIZIZ(JSONObject body, LinkedHashMap<String, String> responseHeader, Integer num, Integer num2) {
        Integer num3;
        o.LJIIIZ(body, "body");
        o.LJIIIZ(responseHeader, "responseHeader");
        try {
            CompletionBlock<InterfaceC86614Xz0> completionBlock = this.LIZIZ;
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC86614Xz0.class, null);
            InterfaceC86614Xz0 interfaceC86614Xz0 = (InterfaceC86614Xz0) LIZJ;
            if (num != null) {
                num3 = num;
            } else {
                num3 = -1;
            }
            interfaceC86614Xz0.setHttpCode(num3);
            interfaceC86614Xz0.setClientCode(num2);
            interfaceC86614Xz0.setHeader(responseHeader);
            String str = responseHeader.get("x-tt-logid");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = body.keys();
            o.LJIIIIZZ(keys, "body.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                Object obj = body.get(key);
                o.LJIIIIZZ(obj, "body.get(key)");
                linkedHashMap.put(key, obj);
            }
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("_Header_RequestID", str);
            interfaceC86614Xz0.setResponse(linkedHashMap);
            completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        } catch (Throwable th) {
            String jSONObject = body.toString();
            o.LJIIIIZZ(jSONObject, "body.toString()");
            LIZLLL(body, responseHeader, jSONObject, th, num, num2);
        }
    }

    public C86601Xyn(InterfaceC86610Xyw interfaceC86610Xyw, CompletionBlock<InterfaceC86614Xz0> completionBlock, EnumC37844EtE enumC37844EtE, C86603Xyp c86603Xyp, String str) {
        this.LIZIZ = completionBlock;
        this.LIZJ = enumC37844EtE;
        this.LIZLLL = c86603Xyp;
        this.LJ = str;
        this.LIZ = interfaceC86610Xyw.getMethod();
    }

    @Override // X.InterfaceC53758L7y
    public final /* bridge */ /* synthetic */ C76800UCe LIZJ(JSONObject jSONObject, LinkedHashMap linkedHashMap, String str, Throwable th, Integer num, Integer num2) {
        LIZLLL(jSONObject, linkedHashMap, str, th, num, num2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(JSONObject body, LinkedHashMap<String, String> responseHeader, String str, Throwable th, Integer num, Integer num2) {
        Integer num3 = num;
        o.LJIIIZ(body, "body");
        o.LJIIIZ(responseHeader, "responseHeader");
        this.LIZLLL.LJIIIZ(0, this.LIZ, this.LJ, th.toString(), num3, this.LIZJ.name());
        CompletionBlock<InterfaceC86614Xz0> completionBlock = this.LIZIZ;
        String th2 = th.toString();
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86614Xz0.class, null);
        InterfaceC86614Xz0 interfaceC86614Xz0 = (InterfaceC86614Xz0) LIZJ;
        if (num3 == null) {
            num3 = -1;
        }
        interfaceC86614Xz0.setHttpCode(num3);
        interfaceC86614Xz0.setClientCode(num2);
        interfaceC86614Xz0.setHeader(responseHeader);
        try {
            String str2 = responseHeader.get("x-tt-logid");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = body.keys();
            o.LJIIIIZZ(keys, "body.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                Object obj = body.get(key);
                o.LJIIIIZZ(obj, "body.get(key)");
                linkedHashMap.put(key, obj);
            }
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("_Header_RequestID", str2);
            interfaceC86614Xz0.setResponse(linkedHashMap);
        } catch (Throwable unused) {
        }
        interfaceC86614Xz0.setRawResponse(str);
        completionBlock.onFailure(0, th2, (XBaseResultModel) LIZJ);
    }
}
