package X;

import android.text.TextUtils;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final /* synthetic */ class ISX implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        HashMap<String, String> LIZ;
        Boolean bool;
        ISV.LIZJ();
        ISZ isz = (ISZ) ISV.LIZIZ();
        for (String str : isz.LJ.keySet()) {
            ISY LIZIZ = isz.LIZIZ(str);
            if (LIZIZ == null) {
                Object value = IZ8.J0.getValue();
                o.LJIIIIZZ(value, "<get-enableAntiLostWriteLast>(...)");
                if (((Boolean) value).booleanValue() && (LIZIZ = isz.LIZLLL(str)) != null) {
                }
            }
            if (LIZIZ.LIZIZ(EnumC46636ISa.VALID_STATUS) && (LIZ = isz.LIZ(str)) != null && !LIZ.isEmpty()) {
                for (String str2 : LIZ.keySet()) {
                    Object value2 = IZ8.J0.getValue();
                    o.LJIIIIZZ(value2, "<get-enableAntiLostWriteLast>(...)");
                    if (((Boolean) value2).booleanValue() || !ISQ.VIDEO_REQUEST.name().equals(str2)) {
                        String str3 = LIZ.get(str2);
                        if (str3 != null && !str3.isEmpty()) {
                            String LJ = a1.LJ(str, "_", str2);
                            if (TextUtils.isEmpty(LJ) || !isz.LJFF.containsKey(LJ) || (bool = isz.LJFF.get(LJ)) == null || !bool.booleanValue()) {
                                if (!TextUtils.isEmpty(LJ)) {
                                    isz.LJFF.put(LJ, Boolean.TRUE);
                                }
                                LIZIZ.LIZ(str, str2, str3);
                            }
                        }
                    }
                }
            }
        }
    }
}
