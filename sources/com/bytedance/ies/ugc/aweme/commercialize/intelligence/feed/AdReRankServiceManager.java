package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed;

import X.C221108m2;
import X.C46348IGy;
import X.C58096Mr6;
import X.C62822Ol8;
import X.IIK;
import X.ILE;
import X.InterfaceC48722JAg;
import X.YHR;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AdReRankServiceManager implements IAdReRankServiceManagerService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(IIK.LJLIL);

    public static IAdReRankServiceManagerService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAdReRankServiceManagerService.class, false);
        if (LIZ != null) {
            return (IAdReRankServiceManagerService) LIZ;
        }
        if (C58096Mr6.LJIJI == null) {
            synchronized (IAdReRankServiceManagerService.class) {
                if (C58096Mr6.LJIJI == null) {
                    C58096Mr6.LJIJI = new AdReRankServiceManager();
                }
            }
        }
        return C58096Mr6.LJIJI;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService
    public final void LIZ(ILE scene) {
        o.LJIIIZ(scene, "scene");
        InterfaceC48722JAg interfaceC48722JAg = (InterfaceC48722JAg) ((Map) this.LIZ.getValue()).get(scene.name());
        if (interfaceC48722JAg != null) {
            interfaceC48722JAg.unBind();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService
    public final InterfaceC48722JAg LIZIZ(ILE scene) {
        o.LJIIIZ(scene, "scene");
        InterfaceC48722JAg interfaceC48722JAg = (InterfaceC48722JAg) ((Map) this.LIZ.getValue()).get(scene.name());
        if (interfaceC48722JAg == null) {
            if (C46348IGy.LIZ[scene.ordinal()] == 1) {
                interfaceC48722JAg = new YHR(scene);
            } else {
                throw new IllegalArgumentException("scene not implemented");
            }
        }
        ((Map) this.LIZ.getValue()).put(scene.name(), interfaceC48722JAg);
        return interfaceC48722JAg;
    }
}
