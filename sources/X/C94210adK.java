package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS17S1100000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.adK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94210adK extends ConstraintLayout {
    public AppCompatTextView LJLIL;
    public LinearLayout LJLILLLLZI;
    public C93690aUw LJLJI;

    public final C93690aUw getScrollIconContainer() {
        C93690aUw c93690aUw = this.LJLJI;
        if (c93690aUw != null) {
            return c93690aUw;
        }
        o.LJIJI("scrollIconContainer");
        throw null;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            AppCompatTextView appCompatTextView = this.LJLIL;
            if (appCompatTextView != null) {
                appCompatTextView.setHintTextColor(C04330Ez.LIZIZ(getContext(), R.color.ady));
                return;
            } else {
                o.LJIJI("tvTips");
                throw null;
            }
        }
        AppCompatTextView appCompatTextView2 = this.LJLIL;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setHintTextColor(C04330Ez.LIZIZ(getContext(), R.color.adr));
        } else {
            o.LJIJI("tvTips");
            throw null;
        }
    }

    public final void LJJLJLI(String str, List iconList) {
        o.LJIIIZ(iconList, "iconList");
        if (iconList.isEmpty()) {
            AppCompatTextView appCompatTextView = this.LJLIL;
            if (appCompatTextView != null) {
                C93729aVZ.LJI(appCompatTextView);
                C93690aUw c93690aUw = this.LJLJI;
                if (c93690aUw != null) {
                    C93729aVZ.LIZLLL(c93690aUw);
                    AppCompatTextView appCompatTextView2 = this.LJLIL;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setHint(str);
                        return;
                    } else {
                        o.LJIJI("tvTips");
                        throw null;
                    }
                }
                o.LJIJI("scrollIconContainer");
                throw null;
            }
            o.LJIJI("tvTips");
            throw null;
        }
        AppCompatTextView appCompatTextView3 = this.LJLIL;
        if (appCompatTextView3 != null) {
            C93729aVZ.LIZLLL(appCompatTextView3);
            C93690aUw c93690aUw2 = this.LJLJI;
            if (c93690aUw2 != null) {
                C93729aVZ.LJI(c93690aUw2);
                LinearLayout linearLayout = this.LJLILLLLZI;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                    Iterator it = iconList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        Context context = linearLayout.getContext();
                        o.LJIIIIZZ(context, "context");
                        C94466ahS c94466ahS = new C94466ahS(context);
                        c94466ahS.setLayoutParams(C93902aYM.LIZJ(linearLayout, 0, -1, C93742aVm.LIZIZ(4), C93742aVm.LIZIZ(8), null, null, null, null, null, null, 1008));
                        new IDqS17S1100000_42(str2, this, 0).invoke(c94466ahS);
                        C93902aYM.LIZ(c94466ahS, linearLayout);
                    }
                    return;
                }
                o.LJIJI("llIconContainer");
                throw null;
            }
            o.LJIJI("scrollIconContainer");
            throw null;
        }
        o.LJIJI("tvTips");
        throw null;
    }

    public C94210adK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(context.getDrawable(R.drawable.dfr));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZLLL(this, -2, (int) C93742aVm.LIZ(9.5f), C93742aVm.LIZIZ(6), C94629ak5.LJLIL, 240));
        new IDqS419S0100000_42(this, 65).invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, this);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C93690aUw c93690aUw = new C93690aUw(context2);
        c93690aUw.setLayoutParams(C93902aYM.LIZLLL(this, 0, 0, C93742aVm.LIZIZ(3), C94622ajy.LJLIL, 244));
        new IDqS419S0100000_42(this, 48).invoke(c93690aUw);
        C93902aYM.LIZ(c93690aUw, this);
    }
}
