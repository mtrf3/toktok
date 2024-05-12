package Y;

import X.C1FP;
import X.C228798yR;
import X.C228888ya;
import X.C55888Lwa;
import X.C76082yi;
import X.C7H1;
import X.C7H2;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.tag.viewmodel.SocialVideoTagShareVM;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public class AfS15S1200000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS15S1200000_3 afS15S1200000_3, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String text;
        UpvotePublishResponse response = (UpvotePublishResponse) obj;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) afS15S1200000_3.l1;
        OSZ[] oszArr = new OSZ[9];
        String str11 = null;
        if (upvotePublishMobParam != null) {
            str = upvotePublishMobParam.enterFrom;
        } else {
            str = null;
        }
        oszArr[0] = new OSZ(str, "enter_from");
        if (upvotePublishMobParam != null) {
            str2 = upvotePublishMobParam.enterMethod;
        } else {
            str2 = null;
        }
        oszArr[1] = new OSZ(str2, "enter_method");
        if (upvotePublishMobParam != null) {
            str3 = upvotePublishMobParam.groupId;
        } else {
            str3 = null;
        }
        oszArr[2] = new OSZ(str3, "group_id");
        if (upvotePublishMobParam != null) {
            str4 = upvotePublishMobParam.authorId;
        } else {
            str4 = null;
        }
        oszArr[3] = new OSZ(str4, "author_id");
        if (upvotePublishMobParam != null) {
            str5 = upvotePublishMobParam.followStatus;
        } else {
            str5 = null;
        }
        oszArr[4] = new OSZ(str5, "follow_status");
        if (upvotePublishMobParam != null) {
            str6 = upvotePublishMobParam.isFirst;
        } else {
            str6 = null;
        }
        oszArr[5] = new OSZ(str6, "is_first");
        if (upvotePublishMobParam != null) {
            str7 = upvotePublishMobParam.isRecommend;
        } else {
            str7 = null;
        }
        oszArr[6] = new OSZ(str7, "is_recommend");
        if (upvotePublishMobParam != null) {
            str8 = upvotePublishMobParam.recommendCount;
        } else {
            str8 = null;
        }
        oszArr[7] = new OSZ(str8, "recommend_cnt");
        if (upvotePublishMobParam != null) {
            str9 = upvotePublishMobParam.panelSource;
        } else {
            str9 = null;
        }
        oszArr[8] = new OSZ(str9, "panel_source");
        FMX.LJIILL("recommend_success", oszArr);
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) afS15S1200000_3.l2;
        o.LJIIIIZZ(response, "response");
        upvotePublishVM.LJLIL.LIZ();
        upvotePublishVM.LJLIL.LIZLLL(response);
        upvotePublishVM.LJLIL.LJFF();
        C76082yi.LIZ(afS15S1200000_3.s0);
        UpvoteStruct upvoteStruct = response.upvote;
        if (upvoteStruct != null) {
            String str12 = afS15S1200000_3.s0;
            UpvotePublishVM upvotePublishVM2 = (UpvotePublishVM) afS15S1200000_3.l2;
            UpvotePublishMobParam upvotePublishMobParam2 = (UpvotePublishMobParam) afS15S1200000_3.l1;
            upvoteStruct.setMyNewUpvote(true);
            UpvoteStruct LJIIIIZZ = C1FP.LJIIIIZZ(C7H2.LIZ(str12));
            if (LJIIIIZZ == null || (text = LJIIIIZZ.getText()) == null || text.length() == 0) {
                C7H1.LJII(str12, upvoteStruct);
                upvotePublishVM2.setState(new AqS57S1100000_3(response, str12, 13));
                if (upvotePublishMobParam2 != null) {
                    str10 = upvotePublishMobParam2.enterFrom;
                } else {
                    str10 = null;
                }
                UpvotePublishVM.lv0(str10, str12);
                if (upvotePublishMobParam2 != null) {
                    str11 = upvotePublishMobParam2.enterMethod;
                }
                if (o.LJ(str11, "share_panel") && o.LJ(upvotePublishMobParam2.isFirst, CardStruct.IStatusCode.DEFAULT)) {
                    Activity currentActivity = ActivityStack.getValidTopActivity();
                    CommentService.LIZ.getClass();
                    if (CommentServiceImpl.LJJL().LJJIIZ(currentActivity)) {
                        EventBus.LIZJ().LJIILJJIL(upvotePublishVM2);
                        return;
                    }
                    C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
                    o.LJIIIIZZ(currentActivity, "currentActivity");
                    c55888Lwa.LIZ(currentActivity, new GuideOutPushParam(UpvotePublishVM.hv0(), "direct_repost", "repost", (String) null, 17));
                    return;
                }
                return;
            }
            C7H1.LJIILIIL(str12, null);
        }
    }

    public static final void accept$1(AfS15S1200000_3 afS15S1200000_3, Object obj) {
        List<InteractionTagUserInfo> arrayList;
        List<InteractionTagUserInfo> taggedUsers;
        InteractionTagInfo interactionTagInfo = ((Aweme) afS15S1200000_3.l1).getInteractionTagInfo();
        if (interactionTagInfo != null && (taggedUsers = interactionTagInfo.getTaggedUsers()) != null) {
            String str = afS15S1200000_3.s0;
            ArrayList arrayList2 = new ArrayList();
            for (InteractionTagUserInfo interactionTagUserInfo : taggedUsers) {
                if (!TextUtils.equals(str, interactionTagUserInfo.getUid())) {
                    arrayList2.add(interactionTagUserInfo);
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList<>();
        }
        InteractionTagInfo interactionTagInfo2 = ((Aweme) afS15S1200000_3.l1).getInteractionTagInfo();
        if (interactionTagInfo2 != null) {
            interactionTagInfo2.setTaggedUsers(arrayList);
        }
        ((SocialVideoTagShareVM) afS15S1200000_3.l2).LJLIL.postValue((Aweme) afS15S1200000_3.l1);
    }

    public static final void accept$2(AfS15S1200000_3 afS15S1200000_3, Object obj) {
        List<Aweme> list;
        ManageResponse manageResponse = (ManageResponse) obj;
        ((MixCreateViewModel) afS15S1200000_3.l1).setState(new AqS169S0100000_3(manageResponse, 872));
        if (!TextUtils.isEmpty(afS15S1200000_3.s0) && (list = ((C228798yR) afS15S1200000_3.l2).LJLJI) != null) {
            MixCreateViewModel mixCreateViewModel = (MixCreateViewModel) afS15S1200000_3.l1;
            C228888ya.LIZLLL(list.size(), manageResponse.mixId, mixCreateViewModel.LJLILLLLZI, mixCreateViewModel.LJLJI);
            C228888ya.LIZ(Integer.valueOf(list.size()), mixCreateViewModel.LJLILLLLZI, "edit_playlist_page", manageResponse.mixId, "create");
        }
    }

    public static final void accept$3(AfS15S1200000_3 afS15S1200000_3, Object obj) {
        ((InterfaceC65784Pro) afS15S1200000_3.l1).invoke();
        C7H1.LJIILJJIL(afS15S1200000_3.s0, null);
        ((UpvotePublishVM) afS15S1200000_3.l2).setState(new AqS57S1100000_3((Throwable) obj, afS15S1200000_3.s0, 46));
    }

    public AfS15S1200000_3(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
