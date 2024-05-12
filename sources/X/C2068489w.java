package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdvertiserFollowerCountLabelAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.89w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2068489w extends AbstractC65781Prl implements InterfaceC88471Ynr<AdvertiserFollowerCountLabelAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C2068489w LJLIL = new C2068489w();

    public C2068489w() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdvertiserFollowerCountLabelAssem advertiserFollowerCountLabelAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        AwemeTextLabelModel followerLabel;
        Integer num;
        boolean z;
        boolean z2;
        String str;
        Gson LIZ;
        Gson LIZ2;
        AdvertiserFollowerCountLabelAssem selectSubscribe = advertiserFollowerCountLabelAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme()) != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAwemeRawAd();
            String str2 = null;
            if (awemeRawAd != null && (followerLabel = awemeRawAd.getFollowerLabel()) != null) {
                String labelName = followerLabel.getLabelName();
                User author = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAuthor();
                if (author != null) {
                    num = Integer.valueOf(author.getFollowerCount());
                } else {
                    num = null;
                }
                boolean isEnableShow = followerLabel.isEnableShow();
                if (labelName == null || labelName.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && num != null && num.intValue() >= 5000 && isEnableShow) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAwemeRawAd());
                    LIZLLL.LIZJ("tag", "refer");
                    GsonProvider LIZLLL2 = GsonHolder.LIZLLL();
                    if (LIZLLL2 != null && (LIZ2 = LIZLLL2.LIZ()) != null) {
                        str2 = GsonProtectorUtils.toJson(LIZ2, C03660Ck.LIZJ("tag_type", "follower"));
                    }
                    LIZLLL.LIZJ(str2, "ad_extra_data");
                    LIZLLL.LJI();
                } else {
                    if (labelName == null || labelName.length() == 0) {
                        str = "text is null";
                    } else if (num == null || num.intValue() < 5000) {
                        str = "follower count less than 5000";
                    } else if (!isEnableShow) {
                        str = "enable_show is false";
                    } else {
                        str = "unknown";
                    }
                    C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "show_fail", ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAwemeRawAd());
                    LIZLLL3.LIZJ("tag", "refer");
                    GsonProvider LIZLLL4 = GsonHolder.LIZLLL();
                    if (LIZLLL4 != null && (LIZ = LIZLLL4.LIZ()) != null) {
                        str2 = GsonProtectorUtils.toJson(LIZ, C45243HpH.LIZ("tag_type", "follower", "error_code", str));
                    }
                    LIZLLL3.LIZJ(str2, "ad_extra_data");
                    LIZLLL3.LJI();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
