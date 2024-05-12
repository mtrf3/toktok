package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.IlE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47540IlE implements IGM {
    public final /* synthetic */ IDP LJLIL;

    @Override // X.IGM
    public final boolean LIZ() {
        return true;
    }

    @Override // X.IGM
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.IGM
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.IGM
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.IGM
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.IGM
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.IGM
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.IGM
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.IGM
    public final boolean LJIILL() {
        return true;
    }

    @Override // X.IGM
    public final boolean LJIIZILJ() {
        return true;
    }

    @Override // X.IGM
    public final ILN LJ() {
        return ILN.T_FEED;
    }

    @Override // X.IGM
    public final ILO LJI() {
        return ILO.VIDEO;
    }

    public C47540IlE(IDP idp) {
        this.LJLIL = idp;
    }

    @Override // X.IGM
    public final HashMap<String, Object> LJIIIIZZ(String str) {
        Aweme currentAweme;
        String str2;
        C2MA viewHolderByAwemeId = this.LJLIL.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null || (currentAweme = viewHolderByAwemeId.getCurrentAweme()) == null) {
            return null;
        }
        this.LJLIL.getClass();
        IDP.LJJJLZIJ(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = FW5.LIZIZ;
        long j2 = 0;
        FW5.LIZIZ = 0L;
        IDR LJJJ = this.LJLIL.LJJJ();
        boolean LJIILLIIL = C48236IwS.LJIILLIIL(currentAweme.getAid());
        IRequestIdService LJ = RequestIdService.LJ();
        IDP.LLLZIIL.put(str, Long.valueOf(System.currentTimeMillis()));
        if (LJJJ == null) {
            str2 = "";
        } else {
            str2 = LJJJ.getEnterFrom(false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(currentAweme.getAid());
        LIZ.append(this.LJLIL.LJLJJI);
        C7D6 LIZLLL = LJ.LIZLLL(X1D.LIZIZ(LIZ));
        this.LJLIL.getClass();
        boolean LJIILJJIL = IDP.LJIILJJIL(str, "video_request");
        this.LJLIL.getClass();
        IDP.LJIJJ(str, "video_request");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("enter_from", str2);
        hashMap.put("aweme_type", Integer.valueOf(currentAweme.getAwemeType()));
        hashMap.put("is_first", Integer.valueOf(LJIILJJIL ? 1 : 0));
        hashMap.put("request_id", LIZLLL.LIZ);
        hashMap.put("pic_cnt", Integer.valueOf(C227768wm.LJIILIIL(currentAweme)));
        hashMap.put("is_from_feed_cache", Integer.valueOf(LJIILLIIL ? 1 : 0));
        if (currentAweme.getVideo() != null) {
            hashMap.put("is_private_video", Integer.valueOf(currentAweme.getVideo().isNeedSetCookie() ? 1 : 0));
        }
        hashMap.put("feed_tab", C38987FRv.LIZJ());
        hashMap.put("top_activity", C38987FRv.LIZIZ());
        hashMap.put("is_ad", Integer.valueOf(C63081OpJ.LJJLIIIJJI(currentAweme) ? 1 : 0));
        hashMap.put("is_splash", Integer.valueOf(C63081OpJ.LLIIII(currentAweme) ? 1 : 0));
        if (C224888s8.LJI(C2S6.LIZ(this.LJLIL.LJJIIZ()).getPlaylistPreviousPage())) {
            hashMap.put("is_in_search_detail", 1);
        }
        hashMap.put("has_cla", Integer.valueOf(C86670Xzu.LJIL(currentAweme) ? 1 : 0));
        hashMap.put("has_tts", Integer.valueOf(C86670Xzu.LJJII(currentAweme) ? 1 : 0));
        if (C54838Lfe.LJIIZILJ(currentAweme)) {
            hashMap.put("business_scene", "story");
        }
        hashMap.put("is_background", Integer.valueOf(C84763XOl.LJIIJJI ? 1 : 0));
        if (j > 0) {
            j2 = elapsedRealtime - j;
        }
        if (!IZ8.LJIJJ()) {
            hashMap.put("duration", Long.toString(j2));
        } else {
            hashMap.put("vps_duration", Long.toString(j2));
        }
        hashMap.put("is_audio_mode", Integer.valueOf(C2M9.LIZ() ? 1 : 0));
        if (currentAweme.getPodcastInfo() != null) {
            if (currentAweme.getPodcastInfo().isPodcastPreview() != null && currentAweme.getPodcastInfo().isPodcastPreview().booleanValue()) {
                hashMap.put("is_podcast_preview", 1);
            } else {
                hashMap.put("is_podcast_preview", 0);
            }
            if (currentAweme.getPodcastInfo().getPlayAddr() != null && currentAweme.getPodcastInfo().getPlayAddr().getUrlList() != null && !currentAweme.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                hashMap.put("podcast_rss_feed_url", ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            } else {
                hashMap.put("podcast_rss_feed_url", "");
            }
            if (currentAweme.getPodcastInfo().getEpisodeItemId() != null) {
                hashMap.put("podcast_rss_entry_id", currentAweme.getPodcastInfo().getEpisodeItemId());
            } else {
                hashMap.put("podcast_rss_entry_id", "");
            }
        } else {
            hashMap.put("is_podcast_preview", 0);
            hashMap.put("podcast_rss_feed_url", "");
            hashMap.put("podcast_rss_entry_id", "");
        }
        hashMap.put("is_cold_start_first_launch", Integer.valueOf(C38987FRv.LIZLLL().booleanValue() ? 1 : 0));
        return hashMap;
    }

    @Override // X.IGM
    public final HashMap LJIIJ(String str) {
        Aweme currentAweme;
        String str2;
        boolean z;
        C2MA viewHolderByAwemeId = this.LJLIL.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null || (currentAweme = viewHolderByAwemeId.getCurrentAweme()) == null) {
            return null;
        }
        IDR LJJJ = this.LJLIL.LJJJ();
        IRequestIdService LJ = RequestIdService.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(currentAweme.getAid());
        LIZ.append(this.LJLIL.LJLJJI);
        LJ.LIZLLL(X1D.LIZIZ(LIZ));
        boolean LJIILLIIL = C48236IwS.LJIILLIIL(currentAweme.getAid());
        if (LJJJ == null) {
            str2 = "";
        } else {
            str2 = LJJJ.getEnterFrom(false);
        }
        this.LJLIL.getClass();
        boolean LJIILJJIL = IDP.LJIILJJIL(str, "video_play_failed");
        this.LJLIL.getClass();
        IDP.LJIJJ(str, "video_play_failed");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str2);
        hashMap.put("aweme_type", Integer.valueOf(currentAweme.getAwemeType()));
        hashMap.put("is_first", Integer.valueOf(LJIILJJIL ? 1 : 0));
        hashMap.put("is_from_feed_cache", String.valueOf(LJIILLIIL ? 1 : 0));
        hashMap.put("request_id", IN5.LIZJ(LJJJ));
        hashMap.put("is_ad", Integer.valueOf(currentAweme.isAd() ? 1 : 0));
        hashMap.put("feed_tab", C38987FRv.LIZJ());
        hashMap.put("top_activity", C38987FRv.LIZIZ());
        if (currentAweme.getVideo() != null) {
            hashMap.put("is_private_video", Integer.valueOf(currentAweme.getVideo().isNeedSetCookie() ? 1 : 0));
        }
        Video video = currentAweme.getVideo();
        if (currentAweme.isPaidContent && video != null && video.getPlayAddr() != null && video.getPlayAddr().getaK() != null && !video.getPlayAddr().getaK().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("is_encrypt_paidContent", Boolean.valueOf(z));
        PaidContentInfo paidContentInfo = currentAweme.mPaidContentInfo;
        if (paidContentInfo != null && paidContentInfo.getPaidCollectionId() != 0) {
            hashMap.put("collection_id", Long.valueOf(currentAweme.mPaidContentInfo.getPaidCollectionId()));
        }
        hashMap.put("is_landscape_screen", Integer.valueOf(C79004UzY.LJJJIL(this.LJLIL.LJJIIZ(), currentAweme)));
        if (C224888s8.LJI(C2S6.LIZ(this.LJLIL.LJJIIZ()).getPlaylistPreviousPage())) {
            hashMap.put("is_in_search_detail", 1);
        }
        hashMap.put("is_cold_start_first_launch", Integer.valueOf(C38987FRv.LIZLLL().booleanValue() ? 1 : 0));
        if (currentAweme.getPodcastInfo() != null) {
            if (currentAweme.getPodcastInfo().isPodcastPreview() != null && currentAweme.getPodcastInfo().isPodcastPreview().booleanValue()) {
                hashMap.put("is_podcast_preview", 1);
            } else {
                hashMap.put("is_podcast_preview", 0);
            }
            if (currentAweme.getPodcastInfo().getPlayAddr() != null && currentAweme.getPodcastInfo().getPlayAddr().getUrlList() != null && !currentAweme.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                hashMap.put("podcast_rss_feed_url", ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            } else {
                hashMap.put("podcast_rss_feed_url", "");
            }
            if (currentAweme.getPodcastInfo().getEpisodeItemId() != null) {
                hashMap.put("podcast_rss_entry_id", currentAweme.getPodcastInfo().getEpisodeItemId());
            } else {
                hashMap.put("podcast_rss_entry_id", "");
            }
        } else {
            hashMap.put("is_podcast_preview", 0);
            hashMap.put("podcast_rss_feed_url", "");
            hashMap.put("podcast_rss_entry_id", "");
        }
        return hashMap;
    }

    @Override // X.IGM
    public final HashMap<String, Object> LJIIL(String str) {
        Aweme currentAweme;
        int i;
        C2MA viewHolderByAwemeId = this.LJLIL.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null || (currentAweme = viewHolderByAwemeId.getCurrentAweme()) == null) {
            return null;
        }
        IDR LJJJ = this.LJLIL.LJJJ();
        IRequestIdService LJ = RequestIdService.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(currentAweme.getAid());
        LIZ.append(this.LJLIL.LJLJJI);
        C7D6 LIZLLL = LJ.LIZLLL(X1D.LIZIZ(LIZ));
        boolean LJIILLIIL = C48236IwS.LJIILLIIL(currentAweme.getAid());
        if (LJJJ != null) {
            LJJJ.getEnterFrom(false);
        }
        this.LJLIL.getClass();
        boolean LJIILJJIL = IDP.LJIILJJIL(str, "video_request_response");
        this.LJLIL.getClass();
        IDP.LJIJJ(str, "video_request_response");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("aweme_type", Integer.valueOf(currentAweme.getAwemeType()));
        hashMap.put("is_first", Integer.valueOf(LJIILJJIL ? 1 : 0));
        hashMap.put("request_id", LIZLLL.LIZ);
        hashMap.put("pic_cnt", Integer.valueOf(C227768wm.LJIILIIL(currentAweme)));
        hashMap.put("is_from_feed_cache", Integer.valueOf(LJIILLIIL ? 1 : 0));
        hashMap.put("feed_tab", C38987FRv.LIZJ());
        hashMap.put("top_activity", C38987FRv.LIZIZ());
        if (C224888s8.LJI(C2S6.LIZ(this.LJLIL.LJJIIZ()).getPlaylistPreviousPage())) {
            hashMap.put("is_in_search_detail", 1);
        }
        hashMap.put("has_cla", Integer.valueOf(C86670Xzu.LJIL(currentAweme) ? 1 : 0));
        hashMap.put("has_tts", Integer.valueOf(C86670Xzu.LJJII(currentAweme) ? 1 : 0));
        hashMap.put("is_audio_mode", String.valueOf(C2M9.LIZ() ? 1 : 0));
        if (!C84763XOl.LJIIJJI) {
            i = 2;
        } else {
            i = 3;
        }
        hashMap.put("status", Integer.valueOf(i));
        return hashMap;
    }

    @Override // X.IGM
    public final HashMap<String, Object> LJFF(String str, boolean z) {
        Aweme currentAweme;
        String str2;
        int i;
        int i2;
        boolean z2;
        C2MA viewHolderByAwemeId = this.LJLIL.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null || (currentAweme = viewHolderByAwemeId.getCurrentAweme()) == null || currentAweme.getVideo() == null || currentAweme.getVideo().getPlayAddr() == null) {
            return null;
        }
        VideoUrlModel playAddr = currentAweme.getVideo().getPlayAddr();
        IDR LJJJ = this.LJLIL.LJJJ();
        IRequestIdService LJ = RequestIdService.LJ();
        int i3 = 0;
        if (LJJJ == null) {
            str2 = "";
        } else {
            str2 = LJJJ.getEnterFrom(false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(currentAweme.getAid());
        LIZ.append(this.LJLIL.LJLJJI);
        C7D6 LIZLLL = LJ.LIZLLL(X1D.LIZIZ(LIZ));
        this.LJLIL.getClass();
        boolean LJIILJJIL = IDP.LJIILJJIL(str, "video_block");
        this.LJLIL.getClass();
        IDP.LJIJJ(str, "video_block");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("enter_from", str2);
        hashMap.put("play_order", Integer.valueOf(this.LJLIL.LLJLL));
        hashMap.put("aweme_type", Integer.valueOf(currentAweme.getAwemeType()));
        hashMap.put("is_first", Integer.valueOf(LJIILJJIL ? 1 : 0));
        hashMap.put("play_type", ILO.VIDEO.name());
        hashMap.put("pic_cnt", Integer.valueOf(C227768wm.LJIILIIL(currentAweme)));
        hashMap.put("order", LIZLLL.LIZIZ);
        hashMap.put("request_id", LIZLLL.LIZ);
        hashMap.put("start_t", Long.valueOf(this.LJLIL.LJJJJLL(str) - this.LJLIL.LJJIJL(str)));
        hashMap.put("is_audio_mode", Integer.valueOf(C2M9.LIZ() ? 1 : 0));
        EG5.LIZ(EF7.LIZIZ());
        if (EG5.LIZ) {
            i = 1;
        } else {
            i = 2;
        }
        hashMap.put("is_new_user", Integer.valueOf(i));
        LJIILLIIL(currentAweme, hashMap);
        hashMap.put("is_photo", Integer.valueOf(currentAweme.isImage() ? 1 : 0));
        hashMap.put("is_ad", Integer.valueOf(currentAweme.isAd() ? 1 : 0));
        hashMap.put("is_splash", Integer.valueOf(C63081OpJ.LLIIII(currentAweme) ? 1 : 0));
        hashMap.put("video_use_cache", Integer.valueOf(C56662Kg.LIZ().LJ ? 1 : 0));
        hashMap.put("is_landscape_screen", Integer.valueOf(C79004UzY.LJJJIL(this.LJLIL.LJJIIZ(), currentAweme)));
        if (C224888s8.LJI(C2S6.LIZ(this.LJLIL.LJJIIZ()).getPlaylistPreviousPage())) {
            hashMap.put("is_in_search_detail", 1);
        }
        hashMap.put("has_cla", Integer.valueOf(C86670Xzu.LJIL(currentAweme) ? 1 : 0));
        hashMap.put("has_tts", Integer.valueOf(C86670Xzu.LJJII(currentAweme) ? 1 : 0));
        hashMap.put("is_cold_start_first_launch", Integer.valueOf(C38987FRv.LIZLLL().booleanValue() ? 1 : 0));
        if (z) {
            SimVideoUrlModel LJJJJI = C51029K0z.LJJJJI(playAddr);
            C46556IOy LJIIIIZZ = C47242IgQ.LIZ().LJIIIIZZ(LJJJJI);
            if (LJIIIIZZ != null) {
                if (C47485IkL.LIZ()) {
                    z2 = false;
                } else {
                    z2 = C47455Ijr.LJIIIZ;
                }
                hashMap.put("video_cache_use_ttnet", Boolean.valueOf(z2));
                hashMap.put("video_cache_read_cnt", Integer.valueOf(LJIIIIZZ.LIZJ));
                hashMap.put("video_cache_read_time", Double.valueOf((LJIIIIZZ.LIZ * 1.0f) / LJIIIIZZ.LIZJ));
                hashMap.put("video_cache_read_size", Double.valueOf((LJIIIIZZ.LIZIZ * 1.0f) / LJIIIIZZ.LIZJ));
            }
            C87748YcC requestInfo = C47242IgQ.LIZ().getRequestInfo(LJJJJI);
            if (requestInfo != null) {
                hashMap.put("request_info", requestInfo.toString());
            }
            hashMap.put("eco", Integer.valueOf(C47654In4.LIZ()));
            hashMap.put("is_recommend", Integer.valueOf(V0N.LJJIII(currentAweme) ? 1 : 0));
        } else {
            hashMap.put("drop_cnt", Integer.valueOf(this.LJLIL.LJJJJIZL().LJJJJ()));
        }
        if (currentAweme.getPodcastInfo() != null) {
            if (currentAweme.getPodcastInfo().isPodcastPreview() != null && currentAweme.getPodcastInfo().isPodcastPreview().booleanValue()) {
                hashMap.put("is_podcast_preview", 1);
            } else {
                hashMap.put("is_podcast_preview", 0);
            }
            if (currentAweme.getPodcastInfo().getPlayAddr() != null && currentAweme.getPodcastInfo().getPlayAddr().getUrlList() != null && !currentAweme.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                hashMap.put("podcast_rss_feed_url", ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            } else {
                hashMap.put("podcast_rss_feed_url", "");
            }
            if (currentAweme.getPodcastInfo().getEpisodeItemId() != null) {
                hashMap.put("podcast_rss_entry_id", currentAweme.getPodcastInfo().getEpisodeItemId());
            } else {
                hashMap.put("podcast_rss_entry_id", "");
            }
        } else {
            hashMap.put("is_podcast_preview", 0);
            hashMap.put("podcast_rss_feed_url", "");
            hashMap.put("podcast_rss_entry_id", "");
        }
        long j = this.LJLIL.LLF - IDP.LLLZ;
        if (j > 0 && j <= 120000) {
            long j2 = j / 60000;
            if (j2 == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            hashMap.put("in_first_min", Integer.valueOf(i2));
            if (j2 == 1) {
                i3 = 1;
            }
            hashMap.put("in_second_min", Integer.valueOf(i3));
        }
        hashMap.put("is_background", Integer.valueOf(C84763XOl.LJIIJJI ? 1 : 0));
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021f  */
    @Override // X.IGM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> LJII(java.lang.String r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47540IlE.LJII(java.lang.String, org.json.JSONObject):java.util.HashMap");
    }

    public final void LJIILLIIL(Aweme aweme, HashMap hashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        hashMap.put("is_music", 0);
        String str5 = "";
        if (aweme.getAuthor() == null) {
            str = "";
        } else {
            str = aweme.getAuthor().getUid();
        }
        hashMap.put("author_id", str);
        if (aweme.getDsp() == null) {
            str2 = "";
        } else {
            str2 = aweme.getDsp().getFullClipId();
        }
        hashMap.put("full_clip_id", str2);
        if (aweme.getDsp() == null) {
            str3 = "";
        } else {
            str3 = String.valueOf(aweme.getDsp().getMvId());
        }
        hashMap.put("mvid", str3);
        if (aweme.getMusic() == null) {
            str4 = "";
        } else {
            str4 = String.valueOf(aweme.getMusic().getId());
        }
        hashMap.put("music_id", str4);
        if (aweme.getMusic() != null && aweme.getMusic().getMatchedSongInfo() != null) {
            str5 = aweme.getMusic().getMatchedSongInfo().getId();
        }
        hashMap.put("meta_song_id", str5);
    }

    @Override // X.IGM
    public final HashMap<String, Object> LJIJ(String str, boolean z) {
        Aweme currentAweme;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        C2MA curViewHolder;
        Aweme O1;
        int i4;
        int i5;
        long j;
        UserStoryCurrentInfo currentInfo;
        boolean z2;
        float f;
        float f2;
        String str4;
        C2MA viewHolderByAwemeId = this.LJLIL.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null || (currentAweme = viewHolderByAwemeId.getCurrentAweme()) == null || currentAweme.getVideo() == null || currentAweme.getVideo().getPlayAddr() == null) {
            return null;
        }
        C46267IDv c46267IDv = this.LJLIL.LLLILZJ.get(str);
        InterfaceC46330IGg LJJJJIZL = this.LJLIL.LJJJJIZL();
        VideoUrlModel playAddr = currentAweme.getVideo().getPlayAddr();
        IDR LJJJ = this.LJLIL.LJJJ();
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        Session LIZIZ = c46664ITc.LIZIZ(playAddr.getUri());
        IRequestIdService LJ = RequestIdService.LJ();
        if (LJJJ == null) {
            str2 = "";
        } else {
            str2 = LJJJ.getEnterFrom(false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(currentAweme.getAid());
        LIZ.append(this.LJLIL.LJLJJI);
        C7D6 LIZLLL = LJ.LIZLLL(X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(c46664ITc.LJI(str))) {
            str3 = "mp4";
        } else {
            str3 = "dash";
        }
        this.LJLIL.getClass();
        boolean LJIILJJIL = IDP.LJIILJJIL(str, "video_play_quality");
        this.LJLIL.getClass();
        IDP.LJIJJ(str, "video_play_quality");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str2);
        hashMap.put("format", str3);
        hashMap.put("play_order", Integer.valueOf(this.LJLIL.LLJLL));
        hashMap.put("aweme_type", Integer.valueOf(currentAweme.getAwemeType()));
        hashMap.put("is_first", Integer.valueOf(LJIILJJIL ? 1 : 0));
        hashMap.put("is_from_start", Integer.valueOf(this.LJLIL.LLJLLL ? 1 : 0));
        hashMap.put("order", LIZLLL.LIZIZ);
        hashMap.put("request_id", LIZLLL.LIZ);
        hashMap.put("pic_cnt", Integer.valueOf(C227768wm.LJIILIIL(currentAweme)));
        hashMap.put("eco", Integer.valueOf(C47654In4.LIZ()));
        hashMap.put("video_size", Long.valueOf(C46728IVo.LJIIIZ(playAddr)));
        if (c46267IDv != null) {
            i = c46267IDv.LIZ;
        } else {
            i = -1;
        }
        hashMap.put("had_prepare", Integer.valueOf(i));
        hashMap.put("hw_config", Integer.valueOf(J8V.LJIIJJI(z) ? 1 : 0));
        hashMap.put("pt_predictL", SmartFeedPreloadService.instance().getPredictLabelResult());
        hashMap.put("is_from_feed_cache", Integer.valueOf(C48236IwS.LJIILLIIL(currentAweme.getAid()) ? 1 : 0));
        EG5.LIZ(EF7.LIZIZ());
        int i6 = 1;
        if (EG5.LIZ) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        hashMap.put("is_new_user", Integer.valueOf(i2));
        if (C224888s8.LJI(C2S6.LIZ(this.LJLIL.LJJIIZ()).getPlaylistPreviousPage())) {
            hashMap.put("is_in_search_detail", 1);
        }
        hashMap.put("audio_bitrate", LJJJJIZL.LJJI());
        hashMap.put("audio_codec_format", LJJJJIZL.LJIL());
        hashMap.put("is_audio_mode", Integer.valueOf(C2M9.LIZ() ? 1 : 0));
        hashMap.put("is_background", Integer.valueOf(C2M9.LIZ() ? 1 : 0));
        if (currentAweme.getPodcastInfo() != null) {
            if (currentAweme.getPodcastInfo().isPodcastPreview() != null && currentAweme.getPodcastInfo().isPodcastPreview().booleanValue()) {
                hashMap.put("is_podcast_preview", 1);
            } else {
                hashMap.put("is_podcast_preview", 0);
            }
            if (currentAweme.getPodcastInfo().getPlayAddr() != null && currentAweme.getPodcastInfo().getPlayAddr().getUrlList() != null && !currentAweme.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                hashMap.put("podcast_rss_feed_url", ListProtector.get(currentAweme.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            } else {
                hashMap.put("podcast_rss_feed_url", "");
            }
            if (currentAweme.getPodcastInfo().getEpisodeItemId() != null) {
                hashMap.put("podcast_rss_entry_id", currentAweme.getPodcastInfo().getEpisodeItemId());
            } else {
                hashMap.put("podcast_rss_entry_id", "");
            }
        } else {
            hashMap.put("is_podcast_preview", 0);
            hashMap.put("podcast_rss_feed_url", "");
            hashMap.put("podcast_rss_entry_id", "");
        }
        hashMap.put("is_ad", Integer.valueOf(currentAweme.isAd() ? 1 : 0));
        hashMap.put("is_splash", Integer.valueOf(C63081OpJ.LLIIII(currentAweme) ? 1 : 0));
        hashMap.put("is_recommend", Integer.valueOf(V0N.LJJIII(currentAweme) ? 1 : 0));
        if (C55511LqV.LJIIIIZZ(currentAweme) && C55511LqV.LJ(currentAweme)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        hashMap.put("is_encrypt_splash", Integer.valueOf(i3));
        if (LIZIZ != null) {
            hashMap.put("bitrate_diff", Integer.valueOf(LIZIZ.bitrate - ((int) LIZIZ.calcBitrate)));
        }
        if (currentAweme.getVideo() != null) {
            hashMap.put("is_private_video", Integer.valueOf(currentAweme.getVideo().isNeedSetCookie() ? 1 : 0));
        }
        LJIILLIIL(currentAweme, hashMap);
        C222578oP.LIZIZ(hashMap, currentAweme, null, null, null);
        C222578oP.LJ(null, hashMap, null, null);
        hashMap.put("enter_method", C222578oP.LIZ);
        IDR LJJJ2 = this.LJLIL.LJJJ();
        if (LJJJ2 != null && (curViewHolder = LJJJ2.getCurViewHolder()) != null && (O1 = curViewHolder.O1()) != null && C54838Lfe.LJIIZILJ(currentAweme) && C54838Lfe.LJJ(O1)) {
            String LJI = C54838Lfe.LJI(currentAweme);
            if (!TextUtils.isEmpty(LJI)) {
                hashMap.put("story_collection_id", LJI);
            }
            UserStory userStory = O1.getUserStory();
            if (userStory != null) {
                i4 = (int) userStory.getCurrentPosition();
            } else {
                i4 = 0;
            }
            if (i4 >= 0) {
                hashMap.put("story_start_num", Integer.valueOf(i4));
            }
            if (userStory != null && (currentInfo = userStory.getCurrentInfo()) != null && currentInfo.getCurrentIndex() != null) {
                i5 = currentInfo.getCurrentIndex().intValue();
            } else {
                i5 = 0;
            }
            if (i5 >= 0) {
                hashMap.put("story_current_num", Integer.valueOf(i5));
            }
            if (userStory != null) {
                j = userStory.getTotalCount();
            } else {
                j = 0;
            }
            if (j >= 0) {
                hashMap.put("item_cnt", Long.valueOf(j));
            }
        }
        if (C44432HcC.LJLJI) {
            z2 = C35704Dzo.LJIILLIIL;
        } else if (E00.LIZ != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            try {
                Video video = currentAweme.getVideo();
                if (video != null) {
                    SimVideo LJJJJ = C51029K0z.LJJJJ(video);
                    f2 = IXM.LJI(LJJJJ, "peak");
                    f = IXM.LJI(LJJJJ, "loudness");
                } else {
                    f = Float.MIN_VALUE;
                    f2 = Float.MIN_VALUE;
                }
                if (Float.MIN_VALUE == f || Float.MIN_VALUE == f2) {
                    f = -1.0f;
                    f2 = -1.0f;
                }
                Locale locale = Locale.US;
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getNumberInstance(locale);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                decimalFormat.applyPattern("#.###");
                hashMap.put("peak", CastFloatProtector.valueOf(decimalFormat.format(f2)));
                hashMap.put("loudness", CastFloatProtector.valueOf(decimalFormat.format(f)));
                hashMap.put("target_loudness", CastFloatProtector.valueOf(decimalFormat.format(C35704Dzo.LIZJ())));
                if (!C47636Imm.LJIIIIZZ(EF7.LIZIZ())) {
                    i6 = 0;
                }
                hashMap.put("use_ear_phone", Integer.valueOf(i6));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C78983UzD.LJIJ(e, "loudness report found exception!!");
            }
        }
        hashMap.put("tts_bitrate", 0);
        hashMap.put("tts_pre_cache_size", 0);
        hashMap.put("has_cla", Integer.valueOf(C86670Xzu.LJIL(currentAweme) ? 1 : 0));
        hashMap.put("has_tts", Integer.valueOf(C86670Xzu.LJJII(currentAweme) ? 1 : 0));
        if (LJJJ != null && !LJJJ.hasSlideOperation()) {
            str4 = "click";
        } else {
            str4 = "slide";
        }
        hashMap.put("enter_method", str4);
        hashMap.put("is_cold_start_first_launch", Integer.valueOf(C38987FRv.LIZLLL().booleanValue() ? 1 : 0));
        return hashMap;
    }
}
