package X;

import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

/* loaded from: classes8.dex */
public final class I2V implements ResourceFinder {
    public final /* synthetic */ IAVEffectService.ResourceFinder LIZ;

    public I2V(IAVEffectService.ResourceFinder resourceFinder) {
        this.LIZ = resourceFinder;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j) {
        return this.LIZ.createNativeResourceFinder(j);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j) {
        this.LIZ.release(j);
    }
}
