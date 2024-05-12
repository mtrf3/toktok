package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVR extends AbstractC60088Ni8 {
    public final /* synthetic */ NVO LIZ;

    public NVR(NVO nvo) {
        this.LIZ = nvo;
    }

    @Override // X.AbstractC60088Ni8
    public final View LIZ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJJL(context);
        return this.LIZ.LJLJI;
    }

    @Override // X.AbstractC60088Ni8
    public final void LIZIZ(View.OnClickListener onClickListener) {
        View findViewById;
        View view = this.LIZ.LJLJI;
        if (view != null && (findViewById = view.findViewById(R.id.e95)) != null) {
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this.LIZ, onClickListener, 35), findViewById);
        }
    }

    @Override // X.AbstractC60088Ni8
    public final void LIZJ(boolean z) {
        View findViewById;
        int i;
        View view = this.LIZ.LJLJI;
        if (view == null || (findViewById = view.findViewById(R.id.e96)) == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.AbstractC60088Ni8
    public final void LIZLLL(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        View findViewById;
        View view = this.LIZ.LJLJI;
        if (view != null && (findViewById = view.findViewById(R.id.e96)) != null) {
            C16880lQ.LJIIJ(aCListenerS30S0100000_10, findViewById);
        }
    }

    @Override // X.AbstractC60088Ni8
    public final void LJ(String str) {
        View view = this.LIZ.LJLJI;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.j2p);
        View findViewById2 = view.findViewById(R.id.ayi);
        View findViewById3 = view.findViewById(R.id.az6);
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this.LIZ, 165), findViewById);
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this.LIZ, 166), findViewById2);
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this.LIZ, 167), findViewById3);
        int hashCode = str.hashCode();
        if (hashCode != -934521548) {
            if (hashCode != 109400031) {
                if (hashCode != 949444906 || !str.equals("collect")) {
                    return;
                }
                findViewById.setVisibility(0);
                return;
            }
            if (!str.equals("share")) {
                return;
            }
            findViewById3.setVisibility(0);
            return;
        }
        if (!str.equals("report")) {
            return;
        }
        findViewById2.setVisibility(0);
    }

    @Override // X.AbstractC60088Ni8
    public final void LJFF(String title) {
        View view;
        TextView textView;
        o.LJIIIZ(title, "title");
        if (C59454NVa.LIZIZ(title) || (view = this.LIZ.LJLJI) == null || (textView = (TextView) view.findViewById(R.id.mo6)) == null) {
            return;
        }
        textView.setText(title);
    }

    @Override // X.AbstractC60088Ni8
    public final void LJI(int i) {
        View view = this.LIZ.LJLJI;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Override // X.AbstractC60088Ni8
    public final void LJII(int i) {
        TextView textView;
        View view = this.LIZ.LJLJI;
        if (view != null && (textView = (TextView) view.findViewById(R.id.mo6)) != null) {
            textView.setTextColor(i);
        }
    }
}
