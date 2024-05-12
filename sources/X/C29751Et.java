package X;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29751Et implements C0GV<Bitmap> {
    public final /* synthetic */ C04750Gp LIZ;
    public final /* synthetic */ AtomicInteger LIZIZ;
    public final /* synthetic */ C0GY LIZJ;
    public final /* synthetic */ C0GL LIZLLL;

    @Override // X.C0GV
    public final void onFailed() {
        this.LIZJ.LJIIL = false;
        this.LIZLLL.LIZ("");
    }

    @Override // X.C0GV
    public final void onSuccess(Bitmap bitmap) {
        this.LIZ.LJI = bitmap;
        if (this.LIZIZ.decrementAndGet() == 0) {
            C0GY c0gy = this.LIZJ;
            c0gy.LJIIL = true;
            this.LIZLLL.LIZIZ(c0gy);
        }
    }

    public C29751Et(C04750Gp c04750Gp, AtomicInteger atomicInteger, C0GY c0gy, C0GL c0gl) {
        this.LIZ = c04750Gp;
        this.LIZIZ = atomicInteger;
        this.LIZJ = c0gy;
        this.LIZLLL = c0gl;
    }
}
