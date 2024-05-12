package X;

import Y.IDObjectS185S0100000_14;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wqk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83554Wqk extends C83551Wqh {
    public FrameLayout.LayoutParams LJLLILLLL;

    @Override // X.C83551Wqh
    public int getLayout() {
        return R.layout.blu;
    }

    @Override // X.C83551Wqh
    public TextWatcher getTextWatcher() {
        return new IDObjectS185S0100000_14(this, 4);
    }

    @Override // X.C83551Wqh
    public final void LIZJ() {
        LIZ();
        InterfaceC83565Wqv interfaceC83565Wqv = this.LJLJJLL;
        if (interfaceC83565Wqv != null) {
            interfaceC83565Wqv.LIZ(this.LJLJLLL);
        }
    }

    public final FrameLayout.LayoutParams getParams() {
        return this.LJLLILLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83554Wqk(C29S context) {
        super(context, null);
        o.LJIIIZ(context, "context");
        EditText editView = this.LJLIL;
        o.LJIIIIZZ(editView, "editView");
        ViewGroup.LayoutParams layoutParams = editView.getLayoutParams();
        if (layoutParams != null) {
            this.LJLLILLLL = (FrameLayout.LayoutParams) layoutParams;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // X.C83551Wqh
    public final void LJ(int i) {
        EditText editText = this.LJLIL;
        if (editText != null) {
            FrameLayout.LayoutParams layoutParams = this.LJLLILLLL;
            Context context = editText.getContext();
            o.LJIIIIZZ(context, "editView.context");
            layoutParams.bottomMargin = (int) (C74275TDb.LIZIZ(context, 16.0f) + i);
            EditText editView = this.LJLIL;
            o.LJIIIIZZ(editView, "editView");
            editView.setLayoutParams(this.LJLLILLLL);
        }
        InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLL;
        if (interfaceC65784Pro != null) {
            View titleLayout = this.LJLJJI;
            o.LJIIIIZZ(titleLayout, "titleLayout");
            ViewGroup.LayoutParams layoutParams2 = titleLayout.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                Integer invoke = interfaceC65784Pro.invoke();
                o.LJIIIIZZ(invoke, "it()");
                layoutParams3.topMargin = invoke.intValue();
                View titleLayout2 = this.LJLJJI;
                o.LJIIIIZZ(titleLayout2, "titleLayout");
                titleLayout2.setLayoutParams(layoutParams3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public final void setParams(FrameLayout.LayoutParams layoutParams) {
        o.LJIIIZ(layoutParams, "<set-?>");
        this.LJLLILLLL = layoutParams;
    }
}
