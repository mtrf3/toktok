package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import kotlin.jvm.internal.o;
import webcast.api.room.FrequencyControlData;

/* renamed from: X.XuW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86336XuW implements InterfaceC28696BOa {
    public final /* synthetic */ LivePreviewGuideEnterVM LJLIL;

    @Override // X.InterfaceC28696BOa
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC28696BOa
    public final void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public C86336XuW(LivePreviewGuideEnterVM livePreviewGuideEnterVM) {
        this.LJLIL = livePreviewGuideEnterVM;
    }

    @Override // X.InterfaceC28696BOa
    public final void LIZ(FrequencyControlData frequencyControlData) {
        InterfaceC92693kP interfaceC92693kP = this.LJLIL.LJLLI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLIL.LJLLI = null;
    }
}
