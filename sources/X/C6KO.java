package X;

import Y.ARunnableS0S0100001_2;
import Y.IDTListenerS112S0100000_2;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.6KO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KO extends RelativeLayout implements C5T8 {
    public final ImageView LJLIL;
    public final C6KP LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public C6KR LJLL;
    public final C6KQ LJLLI;

    @Override // X.C5T8
    public final void LIZIZ() {
        this.LJLILLLLZI.invalidate();
    }

    @Override // X.C5T8
    public final Point LIZJ() {
        if (this.LJLILLLLZI.getMStack().empty()) {
            return null;
        }
        Point pop = this.LJLILLLLZI.getMStack().pop();
        LIZIZ();
        return pop;
    }

    public final void LJI() {
        this.LJLJJL = this.LJLJI;
        this.LJLJJLL = getWidth() - this.LJLJI;
        this.LJLJL = this.LJLJJL - (this.LJLIL.getWidth() / 2);
        this.LJLJLJ = this.LJLJJLL - (this.LJLIL.getWidth() / 2);
    }

    @Override // X.C5T8
    public Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.LJLILLLLZI.getMStack());
        return stack;
    }

    @Override // X.C5T8
    public final Point LIZLLL(int i) {
        Point push = this.LJLILLLLZI.getMStack().push(new Point(i, i, System.currentTimeMillis()));
        o.LJIIIIZZ(push, "seekBar.mStack.push(Poin…tem.currentTimeMillis()))");
        return push;
    }

    @Override // X.C5T8
    public final int LJ(int i) {
        if (i >= this.LJLJLLL - 1) {
            return i;
        }
        for (Point point : this.LJLILLLLZI.getMStack()) {
            if (i >= point.getX() && i < point.getY()) {
                return point.getX();
            }
        }
        return -1;
    }

    public final void LJIIIIZZ(int i) {
        if (i < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (C173636rf.LIZIZ(getContext())) {
            int i2 = this.LJLJL;
            if (i < i2) {
                i = i2;
            }
            int i3 = this.LJLJLJ;
            if (i > i3) {
                i = i3;
            }
            layoutParams2.setMarginEnd(i);
        } else {
            int i4 = this.LJLJL;
            if (i < i4) {
                i = i4;
            }
            int i5 = this.LJLJLJ;
            if (i > i5) {
                i = i5;
            }
            layoutParams2.leftMargin = i;
        }
        this.LJLIL.setLayoutParams(layoutParams2);
    }

    @Override // X.C5T8
    public final void LJJIIJ(float f) {
        post(new ARunnableS0S0100001_2(this, f, 1));
    }

    @Override // X.C5T8
    public void setStack(Stack<Point> s) {
        o.LJIIIZ(s, "s");
        this.LJLILLLLZI.getMStack().clear();
        if (!C79004UzY.LJJIFFI(s)) {
            this.LJLILLLLZI.getMStack().addAll(s);
        }
        LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6KO(ActivityC45651qj activityC45651qj, C6KQ recordingStateListener) {
        super(activityC45651qj);
        o.LJIIIZ(recordingStateListener, "recordingStateListener");
        new LinkedHashMap();
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = 1;
        this.LJLIL = new ImageView(activityC45651qj);
        this.LJLILLLLZI = new C6KP(activityC45651qj);
        this.LJLLI = recordingStateListener;
    }

    @Override // X.C5T8
    public final int LIZ(int i, Point point) {
        int i2;
        if (point != null) {
            i2 = point.getX();
        } else {
            i2 = i;
        }
        for (Point point2 : this.LJLILLLLZI.getMStack()) {
            if (point2.getX() >= i2 && i >= point2.getX() && i <= point2.getY() && !o.LJ(point2, point)) {
                return point2.getX();
            }
        }
        return -1;
    }

    public final void LJII(float f, View view, boolean z) {
        if (this.LJLLI.isSceneRecording()) {
            return;
        }
        LJI();
        int i = (int) f;
        int i2 = this.LJLJL;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = this.LJLJLJ;
        if (i2 > i3) {
            i2 = i3;
        }
        LJIIIIZZ(i2);
        int i4 = this.LJLJL;
        if (i < i4) {
            i = i4;
        }
        int i5 = this.LJLJLJ;
        if (i > i5) {
            i = i5;
        }
        float width = (((view.getWidth() / 2) + i) - this.LJLJI) / (this.LJLJJLL - this.LJLJJL);
        if (width > 0.99d) {
            width = 1.0f;
        }
        if (width < 0.01d) {
            width = 0.0f;
        }
        if (C173636rf.LIZIZ(getContext())) {
            width = 1 - width;
        }
        C6KR c6kr = this.LJLL;
        if (c6kr != null) {
            c6kr.LIZ(width, z);
        }
    }

    public final void LJFF(int i, int i2, int i3, int i4, C6KR c6kr) {
        this.LJLJI = i;
        this.LJLJJI = i3 * 5;
        this.LJLJLLL = i4;
        this.LJLL = c6kr;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        C6KP c6kp = this.LJLILLLLZI;
        int parseColor = ColorProtector.parseColor("#ccfe2c55");
        c6kp.getClass();
        c6kp.LJLILLLLZI.setColor(parseColor);
        c6kp.LJLILLLLZI.setStyle(Paint.Style.FILL);
        c6kp.LJLJI = i4;
        c6kp.LJLJJI = KL2.LIZJ(c6kp.getContext(), 0.0f);
        addView(this.LJLILLLLZI, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.LJLJJI, -1);
        if (C173636rf.LIZIZ(getContext())) {
            layoutParams2.addRule(21);
            layoutParams2.setMarginEnd((getWidth() - i) - (this.LJLJJI / 2));
        } else {
            layoutParams2.leftMargin = i - (this.LJLJJI / 2);
        }
        this.LJLIL.setImageDrawable(C78127UlP.LIZJ(0, -1, 1, (int) KL2.LIZJ(getContext(), 2.0f)));
        int i5 = (int) (this.LJLJJI * 0.4f);
        this.LJLIL.setPadding(i5, 0, i5, 0);
        addView(this.LJLIL, layoutParams2);
        this.LJLIL.setOnTouchListener(new IDTListenerS112S0100000_2(this, 8));
    }
}
