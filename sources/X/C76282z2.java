package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import kotlin.jvm.internal.AqS55S1100000_1;

/* renamed from: X.2z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C76282z2 extends TBS implements InterfaceC88473Ynt<UserRecommendationContent.RecUserInfo, Integer, Integer, C76800UCe> {
    public C76282z2(Object obj) {
        super(3, obj, ViewOnClickListenerC85343Wo.class, "onFollowClicked", "onFollowClicked(Lcom/ss/android/ugc/aweme/im/sdk/chat/data/model/UserRecommendationContent$RecUserInfo;II)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(UserRecommendationContent.RecUserInfo recUserInfo, Integer num, Integer num2) {
        String userId;
        InterfaceC79150V4o remove;
        UserRecommendationContent.RecUserInfo recUserInfo2 = recUserInfo;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        FakeMessageViewModel fakeMessageViewModel = ((AbstractC779033y) this.receiver).LLIIIILZ;
        if (fakeMessageViewModel != null && recUserInfo2 != null && (userId = recUserInfo2.getUserId()) != null) {
            StringBuilder LJ = AnonymousClass028.LJ("onFollowClicked: ", userId, ", oldStatus=", intValue, ", newStatus=");
            LJ.append(intValue2);
            C34B.LJI("UserRecCardViewModel", X1D.LIZIZ(LJ));
            EnumC57435MgR enumC57435MgR = EnumC57435MgR.UNFOLLOW;
            if (intValue == enumC57435MgR.getValue()) {
                XKQ LIZLLL = XKX.LIZLLL(fakeMessageViewModel.LJLJI, null, null, new C68932nB(fakeMessageViewModel, userId, null), 3);
                fakeMessageViewModel.LJLJJL.put(userId, LIZLLL);
                LIZLLL.LJJIII(new AqS55S1100000_1(fakeMessageViewModel, userId, 18));
            } else if (intValue2 == enumC57435MgR.getValue() && (remove = fakeMessageViewModel.LJLJJL.remove(userId)) != null) {
                remove.LIZIZ(null);
            }
            if (intValue2 == EnumC57435MgR.FOLLOWED.getValue() || intValue2 == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                C7ZH.LIZIZ(EnumC57365MfJ.FOLLOW, recUserInfo2.getUser(), recUserInfo2.getMatchedFriends());
            }
        }
        return C76800UCe.LIZ;
    }
}
