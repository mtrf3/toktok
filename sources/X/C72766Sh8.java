package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.Sh8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72766Sh8 extends Drawable implements InterfaceC72768ShA {
    public InterfaceC78716Uuu LJLJJL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public long LJZ;
    public String LJZI;
    public final int LJLJLJ = 80;
    public final Paint LJLJLLL = new Paint(1);
    public final Matrix LJLL = new Matrix();
    public final Rect LJLLI = new Rect();
    public final RectF LJLLILLLL = new RectF();
    public int LJLILLLLZI = -1;
    public int LJLJI = -1;
    public int LJLJJI = -1;
    public int LJLJJLL = -1;
    public int LJLJL = -1;
    public String LJLIL = LiveGiftNewGifterBadgeSetting.DEFAULT;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C72766Sh8() {
        invalidateSelf();
        this.LJZ = -1L;
        this.LJZI = null;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72766Sh8.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i;
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.LJLJLLL.setTextSize(min);
        int i2 = min + 8;
        this.LJLLLL = i2;
        int i3 = this.LJLJLJ;
        if (i3 == 80) {
            this.LJLLLL = -i2;
        }
        this.LJLLJ = rect.left + 10;
        if (i3 == 80) {
            i = rect.bottom - 10;
        } else {
            i = rect.top + 10 + 10;
        }
        this.LJLLL = i;
    }

    public final void LIZ(Canvas canvas, String str, Object... objArr) {
        canvas.drawText(C16880lQ.LLLZ(str, objArr), this.LJLLLLLL, this.LJLZ, this.LJLJLLL);
        this.LJLZ += this.LJLLLL;
    }
}
