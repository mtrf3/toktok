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
import defpackage.a1;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Vu4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81212Vu4 extends View {
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
    public InterfaceC77764UfY LJLLLLLL;
    public float LJLZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float width;
        float f2;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        int length = this.LJLIL.length;
        int i = 0;
        while (true) {
            int i2 = 255;
            if (i < length) {
                float f3 = this.LJLZ;
                float f4 = this.LJLJL;
                float f5 = i;
                float f6 = (f4 * f5) + f3;
                float f7 = 0.0f;
                if (this.LJLILLLLZI != -1) {
                    float abs = Math.abs(this.LJLJI - ((f4 / 2) + (f5 * f4))) / this.LJLJL;
                    f = Math.max(1 - ((abs * abs) / 16), 0.0f);
                } else {
                    f = 0.0f;
                }
                if (i != this.LJLILLLLZI) {
                    i2 = (int) ((1 - f) * 255);
                }
                Paint paint = this.LJLJJI;
                if (paint != null) {
                    paint.setAlpha(i2);
                    Paint paint2 = this.LJLJJI;
                    if (paint2 != null) {
                        float f8 = this.LJLJJLL;
                        paint2.setTextSize((f8 * f) + f8);
                        if (this.LJLLL == 1) {
                            int i3 = this.LJLLLL;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        f7 = (this.LJLJLJ * f) + getPaddingLeft() + this.LJLLI;
                                    }
                                } else {
                                    f7 = (this.LJLJLJ * f) + getPaddingLeft();
                                }
                            } else {
                                f7 = (this.LJLJLJ * f) + (this.LJLLI / 2) + getPaddingLeft();
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
                                width = (getWidth() - getPaddingRight()) - (this.LJLLI / 2);
                                f2 = this.LJLJLJ;
                            }
                            f7 = width - (f2 * f);
                        }
                        String str = this.LJLIL[i];
                        Paint paint3 = this.LJLJJI;
                        if (paint3 != null) {
                            canvas.drawText(str, f7, f6, paint3);
                            i++;
                        } else {
                            o.LJIJI("paint");
                            throw null;
                        }
                    } else {
                        o.LJIJI("paint");
                        throw null;
                    }
                } else {
                    o.LJIJI("paint");
                    throw null;
                }
            } else {
                Paint paint4 = this.LJLJJI;
                if (paint4 != null) {
                    paint4.setAlpha(255);
                    Paint paint5 = this.LJLJJI;
                    if (paint5 != null) {
                        paint5.setTextSize(this.LJLJJLL);
                        return;
                    } else {
                        o.LJIJI("paint");
                        throw null;
                    }
                }
                o.LJIJI("paint");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        int i;
        InterfaceC77764UfY interfaceC77764UfY;
        InterfaceC77764UfY interfaceC77764UfY2;
        InterfaceC77764UfY interfaceC77764UfY3;
        o.LJIIIZ(event, "event");
        if (this.LJLIL.length == 0) {
            return super.onTouchEvent(event);
        }
        float y = event.getY();
        float x = event.getX();
        float height = y - ((getHeight() / 2) - (this.LJLL / 2));
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
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(event);
                    }
                } else {
                    if (this.LJLLILLLL && !this.LJLLJ && (interfaceC77764UfY3 = this.LJLLLLLL) != null) {
                        interfaceC77764UfY3.LIZIZ(this.LJLIL[this.LJLILLLLZI]);
                    }
                    invalidate();
                    return true;
                }
            }
            if (this.LJLLJ && (interfaceC77764UfY2 = this.LJLLLLLL) != null) {
                interfaceC77764UfY2.LIZIZ(this.LJLIL[this.LJLILLLLZI]);
            }
            this.LJLILLLLZI = -1;
            this.LJLLILLLL = false;
            invalidate();
            return true;
        }
        if (this.LJLJLLL.contains(x, y)) {
            this.LJLLILLLL = true;
            if (!this.LJLLJ && (interfaceC77764UfY = this.LJLLLLLL) != null) {
                interfaceC77764UfY.LIZIZ(this.LJLIL[this.LJLILLLLZI]);
            }
            invalidate();
            return true;
        }
        this.LJLILLLLZI = -1;
        return false;
    }

    public final void setIndexItems(String... indexItems) {
        o.LJIIIZ(indexItems, "indexItems");
        Object[] copyOf = Arrays.copyOf(indexItems, indexItems.length);
        o.LJIIIIZZ(copyOf, "copyOf(indexItems, indexItems.size)");
        this.LJLIL = (String[]) copyOf;
        requestLayout();
    }

    public final void setLazyRespond(boolean z) {
        this.LJLLJ = z;
    }

    public final void setMaxOffset(int i) {
        this.LJLJLJ = i;
        invalidate();
    }

    public final void setOnSelectIndexItemListener(InterfaceC77764UfY interfaceC77764UfY) {
        this.LJLLLLLL = interfaceC77764UfY;
    }

    public final void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.LJLLL = i;
            requestLayout();
        } else {
            "the position must be POSITION_RIGHT or POSITION_LEFT".toString();
            throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
        }
    }

    public final void setSideBarPosition(int i) {
        if (this.LJLLL == i) {
            return;
        }
        this.LJLLL = i;
        invalidate();
    }

    public final void setTextAlign(int i) {
        if (this.LJLLLL == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Paint paint = this.LJLJJI;
                    if (paint != null) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                    } else {
                        o.LJIJI("paint");
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
                }
            } else {
                Paint paint2 = this.LJLJJI;
                if (paint2 != null) {
                    paint2.setTextAlign(Paint.Align.LEFT);
                } else {
                    o.LJIJI("paint");
                    throw null;
                }
            }
        } else {
            Paint paint3 = this.LJLJJI;
            if (paint3 != null) {
                paint3.setTextAlign(Paint.Align.CENTER);
            } else {
                o.LJIJI("paint");
                throw null;
            }
        }
        this.LJLLLL = i;
        invalidate();
    }

    public final void setTextColor(int i) {
        this.LJLJJL = i;
        Paint paint = this.LJLJJI;
        if (paint != null) {
            paint.setColor(i);
            invalidate();
        } else {
            o.LJIJI("paint");
            throw null;
        }
    }

    public final void setTextSize(float f) {
        if (this.LJLJJLL == f) {
            return;
        }
        this.LJLJJLL = f;
        Paint paint = this.LJLJJI;
        if (paint != null) {
            paint.setTextSize(f);
            invalidate();
        } else {
            o.LJIJI("paint");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81212Vu4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = -1;
        this.LJLJI = -1.0f;
        this.LJLJLLL = new RectF();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        o.LJIIIIZZ(displayMetrics, "context.resources.displayMetrics");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bba, R.attr.bbb, R.attr.bbc, R.attr.bbd, R.attr.bbe, R.attr.bbf});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.WaveSideBar)");
        this.LJLLJ = obtainStyledAttributes.getBoolean(0, false);
        this.LJLJJL = obtainStyledAttributes.getColor(4, 161823);
        this.LJLJJLL = obtainStyledAttributes.getDimension(5, TypedValue.applyDimension(2, 14, displayMetrics));
        this.LJLJLJ = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 80, displayMetrics));
        this.LJLLL = obtainStyledAttributes.getInt(2, 0);
        this.LJLLLL = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.LJLIL = LJZ;
        Paint paint = new Paint();
        this.LJLJJI = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LJLJJI;
        if (paint2 != null) {
            paint2.setColor(this.LJLJJL);
            Paint paint3 = this.LJLJJI;
            if (paint3 != null) {
                paint3.setTextSize(this.LJLJJLL);
                Paint paint4 = this.LJLJJI;
                if (paint4 != null) {
                    paint4.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                    int i = this.LJLLLL;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            Paint paint5 = this.LJLJJI;
                            if (paint5 != null) {
                                paint5.setTextAlign(Paint.Align.RIGHT);
                                return;
                            } else {
                                o.LJIJI("paint");
                                throw null;
                            }
                        }
                        Paint paint6 = this.LJLJJI;
                        if (paint6 != null) {
                            paint6.setTextAlign(Paint.Align.LEFT);
                            return;
                        } else {
                            o.LJIJI("paint");
                            throw null;
                        }
                    }
                    Paint paint7 = this.LJLJJI;
                    if (paint7 != null) {
                        paint7.setTextAlign(Paint.Align.CENTER);
                        return;
                    } else {
                        o.LJIJI("paint");
                        throw null;
                    }
                }
                o.LJIJI("paint");
                throw null;
            }
            o.LJIJI("paint");
            throw null;
        }
        o.LJIJI("paint");
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float paddingRight;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        Paint paint = this.LJLJJI;
        if (paint != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            this.LJLJL = f;
            String[] strArr = this.LJLIL;
            this.LJLL = strArr.length * f;
            for (String str : strArr) {
                float f2 = this.LJLLI;
                Paint paint2 = this.LJLJJI;
                if (paint2 != null) {
                    this.LJLLI = Math.max(f2, paint2.measureText(str));
                } else {
                    o.LJIJI("paint");
                    throw null;
                }
            }
            if (this.LJLLL == 1) {
                paddingRight = 0.0f;
            } else {
                paddingRight = (size2 - this.LJLLI) - getPaddingRight();
            }
            float paddingLeft = this.LJLLL == 1 ? getPaddingLeft() + paddingRight + this.LJLLI : size2;
            float f3 = size / 2;
            float f4 = this.LJLL;
            float f5 = 2;
            float f6 = f3 - (f4 / f5);
            this.LJLJLLL.set(paddingRight, f6, paddingLeft, f4 + f6);
            float length = this.LJLIL.length;
            float f7 = this.LJLJL;
            float LIZIZ = C65232Piu.LIZIZ(length, f7, f5, f3);
            float f8 = fontMetrics.descent;
            float f9 = fontMetrics.ascent;
            this.LJLZ = (((f7 / f5) - ((f8 - f9) / f5)) + LIZIZ) - f9;
            return;
        }
        o.LJIJI("paint");
        throw null;
    }
}
