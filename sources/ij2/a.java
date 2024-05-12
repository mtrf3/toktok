package ij2;

import X.C32I;
import X.C47135Ieh;
import X.C47261Igj;
import X.C65232Piu;
import X.C82953Wh3;
import X.C86814Y5i;
import X.C86820Y5o;
import X.EnumC86811Y5f;
import X.InterfaceC86827Y5v;
import X.ORZ;
import X.X1D;
import aj2.d;
import android.graphics.Bitmap;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yi2.b;

/* loaded from: classes16.dex */
public final class a implements b {
    public static d LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static boolean LJFF;
    public static b LJI;
    public static wi2.d LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static int LJIIJJI;
    public static boolean LJIIL;
    public static String LJIILL;
    public static int LJIIZILJ;
    public static final a LJIJ = new a();
    public static String LJIILIIL = "pitaya";
    public static String LJIILJJIL = "pitaya";
    public static boolean LJIILLIIL = true;

    public static C82953Wh3 LIZIZ() {
        C82953Wh3 c82953Wh3 = new C82953Wh3(LIZLLL, LJ);
        TimeZone timeZone = TimeZone.getTimeZone("gmt");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        c82953Wh3.LIZIZ = simpleDateFormat.format(new Date());
        c82953Wh3.LIZ = LIZJ;
        return c82953Wh3;
    }

