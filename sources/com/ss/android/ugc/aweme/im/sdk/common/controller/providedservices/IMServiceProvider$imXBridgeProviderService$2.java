package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C100783xS;
import X.InterfaceC100803xU;
import X.InterfaceC65784Pro;
import java.util.List;

/* loaded from: classes2.dex */
public final class IMServiceProvider$imXBridgeProviderService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C100783xS> {
    public static final IMServiceProvider$imXBridgeProviderService$2 INSTANCE = new IMServiceProvider$imXBridgeProviderService$2();

    public IMServiceProvider$imXBridgeProviderService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3xS] */
    @Override // X.InterfaceC65784Pro
    public final C100783xS invoke() {
        return new InterfaceC100803xU() { // from class: X.3xS
            @Override // X.InterfaceC100803xU
            public final List<Class<? extends AbstractC37594EpC<?, ?>>> LIZ() {
                return C47261Igj.LJJIJ(C113194cN.class);
            }
        };
    }
}
