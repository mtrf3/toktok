package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.bytedance.keva.Keva;

/* loaded from: classes16.dex */
public final class TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 INSTANCE = new TwoStepVerificationService$Companion$isNewTo2svEnhancements$2();

    public TwoStepVerificationService$Companion$isNewTo2svEnhancements$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Keva keva = TwoStepVerificationService.keva;
        if (keva.contains("is_new_to_2sv_enhancements")) {
            return Boolean.valueOf(keva.getBoolean("is_new_to_2sv_enhancements", false));
        }
        return Boolean.TRUE;
    }
}
