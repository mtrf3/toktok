package X;

import Y.IDObjectS185S0100000_14;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wqi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83552Wqi extends C83551Wqh {
    public RelativeLayout.LayoutParams LJLLILLLL;
    public View LJLLJ;

    @Override // X.C83551Wqh
    public int getLayout() {
        return R.layout.bku;
    }

    @Override // X.C83551Wqh
    public TextWatcher getTextWatcher() {
        return new IDObjectS185S0100000_14(this, 5);
    }

    @Override // X.C83551Wqh
    public final void LIZJ() {
        LIZ();
        this.LJLJJLL.LIZ(this.LJLJLLL);
    }

    public final RelativeLayout.LayoutParams getParams() {
        return this.LJLLILLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83552Wqi(C29S context) {
        super(context, null);
        o.LJIIIZ(context, "context");
        EditText editView = this.LJLIL;
        o.LJIIIIZZ(editView, "editView");
        ViewGroup.LayoutParams layoutParams = editView.getLayoutParams();
        if (layoutParams != null) {
            this.LJLLILLLL = (RelativeLayout.LayoutParams) layoutParams;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // X.C83551Wqh
    public final void LIZIZ(C29S c29s) {
        super.LIZIZ(c29s);
        this.LJLLJ = this.LJLJI.findViewById(R.id.bt6);
    }

    @Override // X.C83551Wqh
    public final void LJ(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLLJ;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            View view2 = this.LJLLJ;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLL;
            if (interfaceC65784Pro != null) {
                View titleLayout = this.LJLJJI;
                o.LJIIIIZZ(titleLayout, "titleLayout");
                ViewGroup.LayoutParams layoutParams3 = titleLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    Integer invoke = interfaceC65784Pro.invoke();
                    o.LJIIIIZZ(invoke, "it()");
                    layoutParams4.topMargin = invoke.intValue();
                    View titleLayout2 = this.LJLJJI;
                    o.LJIIIIZZ(titleLayout2, "titleLayout");
                    titleLayout2.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // X.C83551Wqh
    public void setMaxTextCount(int i) {
        super.setMaxTextCount(i);
        EditText editView = this.LJLIL;
        o.LJIIIIZZ(editView, "editView");
        editView.setFilters(new C83555Wql[]{new C83555Wql(this, this.LJLJLJ)});
    }

    public final void setParams(RelativeLayout.LayoutParams layoutParams) {
        o.LJIIIZ(layoutParams, "<set-?>");
        this.LJLLILLLL = layoutParams;
    }
}
