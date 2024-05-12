package X;

import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;

/* renamed from: X.ac8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94136ac8 implements ResourceFinder {
    public final AssetResourceFinder LIZ = new AssetResourceFinder(C81725W5p.LIZ.getAssets(), "");

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j) {
        this.LIZ.createNativeResourceFinder(j);
        return DownloadableModelSupport.getInstance().getResourceFinder().createNativeResourceFinder(j);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j) {
        this.LIZ.release(j);
    }
}
