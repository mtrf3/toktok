package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.DiggMessage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CPS extends CQO<DiggMessage> {
    @Override // X.CQO, X.CQL, X.InterfaceC31347CRz
    public final boolean LJJZ() {
        return true;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((DiggMessage) this.LJIJJLI).user;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        String str;
        C15380j0.LIZLLL();
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL != null) {
            str = LIZLLL.getResources().getString(R.string.sxz);
        } else {
            str = "lit";
        }
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        return CPR.LIZJ(((DiggMessage) this.LJIJJLI).user, " ", str, R.color.a58, R.color.a5_, this);
    }

    public CPS(DiggMessage diggMessage) {
        super(diggMessage);
    }
}
