package X;

import Y.IDCListenerS112S0200000_15;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XwT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86457XwT {
    public static void LIZIZ(boolean z) {
        if (z) {
            View view = SearchRelatedSuggestionUiAssem.LJLILLLLZI.get();
            if (view != null) {
                view.setBackgroundResource(R.drawable.c2w);
                return;
            }
            return;
        }
        View view2 = SearchRelatedSuggestionUiAssem.LJLILLLLZI.get();
        if (view2 == null) {
            return;
        }
        view2.setBackgroundResource(0);
    }

    public static void LIZJ(boolean z) {
        View view = SearchRelatedSuggestionUiAssem.LJLILLLLZI.get();
        if (view != null) {
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public static void LIZ(View view, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        Context context = view.getContext();
        if (context != null) {
            LIZIZ(true);
            searchRelatedSuggestionVM.gv0(context, view);
        }
    }

    public static void LIZLLL(boolean z, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        View view = SearchRelatedSuggestionUiAssem.LJLILLLLZI.get();
        if (view != null) {
            if (z) {
                view.findViewById(R.id.fed).setOnLongClickListener(new IDCListenerS112S0200000_15(view, searchRelatedSuggestionVM, 4));
                view.findViewById(R.id.e__).setOnLongClickListener(new IDCListenerS112S0200000_15(view, searchRelatedSuggestionVM, 5));
                view.findViewById(R.id.e_a).setOnLongClickListener(new IDCListenerS112S0200000_15(view, searchRelatedSuggestionVM, 6));
                view.setOnLongClickListener(new IDCListenerS112S0200000_15(view, searchRelatedSuggestionVM, 7));
                return;
            }
            view.findViewById(R.id.cec).setLongClickable(false);
            view.setBackground(null);
            view.setOnLongClickListener(ViewOnLongClickListenerC86462XwY.LJLIL);
            view.setLongClickable(false);
        }
    }
}
