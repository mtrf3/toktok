package com.bytedance.android.live.ai.impl.pitaya;

import X.C29921Fk;
import X.CN1;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.ai.impl.pitaya.services.GiftPanelOpenPredictService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class LiveClientAIServiceImpl implements ILiveClientAIService {
    public C29921Fk LJLIL;

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final IPitayaCore Cx() {
        if (!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            return null;
        }
        final IPitayaCore core = PitayaCoreFactory.getCore("1728");
        Object newProxyInstance = Proxy.newProxyInstance(IPitayaCore.class.getClassLoader(), new Class[]{IPitayaCore.class}, new InvocationHandler() { // from class: X.0IU
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create ");
                LIZ.append(method.getName());
                C0NB.LIZIZ("LiveDebugToolPitayaCoreProxy", X1D.LIZIZ(LIZ));
                return ((IDebugService) CN1.LIZ(IDebugService.class)).D90(IPitayaCore.this, method, objArr);
            }
        });
        o.LJII(newProxyInstance, "null cannot be cast to non-null type com.bytedance.pitaya.api.IPitayaCore");
        return (IPitayaCore) newProxyInstance;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final C29921Fk ni0() {
        if (this.LJLIL == null) {
            this.LJLIL = new C29921Fk();
        }
        C29921Fk c29921Fk = this.LJLIL;
        o.LJI(c29921Fk);
        return c29921Fk;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void M50() {
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void UH() {
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final GiftPanelOpenPredictService Ze0() {
        return GiftPanelOpenPredictService.LJLIL;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void xs() {
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void zh0() {
    }
}
