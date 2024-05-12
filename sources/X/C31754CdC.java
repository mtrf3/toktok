package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.CdC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31754CdC extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C31754CdC LJLIL = new C31754CdC();

    public C31754CdC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context != null) {
            C29889BoD LIZIZ = C29889BoD.LIZIZ(context);
            LIZIZ.LJII(Boolean.TRUE, "anchor_linkmic_disconnect_tips_shown");
            LIZIZ.LIZ();
        }
        return C76800UCe.LIZ;
    }
}
