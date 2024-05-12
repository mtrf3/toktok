package X;

import Y.AUListenerS2S0100001_1;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS34S0210000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC112504bG extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int LLFFF = 0;
    public final C62822Ol8 LJLIL;
    public final C119574mf LJLILLLLZI;
    public final C119574mf LJLJI;
    public final C72433Sbl LJLJJI;
    public final C119574mf LJLJJL;
    public final TuxIconView LJLJJLL;
    public final TuxTextView LJLJL;
    public final TuxIconView LJLJLJ;
    public final TuxIconView LJLJLLL;
    public final View LJLL;
    public final C72433Sbl LJLLI;
    public final TextView LJLLILLLL;
    public final TextView LJLLJ;
    public final float LJLLL;
    public final float LJLLLL;
    public final float LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJZI;
    public final int LJZL;
    public final Scroller LL;
    public final int LLD;
    public final GestureDetector LLF;
    public int LLFF;

    private final View getPushRootView() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-pushRootView>(...)");
        return (View) value;
    }

    public final void LIZLLL() {
        this.LJLLI.setVisibility(8);
        this.LJLJJLL.setVisibility(8);
        this.LJLJL.setMaxWidth((int) (((C81184Vtc.LJ(getContext()) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))) * 0.4d) - C7MY.LIZIZ(32)));
        this.LJLJL.setVisibility(0);
    }

    public final void LIZJ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getPushRootView(), "translationY", (-KL2.LIZJ(getContext(), 80.0f)) - this.LJZL, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(\n            pus…sBarHeight, 0f,\n        )");
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.LL.computeScrollOffset()) {
            scrollTo(this.LL.getCurrX(), this.LL.getCurrY());
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC112504bG(C25600zU c25600zU) {
        super(c25600zU, null, 0);
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS148S0200000_1(c25600zU, this, 64));
        this.LJLILLLLZI = (C119574mf) getPushRootView().findViewById(R.id.acf);
        this.LJLJI = (C119574mf) getPushRootView().findViewById(R.id.a96);
        this.LJLJJI = (C72433Sbl) getPushRootView().findViewById(R.id.a98);
        this.LJLJJL = (C119574mf) getPushRootView().findViewById(R.id.a97);
        this.LJLJJLL = (TuxIconView) getPushRootView().findViewById(R.id.axf);
        View findViewById = getPushRootView().findViewById(R.id.ayg);
        o.LJIIIIZZ(findViewById, "pushRootView.findViewByI…uxButton>(R.id.btn_reply)");
        this.LJLJL = (TuxTextView) findViewById;
        View findViewById2 = getPushRootView().findViewById(R.id.hat);
        o.LJII(findViewById2, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
        this.LJLJLJ = (TuxIconView) findViewById2;
        View findViewById3 = getPushRootView().findViewById(R.id.edq);
        o.LJII(findViewById3, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
        this.LJLJLLL = (TuxIconView) findViewById3;
        View findViewById4 = getPushRootView().findViewById(R.id.ayh);
        C16880lQ.LJIIJ(this, findViewById4);
        this.LJLL = findViewById4;
        this.LJLLI = (C72433Sbl) getPushRootView().findViewById(R.id.axn);
        this.LJLLILLLL = (TextView) getPushRootView().findViewById(R.id.gw7);
        this.LJLLJ = (TextView) getPushRootView().findViewById(R.id.c84);
        this.LJLLL = KL2.LIZJ(c25600zU, 25.0f);
        this.LJLLLL = KL2.LIZJ(c25600zU, 80.0f);
        this.LJLLLLLL = KL2.LIZJ(c25600zU, 160.0f);
        this.LJZ = -1;
        this.LJZL = C63081OpJ.LJJJJLI(c25600zU);
        this.LL = new Scroller(c25600zU);
        this.LLD = R.raw.icon_color_default_avatar;
        this.LLF = new GestureDetector(c25600zU, new SJC() { // from class: X.4bH
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = ViewOnClickListenerC112504bG.this.LJZI;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(0);
                    return true;
                }
                return true;
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (motionEvent == null || motionEvent2 == null) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                float x = motionEvent.getX() - motionEvent2.getX();
                if (motionEvent.getY() > motionEvent2.getY()) {
                    float y = motionEvent.getY() - motionEvent2.getY();
                    if (x == 0.0f) {
                        x = 1.0f;
                    }
                    if (y / Math.abs(x) > 0.65f) {
                        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = ViewOnClickListenerC112504bG.this.LJZI;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(3);
                        }
                        return true;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r6 != 12) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C112454bB r15) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC112504bG.LIZ(X.4bB):void");
    }

    public final void LIZIZ(AqS34S0210000_1 aqS34S0210000_1) {
        float f = (-getMeasuredHeight()) - this.LJZL;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getPushRootView(), "translationY", 0.0f, f);
        o.LJIIIIZZ(ofFloat, "ofFloat(\n            pus…    0f, height,\n        )");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS2S0100001_1(f, aqS34S0210000_1, 1));
        ofFloat.start();
    }

    public final void LJ(int i) {
        this.LLFF = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            return;
                    }
                } else {
                    LJFF((int) this.LJLLLLLL);
                    return;
                }
            }
            LJFF((int) this.LJLLLL);
            return;
        }
        LJFF((int) this.LJLLLL);
    }

    public final void LJFF(int i) {
        ViewGroup.LayoutParams layoutParams = getPushRootView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i);
        }
        layoutParams.height = i;
        getPushRootView().setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns;
        if (o.LJ(view, this.LJLL) && !C6ZT.LIZ(view) && (interfaceC88472Yns = this.LJZI) != null) {
            interfaceC88472Yns.invoke(1);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && !this.LLF.onTouchEvent(motionEvent) && this.LLFF == 0) {
            int action = motionEvent.getAction();
            int i = 0;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.LJZ) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.LJZ = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else {
                    int i2 = this.LJZ;
                    if (i2 == -1 || motionEvent.findPointerIndex(i2) < 0) {
                        return false;
                    }
                    if (Math.min(motionEvent.getRawY() - 0.0f, this.LJLLL) > this.LJLLL / 4 && !this.LJLZ) {
                        LJFF((int) this.LJLLLLLL);
                        scrollBy(0, -((int) this.LJLLL));
                        this.LJLZ = true;
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.LJZ) < 0) {
                return false;
            }
            if (this.LJLZ) {
                this.LJLZ = false;
                int i3 = -getScrollY();
                this.LL.startScroll(0, i3, 0, -i3, 300);
                invalidate();
                this.LJZ = -1;
                LJ(2);
            }
            this.LJZ = -1;
        }
        return true;
    }

    public final void setActionListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJZI = interfaceC88472Yns;
    }
}
