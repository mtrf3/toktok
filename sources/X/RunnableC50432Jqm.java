package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Jqm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50432Jqm implements Runnable {
    public final /* synthetic */ C68322mC<View> LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;
    public final /* synthetic */ java.util.Map<String, Boolean> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ LifecycleOwner LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC50432Jqm(C68322mC c68322mC, TuxTextView tuxTextView, java.util.Map map, java.util.Map map2, String str, Fragment fragment, String str2) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = tuxTextView;
        this.LJLJI = map;
        this.LJLJJI = map2;
        this.LJLJJL = str;
        this.LJLJJLL = fragment;
        this.LJLJL = str2;
    }

    public final void LIZ() {
        if (this.LJLIL.element.getWidth() == 0) {
            this.LJLIL.element.requestLayout();
        }
        TuxIconView tuxIconView = (TuxIconView) this.LJLIL.element.findViewById(R.id.f_l);
        this.LJLIL.element.findViewById(R.id.g5r).setBackgroundResource(R.drawable.c1k);
        tuxIconView.setTintColorRes(R.attr.dk);
        this.LJLILLLLZI.setTextColorRes(R.attr.dk);
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        View searchBar = this.LJLIL.element;
        o.LJIIIIZZ(searchBar, "searchBar");
        java.util.Map<String, String> map = this.LJLJI;
        java.util.Map<String, Boolean> map2 = this.LJLJJI;
        String str = this.LJLJJL;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIILJJIL(false, searchBar, map, map2, str, null);
        if (!a.LJIIIZ().LIZJ()) {
            LifecycleOwner lifecycleOwner = this.LJLJJLL;
            View searchBar2 = this.LJLIL.element;
            o.LJIIIIZZ(searchBar2, "searchBar");
            String awemeId = this.LJLJL;
            o.LJIIIIZZ(awemeId, "awemeId");
            detailFeedSearchHelper.LJIIJJI(lifecycleOwner, searchBar2, awemeId, this.LJLJI, this.LJLJJI);
            return;
        }
        View searchBar3 = this.LJLIL.element;
        o.LJIIIIZZ(searchBar3, "searchBar");
        DetailFeedSearchHelper.LJIIIIZZ(searchBar3, null, this.LJLJI, this.LJLJJI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
