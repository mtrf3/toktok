package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class VSW extends View {
    public static final String[] LLILZLL = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};
    public EnumC79551VJz LJLIL;
    public Context LJLILLLLZI;
    public VLI LJLJI;
    public GestureDetector LJLJJI;
    public VLJ LJLJJL;
    public boolean LJLJJLL;
    public final boolean LJLJL;
    public final ScheduledExecutorService LJLJLJ;
    public ScheduledFuture<?> LJLJLLL;
    public Paint LJLL;
    public Paint LJLLI;
    public Paint LJLLILLLL;
    public Paint LJLLJ;
    public InterfaceC79760VSa LJLLL;
    public String LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public float LJZL;
    public float LL;
    public Typeface LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public float LLFZ;
    public boolean LLI;
    public float LLIFFJFJJ;
    public float LLII;
    public float LLIIII;
    public float LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public float LLIIZ;
    public long LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public final float LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC58352MvE LLILZ;
    public final Handler LLILZIL;

    public final void LIZ() {
        ScheduledFuture<?> scheduledFuture = this.LJLJLLL;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.LJLJLLL.cancel(true);
            this.LJLJLLL = null;
        }
    }

    public final void LIZLLL() {
        String str;
        if (this.LJLLL == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i = 0; i < this.LJLLL.LIZ(); i++) {
            String LIZIZ = LIZIZ(this.LJLLL.getItem(i));
            this.LJLLI.getTextBounds(LIZIZ, 0, LIZIZ.length(), rect);
            int width = rect.width();
            if (width > this.LJLZ) {
                this.LJLZ = width;
            }
        }
        InterfaceC58352MvE interfaceC58352MvE = this.LLILZ;
        if (interfaceC58352MvE == null || (str = interfaceC58352MvE.LIZ().get("wheel_text_bound_text")) == null || str.isEmpty()) {
            str = "Week";
        }
        this.LJLLI.getTextBounds(str, 0, 2, rect);
        int height = rect.height() + 2;
        this.LJZ = height;
        this.LJZL = this.LLFZ * height;
        float f = this.LL;
        if (f > 0.0f) {
            this.LJZL = f;
        }
        int i2 = (int) (this.LJZL * (this.LLIIJI - 1));
        this.LLIIJLIL = (int) ((i2 * 2) / 3.141592653589793d);
        this.LLIILII = (int) (i2 / 3.141592653589793d);
        this.LLIIL = View.MeasureSpec.getSize(this.LLILII);
        float f2 = this.LLIIJLIL;
        float f3 = this.LJZL;
        this.LLIFFJFJJ = (f2 - f3) / 2.0f;
        float f4 = (f2 + f3) / 2.0f;
        this.LLII = f4;
        this.LLIIII = (f4 - ((f3 - this.LJZ) / 2.0f)) - this.LLILLJJLI;
        if (this.LLIIIJ == -1) {
            if (this.LLI) {
                this.LLIIIJ = (this.LJLLL.LIZ() + 1) / 2;
            } else {
                this.LLIIIJ = 0;
            }
        }
        this.LLIIIZ = this.LLIIIJ;
    }

    public final int getCurrentItem() {
        int i;
        InterfaceC79760VSa interfaceC79760VSa = this.LJLLL;
        if (interfaceC79760VSa == null) {
            return 0;
        }
        if (this.LLI && ((i = this.LLIIIL) < 0 || i >= interfaceC79760VSa.LIZ())) {
            return Math.max(0, Math.min(Math.abs(Math.abs(this.LLIIIL) - this.LJLLL.LIZ()), this.LJLLL.LIZ() - 1));
        }
        return Math.max(0, Math.min(this.LLIIIL, this.LJLLL.LIZ() - 1));
    }

    public int getItemDefaultOrUserHeight() {
        float f = this.LL;
        if (f > 0.0f) {
            return (int) f;
        }
        return (int) this.LJZL;
    }

    public int getItemsCount() {
        InterfaceC79760VSa interfaceC79760VSa = this.LJLLL;
        if (interfaceC79760VSa != null) {
            return interfaceC79760VSa.LIZ();
        }
        return 0;
    }

    public final InterfaceC79760VSa getAdapter() {
        return this.LJLLL;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.LJLJI;
    }

    public int getInitPosition() {
        return this.LLIIIJ;
    }

    public float getItemHeight() {
        return this.LJZL;
    }

    public float getTotalScrollY() {
        return this.LLIIIILZ;
    }

    public VSW(Context context) {
        super(context, null);
        this.LJLJL = true;
        this.LJLJLJ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("iew/WheelView"));
        this.LLD = Typeface.MONOSPACE;
        this.LLFZ = 1.6f;
        this.LLIIJI = 0;
        this.LLIILZL = 0;
        this.LLIIZ = 0.0f;
        this.LLIL = 0L;
        this.LLILIL = 17;
        this.LLILL = 0;
        this.LLILLIZIL = 0;
        this.LLILLL = false;
        this.LLILZIL = new Handler(C16880lQ.LLJJJJ());
        this.LJLLLLLL = getResources().getDimensionPixelSize(R.dimen.yb);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.LLILLJJLI = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.LLILLJJLI = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.LLILLJJLI = 6.0f;
        } else if (f >= 3.0f) {
            this.LLILLJJLI = f * 2.5f;
        }
        this.LLILIL = 17;
        this.LLF = -16777216;
        this.LLFF = -16777216;
        this.LLFFF = -16777216;
        this.LLFII = 2;
        this.LL = context.getResources().getDimension(R.dimen.ya);
        float f2 = this.LLFZ;
        if (f2 < 1.0f) {
            this.LLFZ = 1.0f;
        } else if (f2 > 4.0f) {
            this.LLFZ = 4.0f;
        }
        this.LJLILLLLZI = context;
        this.LJLJI = new VLI(this);
        GestureDetector gestureDetector = new GestureDetector(context, new VSZ(this), new Handler(C16880lQ.LLJJJJ()));
        this.LJLJJI = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.LLI = true;
        this.LLIIIILZ = 0.0f;
        this.LLIIIJ = -1;
        Paint paint = new Paint();
        this.LJLL = paint;
        paint.setColor(this.LLF);
        this.LJLL.setAntiAlias(true);
        this.LJLL.setTypeface(this.LLD);
        this.LJLL.setTextSize(this.LJLLLLLL);
        Paint paint2 = new Paint();
        this.LJLLI = paint2;
        paint2.setColor(this.LLFF);
        this.LJLLI.setAntiAlias(true);
        this.LJLLI.setTextScaleX(1.1f);
        this.LJLLI.setTypeface(this.LLD);
        this.LJLLI.setTextSize(this.LJLLLLLL);
        Paint paint3 = new Paint();
        this.LJLLILLLL = paint3;
        paint3.setColor(this.LLFFF);
        this.LJLLILLLL.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.LJLLJ = paint4;
        paint4.setColor(Integer.MAX_VALUE);
        setLayerType(1, null);
    }

    public static String LIZIZ(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof InterfaceC79761VSb) {
            return ((InterfaceC79761VSb) obj).LIZ();
        }
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0 && intValue < 10) {
                return LLILZLL[intValue];
            }
            return String.valueOf(intValue);
        }
        return obj.toString();
    }

    public final int LIZJ(int i) {
        if (i < 0) {
            return LIZJ(this.LJLLL.LIZ() + i);
        }
        if (i <= this.LJLLL.LIZ() - 1) {
            return i;
        }
        return LIZJ(i - this.LJLLL.LIZ());
    }

    public final void LJFF(EnumC79550VJy enumC79550VJy) {
        LIZ();
        if (enumC79550VJy == EnumC79550VJy.FLING || enumC79550VJy == EnumC79550VJy.DAGGLE) {
            float f = this.LLIIIILZ;
            float f2 = this.LJZL;
            int i = (int) (((f % f2) + f2) % f2);
            this.LLIILZL = i;
            if (i > f2 / 2.0f) {
                this.LLIILZL = (int) (f2 - i);
            } else {
                this.LLIILZL = -i;
            }
        }
        this.LJLJLLL = this.LJLJLJ.scheduleWithFixedDelay(new VSX(this, this.LLIILZL), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Object item;
        String LIZIZ;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        if (this.LJLLL == null) {
            return;
        }
        int i4 = 0;
        int min = Math.min(Math.max(0, this.LLIIIJ), this.LJLLL.LIZ() - 1);
        this.LLIIIJ = min;
        try {
            this.LLIIIZ = min + (((int) (this.LLIIIILZ / this.LJZL)) % this.LJLLL.LIZ());
        } catch (ArithmeticException unused) {
            LLog.LIZLLL(4, "WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
        }
        if (!this.LLI) {
            if (this.LLIIIZ < 0) {
                this.LLIIIZ = 0;
            }
            if (this.LLIIIZ > this.LJLLL.LIZ() - 1) {
                this.LLIIIZ = this.LJLLL.LIZ() - 1;
            }
        } else {
            if (this.LLIIIZ < 0) {
                this.LLIIIZ = this.LJLLL.LIZ() + this.LLIIIZ;
            }
            if (this.LLIIIZ > this.LJLLL.LIZ() - 1) {
                this.LLIIIZ -= this.LJLLL.LIZ();
            }
        }
        float f2 = this.LLIIIILZ % this.LJZL;
        EnumC79551VJz enumC79551VJz = this.LJLIL;
        float f3 = 10.0f;
        if (enumC79551VJz == EnumC79551VJz.WRAP) {
            if (TextUtils.isEmpty(this.LJLLLL)) {
                i3 = (this.LLIIL - this.LJLZ) / 2;
            } else {
                i3 = (this.LLIIL - this.LJLZ) / 4;
            }
            float f4 = i3 - 12;
            if (f4 <= 0.0f) {
                f4 = 10.0f;
            }
            float f5 = this.LLIIL - f4;
            float f6 = this.LLIFFJFJJ;
            canvas.drawLine(f4, f6, f5, f6, this.LJLLILLLL);
            float f7 = this.LLII;
            canvas.drawLine(f4, f7, f5, f7, this.LJLLILLLL);
        } else if (enumC79551VJz == EnumC79551VJz.CIRCLE) {
            this.LJLLILLLL.setStyle(Paint.Style.STROKE);
            this.LJLLILLLL.setStrokeWidth(this.LLFII);
            if (TextUtils.isEmpty(this.LJLLLL)) {
                f = (this.LLIIL - this.LJLZ) / 2.0f;
            } else {
                f = (this.LLIIL - this.LJLZ) / 4.0f;
            }
            float f8 = f - 12.0f;
            if (f8 > 0.0f) {
                f3 = f8;
            }
            canvas.drawCircle(this.LLIIL / 2.0f, this.LLIIJLIL / 2.0f, Math.max((this.LLIIL - f3) - f3, this.LJZL) / 1.8f, this.LJLLILLLL);
        } else {
            float f9 = this.LLIFFJFJJ;
            canvas.drawLine(0.0f, f9, this.LLIIL, f9, this.LJLLILLLL);
            float f10 = this.LLII;
            canvas.drawLine(0.0f, f10, this.LLIIL, f10, this.LJLLILLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLLL) && this.LJLJL) {
            int i5 = this.LLIIL;
            Paint paint = this.LJLLI;
            String str3 = this.LJLLLL;
            if (str3 != null && str3.length() > 0) {
                int length = str3.length();
                paint.getTextWidths(str3, new float[length]);
                i2 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    i2 += (int) Math.ceil(r7[i6]);
                }
            } else {
                i2 = 0;
            }
            canvas.drawText(this.LJLLLL, (i5 - i2) - this.LLILLJJLI, this.LLIIII, this.LJLLI);
        }
        int i7 = 0;
        while (true) {
            int i8 = this.LLIIJI;
            if (i7 >= i8) {
                break;
            }
            int i9 = this.LLIIIZ - ((i8 / 2) - i7);
            if (this.LLI) {
                item = this.LJLLL.getItem(LIZJ(i9));
            } else if (i9 < 0 || i9 > this.LJLLL.LIZ() - 1) {
                item = "";
            } else {
                item = this.LJLLL.getItem(i9);
            }
            canvas.save();
            double d = ((this.LJZL * i7) - f2) / this.LLIILII;
            float f11 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
            if (f11 > 90.0f || f11 < -90.0f) {
                canvas.restore();
            } else {
                if (!this.LJLJL && !TextUtils.isEmpty(this.LJLLLL) && !TextUtils.isEmpty(LIZIZ(item))) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ(item));
                    LIZ.append(this.LJLLLL);
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else {
                    LIZIZ = LIZIZ(item);
                }
                float pow = (float) Math.pow(Math.abs(f11) / 90.0f, 2.2d);
                Rect rect = new Rect();
                this.LJLLI.getTextBounds(LIZIZ, i4, LIZIZ.length(), rect);
                int i10 = this.LJLLLLLL;
                for (int width = rect.width(); width > this.LLIIL; width = rect.width()) {
                    i10--;
                    this.LJLLI.setTextSize(i10);
                    this.LJLLI.getTextBounds(LIZIZ, i4, LIZIZ.length(), rect);
                }
                this.LJLL.setTextSize(i10);
                Rect rect2 = new Rect();
                this.LJLLI.getTextBounds(LIZIZ, i4, LIZIZ.length(), rect2);
                int i11 = this.LLILIL;
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 == 17) {
                            if (this.LJLJJLL || (str2 = this.LJLLLL) == null || str2.equals("") || !this.LJLJL) {
                                this.LLILL = (int) ((this.LLIIL - rect2.width()) * 0.5d);
                            } else {
                                this.LLILL = (int) ((this.LLIIL - rect2.width()) * 0.25d);
                            }
                        }
                    } else {
                        this.LLILL = (this.LLIIL - rect2.width()) - ((int) this.LLILLJJLI);
                    }
                    i = 0;
                } else {
                    i = 0;
                    this.LLILL = 0;
                }
                Rect rect3 = new Rect();
                this.LJLL.getTextBounds(LIZIZ, i, LIZIZ.length(), rect3);
                int i12 = this.LLILIL;
                if (i12 != 3) {
                    if (i12 != 5) {
                        if (i12 == 17) {
                            if (this.LJLJJLL || (str = this.LJLLLL) == null || str.equals("") || !this.LJLJL) {
                                this.LLILLIZIL = (int) ((this.LLIIL - rect3.width()) * 0.5d);
                            } else {
                                this.LLILLIZIL = (int) ((this.LLIIL - rect3.width()) * 0.25d);
                            }
                        }
                    } else {
                        this.LLILLIZIL = (this.LLIIL - rect3.width()) - ((int) this.LLILLJJLI);
                    }
                } else {
                    this.LLILLIZIL = i;
                }
                float cos = (float) ((this.LLIILII - (Math.cos(d) * this.LLIILII)) - ((Math.sin(d) * this.LJZ) / 2.0d));
                canvas.translate(0.0f, cos);
                float f12 = this.LLIFFJFJJ;
                if (cos <= f12 && this.LJZ + cos >= f12) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, this.LLIIL, this.LLIFFJFJJ - cos);
                    canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                    LJ(pow, f11);
                    canvas.drawText(LIZIZ, this.LLILLIZIL, this.LJZ, this.LJLL);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0.0f, this.LLIFFJFJJ - cos, this.LLIIL, (int) this.LJZL);
                    canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                    canvas.drawText(LIZIZ, this.LLILL, this.LJZ - this.LLILLJJLI, this.LJLLI);
                    canvas.restore();
                } else {
                    float f13 = this.LLII;
                    if (cos <= f13 && this.LJZ + cos >= f13) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.LLIIL, this.LLII - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(LIZIZ, this.LLILL, this.LJZ - this.LLILLJJLI, this.LJLLI);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.LLII - cos, this.LLIIL, (int) this.LJZL);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        LJ(pow, f11);
                        canvas.drawText(LIZIZ, this.LLILLIZIL, this.LJZ, this.LJLL);
                        canvas.restore();
                    } else {
                        if (cos >= f12) {
                            float f14 = this.LJZ;
                            if (cos + f14 <= f13) {
                                canvas.drawText(LIZIZ, this.LLILL, f14 - this.LLILLJJLI, this.LJLLI);
                                this.LLIIIL = this.LLIIIZ - ((this.LLIIJI / 2) - i7);
                            }
                        }
                        canvas.save();
                        canvas.clipRect(0, 0, this.LLIIL, (int) this.LJZL);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        LJ(pow, f11);
                        canvas.drawText(LIZIZ, (this.LJZI * pow) + this.LLILLIZIL, this.LJZ, this.LJLL);
                        canvas.restore();
                    }
                }
                canvas.restore();
                this.LJLLI.setTextSize(this.LJLLLLLL);
            }
            i7++;
            i4 = 0;
        }
        Paint paint2 = this.LJLLJ;
        if (paint2 != null) {
            canvas.drawRect(0.0f, 0.0f, this.LLIIL, this.LLIFFJFJJ, paint2);
            canvas.drawRect(0.0f, this.LLII, this.LLIIL, this.LLIIJLIL, this.LJLLJ);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLLL == null) {
            return false;
        }
        boolean onTouchEvent = this.LJLJJI.onTouchEvent(motionEvent);
        float f = (-this.LLIIIJ) * this.LJZL;
        float LIZ = ((this.LJLLL.LIZ() - 1) - this.LLIIIJ) * this.LJZL;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                if (!onTouchEvent) {
                    float y = motionEvent.getY();
                    int i = this.LLIILII;
                    double acos = Math.acos((i - y) / i) * this.LLIILII;
                    float f2 = this.LJZL;
                    this.LLIILZL = (int) (((((int) ((acos + (f2 / 2.0f)) / f2)) - (this.LLIIJI / 2)) * f2) - (((this.LLIIIILZ % f2) + f2) % f2));
                    if (System.currentTimeMillis() - this.LLIL > 120) {
                        LJFF(EnumC79550VJy.DAGGLE);
                    } else {
                        LJFF(EnumC79550VJy.CLICK);
                    }
                }
            } else {
                float rawY = this.LLIIZ - motionEvent.getRawY();
                this.LLIIZ = motionEvent.getRawY();
                float f3 = this.LLIIIILZ + rawY;
                this.LLIIIILZ = f3;
                if (!this.LLI) {
                    float f4 = this.LJZL;
                    if ((f3 - (f4 * 0.25f) < f && rawY < 0.0f) || ((f4 * 0.25f) + f3 > LIZ && rawY > 0.0f)) {
                        this.LLIIIILZ = f3 - rawY;
                        return true;
                    }
                }
            }
        } else {
            this.LLIL = System.currentTimeMillis();
            LIZ();
            this.LLIIZ = motionEvent.getRawY();
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC79760VSa interfaceC79760VSa) {
        this.LJLLL = interfaceC79760VSa;
        int LIZ = interfaceC79760VSa.LIZ();
        if (LIZ == 0) {
            setCurrentIndex(0);
        } else {
            int i = this.LLIIIL;
            int i2 = LIZ - 1;
            if (i > i2) {
                setCurrentIndex(i2);
            } else if (i < 0) {
                setCurrentIndex(0);
            }
        }
        LIZLLL();
        invalidate();
    }

    public void setAlphaGradient(boolean z) {
        this.LLILLL = z;
    }

    public final void setCenterWeight(String str) {
        if (str.contains("bold")) {
            this.LJLLI.setFakeBoldText(true);
        }
    }

    public final void setCurrentIndex(int i) {
        this.LLIIIL = i;
        this.LLIIIJ = i;
        this.LLIIIILZ = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.LLI = z;
    }

    public void setDividerColor(int i) {
        this.LLFFF = i;
        this.LJLLILLLL.setColor(i);
    }

    public void setDividerType(EnumC79551VJz enumC79551VJz) {
        this.LJLIL = enumC79551VJz;
    }

    public void setDividerWidth(int i) {
        this.LLFII = i;
        this.LJLLILLLL.setStrokeWidth(i);
    }

    public void setGravity(int i) {
        this.LLILIL = i;
    }

    public void setIsOptions(boolean z) {
        this.LJLJJLL = z;
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        int i2 = i + 2;
        if (this.LLIIJI != i2) {
            this.LLIIJI = i2;
            LIZLLL();
            invalidate();
        }
    }

    public void setLabel(String str) {
        this.LJLLLL = str;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.LLFZ = f;
            if (f < 1.0f) {
                this.LLFZ = 1.0f;
            } else {
                if (f <= 4.0f) {
                    return;
                }
                this.LLFZ = 4.0f;
            }
        }
    }

    public void setLocalizeAdapter(InterfaceC58352MvE interfaceC58352MvE) {
        this.LLILZ = interfaceC58352MvE;
    }

    public void setMaskColor(int i) {
        if (this.LJLLJ == null) {
            this.LJLLJ = new Paint();
        }
        this.LJLLJ.setColor(i);
    }

    public final void setOnItemSelectedListener(VLJ vlj) {
        this.LJLJJL = vlj;
    }

    public void setTextColorCenter(int i) {
        this.LLFF = i;
        this.LJLLI.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.LLF = i;
        this.LJLL.setColor(i);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.LJLILLLLZI.getResources().getDisplayMetrics().density * f);
            this.LJLLLLLL = i;
            this.LJLL.setTextSize(i);
            this.LJLLI.setTextSize(this.LJLLLLLL);
        }
    }

    public final void setTextSizePx(int i) {
        if (i > 0.0f) {
            this.LJLLLLLL = i;
            this.LJLL.setTextSize(i);
            this.LJLLI.setTextSize(this.LJLLLLLL);
        }
    }

    public void setTextXOffset(int i) {
        this.LJZI = i;
        if (i != 0) {
            this.LJLLI.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f) {
        this.LLIIIILZ = f;
    }

    public final void setTypeface(Typeface typeface) {
        this.LLD = typeface;
        this.LJLL.setTypeface(typeface);
        this.LJLLI.setTypeface(this.LLD);
    }

    public void setUserItemHeight(int i) {
        this.LL = i;
    }

    public final void LJ(float f, float f2) {
        int i;
        int i2;
        int i3 = this.LJZI;
        int i4 = -1;
        if (i3 > 0) {
            i = 1;
        } else if (i3 < 0) {
            i = -1;
        } else {
            i = 0;
        }
        Paint paint = this.LJLL;
        if (f2 <= 0.0f) {
            i4 = 1;
        }
        paint.setTextSkewX(i * i4 * 0.5f * f);
        if (this.LLILLL) {
            i2 = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            i2 = 255;
        }
        this.LJLL.setAlpha(i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLILII = i;
        LIZLLL();
        setMeasuredDimension(this.LLIIL, this.LLIIJLIL);
    }
}
