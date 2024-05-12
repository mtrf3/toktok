package X;

import java.net.HttpCookie;
import java.util.List;

/* renamed from: X.XaA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85074XaA implements InterfaceC85087XaN {
    public final String LIZ;
    public final String LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public final List<HttpCookie> LIZLLL;
    public final Double LJ;
    public final Double LJFF;

    public C85074XaA() {
        this(null, null, 63);
    }

    public C85074XaA(String str, String str2, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }
}
