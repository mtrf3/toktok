package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gne, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42594Gne {
    public static void LIZJ(String str, Aweme aweme, String str2) {
        Integer num;
        String str3;
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        User author;
        C188727au c188727au = new C188727au();
        String str4 = null;
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str3 = author.getRegion();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("country_name", str3);
        c188727au.LJIIIZ("download_method", str);
        if (aweme != null) {
            str4 = aweme.getAid();
        }
        c188727au.LJIIIZ("group_id", str4);
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i = imageList.size();
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "pic_cnt");
        c188727au.LJIIIZ("status", str2);
        FMX.LJIIL("download_popup_click", c188727au.LIZ);
    }

    public final void LIZ(C43170Gww downloadPhotoHandler, Aweme aweme, String enterFrom, String downloadMethod, String fromPage) {
        ACLCommonShare aCLCommonShare;
        o.LJIIIZ(downloadPhotoHandler, "downloadPhotoHandler");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        o.LJIIIZ(fromPage, "fromPage");
        java.util.Set LJ = C77275UUl.LJ(0);
        C42592Gnc c42592Gnc = new C42592Gnc(0);
        c42592Gnc.LIZIZ = false;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null) {
            aCLCommonShare = awemeACLShare.getDownloadGeneral();
        } else {
            aCLCommonShare = null;
        }
        c42592Gnc.LIZ = aCLCommonShare;
        C44896Hjg.LJIIIIZZ(enterFrom, downloadMethod, downloadPhotoHandler, aweme, LJ, c42592Gnc.LIZ(), new C42595Gnf(this, aweme, fromPage, enterFrom, downloadMethod), 64);
    }

    public static void LIZIZ(Aweme aweme, String fromPage, String enterFrom, String downloadMethod, int i, C42593Gnd c42593Gnd) {
        int i2;
        ACLCommonShare aCLCommonShare;
        String title;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(fromPage, "fromPage");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("download_method", downloadMethod);
        c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
        c188727au.LIZLLL(1, "pic_cnt");
        c188727au.LIZLLL(1, "download_pic_cnt");
        c188727au.LIZLLL(i, "is_photo_download");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (title = photoModeImageInfo.getTitle()) == null || ujb.o.LJJJJJL(title)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2 ^ 1, "has_title");
        c188727au.LJIIIZ("from_page", fromPage);
        Object LJII = c220488l2.LJII(aweme, c188727au);
        C222578oP.LIZJ(LJII, aweme, null, null, 14);
        C188727au c188727au2 = (C188727au) LJII;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (i == 1) {
            if (c42593Gnd == null || (aCLCommonShare = c42593Gnd.LIZ) == null || aCLCommonShare.getTranscode() != 1) {
                str = "1";
            }
            c188727au2.LJI("is_save_with_watermark", str);
        } else {
            if (!C44896Hjg.LJII(aweme)) {
                str = "1";
            }
            c188727au2.LJI("is_save_with_watermark", str);
        }
        FMX.LJIIL("download", c188727au2.LIZ);
    }
}
