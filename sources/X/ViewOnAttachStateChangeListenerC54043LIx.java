package X;

import android.view.View;
import com.ss.android.ugc.aweme.mob.event.IHomePageMobProvider;
import com.ss.android.ugc.aweme.mob.event.NearbyHomePageMobProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.LIx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnAttachStateChangeListenerC54043LIx implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C54044LIy LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ActivityC45651qj LJ;
        o.LJIIIZ(view, "view");
        this.LJLIL.removeOnAttachStateChangeListener(this);
        NearbyHomePageMobProvider nearbyHomePageMobProvider = this.LJLILLLLZI.LIZ;
        if (nearbyHomePageMobProvider != null && (LJ = C1DG.LJ(this.LJLJI, "view.context")) != null) {
            C62814Ol0.LJJIJL(C55230Lly.LIZLLL(LJ, null), IHomePageMobProvider.class, nearbyHomePageMobProvider);
        }
    }

    public ViewOnAttachStateChangeListenerC54043LIx(View view, C54044LIy c54044LIy, View view2) {
        this.LJLIL = view;
        this.LJLILLLLZI = c54044LIy;
        this.LJLJI = view2;
    }
}
