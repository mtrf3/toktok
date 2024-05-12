package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.ativitystatus.ActivityStatusPrivacyViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.filterkeyword.FilterKeywordViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.groupchat.GroupChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.nudefilter.NudgeFilterViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.readreceipts.ReadReceiptsViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.safemode.SafeModeViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.tcmmessage.TcmMessageViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection.MusicCollectionViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.downloads.DownloadsViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.duet.DuetViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.following.FollowingVisibilityViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.likedlist.LikedListViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.nearby.NearbyVisibilityViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.profileviews.ProfileViewHistorySettingViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.sticker.StickerViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.stitch.StitchViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.story.StoryViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToContactsViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToFbFriendsViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToInterestedUsersViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToMLBBViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToMutualConnectionsViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToWhoShareLinkViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.tagmention.mention.MentionViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.tagmention.tag.TagViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.videoviews.VideoViewHistorySettingViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72000SNo implements SHG {
    public static final C72000SNo LIZ = new C72000SNo();

    @Override // X.SHG
    public final SLJ LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, Parcelable parcelable, SKL skl) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (!(parcelable instanceof PrivacySettingsAdapterConfigs)) {
            return null;
        }
        PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs = (PrivacySettingsAdapterConfigs) parcelable;
        String str = privacySettingsAdapterConfigs.tag;
        switch (str.hashCode()) {
            case -2031327019:
                if (!str.equals("sticker_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOH.LJLIL, StickerViewModel.class);
            case -1936746291:
                if (!str.equals("sug_item")) {
                    return null;
                }
                return new C71959SLz(context, privacySettingsAdapterConfigs, skl);
            case -1890252483:
                if (!str.equals("sticker")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOG.LJLIL, StickerViewModel.class);
            case -1576367647:
                if (!str.equals("stitch_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOE.LJLIL, StitchViewModel.class);
            case -1331856739:
                if (!str.equals("sug_to_contacts")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SON.LJLIL, SugToContactsViewModel.class);
            case -1158684186:
                if (!str.equals("following_list_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOM.LJLIL, FollowingVisibilityViewModel.class);
            case -1131224299:
                if (!str.equals("safe_mode")) {
                    return null;
                }
                return new SN5((ChatViewModel) new ViewModelProvider(viewModelStoreOwner).get(ChatViewModel.class), (SafeModeViewModel) new ViewModelProvider(viewModelStoreOwner).get(SafeModeViewModel.class), context, lifecycleOwner, skl);
            case -1049482625:
                if (!str.equals("nearby")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOK.LJLIL, NearbyVisibilityViewModel.class);
            case -892243791:
                if (!str.equals("stitch")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOF.LJLIL, StitchViewModel.class);
            case -838959102:
                if (!str.equals("liked_list_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72002SNq.LJLIL, LikedListViewModel.class);
            case -693786458:
                if (!str.equals("tcm_message")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO9.LJLIL, TcmMessageViewModel.class);
            case -689498662:
                if (!str.equals("group_chat_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO7.LJLIL, GroupChatViewModel.class);
            case -653104656:
                if (!str.equals("liked_list")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72003SNr.LJLIL, LikedListViewModel.class);
            case -606053617:
                if (!str.equals("nude_filter")) {
                    return null;
                }
                return new SN9((ChatViewModel) new ViewModelProvider(viewModelStoreOwner).get(ChatViewModel.class), (NudgeFilterViewModel) new ViewModelProvider(viewModelStoreOwner).get(NudgeFilterViewModel.class), context, lifecycleOwner, privacySettingsAdapterConfigs, skl);
            case -336063036:
                if (!str.equals("read_receipts")) {
                    return null;
                }
                return new SNB((ChatViewModel) new ViewModelProvider(viewModelStoreOwner).get(ChatViewModel.class), (ReadReceiptsViewModel) new ViewModelProvider(viewModelStoreOwner).get(ReadReceiptsViewModel.class), context, lifecycleOwner, privacySettingsAdapterConfigs, skl);
            case -89895355:
                if (!str.equals("sug_to_who_share_link")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOU.LJLIL, SugToWhoShareLinkViewModel.class);
            case -26400222:
                if (!str.equals("profile_view_history_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO3.LJLIL, ProfileViewHistorySettingViewModel.class);
            case -3906444:
                if (!str.equals("video_view_history_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72011SNz.LJLIL, VideoViewHistorySettingViewModel.class);
            case 82810:
                if (!str.equals("TAG")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO1.LJLIL, TagViewModel.class);
            case 3052376:
                if (!str.equals("chat")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO6.LJLIL, ChatViewModel.class);
            case 3094784:
                if (!str.equals("duet")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOD.LJLIL, DuetViewModel.class);
            case 22375357:
                if (!str.equals("chat_entrance")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO4.LJLIL, ChatViewModel.class);
            case 48039096:
                if (!str.equals("TAG_ITEM")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO0.LJLIL, TagViewModel.class);
            case 60887144:
                if (!str.equals("MENTION_ITEM")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72008SNw.LJLIL, MentionViewModel.class);
            case 107604944:
                if (!str.equals("profile_view_history")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO2.LJLIL, ProfileViewHistorySettingViewModel.class);
            case 109770997:
                if (!str.equals("story")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOB.LJLIL, StoryViewModel.class);
            case 249076466:
                if (!str.equals("duet_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOC.LJLIL, DuetViewModel.class);
            case 400227188:
                if (!str.equals("sug_to_mutual_connections")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOS.LJLIL, SugToMutualConnectionsViewModel.class);
            case 474130352:
                if (!str.equals("TAG_MENTION_ENTRANCE")) {
                    return null;
                }
                return new C71979SMt(context, privacySettingsAdapterConfigs, skl);
            case 677124898:
                if (!str.equals("activity_status")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72001SNp.LJLIL, ActivityStatusPrivacyViewModel.class);
            case 715773916:
                if (!str.equals("sug_to_interested_users")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOQ.LJLIL, SugToInterestedUsersViewModel.class);
            case 795306227:
                if (!str.equals("comment_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72005SNt.LJLIL, CommentViewModel.class);
            case 950398559:
                if (!str.equals("comment")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72004SNs.LJLIL, CommentViewModel.class);
            case 965295352:
                if (!str.equals("music_collection")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72006SNu.LJLIL, MusicCollectionViewModel.class);
            case 1277597730:
                if (!str.equals("filter_keyword")) {
                    return null;
                }
                return new SML((ChatViewModel) new ViewModelProvider(viewModelStoreOwner).get(ChatViewModel.class), (FilterKeywordViewModel) new ViewModelProvider(viewModelStoreOwner).get(FilterKeywordViewModel.class), context, lifecycleOwner, skl);
            case 1281985816:
                if (!str.equals("group_chat")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO8.LJLIL, GroupChatViewModel.class);
            case 1312704747:
                if (!str.equals("downloads")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOI.LJLIL, DownloadsViewModel.class);
            case 1494191133:
                if (!str.equals("story_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOA.LJLIL, StoryViewModel.class);
            case 1539074444:
                if (!str.equals("following_list")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOL.LJLIL, FollowingVisibilityViewModel.class);
            case 1541260775:
                if (!str.equals("downloads_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOJ.LJLIL, DownloadsViewModel.class);
            case 1619785626:
                if (!str.equals("chat_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SO5.LJLIL, ChatViewModel.class);
            case 1636304446:
                if (!str.equals("video_view_history")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72010SNy.LJLIL, VideoViewHistorySettingViewModel.class);
            case 1668327882:
                if (!str.equals("MENTION")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72009SNx.LJLIL, MentionViewModel.class);
            case 1668960762:
                if (!str.equals("music_collection_item")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, C72007SNv.LJLIL, MusicCollectionViewModel.class);
            case 1997746396:
                if (!str.equals("sug_to_fb_friends")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOO.LJLIL, SugToFbFriendsViewModel.class);
            case 2005925225:
                if (!str.equals("sug_to_mlbb")) {
                    return null;
                }
                return LIZIZ(viewModelStoreOwner, skl, context, lifecycleOwner, parcelable, SOP.LJLIL, SugToMLBBViewModel.class);
            default:
                return null;
        }
    }

    public static final <T extends SLJ, VM extends BasePrivacySettingViewModel> SLJ LIZIZ(ViewModelStoreOwner viewModelStoreOwner, SKL skl, Context context, LifecycleOwner lifecycleOwner, Parcelable parcelable, InterfaceC88475Ynv<? super VM, ? super Context, ? super LifecycleOwner, ? super PrivacySettingsAdapterConfigs, ? super SKL, ? extends T> interfaceC88475Ynv, Class<VM> cls) {
        BasePrivacySettingViewModel basePrivacySettingViewModel = (BasePrivacySettingViewModel) new ViewModelProvider(viewModelStoreOwner).get(cls);
        basePrivacySettingViewModel.mv0(skl);
        return interfaceC88475Ynv.invoke(basePrivacySettingViewModel, context, lifecycleOwner, parcelable, skl);
    }
}
