package X;

import com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy;
import defpackage.e1;

/* renamed from: X.HkV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44947HkV implements InterfaceC44948HkW {
    public static final /* synthetic */ C44947HkV LJIILL = new C44947HkV();
    public final /* synthetic */ InterfaceC44948HkW LJIILJJIL;

    @Override // X.InterfaceC44948HkW
    public final int getOpenAlbumOptiGroup() {
        return this.LJIILJJIL.getOpenAlbumOptiGroup();
    }

    @Override // X.InterfaceC44948HkW
    public final boolean isOpenAlbumThreeColumnsOpti() {
        return this.LJIILJJIL.isOpenAlbumThreeColumnsOpti();
    }

    @Override // X.InterfaceC44948HkW
    public final boolean isOpenStopVideoPlayerOpti() {
        return this.LJIILJJIL.isOpenStopVideoPlayerOpti();
    }

    @Override // X.InterfaceC44948HkW
    public final boolean isOpenTaskDegradationOpti() {
        return this.LJIILJJIL.isOpenTaskDegradationOpti();
    }

    public C44947HkV() {
        InterfaceC44948HkW interfaceC44948HkW;
        if (e1.LIZ(31744, "creative_tools_open_performance_bytebench", true, false)) {
            InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
            if (LIZIZ == null || (interfaceC44948HkW = (InterfaceC44948HkW) LIZIZ.LJIILJJIL(PerformanceOptiStrategy.class)) == null) {
                interfaceC44948HkW = C52391KhH.LJIILJJIL;
            }
        } else {
            interfaceC44948HkW = C52391KhH.LJIILJJIL;
        }
        this.LJIILJJIL = interfaceC44948HkW;
    }
}
