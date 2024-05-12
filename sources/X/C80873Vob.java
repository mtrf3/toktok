package X;

import X.AbstractC80600VkC;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;

/* renamed from: X.Vob, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80873Vob<S extends AbstractC80600VkC> extends AbstractC80872Voa {
    public AbstractC80875Vod<S> LJLLILLLL;
    public AbstractC261710z LJLLJ;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJLLILLLL.LIZLLL();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJLLILLLL.LJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        AbstractC80875Vod<S> abstractC80875Vod = this.LJLLILLLL;
        float LIZIZ = LIZIZ();
        abstractC80875Vod.LIZ.LIZ();
        abstractC80875Vod.LIZ(LIZIZ, canvas);
        this.LJLLILLLL.LIZJ(canvas, this.LJLJLLL);
        int i = 0;
        while (true) {
            AbstractC261710z abstractC261710z = this.LJLLJ;
            int[] iArr = (int[]) abstractC261710z.LIZJ;
            if (i < iArr.length) {
                AbstractC80875Vod<S> abstractC80875Vod2 = this.LJLLILLLL;
                Paint paint = this.LJLJLLL;
                float[] fArr = (float[]) abstractC261710z.LIZIZ;
                int i2 = i * 2;
                abstractC80875Vod2.LIZIZ(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // X.AbstractC80872Voa
    public final boolean LJFF(boolean z, boolean z2, boolean z3) {
        boolean LJFF = super.LJFF(z, z2, z3);
        if (!isRunning()) {
            this.LJLLJ.LIZJ();
        }
        C80880Voi c80880Voi = this.LJLJI;
        ContentResolver contentResolver = this.LJLIL.getContentResolver();
        c80880Voi.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && f > 0.0f))) {
            this.LJLLJ.LJIIIIZZ();
        }
        return LJFF;
    }

    public C80873Vob(Context context, AbstractC80600VkC abstractC80600VkC, AbstractC80875Vod<S> abstractC80875Vod, AbstractC261710z abstractC261710z) {
        super(context, abstractC80600VkC);
        this.LJLLILLLL = abstractC80875Vod;
        abstractC80875Vod.LIZIZ = this;
        this.LJLLJ = abstractC261710z;
        abstractC261710z.LIZ = this;
    }
}
