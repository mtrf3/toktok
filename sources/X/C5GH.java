package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5GH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GH extends LinearLayout {
    public Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Paint getCirclePaint() {
        return this.LJLIL;
    }

    public final int getTextFont() {
        return this.LJLJJL;
    }

    public C5GH(Context context) {
        super(context, null, 0);
        int i;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ao4, this, true);
        setBackground(C04270Et.LIZIZ(context, R.drawable.aoa));
        this.LJLJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        this.LJLJJI = C7MY.LIZIZ(5);
        this.LJLJJL = 92;
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setDither(true);
        Paint paint2 = this.LJLIL;
        if (paint2 != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                i = R.attr.ck;
            } else {
                i = R.attr.cl;
            }
            paint2.setColor(AnonymousClass636.LJIIIIZZ(i, context));
        }
        Paint paint3 = this.LJLIL;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
        }
        Paint paint4 = new Paint(1);
        this.LJLILLLLZI = paint4;
        paint4.setDither(true);
        Integer LJI = C79045V0n.LJI(R.attr.eb, context);
        paint4.setColor(LJI != null ? LJI.intValue() : 0);
        paint4.setAlpha(26);
        paint4.setStyle(Paint.Style.STROKE);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int i = this.LJLJJI;
        float height = (float) ((getHeight() / 2.0d) - (i / 2.0d));
        Paint paint = this.LJLIL;
        if (paint != null) {
            int i2 = this.LJLJI;
            canvas.drawOval(-(i2 / 2), height, i2 / 2, height + i, paint);
        }
        Paint paint2 = this.LJLIL;
        if (paint2 != null) {
            canvas.drawOval(getWidth() - (this.LJLJI / 2), height, (this.LJLJI / 2) + getWidth(), height + this.LJLJJI, paint2);
        }
        Paint paint3 = this.LJLILLLLZI;
        if (paint3 != null) {
            int i3 = this.LJLJI;
            canvas.drawArc(-(i3 / 2), height, i3 / 2, height + this.LJLJJI, 0.0f, 360.0f, false, paint3);
        }
        Paint paint4 = this.LJLILLLLZI;
        if (paint4 != null) {
            canvas.drawArc(getWidth() - (this.LJLJI / 2), height, (this.LJLJI / 2) + getWidth(), height + this.LJLJJI, 0.0f, 360.0f, false, paint4);
        }
    }

    public final void setCirclePaint(Paint paint) {
        this.LJLIL = paint;
    }

    public final void setTagText(String text) {
        int i;
        o.LJIIIZ(text, "text");
        ((ImageView) LIZ(R.id.l00)).setVisibility(8);
        ((TextView) LIZ(R.id.l0f)).setText(text);
        TextView textView = (TextView) LIZ(R.id.l0f);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.eb, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        textView.setTextColor(i);
        View tag_text = LIZ(R.id.l0f);
        o.LJIIIIZZ(tag_text, "tag_text");
        C26338AVi.LJI(tag_text, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), AnonymousClass391.LIZJ(1), AnonymousClass391.LIZJ(6), AnonymousClass391.LIZJ(1), false, 16);
    }

    public final void setTextFont(int i) {
        this.LJLJJL = i;
    }
}
