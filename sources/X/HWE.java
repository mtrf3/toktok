package X;

import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HWE implements InterfaceC65644PpY<Challenge, AVChallenge> {
    public static final /* synthetic */ int LJLIL = 0;

    public static final AVChallenge LIZ(Challenge challenge) {
        boolean z;
        Music music;
        Music music2;
        List<Music> connectMusics;
        Music music3;
        Music music4;
        List<Music> connectMusics2;
        Music music5;
        AVChallenge aVChallenge = new AVChallenge();
        o.LJI(challenge);
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        if (challenge.isCommerce()) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            ICommerceMediaService LIZJ = CommerceMediaServiceImpl.LIZJ();
            List<Music> connectMusics3 = challenge.getConnectMusics();
            if (connectMusics3 != null) {
                music4 = (Music) ORZ.LJLLLL(connectMusics3);
            } else {
                music4 = null;
            }
            if (!LIZJ.LIZLLL(music4) && (connectMusics2 = challenge.getConnectMusics()) != null && (music5 = (Music) ORZ.LJLLLL(connectMusics2)) != null) {
                str = music5.getMid();
            }
        } else if (challenge.isStrongMusic()) {
            if (CommerceToolsMusicService.LIZIZ(false).U40()) {
                ICommerceMediaService LIZJ2 = CommerceMediaServiceImpl.LIZJ();
                List<Music> connectMusics4 = challenge.getConnectMusics();
                if (connectMusics4 != null) {
                    music2 = (Music) ORZ.LJLLLL(connectMusics4);
                } else {
                    music2 = null;
                }
                if (!LIZJ2.LIZLLL(music2) && (connectMusics = challenge.getConnectMusics()) != null && (music3 = (Music) ORZ.LJLLLL(connectMusics)) != null) {
                    str = music3.getMid();
                }
            } else {
                List<Music> connectMusics5 = challenge.getConnectMusics();
                if (connectMusics5 != null && (music = (Music) ORZ.LJLLLL(connectMusics5)) != null) {
                    str = music.getMid();
                }
            }
        }
        aVChallenge.musicId = str;
        aVChallenge.mvId = challenge.getMvId();
        aVChallenge.mStatus = Boolean.FALSE;
        return aVChallenge;
    }

    @Override // X.InterfaceC65644PpY
    public final /* bridge */ /* synthetic */ AVChallenge apply(Challenge challenge) {
        return LIZ(challenge);
    }
}
