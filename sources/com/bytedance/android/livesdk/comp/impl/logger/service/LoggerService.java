package com.bytedance.android.livesdk.comp.impl.logger.service;

import X.BZK;
import X.C1E4;
import X.C28848BTw;
import X.C78443UqV;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LoggerService implements ILoggerService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final C1E4 Mf() {
        return new C1E4();
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final C78443UqV Qs0() {
        return new C78443UqV();
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final BZK la0() {
        return new BZK();
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final C28848BTw Dg(String eventName, boolean z) {
        o.LJIIIZ(eventName, "eventName");
        return new C28848BTw(eventName, z);
    }
}
