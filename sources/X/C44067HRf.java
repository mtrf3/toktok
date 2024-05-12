package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.HRf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44067HRf implements InterfaceC44082HRu {
    public final /* synthetic */ C44065HRd LIZ;

    @Override // X.InterfaceC44082HRu
    public final void LIZIZ() {
        this.LIZ.LJ = null;
        C188727au c188727au = new C188727au();
        C44065HRd c44065HRd = this.LIZ;
        c188727au.LJIIIZ("creation_id", c44065HRd.LJIJ);
        c188727au.LJ(System.currentTimeMillis() - c44065HRd.LJIJI, "loading_duration");
        Aweme aweme = c44065HRd.LIZLLL;
        if (aweme != null) {
            c188727au.LJIIIZ("group_id", aweme.getVideo().getPlayAddrH264().getSourceId());
            c188727au.LJIIIZ("content_source", "shoot");
            c188727au.LJIIIZ("content_type", "video");
            c188727au.LJI("loading_type", "video");
            AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_cancel_loading", c188727au.LIZ);
            return;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    public C44067HRf(C44065HRd c44065HRd) {
        this.LIZ = c44065HRd;
    }
}
