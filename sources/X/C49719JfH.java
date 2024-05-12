package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;

/* renamed from: X.JfH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49719JfH implements JIB {
    public final /* synthetic */ SearchFeedFragment LIZ;

    @Override // X.JIB
    public final /* synthetic */ InterfaceC47667InH LIZJ() {
        return null;
    }

    @Override // X.JIB
    public final boolean LIZIZ() {
        return this.LIZ.getUserVisibleHint();
    }

    @Override // X.JIB
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.JIB
    public final boolean isActive() {
        return this.LIZ.isViewValid();
    }

    @Override // X.JIB
    public final String getIdentifier() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchFeedFragment_");
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

    public C49719JfH(SearchFeedFragment searchFeedFragment) {
        this.LIZ = searchFeedFragment;
    }
}
