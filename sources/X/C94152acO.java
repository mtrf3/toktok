package X;

import Y.IDUListenerS265S0100000_42;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.acO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94152acO extends FrameLayout implements InterfaceC93955aZD {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final C16230kN LJLL;
    public InterfaceC93954aZC LJLLI;
    public final C93607aTb LJLLILLLL;
    public float LJLLJ;

    public final void LIZJ() {
        ValueAnimator animator = ValueAnimator.ofInt(this.LJLLILLLL.LIZ().getLayoutParams().height, this.LJLJJL);
        o.LJIIIIZZ(animator, "animator");
        animator.setDuration(100L);
        animator.addUpdateListener(new IDUListenerS265S0100000_42(this, 2));
        animator.addListener(new C94150acM(this));
        animator.start();
    }

    public boolean LJI(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    public int getDrawerViewBgRes() {
        return R.drawable.diq;
    }

    @Override // X.InterfaceC93955aZD
    public final boolean LIZIZ() {
        InterfaceC93954aZC interfaceC93954aZC = this.LJLLI;
        if (interfaceC93954aZC != null) {
            return interfaceC93954aZC.LIZIZ();
        }
        return false;
    }

    public final boolean LIZLLL() {
        InterfaceC93954aZC interfaceC93954aZC = this.LJLLI;
        if (interfaceC93954aZC == null || interfaceC93954aZC.getBackStackCount() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
    
        LIZJ();
        r7.LJLIL = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if ((!(r7 instanceof X.C94421agj)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        LIZJ();
        r7.LJLIL = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r5.getLayoutParams().height < (r7.LJLJJL - r7.LJLJJI)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (r5.getLayoutParams().height < (r7.LJLJJL - r7.LJLJJI)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r7 = this;
            X.aTb r0 = r7.LJLLILLLL
            android.widget.LinearLayout r5 = r0.LIZ()
            boolean r0 = r7.LJLILLLLZI
            r3 = 0
            if (r0 == 0) goto L50
            int r0 = r7.LJLIL
            r6 = 2
            r4 = 1
            if (r0 != 0) goto L63
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LJLJJL
            int r0 = r7.LJLJJI
            int r1 = r1 + r0
            if (r2 <= r1) goto L55
        L1e:
            int[] r1 = new int[r6]
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r0 = r0.height
            r1[r3] = r0
            int r0 = r7.LJLJI
            r1[r4] = r0
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r1)
            java.lang.String r0 = "extentAnimator"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r0 = 100
            r2.setDuration(r0)
            Y.IDUListenerS265S0100000_42 r1 = new Y.IDUListenerS265S0100000_42
            r0 = 3
            r1.<init>(r5, r0)
            r2.addUpdateListener(r1)
            X.acN r0 = new X.acN
            r0.<init>(r7)
            r2.addListener(r0)
            r2.start()
            r7.LJLIL = r4
        L50:
            r7.LJLILLLLZI = r3
            r7.LJLJLJ = r3
            return
        L55:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LJLJJL
            int r0 = r7.LJLJJI
            int r1 = r1 - r0
            if (r2 >= r1) goto L8d
            goto L7d
        L63:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LJLJI
            int r0 = r7.LJLJJI
            int r1 = r1 - r0
            if (r2 >= r1) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LJLJJL
            int r0 = r7.LJLJJI
            int r1 = r1 - r0
            if (r2 >= r1) goto L8d
        L7d:
            boolean r0 = r7 instanceof X.C94421agj
            r0 = r0 ^ 1
            if (r0 == 0) goto L87
            r7.dismiss()
            goto L50
        L87:
            r7.LIZJ()
            r7.LJLIL = r3
            goto L50
        L8d:
            r7.LIZJ()
            r7.LJLIL = r3
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94152acO.LJ():void");
    }

    @Override // X.InterfaceC93955aZD
    public final void dismiss() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC93955aZD
    public int getBackStackCount() {
        InterfaceC93954aZC interfaceC93954aZC = this.LJLLI;
        if (interfaceC93954aZC != null) {
            return interfaceC93954aZC.getBackStackCount();
        }
        return 0;
    }

    @Override // X.InterfaceC93955aZD
    public final boolean goBack() {
        InterfaceC93954aZC interfaceC93954aZC = this.LJLLI;
        if (interfaceC93954aZC != null) {
            interfaceC93954aZC.LJI();
            return true;
        }
        return true;
    }

    public final InterfaceC65784Pro<C76800UCe> getDismissListener() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC93955aZD
    public final void LIZ(Bundle bundle) {
        InterfaceC93954aZC interfaceC93954aZC = this.LJLLI;
        if (interfaceC93954aZC != null) {
            FrameLayout frameLayout = this.LJLLILLLL.LIZJ;
            if (frameLayout != null) {
                interfaceC93954aZC.LIZJ(bundle, frameLayout);
            } else {
                o.LJIJI("contentView");
                throw null;
            }
        }
    }

    public View LJFF(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        View view = new View(parent.getContext());
        view.setLayoutParams(C93902aYM.LIZJ(parent, C93742aVm.LIZIZ(32), C93742aVm.LIZIZ(3), 0, 0, null, null, Integer.valueOf(C93742aVm.LIZIZ(5)), Integer.valueOf(C93742aVm.LIZIZ(10)), null, null, 828));
        C94612ajo attrBlock = C94612ajo.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(view);
        return view;
    }

    public final void LJII(Bundle bundle) {
        InterfaceC93954aZC interfaceC93954aZC = this.LJLLI;
        if (interfaceC93954aZC != null) {
            FrameLayout frameLayout = this.LJLLILLLL.LIZJ;
            if (frameLayout != null) {
                interfaceC93954aZC.LIZ(bundle, frameLayout);
            } else {
                o.LJIJI("contentView");
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getPointerCount() > 1) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        LinearLayout LIZ = this.LJLLILLLL.LIZ();
        if (ev.getY() >= LIZ.getTop() && ev.getY() < LIZ.getTop() + this.LJLJL) {
            if (ev.getAction() == 0) {
                this.LJLLJ = ev.getY();
                this.LJLL.LIZ(ev);
                return super.onInterceptTouchEvent(ev);
            }
            if (ev.getAction() == 2 && Math.abs(ev.getY() - this.LJLLJ) > 2) {
                return true;
            }
            this.LJLLJ = ev.getY();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 1) {
            LJ();
        }
        return this.LJLL.LIZ(event);
    }

    public final void setAdapter(InterfaceC93954aZC adapter) {
        o.LJIIIZ(adapter, "adapter");
        adapter.LIZLLL(this);
        this.LJLLI = adapter;
    }

    public void setCriticalHeight(int i) {
        this.LJLJJI = i;
    }

    public void setCurrentHeight(int i) {
        this.LJLJJLL = i;
        ViewGroup.LayoutParams layoutParams = this.LJLLILLLL.LIZ().getLayoutParams();
        layoutParams.height = this.LJLJJLL;
        this.LJLLILLLL.LIZ().setLayoutParams(layoutParams);
    }

    public final void setDismissListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJLLL = interfaceC65784Pro;
    }

    public void setMaxHeight(int i) {
        this.LJLJI = i;
        if (i < this.LJLJJLL) {
            setCurrentHeight(i);
        }
    }

    public void setMinHeight(int i) {
        this.LJLJJL = i;
        if (i > this.LJLJJLL) {
            setCurrentHeight(i);
        }
    }

    public void setToggleAreaHeight(int i) {
        this.LJLJL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94152acO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLJI = (KL2.LJIIIZ(context) - KL2.LJIIL(context)) - ((int) KL2.LIZJ(context, 60.0f));
        this.LJLJJI = (int) KL2.LIZJ(context, 40.0f);
        int LIZJ = (int) KL2.LIZJ(context, 406.0f);
        this.LJLJJL = LIZJ;
        this.LJLJJLL = LIZJ;
        this.LJLJL = (int) KL2.LIZJ(context, 55.0f);
        this.LJLL = new C16230kN(context, new GestureDetectorOnGestureListenerC93609aTd(this));
        C93607aTb c93607aTb = new C93607aTb(this);
        this.LJLLILLLL = c93607aTb;
        removeAllViews();
        View view = new View(context);
        view.setLayoutParams(C93902aYM.LIZIZ(this, 0, 0, 0, 0, null, null, 511));
        new IDqS419S0100000_42(c93607aTb, 111).invoke(view);
        C93902aYM.LIZ(view, this);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(C93902aYM.LIZIZ(this, 0, 0, 0, 0, null, 80, 255));
        new IDqS175S0200000_42(c93607aTb, context, 16).invoke(linearLayout);
        C93902aYM.LIZ(linearLayout, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.LJLJJLL);
        layoutParams.gravity = 80;
        c93607aTb.LIZ().setLayoutParams(layoutParams);
    }
}
