package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228428xq extends FrameLayout implements InterfaceC228588y6 {
    public static final int LJLJL = 8;
    public SY4 LJLIL;
    public TextView LJLILLLLZI;
    public SY4 LJLJI;
    public LinearLayout LJLJJI;
    public boolean LJLJJL;
    public java.util.Map<Integer, View> LJLJJLL;

    public void LIZ() {
        this.LJLJJLL.clear();
    }

    public View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC228588y6, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final void LIZJ() {
        SY4 sy4;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.btk, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.gke);
        this.LJLJJI = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        SY4 sy42 = (SY4) findViewById(R.id.aye);
        this.LJLIL = sy42;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS23S0100000_3(this, 92));
        }
        this.LJLJI = (SY4) findViewById(R.id.aul);
        if (C99W.LIZ && (sy4 = this.LJLIL) != null) {
            sy4.setButtonVariant(5);
        }
        TextView textView = (TextView) findViewById(R.id.ayf);
        this.LJLILLLLZI = textView;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final SY4 getAddVideoView() {
        return this.LJLJI;
    }

    public final LinearLayout getEditMixLayout() {
        return this.LJLJJI;
    }

    public final TextView getRemoveConfirmView() {
        return this.LJLILLLLZI;
    }

    public final SY4 getRemoveView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C228428xq(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC228588y6
    public void p1(int i) {
        boolean z;
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            textView.setEnabled(z);
        }
        TextView textView2 = this.LJLILLLLZI;
        if (textView2 == null) {
            return;
        }
        textView2.setText(getResources().getQuantityString(R.plurals.jw, i, Integer.valueOf(i)));
    }

    @Override // X.InterfaceC228588y6
    public void pi(boolean z) {
        if (z) {
            this.LJLJJL = true;
            LinearLayout linearLayout = this.LJLJJI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            TextView textView = this.LJLILLLLZI;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        this.LJLJJL = false;
        LinearLayout linearLayout2 = this.LJLJJI;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        TextView textView2 = this.LJLILLLLZI;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void setAddVideoView(SY4 sy4) {
        this.LJLJI = sy4;
    }

    public final void setEditMixLayout(LinearLayout linearLayout) {
        this.LJLJJI = linearLayout;
    }

    public final void setRemoveConfirmView(TextView textView) {
        this.LJLILLLLZI = textView;
    }

    public final void setRemoveView(SY4 sy4) {
        this.LJLIL = sy4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C228428xq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        LIZJ();
    }
}
