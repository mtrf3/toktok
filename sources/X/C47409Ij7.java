package X;

import Y.ACallableS3S1301000_8;
import android.webkit.CookieManager;
import com.ss.android.ugc.aweme.video.simplayer.TTNetClientApi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Ij7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47409Ij7 implements InterfaceC47412IjA {
    public final TTNetClientApi LIZ;
    public final C73318Sq2 LIZIZ = new C73318Sq2();
    public final InterfaceC789838c LIZJ;

    public static String LJ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-6456053403249970109"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    @Override // X.InterfaceC47412IjA
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC47412IjA
    public final void cancel() {
        this.LIZIZ.LIZLLL();
    }

    public C47409Ij7(InterfaceC789838c interfaceC789838c) {
        this.LIZJ = interfaceC789838c;
        this.LIZ = (TTNetClientApi) interfaceC789838c.create(TTNetClientApi.class);
    }

    public static List LJI(java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        C77800Ug8.LJFF("x-tt-dataflow-id", "671088898", arrayList);
        if (map != null) {
            for (String str : map.keySet()) {
                C77800Ug8.LJFF(str, (String) map.get(str), arrayList);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC47412IjA
    public final java.util.Map<String, String> getRequestHeader(String str) {
        java.util.Map<String, String> LIZ = C66952QPk.LIZ(str);
        if (LIZ != null && !LIZ.isEmpty()) {
            try {
                LIZ.put("cookie", LJ(CookieManager.getInstance(), EFJ.LIZ));
            } catch (Throwable unused) {
            }
        }
        return LIZ;
    }

    @Override // X.InterfaceC47412IjA
    public final void LIZ(String str, InterfaceC47416IjE interfaceC47416IjE) {
        LJFF(str, null, null, 0, interfaceC47416IjE);
    }

    @Override // X.InterfaceC47412IjA
    public final void LIZIZ(String str, java.util.Map<String, String> map, InterfaceC47416IjE interfaceC47416IjE) {
        LJFF(str, map, null, 0, interfaceC47416IjE);
    }

    @Override // X.InterfaceC47412IjA
    public final void LIZJ(String str, java.util.Map<String, String> map, JSONObject jSONObject, int i, InterfaceC47416IjE interfaceC47416IjE) {
        LJFF(str, map, jSONObject, i, interfaceC47416IjE);
    }

    public final void LJFF(String str, java.util.Map<String, String> map, JSONObject jSONObject, int i, InterfaceC47416IjE interfaceC47416IjE) {
        C73318Sq2 c73318Sq2 = this.LIZIZ;
        C73428Sro LJJL = AbstractC73672Svk.LJJIIJZLJL(new ACallableS3S1301000_8(this, i, str, map, jSONObject, 1)).LJJL(T16.LIZ());
        C47410Ij8 c47410Ij8 = new C47410Ij8(interfaceC47416IjE);
        LJJL.LIZ(c47410Ij8);
        c73318Sq2.LIZ(c47410Ij8);
    }
}
