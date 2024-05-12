package Y;

import X.C1JI;
import X.GA0;
import X.GS5;
import X.GSI;
import X.GSR;
import X.X1D;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDCListenerS375S0100000_7 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            case 2:
                onFocusChange$2(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS375S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS375S0100000_7 iDCListenerS375S0100000_7, View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = ((GSR) iDCListenerS375S0100000_7.l0).LLIZLLLIL;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        if (z) {
            if (!TextUtils.isEmpty(((GSR) iDCListenerS375S0100000_7.l0).LLIIZ)) {
                GSR gsr = (GSR) iDCListenerS375S0100000_7.l0;
                gsr.addHashTag(gsr.LLIIZ);
                GSR gsr2 = (GSR) iDCListenerS375S0100000_7.l0;
                gsr2.setHint(gsr2.LLIL);
                ((GSR) iDCListenerS375S0100000_7.l0).LLIIZ = "";
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(((GSR) iDCListenerS375S0100000_7.l0).getNoAdTagText())) {
            return;
        }
        GSR gsr3 = (GSR) iDCListenerS375S0100000_7.l0;
        gsr3.LLIIZ = gsr3.getAdTag();
        ((GSR) iDCListenerS375S0100000_7.l0).removeHashTag();
        GSR gsr4 = (GSR) iDCListenerS375S0100000_7.l0;
        gsr4.LLIL = gsr4.getHint().toString();
        GSR gsr5 = (GSR) iDCListenerS375S0100000_7.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) ((GSR) iDCListenerS375S0100000_7.l0).getHint());
        LIZ.append(((GSR) iDCListenerS375S0100000_7.l0).LLIIZ);
        gsr5.setHint(X1D.LIZIZ(LIZ));
    }

    public static final void onFocusChange$1(IDCListenerS375S0100000_7 iDCListenerS375S0100000_7, View view, boolean z) {
        float f;
        if (z) {
            GS5 gs5 = (GS5) iDCListenerS375S0100000_7.l0;
            gs5.getClass();
            GS5.LIZJ(gs5, "enter_title_text", false, GA0.LJLIL, 2);
        }
        ExpandedTitleModule expandedTitleModule = ((GS5) iDCListenerS375S0100000_7.l0).LJIIIZ;
        if (expandedTitleModule != null) {
            ViewGroup viewGroup = expandedTitleModule.LJLLL;
            if (z) {
                f = 0.34f;
            } else {
                f = 1.0f;
            }
            viewGroup.setAlpha(f);
            if (z) {
                expandedTitleModule.LLIIJLIL.setVisibility(8);
                expandedTitleModule.LLIILII.setVisibility(0);
                expandedTitleModule.LJI(false);
            }
        }
        TextView textView = ((GS5) iDCListenerS375S0100000_7.l0).LJIILIIL;
        if (textView != null) {
            if (z) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(4);
            }
        }
    }

    public static final void onFocusChange$2(IDCListenerS375S0100000_7 iDCListenerS375S0100000_7, View view, boolean z) {
        boolean z2;
        if (z) {
            GS5 gs5 = (GS5) iDCListenerS375S0100000_7.l0;
            if (gs5.LJII != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            GS5.LIZJ(gs5, "enter_description_text", z2, null, 4);
        }
        ExpandedTitleModule expandedTitleModule = ((GS5) iDCListenerS375S0100000_7.l0).LJIIIZ;
        if (expandedTitleModule != null) {
            expandedTitleModule.LJLJJLL.setForbidAutoScrollToShowChild(!z);
            int i = expandedTitleModule.LLJ;
            if (i == 1) {
                TextView descCharacterLimit = expandedTitleModule.LJLLLL;
                o.LJIIIIZZ(descCharacterLimit, "descCharacterLimit");
                C1JI.LJJIJ(descCharacterLimit, false);
            } else {
                if (i == 1) {
                    return;
                }
                TextView descCharacterLimit2 = expandedTitleModule.LJLLLL;
                o.LJIIIIZZ(descCharacterLimit2, "descCharacterLimit");
                C1JI.LJJIJ(descCharacterLimit2, z);
                int LIZJ = expandedTitleModule.LIZJ(expandedTitleModule.LLJ);
                int LIZIZ = expandedTitleModule.LIZIZ(LIZJ);
                if (GSI.LIZ()) {
                    expandedTitleModule.LJLJJL.getLayoutParams().height = LIZJ;
                    expandedTitleModule.LJLLI.requestLayout();
                } else {
                    expandedTitleModule.LJIIJJI(LIZJ);
                }
                expandedTitleModule.LJLLI.setMinHeight(LIZIZ);
            }
        }
    }
}
