package X;

import java.util.HashMap;

/* renamed from: X.Pk0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65300Pk0 {
    public final boolean LIZ;
    public final String LIZIZ;
    public java.util.Map<String, Object> LIZJ;
    public final String LIZLLL;

    public C65300Pk0() {
        this.LIZJ = new HashMap();
        this.LIZ = false;
    }

    public C65300Pk0(java.util.Map map) {
        new HashMap();
        this.LIZ = false;
        this.LIZIZ = "";
        this.LIZJ = map;
    }

    public C65300Pk0(String str) {
        this.LIZJ = new HashMap();
        this.LIZ = false;
        this.LIZIZ = str;
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        this.LIZJ.put(str, obj);
    }

    public C65300Pk0(boolean z, String str, String str2) {
        this.LIZJ = new HashMap();
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZLLL = str2;
    }
}
