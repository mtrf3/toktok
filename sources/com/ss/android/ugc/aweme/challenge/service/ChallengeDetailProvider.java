package com.ss.android.ugc.aweme.challenge.service;

import X.C58096Mr6;
import X.C59850NeI;
import X.C59851NeJ;
import X.InterfaceC59852NeK;
import X.T5G;
import X.T67;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public class ChallengeDetailProvider implements IChallengeDetailProvider {
    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final void LIZLLL() {
    }

    public static IChallengeDetailProvider LJ() {
        Object LIZ = C58096Mr6.LIZ(IChallengeDetailProvider.class, false);
        if (LIZ != null) {
            return (IChallengeDetailProvider) LIZ;
        }
        if (C58096Mr6.LLJLIL == null) {
            synchronized (IChallengeDetailProvider.class) {
                if (C58096Mr6.LLJLIL == null) {
                    C58096Mr6.LLJLIL = new ChallengeDetailProvider();
                }
            }
        }
        return C58096Mr6.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final T5G LIZ() {
        return new T5G();
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final void LIZJ(C59851NeJ c59851NeJ) {
        C59850NeI.LIZ.LIZIZ(c59851NeJ);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final T67 LIZIZ(View view, Fragment fragment) {
        return ((InterfaceC59852NeK) C59850NeI.LIZ.LIZ()).LIZIZ(view, fragment);
    }
}
