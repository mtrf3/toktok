package X;

import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IVA extends AbstractC73391SrD<Long> {
    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (C84763XOl.LJIIJJI) {
            C62822Ol8 c62822Ol8 = IV8.LJ;
            if (!((IPipFeedService) c62822Ol8.getValue()).isInPipMode()) {
                IWF.LJJLIIIIJ().release();
            } else {
                ((IPipFeedService) c62822Ol8.getValue()).LJIJI(IVB.LJLIL);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        ((Number) obj).longValue();
    }
}
