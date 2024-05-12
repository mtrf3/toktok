package X;

import java.io.FileOutputStream;

/* renamed from: X.X9w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84384X9w {
    public final C84383X9v LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C84382X9u LIZJ;

    public final void LIZ() {
        this.LIZJ.LIZ(this, false);
    }

    public final void LIZIZ() {
        if (this.LIZIZ) {
            this.LIZJ.LIZ(this, false);
            this.LIZJ.LJIJ(this.LIZ.LIZ);
        } else {
            this.LIZJ.LIZ(this, true);
        }
    }

    public final C79564VKm LIZJ() {
        C79564VKm c79564VKm;
        synchronized (this.LIZJ) {
            if (this.LIZ.LIZLLL == this) {
                c79564VKm = new C79564VKm(this, new FileOutputStream(this.LIZ.LIZIZ(0)));
            } else {
                throw new IllegalStateException();
            }
        }
        return c79564VKm;
    }

    public C84384X9w(C84382X9u c84382X9u, C84383X9v c84383X9v) {
        this.LIZJ = c84382X9u;
        this.LIZ = c84383X9v;
    }
}
