package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.WFq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class GestureDetectorOnGestureListenerC81986WFq extends WGP implements GestureDetector.OnGestureListener {
    public int LJLIL;
    public int LJLILLLLZI;
    public final RectF LJLJI;
    public final RectF LJLJJI;
    public final Paint LJLJJL;
    public Bitmap LJLJJLL;
    public Bitmap LJLJL;
    public Bitmap LJLJLJ;
    public C81990WFu LJLJLLL;
    public C81990WFu LJLL;
    public C81990WFu LJLLI;
    public Bitmap LJLLILLLL;
    public GestureDetector LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public InterfaceC81987WFr LJZ;
    public long LJZI;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.WGP
    public int getMovableWidth() {
        return getMeasuredWidth();
    }

    @Override // X.WGP
    public int getStopPosition() {
        return this.LJLZ;
    }

    public final int LIZJ(float f) {
        return ((int) (((f * 1.0f) * (this.LJLILLLLZI - this.LJLIL)) / getMeasuredWidth())) + this.LJLIL;
    }

    public final float LIZLLL(int i) {
        return (((i - this.LJLIL) * 1.0f) * getMeasuredWidth()) / (this.LJLILLLLZI - this.LJLIL);
    }

    public final void LJI(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int LIZJ = (int) KL2.LIZJ(getContext(), 4.0f);
            WG0.LJ(aVMusicWaveBean);
            C81990WFu c81990WFu = this.LJLJLLL;
            c81990WFu.LJ = LIZJ;
            this.LJLL.LJ = LIZJ;
            this.LJLLI.LJ = LIZJ;
            c81990WFu.LIZIZ = WG0.LJI.LIZLLL;
            this.LJLL.LIZIZ = WG0.LJI.LIZLLL;
            this.LJLLI.LIZIZ = WG0.LJI.LIZLLL;
            this.LJLJLLL.LJII(aVMusicWaveBean.getMusicWavePointArray());
            this.LJLL.LJII(aVMusicWaveBean.getMusicWavePointArray());
            this.LJLLI.LJII(aVMusicWaveBean.getMusicWavePointArray());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLZ = LIZJ(Math.min(Math.max(LIZLLL(this.LJLLL), motionEvent.getX()), getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        InterfaceC81987WFr interfaceC81987WFr = this.LJZ;
        if (interfaceC81987WFr != null) {
            interfaceC81987WFr.LIZ(this.LJLZ);
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C81990WFu c81990WFu = this.LJLLI;
        c81990WFu.getClass();
        if (C81995WFz.LJ(c81990WFu.LJIIJ)) {
            LJ(canvas, false);
        } else {
            LJ(canvas, true);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (i == 1) {
            setRotationY(180.0f);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.LJLLJ;
        if (gestureDetector != null) {
            boolean onTouchEvent = gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                int LIZJ = LIZJ(Math.min(Math.max(LIZLLL(this.LJLLL), motionEvent.getX()), getMeasuredWidth()));
                this.LJLZ = LIZJ;
                int max = Math.max(this.LJLLL, LIZJ - ((int) TimeUnit.SECONDS.toMillis(3L)));
                this.LJLLLL = max;
                this.LJLLLLLL = max;
                invalidate();
                InterfaceC81987WFr interfaceC81987WFr = this.LJZ;
                if (interfaceC81987WFr != null) {
                    interfaceC81987WFr.LIZIZ(this.LJLLLL, this.LJLZ);
                }
                return onTouchEvent | true;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // X.WGP
    public void setOnProgressChangeListener(InterfaceC81987WFr interfaceC81987WFr) {
        this.LJZ = interfaceC81987WFr;
    }

    @Override // X.WGP
    public void setPastPosition(int i) {
        this.LJLLL = i;
        invalidate();
    }

    @Override // X.WGP
    public void setProgress(int i) {
        this.LJLLLLLL = i;
        invalidate();
    }

    @Override // X.WGP
    public void setStopPosition(int i) {
        this.LJLZ = i;
        invalidate();
    }

    @Override // X.WGP
    public void setTotalTime(long j) {
        this.LJZI = j;
        setWavForm(this.LJLJJLL);
    }

    @Override // X.WGP
    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        o.LJIIIZ(context, "context");
        this.LJLJJLL = LJFF(AnonymousClass636.LJIIIIZZ(R.attr.gp, context), bitmap);
        this.LJLJL = LJFF(C04330Ez.LIZIZ(context, R.color.k3), bitmap);
        this.LJLJLJ = LJFF(AnonymousClass636.LJIIIIZZ(R.attr.gv, context), bitmap);
        invalidate();
    }

    public GestureDetectorOnGestureListenerC81986WFq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = new RectF();
        this.LJLJJI = new RectF();
        Paint paint = new Paint();
        this.LJLJJL = paint;
        this.LJLLJ = new GestureDetector(context, this);
        this.LJLLILLLL = BitmapFactory.decodeResource(getResources(), R.drawable.b38);
        setWavForm(BitmapFactory.decodeResource(getResources(), R.drawable.a2b));
        this.LJLL = new C81990WFu(context);
        this.LJLJLLL = new C81990WFu(context);
        this.LJLLI = new C81990WFu(context);
        this.LJLL.LJFF(ColorProtector.parseColor("#FF20E5DC"));
        this.LJLLI.LJFF(-1);
        this.LJLJLLL.LJFF(ColorProtector.parseColor("#52FFFFFF"));
        paint.setColor(ColorProtector.parseColor("#22FFFFFF"));
        setBackground(C78127UlP.LIZJ(0, ColorProtector.parseColor("#22FFFFFF"), 0, (int) KL2.LIZJ(context, 2.0f)));
    }

    public static Bitmap LJFF(int i, Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    @Override // X.WGP
    public final void LIZ(int i, int i2) {
        if (i >= 0) {
            if (i2 >= i) {
                int i3 = i - this.LJLIL;
                this.LJLLL += i3;
                this.LJLZ += i3;
                this.LJLLLL += i3;
                this.LJLLLLLL += i3;
                this.LJLIL = i;
                this.LJLILLLLZI = i2;
                invalidate();
                return;
            }
            throw new IllegalArgumentException(C48263Iwt.LIZLLL("start: ", i, "; end: ", i2));
        }
        throw new IllegalArgumentException(KMP.LJ("start: ", i));
    }

    @Override // X.WGP
    public final void LIZIZ(AVMusicWaveBean aVMusicWaveBean, int i) {
        int i2 = 0;
        if (aVMusicWaveBean == null || !C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            Context context = getContext();
            AVMusicWaveBean aVMusicWaveBean2 = new AVMusicWaveBean();
            int LJI = WG0.LJI.LJI(context);
            float[] fArr = new float[LJI];
            if (i > 0) {
                while (i2 < LJI) {
                    fArr[i2] = (float) Math.random();
                    i2++;
                }
            }
            aVMusicWaveBean2.setMusicWavePointArray(fArr);
            LJI(aVMusicWaveBean2);
            i2 = 1;
        } else {
            int i3 = this.LJLIL;
            WG0.LJIIIIZZ(aVMusicWaveBean, i3, this.LJLILLLLZI - i3, i);
            int LJI2 = WG0.LJI.LJI(getContext());
            if (LJI2 < aVMusicWaveBean.getMusicWavePointArray().length) {
                LJI(WG0.LIZJ(VEUtils.getResampleMusicWaveData(aVMusicWaveBean.getMusicWavePointArray(), 0, LJI2)));
            }
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "VolumeTapsView");
        c145995oB.LIZ(i2 ^ 1, "status");
        GXR.LIZ("tool_performance_show_music_wave", c145995oB.LIZ);
    }

    public final void LJ(Canvas canvas, boolean z) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.LJLJI;
        float LIZLLL = LIZLLL(this.LJLLL);
        LIZLLL(this.LJLLLL);
        float LIZLLL2 = LIZLLL(this.LJLLLLLL);
        float LIZLLL3 = LIZLLL(this.LJLZ);
        rectF.left = 0.0f;
        rectF.right = LIZLLL;
        rectF.top = 0.0f;
        float f = measuredHeight;
        rectF.bottom = f;
        canvas.drawRect(rectF, this.LJLJJL);
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        float f2 = measuredWidth;
        float f3 = ((i * (-1.0f)) / (i2 - i)) * f2;
        float f4 = (((float) this.LJZI) * 1.0f) / (i2 - i);
        RectF rectF2 = this.LJLJJI;
        rectF2.top = 0.1f * f;
        rectF2.right = f4 * f2;
        rectF2.bottom = 0.9f * f;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = LIZLLL2;
        }
        rectF.right = f2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.LJLJLJ, (Rect) null, this.LJLJJI, (Paint) null);
        } else {
            this.LJLLI.LJ(canvas);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f;
        rectF.left = 0.0f;
        rectF.right = LIZLLL;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.LJLJJLL, (Rect) null, this.LJLJJI, (Paint) null);
        } else {
            this.LJLJLLL.LJ(canvas);
        }
        canvas.restore();
        rectF.left = LIZLLL;
        rectF.right = LIZLLL2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.LJLJL, (Rect) null, this.LJLJJI, (Paint) null);
        } else {
            this.LJLL.LJ(canvas);
        }
        canvas.restore();
        canvas.drawBitmap(this.LJLLILLLL, LIZLLL3 - (r3.getWidth() / 2), (measuredHeight / 2) - (this.LJLLILLLL.getHeight() / 2), (Paint) null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C81990WFu c81990WFu = this.LJLJLLL;
        if (c81990WFu != null && this.LJLLI != null && this.LJLL != null) {
            c81990WFu.LJI(size, size2);
            this.LJLL.LJI(size, size2);
            this.LJLLI.LJI(size, size2);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.LJLZ = LIZJ(Math.min(Math.max(LIZLLL(this.LJLLL), motionEvent2.getX()), getMeasuredWidth()));
        invalidate();
        InterfaceC81987WFr interfaceC81987WFr = this.LJZ;
        if (interfaceC81987WFr != null) {
            interfaceC81987WFr.LIZ(this.LJLZ);
            return true;
        }
        return true;
    }
}
