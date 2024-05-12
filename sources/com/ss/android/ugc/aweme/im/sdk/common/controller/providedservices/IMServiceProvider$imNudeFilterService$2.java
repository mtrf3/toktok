package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C100653xF;
import X.InterfaceC65784Pro;
import X.InterfaceC71996SNk;

/* loaded from: classes2.dex */
public final class IMServiceProvider$imNudeFilterService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C100653xF> {
    public static final IMServiceProvider$imNudeFilterService$2 INSTANCE = new IMServiceProvider$imNudeFilterService$2();

    public IMServiceProvider$imNudeFilterService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3xF] */
    @Override // X.InterfaceC65784Pro
    public final C100653xF invoke() {
        return new InterfaceC71996SNk() { // from class: X.3xF
            @Override // X.InterfaceC71996SNk
            public final boolean isEnabled() {
                return C53181Ku1.LIZ();
            }
        };
    }
}
