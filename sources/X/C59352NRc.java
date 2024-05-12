package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* renamed from: X.NRc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59352NRc implements NST {
    public final int LIZ;
    public final int LIZIZ;
    public final C59357NRh LIZJ;
    public final NGR LIZLLL;
    public final IVideoPlayTaskManager LJ;
    public final NGA LJFF;
    public final boolean LJI;

    @Override // X.InterfaceC59369NRt
    public final IVideoPlayTaskManager LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC59369NRt
    public final C59357NRh LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59369NRt
    public final NGR LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC59369NRt
    public final boolean LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC59369NRt
    public final NGA getLogger() {
        return this.LJFF;
    }

    public C59352NRc(Integer num, Integer num2, C59357NRh c59357NRh, ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa) {
        boolean z;
        AdFoldButtonInfoStruct foldButton;
        this.LIZ = num.intValue();
        this.LIZIZ = num2.intValue();
        this.LIZJ = c59357NRh;
        this.LIZLLL = viewOnClickListenerC59350NRa.LJLLILLLL;
        this.LJ = viewOnClickListenerC59350NRa.LJLIL.LIZIZ();
        this.LJFF = viewOnClickListenerC59350NRa.LJLLJ;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = viewOnClickListenerC59350NRa.LJLJJI;
        if (adDescriptiveCTAStruct != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null) {
            z = foldButton.getDisableFoldCTA();
        } else {
            z = false;
        }
        this.LJI = z;
    }
}
