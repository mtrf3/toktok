package X;

import defpackage.q;
import java.util.LinkedHashMap;

/* renamed from: X.Wh3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82953Wh3 {
    public String LIZ;
    public String LIZIZ;
    public final java.util.Map<String, String> LIZJ = new LinkedHashMap();
    public final String LIZLLL;
    public final String LJ;
    public String LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BankCardRequest{mMerchantUserId='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", mNonce='");
        return q.LIZIZ(LIZ, this.LJ, '}', LIZ);
    }

    public C82953Wh3(String str, String str2) {
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
