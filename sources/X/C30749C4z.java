package X;

import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;

/* renamed from: X.C4z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30749C4z implements InterfaceC31013CFd {
    public final /* synthetic */ CKO LIZ;

    @Override // X.InterfaceC31013CFd
    public final int LIZ() {
        IFilterManager videoFilterMgr;
        LiveCore liveCore = this.LIZ.LJ;
        if (liveCore != null && (videoFilterMgr = liveCore.getVideoFilterMgr()) != null) {
            return videoFilterMgr.getBufferBlockCnd();
        }
        return 0;
    }

    @Override // X.InterfaceC31013CFd
    public final int LIZIZ() {
        IFilterManager videoFilterMgr;
        LiveCore liveCore = this.LIZ.LJ;
        if (liveCore != null && (videoFilterMgr = liveCore.getVideoFilterMgr()) != null) {
            return videoFilterMgr.getEffectProcessError();
        }
        return 0;
    }

    public C30749C4z(CKO cko) {
        this.LIZ = cko;
    }
}
