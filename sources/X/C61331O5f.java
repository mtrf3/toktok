package X;

import android.content.Context;

/* renamed from: X.O5f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61331O5f {
    public static volatile C61331O5f LIZJ;
    public java.util.Map<String, String> LIZ;
    public Context LIZIZ;

    public static C61331O5f LIZ() {
        if (LIZJ == null) {
            synchronized (C8HI.class) {
                if (LIZJ == null) {
                    LIZJ = new C61331O5f();
                }
            }
        }
        return LIZJ;
    }
}
