package X;

import android.graphics.Bitmap;

/* renamed from: X.W8p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81803W8p {
    public int LIZ;
    public long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final W9S LJ;

    public final synchronized int LIZIZ() {
        return this.LIZ;
    }

    public final synchronized int LIZJ() {
        return this.LIZJ;
    }

    public final synchronized int LIZLLL() {
        return this.LIZLLL;
    }

    public final synchronized long LJ() {
        return this.LIZIZ;
    }

    public final synchronized void LIZ(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int LIZJ = W6I.LIZJ(bitmap);
        if (this.LIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("No bitmaps registered.", z);
        long j = LIZJ;
        if (j <= this.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Integer.valueOf(LIZJ), Long.valueOf(this.LIZIZ)};
        if (z2) {
            this.LIZIZ -= j;
            this.LIZ--;
        } else {
            throw new IllegalArgumentException(C32151Nz.LJIILL("Bitmap size bigger than the total registered size: %d, %d", objArr));
        }
    }

    public C81803W8p(int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        C32151Nz.LJI(i2 > 0);
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = new W9S(this);
    }
}
