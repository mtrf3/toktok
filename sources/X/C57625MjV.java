package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.MjV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57625MjV implements G27 {
    public final /* synthetic */ RecSwipeCardListAssem LJLIL;

    public C57625MjV(RecSwipeCardListAssem recSwipeCardListAssem) {
        this.LJLIL = recSwipeCardListAssem;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        RecSwipeCardListAssem recSwipeCardListAssem = this.LJLIL;
        ViewGroup.LayoutParams layoutParams = recSwipeCardListAssem.getContainerView().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "containerView.layoutParams");
        recSwipeCardListAssem.Z3(layoutParams);
        this.LJLIL.getContainerView().setLayoutParams(this.LJLIL.getContainerView().getLayoutParams());
        C57586Mis c57586Mis = this.LJLIL.LL;
        if (c57586Mis != null) {
            c57586Mis.notifyDataSetChanged();
        } else {
            o.LJIJI("adapter");
            throw null;
        }
    }
}
