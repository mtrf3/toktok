package X;

import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNoStreamLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNotRecommendPreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemovePauseLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Uyt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78963Uyt implements C0K7 {
    public static boolean LJLIL;
    public static boolean LJLILLLLZI;
    public static final C78963Uyt LJLJI = new C78963Uyt();

    public static final String LJIIIZ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwner() != null) {
            return String.valueOf(room.getOwner().getId());
        }
        return "";
    }

    public static final long LJJ() {
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.getCurrentUserId();
        }
        return 0L;
    }

    public static final void LIZJ(C188727au c188727au) {
        c188727au.LJIIIZ("creation_id", XVF.LJ);
        c188727au.LJIIIZ("shoot_way", XVF.LJFF);
        String str = XVF.LIZ;
        if (str == null) {
            str = "";
        }
        if (s.LJJJLZIJ(str, "shoot", false)) {
            str = "shoot_page_upload_song";
        } else if (s.LJJJLZIJ(str, "edit", false)) {
            str = "edit_page_upload_song";
        }
        c188727au.LJIIIZ("enter_from", str);
    }

    public static final void LIZLLL(Aweme aweme) {
        java.util.Map<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = aweme.getSearchExtraParams()) != null) {
            searchExtraParams.remove("inner_preset_fallback_aweme");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C56767MPr LJ(com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78963Uyt.LJ(com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice):X.MPr");
    }

    public static final boolean LJFF(C81243Gu c81243Gu) {
        int i;
        boolean z;
        IMUser LJLIIIL = C44384HbQ.LJLIIIL(c81243Gu);
        if (LJLIIIL != null) {
            i = LJLIIIL.getFollowStatus();
        } else {
            i = 0;
        }
        boolean LJIILIIL = AV1.LJIILIIL(i);
        IMUser LJLIIIL2 = C44384HbQ.LJLIIIL(c81243Gu);
        if (LJLIIIL2 != null && LJLIIIL2.getFollowStatus() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!LJIILIIL && !z) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C86343Xud c86343Xud) {
        o.LJIIIZ(c86343Xud, "<this>");
        return TextUtils.equals(c86343Xud.LIZJ, "homepage_follow");
    }

    public static final boolean LJII(C86343Xud c86343Xud) {
        o.LJIIIZ(c86343Xud, "<this>");
        return TextUtils.equals(c86343Xud.LIZJ, "homepage_hot");
    }

    public static final boolean LJIIIIZZ(C86343Xud c86343Xud) {
        o.LJIIIZ(c86343Xud, "<this>");
        return TextUtils.equals(c86343Xud.LIZJ, "homepage_live");
    }

    public static final void LJIIJ(C86343Xud c86343Xud) {
        c86343Xud.LJIILIIL.clear();
        LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
        if (liveRoomStruct != null && !liveRoomStruct.isShow && C38354F3m.LIZJ(c86343Xud.LIZLLL, "homepage_hot")) {
            if (RemoveNotRecommendPreLiveSetting.INSTANCE.enable()) {
                c86343Xud.LJIILIIL.add("nr");
            }
            if (RemovePauseLiveSetting.INSTANCE.enable()) {
                c86343Xud.LJIILIIL.add("pause");
            }
        }
        if (RemoveNoStreamLiveSetting.INSTANCE.enable()) {
            c86343Xud.LJIILIIL.add("nostream");
        }
    }

    public static List LJIIJJI(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            C19U.LIZLLL(arrayList, "__TS__", "{TS}", "__UA__", "{UA}");
        } else {
            C19U.LIZLLL(arrayList, "__TS__", "{TS}", "__UA__", "{UA}");
            C19U.LIZLLL(arrayList, "__ANDROIDID__", "{ANDROIDID}", "__ANDROIDID1__", "{ANDROIDID1}");
            C19U.LIZLLL(arrayList, "__AAID__", "{AAID}", "__OPENUDID__", "{OPENUDID}");
            C19U.LIZLLL(arrayList, "__OS__", "{OS}", "__IP__", "{IP}");
            C19U.LIZLLL(arrayList, "__LBS__", "{LBS}", "__GEO__", "{GEO}");
            C19U.LIZLLL(arrayList, "__UOO__", "{UOO}", "__DEVICE_ID__", "{DEVICE_ID}");
            arrayList.add("__OS_STR__");
            arrayList.add("{OS_STR}");
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIL(X.C86343Xud r2) {
        /*
            java.lang.String r2 = r2.LIZLLL
            int r0 = r2.hashCode()
            switch(r0) {
                case -667094460: goto L27;
                case -292561530: goto L1e;
                case 910581405: goto L15;
                case 1691937916: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = "homepage_follow"
        Lb:
            return r1
        Lc:
            java.lang.String r1 = "homepage_hot"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L15:
            java.lang.String r1 = "homepage_live"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L1e:
            java.lang.String r1 = "mall_racun_channel"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L27:
            java.lang.String r1 = "homepage_friends"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78963Uyt.LJIIL(X.Xud):java.lang.String");
    }

    public static final SlimRoom.LinkMic LJIILIIL(C86343Xud c86343Xud) {
        LiveRoomStruct liveRoomStruct;
        String str;
        o.LJIIIZ(c86343Xud, "<this>");
        if (c86343Xud.LJIJ == null && (liveRoomStruct = c86343Xud.LIZIZ) != null && (str = liveRoomStruct.linkMic) != null) {
            c86343Xud.LJIJ = (SlimRoom.LinkMic) C75792yF.LIZ(str, SlimRoom.LinkMic.class);
        }
        return c86343Xud.LJIJ;
    }

    public static final String LJIILJJIL(SearchMixFeedList searchMixFeedList) {
        Object LIZ;
        Object obj = null;
        try {
            JSONObject optJSONObject = new JSONObject(searchMixFeedList.LJLIL).optJSONObject("extra");
            if (optJSONObject != null) {
                LIZ = optJSONObject.optString("log_id");
            } else {
                LIZ = null;
            }
            if (LIZ == null) {
                LIZ = "";
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static int LJIILL(VideoUrlModel videoUrlModel) {
        Integer valueOf;
        if (videoUrlModel == null) {
            return -1;
        }
        IYN hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
            valueOf = -1;
        }
        return valueOf.intValue();
    }

    public static final String LJIIZILJ(C86343Xud c86343Xud) {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, c86343Xud.LIZJ, "-live_cell", LIZ);
    }

    public static String LJIJ(Throwable th) {
        try {
            int i = 0;
            String str = "";
            for (Object obj : s.LJLJJL(LJIJJLI(th), new String[]{"\n"}, 0, 6)) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if (2 > i) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        LIZ.append(str2);
                        LIZ.append("\n");
                        str = X1D.LIZIZ(LIZ);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final int[] LJIJI(EditPreviewInfo editPreviewInfo) {
        List<EditVideoSegment> videoList;
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null && videoList.size() > 0) {
            return C43495H5f.LIZIZ(((EditVideoSegment) ListProtector.get(videoList, 0)).getVideoPath());
        }
        return null;
    }

    public static final String LJIJJ(Exception getStackTraceString) {
        o.LJIIJ(getStackTraceString, "$this$getStackTraceString");
        String stackTraceString = android.util.Log.getStackTraceString(getStackTraceString);
        o.LJFF(stackTraceString, "Log.getStackTraceString(this)");
        return stackTraceString;
    }

    public static final String LJIJJLI(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuffer buffer = stringWriter.getBuffer();
        o.LJFF(buffer, "stringWriter.buffer");
        String stringBuffer = buffer.toString();
        o.LJFF(stringBuffer, "buffer.toString()");
        return stringBuffer;
    }

    public static UrlModel LJIL(com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        if (urlModel != null) {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(new ArrayList(urlModel.getUrlList()));
        }
        return urlModel2;
    }

    public static final String LJJI(User user) {
        String str;
        if (user != null) {
            str = user.getRemarkName();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (user == null) {
                return null;
            }
            return user.getRemarkName();
        }
        if (user == null) {
            return null;
        }
        return user.getNickname();
    }

    public static final VideoUrlModel LJJIFFI(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        AVMusic extractAVMusic;
        o.LJIIIZ(publishModel, "<this>");
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (musicBuzModel = creativeModel.musicBuzModel) == null || (extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setDuration(extractAVMusic.getDuration());
        videoUrlModel.setUri(extractAVMusic.path);
        videoUrlModel.setUrlList(C47261Igj.LJJIJ(videoUrlModel.getUri()));
        videoUrlModel.setUrlKey(videoUrlModel.getUri());
        return videoUrlModel;
    }

    public static final boolean LJJII(VideoItemParams videoItemParams) {
        String str;
        Aweme aweme;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && aweme.isAd()) {
            return true;
        }
        Z9N z9n = Z9N.LIZIZ;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        if (z9n.LJJIJLIJ(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(VideoItemParams videoItemParams) {
        BaseFeedPageParams baseFeedPageParams;
        o.LJIIIZ(videoItemParams, "<this>");
        if (videoItemParams.getAweme() == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || !AnonymousClass838.LIZ(videoItemParams.getAweme(), baseFeedPageParams)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(Aweme aweme) {
        if (aweme.getCommentSetting() == 3) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author != null && author.getCommentSetting() == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJZLJL(C86343Xud c86343Xud) {
        LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
        if (liveRoomStruct != null && liveRoomStruct.liveEventInfo != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        String str;
        o.LJIIIZ(aweme, "<this>");
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        return o.LJ(str, HG3.LJIILL().getCurUserId());
    }

    public static final boolean LJJIIZI(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        o.LJIIIZ(publishModel, "<this>");
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            return H7R.LJJJJL(videoPublishEditModel);
        }
        return false;
    }

    public static final boolean LJJIJ(VideoItemParams videoItemParams) {
        Aweme aweme;
        User author;
        AwemeRawAd awemeRawAd;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || !aweme.isAd() || (author = aweme.getAuthor()) == null || !author.isAdFake() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isShowPhotoModeSlideHint()) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && awemeRawAd2.getFakeAuthor() != null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJI(Aweme aweme) {
        String str;
        java.util.Map<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = aweme.getSearchExtraParams()) != null) {
            str = searchExtraParams.get("inner_preset_fallback_aweme");
        } else {
            str = null;
        }
        return o.LJ(str, "1");
    }

    public static final boolean LJJIJIIJIL(C86343Xud c86343Xud) {
        o.LJIIIZ(c86343Xud, "<this>");
        LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
        if (liveRoomStruct != null && liveRoomStruct.topFrameSummary != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIL(C37377Elh c37377Elh) {
        IPiaCacheProvider.CacheConfig cacheConfig = c37377Elh.LIZJ;
        Number number = cacheConfig.expire;
        String str = cacheConfig.version;
        String str2 = c37377Elh.LIZIZ;
        if (number == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || number.longValue() <= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public static final void LJJIL(NoticeCombineDatas noticeCombineDatas) {
        String imprId;
        List<CombineLiveNotice> liveNotices;
        o.LJIIIZ(noticeCombineDatas, "<this>");
        LogPbBean logPb = noticeCombineDatas.getLogPb();
        if (logPb != null && (imprId = logPb.getImprId()) != null && imprId.length() > 0 && (liveNotices = noticeCombineDatas.getLiveNotices()) != null) {
            Iterator<CombineLiveNotice> it = liveNotices.iterator();
            while (it.hasNext()) {
                User user = it.next().getUser();
                if (user != null) {
                    user.setRequestId(imprId);
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0016
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate LJJJ(X.C109544Rq r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.PUn r0 = r4.getContentPB()
            r3 = 0
            if (r0 == 0) goto L16
            X.PUn r0 = r4.getContentPB()
            int r0 = r0.size()
            if (r0 > 0) goto L1d
        L16:
            r1 = r3
        L17:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
            if (r0 == 0) goto L1c
            r3 = r1
        L1c:
            return r3
        L1d:
            com.squareup.wire.ProtoAdapter<X.V3s> r1 = X.C79128V3s.ADAPTER     // Catch: java.lang.Exception -> L16
            X.PUn r0 = r4.getContentPB()     // Catch: java.lang.Exception -> L16
            java.lang.Object r2 = r1.decode(r0)     // Catch: java.lang.Exception -> L16
            X.V3s r2 = (X.C79128V3s) r2     // Catch: java.lang.Exception -> L16
            int r1 = r4.getMsgType()     // Catch: java.lang.Exception -> L16
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 == r0) goto L9d
            r0 = 3001(0xbb9, float:4.205E-42)
            if (r1 == r0) goto L91
            switch(r1) {
                case 1801: goto L91;
                case 1802: goto L86;
                case 1803: goto L7b;
                case 1804: goto L70;
                case 1805: goto L65;
                case 1806: goto L5a;
                case 1807: goto L4f;
                case 1808: goto L44;
                case 1809: goto L39;
                default: goto L38;
            }     // Catch: java.lang.Exception -> L16
        L38:
            goto L16
        L39:
            if (r2 == 0) goto L16
            X.V3y r0 = r2.video_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate r1 = X.C78939UyV.LJJJJZI(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L44:
            if (r2 == 0) goto L16
            X.V42 r0 = r2.interactive_notice_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.InteractiveNoticeTemplate r1 = X.C78983UzD.LJJLIIIIJ(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L4f:
            if (r2 == 0) goto L16
            X.V3v r0 = r2.bot_answer_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate r1 = X.V3R.LIZIZ(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L5a:
            if (r2 == 0) goto L16
            X.V3u r0 = r2.portrait_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate r1 = X.C78880UxY.LJLJI(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L65:
            if (r2 == 0) goto L16
            X.V45 r0 = r2.sticker_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r1 = X.C51029K0z.LJJJJJL(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L70:
            if (r2 == 0) goto L16
            X.V3w r0 = r2.info_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate r1 = X.C79043V0l.LJJIII(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L7b:
            if (r2 == 0) goto L16
            X.V3y r0 = r2.video_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate r1 = X.C45804HyK.LJJLIL(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L86:
            if (r2 == 0) goto L16
            X.V41 r0 = r2.picture_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate r1 = X.C79146V4k.LJJLIIIJL(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L91:
            if (r2 == 0) goto L16
            X.V3x r0 = r2.image_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate r1 = X.C78996UzQ.LJJJJJ(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L9d:
            if (r2 == 0) goto L16
            X.V46 r0 = r2.dynamic_card     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate r1 = X.C78886Uxe.LJJLIIJ(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78963Uyt.LJJJ(X.4Rq):com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate");
    }

    public static void LJJJI(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove("__IDFA__");
        list.remove("{IDFA}");
        list.remove("__UDID__");
        list.remove("{UDID}");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C224578rd LJJJIL(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        int i;
        VideoPublishEditModel videoPublishEditModel2;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList2;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        VideoPublishEditModel videoPublishEditModel3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        } else {
            videoPublishEditModel = null;
        }
        Video video = new Video();
        UrlModel urlModel = new UrlModel();
        BaseShortVideoContext baseShortVideoContext2 = publishModel.editModel;
        o.LJII(baseShortVideoContext2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        String str = ((VideoPublishEditModel) baseShortVideoContext2).creativeModel.publishPreviewModel.firstFramePath;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishPreviewManager -> toPreviewData -> coverPath = ");
        LIZ.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        urlModel.setUrlList(C47261Igj.LJII(str));
        video.setCover(urlModel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BaseShortVideoContext baseShortVideoContext3 = publishModel.editModel;
        if ((baseShortVideoContext3 instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext3) != null && (imageAlbumData2 = videoPublishEditModel2.getImageAlbumData()) != null && (imageList2 = imageAlbumData2.getImageList()) != null) {
            Iterator<SingleImageData> it = imageList2.iterator();
            while (it.hasNext()) {
                if (it.next().getSynthesisData() == null) {
                    break;
                }
            }
        }
        if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            int i2 = 0;
            for (SingleImageData singleImageData : imageList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SingleImageData singleImageData2 = singleImageData;
                    o.LJIIIZ(singleImageData2, "<this>");
                    UrlModel LJJJJI = LJJJJI(singleImageData2);
                    if (LJJJJI != null) {
                        ListProtector.add(arrayList, i2, new PhotoModeImageUrlModel(LJJJJI, LJJJJI, LJJJJI, LJJJJI, objArr2 == true ? 1 : 0, 16, objArr == true ? 1 : 0));
                    }
                    UrlModel LJJJJI2 = LJJJJI(singleImageData2);
                    if (LJJJJI2 != null) {
                        ListProtector.add(arrayList2, i2, new PhotoModeImage(LJJJJI2, LJJJJI2.getWidth(), LJJJJI2.getHeight()));
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        video.setPlayAddr(LJJIFFI(publishModel));
        String publishId = publishModel.publishId;
        o.LJIIIZ(publishId, "publishId");
        Integer num = (Integer) ((LinkedHashMap) C41620GVc.LJIIIIZZ).get(publishId);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        BaseShortVideoContext baseShortVideoContext4 = publishModel.editModel;
        if (baseShortVideoContext4 instanceof VideoPublishEditModel) {
            videoPublishEditModel3 = (VideoPublishEditModel) baseShortVideoContext4;
        }
        String LJIIIIZZ = H7R.LJIIIIZZ(videoPublishEditModel3);
        Aweme aweme = new Aweme();
        aweme.setAid(publishModel.creationId);
        aweme.setAwemeType(150);
        aweme.setScheduleId(publishModel.creationId);
        aweme.setAuthor(AV1.LIZIZ());
        aweme.setCreateTime(System.currentTimeMillis() / 1000);
        PhotoModeImageInfo photoModeImageInfo = new PhotoModeImageInfo();
        photoModeImageInfo.setImageList(arrayList);
        photoModeImageInfo.setPhotoModeImageList(arrayList2);
        aweme.setPhotoModeImageInfo(photoModeImageInfo);
        aweme.setVideo(video);
        aweme.setPreviewData(new PublishPreviewInfo(true, i, null, publishModel.creationId, LJIIIIZZ, 4, 0 == true ? 1 : 0));
        aweme.setFoldedHashTagDesc("");
        aweme.setDesc("");
        return new C224578rd(publishModel, aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C224578rd LJJJJ(PublishModel publishModel) {
        int i;
        VideoPublishEditModel videoPublishEditModel;
        Video LIZIZ = C55723Ltv.LIZIZ.LIZIZ(publishModel.creationId);
        if (LIZIZ == null) {
            LIZIZ = new Video();
        }
        UrlModel urlModel = new UrlModel();
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        String str = ((VideoPublishEditModel) baseShortVideoContext).creativeModel.publishPreviewModel.firstFramePath;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishPreviewManager -> toPreviewData -> coverPath = ");
        LIZ.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        urlModel.setUrlList(C47261Igj.LJII(str));
        LIZIZ.setCover(urlModel);
        String publishId = publishModel.publishId;
        o.LJIIIZ(publishId, "publishId");
        Integer num = (Integer) ((LinkedHashMap) C41620GVc.LJIIIIZZ).get(publishId);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        BaseShortVideoContext baseShortVideoContext2 = publishModel.editModel;
        if (baseShortVideoContext2 instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2;
        } else {
            videoPublishEditModel = null;
        }
        String LJIIIIZZ = H7R.LJIIIIZZ(videoPublishEditModel);
        Aweme aweme = new Aweme();
        aweme.setAid(publishModel.creationId);
        aweme.setAwemeType(aweme.getAwemeType());
        aweme.setScheduleId(publishModel.creationId);
        aweme.setAuthor(AV1.LIZIZ());
        aweme.setCreateTime(System.currentTimeMillis() / 1000);
        aweme.setVideo(LIZIZ);
        aweme.setIsTikTokStory(false);
        aweme.setPreviewData(new PublishPreviewInfo(true, i, null, publishModel.creationId, LJIIIIZZ, 4, 0 == true ? 1 : 0));
        return new C224578rd(publishModel, aweme);
    }

    public static final UrlModel LJJJJI(SingleImageData singleImageData) {
        o.LJIIIZ(singleImageData, "<this>");
        UrlModel urlModel = new UrlModel();
        ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
        if (synthesisData != null) {
            urlModel.setUrlList(C47261Igj.LJII(synthesisData.getPath()));
            urlModel.setHeight(synthesisData.getHeight());
            urlModel.setWidth(synthesisData.getWidth());
            if (C76800UCe.LIZ != null) {
                return urlModel;
            }
        }
        return null;
    }

    public static JSONObject LJJJJIZL(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject((String) map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return jSONObject;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static final long LIZ(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final long LIZIZ(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final boolean LJJIZ(Aweme aweme, IVideoGiftService iVideoGiftService) {
        if (!aweme.isAd() && !J8V.LIZLLL() && iVideoGiftService.LIZ(aweme) && ((RBX) HG3.LJIILL()).getCurUser().getGiftBagStatus() == 1 && aweme.getAuthor() != null) {
            return true;
        }
        return false;
    }

    public static final void LJJIJL(String str, String str2, String str3) {
        String str4;
        String currentResolution;
        String str5 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str5);
        if (LIZIZ != null && (currentResolution = LIZIZ.getCurrentResolution()) != null) {
            str6 = currentResolution;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_definition_selection_btn_show");
        LIZ.LJIJJ(LJIIIZ(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(LJJ()), "user_id");
        LIZ.LJIJJ(str, "room_id");
        if (o.LJ(CardStruct.IStatusCode.DEFAULT, str3)) {
            str4 = "portrait";
        } else {
            str4 = "landscape";
        }
        LIZ.LJIJJ(str4, "room_orientation");
        LIZ.LJIJJ(str6, "current_definition");
        LIZ.LJIJ(str2);
        LIZ.LJJIIJZLJL();
    }

    public static final void LJJJJJ(float f, Aweme aweme, String str) {
        if (!C52480Kii.LIZ() || aweme == null || aweme.isAd() || aweme.isLive()) {
            return;
        }
        boolean LIZ = C2MX.LIZ().LIZ(str);
        if (f >= PinchToClearModeSettings.LIZ().enterScale && !LIZ) {
            C2U8.LIZ(new C245249js(C9XV.PINCH_ZOOM.getType(), "pinch", true));
            Keva keva = C3ZH.LIZ;
            if (keva.getBoolean("already_shown_pinch_clear_guide", false)) {
                return;
            }
            keva.storeBoolean("already_shown_pinch_clear_guide", true);
            return;
        }
        if (f > PinchToClearModeSettings.LIZ().exitScale || !LIZ) {
            return;
        }
        C2U8.LIZ(new C245249js(C9XV.PINCH_ZOOM.getType(), "pinch", false));
        Keva keva2 = C3ZH.LIZ;
        if (keva2.getBoolean("already_shown_pinch_clear_guide", false)) {
            return;
        }
        keva2.storeBoolean("already_shown_pinch_clear_guide", true);
    }

    public static final void LJJIJLIJ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        LiveMode streamType;
        C43588H8u.LIZLLL(str, "roomId", str4, "duration", str5, "previousDefinition", str7, "curDefinition");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_definition_selection_select_success");
        LIZ.LJIJJ(LJIIIZ(), "anchor_id");
        LIZ.LJIJJ(str, "room_id");
        LIZ.LJIJJ(Long.valueOf(LJJ()), "user_id");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str8 = C28509BGv.LIZ(streamType);
        } else {
            str8 = "";
        }
        LIZ.LJIJJ(str8, "live_type");
        if (o.LJ(CardStruct.IStatusCode.DEFAULT, str3)) {
            str9 = "portrait";
        } else {
            str9 = "landscape";
        }
        LIZ.LJIJJ(str9, "room_orientation");
        LIZ.LJIJJ(str7, "current_definition");
        LIZ.LJIJJ(str4, "duration");
        LIZ.LJIJJ(Long.valueOf(LJJ()), "user_id");
        LIZ.LJIJJ(str5, "previous_definition");
        LIZ.LJIJJ(str6, "switch_type");
        LIZ.LJIJ(str2);
        LIZ.LJJIIJZLJL();
    }
}
