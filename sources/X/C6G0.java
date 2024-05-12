package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6G0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6G0 extends FrameLayout {
    public InterfaceC88472Yns<? super C157416Ft, C76800UCe> LJLIL;
    public FrameLayout LJLILLLLZI;
    public TuxTextView LJLJI;
    public C157416Ft LJLJJI;
    public FrameLayout LJLJJL;
    public final AqS152S0100000_2 LJLJJLL;
    public volatile int LJLJL;
    public C6G2 LJLJLJ;
    public C6G2 LJLJLLL;
    public C6GA LJLL;
    public C6G5 LJLLI;

    public final void setMobHelper(C157436Fv mobHelper) {
        o.LJIIIZ(mobHelper, "mobHelper");
    }

    public final InterfaceC88472Yns<C157416Ft, C76800UCe> getOnCompleteListener() {
        return this.LJLIL;
    }

    public final void setOnCompleteListener(InterfaceC88472Yns<? super C157416Ft, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6G0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = new AqS152S0100000_2(this, 6);
        this.LJLJLJ = new C6G2(0.0f, 0.0f, 63);
        this.LJLJLLL = new C6G2(0.0f, 0.0f, 63);
        this.LJLLI = C6G9.LIZ;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context2));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bls, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) LLLLIILL;
        C6FB LIZIZ = AnonymousClass668.LIZIZ();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = LIZIZ.LIZ();
        this.LJLILLLLZI = frameLayout;
        addView(frameLayout);
        FrameLayout frameLayout2 = this.LJLILLLLZI;
        if (frameLayout2 != null) {
            View findViewById = frameLayout2.findViewById(R.id.m_m);
            o.LJIIIIZZ(findViewById, "rootViw.findViewById(R.i…yout_qa_sticker_complete)");
            this.LJLJI = (TuxTextView) findViewById;
            setVisibility(4);
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(this, 8));
                setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 9)));
                return;
            } else {
                o.LJIJI("done");
                throw null;
            }
        }
        o.LJIJI("rootViw");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C157416Ft r34, X.C6G2 r35) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6G0.LIZ(X.6Ft, X.6G2):void");
    }
}
