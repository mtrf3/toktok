package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Calendar;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.VqY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80994VqY extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public final Paint LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public Long LJLJJLL;
    public InterfaceC88472Yns<? super Long, C76800UCe> LJLJL;
    public AbstractC80990VqU LJLJLJ;

    public final long getCurrentTime() {
        Long l = this.LJLJJLL;
        if (l != null) {
            return l.longValue();
        }
        return this.LJLJJI;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)) / 2;
        float height = (getHeight() / 2) - LJJIIZ;
        canvas.drawLine(0.0f, height, getWidth(), height, this.LJLJI);
        float height2 = (getHeight() / 2) + LJJIIZ;
        canvas.drawLine(0.0f, height2, getWidth(), height2, this.LJLJI);
    }

    public final void setCurrentTime(long j) {
        int i = this.LJLIL;
        if (i == 3 || i == 4) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(11, calendar.getActualMinimum(11));
            calendar.set(12, calendar.getActualMinimum(12));
            this.LJLJJI = calendar.getTimeInMillis();
            calendar.set(11, calendar.getActualMaximum(11));
            calendar.set(12, calendar.getActualMaximum(12));
            this.LJLJJL = calendar.getTimeInMillis();
        }
        LIZ(-1, j);
    }

    public final void setGranularity(int i) {
        long j;
        this.LJLILLLLZI = i;
        Long l = this.LJLJJLL;
        if (l != null) {
            j = l.longValue();
        } else {
            j = this.LJLJJI;
        }
        LIZ(-1, j);
    }

    public final void setOnTimePickedListener(InterfaceC88472Yns<? super Long, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL = listener;
    }

    public final void setPickerVariant(int i) {
        AbstractC80990VqU c80998Vqc;
        this.LJLIL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            c80998Vqc = new C80998Vqc();
                        } else {
                            c80998Vqc = new C80997Vqb();
                        }
                    } else {
                        c80998Vqc = new C80996Vqa();
                    }
                } else {
                    c80998Vqc = new C80988VqS();
                }
            } else {
                c80998Vqc = new C80999Vqd();
            }
        } else {
            c80998Vqc = new C80998Vqc();
        }
        this.LJLJLJ = c80998Vqc;
        c80998Vqc.LIZIZ(this);
        setTouchDelegate(new TouchDelegate(this) { // from class: X.9wQ
            public final ViewGroup LIZ;
            public View LIZIZ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(new Rect(), this);
                o.LJIIIZ(this, "view");
                this.LIZ = this;
            }

            @Override // android.view.TouchDelegate
            public final boolean onTouchEvent(MotionEvent event) {
                Object next;
                o.LJIIIZ(event, "event");
                int x = (int) event.getX();
                int actionMasked = event.getActionMasked();
                View view = null;
                if (actionMasked != 0) {
                    if (actionMasked == 3) {
                        this.LIZIZ = null;
                    }
                } else {
                    C110564Vo c110564Vo = new C110564Vo(OJ4.LJJJJLL(OJ4.LJJJJ(C78924UyG.LIZLLL(this.LIZ), C9PG.LJLIL), new AqS94S0101000_4(x, new Rect(), 0)));
                    if (!c110564Vo.hasNext()) {
                        next = null;
                    } else {
                        next = c110564Vo.next();
                        if (c110564Vo.hasNext()) {
                            int intValue = ((Number) ((OSZ) next).getFirst()).intValue();
                            do {
                                Object next2 = c110564Vo.next();
                                int intValue2 = ((Number) ((OSZ) next2).getFirst()).intValue();
                                if (intValue > intValue2) {
                                    next = next2;
                                    intValue = intValue2;
                                }
                            } while (c110564Vo.hasNext());
                        }
                    }
                    OSZ osz = (OSZ) next;
                    if (osz != null) {
                        view = (View) osz.getSecond();
                    }
                    this.LIZIZ = view;
                }
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    event.offsetLocation((view2.getWidth() / 2.0f) - x, 0.0f);
                    return view2.dispatchTouchEvent(event);
                }
                return false;
            }
        });
        AbstractC80990VqU abstractC80990VqU = this.LJLJLJ;
        if (abstractC80990VqU != null) {
            abstractC80990VqU.LJIIJ(new C80995VqZ(this));
        } else {
            o.LJIJI("pickerTemplate");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80994VqY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.kz);
        a1.LJFF(context, "context");
        this.LJLJJI = Long.MIN_VALUE;
        this.LJLJJL = Long.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tp, R.attr.tq, R.attr.tr, R.attr.tv, R.attr.tw, R.attr.tx, R.attr.bst, R.attr.bsu}, R.attr.kz, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…lPicker, defStyleAttr, 0)");
        int color = obtainStyledAttributes.getColor(2, 0);
        this.LJLIL = obtainStyledAttributes.getInt(7, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getInt(6, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LJLJI = paint;
        paint.setAntiAlias(true);
        paint.setColor(color);
        setOrientation(0);
        setWillNotDraw(false);
        setPickerVariant(this.LJLIL);
    }

    public final void LIZ(int i, long j) {
        long j2 = this.LJLJJI;
        if (j2 == Long.MIN_VALUE && this.LJLJJL == Long.MAX_VALUE) {
            return;
        }
        long j3 = this.LJLJJL;
        if (j > j3) {
            j = j3;
        }
        if (j >= j2) {
            j2 = j;
        }
        this.LJLJJLL = Long.valueOf(j2);
        AbstractC80990VqU abstractC80990VqU = this.LJLJLJ;
        if (abstractC80990VqU != null) {
            abstractC80990VqU.LIZLLL(this.LJLJJI, this.LJLJJL, i, j2, this.LJLILLLLZI);
            Long l = this.LJLJJLL;
            if (l != null) {
                long longValue = l.longValue();
                int i2 = this.LJLILLLLZI;
                if (i2 == 1) {
                    AbstractC80990VqU abstractC80990VqU2 = this.LJLJLJ;
                    if (abstractC80990VqU2 != null) {
                        this.LJLJJLL = Long.valueOf(abstractC80990VqU2.LJI(i2, this.LJLJJI, this.LJLJJL, longValue));
                    } else {
                        o.LJIJI("pickerTemplate");
                        throw null;
                    }
                }
            }
            Long l2 = this.LJLJJLL;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns = this.LJLJL;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("pickerTemplate");
        throw null;
    }
}
