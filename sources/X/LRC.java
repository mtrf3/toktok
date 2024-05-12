package X;

import android.content.Context;
import com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService;
import com.ss.android.ugc.aweme.share.viewmodel.FeedStateVMServiceImpl;

/* loaded from: classes10.dex */
public final class LRC {
    public static final /* synthetic */ LRC LIZ = new LRC();

    public static InterfaceC54249LQv LIZ(Context context) {
        IFeedPanelStateVMService iFeedPanelStateVMService;
        Object LIZ2 = C58096Mr6.LIZ(IFeedPanelStateVMService.class, false);
        if (LIZ2 != null) {
            iFeedPanelStateVMService = (IFeedPanelStateVMService) LIZ2;
        } else {
            if (C58096Mr6.Q6 == null) {
                synchronized (IFeedPanelStateVMService.class) {
                    if (C58096Mr6.Q6 == null) {
                        C58096Mr6.Q6 = new FeedStateVMServiceImpl();
                    }
                }
            }
            iFeedPanelStateVMService = C58096Mr6.Q6;
        }
        return iFeedPanelStateVMService.LIZ(context);
    }
}
