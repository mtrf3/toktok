package com.ss.android.ugc.aweme.qainvitation.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C89773fh;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.qainvitation.model.InviteUsersData;
import com.ss.android.ugc.aweme.qainvitation.model.InvitedYouUserListData;
import com.ss.android.ugc.aweme.qainvitation.model.InviteeListData;
import com.ss.android.ugc.aweme.qainvitation.model.RecentContactsData;
import com.ss.android.ugc.aweme.qainvitation.model.UserPrivacyCheckData;

/* loaded from: classes2.dex */
public final class QAInvitationAPI {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C89773fh.LJLIL);

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI$QAInvitationAPI, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0028QAInvitationAPI {
        @E4Q("/tiktok/interaction/mention/general/check/v1")
        AbstractC73672Svk<UserPrivacyCheckData> getFilteredContacts(@InterfaceC64989Pez("mention_type") String str, @InterfaceC64989Pez("uids") String str2);

        @E4Q("/tiktok/v1/forum/question/inviters/")
        AbstractC73672Svk<InvitedYouUserListData> getInvitedList(@InterfaceC64989Pez("user_id") long j, @InterfaceC64989Pez("question_id") long j2, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/tiktok/v1/forum/question/invitees/")
        AbstractC73672Svk<InviteeListData> getInviteeList(@InterfaceC64989Pez("question_id") long j);

        @E4Q("/tiktok/interaction/mention/recent/contact/query/v1")
        AbstractC73672Svk<RecentContactsData> getRecentContacts(@InterfaceC64989Pez("mention_type") int i);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/forum/question/invite/")
        AbstractC73672Svk<InviteUsersData> submitInviteeList(@InterfaceC64987Pex("question_id") long j, @InterfaceC64987Pex("invited_users") String str);
    }
}
