package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* renamed from: X.Vu6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81214Vu6 extends View {
    public static final String[] LJZ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public Paint LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public final RectF LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public InterfaceC81216Vu8 LJLLLLLL;
    public float LJLZ;

    public String[] getDefaultIndexItems() {
        return LJZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float width;
        float f2;
        float paddingLeft;
        float f3;
        super.onDraw(canvas);
        int length = this.LJLIL.length;
        int i = 0;
        while (true) {
            int i2 = 255;
            if (i < length) {
                float f4 = this.LJLZ;
                float f5 = this.LJLJL;
                float f6 = i;
                float f7 = (f5 * f6) + f4;
                float f8 = 0.0f;
                if (this.LJLILLLLZI != -1) {
                    float abs = Math.abs(this.LJLJI - ((f5 / 2.0f) + (f6 * f5))) / this.LJLJL;
                    f = Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
                } else {
                    f = 0.0f;
                }
                if (i != this.LJLILLLLZI) {
                    i2 = (int) ((1.0f - f) * 255.0f);
                }
                this.LJLJJI.setAlpha(i2);
                Paint paint = this.LJLJJI;
                float f9 = this.LJLJJLL;
                paint.setTextSize((f9 * f) + f9);
                if (this.LJLLL == 1) {
                    int i3 = this.LJLLLL;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                paddingLeft = getPaddingLeft() + this.LJLLI;
                                f3 = this.LJLJLJ;
                            }
                        } else {
                            paddingLeft = getPaddingLeft();
                            f3 = this.LJLJLJ;
                        }
                        f8 = (f3 * f) + paddingLeft;
                    } else {
                        f8 = (this.LJLJLJ * f) + (this.LJLLI / 2.0f) + getPaddingLeft();
                    }
                } else {
                    int i4 = this.LJLLLL;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                width = getWidth() - getPaddingRight();
                                f2 = this.LJLJLJ;
                            }
                        } else {
                            width = (getWidth() - getPaddingRight()) - this.LJLLI;
                            f2 = this.LJLJLJ;
                        }
                    } else {
                        width = (getWidth() - getPaddingRight()) - (this.LJLLI / 2.0f);
                        f2 = this.LJLJLJ;
                    }
                    f8 = width - (f2 * f);
                }
                canvas.drawText(this.LJLIL[i], f8, f7, this.LJLJJI);
                i++;
            } else {
                this.LJLJJI.setAlpha(255);
                this.LJLJJI.setTextSize(this.LJLJJLL);
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        InterfaceC81216Vu8 interfaceC81216Vu8;
        InterfaceC81216Vu8 interfaceC81216Vu82;
        InterfaceC81216Vu8 interfaceC81216Vu83;
        if (this.LJLIL.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        float height = y - ((getHeight() / 2) - (this.LJLL / 2.0f));
        this.LJLJI = height;
        if (height <= 0.0f) {
            i = 0;
        } else {
            i = (int) (height / this.LJLJL);
            String[] strArr = this.LJLIL;
            if (i >= strArr.length) {
                i = strArr.length - 1;
            }
        }
        this.LJLILLLLZI = i;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                } else {
                    if (this.LJLLILLLL && !this.LJLLJ && (interfaceC81216Vu83 = this.LJLLLLLL) != null) {
                        ((C81217Vu9) interfaceC81216Vu83).LIZ(this.LJLIL[this.LJLILLLLZI]);
                    }
                    invalidate();
                    return true;
                }
            }
            if (this.LJLLJ && (interfaceC81216Vu82 = this.LJLLLLLL) != null) {
                ((C81217Vu9) interfaceC81216Vu82).LIZ(this.LJLIL[this.LJLILLLLZI]);
            }
            this.LJLILLLLZI = -1;
            this.LJLLILLLL = false;
            invalidate();
            return true;
        }
        if (this.LJLJLLL.contains(x, y)) {
            this.LJLLILLLL = true;
            if (!this.LJLLJ && (interfaceC81216Vu8 = this.LJLLLLLL) != null) {
                ((C81217Vu9) interfaceC81216Vu8).LIZ(this.LJLIL[this.LJLILLLLZI]);
            }
            invalidate();
            return true;
        }
        this.LJLILLLLZI = -1;
        return false;
    }

    public void setIndexItems(String... strArr) {
        this.LJLIL = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setLazyRespond(boolean z) {
        this.LJLLJ = z;
    }

    public void setMaxOffset(int i) {
        this.LJLJLJ = i;
        invalidate();
    }

    public void setOnSelectIndexItemListener(InterfaceC81216Vu8 interfaceC81216Vu8) {
        this.LJLLLLLL = interfaceC81216Vu8;
    }

    public void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.LJLLL = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextAlign(int i) {
        if (this.LJLLLL == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LJLJJI.setTextAlign(Paint.Align.RIGHT);
                } else {
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
                }
            } else {
                this.LJLJJI.setTextAlign(Paint.Align.LEFT);
            }
        } else {
            this.LJLJJI.setTextAlign(Paint.Align.CENTER);
        }
        this.LJLLLL = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.LJLJJL = i;
        this.LJLJJI.setColor(i);
        invalidate();
    }

    public void setTextSize(float f) {
        if (this.LJLJJLL == f) {
            return;
        }
        this.LJLJJLL = f;
        this.LJLJJI.setTextSize(f);
        invalidate();
    }

    public C81214Vu6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = -1;
        this.LJLJI = -1.0f;
        this.LJLJLLL = new RectF();
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bba, R.attr.bbb, R.attr.bbc, R.attr.bbd, R.attr.bbe, R.attr.bbf});
        this.LJLLJ = obtainStyledAttributes.getBoolean(0, false);
        this.LJLJJL = obtainStyledAttributes.getColor(4, -7829368);
        this.LJLJJLL = obtainStyledAttributes.getDimension(5, TypedValue.applyDimension(2, 14, displayMetrics));
        this.LJLJLJ = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 80, displayMetrics));
        this.LJLLL = obtainStyledAttributes.getInt(2, 0);
        this.LJLLLL = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.LJLIL = getDefaultIndexItems();
        Paint paint = new Paint();
        this.LJLJJI = paint;
        paint.setAntiAlias(true);
        this.LJLJJI.setColor(this.LJLJJL);
        this.LJLJJI.setTextSize(this.LJLJJLL);
        this.LJLJJI.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        int i = this.LJLLLL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.LJLJJI.setTextAlign(Paint.Align.RIGHT);
                return;
            }
            this.LJLJJI.setTextAlign(Paint.Align.LEFT);
            return;
        }
        this.LJLJJI.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float paddingRight;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        Paint.FontMetrics fontMetrics = this.LJLJJI.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.LJLJL = f;
        String[] strArr = this.LJLIL;
        this.LJLL = strArr.length * f;
        for (String str : strArr) {
            this.LJLLI = Math.max(this.LJLLI, this.LJLJJI.measureText(str));
        }
        if (this.LJLLL == 1) {
            paddingRight = 0.0f;
        } else {
            paddingRight = (size2 - this.LJLLI) - getPaddingRight();
        }
        float paddingLeft = this.LJLLL == 1 ? getPaddingLeft() + paddingRight + this.LJLLI : size2;
        float f2 = size / 2;
        float f3 = this.LJLL;
        float f4 = f2 - (f3 / 2.0f);
        this.LJLJLLL.set(paddingRight, f4, paddingLeft, f3 + f4);
        float length = this.LJLIL.length;
        float f5 = this.LJLJL;
        float LIZIZ = C65232Piu.LIZIZ(length, f5, 2.0f, f2);
        float f6 = fontMetrics.descent;
        float f7 = fontMetrics.ascent;
        this.LJLZ = (((f5 / 2.0f) - ((f6 - f7) / 2.0f)) + LIZIZ) - f7;
    }
}
