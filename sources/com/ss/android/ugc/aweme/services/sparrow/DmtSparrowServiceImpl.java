package com.ss.android.ugc.aweme.services.sparrow;

import X.C221108m2;
import X.C5H3;
import X.InterfaceC41766GaI;
import X.InterfaceC41977Gdh;
import X.InterfaceC42355Gjn;
import X.InterfaceC42356Gjo;

/* loaded from: classes8.dex */
public final class DmtSparrowServiceImpl implements InterfaceC42355Gjn {
    public final C5H3 frameVerificationService$delegate = C221108m2.LIZIZ(DmtSparrowServiceImpl$frameVerificationService$2.INSTANCE);
    public final C5H3 publishXService$delegate = C221108m2.LIZIZ(DmtSparrowServiceImpl$publishXService$2.INSTANCE);
    public final C5H3 draftMonitorService$delegate = C221108m2.LIZIZ(DmtSparrowServiceImpl$draftMonitorService$2.INSTANCE);

    @Override // X.InterfaceC42355Gjn
    public InterfaceC41977Gdh getDraftMonitorService() {
        return (InterfaceC41977Gdh) this.draftMonitorService$delegate.getValue();
    }

    @Override // X.InterfaceC42355Gjn
    public InterfaceC42356Gjo getFrameVerificationService() {
        return (InterfaceC42356Gjo) this.frameVerificationService$delegate.getValue();
    }

    @Override // X.InterfaceC42355Gjn
    public InterfaceC41766GaI getPublishXService() {
        return (InterfaceC41766GaI) this.publishXService$delegate.getValue();
    }
}
