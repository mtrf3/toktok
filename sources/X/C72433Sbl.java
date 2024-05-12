package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o53.IDdS477S0100000_12;

/* renamed from: X.Sbl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72433Sbl extends C51588KMm {
    public final Paint LJLJL;
    public Bitmap LJLJLJ;
    public Drawable LJLJLLL;
    public BitmapShader LJLL;
    public Canvas LJLLI;
    public volatile boolean LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public final IDdS477S0100000_12 LJLLLL;

    @Override // X.C51588KMm, X.C62846OlW
    public void LIZ() {
        V8L v8l = new V8L();
        v8l.LIZIZ = true;
        getHierarchy().LJIL(v8l);
        getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        LJ();
    }

    public final void LJ() {
        Bitmap.Config config;
        if (!this.LJLLL) {
            return;
        }
        Drawable drawable = getDrawable();
        this.LJLJLLL = drawable;
        if (drawable == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        if (this.LJLJLLL.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        int intrinsicWidth = this.LJLJLLL.getIntrinsicWidth();
        int intrinsicHeight = this.LJLJLLL.getIntrinsicHeight();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = getWidth();
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = getHeight();
        }
        Bitmap bitmap = this.LJLJLJ;
        if (bitmap != null) {
            if (intrinsicWidth != bitmap.getWidth() || intrinsicHeight != this.LJLJLJ.getHeight()) {
                if (!this.LJLJLJ.isRecycled()) {
                    this.LJLJLJ.recycle();
                }
            } else {
                Canvas canvas = this.LJLLI;
                if (canvas != null) {
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    return;
                }
                return;
            }
        }
        this.LJLLJ = intrinsicWidth / 2;
        this.LJLJLJ = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas2 = new Canvas(this.LJLJLJ);
        this.LJLLI = canvas2;
        this.LJLJLLL.setBounds(0, 0, canvas2.getWidth(), this.LJLLI.getHeight());
        Bitmap bitmap2 = this.LJLJLJ;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.LJLL = new BitmapShader(bitmap2, tileMode, tileMode);
        this.LJLJL.setAntiAlias(true);
        this.LJLJL.setShader(this.LJLL);
    }

    @Override // X.C51588KMm
    public W4Z<InterfaceC81599W0t> getControllerListener() {
        return this.LJLLLL;
    }

    public C72433Sbl(Context context) {
        super(context);
        this.LJLJL = new Paint();
        this.LJLLILLLL = true;
        this.LJLLL = false;
        this.LJLLLL = new IDdS477S0100000_12(this, 1);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.LJLLL) {
            if (this.LJLLILLLL) {
                LJ();
                this.LJLLILLLL = false;
            }
            Drawable drawable = this.LJLJLLL;
            if (drawable != null && (canvas2 = this.LJLLI) != null) {
                drawable.draw(canvas2);
            }
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LJLLJ, this.LJLJL);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // X.VA9
    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        if (this.LJLLL) {
            this.LJLLILLLL = true;
            setImageDrawable(null);
        }
        super.setController(interfaceC81252Vui);
    }

    public C72433Sbl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = new Paint();
        this.LJLLILLLL = true;
        this.LJLLL = false;
        this.LJLLLL = new IDdS477S0100000_12(this, 1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJ();
    }
}
