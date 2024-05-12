package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeShareModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OeK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62400OeK extends QXX {
    public final ChallengeShareModel LJLIL;
    public final Activity LJLILLLLZI;

    @Override // X.QXX
    public final String LLJL() {
        return "challenge";
    }

    @Override // X.QXX
    public final String LJZI() {
        ShareInfo shareInfo;
        String shareDesc;
        Challenge challenge = this.LJLIL.challenge;
        if (challenge == null || (shareInfo = challenge.getShareInfo()) == null || (shareDesc = shareInfo.getShareDesc()) == null) {
            return "";
        }
        return shareDesc;
    }

    @Override // X.QXX
    public final String LLJJJJ() {
        String cid;
        Challenge challenge = this.LJLIL.challenge;
        if (challenge == null || (cid = challenge.getCid()) == null) {
            return "";
        }
        return cid;
    }

    @Override // X.QXX
    public final ShareModel LLLLLILLIL() {
        return new ShareModel(this.LJLIL.challenge);
    }

    @Override // X.QXX
    public final Bundle LLLLLJIL() {
        String str;
        String str2;
        long j;
        int i;
        User author;
        Bundle bundle = new Bundle();
        bundle.putString("app_name", this.LJLILLLLZI.getString(R.string.bri));
        Challenge challenge = this.LJLIL.challenge;
        String str3 = null;
        if (challenge != null && (author = challenge.getAuthor()) != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        bundle.putString("uid_for_share", str);
        Challenge challenge2 = this.LJLIL.challenge;
        if (challenge2 != null) {
            str2 = challenge2.getCid();
        } else {
            str2 = null;
        }
        bundle.putString("challenge_id", str2);
        bundle.putString("process_id", this.LJLIL.processId);
        Challenge challenge3 = this.LJLIL.challenge;
        if (challenge3 != null) {
            str3 = challenge3.getChallengeName();
        }
        bundle.putString("challenge_name", str3);
        Challenge challenge4 = this.LJLIL.challenge;
        if (challenge4 != null) {
            j = challenge4.getDisplayCount();
        } else {
            j = 0;
        }
        bundle.putLong("view_count", j);
        Challenge challenge5 = this.LJLIL.challenge;
        boolean z = false;
        if (challenge5 != null) {
            i = challenge5.getUserCount();
        } else {
            i = 0;
        }
        bundle.putInt("user_count", i);
        Challenge challenge6 = this.LJLIL.challenge;
        if (challenge6 != null) {
            z = challenge6.isCommerce();
        }
        bundle.putBoolean("is_commerce", z);
        C17N.LJJJJ(bundle, "cover_thumb", this.LJLIL.awemeList);
        bundle.putString("enter_from", "challenge");
        bundle.putString("enter_method", "button");
        bundle.putString("extra_parent_tag_id", this.LJLIL.originId);
        return bundle;
    }

    @Override // X.QXX
    public final String LLLLLLLLLL() {
        ShareInfo shareInfo;
        String shareTitle;
        Challenge challenge = this.LJLIL.challenge;
        if (challenge == null || (shareInfo = challenge.getShareInfo()) == null || (shareTitle = shareInfo.getShareTitle()) == null) {
            return "";
        }
        return shareTitle;
    }

    @Override // X.QXX
    public final String LLLLLLZZ() {
        String str;
        ShareInfo shareInfo;
        Challenge challenge = this.LJLIL.challenge;
        if (challenge != null && (shareInfo = challenge.getShareInfo()) != null) {
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

    public C62400OeK(ChallengeShareModel challengeShareModel, ActivityC45651qj activityC45651qj) {
        this.LJLIL = challengeShareModel;
        this.LJLILLLLZI = activityC45651qj;
    }
}
