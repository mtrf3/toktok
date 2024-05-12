package com.ss.android.ugc.aweme.services.storage;

import X.C10K;
import X.C5L7;
import X.C60903NvH;
import X.C76800UCe;
import X.C79146V4k;
import X.H78;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StorageServiceImpl implements IAVStorageService {
    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public void checkStorageClean() {
        Keva repoFromSp = KevaImpl.getRepoFromSp(C5L7.LIZ(), "AVStoragePreferences", 0);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(\n         …ants.MODE_SINGLE_PROCESS)");
        if (repoFromSp.getBoolean("key_is_effect_storage_cleaning", false)) {
            H78.LJI("av storage clean not finished last time!!!! effect resources maybe not intact");
            C10K.LIZJ(new Callable() { // from class: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl$checkStorageClean$1
                @Override // java.util.concurrent.Callable
                public final void call() {
                    String str;
                    EffectService companion = EffectService.Companion.getInstance();
                    if (companion != null) {
                        str = companion.getCacheDir();
                    } else {
                        str = null;
                    }
                    C79146V4k.LJJLIIIJJI(str);
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    call();
                    return C76800UCe.LIZ;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public Set<String> getPrefixAllowList() {
        return C60903NvH.LJIIJJI().LJJIJL().getAllowListService().getPrefixAllowList();
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public boolean isMonitorEnabled() {
        return C60903NvH.LJIIJJI().LJJIJL().getMonitor().isEnabled();
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public void setMonitorLocalSwitch(boolean z) {
        C60903NvH.LJIIJJI().LJJIJL().getMonitor().LIZ(z);
    }
}
