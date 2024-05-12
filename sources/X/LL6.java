package X;

import Y.ACListenerS44S0200000_9;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import yq4.a;

/* loaded from: classes10.dex */
public final class LL6 implements LL7 {
    @Override // X.LL7
    public final void LIZ(LNP lnp, View view, C51588KMm c51588KMm, View view2) {
        if (a.LJIILL().LJIJ()) {
            C27740Aue.LJIIJJI(false, view2);
            view.setVisibility(0);
            try {
                FFL.LJIIIZ().getClass();
                SpecialTopicEntry specialTopicEntry = (SpecialTopicEntry) FFL.LJIILLIIL(SpecialTopicEntry.class, "special_event_entrypoint", true);
                if (specialTopicEntry != null && specialTopicEntry.getEnable() && !TextUtils.isEmpty(specialTopicEntry.getLandingRoute()) && !TextUtils.isEmpty(specialTopicEntry.getIconUrl())) {
                    if (AV1.LJIIJJI() && !specialTopicEntry.getChildViewable()) {
                        return;
                    }
                    C27740Aue.LJIIJ(true, c51588KMm);
                    C78765Uvh.LJIIIZ(c51588KMm, specialTopicEntry.getIconUrl(), -1, -1);
                    String LLLLLZ = lnp.LLLLLZ();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", LLLLLZ);
                    c188727au.LJIIIZ("type", specialTopicEntry.getEventName());
                    c188727au.LJIIIZ("url", specialTopicEntry.getLandingRoute());
                    FMX.LJIIL("topic_entrance_show", c188727au.LIZ);
                    c51588KMm.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS44S0200000_9(specialTopicEntry, lnp, 3)));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
