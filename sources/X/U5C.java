package X;

import Y.ARunnableS41S0100000_5;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidBackgroundOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U5C extends Drawable {
    public final DataChannel LIZ;
    public final InterfaceC76609U4v LIZIZ;
    public final Paint LIZJ;
    public int LIZLLL;
    public int LJ;
    public Rect LJFF;
    public boolean LJI;
    public boolean LJII;
    public List<String> LJIIIIZZ;
    public final boolean[] LJIIIZ;
    public BitmapDrawable LJIIJ;
    public ARunnableS41S0100000_5 LJIIJJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r2 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Cc2, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C31682Cc2 LIZJ() {
        /*
            r3 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LIZ
            if (r1 == 0) goto Le
            java.lang.Class<X.TdN> r0 = X.C75081TdN.class
            java.lang.Object r2 = r1.kv0(r0)
            X.Cc2 r2 = (X.C31682Cc2) r2
            if (r2 != 0) goto L21
        Le:
            X.Cc2 r2 = new X.Cc2
            r2.<init>()
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LIZ
            if (r1 == 0) goto L21
            java.lang.Class<X.TdN> r0 = X.C75081TdN.class
            X.Cps r0 = r1.gv0(r0)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r2
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U5C.LIZJ():X.Cc2");
    }

    public final void LIZLLL() {
        List<String> list;
        if (this.LJIIJ != null || (list = this.LJIIIIZZ) == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            W5O LIZ = W5P.LIZLLL(UriProtector.parse(it.next())).LIZ();
            o.LJIIIIZZ(LIZ, "newBuilderWithSource(Uri.parse(url)).build()");
            W4W<C81392Vwy<W5A>> LJ = W5I.LIZ().LJ(LIZ, null);
            if (LJ != null) {
                LJ.LJ(new U5F(this, LJ), C38016Ew0.LIZ);
            }
        }
    }

    public final Bitmap LIZ(Bitmap bitmap) {
        int i;
        int i2;
        int i3;
        int i4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int LJIJ = (int) C15380j0.LJIJ(this.LIZLLL);
        int LJIJ2 = (int) C15380j0.LJIJ(this.LJ);
        if (width / height > LJIJ / LJIJ2) {
            i2 = (LJIJ * height) / LJIJ2;
            i = height;
        } else {
            i = (LJIJ2 * width) / LJIJ;
            i2 = width;
        }
        if (width > i2) {
            i3 = (width - i2) / 2;
        } else {
            i3 = 0;
        }
        if (height > i) {
            i4 = (height - i) / 2;
        } else {
            i4 = 0;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i3, i4, i2, i, (Matrix) null, false);
        o.LJIIIIZZ(createBitmap, "createBitmap(bm, startX,… retX, retY, null, false)");
        return createBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Rect rect = this.LJFF;
        BitmapDrawable bitmapDrawable = this.LJIIJ;
        BitmapDrawable bitmapDrawable2 = LIZJ().LIZ;
        boolean LJJIFFI = C29306Beo.LJJIFFI(Boolean.valueOf(LIZJ().LIZIZ));
        if (rect != null && bitmapDrawable != null && MultiGuestAndroidBackgroundOptSetting.INSTANCE.isOptSetBg() && this.LJII) {
            LIZIZ(bitmapDrawable, canvas, rect);
            return;
        }
        if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && LJJIFFI && rect != null) {
            LIZIZ(bitmapDrawable2, canvas, rect);
            return;
        }
        if (this.LJIIIZ[0]) {
            this.LIZIZ.LIZ().draw(canvas);
        }
        if (this.LJIIIZ[1]) {
            this.LIZIZ.LIZIZ().draw(canvas);
        }
        if (this.LJIIIZ[2]) {
            this.LIZIZ.LIZJ().draw(canvas);
        }
        if (!this.LJIIIZ[3]) {
            return;
        }
        this.LIZIZ.LIZLLL().draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LIZJ.getAlpha() != i) {
            this.LIZJ.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (!o.LJ(this.LIZJ.getColorFilter(), colorFilter)) {
            this.LIZJ.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    public U5C(DataChannel dataChannel, InterfaceC76609U4v bgInjector) {
        o.LJIIIZ(bgInjector, "bgInjector");
        this.LIZ = dataChannel;
        this.LIZIZ = bgInjector;
        this.LIZJ = new Paint(6);
        this.LJIIIZ = new boolean[4];
        C221108m2.LIZIZ(U5G.LJLIL);
        C221108m2.LIZIZ(U5D.LJLIL);
    }

    public final void LIZIZ(BitmapDrawable bitmapDrawable, Canvas canvas, Rect rect) {
        bitmapDrawable.setBounds(0, 0, this.LIZLLL, this.LJ);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.LIZLLL, this.LJ, this.LIZJ);
        bitmapDrawable.draw(canvas);
        this.LIZJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawRect(new RectF(rect), this.LIZJ);
        this.LIZJ.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }
}
