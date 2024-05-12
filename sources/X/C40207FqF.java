package X;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FqF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40207FqF {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        EnumC40208FqG[] values = EnumC40208FqG.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (o.LJ(values[i].getValue(), str)) {
                if (str != null) {
                    return str;
                }
            } else {
                i++;
            }
        }
        return EnumC40208FqG.VIDEO.getValue();
    }

    public static void LIZIZ(View view, String str, boolean z) {
        C18090nN c18090nN;
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2;
        if (E9D.LIZ().pageSourceEnable == 1) {
            C18080nM.LIZ.getClass();
            C18090nN c18090nN2 = C18080nM.LIZJ;
            if (c18090nN2 != null && c18090nN2.LJJIL == null && c18090nN2 != null) {
                c18090nN2.LJJIL = new LinkedHashMap();
            }
            if (view == null || (c18090nN = C18080nM.LIZLLL(view, null)) == null) {
                c18090nN = C18080nM.LIZJ;
            }
            if (z) {
                if (c18090nN != null && (map2 = c18090nN.LJJIL) != null) {
                    map2.put("feed_ec_card_price_type", LIZ(str));
                    return;
                }
                return;
            }
            if (c18090nN == null || (map = c18090nN.LJJIL) == null) {
                return;
            }
            map.remove("feed_ec_card_price_type");
        }
    }
}
