package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;

/* renamed from: X.Eji, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37254Eji implements InterfaceC37126Ehe {
    public final Runnable LJLIL;

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
    }

    public C37254Eji(Runnable runnable) {
        this.LJLIL = runnable;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String str, boolean z) {
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        if (LIZLLL.LIZJ() != null) {
            Context LIZIZ = EF7.LIZIZ();
            LIZLLL.LIZJ().getClass();
            C39647FhD.LIZLLL(LIZIZ);
        }
        Runnable runnable = this.LJLIL;
        if (runnable != null) {
            runnable.run();
        }
    }
}
