package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* renamed from: X.NRd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59353NRd implements NSI {
    public final int LIZ;
    public final C59357NRh LIZIZ;
    public final NGR LIZJ;
    public final IVideoPlayTaskManager LIZLLL;
    public final NGA LJ;

    @Override // X.NSI
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC59369NRt
    public final IVideoPlayTaskManager LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC59369NRt
    public final C59357NRh LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC59369NRt
    public final NGR LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59369NRt
    public final NGA getLogger() {
        return this.LJ;
    }

    public C59353NRd(int i, C59357NRh c59357NRh, ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa) {
        AdFoldButtonInfoStruct foldButton;
        this.LIZ = i;
        this.LIZIZ = c59357NRh;
        this.LIZJ = viewOnClickListenerC59350NRa.LJLLILLLL;
        this.LIZLLL = viewOnClickListenerC59350NRa.LJLIL.LIZIZ();
        this.LJ = viewOnClickListenerC59350NRa.LJLLJ;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = viewOnClickListenerC59350NRa.LJLJJI;
        if (adDescriptiveCTAStruct != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null) {
            foldButton.getDisableFoldCTA();
        }
    }
}
