package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;

/* renamed from: X.FwF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40579FwF {
    public static volatile C40579FwF LIZIZ;
    public final Object LIZ;

    public static C40579FwF LIZLLL() {
        if (LIZIZ == null) {
            synchronized (LiveWsMessage.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C40579FwF(0);
                }
            }
        }
        return LIZIZ;
    }

    public C40579FwF(int i) {
        if (i != 1) {
            this.LIZ = new OJM();
        } else {
            this.LIZ = new C40561Fvx();
        }
    }

    public final void LIZ(C40614Fwo c40614Fwo) {
        C40561Fvx c40561Fvx = (C40561Fvx) this.LIZ;
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LJ = c40614Fwo;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        c40561Fvx.LIZIZ.LIZ(c40561Fvx);
    }

    public final void LIZIZ(Exception exc) {
        C40561Fvx c40561Fvx = (C40561Fvx) this.LIZ;
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LJ = exc;
                c40561Fvx.LIZIZ.LIZ(c40561Fvx);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(Object obj) {
        C40561Fvx c40561Fvx = (C40561Fvx) this.LIZ;
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LIZLLL = obj;
                c40561Fvx.LIZIZ.LIZ(c40561Fvx);
            }
        }
    }
}
