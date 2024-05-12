package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rmo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70570Rmo {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2, String productID) {
        String LJIIJJI;
        o.LJIIIZ(productID, "productID");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(str2);
        LIZ2.append('_');
        LIZ2.append(productID);
        LIZ2.append('_');
        LIZ2.append(System.currentTimeMillis());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (!C19N.LJ("enable_ec_mall_track_id_md5", true) || LIZIZ == null || (LJIIJJI = C77119UOl.LJIIJJI(LIZIZ.getBytes())) == null) {
            return LIZIZ;
        }
        return LJIIJJI;
    }
}
