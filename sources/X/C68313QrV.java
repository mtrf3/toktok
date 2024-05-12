package X;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.QrV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68313QrV {
    public static volatile C68313QrV LIZIZ;
    public static volatile C68313QrV LIZJ;
    public static final C68313QrV LIZLLL = new C68313QrV(0);
    public final java.util.Map LIZ;

    public static C68313QrV LIZ() {
        C68313QrV c68313QrV = LIZIZ;
        if (c68313QrV == null) {
            synchronized (C68313QrV.class) {
                c68313QrV = LIZIZ;
                if (c68313QrV == null) {
                    c68313QrV = LIZLLL;
                    LIZIZ = c68313QrV;
                }
            }
        }
        return c68313QrV;
    }

    public C68313QrV() {
        this.LIZ = new HashMap();
    }

    public C68313QrV(int i) {
        this.LIZ = Collections.emptyMap();
    }
}
