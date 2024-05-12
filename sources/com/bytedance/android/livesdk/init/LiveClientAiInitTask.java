package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.AnonymousClass233;
import X.AnonymousClass234;
import X.C0IT;
import X.C141335gf;
import X.C18180nW;
import X.C30443Bx9;
import X.C3C5;
import X.C518321r;
import X.C518421s;
import X.C5H3;
import X.C76800UCe;
import X.CN1;
import X.FQE;
import X.InterfaceC30950CCs;
import X.T16;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public final class LiveClientAiInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "live_client_ai_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        Object LIZ;
        LiveClientTriggerConfig liveClientTriggerConfig = LiveClientTriggerConfig.INSTANCE;
        if (liveClientTriggerConfig.enable()) {
            C518321r resolve = C518321r.LJLIL;
            C518421s reject = C518421s.LJLIL;
            o.LJIIIZ(resolve, "resolve");
            o.LJIIIZ(reject, "reject");
            try {
                C5H3 c5h3 = C18180nW.LIZ;
                FQE fqe = (FQE) c5h3.getValue();
                if (fqe != null) {
                    C5H3 c5h32 = C18180nW.LIZIZ;
                    Object value = c5h32.getValue();
                    o.LJIIIIZZ(value, "<get-hostApp>(...)");
                    Context context = ((IHostAppContext) value).context();
                    o.LJIIIIZZ(context, "hostApp.context()");
                    Object value2 = c5h32.getValue();
                    o.LJIIIIZZ(value2, "<get-hostApp>(...)");
                    String serverDeviceId = ((IHostAppContext) value2).getServerDeviceId();
                    o.LJIIIIZZ(serverDeviceId, "hostApp.serverDeviceId");
                    String LIZ2 = C30443Bx9.LIZ();
                    o.LJIIIIZZ(LIZ2, "getSdkVersion()");
                    Object value3 = c5h32.getValue();
                    o.LJIIIIZZ(value3, "<get-hostApp>(...)");
                    String channel = ((IHostAppContext) value3).getChannel();
                    o.LJIIIIZZ(channel, "hostApp.channel");
                    if (fqe.LIZLLL(serverDeviceId, LIZ2, channel, context) == 0) {
                        int delayDownloadPkgs = liveClientTriggerConfig.delayDownloadPkgs();
                        if (delayDownloadPkgs <= 0 || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
                            FQE fqe2 = (FQE) c5h3.getValue();
                            if (fqe2 != null) {
                                fqe2.LJIIJJI(AnonymousClass233.LJLIL, AnonymousClass234.LJLIL);
                            }
                        } else {
                            T16.LIZ.LIZJ(new Runnable() { // from class: X.0nX
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean LIZ3;
                                    try {
                                        FQE fqe3 = (FQE) C18180nW.LIZ.getValue();
                                        if (fqe3 != null) {
                                            fqe3.LJIIJJI(AnonymousClass233.LJLIL, AnonymousClass234.LJLIL);
                                        }
                                    } finally {
                                        if (LIZ3) {
                                        }
                                    }
                                }
                            }, delayDownloadPkgs, TimeUnit.SECONDS);
                        }
                        resolve.invoke();
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
        }
        C0IT.LIZ();
    }
}
