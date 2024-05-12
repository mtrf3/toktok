package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
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

/* renamed from: X.WFp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class GestureDetectorOnGestureListenerC81985WFp extends WGP implements GestureDetector.OnGestureListener {
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final RectF LJLJJI;
    public final RectF LJLJJL;
    public final Paint LJLJJLL;
    public Bitmap LJLJL;
    public boolean LJLJLJ;
    public C81989WFt LJLJLLL;
    public C81989WFt LJLL;
    public C81989WFt LJLLI;
    public C81989WFt LJLLILLLL;
    public Drawable LJLLJ;
    public GestureDetector LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public InterfaceC81987WFr LJZI;
    public long LJZL;

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

    private int getRealMovableWidth() {
        return getMeasuredWidth() - (this.LJLLJ.getIntrinsicWidth() / 2);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LJLLJ;
        if (drawable != null && drawable.isStateful()) {
            this.LJLLJ.setState(getDrawableState());
        }
    }

    @Override // X.WGP
    public int getMovableWidth() {
        return getRealMovableWidth();
    }

    @Override // X.WGP
    public int getStopPosition() {
        return this.LJZ;
    }

    public final int LIZJ(float f) {
        return ((int) (((f * 1.0f) * (this.LJLILLLLZI - this.LJLIL)) / getMeasuredWidth())) + this.LJLIL;
    }

    public final float LIZLLL(MotionEvent motionEvent) {
        return Math.min(Math.max(LJ(this.LJLLLL + 1000), motionEvent.getX()), getMeasuredWidth());
    }

    public final float LJ(int i) {
        return (((i - this.LJLIL) * 1.0f) * getMeasuredWidth()) / (this.LJLILLLLZI - this.LJLIL);
    }

    public final void LJI(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int LIZJ = (int) KL2.LIZJ(getContext(), 4.0f);
            float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
            int length = musicWavePointArray.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (musicWavePointArray[i] != 0.0f) {
                        this.LJLJLJ = true;
                        break;
                    }
                    i++;
                } else {
                    this.LJLJLJ = false;
                    break;
                }
            }
            WG0.LJ(aVMusicWaveBean);
            C81989WFt c81989WFt = this.LJLJLLL;
            c81989WFt.LJ = LIZJ;
            this.LJLL.LJ = LIZJ;
            this.LJLLI.LJ = LIZJ;
            c81989WFt.LIZIZ = WG0.LJI.LIZLLL;
            this.LJLL.LIZIZ = WG0.LJI.LIZLLL;
            this.LJLLI.LIZIZ = WG0.LJI.LIZLLL;
            this.LJLLILLLL.LJII(aVMusicWaveBean.getMusicWavePointArray());
            if (this.LJLJLJ) {
                this.LJLJLLL.LJII(aVMusicWaveBean.getMusicWavePointArray());
                this.LJLJLLL.LJIILLIIL = true;
                this.LJLLI.LJII(aVMusicWaveBean.getMusicWavePointArray());
                this.LJLLI.LJIILLIIL = true;
                this.LJLL.LJII(aVMusicWaveBean.getMusicWavePointArray());
                this.LJLL.LJIILLIIL = true;
                return;
            }
            this.LJLJLLL.LJIILLIIL = false;
            this.LJLLI.LJIILLIIL = false;
            this.LJLL.LJIILLIIL = false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJZ = LIZJ(LIZLLL(motionEvent));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        setPressed(true);
        invalidate();
        InterfaceC81987WFr interfaceC81987WFr = this.LJZI;
        if (interfaceC81987WFr != null) {
            interfaceC81987WFr.LIZ(this.LJZ);
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.LJLJJI;
        float LJ = LJ(this.LJLLLL);
        LJ(this.LJLLLLLL);
        float LJ2 = LJ(this.LJLZ);
        float realMovableWidth = (((this.LJZ - this.LJLIL) * 1.0f) * getRealMovableWidth()) / (this.LJLILLLLZI - this.LJLIL);
        rectF.left = LJ;
        rectF.right = (this.LJLLJ.getIntrinsicWidth() / 2.0f) + realMovableWidth;
        rectF.top = 0.0f;
        float f = measuredHeight;
        rectF.bottom = f;
        float f2 = this.LJLJI;
        canvas.drawRoundRect(rectF, f2, f2, this.LJLJJLL);
        int i = this.LJLIL;
        float f3 = measuredWidth;
        float f4 = (((float) this.LJZL) * 1.0f) / (this.LJLILLLLZI - i);
        RectF rectF2 = this.LJLJJL;
        rectF2.top = 0.1f * f;
        rectF2.right = f4 * f3;
        rectF2.bottom = 0.9f * f;
        rectF.left = Math.max(LJ, LJ2);
        rectF.right = f3;
        canvas.save();
        canvas.clipRect(rectF);
        this.LJLLI.LJ(canvas);
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f;
        rectF.left = 0.0f;
        rectF.right = LJ;
        canvas.save();
        canvas.clipRect(rectF);
        this.LJLJLLL.LJ(canvas);
        canvas.restore();
        rectF.left = LJ;
        rectF.right = LJ2;
        canvas.save();
        canvas.clipRect(rectF);
        if (this.LJLJLJ) {
            this.LJLL.LJ(canvas);
        }
        canvas.restore();
        this.LJLLJ.setBounds((int) (realMovableWidth - (r5.getIntrinsicWidth() / 2)), (-(this.LJLLJ.getIntrinsicHeight() - measuredHeight)) / 2, (int) (realMovableWidth + (this.LJLLJ.getIntrinsicWidth() / 2)), this.LJLLJ.getIntrinsicHeight() - ((this.LJLLJ.getIntrinsicHeight() - measuredHeight) / 2));
        this.LJLLJ.draw(canvas);
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
        GestureDetector gestureDetector = this.LJLLL;
        if (gestureDetector == null) {
            return false;
        }
        boolean onTouchEvent = gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            int LIZJ = LIZJ(LIZLLL(motionEvent));
            this.LJZ = LIZJ;
            if (this.LJLJLJ) {
                int max = Math.max(this.LJLLLL, LIZJ - ((int) TimeUnit.SECONDS.toMillis(3L)));
                this.LJLLLLLL = max;
                this.LJLZ = max;
            }
            InterfaceC81987WFr interfaceC81987WFr = this.LJZI;
            if (interfaceC81987WFr != null) {
                interfaceC81987WFr.LIZIZ(this.LJLLLLLL, this.LJZ);
            }
            setPressed(false);
            invalidate();
            return onTouchEvent | true;
        }
        return onTouchEvent;
    }

    @Override // X.WGP
    public void setOnProgressChangeListener(InterfaceC81987WFr interfaceC81987WFr) {
        this.LJZI = interfaceC81987WFr;
    }

    @Override // X.WGP
    public void setPastPosition(int i) {
        this.LJLLLL = i;
        invalidate();
    }

    @Override // X.WGP
    public void setProgress(int i) {
        this.LJLZ = i;
        invalidate();
    }

    @Override // X.WGP
    public void setStopPosition(int i) {
        this.LJZ = i;
        invalidate();
    }

    @Override // X.WGP
    public void setTotalTime(long j) {
        this.LJZL = j;
        setWavForm(this.LJLJL);
    }

    @Override // X.WGP
    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        o.LJIIIZ(context, "context");
        this.LJLJL = LJFF(AnonymousClass636.LJIIIIZZ(R.attr.gp, context), bitmap);
        LJFF(C04330Ez.LIZIZ(context, R.color.k3), bitmap);
        LJFF(AnonymousClass636.LJIIIIZZ(R.attr.gv, context), bitmap);
        invalidate();
    }

    public GestureDetectorOnGestureListenerC81985WFp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        this.LJLJJI = new RectF();
        this.LJLJJL = new RectF();
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        this.LJLJLJ = false;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.LJLLL = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.LJLLJ = C04270Et.LIZIZ(context, R.drawable.b39);
        setWavForm(BitmapFactory.decodeResource(getResources(), R.drawable.a2b));
        this.LJLL = new C81989WFt(context);
        this.LJLJLLL = new C81989WFt(context);
        this.LJLLI = new C81989WFt(context);
        this.LJLLILLLL = new C81989WFt(context);
        this.LJLL.LJFF(ColorProtector.parseColor("#FF20E5DC"));
        C81989WFt c81989WFt = this.LJLLI;
        Context context2 = C78885Uxd.LIZ;
        c81989WFt.LJFF(context2.getResources().getColor(R.color.b9));
        C81989WFt c81989WFt2 = this.LJLJLLL;
        Integer LJI = C79045V0n.LJI(R.attr.eb, new ContextThemeWrapper(context2, R.style.ux));
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c81989WFt2.LJFF(i);
        paint.setColor(context2.getResources().getColor(R.color.b9));
        int LIZJ = (int) KL2.LIZJ(context, 8.0f);
        this.LJLJI = (int) KL2.LIZJ(context, 8.0f);
        setBackground(C78127UlP.LIZJ(0, ColorProtector.parseColor("#22FFFFFF"), 0, LIZJ));
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
                this.LJLLLL += i3;
                this.LJZ += i3;
                this.LJLLLLLL += i3;
                this.LJLZ += i3;
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
        if (aVMusicWaveBean == null || (!C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray()) && aVMusicWaveBean.getMusicPath().isEmpty())) {
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
            } else if (!aVMusicWaveBean.getMusicPath().isEmpty()) {
                LJI(WG0.LIZJ(VEUtils.getMusicWaveData(aVMusicWaveBean.getMusicPath(), C72085SQv.LJLIL, LJI2, this.LJLIL, this.LJLILLLLZI)));
            }
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "VolumeTapsView");
        c145995oB.LIZ(i2 ^ 1, "status");
        GXR.LIZ("tool_performance_show_music_wave", c145995oB.LIZ);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C81989WFt c81989WFt = this.LJLJLLL;
        if (c81989WFt != null && this.LJLLI != null && this.LJLL != null) {
            c81989WFt.LJI(size, size2);
            this.LJLL.LJI(size, size2);
            this.LJLLI.LJI(size, size2);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int LIZJ = LIZJ(LIZLLL(motionEvent2));
        this.LJZ = LIZJ;
        if (this.LJLJLJ) {
            int max = Math.max(this.LJLLLL, LIZJ - ((int) TimeUnit.SECONDS.toMillis(3L)));
            this.LJLLLLLL = max;
            this.LJLZ = max;
        }
        invalidate();
        InterfaceC81987WFr interfaceC81987WFr = this.LJZI;
        if (interfaceC81987WFr != null) {
            interfaceC81987WFr.LIZ(this.LJZ);
            return true;
        }
        return true;
    }
}
