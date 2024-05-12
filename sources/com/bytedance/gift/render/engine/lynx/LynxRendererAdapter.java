package com.bytedance.gift.render.engine.lynx;

import X.C221108m2;
import X.C32449CoP;
import X.C32450CoQ;
import X.C37072Egm;
import X.C5H3;
import X.C78158Ulu;
import X.C78216Umq;
import X.EnumC78220Umu;
import X.InterfaceC32440CoG;
import X.InterfaceC37074Ego;
import X.InterfaceC78242UnG;
import X.O98;
import X.O99;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LynxRendererAdapter implements InterfaceC78242UnG {
    public final O99 lynxContainerCreator;
    public final C5H3 performanceService$delegate;

    public boolean isResReady(C32449CoP request) {
        o.LJIIIZ(request, "request");
        return true;
    }

    @Override // X.InterfaceC78233Un7
    public boolean support() {
        return true;
    }

    private final O98 getPerformanceService() {
        return (O98) this.performanceService$delegate.getValue();
    }

    @Override // X.InterfaceC78242UnG
    public O98 getPerfService() {
        return getPerformanceService();
    }

    @Override // X.InterfaceC78233Un7
    public EnumC78220Umu getType() {
        return EnumC78220Umu.LYNX;
    }

    public LynxRendererAdapter(O99 lynxContainerCreator) {
        o.LJIIIZ(lynxContainerCreator, "lynxContainerCreator");
        this.lynxContainerCreator = lynxContainerCreator;
        this.performanceService$delegate = C221108m2.LIZIZ(new AqS160S0100000_10(this, 18));
    }

    @Override // X.InterfaceC78233Un7
    public boolean canRender(C32449CoP request) {
        AssetsModel assetsModel;
        o.LJIIIZ(request, "request");
        Effect effect = request.LIZ;
        if (effect != null) {
            assetsModel = effect.LIZ();
        } else {
            assetsModel = null;
        }
        if (assetsModel == null || assetsModel.resourceType != AssetsModel.RESOURCE_TYPE_LYNX) {
            return false;
        }
        String str = assetsModel.lynxUrlSettingsKey;
        if ((str == null || str.length() == 0) && assetsModel.lynxResource == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC78233Un7
    public InterfaceC32440CoG create(C32449CoP request) {
        o.LJIIIZ(request, "request");
        if (!canRender(request)) {
            return null;
        }
        return new C78216Umq(C32450CoQ.LIZ(request).getFirst(), this.lynxContainerCreator, new C78158Ulu(request), getPerformanceService());
    }

    @Override // X.InterfaceC78233Un7
    public InterfaceC37074Ego createDowngradeDecisionMaker(C32449CoP request) {
        o.LJIIIZ(request, "request");
        return new C37072Egm();
    }
}
