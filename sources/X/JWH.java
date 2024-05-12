package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;

/* loaded from: classes9.dex */
public final class JWH implements JIB {
    public final /* synthetic */ SearchJediMixFeedFragment LIZ;

    @Override // X.JIB
    public final boolean LIZIZ() {
        return this.LIZ.getUserVisibleHint();
    }

    @Override // X.JIB
    public final InterfaceC47667InH LIZJ() {
        return new JWI(this.LIZ);
    }

    @Override // X.JIB
    public final Context getContext() {
        View view = this.LIZ.getView();
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    @Override // X.JIB
    public final boolean isActive() {
        return this.LIZ.getUserVisibleHint();
    }

    @Override // X.JIB
    public final String getIdentifier() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixFeedFragment_");
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            num = Integer.valueOf(mo49getActivity.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.JIB
    public final Fragment LIZ() {
        return this.LIZ;
    }

    public JWH(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        this.LIZ = searchJediMixFeedFragment;
    }
}
