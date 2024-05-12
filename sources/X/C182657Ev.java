package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* renamed from: X.7Ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182657Ev {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Aweme aweme, Long l, String str2) {
        String str3;
        String str4;
        Integer num;
        boolean z;
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        Integer num2 = null;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        if (aweme != null) {
            str4 = aweme.getAid();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("group_id", str4);
        if (aweme != null && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
            num = Integer.valueOf(imageList.size());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "pic_cnt");
        if (aweme != null) {
            num2 = Integer.valueOf(aweme.getAwemeType());
        }
        c188727au.LJFF(num2, "aweme_type");
        c188727au.LJFF(l, "duration");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null) {
            z = photoModeImageInfo.hasTitle();
        } else {
            z = false;
        }
        c188727au.LJFF(Boolean.valueOf(z), "has_title");
        c188727au.LJIIIZ("from_page", str2);
        FMX.LJIIL("video_pause_time", c188727au.LIZ);
    }
}
