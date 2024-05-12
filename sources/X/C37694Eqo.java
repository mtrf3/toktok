package X;

import android.text.TextUtils;

/* renamed from: X.Eqo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37694Eqo implements InterfaceC66830QKs {
    public static C37694Eqo LIZIZ;
    public final String LIZ;

    public C37694Eqo() {
        try {
            if (System.getProperty("java.vm.name") == null || !System.getProperty("java.vm.name").toLowerCase().contains("lemur")) {
                if (System.getProperty("ro.yunos.version") == null) {
                    return;
                }
            }
            String LIZIZ2 = LIZIZ("ro.aliyun.clouduuid");
            this.LIZ = LIZIZ2;
            if (TextUtils.isEmpty(LIZIZ2)) {
                this.LIZ = LIZIZ("ro.sys.aliyun.clouduuid");
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC66830QKs
    public final String LIZ() {
        return this.LIZ;
    }

    public static String LIZIZ(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "false");
        } catch (Exception unused) {
            return "false";
        }
    }
}
