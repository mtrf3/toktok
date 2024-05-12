package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CPT extends CQO<ScreenMessage> {
    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        ScreenMessage screenMessage = (ScreenMessage) this.LJIJJLI;
        return CPR.LIZJ(screenMessage.userInfo, "：", screenMessage.content, R.color.a58, R.color.a8j, this);
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((ScreenMessage) this.LJIJJLI).userInfo;
    }

    public CPT(ScreenMessage screenMessage) {
        super(screenMessage);
    }
}
