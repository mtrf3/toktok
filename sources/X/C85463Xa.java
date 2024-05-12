package X;

import Y.IDHandlerS14S0100000_1;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import n.b;

/* renamed from: X.3Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85463Xa extends RelativeLayout {
    public String LJLIL;
    public String LJLILLLLZI;
    public View.OnTouchListener LJLJI;
    public final C77869UhF LJLJJI;
    public final IDHandlerS14S0100000_1 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85463Xa(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = "";
        this.LJLILLLLZI = "";
        setBackgroundColor(b.LIZIZ(R.attr.ee, context));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        C77869UhF c77869UhF = new C77869UhF(context);
        c77869UhF.setId(R.id.hq3);
        this.LJLJJI = c77869UhF;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(210)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(210)));
        C45804HyK.LJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), this);
        linearLayout.addView(c77869UhF, marginLayoutParams);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        T5S t5s = new T5S();
        t5s.LIZ(33);
        tuxTextView.LJJIZ(22.0f, 28, t5s.getTypeface(), 0.02f);
        tuxTextView.setTextColorRes(R.attr.dj);
        tuxTextView.setText(R.string.dff);
        tuxTextView.setGravity(17);
        linearLayout.addView(tuxTextView, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
        addView(linearLayout, layoutParams);
        this.LJLJJL = new IDHandlerS14S0100000_1(this, C16880lQ.LLJJJJ(), 4);
    }

    public final void LIZIZ(boolean z) {
        this.LJLJJL.removeMessages(1);
        this.LJLJJI.clearAnimation();
        if (getVisibility() != 8) {
            setVisibility(8);
            LIZ(false, z);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 6) {
                LIZIZ(false);
            }
        } else {
            this.LJLJJL.removeMessages(1);
            setAlpha(0.0f);
        }
        View.OnTouchListener onTouchListener = this.LJLJI;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return true;
    }

    public final void setTouchDelegateListener(View.OnTouchListener l) {
        o.LJIIIZ(l, "l");
        this.LJLJI = l;
    }

    public final void LIZ(boolean z, boolean z2) {
        String str;
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLIL);
        c188727au.LJIIIZ("group_id", this.LJLILLLLZI);
        if (z) {
            str = "show";
        } else {
            str = "disappear";
        }
        c188727au.LJIIIZ("action_type", str);
        if (!z) {
            if (z2) {
                str2 = "auto";
            } else {
                str2 = "click";
            }
            c188727au.LJI("disappear_method", str2);
        }
        FMX.LJIIL("pinch_to_clear_guide_show", c188727au.LIZ);
    }
}
