package X;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W4t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81703W4t<T> implements IHD<T> {
    public final /* synthetic */ C81704W4u LIZ;
    public final /* synthetic */ CountDownLatch LIZIZ;
    public final /* synthetic */ C81704W4u LIZJ;

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZ(W4W<T> w4w) {
        try {
            this.LIZJ.LIZ = (T) ((AbstractC48384Iyq) w4w).LJFF();
        } finally {
            this.LIZIZ.countDown();
        }
    }

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
        this.LIZIZ.countDown();
    }

    @Override // X.IHD
    public final void LIZLLL(W4W<T> w4w) {
        if (!w4w.LIZIZ()) {
            return;
        }
        try {
            this.LIZ.LIZ = w4w.getResult();
        } finally {
            this.LIZIZ.countDown();
        }
    }

    public C81703W4t(C81704W4u c81704W4u, CountDownLatch countDownLatch, C81704W4u c81704W4u2) {
        this.LIZ = c81704W4u;
        this.LIZIZ = countDownLatch;
        this.LIZJ = c81704W4u2;
    }
}
