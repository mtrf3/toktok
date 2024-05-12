package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.Mdw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57280Mdw {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme, MusicModel musicModel) {
        User author;
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        Integer valueOf;
        User author2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (musicModel != null && musicModel.getId() == 0) {
            return false;
        }
        if (!C79004UzY.LJJIFFI(aweme.getGeofencingRegions()) && (aweme.getMusic() == null || TextUtils.equals(aweme.getAuthorUid(), aweme.getMusic().getOwnerId()))) {
            return false;
        }
        if (aweme.isAd() && aweme.getCommerceVideoAuthInfo() != null && aweme.getCommerceVideoAuthInfo().getAdSource() == 1) {
            return false;
        }
        if ((!aweme.isAd() && ((author = aweme.getAuthor()) == null || author.isAdFake())) || aweme.isWithPromotionalMusic() || C80S.LJ(aweme)) {
            return false;
        }
        if (!aweme.isCanPlay()) {
            Music music = aweme.getMusic();
            User author3 = aweme.getAuthor();
            if (aweme.isLawCriticalCountry() && music != null && author3 != null && !TextUtils.isEmpty(music.getOwnerId()) && TextUtils.equals(music.getOwnerId(), author3.getUid())) {
                return false;
            }
        }
        if ((aweme.getCommerceVideoAuthInfo() != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isMusicNotClickable()) || aweme.getSoundExemption() != 0) {
            return false;
        }
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dynamicVideo = awemeRawAd.getDynamicVideo()) != null && !TextUtils.isEmpty(dynamicVideo.getLynxScheme())) {
            FeedAdServiceImpl.LJJIJLIJ().LJIIJJI();
            C59201NLh LJFF = C59198NLe.LJFF(aweme.getAid());
            if (LJFF != null && (valueOf = Integer.valueOf(LJFF.LIZJ)) != null && valueOf.intValue() == 1) {
                return false;
            }
        }
        if ((aweme.isAd() && aweme.getCommerceVideoAuthInfo() != null && aweme.getCommerceVideoAuthInfo().getAdSource() == 1) || aweme.getMusic() == null || (author2 = aweme.getAuthor()) == null || author2.isAdFake() || aweme.getMusic().isAuthorDeleted() || musicModel == null || (TextUtils.isEmpty(musicModel.getLocalPath()) && (musicModel.getUrl() == null || TextUtils.isEmpty(musicModel.getUrl().getUri()) || C79004UzY.LJJIFFI(musicModel.getUrl().getUrlList()) || musicModel.getMusicStatus() == 0))) {
            return false;
        }
        return true;
    }
}
