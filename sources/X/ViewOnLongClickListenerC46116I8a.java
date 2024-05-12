package X;

import android.view.View;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;

/* renamed from: X.I8a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnLongClickListenerC46116I8a implements View.OnLongClickListener {
    public final C46117I8b LJLIL;

    public ViewOnLongClickListenerC46116I8a(C46117I8b c46117I8b) {
        this.LJLIL = c46117I8b;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        PublishTabAbility publishTabAbility;
        C46117I8b c46117I8b = this.LJLIL;
        c46117I8b.getClass();
        if (!((RBY) HG3.LJIILL()).isChildrenMode()) {
            if (C61184Nzo.LIZ.LJFF(c46117I8b.LIZ) == 0 && (publishTabAbility = (PublishTabAbility) c46117I8b.LIZIZ.getValue()) != null && publishTabAbility.MZ() && C76800UCe.LIZ != null && !LRD.LIZ(c46117I8b.LIZ).LJ() && !LRD.LIZ(c46117I8b.LIZ).LIZJ() && !MSAdaptionService.LJIIL().LJI(c46117I8b.LIZ)) {
                PublishTabAbility publishTabAbility2 = (PublishTabAbility) c46117I8b.LIZIZ.getValue();
                if (publishTabAbility2 != null) {
                    publishTabAbility2.Xt0();
                }
                if (view != null) {
                    view.setHapticFeedbackEnabled(true);
                    view.performHapticFeedback(0, 2);
                    view.setHapticFeedbackEnabled(false);
                }
                AVExternalServiceImpl.LIZ().asyncService("direct_shoot", new IDLCallbackS60S0100000_7(c46117I8b, 0));
            }
        }
        return true;
    }
}
