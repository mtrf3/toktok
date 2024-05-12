package X;

import com.bytedance.android.livesdk.watch.IWatchLiveService;
import kotlin.jvm.internal.o;

/* renamed from: X.OjG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62706OjG extends AbstractC62641OiD {
    @Override // X.AbstractC62641OiD
    public final boolean onShot(String imagePath) {
        o.LJIIIZ(imagePath, "imagePath");
        super.onShot(imagePath);
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).pb(imagePath);
        return false;
    }
}
