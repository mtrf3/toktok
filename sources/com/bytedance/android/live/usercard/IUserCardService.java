package com.bytedance.android.live.usercard;

import X.ActivityC45651qj;
import X.C29448Bh6;
import X.C29484Bhg;
import X.C29496Bhs;
import X.InterfaceC06390Mx;
import X.InterfaceC29489Bhl;
import android.content.Context;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.android.livesdk.usercard.profilev3.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public interface IUserCardService extends InterfaceC06390Mx {
    public static final C29496Bhs LJIIIZ = C29496Bhs.LIZ;

    void Ji0(ActivityC45651qj activityC45651qj, long j, Room room, User user, long j2);

    C29448Bh6 Ln0(C29484Bhg c29484Bhg, User user, DataChannel dataChannel);

    void Ls0(ActivityC45651qj activityC45651qj, FollowPair followPair);

    TryModeLiveProfileDialog Uz(long j, User user);

    LiveProfileDialog k60(Context context, boolean z, long j, Room room, User user, String str, UserProfileEvent userProfileEvent, DataChannel dataChannel);

    <T> void nw(InterfaceC29489Bhl<T> interfaceC29489Bhl, int i);

    void uP(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner);

    SparseArray<InterfaceC29489Bhl<?>> wP();

    void x9(ActivityC45651qj activityC45651qj, User user);
}