    public static d LIZJ() {
        if (LIZIZ) {
            d dVar = LIZ;
            if (dVar != null) {
                return dVar;
            }
            o.LJIJI("mConfiguration");
            throw null;
        }
        throw new IllegalArgumentException("please init first");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL() {
        /*
            X.Y5r r4 = new X.Y5r
            r0 = 100005151(0x5f5f51f, double:4.94091095E-316)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "460479"
            r4.<init>(r0, r1)
            rj2.a$a r3 = new rj2.a$a
            aj2.d r0 = ij2.a.LIZ
            if (r0 == 0) goto L2e
            rj2.a$a r0 = r0.LJIIJJI
            java.lang.String r2 = ""
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.LIZ
            if (r1 == 0) goto L2a
        L1e:
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L23
            r2 = r0
        L23:
            r3.<init>(r1, r2)
            X.C86806Y5a.LIZ(r4, r3)
            return
        L2a:
            r1 = r2
            if (r0 == 0) goto L23
            goto L1e
        L2e:
            java.lang.String r0 = "mConfiguration"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ij2.a.LJIILIIL():void");
    }

    public static String LJ(int i) {
        if (i == EnumC86811Y5f.Default.getValue()) {
            return "server";
        }
        return "pitaya";
    }

    public static void LJFF(d dVar) {
        if (LIZIZ) {
            d dVar2 = LIZ;
            if (dVar2 != null) {
                dVar2.LIZ(dVar);
            } else {
                o.LJIJI("mConfiguration");
                throw null;
            }
        } else {
            LIZ = dVar;
        }
        LIZIZ = true;
        try {
            LJIILIIL();
        } catch (Throwable unused) {
        }
    }

    public static void LIZLLL(Bitmap bitmap, b bVar) {
        d dVar = LIZ;
        if (dVar != null) {
            InterfaceC86827Y5v interfaceC86827Y5v = dVar.LJIIJ;
            if (interfaceC86827Y5v != null) {
                interfaceC86827Y5v.LIZ(EnumC86811Y5f.ImageCropped.getValue(), new C86820Y5o(bVar), bitmap);
                return;
            }
            return;
        }
        o.LJIJI("mConfiguration");
        throw null;
    }

    public static void LJI(Bitmap originalImage, b bVar) {
        o.LJIIIZ(originalImage, "originalImage");
        int i = LJIIZILJ + 1;
        LJIIZILJ = i;
        d dVar = LIZ;
        if (dVar != null) {
            InterfaceC86827Y5v interfaceC86827Y5v = dVar.LJIIJ;
            if (interfaceC86827Y5v == null || i >= 16) {
                bVar.LIZ(-1, -1, "needs to be uploaded", new PipoOcrResult(originalImage, 254), "video");
                return;
            } else {
                interfaceC86827Y5v.LIZ(LJIIJJI, new C86814Y5i(bVar), originalImage);
                return;
            }
        }
        o.LJIJI("mConfiguration");
        throw null;
    }

    public static void LJIILJJIL(String str, JSONObject jSONObject) {
        jSONObject.put("merchant_user_id", LIZLLL);
        jSONObject.put("merchant_id", LIZJ);
        jSONObject.put("product_type", "instant_payment");
        jSONObject.put("sdk_version", String.valueOf(100005151L));
        d dVar = LIZ;
        if (dVar != null) {
            dVar.LIZJ.onEventV3(str, jSONObject);
        } else {
            o.LJIJI("mConfiguration");
            throw null;
        }
    }

    public static void LJIIIZ(long j, long j2, String str) {
        JSONObject LJ2 = C47135Ieh.LJ("page_id", "info_confirm_ocr", "obj_id", str);
        LJ2.put("click_timestamp", j);
        LJ2.put("finish_timestamp", j2);
        LJ2.put("duration", j2 - j);
        LJIJ.getClass();
        LJ2.put("ocr_mode", LJ(LJIIJJI));
        LJIILJJIL("fp_sdk_checkout_ocr_fillin", LJ2);
    }

    public static void LJIIJ(long j, long j2, String str) {
        JSONObject LIZJ2 = C65232Piu.LIZJ("page_id", str);
        LIZJ2.put("render_cost", j2 - j);
        LIZJ2.put("timestamp", j2);
        LJIJ.getClass();
        LIZJ2.put("ocr_mode", LJ(LJIIJJI));
        LJIILJJIL("fp_sdk_checkout_ocr_show", LIZJ2);
    }

    public static void LJIIJJI(long j, String str, String str2) {
        JSONObject LJ2 = C47135Ieh.LJ("page_id", "payin_checkout_ocr", "obj_id", str);
        LJ2.put("popup_id", str2);
        LJ2.put("timestamp", j);
        LJIJ.getClass();
        LJ2.put("ocr_mode", LJ(LJIIJJI));
        LJIILJJIL("fp_sdk_checkout_popup_click", LJ2);
    }

    public static void LJIIL(long j, String str, List infos) {
        o.LJIIIZ(infos, "infos");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", "payin_checkout_ocr");
        ArrayList arrayList = new ArrayList(C32I.LJJL(infos, 10));
        int i = 0;
        for (Object obj : infos) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(i2);
                LIZ2.append(", ");
                LIZ2.append((String) obj);
                arrayList.add(X1D.LIZIZ(LIZ2));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String LLD = ORZ.LLD(arrayList, "; ", null, null, null, 62);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("{ ");
        LIZ3.append(LLD);
        LIZ3.append(" }");
        jSONObject.put("obj_id", X1D.LIZIZ(LIZ3));
        jSONObject.put("popup_id", str);
        jSONObject.put("timestamp", j);
        LJIJ.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIJJI));
        LJIILJJIL("fp_sdk_checkout_popup_show", jSONObject);
    }

    public static void LJII(long j, long j2, long j3, long j4, String result) {
        String str;
        o.LJIIIZ(result, "result");
        int i = LJIIJJI;
        if (i == EnumC86811Y5f.Default.getValue()) {
            str = "server";
        } else if (i == EnumC86811Y5f.DetectAndRecognize.getValue() || i == EnumC86811Y5f.NativeRecognizeInner.getValue() || i == EnumC86811Y5f.NativeRecognize.getValue()) {
            str = "pitaya";
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", result);
        jSONObject.put("duration", j);
        jSONObject.put("recognize_type", str);
        jSONObject.put("start_time", j2);
        jSONObject.put("finish_time", j3);
        jSONObject.put("start_back_up_server_timestamps", j4);
        LJIILJJIL("rd_pipo_ocr_finish_album_recognize", jSONObject);
    }

    @Override // yi2.b
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String type) {
        String str2;
        o.LJIIIZ(type, "type");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[onOcrResult] code:");
        LIZ2.append(i);
        LIZ2.append(" detailCode:");
        LIZ2.append(i2);
        LIZ2.append(" msg:");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        if (pipoOcrResult != null) {
            str2 = pipoOcrResult.expirationDate;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            LJIIL = true;
        }
        b bVar = LJI;
        if (bVar != null) {
            bVar.LIZ(i, i2, str, pipoOcrResult, type);
        }
        LJI = null;
        LJFF = false;
        LJ = "";
    }

    public static void LJIIIIZZ(a aVar, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", str);
        jSONObject.put("obj_id", str2);
        jSONObject.put("timestamp", System.currentTimeMillis());
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("is_edit_ocr_card_no", str3);
        }
        if (str4 != null && str4.length() != 0) {
            jSONObject.put("is_edit_ocr_expiration_date", str4);
        }
        if (str5 != null && str5.length() != 0) {
            jSONObject.put("is_edit_ocr_card_holdername", str5);
        }
        LJIJ.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIJJI));
        LJIILJJIL("fp_sdk_checkout_ocr_click", jSONObject);
    }
}
