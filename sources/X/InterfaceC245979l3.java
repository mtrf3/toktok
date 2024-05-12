package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.9l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC245979l3 extends C8VB<C57470Mh0> {
    void onFollowFail(Exception exc);

    void onFollowSuccess(FollowStatus followStatus);

    void removeFollower();

    @Override // X.C8VB, X.C8V9
    /* bridge */ /* synthetic */ String serviceKey();

    void showFollowRequestTip(User user);
}
