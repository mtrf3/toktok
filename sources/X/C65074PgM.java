package X;

import android.text.TextUtils;

/* renamed from: X.PgM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65074PgM implements InterfaceC48121Iub {
    public final C65077PgP LIZ;
    public final C65266PjS LIZIZ;

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        PW8 pw8 = (PW8) pxz;
        C64618PXq newBuilder = pw8.LJFF.newBuilder();
        if (!TextUtils.isEmpty(this.LIZ.LIZIZ)) {
            newBuilder.LIZLLL("User-Agent", this.LIZ.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LIZIZ.LIZIZ())) {
            newBuilder.LIZLLL("X-Client-UUID", this.LIZIZ.LIZIZ());
        }
        newBuilder.LIZLLL("X-Twitter-Polling", "true");
        return pw8.LIZ(newBuilder.LIZIZ());
    }

    public C65074PgM(C65077PgP c65077PgP, C65266PjS c65266PjS) {
        this.LIZ = c65077PgP;
        this.LIZIZ = c65266PjS;
    }
}
