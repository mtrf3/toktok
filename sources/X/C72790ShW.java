package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o53.IDdS477S0100000_12;

/* renamed from: X.ShW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72790ShW extends C72791ShX {
    public static final /* synthetic */ int LJLLJ = 0;
    public final Paint LJLILLLLZI;
    public Bitmap LJLJI;
    public Drawable LJLJJI;
    public BitmapShader LJLJJL;
    public Canvas LJLJJLL;
    public volatile boolean LJLJL;
    public float LJLJLJ;
    public final RectF LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;

    public final void LIZIZ() {
        Bitmap.Config config;
        if (!this.LJLLILLLL) {
            return;
        }
        Drawable drawable = getDrawable();
        this.LJLJJI = drawable;
        if (drawable == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        if (this.LJLJJI.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        int intrinsicWidth = this.LJLJJI.getIntrinsicWidth();
        int intrinsicHeight = this.LJLJJI.getIntrinsicHeight();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = getWidth();
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = getHeight();
        }
        Bitmap bitmap = this.LJLJI;
        if (bitmap != null) {
            if (intrinsicWidth != bitmap.getWidth() || intrinsicHeight != this.LJLJI.getHeight()) {
                if (!this.LJLJI.isRecycled()) {
                    this.LJLJI.recycle();
                }
            } else {
                Canvas canvas = this.LJLJJLL;
                if (canvas != null) {
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    return;
                }
                return;
            }
        }
        float f = this.LJLLI;
        this.LJLJI = Bitmap.createBitmap((int) (intrinsicWidth * f), (int) (intrinsicHeight * f), config);
        Canvas canvas2 = new Canvas(this.LJLJI);
        this.LJLJJLL = canvas2;
        float f2 = this.LJLLI;
        if (f2 > 1.0f) {
            canvas2.translate(((f2 - 1.0f) * (-intrinsicWidth)) / 2.0f, ((f2 - 1.0f) * (-intrinsicHeight)) / 2.0f);
        }
        Bitmap bitmap2 = this.LJLJI;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.LJLJJL = new BitmapShader(bitmap2, tileMode, tileMode);
        this.LJLILLLLZI.setAntiAlias(true);
        this.LJLILLLLZI.setShader(this.LJLJJL);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C72790ShW(Context context) {
        super(context);
        float LIZIZ = C74275TDb.LIZIZ(getContext(), 6.0f);
        this.LJLILLLLZI = new Paint();
        this.LJLJL = true;
        this.LJLJLJ = LIZIZ;
        this.LJLJLLL = new RectF();
        this.LJLL = 0;
        this.LJLLI = 1.0f;
        this.LJLLILLLL = false;
        new IDdS477S0100000_12(this, 2);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.LJLLILLLL) {
            if (this.LJLJL) {
                LIZIZ();
                this.LJLJL = false;
            }
            Drawable drawable = this.LJLJJI;
            if (drawable != null && (canvas2 = this.LJLJJLL) != null) {
                drawable.setBounds(0, 0, canvas2.getWidth(), this.LJLJJLL.getHeight());
                this.LJLJJI.draw(this.LJLJJLL);
            }
            if (this.LJLL == 0) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (float) (getWidth() / 2.0d), this.LJLILLLLZI);
                return;
            }
            this.LJLJLLL.set(0.0f, 0.0f, getWidth(), getHeight());
            RectF rectF = this.LJLJLLL;
            float f = this.LJLJLJ;
            canvas.drawRoundRect(rectF, f, f, this.LJLILLLLZI);
            return;
        }
        super.onDraw(canvas);
    }

    public void setClipStyle(int i) {
        this.LJLL = i;
    }

    @Override // X.C72791ShX, X.VA9
    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        if (this.LJLLILLLL) {
            this.LJLJL = true;
            setImageDrawable(null);
        }
        super.setController(interfaceC81252Vui);
    }

    @Override // X.C72791ShX
    public void setEnableAnimation(boolean z) {
        super.setEnableAnimation(z);
    }

    public void setRectFRadius(float f) {
        this.LJLJLJ = f;
    }

    public void setScaleBitmap(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.LJLLI = f;
    }

    public C72790ShW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float LIZIZ = C74275TDb.LIZIZ(getContext(), 6.0f);
        this.LJLILLLLZI = new Paint();
        this.LJLJL = true;
        this.LJLJLJ = LIZIZ;
        this.LJLJLLL = new RectF();
        this.LJLL = 0;
        this.LJLLI = 1.0f;
        this.LJLLILLLL = false;
        new IDdS477S0100000_12(this, 2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
    }
}
