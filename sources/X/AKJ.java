package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKJ extends C45621qg {
    public final ViewGroup LLFII;
    public final A21 LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public int LLII;
    public final java.util.Map<Integer, View> LLIIII;

    public final View LJIJJLI(int i) {
        java.util.Map<Integer, View> map = this.LLIIII;
        Integer valueOf = Integer.valueOf(R.id.h42);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.h42);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJIFFI() {
        try {
            this.LLIFFJFJJ = true;
            C16880lQ.LJLLL(this, this.LLFII);
            InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LLFZ.LJIIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Integer.valueOf(this.LLII));
            }
        } catch (Exception unused) {
        }
    }

    public final void LJIL() {
        if (this.LLIFFJFJJ) {
            return;
        }
        ((AKF) LJIJJLI(R.id.h42)).LIZIZ(false);
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 8), 500L);
    }

    public final void LJJI() {
        ViewGroup.LayoutParams layoutParams;
        View findViewWithTag = this.LLFII.findViewWithTag(AKJ.class);
        if (findViewWithTag != null) {
            C16880lQ.LJLLL(findViewWithTag, this.LLFII);
        }
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(12);
            layoutParams = layoutParams2;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            layoutParams = layoutParams3;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams4.gravity = 80;
            layoutParams = layoutParams4;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setTag(AKJ.class);
        this.LLFII.addView(this, layoutParams);
    }

    @Override // android.view.View, android.view.ViewParent
    public final ViewGroup getParent() {
        return this.LLFII;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (motionEvent.getAction() == 0) {
                this.LLI = ((AKF) LJIJJLI(R.id.h42)).LIZLLL(rawX, rawY);
            }
        }
        if (!this.LLI) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKJ(ViewGroup viewGroup, A21 bundle, Context context) {
        super(context, null, 0);
        o.LJIIIZ(bundle, "bundle");
        this.LLIIII = new LinkedHashMap();
        this.LLFII = viewGroup;
        this.LLFZ = bundle;
        this.LLI = true;
        C16880lQ.LLLZIIL(R.layout.by, C16880lQ.LLZIL(getContext()), this);
        ((AKF) LJIJJLI(R.id.h42)).setDismiss(new AqS154S0100000_4(this, 6));
        ((AKF) LJIJJLI(R.id.h42)).LIZJ(bundle);
        BottomSheetBehavior from = BottomSheetBehavior.from(LJIJJLI(R.id.h42));
        o.LJIIIIZZ(from, "from(notice_layout)");
        from.setBottomSheetCallback(new AKL(this));
    }
}
