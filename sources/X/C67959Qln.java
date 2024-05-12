package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.globalpayment.googlepayapi.PIPOPayActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Qln, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67959Qln {
    public static final C67959Qln LIZ = new C67959Qln();
    public static C67907Qkx LIZIZ;
    public static WeakReference<Context> LIZJ;
    public static InterfaceC67979Qm7 LIZLLL;
    public static C58911NAd LJ;
    public static C67960Qlo LJFF;
    public static String LJI;
    public static boolean LJII;

    public static void LIZIZ() {
        C67964Qls c67964Qls = new C67964Qls(EnumC67961Qlp.UserCancel, null);
        InterfaceC67979Qm7 interfaceC67979Qm7 = LIZLLL;
        if (interfaceC67979Qm7 != null) {
            interfaceC67979Qm7.LIZ(c67964Qls);
            C67960Qlo c67960Qlo = LJFF;
            if (c67960Qlo != null) {
                c67960Qlo.LIZ(c67964Qls);
                return;
            } else {
                o.LJIJI("monitor");
                throw null;
            }
        }
        o.LJIJI("callback");
        throw null;
    }

    public static void LIZ(int i) {
        C67964Qls c67964Qls = new C67964Qls(EnumC67961Qlp.LaunchActivityError, null);
        InterfaceC67979Qm7 interfaceC67979Qm7 = LIZLLL;
        if (interfaceC67979Qm7 != null) {
            interfaceC67979Qm7.LIZ(c67964Qls);
            C67960Qlo c67960Qlo = LJFF;
            if (c67960Qlo != null) {
                c67960Qlo.LIZ(c67964Qls);
                return;
            } else {
                o.LJIJI("monitor");
                throw null;
            }
        }
        o.LJIJI("callback");
        throw null;
    }

    public static void LIZJ(int i) {
        C67964Qls c67964Qls = new C67964Qls(EnumC67961Qlp.GoogleAPIError, null);
        InterfaceC67979Qm7 interfaceC67979Qm7 = LIZLLL;
        if (interfaceC67979Qm7 != null) {
            interfaceC67979Qm7.LIZ(c67964Qls);
            C67960Qlo c67960Qlo = LJFF;
            if (c67960Qlo != null) {
                c67960Qlo.LIZ(c67964Qls);
                return;
            } else {
                o.LJIJI("monitor");
                throw null;
            }
        }
        o.LJIJI("callback");
        throw null;
    }

    public final void LIZLLL(C67963Qlr c67963Qlr) {
        boolean booleanValue;
        String str;
        int i;
        Boolean bool = c67963Qlr.LIZ;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        LJI = c67963Qlr.LJI;
        if (booleanValue) {
            str = "12202103X8Mz5E";
        } else {
            str = c67963Qlr.LJFF;
        }
        LJ = new C58911NAd(str, c67963Qlr.LIZLLL, booleanValue);
        LJFF = new C67960Qlo(c67963Qlr.LIZIZ, c67963Qlr.LJ);
        C58911NAd c58911NAd = LJ;
        if (c58911NAd != null) {
            Context context = c67963Qlr.LIZIZ;
            o.LJIIIZ(context, "context");
            if (c58911NAd.LIZLLL) {
                i = 3;
            } else {
                i = 1;
            }
            C67958Qlm c67958Qlm = new C67958Qlm();
            if (i == 2 || i == 1 || i == 3) {
                c67958Qlm.LIZ = i;
                LIZIZ = new C67907Qkx(context, new C67905Qkv(c67958Qlm));
                LIZJ = new WeakReference<>(c67963Qlr.LIZIZ);
                LIZLLL = c67963Qlr.LIZJ;
                LJII = true;
                return;
            }
            throw new IllegalArgumentException(C16880lQ.LLLZI(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
        }
        o.LJIJI("utils");
        throw null;
    }

    public static void LJ(List networkList, JSONObject jSONObject) {
        C67960Qlo c67960Qlo = LJFF;
        if (c67960Qlo != null) {
            c67960Qlo.LIZIZ("pipo_googlepayapi_request_payment_start", jSONObject, null);
            C58911NAd c58911NAd = LJ;
            if (c58911NAd != null) {
                String str = LJI;
                o.LJIIIZ(networkList, "networkList");
                JSONObject jSONObject2 = C58911NAd.LJFF;
                JSONArray jSONArray = new JSONArray();
                JSONObject LIZ2 = c58911NAd.LIZ(networkList);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("gateway", c58911NAd.LIZIZ);
                jSONObject4.put("gatewayMerchantId", c58911NAd.LIZ);
                jSONObject3.put("parameters", jSONObject4);
                jSONObject3.put("type", "PAYMENT_GATEWAY");
                LIZ2.put("tokenizationSpecification", jSONObject3);
                jSONObject2.put("allowedPaymentMethods", jSONArray.put(LIZ2));
                jSONObject2.put("transactionInfo", jSONObject);
                jSONObject2.put("shippingAddressRequired", false);
                if (str != null) {
                    jSONObject2.put("merchantInfo", new JSONObject().put("merchantName", str));
                }
                String jSONObject5 = jSONObject2.toString();
                o.LJIIIIZZ(jSONObject5, "utils.getPaymentDataRequ… merchantName).toString()");
                WeakReference<Context> weakReference = LIZJ;
                if (weakReference != null) {
                    Intent intent = new Intent(weakReference.get(), (Class<?>) PIPOPayActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra("requestJSONStr", jSONObject5);
                    WeakReference<Context> weakReference2 = LIZJ;
                    if (weakReference2 != null) {
                        Context context = weakReference2.get();
                        if (context == null) {
                            return;
                        }
                        C16880lQ.LIZJ(context, intent);
                        return;
                    }
                    o.LJIJI("context");
                    throw null;
                }
                o.LJIJI("context");
                throw null;
            }
            o.LJIJI("utils");
            throw null;
        }
        o.LJIJI("monitor");
        throw null;
    }
}
