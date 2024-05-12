package com.ss.android.ugc.aweme.commerce.tools.challenge;

import X.C41660GWq;
import X.C58096Mr6;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsChallengeService implements ICommerceToolsChallengeService {
    public static ICommerceToolsChallengeService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsChallengeService.class, false);
        if (LIZ != null) {
            return (ICommerceToolsChallengeService) LIZ;
        }
        if (C58096Mr6.LLLF == null) {
            synchronized (ICommerceToolsChallengeService.class) {
                if (C58096Mr6.LLLF == null) {
                    C58096Mr6.LLLF = new CommerceToolsChallengeService();
                }
            }
        }
        return C58096Mr6.LLLF;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService
    public final void LIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        Serializable serializable;
        boolean z;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (bundle != null) {
            serializable = bundle.getSerializable("extra_open_record_challenge");
        } else {
            serializable = null;
        }
        AVChallenge aVChallenge = (AVChallenge) serializable;
        shortVideoContext.creativeModel.commerceModel.setRecordChallenge(aVChallenge);
        if (aVChallenge != null) {
            z = aVChallenge.isCommerce;
        } else {
            z = false;
        }
        C41660GWq.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService
    public final void LIZIZ(Intent intent, Intent intent2) {
        if (intent != null && intent.hasExtra("extra_open_record_challenge")) {
            intent2.putExtra("extra_open_record_challenge", intent.getSerializableExtra("extra_open_record_challenge"));
        }
    }
}
