package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VvC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81282VvC extends RecyclerView.ViewHolder {
    public final W5G LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;
    public final int LJLJJI;
    public final /* synthetic */ C81280VvA LJLJJL;

    public final void L(C81286VvG filterBean) {
        Drawable drawable;
        float f;
        o.LJIIIZ(filterBean, "filterBean");
        C78764Uvg.LJIIIZ(this.LJLIL, String.valueOf(filterBean.LIZ.LJLIL.LJIIIIZZ), -1, -1);
        this.LJLILLLLZI.setText(filterBean.LIZ.LJLIL.LIZJ);
        ImageView imageView = this.LJLJI;
        if (filterBean.LIZIZ) {
            drawable = this.LJLJJL.LJLJI.LJLLI;
        } else {
            drawable = this.LJLJJL.LJLJI.LJLL;
        }
        imageView.setImageDrawable(drawable);
        if (filterBean.LIZ.LJLJI) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        imageView.setAlpha(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81282VvC(C81280VvA c81280VvA, LinearLayout linearLayout) {
        super(linearLayout);
        this.LJLJJL = c81280VvA;
        View childAt = linearLayout.getChildAt(0);
        if (childAt != null) {
            W5G w5g = (W5G) childAt;
            this.LJLIL = w5g;
            View childAt2 = linearLayout.getChildAt(1);
            if (childAt2 != null) {
                this.LJLILLLLZI = (TextView) childAt2;
                View childAt3 = linearLayout.getChildAt(2);
                if (childAt3 != null) {
                    this.LJLJI = (ImageView) childAt3;
                    Context context = c81280VvA.LJLJI.getContext();
                    o.LJIIIIZZ(context, "context");
                    this.LJLJJI = context.getResources().getColor(R.color.xz);
                    V92 hierarchy = w5g.getHierarchy();
                    hierarchy = hierarchy == null ? new C79077V1t(c81280VvA.LJLJI.getResources()).LIZ() : hierarchy;
                    V8L v8l = new V8L();
                    v8l.LIZIZ = c81280VvA.LJLJI.getFilterBoxViewConfigure().LIZ.LIZ;
                    if (!c81280VvA.LJLJI.getFilterBoxViewConfigure().LIZ.LIZ) {
                        v8l.LJFF(c81280VvA.LJLJI.getFilterBoxViewConfigure().LIZ.LIZIZ);
                    }
                    hierarchy.LJIL(v8l);
                    hierarchy.LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                    w5g.setHierarchy(hierarchy);
                    Context context2 = c81280VvA.LJLJI.getContext();
                    o.LJIIIIZZ(context2, "context");
                    int LIZIZ = (int) C74275TDb.LIZIZ(context2, c81280VvA.LJLJI.getFilterBoxViewConfigure().LIZ.LIZJ);
                    Context context3 = c81280VvA.LJLJI.getContext();
                    o.LJIIIIZZ(context3, "context");
                    int LIZIZ2 = (int) C74275TDb.LIZIZ(context3, c81280VvA.LJLJI.getFilterBoxViewConfigure().LIZ.LIZLLL);
                    ViewGroup.LayoutParams layoutParams = w5g.getLayoutParams();
                    layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(LIZIZ, LIZIZ2) : layoutParams;
                    layoutParams.width = LIZIZ;
                    layoutParams.height = LIZIZ2;
                    w5g.setLayoutParams(layoutParams);
                    C16880lQ.LJIIZILJ(linearLayout, new ACListenerS34S0100000_14(new AqS164S0100000_14(this, 60), 12));
                    linearLayout.setOnTouchListener(new ViewOnTouchListenerC81284VvE(this, linearLayout));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
    }
}
