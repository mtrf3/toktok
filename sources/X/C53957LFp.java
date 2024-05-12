package X;

import Y.ARunnableS28S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LFp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53957LFp extends AbstractC53958LFq {
    public boolean LJLIL;
    public HomeViewPagerAbility LJLILLLLZI;
    public HomeTabAbility LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
    public final void LJIIIIZZ(View view) {
        Object obj;
        TextView textView;
        TopTabAbility topTabAbility;
        View view2;
        o.LJIIIZ(view, "view");
        if (this.LJLIL) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        ?? findViewById = view.findViewById(R.id.emh);
        c68322mC.element = findViewById;
        if (findViewById != 0) {
            obj = findViewById.getParent();
        } else {
            obj = null;
        }
        if ((obj instanceof ViewGroup) && (view2 = (View) obj) != null) {
            textView = (TextView) view2.findViewById(android.R.id.text1);
        } else {
            textView = null;
        }
        MainActivityScope LJJLIIIJ = C78866UxK.LJJLIIIJ(view);
        if (LJJLIIIJ != null) {
            topTabAbility = C78847Ux1.LJJLIIIJJIZ(LJJLIIIJ);
        } else {
            topTabAbility = null;
        }
        if (((Boolean) DKT.LIZIZ.getValue()).booleanValue()) {
            View view3 = (View) c68322mC.element;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = (View) c68322mC.element;
            if (view4 != null) {
                view4.setClickable(false);
            }
            c68322mC.element = null;
        }
        if (topTabAbility != null) {
            this.LJLIL = true;
            topTabAbility.na(StateOwner.LJLIL);
            topTabAbility.na(new C53963LFv(c68322mC, textView, this));
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LIZIZ(View view, Fragment fragment) {
        o.LJIIIZ(view, "view");
        if (!this.LJLIL) {
            LJIIIIZZ(view);
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LJII(View view, LCP lcp) {
        o.LJIIIZ(view, "view");
        view.post(new ARunnableS28S0200000_9(view, this, 52));
    }
}
