package com.bytedance.ies.ugc.aweme.commercialize.scene.impl;

import X.C55495LqF;
import X.C55737Lu9;
import X.C58096Mr6;
import X.NIN;
import X.NIO;
import X.NIV;
import X.NIX;
import X.NT2;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;

/* loaded from: classes11.dex */
public final class AdSceneServiceImpl implements IAdSceneService {
    public static IAdSceneService LJII() {
        Object LIZ = C58096Mr6.LIZ(IAdSceneService.class, false);
        if (LIZ != null) {
            return (IAdSceneService) LIZ;
        }
        if (C58096Mr6.LJIJJ == null) {
            synchronized (IAdSceneService.class) {
                if (C58096Mr6.LJIJJ == null) {
                    C58096Mr6.LJIJJ = new AdSceneServiceImpl();
                }
            }
        }
        return C58096Mr6.LJIJJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final NIO LIZ() {
        return new NIO();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final C55495LqF LIZIZ() {
        return new C55495LqF();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final NIX LIZLLL() {
        return new NIX();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final NIV LJ() {
        return new NIV();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final C55737Lu9 LJFF() {
        return new C55737Lu9();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final NIN LJI() {
        return new NIN();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final NT2 LIZJ() {
        return NT2.LIZ;
    }
}
