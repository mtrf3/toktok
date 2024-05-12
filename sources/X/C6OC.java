package X;

import Y.ARunnableS13S0300000_2;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OC extends C6O6 {
    public final ViewGroup LIZIZ;
    public final C6OA LIZJ;
    public final C62822Ol8 LIZLLL;
    public boolean LJ;
    public final View LJFF;
    public final View LJI;
    public final C71799SFv LJII;
    public final View LJIIIIZZ;
    public final TuxTextView LJIIIZ;

    public final void LIZJ() {
        LIZLLL(true);
        if (this.LJIIIIZZ.getLayoutParams() != null) {
            this.LJIIIIZZ.getLayoutParams().width = C17N.LJIILL(10.0d);
            View view = this.LJIIIIZZ;
            view.setLayoutParams(view.getLayoutParams());
        }
        this.LJIIIIZZ.setVisibility(4);
        LJ(false);
        if (this.LJIIIZ == null) {
            return;
        }
        if (TextUtils.isEmpty(null)) {
            this.LJIIIZ.setText(R.string.e46);
        } else {
            this.LJIIIZ.setText((CharSequence) null);
        }
    }

    public final void LIZIZ(boolean z) {
        float f;
        AnonymousClass635 LJIIIIZZ;
        View view = this.LJFF;
        if (view != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view.setAlpha(f);
        }
        C6OE c6oe = this.LIZJ.LIZLLL;
        if (c6oe != null && (LJIIIIZZ = c6oe.LJIIIIZZ()) != null && LJIIIIZZ.LJIJI) {
            this.LJ = z;
        } else {
            View view2 = this.LJI;
            if (view2 != null) {
                view2.setClickable(z);
            }
        }
        this.LJIIIIZZ.setClickable(z);
    }

    public final void LIZLLL(boolean z) {
        int i;
        if (this.LJII.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.LJII.getLayoutParams();
            C62822Ol8 c62822Ol8 = C88517Yob.LJFF;
            layoutParams.height = ((Number) c62822Ol8.getValue()).intValue();
            this.LJII.getLayoutParams().width = ((Number) c62822Ol8.getValue()).intValue();
            C71799SFv c71799SFv = this.LJII;
            c71799SFv.setLayoutParams(c71799SFv.getLayoutParams());
        }
        C71799SFv c71799SFv2 = this.LJII;
        if (z) {
            i = R.drawable.dcr;
        } else {
            i = R.drawable.dcq;
        }
        C71799SFv.LJIIJ(c71799SFv2, Integer.valueOf(i), null, false, null, 126);
    }

    public final void LJ(boolean z) {
        V8L v8l;
        if (z) {
            if (this.LJII.getHierarchy() == null || (v8l = this.LJII.getHierarchy().LIZJ) == null) {
                v8l = new V8L();
            }
            v8l.LIZLLL(C17N.LJIILL(1.0d));
            v8l.LJFF = -1;
            if (this.LJII.getHierarchy() != null) {
                this.LJII.getHierarchy().LJIL(v8l);
                return;
            }
            return;
        }
        if (this.LJII.getHierarchy() == null) {
            return;
        }
        this.LJII.getHierarchy().LJIL(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OC(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        AnonymousClass635 LJIIIIZZ;
        final C159366Ng c159366Ng;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        this.LIZJ = abilityContainer;
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 726));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 727));
        View findViewById = viewGroup.findViewById(R.id.czz);
        this.LJFF = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.bb_);
        this.LJI = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.bbb);
        o.LJIIIIZZ(findViewById3, "ttsSelectBubbleContainer…yId(R.id.choose_tts_icon)");
        this.LJII = (C71799SFv) findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.lt3);
        o.LJIIIIZZ(findViewById4, "viewContainer.findViewBy…_bubble_cancel_container)");
        this.LJIIIIZZ = findViewById4;
        this.LJIIIZ = (TuxTextView) findViewById.findViewById(R.id.mpk);
        C6OB c6ob = (C6OB) LIZIZ.getValue();
        if (c6ob != null && (c159366Ng = c6ob.LIZLLL) != null && (viewTreeObserver = c159366Ng.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: X.6OD
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    C6OC c6oc = C6OC.this;
                    C159366Ng mEditText = c159366Ng;
                    ViewGroup viewGroup2 = c6oc.LIZJ.LJIIIIZZ;
                    o.LJIIIZ(mEditText, "mEditText");
                    if (c6oc.LJFF != null && viewGroup2 != null) {
                        mEditText.post(new ARunnableS13S0300000_2(mEditText, c6oc, viewGroup2, 16));
                    }
                }
            });
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        c110614Vt.LIZJ = Float.valueOf(C170576mj.LIZ(viewGroup.getContext(), 20.0f));
        findViewById.setVisibility(0);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "viewContainer.context");
        findViewById.setBackground(c110614Vt.LIZ(context));
        LIZJ();
        C6OE c6oe = abilityContainer.LIZLLL;
        if (c6oe == null || (LJIIIIZZ = c6oe.LJIIIIZZ()) == null || !LJIIIIZZ.LJIJI) {
            findViewById2.setClickable(false);
        }
        findViewById4.setClickable(false);
        C16880lQ.LJIIJ(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 43), findViewById2);
        C16880lQ.LJIIJ(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 44), findViewById4);
        abilityContainer.LJI.LIZ(new TBT() { // from class: X.6O7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6O4) obj).LJLIL;
            }
        }).LJIIIIZZ(abilityContainer.LIZIZ, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 437));
    }
}
