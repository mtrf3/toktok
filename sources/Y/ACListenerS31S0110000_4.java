package Y;

import X.ALQ;
import X.ActivityC45651qj;
import X.C0H1;
import X.C6ZT;
import X.C73318Sq2;
import X.C73969T1h;
import X.T16;
import android.view.View;
import com.ss.android.ugc.aweme.feed.prompt.PromptHistoryFragment;
import com.ss.android.ugc.aweme.live.notification.repository.NotificationNudgeApi;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class ACListenerS31S0110000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS31S0110000_4 aCListenerS31S0110000_4, View view) {
        String uid;
        NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) aCListenerS31S0110000_4.l0;
        String str = notificationLiveBottomDialog.LJLJJI;
        String str2 = notificationLiveBottomDialog.LJLJJL;
        User user = notificationLiveBottomDialog.LJLIL;
        String str3 = null;
        if (user != null) {
            str3 = user.getUid();
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        ALQ.LIZIZ("click", str, str2, str3);
        if (aCListenerS31S0110000_4.z1) {
            NotificationLiveBottomDialog notificationLiveBottomDialog2 = (NotificationLiveBottomDialog) aCListenerS31S0110000_4.l0;
            C73318Sq2 c73318Sq2 = notificationLiveBottomDialog2.LJLLJ;
            User user2 = notificationLiveBottomDialog2.LJLIL;
            if (user2 != null && (uid = user2.getUid()) != null) {
                str4 = uid;
            }
            c73318Sq2.LIZ(NotificationNudgeApi.LIZ().nudgeAnchor(str4).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(notificationLiveBottomDialog2, 157), new AfS56S0100000_4(notificationLiveBottomDialog2, 158)));
            return;
        }
        NotificationLiveBottomDialog.Nl((NotificationLiveBottomDialog) aCListenerS31S0110000_4.l0, R.string.nin);
    }

    public static final void onClick$1(ACListenerS31S0110000_4 aCListenerS31S0110000_4, View view) {
        if (C6ZT.LIZ(view) || aCListenerS31S0110000_4.z1) {
            return;
        }
        new PromptHistoryFragment().xl((ActivityC45651qj) aCListenerS31S0110000_4.l0, C0H1.LIZ("enter_method", "success_toast_panel"));
    }

    public ACListenerS31S0110000_4(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
