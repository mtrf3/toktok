package X;

import Y.ARunnableS20S0300000_9;
import Y.IDObjectS181S0100000_9;
import android.content.Context;
import android.text.Layout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LLs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54116LLs extends C54112LLo {
    @Override // X.C54112LLo, X.AbstractC54111LLn
    public final TuxTextView LJIIIIZZ() {
        TuxTextView LJIIIIZZ = super.LJIIIIZZ();
        LJIIIIZZ.addTextChangedListener(new IDObjectS181S0100000_9(this, 1));
        return LJIIIIZZ;
    }

    @Override // X.C54112LLo, X.AbstractC54111LLn
    public final void LJJIII() {
        LJIIIZ();
        LJIIJJI();
        C54113LLp c54113LLp = this.LIZ;
        if (!LJIILJJIL() && !LJJIIJZLJL(c54113LLp)) {
            LJJIIZI(c54113LLp, true);
        }
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(c54113LLp, new ARunnableS20S0300000_9(c54113LLp, this, c54113LLp, 12));
    }

    public C54116LLs(C54113LLp c54113LLp) {
        super(c54113LLp);
    }

    public static boolean LJJIIJZLJL(C54113LLp c54113LLp) {
        CharSequence charSequence;
        TuxTextView tabTitleView = c54113LLp.getTabTitleView();
        if (tabTitleView != null) {
            charSequence = tabTitleView.getText();
        } else {
            charSequence = null;
        }
        Context context = c54113LLp.getContext();
        o.LJIIIIZZ(context, "context");
        String string = context.getResources().getString(R.string.il9);
        o.LJIIIIZZ(string, "context.resources.getStr…R.string.nearby_tab_name)");
        return o.LJ(charSequence, string);
    }

    public static void LJJIIZ(C54113LLp c54113LLp) {
        Layout layout;
        TuxTextView tabTitleView = c54113LLp.getTabTitleView();
        if (tabTitleView != null && !LJJIIJZLJL(c54113LLp) && (layout = tabTitleView.getLayout()) != null && layout.getEllipsisCount(tabTitleView.getLineCount() - 1) > 0) {
            Context context = tabTitleView.getContext();
            o.LJIIIIZZ(context, "this.context");
            String string = context.getResources().getString(R.string.il9);
            o.LJIIIIZZ(string, "context.resources.getStr…R.string.nearby_tab_name)");
            tabTitleView.setText(string);
        }
    }

    public final void LJJIIZI(C54113LLp c54113LLp, boolean z) {
        c54113LLp.setTitleTuxFont(LJIILIIL(z));
        TuxTextView tabTitleView = c54113LLp.getTabTitleView();
        if (tabTitleView != null && tabTitleView.getText().toString().length() > 16 && tabTitleView.getPaint().measureText(tabTitleView.getText().toString()) > 230.0f) {
            tabTitleView.setTextSize(1, 8.0f);
        }
    }
}
