package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.8i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218668i6 implements Q8Y {
    public static final C218668i6 LIZ = new C218668i6();

    @Override // X.Q8Y
    public final void LIZ(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Video video;
        User author;
        if (C218678i7.LIZIZ != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", C218678i7.LIZJ);
            Aweme aweme = C218678i7.LIZIZ;
            Integer num = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme aweme2 = C218678i7.LIZIZ;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                str2 = author.getUid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("author_id", str2);
            Aweme aweme3 = C218678i7.LIZIZ;
            if (aweme3 != null && (video = aweme3.getVideo()) != null) {
                num = Integer.valueOf(video.getDuration());
            }
            c188727au.LJFF(num, "item_duration");
            c188727au.LIZLLL(C218678i7.LIZLLL, "is_landscape_screen");
            Aweme aweme4 = C218678i7.LIZIZ;
            if (aweme4 != null && aweme4.isPaidContent) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_collection_item", str3);
            if (i != 0 && i != 180) {
                str4 = "landscape";
            } else {
                str4 = "portrait";
            }
            c188727au.LJIIIZ("to_status", str4);
            FMX.LJIIL("turn_screen", c188727au.LIZ);
        }
    }
}
