package X;

import java.util.ArrayList;

/* renamed from: X.VAo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79306VAo {
    public final Object LIZ = new Object();
    public final ArrayList<C79304VAm> LIZIZ = new ArrayList<>();

    public final void LIZ() {
        synchronized (this.LIZ) {
            this.LIZIZ.clear();
        }
    }

    public final void LIZIZ() {
        synchronized (this.LIZ) {
            if (this.LIZIZ.size() > 0) {
                this.LIZIZ.remove(0);
            }
        }
    }

    public final int LIZJ() {
        int size;
        synchronized (this.LIZ) {
            size = this.LIZIZ.size();
        }
        return size;
    }
}
