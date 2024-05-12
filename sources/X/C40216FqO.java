package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.FqO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40216FqO implements InterfaceC40219FqR {
    public static final java.util.Map<String, InterfaceC40219FqR> LIZIZ;
    public InterfaceC40219FqR LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZIZ = hashMap;
        hashMap.put("VIVO", new C40220FqS());
        hashMap.put("MEIZU", new C40218FqQ());
        hashMap.put("HUAWEI", new C40215FqN());
        hashMap.put("XIAOMI", new C40213FqL());
        hashMap.put("OPPO", new C40214FqM());
    }

    public final InterfaceC40219FqR LIZJ() {
        if (this.LIZ == null) {
            this.LIZ = new C40217FqP();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                java.util.Map<String, InterfaceC40219FqR> map = LIZIZ;
                if (((HashMap) map).containsKey(upperCase)) {
                    this.LIZ = (InterfaceC40219FqR) ((HashMap) map).get(upperCase);
                }
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC40219FqR
    public final boolean LIZ() {
        return LIZJ().LIZ();
    }

    @Override // X.InterfaceC40219FqR
    public final Intent LIZIZ(Context context) {
        return LIZJ().LIZIZ(context);
    }
}
