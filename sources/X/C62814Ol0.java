package X;

import Y.IDComparatorS30S0000000_2;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;
import com.bytedance.android.livesdk.livesetting.other.LivePrivilegeCenterSchemaSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.ugc.aweme.api.component.CommerceVideoCellConfig;
import com.ss.android.ugc.aweme.assem.FriendsChangeTabInterceptor;
import com.ss.android.ugc.aweme.bottom.NearbyBottomTabProtocol;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeShareConfiguration;
import com.ss.android.ugc.aweme.channel.share.ability.IntentShareLink;
import com.ss.android.ugc.aweme.channel.share.ability.IntentShareLinkPlusPhoto;
import com.ss.android.ugc.aweme.channel.share.ability.IntentShareLinkPlusVideo;
import com.ss.android.ugc.aweme.channel.share.ability.IntentSharePhoto;
import com.ss.android.ugc.aweme.channel.share.ability.IntentSharePhotos;
import com.ss.android.ugc.aweme.channel.share.ability.IntentShareVideo;
import com.ss.android.ugc.aweme.channel.share.channel.wrap.WrapDefaultFacebookChannel;
import com.ss.android.ugc.aweme.channel.share.channel.wrap.WrapDefaultMessengerChannel;
import com.ss.android.ugc.aweme.channel.share.channelservice.BandChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.DiscordChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.EmailChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.FacebookChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.FacebookGroupChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.FacebookLiteChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.FacebookStoryChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.ImgurChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.InstagramChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.InstagramStoryChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.KakaoStoryChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.KakaotalkChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.Lemon8ChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.LineChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.MessengerChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.MessengerLiteChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.RedditChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.SmsChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.SnapchatChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.SystemChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.TelegramChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.TwitterChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.ViberChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.VkChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.WhatsappChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.WhatsappStatusChannelService;
import com.ss.android.ugc.aweme.channel.share.channelservice.ZaloChannelService;
import com.ss.android.ugc.aweme.component.NearbyFeedConfiguration;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.aweme.detail.component.biz.MusicPanelConfiguration;
import com.ss.android.ugc.aweme.detail.platform.PublishPreviewDetailPanelConfiguration;
import com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPanelConfiguration;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallBottomTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopBottomTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopTopTabProtocol;
import com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.config.EcomSearchDetailPageConfiguration;
import com.ss.android.ugc.aweme.explore.entrance.ExploreBottomTabProtocol;
import com.ss.android.ugc.aweme.explore.entrance.ExploreXTabProtocol;
import com.ss.android.ugc.aweme.feed.component.FollowFeedConfiguration;
import com.ss.android.ugc.aweme.feed.component.RecommendFeedConfiguration;
import com.ss.android.ugc.aweme.feed.landscape.component.configuration.LandscapeFeedPanelConfiguration;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FollowTabProtocol;
import com.ss.android.ugc.aweme.feed.ui.foryoutab.ForYouTabProtocol;
import com.ss.android.ugc.aweme.friendstab.component.FriendsFeedConfiguration;
import com.ss.android.ugc.aweme.friendstab.tab.FriendTopTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.HomeTabProtocol;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabProtocol;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.inbox.InboxChangeTabInterceptor;
import com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.LiveLeftIconProtocol;
import com.ss.android.ugc.aweme.merge.FollowingBottomTabProtocol;
import com.ss.android.ugc.aweme.merge.FollowingFeedProtocol;
import com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPanelConfiguration;
import com.ss.android.ugc.aweme.music.presenter.MusicShareConfiguration;
import com.ss.android.ugc.aweme.newfollow.ui.DiscoverCompassTabProtocol;
import com.ss.android.ugc.aweme.notification.view.NotificationTabProtocol;
import com.ss.android.ugc.aweme.offlinemode.ui.OfflineModeDetailPanelConfiguration;
import com.ss.android.ugc.aweme.popularfeed.component.PopularFeedConfiguration;
import com.ss.android.ugc.aweme.popularfeed.ui.tab.PopularTabProtocol;
import com.ss.android.ugc.aweme.profile.ProfileChangeTabInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.profiletab.ProfileTabProtocol;
import com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotAwemeShareConfiguration;
import com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotUserShareConfiguration;
import com.ss.android.ugc.aweme.screenshot.strategy.ScreenShotAwemePhotoShareStrategy;
import com.ss.android.ugc.aweme.screenshot.strategy.ScreenShotUserPhotoShareStrategy;
import com.ss.android.ugc.aweme.search.arch.v2.biz.rs.SearchRSCardProtocol;
import com.ss.android.ugc.aweme.search.detail.filter.ui.SearchFilterPanelConfiguration;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardLiveProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardProductProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.usefulness.core.ui.SearchSatisfactionSurveyCard;
import com.ss.android.ugc.aweme.search.pages.result.common.searchrelation.core.ui.SearchRelationUserCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.protocol.AggregatedVideoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.protocol.SearchCSCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.protocol.SearchMixLiveCardProtocol;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.download.DownloadAbilityParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.download.DownloadChainParamsGorupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.download.DownloadEventParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.download.DownloadGlobalParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.download.WaterMarkAbilityParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.AddYoursParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.DualStreamParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.EcomParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.NearByParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.PoiParamsGroupProivder;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.PushParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.SearchParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.StoryParamsGroupProvider;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.other.UpvoteParamsGroupProvider;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.stemfeed.component.StemFeedConfiguration;
import com.ss.android.ugc.aweme.stemfeed.ui.tab.StemTabProtocol;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.DefaultStoryConfiguration;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.FeedCollectionCellConfig;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.photo.StoryPhotoCellConfig;
import com.ss.android.ugc.aweme.story.feed.component.cell.StoryVideoCellConfig;
import com.ss.android.ugc.aweme.story.feed.component.collection.StoryCollectionCellConfig;
import com.ss.android.ugc.aweme.story.feed.guidecard.config.StoryGuideCardPhotoCellConfig;
import com.ss.android.ugc.aweme.story.feed.guidecard.config.StoryGuideCardVideoCellConfig;
import com.ss.android.ugc.aweme.story.feed.immersive.config.StoryImmersiveCollectionConfig;
import com.ss.android.ugc.aweme.story.feed.immersive.config.StoryImmersiveFeedCellConfig;
import com.ss.android.ugc.aweme.tab.FriendsTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.component.TopicFeedConfiguration;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol0;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol1;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol2;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol3;
import com.ss.android.ugc.aweme.toptab.LiveTabProtocol;
import com.ss.android.ugc.aweme.toptab.component.LiveSingleFeedConfiguration;
import com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailPanelConfiguration;
import com.ss.android.ugc.aweme.trending.ui.searchfilter.FilterTrendingPanelConfiguration;
import com.ss.android.ugc.aweme.ui.NearbyTabProtocol;
import com.ss.android.ugc.playerkit.cache.IVideoCacheConfig;
import com.ss.android.ugc.sdk.channel.third.facebook.FacebookChannel;
import com.ss.android.ugc.sdk.channel.third.messenger.MessengerChannel;
import com.ss.android.ugc.trill.download.configuration.AwemeVideoDownloadConfiguration;
import com.ss.android.ugc.trill.download.configuration.StoryPhotoDownloadConfiguration;
import com.ss.android.ugc.trill.download.protocol.AwemeVideoDownloadMobProtocol;
import com.ss.android.ugc.trill.download.protocol.StoryPhotoDownloadMobProtocol;
import com.ss.android.vesdk.VECameraSettings;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ol0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62814Ol0 implements InterfaceC60495Noh, InterfaceC62517OgD, InterfaceC63352Otg {
    public static IVideoCacheConfig LJLIL;
    public static volatile boolean LJLILLLLZI;

    public static boolean LJJI(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    @Override // X.InterfaceC62517OgD
    public void LIZ(boolean z) {
    }

    @Override // X.InterfaceC62517OgD
    public void LIZLLL(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
    }

    @Override // X.InterfaceC62517OgD
    public void LJ(boolean z) {
    }

    @Override // X.InterfaceC60495Noh
    public void onFailed() {
    }

    @Override // X.InterfaceC63352Otg
    public Object LIZIZ() {
        boolean z;
        boolean LJJ;
        C63322OtC.LIZJ("IMConversationDao updateConversationSortOrder");
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                C78847Ux1.LJJLIIIJJI("IMConversationDao.updateConversationSortOrder()");
                C63291Osh.LIZ().getClass();
                if (!C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"))) {
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ("select * from conversation_list", null);
                    z = true;
                    if (interfaceC63132Oq8 != null) {
                        while (interfaceC63132Oq8.moveToNext()) {
                            try {
                                C63120Opw LIZ = C63133Oq9.LIZ(interfaceC63132Oq8, true);
                                if (LIZ.getSortOrder() < 0) {
                                    if (!TextUtils.isEmpty(LIZ.getConversationId())) {
                                        LJJ = C63133Oq9.LJJ(C63133Oq9.LJII(LIZ), LIZ.getConversationId());
                                    } else {
                                        LJJ = false;
                                    }
                                    if (!LJJ) {
                                        z = false;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("IMConversationDao updateConversationSortOrder ");
                                LIZ2.append(e);
                                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                                C63337OtR.LJFF(e);
                                C78847Ux1.LJIJJLI("IMConversationDao.updateConversationSortOrder()", true);
                                C63143OqJ.LIZ(interfaceC63132Oq8);
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                    if (z) {
                        C63291Osh.LIZ().getClass();
                        C63291Osh.LIZLLL.putBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"), true);
                    }
                    C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateConversationSortOrder");
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                C78847Ux1.LJIJJLI("IMConversationDao.updateConversationSortOrder()", true);
                C63143OqJ.LIZ(null);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
        C78847Ux1.LJIJJLI("IMConversationDao.updateConversationSortOrder()", true);
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return Boolean.valueOf(z);
    }

    public /* synthetic */ C62814Ol0() {
    }

    public static final C1HQ LJFF(OSZ... oszArr) {
        C1HQ c1hq = new C1HQ();
        for (OSZ osz : oszArr) {
            c1hq.put(osz.getFirst(), osz.getSecond());
        }
        return c1hq;
    }

    public static final List LJIIIIZZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TranslatedRegion.copy$default((TranslatedRegion) it.next(), null, null, false, 7, null));
        }
        return arrayList;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        Integer LIZ = C235779Nd.LIZ.LIZLLL().LIZ();
        if (LIZ == null || LIZ.intValue() != 2) {
            return false;
        }
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (aweme == null || currentUser == null || !TextUtils.equals(aweme.getRegion(), currentUser.getRegion()) || aweme.isReviewed() || LJIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(C50948Jz6 c50948Jz6) {
        if (c50948Jz6 == null) {
            return false;
        }
        ECSearchEntranceData ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        if (ecSearchEntranceData != null) {
            return ecSearchEntranceData.getEntranceHintWordInTopOnce();
        }
        if (c50948Jz6.getEcSearchEntranceValue() != EnumC51280KAq.PDP.getValue() && c50948Jz6.getEcSearchEntranceValue() != EnumC51280KAq.VIDEO_ANCHOR.getValue()) {
            return false;
        }
        return true;
    }

    public static final C68332mD LJIIJJI(ViewModelExt viewModelExt) {
        o.LJIIIZ(viewModelExt, "<this>");
        return new C68332mD(new Event());
    }

    public static final String LJIILJJIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(ujb.o.LJJJJZ(str, ".", "_", false));
        LIZ.append("_CukaieClosetFactory");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0056: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777302), block:B:31:0x0056 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static String LJIILLIIL(Context context) {
        Closeable closeable;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader3;
        InputStreamReader inputStreamReader4;
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader5 = null;
        try {
            try {
                inputStreamReader2 = new InputStreamReader(context.getResources().getAssets().open("omsdk_v1.js"));
            } catch (Throwable th) {
                th = th;
                inputStreamReader5 = inputStreamReader3;
            }
        } catch (UnsupportedEncodingException e) {
            e = e;
            inputStreamReader2 = null;
            bufferedReader = 0;
        } catch (IOException unused) {
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
        }
        try {
            bufferedReader = new BufferedReader(inputStreamReader2);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    C78983UzD.LJIIZILJ(e);
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(inputStreamReader2);
                    inputStreamReader4 = bufferedReader;
                    C36871EdX.LIZ(inputStreamReader4);
                    return sb.toString();
                } catch (IOException unused2) {
                    inputStreamReader5 = bufferedReader;
                    inputStreamReader = inputStreamReader5;
                    inputStreamReader5 = inputStreamReader2;
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(inputStreamReader5);
                    inputStreamReader4 = inputStreamReader;
                    C36871EdX.LIZ(inputStreamReader4);
                    return sb.toString();
                }
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            bufferedReader = 0;
        } catch (IOException unused3) {
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            inputStreamReader5 = inputStreamReader2;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(inputStreamReader5);
            C36871EdX.LIZ(closeable);
            throw th;
        }
        C37247Ejb.LIZ.getClass();
        C36871EdX.LIZ(inputStreamReader2);
        inputStreamReader4 = bufferedReader;
        C36871EdX.LIZ(inputStreamReader4);
        return sb.toString();
    }

    public static final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJIJI(SparkContext sparkContext) {
        ViewParent parent;
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = sparkContext.containerId;
        c31999Ch9.getClass();
        Object LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ == null || !(LIZIZ instanceof View) || (parent = ((View) LIZIZ).getParent()) == null || !(parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
            return null;
        }
        return (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) parent;
    }

    public static final boolean LJIJJ(C50948Jz6 c50948Jz6) {
        if (c50948Jz6 == null) {
            return false;
        }
        return LJIJJLI(c50948Jz6.getEcSearchEntranceData(), Integer.valueOf(c50948Jz6.getEcSearchEntranceValue()));
    }

    public static boolean LJIL(Aweme aweme) {
        return TextUtils.equals(HG3.LJIILL().getCurUserId(), aweme.getAuthorUid());
    }

    public static final boolean LJJ(VECameraController cameraController) {
        o.LJIIIZ(cameraController, "cameraController");
        if (cameraController.LJZL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIFFI(VECameraController cameraController) {
        o.LJIIIZ(cameraController, "cameraController");
        if (cameraController.LLFF && !LJJ(cameraController)) {
            return true;
        }
        return false;
    }

    public static final m LJJII(InterfaceC88472Yns interfaceC88472Yns) {
        return new HIC(interfaceC88472Yns).LIZ;
    }

    public static boolean LJJIIZ(Aweme aweme) {
        if (aweme != null && aweme.getStatus() != null && aweme.getStatus().isReviewed() && aweme.getStatus().isSelfSee()) {
            C54293LSn c54293LSn = C235779Nd.LIZ;
            if (c54293LSn.LIZLLL == null) {
                c54293LSn.LIZLLL = new C36821Ecj<>("self_see_water_mark_switch", Boolean.TRUE);
            }
            if (c54293LSn.LIZLLL.LIZ().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final ActionLinkComponent LJJIIZI(C63714OzW c63714OzW) {
        ActionLinkType actionLinkType;
        List list = c63714OzW.url_list;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        EnumC62835OlL enumC62835OlL = c63714OzW.action_type;
        if (enumC62835OlL == null || (actionLinkType = LJJIJ(enumC62835OlL)) == null) {
            actionLinkType = ActionLinkType.INVALID;
        }
        String str = c63714OzW.name;
        if (str == null) {
            str = "";
        }
        return new ActionLinkComponent(list, actionLinkType, str);
    }

    public static final ActionLinkType LJJIJ(EnumC62835OlL enumC62835OlL) {
        for (ActionLinkType actionLinkType : ActionLinkType.values()) {
            if (actionLinkType.getValue() == enumC62835OlL.getValue()) {
                return actionLinkType;
            }
        }
        return ActionLinkType.INVALID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EditVideoSegment LJJIJIIJI(NLETrackSlot nLETrackSlot) {
        long LJIIL;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        NLEResourceAV LJIILL = NLEResourceAV.LJIILL(LJJ.LIZIZ());
        String LIZJ = LJIILL.LIZJ();
        o.LJIIIIZZ(LIZJ, "nVideoRes.resourceFile");
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int LJI = (int) LJIILL.LJI();
        int LIZIZ = (int) LJIILL.LIZIZ();
        long j = 1000;
        if (LJIILL.getDuration() / j > 0) {
            LJIIL = LJIILL.getDuration() / j;
        } else {
            LJIIL = (LJJ.LJIIL() / j) - (LJJ.LJIILIIL() / j);
        }
        int i = 0;
        EditVideoSegment editVideoSegment = new EditVideoSegment(LIZJ, objArr2 == true ? 1 : 0, new VideoFileInfo(LJI, LIZIZ, LJIIL, i, i, i, i, i, 0.0f, 504, defaultConstructorMarker), 2, objArr == true ? 1 : 0);
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(LJJ.LJIILIIL() / j, LJJ.LJIIL() / j, LJJ.getSpeed(), (int) (-nLETrackSlot.getRotation())));
        return editVideoSegment;
    }

    public static final void LJJIJLIJ(SparkContext sparkContext) {
        WebKitView webKitView;
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = sparkContext.containerId;
        c31999Ch9.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ != null && (LIZIZ instanceof WebKitView) && (webKitView = (WebKitView) LIZIZ) != null && webKitView.canGoBack()) {
            webKitView.goBack();
            return;
        }
        InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
        if (LJIILL == null || !(LJIILL instanceof SparkActivity)) {
            return;
        }
        ((SparkActivity) LJIILL).finish();
    }

    public static InterfaceC62818Ol4 LJJIL(InterfaceC62818Ol4 interfaceC62818Ol4) {
        if ((interfaceC62818Ol4 instanceof C62817Ol3) || (interfaceC62818Ol4 instanceof C62816Ol2)) {
            return interfaceC62818Ol4;
        }
        if (interfaceC62818Ol4 instanceof Serializable) {
            return new C62816Ol2(interfaceC62818Ol4);
        }
        return new C62817Ol3(interfaceC62818Ol4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        if (r4 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C62815Ol1 LJI(X.InterfaceC55235Lm3 r4, java.lang.Class r5) {
        /*
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = X.C16880lQ.LJLLILLLL(r5)
            int r0 = r0.hashCode()
            r3 = 0
            switch(r0) {
                case -2130827173: goto L48;
                case -2084921414: goto L45;
                case -2076428591: goto L42;
                case -2044829021: goto L3f;
                case -1965234869: goto L3c;
                case -1896791951: goto L39;
                case -1896368064: goto L36;
                case -1878120378: goto L45;
                case -1776795734: goto L33;
                case -1731771850: goto L3c;
                case -1685765924: goto L3c;
                case -1592852135: goto L30;
                case -1553285573: goto L45;
                case -1493547047: goto L3f;
                case -1267203563: goto L3c;
                case -1152292978: goto L45;
                case -1117437802: goto L2d;
                case -965061797: goto L2a;
                case -943336002: goto L3f;
                case -745698837: goto L33;
                case -195879631: goto L45;
                case -87666857: goto L2a;
                case 16701467: goto L27;
                case 86642922: goto L3c;
                case 90798048: goto L3f;
                case 92435735: goto L3c;
                case 129039226: goto L24;
                case 267551387: goto L2a;
                case 324895646: goto L39;
                case 365685398: goto L3c;
                case 443506685: goto L45;
                case 447205828: goto L3f;
                case 763620111: goto L21;
                case 971793793: goto L36;
                case 972018406: goto L1e;
                case 1173138291: goto L1b;
                case 1220450523: goto L18;
                case 1269181289: goto L1e;
                case 1315827668: goto L3c;
                case 1317469140: goto L2d;
                case 1338604598: goto L2a;
                case 1374116915: goto L45;
                case 1381747468: goto L30;
                case 1453992039: goto L15;
                case 1643346016: goto L45;
                case 1661646040: goto L3c;
                case 1663814241: goto L3f;
                case 1688985878: goto L33;
                case 1730996373: goto L24;
                case 1764710771: goto L45;
                case 1779707909: goto L12;
                case 1855783999: goto L45;
                case 1904755730: goto L33;
                case 2132125587: goto L3c;
                default: goto L11;
            }
        L11:
            return r3
        L12:
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.FeedBottomButtonContainerScope> r2 = com.ss.android.ugc.aweme.feed.adapter.FeedBottomButtonContainerScope.class
            goto L4a
        L15:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.RootCellScope> r2 = com.ss.android.ugc.feed.platform.cell.RootCellScope.class
            goto L4a
        L18:
            java.lang.Class<com.ss.android.ugc.feed.platform.container.scope.BottomBarComponentScope> r2 = com.ss.android.ugc.feed.platform.container.scope.BottomBarComponentScope.class
            goto L4a
        L1b:
            java.lang.Class<com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope> r2 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope.class
            goto L4a
        L1e:
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.PanelScope> r2 = com.ss.android.ugc.aweme.feed.adapter.PanelScope.class
            goto L4a
        L21:
            java.lang.Class<com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope> r2 = com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope.class
            goto L4a
        L24:
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope> r2 = com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope.class
            goto L4a
        L27:
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionProtocolScope> r2 = com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionProtocolScope.class
            goto L4a
        L2a:
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatRoomScope> r2 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatRoomScope.class
            goto L4a
        L2d:
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainFragmentScope> r2 = com.ss.android.ugc.aweme.scope.MainFragmentScope.class
            goto L4a
        L30:
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r2 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            goto L4a
        L33:
            java.lang.Class<com.ss.android.ugc.feed.platform.container.scope.VideoCellScope> r2 = com.ss.android.ugc.feed.platform.container.scope.VideoCellScope.class
            goto L4a
        L36:
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.RootPanelScope> r2 = com.ss.android.ugc.feed.platform.panel.RootPanelScope.class
            goto L4a
        L39:
            java.lang.Class<com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope> r2 = com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope.class
            goto L4a
        L3c:
            java.lang.Class<com.ss.android.ugc.aweme.share.core.utils.ShareRootScope> r2 = com.ss.android.ugc.aweme.share.core.utils.ShareRootScope.class
            goto L4a
        L3f:
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r2 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            goto L4a
        L42:
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryBottomBarScope> r2 = com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryBottomBarScope.class
            goto L4a
        L45:
            java.lang.Class<com.bytedance.provider.impl.GScope> r2 = com.bytedance.provider.impl.GScope.class
            goto L4a
        L48:
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryRootCellScope> r2 = com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryRootCellScope.class
        L4a:
            java.lang.Class<com.bytedance.provider.impl.GScope> r0 = com.bytedance.provider.impl.GScope.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L57
            com.bytedance.provider.impl.GScope r4 = com.bytedance.provider.impl.GScope.LJLIL
            if (r4 != 0) goto L78
            goto L11
        L57:
            if (r4 == 0) goto L11
            com.bytedance.provider.impl.GScope r0 = com.bytedance.provider.impl.GScope.LJLIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 != 0) goto L11
            java.lang.Object r0 = r4.getHost()
            if (r0 != 0) goto L68
            goto L11
        L68:
            java.lang.Class r1 = r0.getClass()
        L6c:
            if (r1 == 0) goto L96
            java.lang.Class r0 = X.C55097Ljp.LIZIZ(r1)
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L91
        L78:
            X.Ol1 r2 = new X.Ol1
            r2.<init>()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "protocol-tag-"
            java.lang.String r1 = X.AnonymousClass028.LIZLLL(r1, r0, r5, r1)
            java.lang.Class<X.Ol1> r0 = X.C62815Ol1.class
            if (r1 != 0) goto L8d
            java.lang.String r1 = "source_default_key"
        L8d:
            X.C55247LmF.LIZIZ(r4, r2, r0, r1)
            return r2
        L91:
            java.lang.Class r1 = r1.getSuperclass()
            goto L6c
        L96:
            X.LmK r0 = r4.getTree()
            X.Lm3 r4 = r0.LIZJ
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62814Ol0.LJI(X.Lm3, java.lang.Class):X.Ol1");
    }

    public static C68332mD LJII(ViewModelExt viewModelExt, Object obj) {
        o.LJIIIZ(viewModelExt, "<this>");
        return new C68332mD(new Channel(obj));
    }

    public static final MultiEditVideoRecordData LJIIL(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        long j = 0;
        multiEditVideoRecordData.startTime = 0L;
        multiEditVideoRecordData.segmentDataList = list;
        boolean z2 = true;
        multiEditVideoRecordData.fromAdvancedEdit = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) it.next();
            j += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
        }
        multiEditVideoRecordData.endTime = j;
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        if (list2 != null) {
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = multiEditVideoSegmentRecordData2;
                    multiEditVideoSegmentRecordData3.videoKey = i;
                    if (z) {
                        float endTime = (float) ((multiEditVideoSegmentRecordData3.getEndTime() - multiEditVideoSegmentRecordData3.getStartTime()) * 1000);
                        multiEditVideoSegmentRecordData3.videoLength = endTime / multiEditVideoSegmentRecordData3.getVideoSpeed();
                        multiEditVideoSegmentRecordData3.audioLength = endTime / multiEditVideoSegmentRecordData3.audioSpeed;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (arrayList.size() != 1) {
            z2 = false;
        }
        multiEditVideoRecordData.isSingleVideo = z2;
        return multiEditVideoRecordData;
    }

    public static final JSONObject LJIILIIL(String interactId, HashMap businessRegionMixStreamPermanentTaskQueue) {
        JSONObject jSONObject;
        o.LJIIIZ(businessRegionMixStreamPermanentTaskQueue, "businessRegionMixStreamPermanentTaskQueue");
        o.LJIIIZ(interactId, "interactId");
        synchronized (businessRegionMixStreamPermanentTaskQueue) {
            jSONObject = new JSONObject();
            boolean z = false;
            for (Map.Entry entry : businessRegionMixStreamPermanentTaskQueue.entrySet()) {
                String str = (String) entry.getKey();
                java.util.Map map = (java.util.Map) entry.getValue();
                if (map.containsKey(interactId)) {
                    jSONObject.put(str, map.get(interactId));
                    z = true;
                }
            }
            if (!z) {
                jSONObject = null;
            }
        }
        return jSONObject;
    }

    public static int LJIILL(Context context, String str) {
        if (context != null) {
            try {
                Object LLJJIII = C16880lQ.LLJJIII(C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData, str);
                if (LLJJIII != null) {
                    return ((Integer) LLJJIII).intValue();
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    public static final List LJIJ(InterfaceC55235Lm3 scope, Class cls) {
        C62815Ol1 c62815Ol1;
        Object storyImmersiveFeedCellConfig;
        ArrayList arrayList;
        o.LJIIIZ(scope, "scope");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("protocol-tag-");
        LIZ.append(cls.getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        ?? r1 = LIZIZ;
        if (LIZIZ == null) {
            r1 = "source_default_key";
        }
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(scope, C62815Ol1.class, r1);
        if (LIZLLL != null) {
            c62815Ol1 = (C62815Ol1) LIZLLL.getSource();
        } else {
            c62815Ol1 = null;
        }
        if (c62815Ol1 == null || !c62815Ol1.LJLJI) {
            try {
                switch (C16880lQ.LJLLILLLL(cls).hashCode()) {
                    case -2130827173:
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            arrayList2.add(new StoryGuideCardVideoCellConfig());
                        } catch (NoClassDefFoundError unused) {
                        }
                        try {
                            arrayList2.add(new StoryPhotoCellConfig());
                        } catch (NoClassDefFoundError unused2) {
                        }
                        try {
                            arrayList2.add(new StoryGuideCardPhotoCellConfig());
                        } catch (NoClassDefFoundError unused3) {
                        }
                        try {
                            arrayList2.add(new StoryImmersiveCollectionConfig());
                        } catch (NoClassDefFoundError unused4) {
                        }
                        storyImmersiveFeedCellConfig = new StoryImmersiveFeedCellConfig();
                        r1 = arrayList2;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -2084921414:
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            arrayList3.add(new StoryPhotoDownloadConfiguration());
                        } catch (NoClassDefFoundError unused5) {
                        }
                        storyImmersiveFeedCellConfig = new AwemeVideoDownloadConfiguration();
                        r1 = arrayList3;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -2044829021:
                        ArrayList arrayList4 = new ArrayList();
                        try {
                            arrayList4.add(new FriendsFeedProtocol());
                        } catch (NoClassDefFoundError unused6) {
                        }
                        storyImmersiveFeedCellConfig = new FollowingFeedProtocol();
                        r1 = arrayList4;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -1878120378:
                        ArrayList arrayList5 = new ArrayList();
                        try {
                            arrayList5.add(new ScreenShotUserPhotoShareStrategy());
                        } catch (NoClassDefFoundError unused7) {
                        }
                        storyImmersiveFeedCellConfig = new ScreenShotAwemePhotoShareStrategy();
                        r1 = arrayList5;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -1493547047:
                        ArrayList arrayList6 = new ArrayList();
                        try {
                            arrayList6.add(new HomeTabProtocol());
                        } catch (NoClassDefFoundError unused8) {
                        }
                        try {
                            arrayList6.add(new NearbyBottomTabProtocol());
                        } catch (NoClassDefFoundError unused9) {
                        }
                        try {
                            arrayList6.add(new PublishTabProtocol());
                        } catch (NoClassDefFoundError unused10) {
                        }
                        try {
                            arrayList6.add(new FashionMallBottomTabProtocol());
                        } catch (NoClassDefFoundError unused11) {
                        }
                        try {
                            arrayList6.add(new ShopBottomTabProtocol());
                        } catch (NoClassDefFoundError unused12) {
                        }
                        try {
                            arrayList6.add(new FriendsTabProtocol());
                        } catch (NoClassDefFoundError unused13) {
                        }
                        try {
                            arrayList6.add(new FollowingBottomTabProtocol());
                        } catch (NoClassDefFoundError unused14) {
                        }
                        try {
                            arrayList6.add(new NotificationTabProtocol());
                        } catch (NoClassDefFoundError unused15) {
                        }
                        try {
                            arrayList6.add(new ExploreBottomTabProtocol());
                        } catch (NoClassDefFoundError unused16) {
                        }
                        try {
                            arrayList6.add(new DiscoverCompassTabProtocol());
                        } catch (NoClassDefFoundError unused17) {
                        }
                        storyImmersiveFeedCellConfig = new ProfileTabProtocol();
                        r1 = arrayList6;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -1152292978:
                        ArrayList arrayList7 = new ArrayList();
                        try {
                            arrayList7.add(new AwemeVideoDownloadMobProtocol());
                        } catch (NoClassDefFoundError unused18) {
                        }
                        storyImmersiveFeedCellConfig = new StoryPhotoDownloadMobProtocol();
                        r1 = arrayList7;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -1117437802:
                        ArrayList arrayList8 = new ArrayList();
                        storyImmersiveFeedCellConfig = new LiveLeftIconProtocol();
                        r1 = arrayList8;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case -195879631:
                        ArrayList arrayList9 = new ArrayList();
                        try {
                            arrayList9.add(new ScreenShotUserShareConfiguration());
                        } catch (NoClassDefFoundError unused19) {
                        }
                        try {
                            arrayList9.add(new ScreenShotAwemeShareConfiguration());
                        } catch (NoClassDefFoundError unused20) {
                        }
                        try {
                            arrayList9.add(new MusicShareConfiguration());
                        } catch (NoClassDefFoundError unused21) {
                        }
                        storyImmersiveFeedCellConfig = new ChallengeShareConfiguration();
                        r1 = arrayList9;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 16701467:
                        ArrayList arrayList10 = new ArrayList();
                        storyImmersiveFeedCellConfig = new DefaultStoryConfiguration();
                        r1 = arrayList10;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 443506685:
                        ArrayList arrayList11 = new ArrayList();
                        try {
                            arrayList11.add(new FacebookChannelService());
                        } catch (NoClassDefFoundError unused22) {
                        }
                        try {
                            arrayList11.add(new SnapchatChannelService());
                        } catch (NoClassDefFoundError unused23) {
                        }
                        try {
                            arrayList11.add(new BandChannelService());
                        } catch (NoClassDefFoundError unused24) {
                        }
                        try {
                            arrayList11.add(new FacebookLiteChannelService());
                        } catch (NoClassDefFoundError unused25) {
                        }
                        try {
                            arrayList11.add(new ImgurChannelService());
                        } catch (NoClassDefFoundError unused26) {
                        }
                        try {
                            arrayList11.add(new MessengerLiteChannelService());
                        } catch (NoClassDefFoundError unused27) {
                        }
                        try {
                            arrayList11.add(new SmsChannelService());
                        } catch (NoClassDefFoundError unused28) {
                        }
                        try {
                            arrayList11.add(new RedditChannelService());
                        } catch (NoClassDefFoundError unused29) {
                        }
                        try {
                            arrayList11.add(new FacebookStoryChannelService());
                        } catch (NoClassDefFoundError unused30) {
                        }
                        try {
                            arrayList11.add(new ZaloChannelService());
                        } catch (NoClassDefFoundError unused31) {
                        }
                        try {
                            arrayList11.add(new InstagramChannelService());
                        } catch (NoClassDefFoundError unused32) {
                        }
                        try {
                            arrayList11.add(new SystemChannelService());
                        } catch (NoClassDefFoundError unused33) {
                        }
                        try {
                            arrayList11.add(new MessengerChannelService());
                        } catch (NoClassDefFoundError unused34) {
                        }
                        try {
                            arrayList11.add(new InstagramStoryChannelService());
                        } catch (NoClassDefFoundError unused35) {
                        }
                        try {
                            arrayList11.add(new Lemon8ChannelService());
                        } catch (NoClassDefFoundError unused36) {
                        }
                        try {
                            arrayList11.add(new TelegramChannelService());
                        } catch (NoClassDefFoundError unused37) {
                        }
                        try {
                            arrayList11.add(new ViberChannelService());
                        } catch (NoClassDefFoundError unused38) {
                        }
                        try {
                            arrayList11.add(new WhatsappStatusChannelService());
                        } catch (NoClassDefFoundError unused39) {
                        }
                        try {
                            arrayList11.add(new TwitterChannelService());
                        } catch (NoClassDefFoundError unused40) {
                        }
                        try {
                            arrayList11.add(new FacebookGroupChannelService());
                        } catch (NoClassDefFoundError unused41) {
                        }
                        try {
                            arrayList11.add(new LineChannelService());
                        } catch (NoClassDefFoundError unused42) {
                        }
                        try {
                            arrayList11.add(new EmailChannelService());
                        } catch (NoClassDefFoundError unused43) {
                        }
                        try {
                            arrayList11.add(new KakaoStoryChannelService());
                        } catch (NoClassDefFoundError unused44) {
                        }
                        try {
                            arrayList11.add(new WhatsappChannelService());
                        } catch (NoClassDefFoundError unused45) {
                        }
                        try {
                            arrayList11.add(new DiscordChannelService());
                        } catch (NoClassDefFoundError unused46) {
                        }
                        try {
                            arrayList11.add(new VkChannelService());
                        } catch (NoClassDefFoundError unused47) {
                        }
                        storyImmersiveFeedCellConfig = new KakaotalkChannelService();
                        r1 = arrayList11;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 447205828:
                        ArrayList arrayList12 = new ArrayList();
                        try {
                            arrayList12.add(new FriendsChangeTabInterceptor());
                        } catch (NoClassDefFoundError unused48) {
                        }
                        try {
                            arrayList12.add(new InboxChangeTabInterceptor());
                        } catch (NoClassDefFoundError unused49) {
                        }
                        storyImmersiveFeedCellConfig = new ProfileChangeTabInterceptor();
                        r1 = arrayList12;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 971793793:
                        ArrayList arrayList13 = new ArrayList();
                        try {
                            arrayList13.add(new StoryDetailPanelConfiguration());
                        } catch (NoClassDefFoundError unused50) {
                        }
                        try {
                            arrayList13.add(new LandscapeFeedPanelConfiguration());
                        } catch (NoClassDefFoundError unused51) {
                        }
                        try {
                            arrayList13.add(new PublishPreviewDetailPanelConfiguration());
                        } catch (NoClassDefFoundError unused52) {
                        }
                        try {
                            arrayList13.add(new DetailPanelConfiguration());
                        } catch (NoClassDefFoundError unused53) {
                        }
                        try {
                            arrayList13.add(new NearbyFeedConfiguration());
                        } catch (NoClassDefFoundError unused54) {
                        }
                        try {
                            arrayList13.add(new MusicPanelConfiguration());
                        } catch (NoClassDefFoundError unused55) {
                        }
                        try {
                            arrayList13.add(new TopicFeedConfiguration());
                        } catch (NoClassDefFoundError unused56) {
                        }
                        try {
                            arrayList13.add(new FilterTrendingPanelConfiguration());
                        } catch (NoClassDefFoundError unused57) {
                        }
                        try {
                            arrayList13.add(new MixVideoDetailPanelConfiguration());
                        } catch (NoClassDefFoundError unused58) {
                        }
                        try {
                            arrayList13.add(new OfflineModeDetailPanelConfiguration());
                        } catch (NoClassDefFoundError unused59) {
                        }
                        try {
                            arrayList13.add(new TrendingDetailPanelConfiguration());
                        } catch (NoClassDefFoundError unused60) {
                        }
                        try {
                            arrayList13.add(new FriendsFeedConfiguration());
                        } catch (NoClassDefFoundError unused61) {
                        }
                        try {
                            arrayList13.add(new SearchFilterPanelConfiguration());
                        } catch (NoClassDefFoundError unused62) {
                        }
                        try {
                            arrayList13.add(new EcomSearchDetailPageConfiguration());
                        } catch (NoClassDefFoundError unused63) {
                        }
                        try {
                            arrayList13.add(new RecommendFeedConfiguration());
                        } catch (NoClassDefFoundError unused64) {
                        }
                        try {
                            arrayList13.add(new PopularFeedConfiguration());
                        } catch (NoClassDefFoundError unused65) {
                        }
                        try {
                            arrayList13.add(new StemFeedConfiguration());
                        } catch (NoClassDefFoundError unused66) {
                        }
                        try {
                            arrayList13.add(new LiveSingleFeedConfiguration());
                        } catch (NoClassDefFoundError unused67) {
                        }
                        storyImmersiveFeedCellConfig = new FollowFeedConfiguration();
                        r1 = arrayList13;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1374116915:
                        ArrayList arrayList14 = new ArrayList();
                        try {
                            arrayList14.add(new MessengerChannel());
                        } catch (NoClassDefFoundError unused68) {
                        }
                        try {
                            arrayList14.add(new FacebookChannel());
                        } catch (NoClassDefFoundError unused69) {
                        }
                        try {
                            arrayList14.add(new WrapDefaultMessengerChannel());
                        } catch (NoClassDefFoundError unused70) {
                        }
                        storyImmersiveFeedCellConfig = new WrapDefaultFacebookChannel();
                        r1 = arrayList14;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1453992039:
                        ArrayList arrayList15 = new ArrayList();
                        try {
                            arrayList15.add(new StoryCollectionCellConfig());
                        } catch (NoClassDefFoundError unused71) {
                        }
                        try {
                            arrayList15.add(new FeedCollectionCellConfig());
                        } catch (NoClassDefFoundError unused72) {
                        }
                        try {
                            arrayList15.add(new StoryVideoCellConfig());
                        } catch (NoClassDefFoundError unused73) {
                        }
                        storyImmersiveFeedCellConfig = new CommerceVideoCellConfig();
                        r1 = arrayList15;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1643346016:
                        ArrayList arrayList16 = new ArrayList();
                        storyImmersiveFeedCellConfig = new CopyLinkChannel();
                        r1 = arrayList16;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1663814241:
                        ArrayList arrayList17 = new ArrayList();
                        try {
                            arrayList17.add(new NearbyTabProtocol());
                        } catch (NoClassDefFoundError unused74) {
                        }
                        try {
                            arrayList17.add(new TopicTabProtocol0());
                        } catch (NoClassDefFoundError unused75) {
                        }
                        try {
                            arrayList17.add(new TopicTabProtocol2());
                        } catch (NoClassDefFoundError unused76) {
                        }
                        try {
                            arrayList17.add(new TopicTabProtocol3());
                        } catch (NoClassDefFoundError unused77) {
                        }
                        try {
                            arrayList17.add(new TopicTabProtocol1());
                        } catch (NoClassDefFoundError unused78) {
                        }
                        try {
                            arrayList17.add(new ShopTopTabProtocol());
                        } catch (NoClassDefFoundError unused79) {
                        }
                        try {
                            arrayList17.add(new FriendTopTabProtocol());
                        } catch (NoClassDefFoundError unused80) {
                        }
                        try {
                            arrayList17.add(new PopularTabProtocol());
                        } catch (NoClassDefFoundError unused81) {
                        }
                        try {
                            arrayList17.add(new ForYouTabProtocol());
                        } catch (NoClassDefFoundError unused82) {
                        }
                        try {
                            arrayList17.add(new StemTabProtocol());
                        } catch (NoClassDefFoundError unused83) {
                        }
                        try {
                            arrayList17.add(new FollowTabProtocol());
                        } catch (NoClassDefFoundError unused84) {
                        }
                        try {
                            arrayList17.add(new LiveTabProtocol());
                        } catch (NoClassDefFoundError unused85) {
                        }
                        storyImmersiveFeedCellConfig = new ExploreXTabProtocol();
                        r1 = arrayList17;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1730996373:
                        ArrayList arrayList18 = new ArrayList();
                        try {
                            arrayList18.add(new SearchRelationUserCard());
                        } catch (NoClassDefFoundError unused86) {
                        }
                        try {
                            arrayList18.add(new SearchMixLiveCardProtocol());
                        } catch (NoClassDefFoundError unused87) {
                        }
                        try {
                            arrayList18.add(new ECStoreCardLiveProtocol());
                        } catch (NoClassDefFoundError unused88) {
                        }
                        try {
                            arrayList18.add(new SearchTakoCardProtocol());
                        } catch (NoClassDefFoundError unused89) {
                        }
                        try {
                            arrayList18.add(new ECStoreCardProductProtocol());
                        } catch (NoClassDefFoundError unused90) {
                        }
                        try {
                            arrayList18.add(new SearchCSCardProtocol());
                        } catch (NoClassDefFoundError unused91) {
                        }
                        try {
                            arrayList18.add(new AggregatedVideoCardProtocol());
                        } catch (NoClassDefFoundError unused92) {
                        }
                        try {
                            arrayList18.add(new SearchSatisfactionSurveyCard());
                        } catch (NoClassDefFoundError unused93) {
                        }
                        storyImmersiveFeedCellConfig = new SearchRSCardProtocol();
                        r1 = arrayList18;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1764710771:
                        ArrayList arrayList19 = new ArrayList();
                        try {
                            arrayList19.add(new IntentSharePhoto());
                        } catch (NoClassDefFoundError unused94) {
                        }
                        try {
                            arrayList19.add(new IntentSharePhotos());
                        } catch (NoClassDefFoundError unused95) {
                        }
                        try {
                            arrayList19.add(new IntentShareLink());
                        } catch (NoClassDefFoundError unused96) {
                        }
                        try {
                            arrayList19.add(new IntentShareVideo());
                        } catch (NoClassDefFoundError unused97) {
                        }
                        try {
                            arrayList19.add(new IntentShareLinkPlusVideo());
                        } catch (NoClassDefFoundError unused98) {
                        }
                        storyImmersiveFeedCellConfig = new IntentShareLinkPlusPhoto();
                        r1 = arrayList19;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    case 1855783999:
                        ArrayList arrayList20 = new ArrayList();
                        try {
                            arrayList20.add(new DownloadGlobalParamsGroupProvider());
                        } catch (NoClassDefFoundError unused99) {
                        }
                        try {
                            arrayList20.add(new DownloadAbilityParamsGroupProvider());
                        } catch (NoClassDefFoundError unused100) {
                        }
                        try {
                            arrayList20.add(new DualStreamParamsGroupProvider());
                        } catch (NoClassDefFoundError unused101) {
                        }
                        try {
                            arrayList20.add(new SearchParamsGroupProvider());
                        } catch (NoClassDefFoundError unused102) {
                        }
                        try {
                            arrayList20.add(new DownloadEventParamsGroupProvider());
                        } catch (NoClassDefFoundError unused103) {
                        }
                        try {
                            arrayList20.add(new UpvoteParamsGroupProvider());
                        } catch (NoClassDefFoundError unused104) {
                        }
                        try {
                            arrayList20.add(new WaterMarkAbilityParamsGroupProvider());
                        } catch (NoClassDefFoundError unused105) {
                        }
                        try {
                            arrayList20.add(new PoiParamsGroupProivder());
                        } catch (NoClassDefFoundError unused106) {
                        }
                        try {
                            arrayList20.add(new DownloadChainParamsGorupProvider());
                        } catch (NoClassDefFoundError unused107) {
                        }
                        try {
                            arrayList20.add(new PushParamsGroupProvider());
                        } catch (NoClassDefFoundError unused108) {
                        }
                        try {
                            arrayList20.add(new AddYoursParamsGroupProvider());
                        } catch (NoClassDefFoundError unused109) {
                        }
                        try {
                            arrayList20.add(new NearByParamsGroupProvider());
                        } catch (NoClassDefFoundError unused110) {
                        }
                        try {
                            arrayList20.add(new StoryParamsGroupProvider());
                        } catch (NoClassDefFoundError unused111) {
                        }
                        storyImmersiveFeedCellConfig = new EcomParamsGroupProvider();
                        r1 = arrayList20;
                        r1.add(storyImmersiveFeedCellConfig);
                        break;
                    default:
                        r1 = 0;
                        break;
                }
            } catch (NoClassDefFoundError unused112) {
            }
            if (c62815Ol1 == null && (c62815Ol1 = LJI(scope, cls)) == null) {
                return null;
            }
            c62815Ol1.LJLJI = true;
            if (r1 != 0) {
                c62815Ol1.LIZ(r1, false);
            }
        }
        synchronized (c62815Ol1) {
            arrayList = new ArrayList();
            arrayList.addAll(c62815Ol1.LJLIL);
            arrayList.addAll(c62815Ol1.LJLILLLLZI);
        }
        return arrayList;
    }

    public static final boolean LJIJJLI(ECSearchEntranceData eCSearchEntranceData, Integer num) {
        if (eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
            return true;
        }
        int value = EnumC51280KAq.DEFAULT.getValue();
        if (num == null || num.intValue() != value) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List LJJIJIIJIL(NLEModel nLEModel, NLETrack nLETrack) {
        boolean z;
        o.LJIIIZ(nLETrack, "<this>");
        ArrayList arrayList = new ArrayList();
        List LJLL = ORZ.LJLL(nLETrack.LJIILL());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) LJLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
            if (nLETrackSlot.LJI() != null && NLESegmentVideo.LJJ(nLETrackSlot.LJI()) != null && nLETrackSlot.LJI().LIZIZ() != null) {
                arrayList2.add(next);
            }
        }
        for (NLETrackSlot nLETrackSlot2 : ORZ.LLILII(new IDComparatorS30S0000000_2(81), arrayList2)) {
            o.LJIIIZ(nLETrackSlot2, "<this>");
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
            NLEResourceAV LJIILL = NLEResourceAV.LJIILL(LJJ.LIZIZ());
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
            multiEditVideoSegmentRecordData.draftVideoPath = LJIILL.LIZJ();
            multiEditVideoSegmentRecordData.width = (int) LJIILL.LJI();
            multiEditVideoSegmentRecordData.height = (int) LJIILL.LIZIZ();
            long duration = LJIILL.getDuration();
            multiEditVideoSegmentRecordData.videoLength = duration;
            multiEditVideoSegmentRecordData.audioLength = duration;
            long j = 1000;
            multiEditVideoSegmentRecordData.setStartTime(LJJ.LJIILIIL() / j);
            multiEditVideoSegmentRecordData.setEndTime(LJJ.LJIIL() / j);
            multiEditVideoSegmentRecordData.setVideoSpeed(Math.abs(LJJ.getSpeed()));
            multiEditVideoSegmentRecordData.audioSpeed = Math.abs(LJJ.getSpeed());
            multiEditVideoSegmentRecordData.rotate = (int) (-nLETrackSlot2.getRotation());
            multiEditVideoSegmentRecordData.videoPath = LJIILL.LIZJ();
            if (LJJ.LJIILJJIL() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            multiEditVideoSegmentRecordData.isMute = z;
            if (nLETrackSlot2.hasExtra("library_id")) {
                boolean z2 = false;
                multiEditVideoSegmentRecordData.libraryMaterialInfo = new LibraryMaterialInfoSv(nLETrackSlot2.getExtra("library_id"), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, z2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131070, 0 == true ? 1 : 0);
            }
            NLETrackSlot LIZIZ = C124864vC.LIZIZ(nLEModel, nLETrackSlot2);
            if (LIZIZ != null) {
                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(LIZIZ.LJI());
                if (LIZLLL != null) {
                    multiEditVideoSegmentRecordData.audioSpeed = LIZLLL.getSpeed();
                    if (LIZLLL.getRewind()) {
                        multiEditVideoSegmentRecordData.audioPath = LIZLLL.LJIIJJI().LIZJ();
                    } else {
                        multiEditVideoSegmentRecordData.audioPath = LIZLLL.LIZIZ().LIZJ();
                    }
                }
            } else if (C124574uj.LJJJJJ(nLETrackSlot2) || !C124574uj.LJJJLZIJ(nLETrackSlot2)) {
                multiEditVideoSegmentRecordData.audioPath = "";
            } else if (LJJ.getRewind()) {
                multiEditVideoSegmentRecordData.audioPath = LJJ.LJIIJJI().LIZJ();
            } else {
                multiEditVideoSegmentRecordData.audioPath = LJJ.LIZIZ().LIZJ();
            }
            arrayList.add(multiEditVideoSegmentRecordData);
        }
        return arrayList;
    }

    public static final C27448Apw LJJIJIL(PromotionEntrance promotionEntrance, boolean z) {
        Integer num = promotionEntrance.entranceStyle;
        String str = promotionEntrance.schema;
        EntranceBannerInfo entranceBannerInfo = promotionEntrance.bannerInfo;
        HashMap<String, Object> LJII = C27739Aud.LJII(promotionEntrance.daInfo);
        if (LJII == null) {
            LJII = new HashMap<>();
        }
        return new C27448Apw(num, str, entranceBannerInfo, LJII, z);
    }

    public /* synthetic */ C62814Ol0(C60498Nok c60498Nok, C60318Nlq c60318Nlq, String str) {
    }

    public static final String LJIIZILJ(Context context, Room room, String str) {
        int i;
        String valueOf;
        String str2;
        LiveMode streamType;
        String value = LivePrivilegeCenterSchemaSetting.INSTANCE.getValue();
        if (context != null) {
            float LJIJ = C15380j0.LJIJ(B9K.LIZJ(context));
            float LJIJ2 = C15380j0.LJIJ(B9K.LIZIZ(context));
            if (LJIJ <= LJIJ2) {
                i = (int) ((LJIJ / 750) * 900);
            } else {
                i = (int) ((LJIJ2 / 750) * 900);
            }
            android.net.Uri parse = UriProtector.parse(value);
            o.LJIIIIZZ(parse, "parse(schema)");
            Uri.Builder buildUpon = C29306Beo.LJJIJL(parse, "height", String.valueOf(i)).buildUpon();
            if (TextUtils.equals(str, "gift_panel")) {
                valueOf = String.valueOf(EnumC29511Bi7.REQUEST_FROM_SCENE_GIFT_PANEL.getType());
            } else {
                valueOf = String.valueOf(EnumC29511Bi7.REQUEST_FROM_SCENE_PERSONAL_CARD.getType());
            }
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("request_from", valueOf).appendQueryParameter("enter_from_merge", BJM.LJFF()).appendQueryParameter("enter_method", BJM.LJIIIIZZ());
            if (room != null && (streamType = room.getStreamType()) != null) {
                str2 = C28509BGv.LIZ(streamType);
            } else {
                str2 = null;
            }
            appendQueryParameter.appendQueryParameter("live_type", str2).appendQueryParameter("action_type", BJM.LIZLLL()).appendQueryParameter("entrance", str);
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "newSchema.toString()");
            return builder;
        }
        return value;
    }

    public static final String LJJIIJ(long j, long j2, String str) {
        double pow = Math.pow(10.0d, 1);
        return i0.LJFF(Q8U.LIZIZ(new Object[]{Double.valueOf(Math.floor((j / j2) * pow) / pow)}, 1, C10120aW.LIZ("%.", 1, 'f'), "format(format, *args)"), str);
    }

    public static final void LJJIIJZLJL(InterfaceC55235Lm3 scope, Class cls, List list) {
        C62815Ol1 LJI;
        o.LJIIIZ(scope, "scope");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("protocol-tag-");
        LIZ.append(cls.getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ == null) {
            LIZIZ = "source_default_key";
        }
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(scope, C62815Ol1.class, LIZIZ);
        if (LIZLLL != null) {
            LJI = (C62815Ol1) LIZLLL.getSource();
        } else {
            LJI = LJI(scope, cls);
        }
        if (LJI != null) {
            LJI.LIZ(list, true);
        }
    }

    public static final void LJJIJL(InterfaceC55235Lm3 scope, Class cls, InterfaceC99233ux protocol) {
        C62815Ol1 LJI;
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(protocol, "protocol");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("protocol-tag-");
        LIZ.append(cls.getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ == null) {
            LIZIZ = "source_default_key";
        }
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(scope, C62815Ol1.class, LIZIZ);
        if (LIZLLL != null) {
            LJI = (C62815Ol1) LIZLLL.getSource();
        } else {
            LJI = LJI(scope, cls);
        }
        if (LJI != null) {
            synchronized (LJI) {
                ((ArrayList) LJI.LJLIL).remove(protocol);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIII(com.bytedance.android.livesdkapi.depend.model.live.Room r7, com.bytedance.ies.sdk.datachannel.DataChannel r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "livesdk_privilege_center_entrance"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r1 = 0
            if (r7 == 0) goto Lb3
            long r3 = r7.getOwnerUserId()
        Ld:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L11:
            java.lang.String r0 = "anchor_id"
            r2.LJIJJ(r3, r0)
            if (r7 == 0) goto L9e
            long r3 = r7.getId()
        L1c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L20:
            java.lang.String r0 = "room_id"
            r2.LJIJJ(r3, r0)
            boolean r0 = X.C29306Beo.LJIIJ(r8)
            if (r0 != 0) goto L46
            java.lang.String r3 = X.BJM.LJFF()
            java.lang.String r0 = "enter_from_merge"
            r2.LJIJJ(r3, r0)
            java.lang.String r3 = X.BJM.LJIIIIZZ()
            java.lang.String r0 = "enter_method"
            r2.LJIJJ(r3, r0)
            java.lang.String r3 = X.BJM.LIZLLL()
            java.lang.String r0 = "action_type"
            r2.LJIJJ(r3, r0)
        L46:
            if (r7 == 0) goto L87
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r7.getStreamType()
            if (r0 == 0) goto L87
            java.lang.String r1 = X.C28509BGv.LIZ(r0)
        L52:
            java.lang.String r0 = "live_type"
            r2.LJIJJ(r1, r0)
            java.lang.String r0 = "entrance"
            r2.LJIJJ(r10, r0)
            java.lang.String r0 = "action"
            r2.LJIJJ(r9, r0)
            if (r7 == 0) goto L84
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r5 = r0.getCurrentUserId()
            long r3 = r7.getOwnerUserId()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L84
            java.lang.String r1 = "anchor"
        L7b:
            java.lang.String r0 = "user_type"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
            return
        L84:
            java.lang.String r1 = "user"
            goto L7b
        L87:
            if (r8 == 0) goto L52
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r8.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L52
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r0.getStreamType()
            if (r0 == 0) goto L52
            java.lang.String r1 = X.C28509BGv.LIZ(r0)
            goto L52
        L9e:
            if (r8 == 0) goto Lb0
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r8.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto Lb0
            long r3 = r0.getId()
            goto L1c
        Lb0:
            r3 = r1
            goto L20
        Lb3:
            if (r8 == 0) goto Lc5
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r8.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto Lc5
            long r3 = r0.getOwnerUserId()
            goto Ld
        Lc5:
            r3 = r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62814Ol0.LJJIII(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC62517OgD
    public View LIZJ(Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C25600zU c25600zU) {
        o.LJIIIZ(dialog, "dialog");
        LayoutInflater layoutInflater = dialog.getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "dialog.layoutInflater");
        if (c25600zU != null) {
            layoutInflater = C16880lQ.LLZIL(c25600zU);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, i, null, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(layoutResId, null, false)");
        return LLLLIILL;
    }
}
