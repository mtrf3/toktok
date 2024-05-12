package X;

import android.content.Context;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AME extends AbstractC65781Prl implements InterfaceC88471Ynr<PushSettingFollowListAdapter.FollowItemViewHolder, UserState, C76800UCe> {
    public static final AME LJLIL = new AME();

    public AME() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PushSettingFollowListAdapter.FollowItemViewHolder followItemViewHolder, UserState userState) {
        ListMiddleware<NotificationChoiceState, Object, C72909SjR> listMiddleware;
        ListMiddleware<NotificationChoiceState, Object, C72909SjR> listMiddleware2;
        PushSettingFollowListAdapter.FollowItemViewHolder subscribe = followItemViewHolder;
        UserState it = userState;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(it, "it");
        AbstractC26082ALm<FollowStatus> followStatus = it.getFollowStatus();
        if (followStatus instanceof C173936s9) {
            subscribe.M(it.getUser());
        } else if (followStatus instanceof C163586bS) {
            Context context = subscribe.itemView.getContext();
            AbstractC26082ALm<FollowStatus> followStatus2 = it.getFollowStatus();
            o.LJII(followStatus2, "null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
            C1A7.LJIJJLI(context, ((C163586bS) followStatus2).LIZ, R.string.gjc);
        } else if (followStatus instanceof C26092ALw) {
            subscribe.M(it.getUser());
        }
        if (it.getUser().getFollowStatus() == 0) {
            PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) subscribe.LJLJL.getValue();
            if (pushSettingNotificationChoiceViewModel != null && (listMiddleware2 = pushSettingNotificationChoiceViewModel.LJLL) != null) {
                listMiddleware2.LJIIIZ(C61878OQg.INSTANCE);
            }
            PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel2 = (PushSettingNotificationChoiceViewModel) subscribe.LJLJL.getValue();
            if (pushSettingNotificationChoiceViewModel2 != null && (listMiddleware = pushSettingNotificationChoiceViewModel2.LJLL) != null) {
                listMiddleware.refresh();
            }
        }
        return C76800UCe.LIZ;
    }
}
