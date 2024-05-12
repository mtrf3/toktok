package X;

/* renamed from: X.UWs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77334UWs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C77334UWs c77334UWs, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c77334UWs.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", str2);
        if (str != null) {
            c188727au.LJI("toast_type", str);
        }
        if (str3 != null) {
            c188727au.LJI("type", str3);
        }
        FMX.LJIIL("storage_toast_clean", c188727au.LIZ);
    }
}
