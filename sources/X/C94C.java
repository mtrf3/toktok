package X;

import Y.AObjectS47S0101000_2;
import Y.AObjectS50S0101000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.94C, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94C extends RelativeLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public AObjectS47S0101000_2 LJLJJI;
    public AObjectS50S0101000_5 LJLJJL;
    public final C71898SJq LJLJJLL;
    public final C71898SJq LJLJL;
    public final C62822Ol8 LJLJLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C94C(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C94C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final HomePageViewPagerAbility getHomePagerAbility() {
        return (HomePageViewPagerAbility) this.LJLJLJ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.LJLJI = false;
        }
        if (motionEvent.getAction() == 2) {
            float rawX = this.LJLIL - motionEvent.getRawX();
            if (Math.abs(rawX) > Math.abs(this.LJLILLLLZI - motionEvent.getRawY())) {
                HomePageViewPagerAbility homePagerAbility = getHomePagerAbility();
                if (homePagerAbility != null && homePagerAbility.gG(motionEvent, motionEvent.getRawX(), motionEvent.getRawY())) {
                    this.LJLJI = true;
                }
                if (C251659uD.LIZ() ? rawX >= 0.0f : rawX <= 0.0f) {
                    AObjectS47S0101000_2 aObjectS47S0101000_2 = this.LJLJJI;
                    if (aObjectS47S0101000_2 != null) {
                        aObjectS47S0101000_2.invoke();
                        return true;
                    }
                } else {
                    AObjectS50S0101000_5 aObjectS50S0101000_5 = this.LJLJJL;
                    if (aObjectS50S0101000_5 != null && !this.LJLJI) {
                        aObjectS50S0101000_5.invoke();
                        return true;
                    }
                }
            }
        }
        this.LJLIL = motionEvent.getRawX();
        this.LJLILLLLZI = motionEvent.getRawY();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C94C(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r5, r0)
            r3 = 0
            r4.<init>(r5, r6, r3)
            kotlin.jvm.internal.AqS154S0100000_4 r1 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 333(0x14d, float:4.67E-43)
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r4.LJLJLJ = r0
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r5)
            r0 = 2131559730(0x7f0d0532, float:1.8744812E38)
            X.C16880lQ.LLLZIIL(r0, r1, r4)
            r0 = 2131372402(0x7f0a2972, float:1.8364866E38)
            android.view.View r2 = r4.findViewById(r0)
            java.lang.String r0 = "findViewById<View>(R.id.old_full_screen)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r0 = 2131366934(0x7f0a1416, float:1.8353776E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.first_gradient)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.SJq r1 = (X.C71898SJq) r1
            r4.LJLJJLL = r1
            r0 = 2131375474(0x7f0a3572, float:1.8371097E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.second_gradient)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.SJq r1 = (X.C71898SJq) r1
            r4.LJLJL = r1
            boolean r0 = X.AnonymousClass843.LIZLLL()
            if (r0 == 0) goto L5d
            r0 = 8
            r2.setVisibility(r0)
        L5c:
            return
        L5d:
            r2.setVisibility(r3)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94C.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
