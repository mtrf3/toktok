package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class UserAgreement extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("landing_agreement")
    public final String landingAgreement;

    @InterfaceC65349Pkn("pa_agreement")
    public final String paAgreement;

    public static /* synthetic */ UserAgreement copy$default(UserAgreement userAgreement, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAgreement.landingAgreement;
        }
        if ((i & 2) != 0) {
            str2 = userAgreement.paAgreement;
        }
        return userAgreement.copy(str, str2);
    }

    public final UserAgreement copy(String landingAgreement, String paAgreement) {
        o.LJIIIZ(landingAgreement, "landingAgreement");
        o.LJIIIZ(paAgreement, "paAgreement");
        return new UserAgreement(landingAgreement, paAgreement);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.landingAgreement, this.paAgreement};
    }

    public final String getLandingAgreement() {
        return this.landingAgreement;
    }

    public final String getPaAgreement() {
        return this.paAgreement;
    }

    public UserAgreement(String landingAgreement, String paAgreement) {
        o.LJIIIZ(landingAgreement, "landingAgreement");
        o.LJIIIZ(paAgreement, "paAgreement");
        this.landingAgreement = landingAgreement;
        this.paAgreement = paAgreement;
    }
}
