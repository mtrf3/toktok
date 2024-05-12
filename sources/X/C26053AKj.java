package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* renamed from: X.AKj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26053AKj implements CreativeToast.OnShowListener {
    public final /* synthetic */ CreativeToastBuilder LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C26051AKh LIZJ;

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast.OnShowListener
    public final void onShow(CreativeToast creativeToast) {
        long j;
        CreativeToast.OnShowListener showListener = this.LIZ.getConfig().getShowListener();
        if (showListener != null) {
            showListener.onShow(creativeToast);
        }
        int i = this.LIZIZ;
        GGO ggo = GGO.SHOW;
        Long duration = this.LIZ.getConfig().getDuration();
        if (duration != null) {
            j = duration.longValue();
        } else {
            j = 3000;
        }
        String message = this.LIZ.getConfig().getMessage();
        if (message == null) {
            Integer messageRes = this.LIZ.getConfig().getMessageRes();
            if (messageRes != null) {
                C26051AKh c26051AKh = this.LIZJ;
                int intValue = messageRes.intValue();
                Context context = c26051AKh.LJ;
                if (context != null || (context = c26051AKh.LIZLLL) != null) {
                    message = context.getString(intValue);
                }
            }
            message = null;
        }
        C42303Gix.LIZIZ(i, ggo, j, message);
    }

    public C26053AKj(int i, CreativeToastBuilder creativeToastBuilder, C26051AKh c26051AKh) {
        this.LIZ = creativeToastBuilder;
        this.LIZIZ = i;
        this.LIZJ = c26051AKh;
    }
}
