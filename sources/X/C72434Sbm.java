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
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.Sbm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72434Sbm extends SmartImageView {
    public final Paint LJLJLJ;
    public Bitmap LJLJLLL;
    public Drawable LJLL;
    public Canvas LJLLI;
    public volatile boolean LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    public final void LJII() {
        Bitmap.Config config;
        if (!this.LJLLL) {
            return;
        }
        Drawable drawable = getDrawable();
        this.LJLL = drawable;
        if (drawable == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        if (this.LJLL.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        int intrinsicWidth = this.LJLL.getIntrinsicWidth();
        int intrinsicHeight = this.LJLL.getIntrinsicHeight();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = getWidth();
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = getHeight();
        }
        Bitmap bitmap = this.LJLJLLL;
        if (bitmap != null) {
            if (intrinsicWidth != bitmap.getWidth() || intrinsicHeight != this.LJLJLLL.getHeight()) {
                if (!this.LJLJLLL.isRecycled()) {
                    this.LJLJLLL.recycle();
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
        this.LJLLJ = Math.min(intrinsicWidth, intrinsicHeight) / 2;
        this.LJLJLLL = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas2 = new Canvas(this.LJLJLLL);
        this.LJLLI = canvas2;
        this.LJLL.setBounds(0, 0, canvas2.getWidth(), this.LJLLI.getHeight());
        Bitmap bitmap2 = this.LJLJLLL;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.LJLJLJ.setAntiAlias(true);
        this.LJLJLJ.setShader(bitmapShader);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public void LIZIZ() {
        V8L v8l = getHierarchy().LIZJ;
        if (v8l == null) {
            v8l = new V8L();
        }
        v8l.LIZIZ = true;
        getHierarchy().LJIL(v8l);
        getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        LJII();
    }

    public C72434Sbm(Context context) {
        super(context);
        this.LJLJLJ = new Paint();
        this.LJLLILLLL = true;
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public final void LIZ(W5E w5e) {
        C79083V1z.LJ(w5e.hashCode(), "SmartCircleImageView", "display");
        if (W5U.LIZLLL().LJIILIIL()) {
            this.LJLLLL = w5e.LJJIJLIJ;
        } else {
            this.LJLLL = w5e.LJJIJLIJ;
        }
        if (W5U.LIZLLL().LJIILIIL()) {
            InterfaceC70769Rq1 interfaceC70769Rq1 = w5e.LJJIJIIJI;
            if (interfaceC70769Rq1 == null) {
                w5e.LJJIJIIJI = new C72435Sbn(this, w5e);
            } else {
                w5e.LJJIJIIJI = new C72437Sbp(this, interfaceC70769Rq1, w5e);
            }
        } else if (this.LJLLL) {
            InterfaceC70769Rq1 interfaceC70769Rq12 = w5e.LJJIJIIJI;
            if (interfaceC70769Rq12 == null) {
                w5e.LJJIJIIJI = new C72436Sbo(this, w5e);
            } else {
                w5e.LJJIJIIJI = new C72438Sbq(this, interfaceC70769Rq12, w5e);
            }
        }
        super.LIZ(w5e);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        if (W5U.LIZLLL().LJIILIIL()) {
            if (this.LJLLL && this.LJLLLL) {
                if (this.LJLLILLLL) {
                    LJII();
                    this.LJLLILLLL = false;
                }
                Drawable drawable = this.LJLL;
                if (drawable != null && (canvas3 = this.LJLLI) != null) {
                    drawable.draw(canvas3);
                }
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LJLLJ, this.LJLJLJ);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        if (this.LJLLL) {
            if (this.LJLLILLLL) {
                LJII();
                this.LJLLILLLL = false;
            }
            Drawable drawable2 = this.LJLL;
            if (drawable2 != null && (canvas2 = this.LJLLI) != null) {
                drawable2.draw(canvas2);
            }
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LJLLJ, this.LJLJLJ);
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

    public C72434Sbm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJLJ = new Paint();
        this.LJLLILLLL = true;
    }

    public C72434Sbm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJLJ = new Paint();
        this.LJLLILLLL = true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJII();
    }
}
