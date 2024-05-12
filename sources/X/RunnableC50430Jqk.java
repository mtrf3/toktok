package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Jqk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50430Jqk implements Runnable {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<java.util.Map<String, Boolean>> LJLJI;
    public final /* synthetic */ LifecycleOwner LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC50430Jqk(View view, java.util.Map<String, String> map, C68322mC<java.util.Map<String, Boolean>> c68322mC, LifecycleOwner lifecycleOwner, String str) {
        this.LJLIL = view;
        this.LJLILLLLZI = map;
        this.LJLJI = c68322mC;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = str;
    }

    public final void LIZ() {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        View view = this.LJLIL;
        detailFeedSearchHelper.getClass();
        View LJ = DetailFeedSearchHelper.LJ(view);
        if (LJ == null) {
            return;
        }
        if (LJ.getWidth() == 0) {
            LJ.requestLayout();
        }
        LJ.setVisibility(0);
        java.util.Map<String, String> map = this.LJLILLLLZI;
        java.util.Map<String, Boolean> map2 = this.LJLJI.element;
        TuxIconView tuxIconView = (TuxIconView) LJ.findViewById(R.id.f_l);
        TuxTextView tuxTextView = (TuxTextView) LJ.findViewById(R.id.mj3);
        LJ.findViewById(R.id.g5r).setBackgroundResource(R.drawable.c1k);
        tuxIconView.setTintColorRes(R.attr.dk);
        tuxTextView.setTextColorRes(R.attr.dk);
        Context context = LJ.getContext();
        o.LJIIIIZZ(context, "searchBar.context");
        DetailFeedSearchHelper.LJIILJJIL(false, LJ, map, map2, DetailFeedSearchHelper.LIZIZ(context), null);
        if (((Number) C34476Dg0.LIZ.getValue()).intValue() == 3 && (!a.LJIIIZ().LIZJ())) {
            LifecycleOwner lifecycleOwner = this.LJLJJI;
            String awemeId = this.LJLJJL;
            o.LJIIIIZZ(awemeId, "awemeId");
            detailFeedSearchHelper.LJIIJJI(lifecycleOwner, LJ, awemeId, this.LJLILLLLZI, this.LJLJI.element);
            return;
        }
        DetailFeedSearchHelper.LJIIIIZZ(LJ, null, this.LJLILLLLZI, this.LJLJI.element);
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
