package X;

import Y.ACListenerS24S1200000_1;
import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS70S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3WX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WX extends LinearLayout implements GenericLifecycleObserver, InterfaceC70422pa, C3WZ {
    public static final float LJLLJ = C32151Nz.LJIIZILJ(146);
    public final C3WZ LJLIL;
    public C3FD LJLILLLLZI;
    public final AbstractC78621UtN LJLJI;
    public XKQ LJLJJI;
    public XKQ LJLJJL;
    public C3PD LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public ValueAnimator LJLLILLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3WX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C3WZ
    public final void LJIILIIL() {
        this.LJLIL.LJIILIIL();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final TuxIconView getDismissButton() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-dismissButton>(...)");
        return (TuxIconView) value;
    }

    private final BottomNoticeViewModel getViewModel() {
        return (BottomNoticeViewModel) this.LJLJLJ.getValue();
    }

    public final RecyclerView getRecyclerview() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-recyclerview>(...)");
        return (RecyclerView) value;
    }

    public final View getSuggestedStickerContainer() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-suggestedStickerContainer>(...)");
        return (View) value;
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.LJLJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3WX(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r5 & 8
            if (r0 == 0) goto Lf
            X.3Wr r1 = new X.3Wr
            r1.<init>()
        Lf:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "chatNoticeAnimationDelegate"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.LJLIL = r1
            X.3FE r0 = X.C3FE.LIZ
            r2.LJLILLLLZI = r0
            X.UtN r0 = X.C36636EZk.LIZ
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 898(0x382, float:1.258E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJLJ = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 893(0x37d, float:1.251E-42)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJLLL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 896(0x380, float:1.256E-42)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 897(0x381, float:1.257E-42)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLLI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WX.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ValueAnimator LIZ(float f, float f2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(this, 11));
        ofFloat.addListener(new IDAListenerS70S0100000_1(interfaceC65784Pro, 6));
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }

    public final void LIZIZ(C99033ud c99033ud, String str, C73122tw c73122tw) {
        XKQ xkq = this.LJLJJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJJI = XKX.LIZLLL(this, null, null, new C3F9(c73122tw, this, c99033ud, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public final void LIZJ(C99033ud c99033ud, String str, C3PD c3pd, InterfaceC71762rk<? extends C3FJ> stateFlow) {
        ?? r2;
        o.LJIIIZ(stateFlow, "stateFlow");
        BottomNoticeViewModel viewModel = getViewModel();
        viewModel.LLFF = c99033ud;
        viewModel.LLFFF = str;
        setVisibility(0);
        this.LJLJJLL = c3pd;
        if (c99033ud instanceof C98523to) {
            List LLILZ = ORZ.LLILZ(2, s.LJLJJL(c99033ud.getConversationId(), new String[]{":"}, 0, 6));
            r2 = new ArrayList();
            Iterator it = LLILZ.iterator();
            while (it.hasNext()) {
                Long LJJIZ = C38350F3i.LJJIZ((String) it.next());
                if (LJJIZ != null) {
                    r2.add(LJJIZ);
                }
            }
        } else if (c99033ud instanceof C98563ts) {
            r2 = C61878OQg.INSTANCE;
        } else {
            r2 = C61878OQg.INSTANCE;
        }
        C73122tw c73122tw = new C73122tw(r2);
        if (this.LJLJL) {
            setVisibility(0);
            LJIILIIL();
        } else {
            this.LJLJL = true;
            View.inflate(getContext(), R.layout.b51, this);
            RecyclerView recyclerview = getRecyclerview();
            getContext();
            recyclerview.setLayoutManager(new LinearLayoutManager(0, false));
            getRecyclerview().LJII(new AbstractC030309z() { // from class: X.49N
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                    super.LJ(rect, view, recyclerView, c0ac);
                    if (RecyclerView.LJJJJIZL(view) == 0) {
                        rect.left = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    } else if (RecyclerView.LJJJJIZL(view) == c0ac.LIZIZ() - 1) {
                        rect.left = C7MY.LIZIZ(8);
                        rect.right = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    } else {
                        rect.left = C7MY.LIZIZ(8);
                    }
                }
            }, -1);
            Context context = getRootView().getContext();
            o.LJIIIIZZ(context, "rootView.context");
            Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZLLL, context);
            if (LJI != null) {
                getSuggestedStickerContainer().setBackgroundColor(LJI.intValue());
            }
            LIZIZ(c99033ud, str, c73122tw);
            C16880lQ.LJJJ(getDismissButton(), new ACListenerS24S1200000_1(this, c99033ud, str, 1));
            setVisibility(0);
            LJIILIIL();
        }
        XKQ xkq = this.LJLJJL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJJL = XKX.LIZLLL(this, null, null, new C3FG(stateFlow, this, c99033ud, str, c73122tw, null), 3);
    }
}
