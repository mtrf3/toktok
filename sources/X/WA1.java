package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes15.dex */
public final class WA1 implements WAL {
    public final WBF LIZ;
    public final C81836W9w LIZIZ;
    public final WA7 LIZJ;
    public final Rect LIZLLL;
    public final int[] LJ;
    public final C81840WAa[] LJFF;
    public final Rect LJI = new Rect();
    public final Rect LJII = new Rect();
    public int LJIIIIZZ = 2;
    public Bitmap LJIIIZ;

    public final synchronized void LJI() {
        Bitmap bitmap = this.LJIIIZ;
        if (bitmap != null) {
            bitmap.recycle();
            this.LJIIIZ = null;
        }
    }

    @Override // X.WAL
    public final int LIZLLL() {
        return this.LIZLLL.height();
    }

    @Override // X.WAL
    public final int LJ() {
        return this.LIZLLL.width();
    }

    @Override // X.WAL
    public final int getFrameCount() {
        return this.LIZJ.getFrameCount();
    }

    @Override // X.WAL
    public final int getHeight() {
        return this.LIZJ.getHeight();
    }

    @Override // X.WAL
    public final int getLoopCount() {
        return this.LIZJ.getLoopCount();
    }

    @Override // X.WAL
    public final int getWidth() {
        return this.LIZJ.getWidth();
    }

    @Override // X.WAL
    public final C81836W9w LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.WAL
    public final int LIZ(int i) {
        return this.LJ[i];
    }

    @Override // X.WAL
    public final WA1 LJFF(Rect rect) {
        if (LJII(this.LIZJ, rect).equals(this.LIZLLL)) {
            return this;
        }
        return new WA1(this.LIZ, this.LIZIZ, rect);
    }

    @Override // X.WAL
    public final C81840WAa getFrameInfo(int i) {
        return this.LJFF[i];
    }

    public static Rect LJII(WA7 wa7, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, wa7.getWidth(), wa7.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), wa7.getWidth()), Math.min(rect.height(), wa7.getHeight()));
    }

    @Override // X.WAL
    public final void LIZJ(int i, Canvas canvas) {
        WAP frame = this.LIZJ.getFrame(i);
        try {
            if (this.LIZJ.doesRenderSupportScaling()) {
                LJIIJJI(canvas, frame);
            } else {
                LJIIJ(canvas, frame);
            }
        } finally {
            frame.dispose();
        }
    }

    public final synchronized void LJIIIZ(int i, int i2) {
        Bitmap bitmap = this.LJIIIZ;
        if (bitmap != null && (bitmap.getWidth() < i || this.LJIIIZ.getHeight() < i2)) {
            LJI();
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public final void LJIIJ(Canvas canvas, WAP wap) {
        int width = wap.getWidth();
        int height = wap.getHeight();
        int xOffset = wap.getXOffset();
        int yOffset = wap.getYOffset();
        synchronized (this) {
            LJIIIZ(width, height);
            synchronized (this.LJIIIZ) {
                this.LJIIIZ.eraseColor(0);
                try {
                    wap.renderFrame(width, height, this.LJIIIZ);
                    this.LJI.set(0, 0, width, height);
                    this.LJII.set(0, 0, width, height);
                    canvas.save();
                    canvas.translate(xOffset, yOffset);
                    canvas.drawBitmap(this.LJIIIZ, this.LJI, this.LJII, (Paint) null);
                    canvas.restore();
                } catch (IllegalStateException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(e.getMessage());
                    LIZ.append(LJIIIIZZ(this.LJIIIZ, width, height, null, this.LJIIIIZZ));
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public final void LJIIJJI(Canvas canvas, WAP wap) {
        double width = this.LIZLLL.width() / this.LIZJ.getWidth();
        double height = this.LIZLLL.height() / this.LIZJ.getHeight();
        int round = (int) Math.round(wap.getWidth() * width);
        int round2 = (int) Math.round(wap.getHeight() * height);
        int xOffset = (int) (wap.getXOffset() * width);
        int yOffset = (int) (wap.getYOffset() * height);
        synchronized (this) {
            int width2 = this.LIZLLL.width();
            int height2 = this.LIZLLL.height();
            LJIIIZ(width2, height2);
            synchronized (this.LJIIIZ) {
                this.LJIIIZ.eraseColor(0);
                try {
                    wap.renderFrame(round, round2, this.LJIIIZ);
                    this.LJI.set(0, 0, width2, height2);
                    this.LJII.set(xOffset, yOffset, width2 + xOffset, height2 + yOffset);
                    canvas.drawBitmap(this.LJIIIZ, this.LJI, this.LJII, (Paint) null);
                } catch (IllegalStateException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(e.getMessage());
                    LIZ.append(LJIIIIZZ(this.LJIIIZ, round, round2, this.LIZLLL, this.LJIIIIZZ));
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public WA1(WBF wbf, C81836W9w c81836W9w, Rect rect) {
        this.LIZ = wbf;
        this.LIZIZ = c81836W9w;
        WA7 wa7 = c81836W9w.LIZ;
        this.LIZJ = wa7;
        int[] frameDurations = wa7.getFrameDurations();
        this.LJ = frameDurations;
        wbf.getClass();
        for (int i = 0; i < frameDurations.length; i++) {
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
        }
        WBF wbf2 = this.LIZ;
        int[] iArr = this.LJ;
        wbf2.getClass();
        for (int i2 = 0; i2 < iArr.length; i2++) {
        }
        WBF wbf3 = this.LIZ;
        int[] iArr2 = this.LJ;
        wbf3.getClass();
        for (int i3 = 0; i3 < iArr2.length; i3++) {
        }
        this.LIZLLL = LJII(this.LIZJ, rect);
        this.LJFF = new C81840WAa[this.LIZJ.getFrameCount()];
        for (int i4 = 0; i4 < this.LIZJ.getFrameCount(); i4++) {
            this.LJFF[i4] = this.LIZJ.getFrameInfo(i4);
        }
    }

    public static String LJIIIIZZ(Bitmap bitmap, int i, int i2, Rect rect, int i3) {
        StringBuilder sb = new StringBuilder(", mTempBitmap:");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append(", frame:");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        if (rect != null) {
            sb.append(", renderedBounds:");
            sb.append(rect.width());
            sb.append("x");
            sb.append(rect.height());
        }
        sb.append(", decodeType:");
        sb.append(i3);
        return sb.toString();
    }
}
