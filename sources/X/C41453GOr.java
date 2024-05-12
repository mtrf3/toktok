package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GOr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41453GOr {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZJ() {
        C44423Hc3 currentUser;
        if (C1DG.LJIIIIZZ() || (currentUser = C44172HVg.LJIJ.getCurrentUser()) == null || currentUser.LJIIJ() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getMusicId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || videoPublishEditModel == null || !videoPublishEditModel.isCommerceMusic()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getMusicId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (videoPublishEditModel != null && (videoPublishEditModel.isCommerceMusic() || videoPublishEditModel.isOriginalSound)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if ((videoPublishEditModel == null || !videoPublishEditModel.realHasOriginalSound()) && extractAVMusic != null && !extractAVMusic.isOriginalSound()) {
            return false;
        }
        return true;
    }
}
