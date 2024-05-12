package X;

import Y.ARunnableS42S0100000_6;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F6Z implements InterfaceC37126Ehe {
    public final Runnable LJLIL;

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String name, boolean z, int i) {
        o.LJIIIZ(name, "name");
    }

    public F6Z(ARunnableS42S0100000_6 aRunnableS42S0100000_6) {
        this.LJLIL = aRunnableS42S0100000_6;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String name, boolean z) {
        o.LJIIIZ(name, "name");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        if (LIZLLL.LIZJ() != null) {
            C37123Ehb.LJIIZILJ(name, C39647FhD.LIZLLL(EF7.LIZIZ()));
        }
        C38423F6d.LIZ.initPitaya(new C38421F6b());
        Runnable runnable = this.LJLIL;
        if (runnable != null) {
            runnable.run();
        }
    }
}
