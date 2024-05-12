package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;

/* renamed from: X.HUx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44163HUx implements IAbilityService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(HV0.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C44161HUv.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C44164HUy.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C44162HUw.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C44165HUz.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVCameraService cameraService() {
        return new C62138Oa6();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVEffectService effectService() {
        return (C45754HxW) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVInfoService infoService() {
        return (C43936HMe) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVLoaderService libraryLoaderService() {
        return new C45758Hxa();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVProcessService processService() {
        return (C43957HMz) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVTransformService transformService() {
        return (HON) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IVideo2StickerService video2StickerService() {
        return (C42425Gkv) this.LJ.getValue();
    }
}
