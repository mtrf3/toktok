package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8B extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final E8B LJLIL = new E8B();

    public E8B() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        Object LIZ;
        Object LIZ2;
        android.net.Uri uri;
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        try {
            LIZ = UriProtector.parse(schema1);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        android.net.Uri uri2 = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        android.net.Uri uri3 = (android.net.Uri) LIZ;
        try {
            LIZ2 = UriProtector.parse(schema2);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        android.net.Uri uri4 = (android.net.Uri) LIZ2;
        if (uri3 != null) {
            uri = C78939UyV.LJJJJJ(uri3, NIC.LIZIZ);
        } else {
            uri = null;
        }
        if (uri4 != null) {
            uri2 = C78939UyV.LJJJJJ(uri4, NIC.LIZIZ);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("tempSchema1 = ");
        LIZ3.append(uri);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ3), "PromoteAdHybridDelegate");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("tempSchema2 = ");
        LIZ4.append(uri2);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ4), "PromoteAdHybridDelegate");
        return Boolean.valueOf(o.LJ(uri, uri2));
    }
}
