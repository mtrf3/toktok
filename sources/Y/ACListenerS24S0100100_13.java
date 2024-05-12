package Y;

import X.AnonymousClass030;
import X.C2NU;
import X.C6ZT;
import X.SY4;
import X.UQ6;
import X.UQI;
import android.view.View;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ACListenerS24S0100100_13 implements View.OnClickListener {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS24S0100100_13 aCListenerS24S0100100_13, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        ((SocialConsentFragment) aCListenerS24S0100100_13.l0).wl(true);
        long currentTimeMillis = System.currentTimeMillis() - aCListenerS24S0100100_13.j1;
        UQI uqi = ((SocialConsentFragment) aCListenerS24S0100100_13.l0).LJLJI;
        if (uqi != null) {
            int socialRecType = uqi.getSocialRecType();
            UQI uqi2 = ((SocialConsentFragment) aCListenerS24S0100100_13.l0).LJLJI;
            if (uqi2 != null) {
                UQ6.LIZIZ(socialRecType, uqi2.getStep(), currentTimeMillis, "skip");
                return;
            } else {
                o.LJIJI("consentConfig");
                throw null;
            }
        }
        o.LJIJI("consentConfig");
        throw null;
    }

    public static final void onClick$1(ACListenerS24S0100100_13 aCListenerS24S0100100_13, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        SocialRecFlowModel Al = ((SocialConsentFragment) aCListenerS24S0100100_13.l0).Al();
        if (Al != null) {
            Al.LJLJI = true;
        }
        view.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            SY4 sy4 = (SY4) ((SocialConsentFragment) aCListenerS24S0100100_13.l0)._$_findCachedViewById(R.id.brl);
            if (sy4 != null && sy4.LLI) {
                return;
            }
            SY4 sy42 = (SY4) ((SocialConsentFragment) aCListenerS24S0100100_13.l0)._$_findCachedViewById(R.id.brl);
            if (sy42 != null) {
                sy42.setLoading(true);
            }
            long currentTimeMillis = System.currentTimeMillis() - aCListenerS24S0100100_13.j1;
            UQI uqi = ((SocialConsentFragment) aCListenerS24S0100100_13.l0).LJLJI;
            if (uqi != null) {
                int socialRecType = uqi.getSocialRecType();
                UQI uqi2 = ((SocialConsentFragment) aCListenerS24S0100100_13.l0).LJLJI;
                if (uqi2 != null) {
                    UQ6.LIZIZ(socialRecType, uqi2.getStep(), currentTimeMillis, "sync");
                    SocialConsentFragment socialConsentFragment = (SocialConsentFragment) aCListenerS24S0100100_13.l0;
                    UQI uqi3 = socialConsentFragment.LJLJI;
                    if (uqi3 != null) {
                        int socialRecType2 = uqi3.getSocialRecType();
                        UQI uqi4 = ((SocialConsentFragment) aCListenerS24S0100100_13.l0).LJLJI;
                        if (uqi4 != null) {
                            socialConsentFragment.Gl(socialRecType2, uqi4.getStep());
                            return;
                        } else {
                            o.LJIJI("consentConfig");
                            throw null;
                        }
                    }
                    o.LJIJI("consentConfig");
                    throw null;
                }
                o.LJIJI("consentConfig");
                throw null;
            }
            o.LJIJI("consentConfig");
            throw null;
        }
        AnonymousClass030.LJ(view, R.string.img);
    }

    public ACListenerS24S0100100_13(SocialConsentFragment socialConsentFragment, long j, int i) {
        this.$t = i;
        this.l0 = socialConsentFragment;
        this.j1 = j;
    }
}
