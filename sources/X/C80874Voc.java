package X;

import X.AbstractC80600VkC;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: X.Voc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80874Voc<S extends AbstractC80600VkC> extends AbstractC80872Voa {
    public static final C80877Vof LJLZ = new C80877Vof();
    public AbstractC80875Vod<S> LJLLILLLL;
    public final C00Q LJLLJ;
    public final C39661h4 LJLLL;
    public float LJLLLL;
    public boolean LJLLLLLL;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJLLILLLL.LIZLLL();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJLLILLLL.LJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.LJLLL.LIZLLL();
        this.LJLLLL = getLevel() / 10000.0f;
        invalidateSelf();
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
        this.LJLLILLLL.LIZIZ(canvas, this.LJLJLLL, 0.0f, this.LJLLLL, C78966Uyw.LJIILJJIL(this.LJLILLLLZI.LIZJ[0], this.LJLL));
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.LJLLLLLL) {
            this.LJLLL.LIZLLL();
            this.LJLLLL = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        this.LJLLL.LJI(this.LJLLLL * 10000.0f);
        this.LJLLL.LJII(i);
        return true;
    }

    public C80874Voc(Context context, AbstractC80600VkC abstractC80600VkC, AbstractC80875Vod<S> abstractC80875Vod) {
        super(context, abstractC80600VkC);
        this.LJLLILLLL = abstractC80875Vod;
        abstractC80875Vod.LIZIZ = this;
        C00Q c00q = new C00Q();
        this.LJLLJ = c00q;
        c00q.LIZ(1.0f);
        c00q.LIZIZ(50.0f);
        C39661h4 c39661h4 = new C39661h4(this, LJLZ);
        this.LJLLL = c39661h4;
        c39661h4.LJIL = c00q;
        if (this.LJLJLJ != 1.0f) {
            this.LJLJLJ = 1.0f;
            invalidateSelf();
        }
    }

    @Override // X.AbstractC80872Voa
    public final boolean LJFF(boolean z, boolean z2, boolean z3) {
        boolean LJFF = super.LJFF(z, z2, z3);
        C80880Voi c80880Voi = this.LJLJI;
        ContentResolver contentResolver = this.LJLIL.getContentResolver();
        c80880Voi.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.LJLLLLLL = true;
        } else {
            this.LJLLLLLL = false;
            this.LJLLJ.LIZIZ(50.0f / f);
        }
        return LJFF;
    }
}
