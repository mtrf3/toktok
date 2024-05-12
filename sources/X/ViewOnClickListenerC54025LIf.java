package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.interfaces.INearbyFeedAbility;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.LIf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC54025LIf implements View.OnClickListener {
    public final Context LJLIL;

    public ViewOnClickListenerC54025LIf(Context context) {
        this.LJLIL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC53895LDf rv0;
        String LJIIL;
        FeedNearbyFragment feedNearbyFragment;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI == null) {
            return;
        }
        if (o.LJ(C116694i1.LIZ(LJJIFFI).nv0(), "Nearby")) {
            if (!NearbyTabConfig.LJFF()) {
                return;
            }
            Fragment Ja = C116694i1.LIZ(LJJIFFI).Ja("Nearby");
            if (!(Ja instanceof FeedNearbyFragment) || (feedNearbyFragment = (FeedNearbyFragment) Ja) == null || (((C54665Lcr) feedNearbyFragment.Il().getState()).getRefreshState() instanceof C72922tc)) {
                return;
            }
            C2U8.LIZ(new LJK(8));
            feedNearbyFragment.ub(true);
            LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0();
            if (Xm0 != null) {
                Xm0.LJJ("Nearby");
                return;
            }
            return;
        }
        String nv0 = C116694i1.LIZ(LJJIFFI).nv0();
        if (nv0 != null && (rv0 = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).rv0(nv0)) != null && (LJIIL = rv0.LJIIL()) != null) {
            nv0 = LJIIL;
        }
        INearbyFeedAbility iNearbyFeedAbility = (INearbyFeedAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), INearbyFeedAbility.class, null);
        if (iNearbyFeedAbility != null) {
            iNearbyFeedAbility.Kr();
        }
        com.bytedance.hox.Hox LIZ = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI);
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "MainPage");
        bundle.putString("enter_method", "click_bottom");
        LIZ.Cv0(bundle, "Nearby");
        LQ8.LIZ(nv0, "click_button_icon");
    }
}
