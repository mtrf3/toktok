package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JQO extends FrameLayout {
    public final View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public LinearLayout LJLJJI;
    public List<? extends View> LJLJJL;
    public final java.util.Set<View> LJLJJLL;
    public int LJLJL;
    public JQA LJLJLJ;
    public JP4 LJLJLLL;
    public String LJLL;
    public InterfaceC88472Yns<? super View, C76800UCe> LJLLI;

    public final void LIZ() {
        if (getVisibility() == 0) {
            setVisibility(4);
        }
        if (!((HashSet) this.LJLJJLL).isEmpty()) {
            Iterator it = ((HashSet) this.LJLJJLL).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            ((HashSet) this.LJLJJLL).clear();
        }
    }

    public final void LIZIZ() {
        ViewParent parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            List<? extends View> list = this.LJLJJL;
            if (list != null) {
                o.LJI(list);
                if (list.contains(childAt)) {
                    if (childAt != null) {
                        childAt.setVisibility(0);
                        childAt.setAlpha(1.0f);
                    }
                }
            }
            if (childAt != this && childAt.getVisibility() == 0) {
                childAt.setVisibility(4);
                ((HashSet) this.LJLJJLL).add(childAt);
            }
        }
    }

    public final String getImprId() {
        return this.LJLL;
    }

    public final InterfaceC88472Yns<View, C76800UCe> getOnCloseClickListener() {
        return this.LJLLI;
    }

    public final void setAlwaysShowingViews(List<? extends View> list) {
        if (list != null) {
            this.LJLJJL = list;
        }
    }

    public final void setImprId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLL = str;
    }

    public final void setOnCloseClickListener(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LJLLI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View LLLLIILL;
        int i;
        a1.LJFF(context, "context");
        this.LJLJJLL = new HashSet();
        this.LJLL = "";
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ee);
        view.setBackground(c110614Vt.LIZ(context));
        this.LJLIL = view;
        addView(view);
        if (this.LJLILLLLZI != null) {
            return;
        }
        if (C50086JlC.LIZ().enableVideoLayoutPreInflate && o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LLLLIILL = C50365Jph.LIZIZ(R.layout.cip, this);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cip, this, false);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LLLLIILL.getLayoutParams());
        layoutParams.gravity = 80;
        LLLLIILL.setLayoutParams(layoutParams);
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZLLL());
        if (valueOf.intValue() > 0) {
            i = valueOf.intValue();
        } else {
            i = 4;
        }
        LLLLIILL.setOutlineProvider(new C43251GyF((int) C78847Ux1.LJJIFFI(i)));
        this.LJLILLLLZI = LLLLIILL;
        addView(LLLLIILL);
        View view2 = this.LJLILLLLZI;
        o.LJI(view2);
        this.LJLJJI = (LinearLayout) view2.findViewById(R.id.nju);
        View view3 = this.LJLILLLLZI;
        o.LJI(view3);
        View findViewById = view3.findViewById(R.id.avl);
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 102), findViewById);
        this.LJLJI = findViewById;
    }
}
