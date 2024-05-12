package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import ij2.a;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Wh2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82952Wh2 {
    public long LIZ;

    public final void LIZ(String str, C36661cE c36661cE, Throwable th) {
        String str2;
        if (this.LIZ <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        String str3 = null;
        if (c36661cE != null) {
            str2 = c36661cE.LIZJ;
        } else {
            str2 = null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            jSONObject.put("duration", currentTimeMillis);
            jSONObject.put("result", str2);
            if (c36661cE != null) {
                str3 = c36661cE.LIZLLL;
            }
            jSONObject.put("error_code", str3);
            if (th instanceof C64802Pby) {
                jSONObject.put("api_status_code", ((C64802Pby) th).getStatusCode());
            }
            a.LJIJ.getClass();
            a.LIZJ().LIZJ.onEventV3("rd_pipo_ocr_card_info_request", jSONObject);
        } catch (Exception unused) {
        }
        this.LIZ = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Ynt] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.Ynt] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.Wh3] */
    public final void LIZIZ(String str, C82953Wh3 c82953Wh3, InterfaceC88473Ynt<? super Boolean, ? super String, ? super C36661cE, C76800UCe> interfaceC88473Ynt) {
        ?? r4;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            r4 = c82953Wh3;
            String str2 = r4.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("merchant_user_id", str2);
            String str3 = r4.LJ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("nonce", str3);
            String str4 = r4.LJFF;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("image_base64", str4);
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "bizContentObject.toString()");
        int LJJLIIIJL = s.LJJLIIIJL(jSONObject2, "nonce", 0, false, 6);
        if (LJJLIIIJL > 0) {
            String substring = jSONObject2.substring(0, LJJLIIIJL);
            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(substring);
            LIZ.append("nonce\":\"");
            String LIZIZ = X1D.LIZIZ(LIZ);
            String substring2 = jSONObject2.substring(LJJLIIIJL + 8);
            o.LJIIIIZZ(substring2, "(this as java.lang.String).substring(startIndex)");
            int LJJLIIIJL2 = s.LJJLIIIJL(substring2, "\"", 0, false, 6);
            String substring3 = substring2.substring(0, LJJLIIIJL2);
            o.LJIIIIZZ(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append(ujb.o.LJJJJZ(substring3, "\\/", "/", false));
            String substring4 = substring2.substring(LJJLIIIJL2);
            o.LJIIIIZZ(substring4, "(this as java.lang.String).substring(startIndex)");
            LIZ2.append(substring4);
            jSONObject2 = X1D.LIZIZ(LIZ2);
        }
        arrayList.add(new Pair("biz_content", jSONObject2));
        String str5 = r4.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        arrayList.add(new Pair("merchant_id", str5));
        String str6 = r4.LIZIZ;
        if (str6 == null) {
            str6 = "";
        }
        arrayList.add(new Pair("request_time", str6));
        QKY qky = new QKY();
        java.util.Map<String, String> LJJLIL = C113554cx.LJJLIL(r4.LIZJ);
        try {
            r4 = interfaceC88473Ynt;
            StringBuilder sb = new StringBuilder("");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) ListProtector.get(arrayList, i);
                StringBuilder LIZ3 = X1D.LIZ();
                String str7 = (String) pair.first;
                str7.toString();
                LIZ3.append(str7);
                LIZ3.append("=");
                LIZ3.append(URLEncoder.encode((String) pair.second, "UTF-8"));
                sb.append(X1D.LIZIZ(LIZ3));
                if (i < arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "parameterStrBuild.toString()");
            Charset forName = Charset.forName("UTF-8");
            o.LJIIIIZZ(forName, "Charset.forName(charsetName)");
            byte[] bytes = sb2.getBytes(forName);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes);
            } finally {
                try {
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    o.LJIIIIZZ(byteArray, "bos.toByteArray()");
                    LJJLIL.put("Content-Type", "application/x-www-form-urlencoded");
                    LJJLIL.put("Content-Encoding", "gzip");
                    LJJLIL.put("Accept-Encoding", "gzip");
                    this.LIZ = System.currentTimeMillis();
                    a.LJIJ.getClass();
                    AbstractC66805QJt abstractC66805QJt = a.LIZJ().LJ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(C79146V4k.LJ);
                    LIZ4.append("/payment/v1/get_bankcard_info_by_ocr");
                    String LJ = abstractC66805QJt.LJ(X1D.LIZIZ(LIZ4), byteArray, LJJLIL, qky);
                    C36661cE c36661cE = new C36661cE(LJ);
                    LIZ(str, c36661cE, null);
                    r4.invoke(Boolean.TRUE, "", c36661cE);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("response is ");
                    LIZ5.append(LJ);
                    X1D.LIZIZ(LIZ5);
                } catch (Throwable th) {
                }
            }
            gZIPOutputStream.close();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            o.LJIIIIZZ(byteArray2, "bos.toByteArray()");
            LJJLIL.put("Content-Type", "application/x-www-form-urlencoded");
            LJJLIL.put("Content-Encoding", "gzip");
            LJJLIL.put("Accept-Encoding", "gzip");
            this.LIZ = System.currentTimeMillis();
            a.LJIJ.getClass();
            AbstractC66805QJt abstractC66805QJt2 = a.LIZJ().LJ;
            StringBuilder LIZ42 = X1D.LIZ();
            LIZ42.append(C79146V4k.LJ);
            LIZ42.append("/payment/v1/get_bankcard_info_by_ocr");
            String LJ2 = abstractC66805QJt2.LJ(X1D.LIZIZ(LIZ42), byteArray2, LJJLIL, qky);
            C36661cE c36661cE2 = new C36661cE(LJ2);
            LIZ(str, c36661cE2, null);
            r4.invoke(Boolean.TRUE, "", c36661cE2);
            StringBuilder LIZ52 = X1D.LIZ();
            LIZ52.append("response is ");
            LIZ52.append(LJ2);
            X1D.LIZIZ(LIZ52);
        } catch (Throwable th2) {
            LIZ(str, null, th2);
            r4.invoke(Boolean.FALSE, th2.getMessage(), null);
        }
    }
}
