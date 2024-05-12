package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdkapi.host.IHostAction;

/* renamed from: X.Bov, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29933Bov implements InterfaceC60142Nj0 {
    @Override // X.InterfaceC60142Nj0
    public final View LIZ() {
        Activity activity;
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            activity = iHostAction.getTopActivity();
        } else {
            activity = null;
        }
        return ((IGiftService) CN1.LIZ(IGiftService.class)).generateCPCTopView(activity, C29934Bow.LJLIL);
    }
}
