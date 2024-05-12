package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MdM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57244MdM extends HSS {
    public final ActivityC45651qj LJLJLJ;
    public final FullPageParam LJLJLLL;

    @Override // X.S1E
    public final S1E clone() {
        return new C57244MdM(this.LJLJLJ, this.LJLJLLL);
    }

    @Override // X.HSS, X.S1E
    public final String LIZ() {
        Music music;
        User user;
        String LJI;
        String string;
        String ownerHandle;
        Aweme LJJII = LJJII();
        String str = null;
        if (LJJII != null) {
            music = LJJII.getMusic();
        } else {
            music = null;
        }
        Aweme LJJII2 = LJJII();
        if (LJJII2 != null) {
            user = LJJII2.getAuthor();
        } else {
            user = null;
        }
        ActivityC45651qj activityC45651qj = this.LJLJLJ;
        if (music != null) {
            if (music.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(music.getMatchedPGCSoundInfo().getMixedTitle())) {
                string = music.getMatchedPGCSoundInfo().getMixedTitle();
            } else if (TextUtils.isEmpty(music.getAuthorName())) {
                string = music.getMusicName();
            } else if (TextUtils.isEmpty(music.getOwnerId())) {
                if (TextUtils.isEmpty(music.getMusicName()) && TextUtils.isEmpty(music.getAuthorName())) {
                    Resources resources = activityC45651qj.getResources();
                    if (resources == null) {
                        return "";
                    }
                    string = resources.getString(R.string.jdk);
                } else {
                    Resources resources2 = activityC45651qj.getResources();
                    if (resources2 == null) {
                        return "";
                    }
                    string = resources2.getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
                }
            } else {
                Resources resources3 = activityC45651qj.getResources();
                if (resources3 != null) {
                    string = resources3.getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
                } else {
                    string = null;
                }
                if (TextUtils.isEmpty(music.getMusicName())) {
                    Resources resources4 = activityC45651qj.getResources();
                    if (resources4 == null) {
                        return "";
                    }
                    Object[] objArr = new Object[2];
                    Resources resources5 = activityC45651qj.getResources();
                    if (resources5 != null) {
                        str = resources5.getString(R.string.ii_);
                    }
                    objArr[0] = str;
                    if (TextUtils.isEmpty(music.getOwnerHandle())) {
                        ownerHandle = "";
                    } else {
                        ownerHandle = music.getOwnerHandle();
                    }
                    objArr[1] = ownerHandle;
                    string = resources4.getString(R.string.ij3, objArr);
                }
            }
        } else {
            if (user == null) {
                LJI = "";
            } else {
                LJI = AV1.LJI(user);
            }
            if (TextUtils.isEmpty(LJI)) {
                Resources resources6 = activityC45651qj.getResources();
                if (resources6 == null) {
                    return "";
                }
                string = resources6.getString(R.string.jdk);
            } else {
                Resources resources7 = activityC45651qj.getResources();
                if (resources7 == null) {
                    return "";
                }
                Object[] objArr2 = new Object[2];
                Resources resources8 = activityC45651qj.getResources();
                if (resources8 != null) {
                    str = resources8.getString(R.string.ii_);
                }
                objArr2[0] = str;
                objArr2[1] = LJI;
                string = resources7.getString(R.string.ij3, objArr2);
            }
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // X.HSS, X.S1E
    public final void LIZLLL(SmartImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        LJJJJI(imageView, new AqS159S0100000_9(imageView, 762));
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String musicId;
        int i;
        PostModeDetailParams postModeDetailParams;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (C62819Ol5.LJIJJLI(LJJII())) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJLJ);
            c26045AKb.LJIIIIZZ(R.string.jk_);
            c26045AKb.LJIIJ();
            return;
        }
        Aweme LJJII = LJJII();
        int i2 = 1;
        if (LJJII != null && !LJJII.isCanPlay()) {
            return;
        }
        Aweme LJJII2 = LJJII();
        if (LJJII2.getMusic() != null && !TextUtils.isEmpty(LJJII2.getMusic().getMid())) {
            musicId = LJJII2.getMusic().getMid();
        } else {
            musicId = "";
        }
        if (LJJII2.getVideo() != null) {
            i = LJJII2.getVideo().getVideoLength();
        } else {
            i = 0;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        SmartRoute buildRoute = SmartRouter.buildRoute(LJJI(), "aweme://music/detail/");
        buildRoute.withParam("id", musicId);
        buildRoute.withParam("aweme_id", LJJII2.getAid());
        buildRoute.withParam("extra_music_from", LJJIIZI());
        buildRoute.withParam("sticker_id", LJJII2.getStickerIDs());
        buildRoute.withParam("process_id", LIZ);
        buildRoute.withParam("extra_video_length", i);
        buildRoute.open(10086);
        o.LJIIIIZZ(musicId, "musicId");
        ActivityC45651qj context = this.LJLJLJ;
        FullPageParam param = this.LJLJLLL;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Aweme aweme = param.getAweme();
        if (aweme != null && (postModeDetailParams = param.getPostModeDetailParams()) != null) {
            C50915JyZ c50915JyZ = new C50915JyZ();
            c50915JyZ.LJJIIZI(aweme);
            c50915JyZ.LJJIIZ(context);
            c50915JyZ.LIZLLL = postModeDetailParams.eventType;
            c50915JyZ.LJJLI = postModeDetailParams.enterMethod;
            C78996UzQ.LJJIIZ(aweme);
            c50915JyZ.LJJLIIIJ = aweme.getAid();
            c50915JyZ.LJJLIIIJJI = musicId;
            c50915JyZ.LJJLIIIJLLLLLLLZ = postModeDetailParams.previousPage;
            c50915JyZ.LJJLIIJ = C2S6.LIZ(context).getPreviousPagePosition();
            c50915JyZ.LJIILLIIL = C227768wm.LJIIL(postModeDetailParams.pageType, aweme);
            c50915JyZ.LJJLIIIJJIZ = C227768wm.LJIILL(postModeDetailParams.pageType, aweme);
            c50915JyZ.LJJIL = C2S6.LIZ(context).getSearchId();
            c50915JyZ.LJLI = C2S6.LIZ(context).getCategoryName();
            c50915JyZ.LJLIIIL = "graphic_detail";
            C78841Uwv.LIZJ(c50915JyZ, C227768wm.LIZIZ(aweme));
            c50915JyZ.LIZJ(aweme.getAwemeType(), "aweme_type");
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo == null || !photoModeImageInfo.hasTitle()) {
                i2 = 0;
            }
            c50915JyZ.LIZJ(i2, "has_title");
            c50915JyZ.LIZ(K02.LIZIZ("enter_music_detail", aweme, postModeDetailParams.eventType));
            c50915JyZ.LJIILIIL();
        }
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }

    public C57244MdM(ActivityC45651qj activity, FullPageParam fullPageParam) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fullPageParam, "fullPageParam");
        this.LJLJLJ = activity;
        this.LJLJLLL = fullPageParam;
    }
}
