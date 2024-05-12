package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* renamed from: X.LFo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53956LFo extends AbstractC53958LFq {
    public ActivityC45651qj LJLIL;
    public View LJLILLLLZI;

    @Override // X.AbstractC53958LFq
    public final void LJ() {
    }

    @Override // X.AbstractC53958LFq
    public final void onResume() {
    }

    @Override // X.AbstractC53958LFq
    public final void LIZIZ(View view, Fragment fragment) {
        TopTabAbility LJJLIIIJJIZ;
        o.LJIIIZ(view, "view");
        MainActivityScope LJJLIIIJ = C78866UxK.LJJLIIIJ(view);
        if (LJJLIIIJ != null && (LJJLIIIJJIZ = C78847Ux1.LJJLIIIJJIZ(LJJLIIIJ)) != null) {
            LJJLIIIJJIZ.na(new LJ3(this));
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LJII(View view, LCP lcp) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = view;
        Context context = view.getContext();
        if (context != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        this.LJLIL = activityC45651qj;
    }
}
