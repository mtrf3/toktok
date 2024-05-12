package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bgt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29435Bgt extends FrameLayout {
    public final String LJLIL;
    public List<View> LJLILLLLZI;
    public int LJLJI;

    public final void LIZ() {
        setStatus(0);
    }

    public final void LIZIZ() {
        setStatus(3);
    }

    public final void LIZJ() {
        setStatus(2);
    }

    public final List<View> getMStatusViews() {
        return this.LJLILLLLZI;
    }

    private final void setStatus(int i) {
        View view;
        int i2 = this.LJLJI;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0 && (view = (View) ListProtector.get(this.LJLILLLLZI, i2)) != null) {
            view.setVisibility(4);
        }
        if (ListProtector.get(this.LJLILLLLZI, i) == null) {
            return;
        }
        View view2 = (View) ListProtector.get(this.LJLILLLLZI, i);
        if (view2 != null) {
            view2.setVisibility(0);
        }
        this.LJLJI = i;
        C012403c.LJ("setStatus    ", i, this.LJLIL);
    }

    public final void setBuilder(C29436Bgu c29436Bgu) {
        if (c29436Bgu == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c29436Bgu = new C29436Bgu(context, null);
        }
        this.LJLILLLLZI.clear();
        this.LJLILLLLZI.add(c29436Bgu.LIZIZ);
        this.LJLILLLLZI.add(null);
        this.LJLILLLLZI.add(c29436Bgu.LIZJ);
        this.LJLILLLLZI.add(c29436Bgu.LIZLLL);
        removeAllViews();
        int size = this.LJLILLLLZI.size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(this.LJLILLLLZI, i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ViewParent parent = view.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C16880lQ.LJLLL(view, (ViewGroup) parent);
                }
                addView(view);
            }
        }
    }

    public final void setMStatusViews(List<View> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLILLLLZI = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29435Bgt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        o.LJI(context);
        this.LJLIL = C16880lQ.LJLLJ(C29435Bgt.class);
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = -1;
    }
}
