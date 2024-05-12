package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.bytedance.keva.Keva;

/* loaded from: classes16.dex */
public final class TwoStepVerificationService$pushChallengeKeva$2 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final TwoStepVerificationService$pushChallengeKeva$2 INSTANCE = new TwoStepVerificationService$pushChallengeKeva$2();

    public TwoStepVerificationService$pushChallengeKeva$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("aweme_open_push_challenge_page_list");
    }
}
