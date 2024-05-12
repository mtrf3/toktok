package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* loaded from: classes15.dex */
public final class WZL implements InterfaceC82888Wg0 {
    @Override // X.InterfaceC82888Wg0
    public final void LIZ(Context context, int i, String str) {
        Activity LJIJJ;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && str != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(str);
            C78915Uy7.LJJIIZI(LJIJJ, 6003, creativeToastBuilder);
        }
    }
}
