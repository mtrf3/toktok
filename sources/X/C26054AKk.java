package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* renamed from: X.AKk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26054AKk extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CreativeToastBuilder LJLIL;
    public final /* synthetic */ C26051AKh LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26054AKk(int i, CreativeToastBuilder creativeToastBuilder, C26051AKh c26051AKh) {
        super(0);
        this.LJLIL = creativeToastBuilder;
        this.LJLILLLLZI = c26051AKh;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j;
        CreativeToast.OnDismissListener dismissListener = this.LJLIL.getConfig().getDismissListener();
        if (dismissListener != null) {
            dismissListener.onDismiss(this.LJLILLLLZI);
        }
        int i = this.LJLJI;
        GGO ggo = GGO.DISMISS;
        Long duration = this.LJLIL.getConfig().getDuration();
        if (duration != null) {
            j = duration.longValue();
        } else {
            j = 3000;
        }
        String message = this.LJLIL.getConfig().getMessage();
        if (message == null) {
            Integer messageRes = this.LJLIL.getConfig().getMessageRes();
            if (messageRes != null) {
                C26051AKh c26051AKh = this.LJLILLLLZI;
                int intValue = messageRes.intValue();
                Context context = c26051AKh.LJ;
                if (context != null || (context = c26051AKh.LIZLLL) != null) {
                    message = context.getString(intValue);
                }
            }
            message = null;
        }
        C42303Gix.LIZIZ(i, ggo, j, message);
        return C76800UCe.LIZ;
    }
}
