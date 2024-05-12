package kotlin.jvm.internal;

import X.AbstractC193947jK;
import X.AbstractC65781Prl;
import X.AbstractC73638SvC;
import X.C1046948z;
import X.C181847Bs;
import X.C184107Kk;
import X.C193887jE;
import X.C194437k7;
import X.C195937mX;
import X.C218998id;
import X.C220168kW;
import X.C229038yp;
import X.C229158z1;
import X.C26045AKb;
import X.C2U8;
import X.C45804HyK;
import X.C4LX;
import X.C51029K0z;
import X.C72922tc;
import X.C76800UCe;
import X.C7BT;
import X.C7MK;
import X.C7ML;
import X.InterfaceC194547kI;
import X.InterfaceC229138yz;
import X.InterfaceC88472Yns;
import X.Y9G;
import X.Z89;
import Y.AfS55S0100000_3;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.nows.feed.ui.NowAddPostButtonAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostCoverAssem;
import com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem;
import com.ss.android.ugc.aweme.tag.FeedTaggedListFragment;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS13S2100000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.status_code == 0) {
            C26045AKb c26045AKb = new C26045AKb((CreatePlaylistActivity) aqS13S2100000_3.l2);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIIIZZ(R.string.set);
            c26045AKb.LJIIJ();
            if (((CreatePlaylistActivity) aqS13S2100000_3.l2).LJLJJLL == 4) {
                IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
                String str = ((CreatePlaylistActivity) aqS13S2100000_3.l2).LJLJL;
                o.LJIIIIZZ(LJJIJIIJIL, "getService(IMixFeedService::class.java)");
                C1046948z.LIZ(LJJIJIIJIL, (CreatePlaylistActivity) aqS13S2100000_3.l2, "", null, "from_profile_mix_list", "create_playlist", str, aqS13S2100000_3.s0, aqS13S2100000_3.s1, true, null, "", 2560);
                Activity LJIJJ = C45804HyK.LJIJJ((CreatePlaylistActivity) aqS13S2100000_3.l2);
                if (LJIJJ != null) {
                    LJIJJ.finish();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        Integer num;
        Video video;
        ManageResponse manageResponse = (ManageResponse) obj;
        if (manageResponse != null && manageResponse.status_code == 0) {
            C26045AKb c26045AKb = new C26045AKb((CreatePlaylistActivity) aqS13S2100000_3.l2);
            c26045AKb.LIZ(true);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIIIZZ(R.string.sej);
            c26045AKb.LJIIJ();
            int i = ((CreatePlaylistActivity) aqS13S2100000_3.l2).LJLJJLL;
            if (i == 1 || i == 2) {
                IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
                String str = manageResponse.mixId;
                o.LJIIIIZZ(LJJIJIIJIL, "getService(IMixFeedService::class.java)");
                C1046948z.LIZ(LJJIJIIJIL, (CreatePlaylistActivity) aqS13S2100000_3.l2, "", null, "from_profile_mix_list", "create_playlist", str, aqS13S2100000_3.s0, aqS13S2100000_3.s1, true, null, "", 2560);
                IMixFeedService LJJIJIIJIL2 = MixFeedService.LJJIJIIJIL();
                String str2 = manageResponse.mixId;
                String str3 = aqS13S2100000_3.s0;
                Aweme aweme = ((CreatePlaylistActivity) aqS13S2100000_3.l2).LJLJLJ;
                if (aweme != null && (video = aweme.getVideo()) != null) {
                    num = Integer.valueOf(video.getDuration());
                } else {
                    num = null;
                }
                LJJIJIIJIL2.LJIILLIIL("personal_homepage", str2, null, str3, "create_playlist", null, num);
            }
            C2U8.LIZ(new IEvent() { // from class: X.8yh
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", "video_edit_page");
        sendEventTrackingAsync.put("previous_page", "video_post_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS13S2100000_3.l2).LIZ);
        sendEventTrackingAsync.put("user_type", aqS13S2100000_3.s0);
        sendEventTrackingAsync.put("search_keyword", aqS13S2100000_3.s1);
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS13S2100000_3.l2).LJIJI.LIZ ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        C229038yp it = (C229038yp) obj;
        o.LJIIIZ(it, "it");
        if (!(it.LJLIL instanceof C72922tc)) {
            ((EditPlayListNameEditTextVM) aqS13S2100000_3.l2).setStateImmediate(C229158z1.LJLIL);
            EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) aqS13S2100000_3.l2;
            AbstractC73638SvC<ManageResponse> LJJJJI = ((InterfaceC229138yz) editPlayListNameEditTextVM.LJLIL.getValue().getOperator()).LJJJJI(aqS13S2100000_3.s0, aqS13S2100000_3.s1);
            EditPlayListNameEditTextVM editPlayListNameEditTextVM2 = (EditPlayListNameEditTextVM) aqS13S2100000_3.l2;
            editPlayListNameEditTextVM.disposeOnClear(LJJJJI.LJJII(new AfS55S0100000_3(editPlayListNameEditTextVM2, 64), new AfS55S0100000_3(editPlayListNameEditTextVM2, 61)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        C194437k7 it = (C194437k7) obj;
        o.LJIIIZ(it, "it");
        AbstractC193947jK abstractC193947jK = it.LJLIL;
        abstractC193947jK.getClass();
        if ((abstractC193947jK instanceof C193887jE) && C195937mX.LIZ((InterfaceC194547kI) C51029K0z.LJIILLIIL((NowAddPostButtonAssem) aqS13S2100000_3.l2))) {
            InterfaceC194547kI item = (InterfaceC194547kI) C51029K0z.LJIILLIIL((NowAddPostButtonAssem) aqS13S2100000_3.l2);
            C181847Bs nowsFeedHierarchyData = ((NowAddPostButtonAssem) aqS13S2100000_3.l2).Z3();
            String actionType = aqS13S2100000_3.s0;
            String buttonType = aqS13S2100000_3.s1;
            o.LJIIIZ(item, "item");
            o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
            o.LJIIIZ(actionType, "actionType");
            o.LJIIIZ(buttonType, "buttonType");
            C7MK.LJI("now_button_action", new AqS9S2200000_3(item, nowsFeedHierarchyData, actionType, buttonType, 0));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((Fragment) aqS13S2100000_3.l2, new AqS8S2000000_3(aqS13S2100000_3.s0, aqS13S2100000_3.s1, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("action_type", aqS13S2100000_3.s0);
        sendEventTracking.put("button_type", aqS13S2100000_3.s1);
        sendEventTracking.put("page", ((NowPostCoverAssem) aqS13S2100000_3.l2).getEnterFrom());
        sendEventTracking.put("friend_type", C7MK.LIZ(((C7ML) C51029K0z.LJIILLIIL((NowPostCoverAssem) aqS13S2100000_3.l2)).getAweme().getAuthor()));
        sendEventTracking.put("is_to_ttn", ((NowPostCoverAssem) aqS13S2100000_3.l2).LLIZLLLIL);
        sendEventTracking.put("is_aggregate", 0);
        sendEventTracking.put("now_card_type", Z89.LIZIZ.LJIIZILJ(((C7ML) C51029K0z.LJIILLIIL((NowPostCoverAssem) aqS13S2100000_3.l2)).getAweme()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((FavoriteButtonAssem) aqS13S2100000_3.l2).L3().setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
            ((FavoriteButtonAssem) aqS13S2100000_3.l2).L3().setText(aqS13S2100000_3.s0);
        } else {
            ((FavoriteButtonAssem) aqS13S2100000_3.l2).L3().setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
            ((FavoriteButtonAssem) aqS13S2100000_3.l2).L3().setText(aqS13S2100000_3.s1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        FeedTaggedListFragment feedTaggedListFragment = (FeedTaggedListFragment) aqS13S2100000_3.l2;
        assemble.mv0(feedTaggedListFragment, new AqS13S2100000_3(feedTaggedListFragment, aqS13S2100000_3.s0, aqS13S2100000_3.s1, 6));
        assemble.wv0((FeedTaggedListFragment) aqS13S2100000_3.l2, C184107Kk.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        FeedTaggedListFragment feedTaggedListFragment = (FeedTaggedListFragment) aqS13S2100000_3.l2;
        hierarchyData.LIZ = new C7BT(feedTaggedListFragment.LJLJJI, feedTaggedListFragment.LJLJI, aqS13S2100000_3.s0, aqS13S2100000_3.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        String str;
        String authorUid;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("to_user_id", aqS13S2100000_3.s0);
        sendEventTrackingAsync.put("enter_from", ((FeedTaggedListViewModel) aqS13S2100000_3.l2).gv0().LJLJI);
        Aweme aweme = ((FeedTaggedListViewModel) aqS13S2100000_3.l2).gv0().LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendEventTrackingAsync.put("group_id", str);
        Aweme aweme2 = ((FeedTaggedListViewModel) aqS13S2100000_3.l2).gv0().LJLIL;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str2 = authorUid;
        }
        sendEventTrackingAsync.put("author_id", str2);
        sendEventTrackingAsync.put("anchor_type", ((FeedTaggedListViewModel) aqS13S2100000_3.l2).gv0().LJLJJI);
        sendEventTrackingAsync.put("click_type", aqS13S2100000_3.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        C220168kW it = (C220168kW) obj;
        o.LJIIIZ(it, "it");
        C218998id.LIZIZ("enter_add_yours_topic_list", new AqS9S2200000_3((AddYoursMultiHubAssem) aqS13S2100000_3.l2, aqS13S2100000_3.s0, aqS13S2100000_3.s1, it, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS13S2100000_3 aqS13S2100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", "video_post_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS13S2100000_3.l2).LIZ);
        sendEventTrackingAsync.put("user_type", aqS13S2100000_3.s0);
        sendEventTrackingAsync.put("search_keyword", aqS13S2100000_3.s1);
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS13S2100000_3.l2).LJIJI.LIZ ? 1 : 0));
        sendEventTrackingAsync.put("click_type", "choose");
        sendEventTrackingAsync.put("enter_from", "video_edit_page");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(NowAddPostButtonAssem nowAddPostButtonAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = nowAddPostButtonAssem;
        this.s0 = str;
        this.s1 = "post_clear";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(Y9G y9g, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = y9g;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(Fragment fragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = fragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(CreatePlaylistActivity createPlaylistActivity, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = createPlaylistActivity;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = editPlayListNameEditTextVM;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(FavoriteButtonAssem favoriteButtonAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = favoriteButtonAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(FeedTaggedListFragment feedTaggedListFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = feedTaggedListFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(AddYoursMultiHubAssem addYoursMultiHubAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = addYoursMultiHubAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(String str, FeedTaggedListViewModel feedTaggedListViewModel, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = feedTaggedListViewModel;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2100000_3(String str, String str2, NowPostCoverAssem nowPostCoverAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = nowPostCoverAssem;
    }
}
