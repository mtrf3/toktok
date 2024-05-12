package com.bytedance.android.livesdk.layer;

import X.C1O4;
import X.C77044ULo;
import X.UJZ;
import com.bytedance.android.live.layer.ILayerService;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class LayerService implements ILayerService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.layer.ILayerService
    public final C77044ULo An(C1O4 layeredElementContext) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        return new C77044ULo(layeredElementContext);
    }

    @Override // com.bytedance.android.live.layer.ILayerService
    public final UJZ nq(C1O4 layeredElementContext) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        return new UJZ(layeredElementContext);
    }
}
