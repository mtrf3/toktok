package X;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class FPD {
    public final java.util.Map<String, C36608EYi> LIZ = new HashMap();
    public final /* synthetic */ FPA LIZIZ;

    public final void LIZ() {
        synchronized (this) {
            ((HashMap) this.LIZ).clear();
        }
    }

    public FPD(FPA fpa) {
        this.LIZIZ = fpa;
    }

    public final C36608EYi LIZIZ(String str) {
        C36608EYi c36608EYi;
        synchronized (this) {
            c36608EYi = (C36608EYi) ((HashMap) this.LIZ).get(str);
        }
        return c36608EYi;
    }

    public final void LIZJ(String str) {
        synchronized (this) {
            ((HashMap) this.LIZ).remove(str);
        }
    }

    public final void LIZLLL(C36608EYi c36608EYi, String str) {
        synchronized (this) {
            ((HashMap) this.LIZ).put(str, c36608EYi);
        }
    }
}
