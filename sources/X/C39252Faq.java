package X;

import android.content.Context;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import p83.a;

/* renamed from: X.Faq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39252Faq {
    public static a.C0043a LIZIZ(Context context) {
        o.LJIIJ(context, "context");
        a.C0043a c0043a = null;
        if (C39569Ffx.LIZIZ) {
            if (C39253Far.LIZIZ) {
                try {
                    c0043a = LIZ(context, C39568Ffw.LIZIZ);
                    return c0043a;
                } catch (Q0C unused) {
                    return c0043a;
                }
            }
            a.C0043a c0043a2 = C39253Far.LIZ;
            if (c0043a2 != null) {
                return c0043a2;
            }
            try {
                c0043a = LIZ(context, C39568Ffw.LIZIZ);
            } catch (Q0C unused2) {
            }
            C39253Far.LIZ = c0043a;
            return c0043a;
        }
        try {
            return LIZ(context, C39568Ffw.LIZIZ);
        } catch (Q0C unused3) {
            return null;
        }
    }

    public static a.C0043a LIZ(Context context, C78862UxG c78862UxG) {
        o.LJIIJ(context, "context");
        OHW ohw = new OHW(c78862UxG, "getAdvertisingIdInfo", new String[]{"gaid"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 103000);
        C78929UyL.LIZIZ(ohw, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", null);
        return (a.C0043a) C39207Fa7.LIZ(ohw, new AqS172S0100000_6(context, 62));
    }
}
