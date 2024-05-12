package X;

import java.util.HashMap;

/* renamed from: X.Jdb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49615Jdb extends VNN {
    public final java.util.Map<String, Object> LIZLLL;

    @Override // X.VNN
    public final String LIZIZ() {
        return "detail";
    }

    @Override // X.VNN
    public final java.util.Map<String, Object> LIZ() {
        return this.LIZLLL;
    }

    public C49615Jdb(int i, String str) {
        super(i, str);
        this.LIZLLL = new HashMap();
    }

    public final void LIZJ(Object obj, String str) {
        this.LIZLLL.put(str, obj);
    }

    public C49615Jdb(int i, String str, java.util.Map<String, Object> map) {
        super(i, str);
        this.LIZLLL = map;
    }
}
