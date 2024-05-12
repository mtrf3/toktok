package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* renamed from: X.NRb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59351NRb implements NSU {
    public final int LIZ;
    public final Integer LIZIZ;
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

    public C59351NRb(Integer num, int i, C59357NRh c59357NRh, ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa) {
        int i2;
        Integer num2;
        AdFoldButtonInfoStruct foldButton;
        boolean z = false;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.LIZ = i2;
        if (num == null || num.intValue() != i) {
            num2 = Integer.valueOf(i);
        } else {
            num2 = null;
        }
        this.LIZIZ = num2;
        this.LIZJ = c59357NRh;
        this.LIZLLL = viewOnClickListenerC59350NRa.LJLLILLLL;
        this.LJ = viewOnClickListenerC59350NRa.LJLIL.LIZIZ();
        this.LJFF = viewOnClickListenerC59350NRa.LJLLJ;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = viewOnClickListenerC59350NRa.LJLJJI;
        if (adDescriptiveCTAStruct != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null) {
            z = foldButton.getDisableFoldCTA();
        }
        this.LJI = z;
    }
}
