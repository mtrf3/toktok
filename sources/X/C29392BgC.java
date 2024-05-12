package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* renamed from: X.BgC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29392BgC extends CQO<CommentsMessage> {
    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        User user = ((CommentsMessage) this.LJIJJLI).user;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        return CPR.LIZJ(user, "", " ", R.color.a58, R.color.a8j, this);
    }

    public final boolean LLFF() {
        MESSAGE message = this.LJIJJLI;
        if (((CommentsMessage) message).background == null || C79004UzY.LJJIFFI(((CommentsMessage) message).background.getUrls()) || TextUtils.isEmpty((CharSequence) ListProtector.get(((CommentsMessage) this.LJIJJLI).background.getUrls(), 0))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((CommentsMessage) this.LJIJJLI).user;
    }

    public C29392BgC(CommentsMessage commentsMessage) {
        super(commentsMessage);
    }

    public final void LLFFF(TextView textView, Room room, InterfaceC29391BgB interfaceC29391BgB) {
        ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(((CommentsMessage) this.LJIJJLI).background, new C29390BgA(this, new WeakReference(textView), textView.getResources().getDisplayMetrics().density / 3.0f, room, interfaceC29391BgB));
    }
}
