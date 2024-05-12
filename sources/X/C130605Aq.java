package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130605Aq extends View {
    public static final float LJLLJ = C134845Qy.LIZ(6.0f);
    public List<Integer> LJLIL;
    public final float LJLILLLLZI;
    public final Rect LJLJI;
    public float LJLJJI;
    public final Paint LJLJJL;
    public float LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJLLL;
    public Integer LJLL;
    public final float LJLLI;
    public Integer LJLLILLLL;

    public final InterfaceC88472Yns<Integer, C76800UCe> getOnBeatClickListener() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130605Aq(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = C61878OQg.INSTANCE;
        this.LJLILLLLZI = C134845Qy.LIZ(4.0f);
        this.LJLJI = new Rect();
        this.LJLJJI = C1300758p.LIZIZ();
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.FILL);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        LIZIZ.setColor(AnonymousClass636.LJIIIIZZ(R.attr.c6, context2));
        this.LJLJJL = LIZIZ;
        C134845Qy.LIZ(4.0f);
        this.LJLLI = LJLLJ;
    }

    public final Integer LIZ(int i) {
        Object next;
        float LIZ = C134845Qy.LIZ(10.0f) / this.LJLJJI;
        List<Integer> list = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            float intValue = num.intValue();
            float f = i;
            if (intValue >= f - LIZ && intValue <= f + LIZ) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int abs = Math.abs(((Number) next).intValue() - i);
                do {
                    Object next2 = it.next();
                    int abs2 = Math.abs(((Number) next2).intValue() - i);
                    if (abs > abs2) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        return (Integer) next;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (getLocalVisibleRect(this.LJLJI)) {
            canvas.clipRect(this.LJLJI);
            canvas.translate((-this.LJLJJLL) + LJLLJ, 0.0f);
            Iterator<Integer> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                float f = intValue * this.LJLJJI;
                if (intValue >= this.LJLJL && intValue <= this.LJLJLJ) {
                    Integer num = this.LJLLILLLL;
                    if (num == null || intValue != num.intValue()) {
                        canvas.drawCircle(f, getHeight() / 2.0f, this.LJLILLLLZI, this.LJLJJL);
                    } else {
                        canvas.drawCircle(f, getHeight() / 2.0f, this.LJLLI, this.LJLJJL);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.LJLL = null;
                }
            } else {
                Integer num = this.LJLL;
                if (num != null) {
                    int intValue = num.intValue();
                    InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJLLL;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Integer.valueOf(intValue));
                    }
                }
            }
        } else {
            this.LJLL = LIZ((int) ((event.getX() / this.LJLJJI) + this.LJLJL));
        }
        if (this.LJLL != null) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setBeats(List<Integer> beats) {
        o.LJIIIZ(beats, "beats");
        this.LJLIL = beats;
        invalidate();
    }

    public final void setOnBeatClickListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLJLLL = interfaceC88472Yns;
    }
}
