package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;

/* renamed from: X.Hxe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45762Hxe implements IAVEffectService.ResourceFinder {
    public final /* synthetic */ DownloadableModelSupportResourceFinder LIZ;

    public C45762Hxe(DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder) {
        this.LIZ = downloadableModelSupportResourceFinder;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder
    public final long createNativeResourceFinder(long j) {
        return this.LIZ.createNativeResourceFinder(j);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder
    public final void release(long j) {
        this.LIZ.release(j);
    }
}
