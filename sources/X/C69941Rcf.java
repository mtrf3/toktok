package X;

/* renamed from: X.Rcf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69941Rcf {
    public static final C69941Rcf LIZ = new C69941Rcf();

    public final synchronized boolean LIZ() {
        boolean z;
        z = false;
        if (C66822jm.LIZ.getInt("ecom_ever_favorite_product", 0) == 1) {
            z = true;
        }
        return z;
    }

    public final synchronized boolean LIZIZ() {
        boolean z;
        if (C79057V0z.LJIL(C66822jm.LIZ, "ecom_favorite_list_guide") < 3) {
            if (C27566Arq.LIZ()) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
