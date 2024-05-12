package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MM5 extends LinearLayout {
    public final C136775Yj LJLIL;
    public final TuxTextView LJLILLLLZI;
    public MM6 LJLJI;
    public final int[] LJLJJI;
    public final int[] LJLJJL;
    public boolean LJLJJLL;

    public final boolean getTabSelected() {
        return this.LJLJJLL;
    }

    public final MM6 getTabType() {
        return this.LJLJI;
    }

    public final MM6 getType() {
        return this.LJLJI;
    }

    public final void setTabSelected(boolean z) {
        this.LJLJJLL = z;
        int[] iArr = this.LJLJJI;
        int i = iArr[0];
        int[] iArr2 = this.LJLJJL;
        int i2 = iArr2[0];
        if (this.LJLJI != MM6.REQUESTS && z) {
            i = iArr[1];
            i2 = iArr2[1];
        }
        this.LJLILLLLZI.setTextColor(i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C7MY.LIZIZ(8));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        setBackground(gradientDrawable);
    }

    public final void setType(MM6 mm6) {
        o.LJIIIZ(mm6, "<set-?>");
        this.LJLJI = mm6;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measureText = this.LJLILLLLZI.getPaint().measureText(this.LJLILLLLZI.getText().toString()) + C7MY.LIZIZ(24);
        C136775Yj c136775Yj = this.LJLIL;
        int i3 = 0;
        if (c136775Yj != null && c136775Yj.getVisibility() == 0) {
            i3 = C7MY.LIZIZ(12);
        }
        float f = measureText + i3;
        int measuredWidth = getMeasuredWidth();
        int i4 = (int) f;
        if (measuredWidth < i4) {
            measuredWidth = i4;
        }
        setMeasuredDimension(measuredWidth, View.MeasureSpec.getSize(i2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, X.5Yj] */
    public MM5(Context context, MM6 tabBarType, MMB mmb) {
        super(context);
        o.LJIIIZ(tabBarType, "tabBarType");
        new LinkedHashMap();
        this.LJLJJI = new int[]{C56204M4a.LIZ(R.attr.go), C56204M4a.LIZ(R.attr.c8)};
        this.LJLJJL = new int[]{C56204M4a.LIZ(R.attr.cf), C56204M4a.LIZ(R.attr.c7)};
        this.LJLJI = tabBarType;
        setOrientation(0);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(33));
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        setLayoutParams(layoutParams);
        C26338AVi.LJIIIZ(this, C1FJ.LIZIZ(12), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, 16);
        if (tabBarType.getShowDot()) {
            ?? r0 = new View(context) { // from class: X.5Yj
                public final Paint LJLIL;

                {
                    new LinkedHashMap();
                    Paint paint = new Paint();
                    this.LJLIL = paint;
                    paint.setColor(C56204M4a.LIZ(R.attr.c8));
                    paint.setStyle(Paint.Style.FILL);
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    if (canvas != null) {
                        canvas.drawCircle(getWidth() / 2, getHeight() / 2, C32151Nz.LJIIZILJ(4), this.LJLIL);
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 1073741824), View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 1073741824));
                }
            };
            r0.setVisibility(8);
            this.LJLIL = r0;
            addView(r0);
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        if (tabBarType.getShowDot()) {
            layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        }
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setText(tabBarType.getTitleStr());
        tuxTextView.setTuxFont(62);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        this.LJLILLLLZI = tuxTextView;
        addView(tuxTextView);
        setTabSelected(false);
        C56204M4a.LJFF(this, new AqS156S0200000_9(this, mmb, 101));
    }
}
