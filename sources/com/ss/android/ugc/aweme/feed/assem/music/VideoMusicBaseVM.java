package com.ss.android.ugc.aweme.feed.assem.music;

import X.C2049682q;
import X.C33Q;
import X.C57245MdN;
import X.C57247MdP;
import X.C62819Ol5;
import X.C63081OpJ;
import X.C79004UzY;
import X.C80S;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MainArchCommon;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;

/* loaded from: classes10.dex */
public final class VideoMusicBaseVM extends FeedBaseViewModel<C57247MdP> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C57247MdP();
    }

    public final String kv0() {
        Aweme aweme;
        boolean z;
        UrlModel playUrl;
        String uri;
        UrlModel playUrl2;
        List<String> urlList;
        Aweme aweme2;
        String str;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return "others";
        }
        Music LIZ = C57245MdN.LIZ(aweme);
        MainArchCommon mainArchCommon = aweme.mainArchCommon;
        if (mainArchCommon != null && (str = mainArchCommon.musicDetailFailReason) != null) {
            return str;
        }
        if (C62819Ol5.LJIJJLI(aweme)) {
            return "no_sound";
        }
        if (LIZ == null) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null) {
                aweme2 = gv02.getAweme();
            } else {
                aweme2 = null;
            }
            if (C2049682q.LIZ(aweme2)) {
                if (aweme.isPhotoMode() || aweme.getAwemeType() == 160) {
                    return "no_sound";
                }
                return "pumping_failed";
            }
        } else if (LIZ.getId() == 0) {
            return "pumping_failed";
        }
        if (!C79004UzY.LJJIFFI(aweme.getGeofencingRegions()) && (LIZ == null || TextUtils.equals(aweme.getAuthorUid(), LIZ.getOwnerId()))) {
            return "other";
        }
        if (aweme.isLiveReplay()) {
            return "live_playback";
        }
        if (aweme.isAd() && aweme.getCommerceVideoAuthInfo() != null && aweme.getCommerceVideoAuthInfo().getAdSource() == 1) {
            return "adver";
        }
        if ((!aweme.isAd() && C63081OpJ.LJLJJL(aweme)) || aweme.isWithPromotionalMusic()) {
            if (!aweme.isWithPromotionalMusic()) {
                return "adver";
            }
            return "authority_reason_promotional";
        }
        if (C80S.LJ(aweme)) {
            return "authority_reason_friend_visible";
        }
        if (!aweme.isCanPlay() && lv0()) {
            return "other";
        }
        if (C63081OpJ.LJLLLLLL(aweme)) {
            return "adver";
        }
        if (aweme.getSoundExemption() != 0) {
            return "no_sound";
        }
        if (C63081OpJ.LJLJJI(aweme)) {
            return "adver";
        }
        if (LIZ != null && !C63081OpJ.LJLJJL(aweme) && !LIZ.isAuthorDeleted()) {
            IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
            MusicModel convertToMusicModel = LIZ.convertToMusicModel();
            if (aweme.isAd() && !C63081OpJ.LJLJJL(aweme) && (C63081OpJ.LJLZ(aweme) || C63081OpJ.LJLJL(aweme))) {
                z = true;
            } else {
                z = false;
            }
            if (LJJLIIIJJI.LJJIJ(convertToMusicModel, null, false, z)) {
                return null;
            }
            if (aweme.isAd()) {
                return "adver";
            }
            if (LIZ.getMusicStatus() == 0) {
                return "music_offline";
            }
            if (LIZ.getPlayUrl() != null && (playUrl = LIZ.getPlayUrl()) != null && (uri = playUrl.getUri()) != null && uri.length() != 0 && ((playUrl2 = LIZ.getPlayUrl()) == null || (urlList = playUrl2.getUrlList()) == null || !urlList.isEmpty())) {
                return "other";
            }
            return "no_url";
        }
        if (!aweme.isAd() || !C63081OpJ.LJLJJL(aweme)) {
            return null;
        }
        return "adver";
    }

    public final boolean lv0() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return false;
        }
        Music music = aweme.getMusic();
        User author = aweme.getAuthor();
        if (!aweme.isLawCriticalCountry() || music == null || author == null || TextUtils.isEmpty(music.getOwnerId()) || !TextUtils.equals(music.getOwnerId(), author.getUid())) {
            return false;
        }
        return true;
    }

    public final void nv0() {
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            setState(new AqS140S0200000_9(this, gv0, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void mv0(com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM r35, android.content.Context r36, int r37, boolean r38, X.ActivityC45651qj r39, boolean r40, int r41) {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM.mv0(com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM, android.content.Context, int, boolean, X.1qj, boolean, int):void");
    }
}
