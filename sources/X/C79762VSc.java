package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
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

/* renamed from: X.VSc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79762VSc extends View {
    public static final String[] LLILLL = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};
    public VK0 LJLIL;
    public Context LJLILLLLZI;
    public HandlerC79766VSg LJLJI;
    public GestureDetector LJLJJI;
    public InterfaceC79769VSj LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final ScheduledExecutorService LJLJLJ;
    public ScheduledFuture<?> LJLJLLL;
    public Paint LJLL;
    public Paint LJLLI;
    public Paint LJLLILLLL;
    public InterfaceC79767VSh LJLLJ;
    public String LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public float LJZI;
    public Typeface LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public float LLFFF;
    public boolean LLFII;
    public float LLFZ;
    public float LLI;
    public float LLIFFJFJJ;
    public float LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public float LLIILII;
    public long LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public final float LLILL;
    public boolean LLILLIZIL;
    public InterfaceC58352MvE LLILLJJLI;

    public final void LIZ() {
        ScheduledFuture<?> scheduledFuture = this.LJLJLLL;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.LJLJLLL.cancel(true);
            this.LJLJLLL = null;
        }
    }

    public final void LIZLLL() {
        String str;
        if (this.LJLLJ == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i = 0; i < this.LJLLJ.LIZ(); i++) {
            String LIZIZ = LIZIZ(this.LJLLJ.getItem(i));
            this.LJLLI.getTextBounds(LIZIZ, 0, LIZIZ.length(), rect);
            int width = rect.width();
            if (width > this.LJLLLLLL) {
                this.LJLLLLLL = width;
            }
        }
        InterfaceC58352MvE interfaceC58352MvE = this.LLILLJJLI;
        if (interfaceC58352MvE == null || (str = interfaceC58352MvE.LIZ().get("wheel_text_bound_text")) == null || str.isEmpty()) {
            str = "Week";
        }
        this.LJLLI.getTextBounds(str, 0, 2, rect);
        int height = rect.height() + 2;
        this.LJLZ = height;
        float f = this.LLFFF * height;
        this.LJZI = f;
        this.LLIIIZ = (int) ((r3 * 2) / 3.141592653589793d);
        this.LLIIJLIL = (int) (((int) (f * (this.LLIIIL - 1))) / 3.141592653589793d);
        this.LLIIJI = View.MeasureSpec.getSize(this.LLIIZ);
        float f2 = this.LLIIIZ;
        float f3 = this.LJZI;
        this.LLFZ = (f2 - f3) / 2.0f;
        float f4 = (f2 + f3) / 2.0f;
        this.LLI = f4;
        this.LLIFFJFJJ = (f4 - ((f3 - this.LJLZ) / 2.0f)) - this.LLILL;
        if (this.LLIIII == -1) {
            if (this.LLFII) {
                this.LLIIII = (this.LJLLJ.LIZ() + 1) / 2;
            } else {
                this.LLIIII = 0;
            }
        }
        this.LLIIIJ = this.LLIIII;
    }

    public final int getCurrentItem() {
        int i;
        InterfaceC79767VSh interfaceC79767VSh = this.LJLLJ;
        if (interfaceC79767VSh == null) {
            return 0;
        }
        if (this.LLFII && ((i = this.LLIIIILZ) < 0 || i >= interfaceC79767VSh.LIZ())) {
            return Math.max(0, Math.min(Math.abs(Math.abs(this.LLIIIILZ) - this.LJLLJ.LIZ()), this.LJLLJ.LIZ() - 1));
        }
        return Math.max(0, Math.min(this.LLIIIILZ, this.LJLLJ.LIZ() - 1));
    }

    public int getItemsCount() {
        InterfaceC79767VSh interfaceC79767VSh = this.LJLLJ;
        if (interfaceC79767VSh != null) {
            return interfaceC79767VSh.LIZ();
        }
        return 0;
    }

    public final InterfaceC79767VSh getAdapter() {
        return this.LJLLJ;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.LJLJI;
    }

    public int getInitPosition() {
        return this.LLIIII;
    }

    public float getItemHeight() {
        return this.LJZI;
    }

    public float getTotalScrollY() {
        return this.LLII;
    }

    public static String LIZIZ(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof InterfaceC79768VSi) {
            return ((InterfaceC79768VSi) obj).LIZ();
        }
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0 && intValue < 10) {
                return LLILLL[intValue];
            }
            return String.valueOf(intValue);
        }
        return obj.toString();
    }

    public final int LIZJ(int i) {
        if (i < 0) {
            return LIZJ(this.LJLLJ.LIZ() + i);
        }
        if (i <= this.LJLLJ.LIZ() - 1) {
            return i;
        }
        return LIZJ(i - this.LJLLJ.LIZ());
    }

    public final void LJFF(EnumC79549VJx enumC79549VJx) {
        LIZ();
        if (enumC79549VJx == EnumC79549VJx.FLING || enumC79549VJx == EnumC79549VJx.DAGGLE) {
            float f = this.LLII;
            float f2 = this.LJZI;
            int i = (int) (((f % f2) + f2) % f2);
            this.LLIIL = i;
            if (i > f2 / 2.0f) {
                this.LLIIL = (int) (f2 - i);
            } else {
                this.LLIIL = -i;
            }
        }
        this.LJLJLLL = this.LJLJLJ.scheduleWithFixedDelay(new C79763VSd(this, this.LLIIL), 0L, 10L, TimeUnit.MILLISECONDS);
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
        if (this.LJLLJ == null) {
            return;
        }
        int i4 = 0;
        int min = Math.min(Math.max(0, this.LLIIII), this.LJLLJ.LIZ() - 1);
        this.LLIIII = min;
        try {
            this.LLIIIJ = min + (((int) (this.LLII / this.LJZI)) % this.LJLLJ.LIZ());
        } catch (ArithmeticException unused) {
            LLog.LIZLLL(4, "WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
        }
        if (!this.LLFII) {
            if (this.LLIIIJ < 0) {
                this.LLIIIJ = 0;
            }
            if (this.LLIIIJ > this.LJLLJ.LIZ() - 1) {
                this.LLIIIJ = this.LJLLJ.LIZ() - 1;
            }
        } else {
            if (this.LLIIIJ < 0) {
                this.LLIIIJ = this.LJLLJ.LIZ() + this.LLIIIJ;
            }
            if (this.LLIIIJ > this.LJLLJ.LIZ() - 1) {
                this.LLIIIJ -= this.LJLLJ.LIZ();
            }
        }
        float f2 = this.LLII % this.LJZI;
        VK0 vk0 = this.LJLIL;
        float f3 = 10.0f;
        if (vk0 == VK0.WRAP) {
            if (TextUtils.isEmpty(this.LJLLL)) {
                i3 = (this.LLIIJI - this.LJLLLLLL) / 2;
            } else {
                i3 = (this.LLIIJI - this.LJLLLLLL) / 4;
            }
            float f4 = i3 - 12;
            if (f4 <= 0.0f) {
                f4 = 10.0f;
            }
            float f5 = this.LLIIJI - f4;
            float f6 = this.LLFZ;
            canvas.drawLine(f4, f6, f5, f6, this.LJLLILLLL);
            float f7 = this.LLI;
            canvas.drawLine(f4, f7, f5, f7, this.LJLLILLLL);
        } else if (vk0 == VK0.CIRCLE) {
            this.LJLLILLLL.setStyle(Paint.Style.STROKE);
            this.LJLLILLLL.setStrokeWidth(this.LLFF);
            if (TextUtils.isEmpty(this.LJLLL)) {
                f = (this.LLIIJI - this.LJLLLLLL) / 2.0f;
            } else {
                f = (this.LLIIJI - this.LJLLLLLL) / 4.0f;
            }
            float f8 = f - 12.0f;
            if (f8 > 0.0f) {
                f3 = f8;
            }
            canvas.drawCircle(this.LLIIJI / 2.0f, this.LLIIIZ / 2.0f, Math.max((this.LLIIJI - f3) - f3, this.LJZI) / 1.8f, this.LJLLILLLL);
        } else {
            float f9 = this.LLFZ;
            canvas.drawLine(0.0f, f9, this.LLIIJI, f9, this.LJLLILLLL);
            float f10 = this.LLI;
            canvas.drawLine(0.0f, f10, this.LLIIJI, f10, this.LJLLILLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLL) && this.LJLJL) {
            int i5 = this.LLIIJI;
            Paint paint = this.LJLLI;
            String str3 = this.LJLLL;
            if (str3 != null && str3.length() > 0) {
                int length = str3.length();
                paint.getTextWidths(str3, new float[length]);
                i2 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    i2 += (int) Math.ceil(r5[i6]);
                }
            } else {
                i2 = 0;
            }
            canvas.drawText(this.LJLLL, (i5 - i2) - this.LLILL, this.LLIFFJFJJ, this.LJLLI);
        }
        int i7 = 0;
        while (true) {
            int i8 = this.LLIIIL;
            if (i7 < i8) {
                int i9 = this.LLIIIJ - ((i8 / 2) - i7);
                if (this.LLFII) {
                    item = this.LJLLJ.getItem(LIZJ(i9));
                } else if (i9 < 0 || i9 > this.LJLLJ.LIZ() - 1) {
                    item = "";
                } else {
                    item = this.LJLLJ.getItem(i9);
                }
                canvas.save();
                double d = ((this.LJZI * i7) - f2) / this.LLIIJLIL;
                float f11 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f11 > 90.0f || f11 < -90.0f) {
                    canvas.restore();
                } else {
                    if (!this.LJLJL && !TextUtils.isEmpty(this.LJLLL) && !TextUtils.isEmpty(LIZIZ(item))) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LIZIZ(item));
                        LIZ.append(this.LJLLL);
                        LIZIZ = X1D.LIZIZ(LIZ);
                    } else {
                        LIZIZ = LIZIZ(item);
                    }
                    float pow = (float) Math.pow(Math.abs(f11) / 90.0f, 2.2d);
                    Rect rect = new Rect();
                    this.LJLLI.getTextBounds(LIZIZ, i4, LIZIZ.length(), rect);
                    int i10 = this.LJLLLL;
                    for (int width = rect.width(); width > this.LLIIJI; width = rect.width()) {
                        i10--;
                        this.LJLLI.setTextSize(i10);
                        this.LJLLI.getTextBounds(LIZIZ, i4, LIZIZ.length(), rect);
                    }
                    this.LJLL.setTextSize(i10);
                    Rect rect2 = new Rect();
                    this.LJLLI.getTextBounds(LIZIZ, i4, LIZIZ.length(), rect2);
                    int i11 = this.LLIL;
                    if (i11 != 3) {
                        if (i11 != 5) {
                            if (i11 == 17) {
                                if (this.LJLJJLL || (str2 = this.LJLLL) == null || str2.equals("") || !this.LJLJL) {
                                    this.LLILII = (int) ((this.LLIIJI - rect2.width()) * 0.5d);
                                } else {
                                    this.LLILII = (int) ((this.LLIIJI - rect2.width()) * 0.25d);
                                }
                            }
                        } else {
                            this.LLILII = (this.LLIIJI - rect2.width()) - ((int) this.LLILL);
                        }
                        i = 0;
                    } else {
                        i = 0;
                        this.LLILII = 0;
                    }
                    Rect rect3 = new Rect();
                    this.LJLL.getTextBounds(LIZIZ, i, LIZIZ.length(), rect3);
                    int i12 = this.LLIL;
                    if (i12 != 3) {
                        if (i12 != 5) {
                            if (i12 == 17) {
                                if (this.LJLJJLL || (str = this.LJLLL) == null || str.equals("") || !this.LJLJL) {
                                    this.LLILIL = (int) ((this.LLIIJI - rect3.width()) * 0.5d);
                                } else {
                                    this.LLILIL = (int) ((this.LLIIJI - rect3.width()) * 0.25d);
                                }
                            }
                        } else {
                            this.LLILIL = (this.LLIIJI - rect3.width()) - ((int) this.LLILL);
                        }
                    } else {
                        this.LLILIL = i;
                    }
                    float cos = (float) ((this.LLIIJLIL - (Math.cos(d) * this.LLIIJLIL)) - ((Math.sin(d) * this.LJLZ) / 2.0d));
                    canvas.translate(0.0f, cos);
                    float f12 = this.LLFZ;
                    if (cos <= f12 && this.LJLZ + cos >= f12) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.LLIIJI, this.LLFZ - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        LJ(pow, f11);
                        canvas.drawText(LIZIZ, this.LLILIL, this.LJLZ, this.LJLL);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.LLFZ - cos, this.LLIIJI, (int) this.LJZI);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(LIZIZ, this.LLILII, this.LJLZ - this.LLILL, this.LJLLI);
                        canvas.restore();
                    } else {
                        float f13 = this.LLI;
                        if (cos <= f13 && this.LJLZ + cos >= f13) {
                            canvas.save();
                            canvas.clipRect(0.0f, 0.0f, this.LLIIJI, this.LLI - cos);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(LIZIZ, this.LLILII, this.LJLZ - this.LLILL, this.LJLLI);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(0.0f, this.LLI - cos, this.LLIIJI, (int) this.LJZI);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            LJ(pow, f11);
                            canvas.drawText(LIZIZ, this.LLILIL, this.LJLZ, this.LJLL);
                            canvas.restore();
                        } else {
                            if (cos >= f12) {
                                float f14 = this.LJLZ;
                                if (cos + f14 <= f13) {
                                    canvas.drawText(LIZIZ, this.LLILII, f14 - this.LLILL, this.LJLLI);
                                    this.LLIIIILZ = this.LLIIIJ - ((this.LLIIIL / 2) - i7);
                                }
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, this.LLIIJI, (int) this.LJZI);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            LJ(pow, f11);
                            canvas.drawText(LIZIZ, (this.LJZ * pow) + this.LLILIL, this.LJLZ, this.LJLL);
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                    this.LJLLI.setTextSize(this.LJLLLL);
                }
                i7++;
                i4 = 0;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.LJLJJI.onTouchEvent(motionEvent);
        float f = (-this.LLIIII) * this.LJZI;
        float LIZ = ((this.LJLLJ.LIZ() - 1) - this.LLIIII) * this.LJZI;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                if (!onTouchEvent) {
                    float y = motionEvent.getY();
                    int i = this.LLIIJLIL;
                    double acos = Math.acos((i - y) / i) * this.LLIIJLIL;
                    float f2 = this.LJZI;
                    this.LLIIL = (int) (((((int) ((acos + (f2 / 2.0f)) / f2)) - (this.LLIIIL / 2)) * f2) - (((this.LLII % f2) + f2) % f2));
                    if (System.currentTimeMillis() - this.LLIILZL > 120) {
                        LJFF(EnumC79549VJx.DAGGLE);
                    } else {
                        LJFF(EnumC79549VJx.CLICK);
                    }
                }
            } else {
                float rawY = this.LLIILII - motionEvent.getRawY();
                this.LLIILII = motionEvent.getRawY();
                float f3 = this.LLII + rawY;
                this.LLII = f3;
                if (!this.LLFII) {
                    float f4 = this.LJZI;
                    if ((f3 - (f4 * 0.25f) < f && rawY < 0.0f) || ((f4 * 0.25f) + f3 > LIZ && rawY > 0.0f)) {
                        this.LLII = f3 - rawY;
                        return true;
                    }
                }
            }
        } else {
            this.LLIILZL = System.currentTimeMillis();
            LIZ();
            this.LLIILII = motionEvent.getRawY();
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC79767VSh interfaceC79767VSh) {
        this.LJLLJ = interfaceC79767VSh;
        LIZLLL();
        invalidate();
    }

    public void setAlphaGradient(boolean z) {
        this.LLILLIZIL = z;
    }

    public final void setCurrentIndex(int i) {
        this.LLIIIILZ = i;
        this.LLIIII = i;
        this.LLII = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.LLFII = z;
    }

    public void setDividerColor(int i) {
        this.LLF = i;
        this.LJLLILLLL.setColor(i);
    }

    public void setDividerType(VK0 vk0) {
        this.LJLIL = vk0;
    }

    public void setDividerWidth(int i) {
        this.LLFF = i;
        this.LJLLILLLL.setStrokeWidth(i);
    }

    public void setGravity(int i) {
        this.LLIL = i;
    }

    public void setIsOptions(boolean z) {
        this.LJLJJLL = z;
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        this.LLIIIL = i + 2;
    }

    public void setLabel(String str) {
        this.LJLLL = str;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.LLFFF = f;
            if (f < 1.0f) {
                this.LLFFF = 1.0f;
            } else {
                if (f <= 4.0f) {
                    return;
                }
                this.LLFFF = 4.0f;
            }
        }
    }

    public void setLocalizeAdapter(InterfaceC58352MvE interfaceC58352MvE) {
        this.LLILLJJLI = interfaceC58352MvE;
    }

    public final void setOnItemSelectedListener(InterfaceC79769VSj interfaceC79769VSj) {
        this.LJLJJL = interfaceC79769VSj;
    }

    public void setTextColorCenter(int i) {
        this.LLD = i;
        this.LJLLI.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.LL = i;
        this.LJLL.setColor(i);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.LJLILLLLZI.getResources().getDisplayMetrics().density * f);
            this.LJLLLL = i;
            this.LJLL.setTextSize(i);
            this.LJLLI.setTextSize(this.LJLLLL);
        }
    }

    public void setTextXOffset(int i) {
        this.LJZ = i;
        if (i != 0) {
            this.LJLLI.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f) {
        this.LLII = f;
    }

    public final void setTypeface(Typeface typeface) {
        this.LJZL = typeface;
        this.LJLL.setTypeface(typeface);
        this.LJLLI.setTypeface(this.LJZL);
    }

    public C79762VSc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = true;
        this.LJLJLJ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("iew/WheelView"));
        this.LJZL = Typeface.MONOSPACE;
        this.LLFFF = 1.6f;
        this.LLIIIL = 11;
        this.LLIIL = 0;
        this.LLIILII = 0.0f;
        this.LLIILZL = 0L;
        this.LLIL = 17;
        this.LLILII = 0;
        this.LLILIL = 0;
        this.LLILLIZIL = false;
        this.LJLLLL = getResources().getDimensionPixelSize(R.dimen.y6);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.LLILL = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.LLILL = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.LLILL = 6.0f;
        } else if (f >= 3.0f) {
            this.LLILL = f * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b4h, R.attr.b4i, R.attr.b4j, R.attr.b4k, R.attr.b4l, R.attr.b4m, R.attr.b4n}, 0, 0);
            this.LLIL = obtainStyledAttributes.getInt(2, 17);
            this.LL = obtainStyledAttributes.getColor(5, -5723992);
            this.LLD = obtainStyledAttributes.getColor(4, -14013910);
            this.LLF = obtainStyledAttributes.getColor(0, -2763307);
            this.LLFF = obtainStyledAttributes.getDimensionPixelSize(1, 2);
            this.LJLLLL = obtainStyledAttributes.getDimensionPixelOffset(6, this.LJLLLL);
            this.LLFFF = obtainStyledAttributes.getFloat(3, this.LLFFF);
            obtainStyledAttributes.recycle();
        }
        float f2 = this.LLFFF;
        if (f2 < 1.0f) {
            this.LLFFF = 1.0f;
        } else if (f2 > 4.0f) {
            this.LLFFF = 4.0f;
        }
        this.LJLILLLLZI = context;
        this.LJLJI = new HandlerC79766VSg(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C79765VSf(this));
        this.LJLJJI = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.LLFII = true;
        this.LLII = 0.0f;
        this.LLIIII = -1;
        Paint paint = new Paint();
        this.LJLL = paint;
        paint.setColor(this.LL);
        this.LJLL.setAntiAlias(true);
        this.LJLL.setTypeface(this.LJZL);
        this.LJLL.setTextSize(this.LJLLLL);
        Paint paint2 = new Paint();
        this.LJLLI = paint2;
        paint2.setColor(this.LLD);
        this.LJLLI.setAntiAlias(true);
        this.LJLLI.setTextScaleX(1.1f);
        this.LJLLI.setTypeface(this.LJZL);
        this.LJLLI.setTextSize(this.LJLLLL);
        Paint paint3 = new Paint();
        this.LJLLILLLL = paint3;
        paint3.setColor(this.LLF);
        this.LJLLILLLL.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void LJ(float f, float f2) {
        int i;
        int i2;
        int i3 = this.LJZ;
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
        if (this.LLILLIZIL) {
            i2 = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            i2 = 255;
        }
        this.LJLL.setAlpha(i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLIIZ = i;
        LIZLLL();
        setMeasuredDimension(this.LLIIJI, this.LLIIIZ);
    }
}
