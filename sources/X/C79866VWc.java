package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VWc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79866VWc extends RelativeLayout {
    public int LJLIL;
    public final C79407VEl[] LJLILLLLZI;
    public final Paint LJLJI;
    public final Paint LJLJJI;
    public float LJLJJL;
    public final float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public boolean LJLLI;
    public final SharedPreferences LJLLILLLL;
    public final ALAdapterS11S0100000_14 LJLLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawCircle(this.LJLJLLL, this.LJLL, this.LJLJJLL, this.LJLJI);
        }
        float f = this.LJLJJL;
        if (f > 0.0f && f <= this.LJLJJLL && canvas != null) {
            canvas.drawCircle(this.LJLJL, this.LJLJLJ, f, this.LJLJJI);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (this.LJLLI) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LJLJL = motionEvent.getX();
                this.LJLJLJ = motionEvent.getY();
                return true;
            }
            if (valueOf != null && (valueOf.intValue() == 1 || valueOf.intValue() == 3)) {
                int i = this.LJLIL + 1;
                this.LJLIL = i;
                C79407VEl[] c79407VElArr = this.LJLILLLLZI;
                if (i >= c79407VElArr.length) {
                    int length = i - c79407VElArr.length;
                    this.LJLIL = i - c79407VElArr.length;
                    i = length;
                }
                this.LJLIL = i;
                Paint paint = this.LJLJJI;
                float f = this.LJLJL;
                float f2 = this.LJLJLJ;
                float f3 = this.LJLJJLL;
                C79407VEl c79407VEl = this.LJLILLLLZI[i];
                paint.setShader(new RadialGradient(f, f2, f3, c79407VEl.LIZ, c79407VEl.LIZIZ, Shader.TileMode.CLAMP));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.LJLJJLL);
                ofFloat.setDuration(600L);
                ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 9));
                ofFloat.addListener(this.LJLLJ);
                ofFloat.start();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79866VWc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C79407VEl[] c79407VElArr = {new C79407VEl(ColorProtector.parseColor("#FF92A7"), ColorProtector.parseColor("#FE2C55")), new C79407VEl(ColorProtector.parseColor("#FFC059"), ColorProtector.parseColor("#D95C34")), new C79407VEl(ColorProtector.parseColor("#67CC8F"), ColorProtector.parseColor("#08843A")), new C79407VEl(ColorProtector.parseColor("#5D7CE8"), ColorProtector.parseColor("#5927A9")), new C79407VEl(ColorProtector.parseColor("#30C3EA"), ColorProtector.parseColor("#148FC3"))};
        this.LJLILLLLZI = c79407VElArr;
        int LJIIIIZZ = C60996Nwm.LJIIIIZZ(context);
        int LIZJ = C60996Nwm.LIZJ(context);
        float sqrt = (float) Math.sqrt((LIZJ * LIZJ) + (LJIIIIZZ * LJIIIIZZ));
        this.LJLJJLL = sqrt;
        SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(context), 0, "qr_code_background_sp_name");
        o.LJIIIIZZ(LIZIZ, "context.applicationConte…    Context.MODE_PRIVATE)");
        this.LJLLILLLL = LIZIZ;
        this.LJLJLLL = LIZIZ.getFloat("qr_code_background_sp_center_x", LJIIIIZZ);
        this.LJLL = LIZIZ.getFloat("qr_code_background_sp_center_y", 0.0f);
        this.LJLIL = LIZIZ.getInt("qr_code_background_sp_color_index", 0);
        Paint paint = new Paint(1);
        this.LJLJI = paint;
        float f = this.LJLJLLL;
        float f2 = this.LJLL;
        C79407VEl c79407VEl = c79407VElArr[this.LJLIL];
        paint.setShader(new RadialGradient(f, f2, sqrt, c79407VEl.LIZ, c79407VEl.LIZIZ, Shader.TileMode.CLAMP));
        this.LJLJJI = new Paint(1);
        setWillNotDraw(false);
        this.LJLLJ = new ALAdapterS11S0100000_14(this, 0);
    }
}
