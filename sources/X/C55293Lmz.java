package X;

import com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel;
import com.ss.android.ugc.feed.platform.cell.im.safety.SafetyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Lmz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55293Lmz implements LNI {
    public final /* synthetic */ ReplyMessagePanel LJLIL;

    public C55293Lmz(ReplyMessagePanel replyMessagePanel) {
        this.LJLIL = replyMessagePanel;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        MediaSafetyModel dMMediaSafetyModel;
        SafetyViewModel safetyViewModel;
        ReplyMessagePanel replyMessagePanel = this.LJLIL;
        if (replyMessagePanel.LLJJLIIIJLLLLLLLZ) {
            replyMessagePanel.LLIIL(null);
            this.LJLIL.LLJJLIIIJLLLLLLLZ = false;
        }
        Aweme LJIILJJIL = C78996UzQ.LJIILJJIL(this.LJLIL.getCurrentAweme());
        if (LJIILJJIL != null && (dMMediaSafetyModel = LJIILJJIL.getDMMediaSafetyModel()) != null && (safetyViewModel = this.LJLIL.LLJJL) != null) {
            boolean hasNegativeAction = dMMediaSafetyModel.getHasNegativeAction();
            String serializedMsg = dMMediaSafetyModel.getStringifiedMsg();
            o.LJIIIZ(serializedMsg, "serializedMsg");
            safetyViewModel.LJLILLLLZI = hasNegativeAction;
            safetyViewModel.LJLJI = serializedMsg;
        }
    }
}
