package X;

import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;

/* renamed from: X.Lmm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55280Lmm {
    public final /* synthetic */ DetailPageComponent LIZ;

    public C55280Lmm(DetailPageComponent detailPageComponent) {
        this.LIZ = detailPageComponent;
    }

    public final void LIZ(float f) {
        View view;
        DetailPageComponent detailPageComponent = this.LIZ;
        IFeedCleanAbility iFeedCleanAbility = detailPageComponent.LLIIII;
        int i = 0;
        if ((iFeedCleanAbility == null || !iFeedCleanAbility.Jr0()) && (view = detailPageComponent.LJLJLJ) != null) {
            view.setAlpha(f);
        }
        View view2 = detailPageComponent.LJLJLJ;
        if (view2 == null) {
            return;
        }
        if (f <= 0.0f) {
            i = 8;
        }
        view2.setVisibility(i);
    }
}
