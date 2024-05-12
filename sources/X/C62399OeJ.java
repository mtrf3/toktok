package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.MusicShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OeJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62399OeJ extends QXX {
    public final MusicShareModel LJLIL;
    public final Activity LJLILLLLZI;

    @Override // X.QXX
    public final String LLJL() {
        return "music";
    }

    @Override // X.QXX
    public final String LJZI() {
        ShareInfo shareInfo;
        String shareDesc;
        Music music = this.LJLIL.music;
        if (music == null || (shareInfo = music.getShareInfo()) == null || (shareDesc = shareInfo.getShareDesc()) == null) {
            return "";
        }
        return shareDesc;
    }

    @Override // X.QXX
    public final String LLJJJJ() {
        String mid;
        Music music = this.LJLIL.music;
        if (music == null || (mid = music.getMid()) == null) {
            return "";
        }
        return mid;
    }

    @Override // X.QXX
    public final Bundle LLLLLJIL() {
        String str;
        UrlModel urlModel;
        UrlModel urlModel2;
        String str2;
        String str3;
        int i;
        Bundle bundle = new Bundle();
        Activity activity = this.LJLILLLLZI;
        UrlModel urlModel3 = null;
        if (activity != null) {
            str = activity.getString(R.string.bri);
        } else {
            str = null;
        }
        bundle.putString("app_name", str);
        Music music = this.LJLIL.music;
        if (music != null) {
            urlModel = music.getCoverThumb();
        } else {
            urlModel = null;
        }
        bundle.putString("thumb_url", C78765Uvh.LJIIL(urlModel));
        Music music2 = this.LJLIL.music;
        if (music2 != null) {
            urlModel2 = music2.getCoverMedium();
        } else {
            urlModel2 = null;
        }
        bundle.putSerializable("video_cover", urlModel2);
        Music music3 = this.LJLIL.music;
        if (music3 != null) {
            str2 = music3.getMid();
        } else {
            str2 = null;
        }
        bundle.putString("music_id", str2);
        bundle.putString("process_id", this.LJLIL.processId);
        Music music4 = this.LJLIL.music;
        if (music4 != null) {
            str3 = music4.getMusicName();
        } else {
            str3 = null;
        }
        bundle.putString("music_name", str3);
        Music music5 = this.LJLIL.music;
        if (music5 != null) {
            i = music5.getUserCount();
        } else {
            i = 0;
        }
        bundle.putInt("user_count", i);
        Music music6 = this.LJLIL.music;
        if (music6 != null) {
            urlModel3 = music6.getCoverThumb();
        }
        bundle.putSerializable("cover_thumb", urlModel3);
        bundle.putString("enter_from", "single_song");
        bundle.putString("enter_method", "button");
        C17N.LJJJJ(bundle, "aweme_cover_list", this.LJLIL.awemeList);
        return bundle;
    }

    @Override // X.QXX
    public final String LLLLLLLLLL() {
        ShareInfo shareInfo;
        String shareTitle;
        Music music = this.LJLIL.music;
        if (music == null || (shareInfo = music.getShareInfo()) == null || (shareTitle = shareInfo.getShareTitle()) == null) {
            return "";
        }
        return shareTitle;
    }

    @Override // X.QXX
    public final String LLLLLLZZ() {
        String str;
        ShareInfo shareInfo;
        Music music = this.LJLIL.music;
        if (music != null && (shareInfo = music.getShareInfo()) != null) {
            str = shareInfo.getShareUrl();
        } else {
            str = null;
        }
        String LJJI = C78609UtB.LJJI(C78609UtB.LJJ(str));
        if (LJJI == null) {
            return "";
        }
        return LJJI;
    }

    @Override // X.QXX
    public final ShareModel LLLLLILLIL() {
        return this.LJLIL;
    }

    public C62399OeJ(MusicShareModel musicShareModel, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = musicShareModel;
        this.LJLILLLLZI = activity;
    }
}
