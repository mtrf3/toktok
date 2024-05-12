package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.F6m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38432F6m implements InterfaceC37126Ehe {
    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String name, boolean z) {
        o.LJIIIZ(name, "name");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null && LIZLLL.LIZJ() != null) {
            boolean LIZLLL2 = C39647FhD.LIZLLL(EF7.LIZIZ());
            C37123Ehb.LJIIZILJ(name, LIZLLL2);
            if (LIZLLL2 && C38639FEl.LIZIZ() && C38434F6o.LIZ != null) {
                C1A7.LJJIIZI();
            }
        }
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String name, boolean z, int i) {
        o.LJIIIZ(name, "name");
    }
}
