package com.bytedance.gift.render.engine.alphaplayer;

import X.C32224Ckm;
import X.C32231Ckt;
import X.C32449CoP;
import X.C37075Egp;
import X.C78185UmL;
import X.C78197UmX;
import X.EnumC78220Umu;
import X.InterfaceC32440CoG;
import X.InterfaceC37074Ego;
import X.InterfaceC78233Un7;
import X.J03;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AlphaPlayerRenderer implements InterfaceC78233Un7 {
    public boolean isResReady(C32449CoP request) {
        o.LJIIIZ(request, "request");
        return false;
    }

    @Override // X.InterfaceC78233Un7
    public boolean support() {
        return true;
    }

    @Override // X.InterfaceC78233Un7
    public EnumC78220Umu getType() {
        return EnumC78220Umu.ALPHA_PLAYER;
    }

    @Override // X.InterfaceC78233Un7
    public boolean canRender(C32449CoP request) {
        o.LJIIIZ(request, "request");
        Effect effect = request.LIZ;
        if (effect != null) {
            int i = effect.LIZ().resourceType;
            int i2 = AssetsModel.RESOURCE_TYPE_MP4;
            if (i == i2 || effect.LIZ().downgradeResourceType == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC78233Un7
    public InterfaceC32440CoG create(C32449CoP request) {
        o.LJIIIZ(request, "request");
        J03 j03 = null;
        if (!canRender(request)) {
            return null;
        }
        C32224Ckm c32224Ckm = C32231Ckt.LIZ;
        if (c32224Ckm != null) {
            j03 = c32224Ckm.LJFF;
        }
        return new C78197UmX(request, j03, new C78185UmL(request));
    }

    @Override // X.InterfaceC78233Un7
    public InterfaceC37074Ego createDowngradeDecisionMaker(C32449CoP request) {
        o.LJIIIZ(request, "request");
        return new C37075Egp();
    }
}
