package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C39126FXe;
import X.C47261Igj;
import X.C58708N2i;
import X.C63832P3k;
import X.C66293Q0b;
import X.OHX;
import X.PPZ;
import com.bytedance.bpea.core.IBPEALazyInit;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* loaded from: classes12.dex */
public final class TTPSystemAPIInit implements IBPEALazyInit {
    public final List<C58708N2i> LIZ;
    public final OHX LIZIZ;
    public final C39126FXe LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final PPZ LJFF;

    public TTPSystemAPIInit() {
        C63832P3k.LIZJ.getClass();
        this.LIZ = C47261Igj.LJJIJIIJI(new C58708N2i("contact", null), new C58708N2i("sensor", null), new C58708N2i("clipboard", C47261Igj.LJJIJIIJI("clipboard_setText", "clipboard_setClip", "clipboard_getText", "clipboard_getClip")), new C58708N2i(C63832P3k.LIZ, null), new C58708N2i("gaid", null), new C58708N2i("country/carrier", null), new C58708N2i("screenRecord", null), new C58708N2i("audio", null), new C58708N2i("video", null), new C58708N2i("screenShot", null), new C58708N2i("location", null));
        this.LIZIZ = new OHX(this);
        this.LIZJ = new C39126FXe();
        this.LIZLLL = C47261Igj.LJJIJIIJI("LiveCoreImpl.switchAudioCapture", "LiveCoreImpl.setAudioMute(false)", "LiveCoreImpl.startAudioCapture", "LiveCoreImpl.resume");
        this.LJ = C47261Igj.LJJIJIIJI("LiveCoreImpl.setAudioMute(true)", "LiveCoreImpl.stopAudioCapture", "LiveCoreImpl.pause");
        this.LJFF = new PPZ(this);
    }

    @Override // com.bytedance.bpea.core.IBPEALazyInit
    public final void LIZ() {
        System.currentTimeMillis();
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("pns_bpea_sandbox_switch", true);
        } catch (Throwable unused) {
        }
        if (!z) {
            return;
        }
        C66293Q0b.LIZ = this.LIZIZ;
        C66293Q0b.LIZIZ = this.LIZJ;
        CertAuthEntry.Companion.setContextInterceptor(this.LJFF);
    }
}
