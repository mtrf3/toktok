package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8NS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NS extends C8NR {
    public static final C8NS LIZJ = new C8NS();

    public static final void LJII(Context context, Aweme aweme, int i) {
        int i2;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i2 = imageList.size();
        } else {
            i2 = 0;
        }
        if (i >= i2 - 2 || !C8NU.LIZ().getEnable()) {
            return;
        }
        int i3 = i2 - 1;
        int i4 = i + 2;
        if (i3 <= i4) {
            i4 = i3;
        }
        int defaultHorizontalCount = (C8NU.LIZ().getDefaultHorizontalCount() + i4) - 1;
        if (defaultHorizontalCount <= i3) {
            i3 = defaultHorizontalCount;
        }
        LIZJ.LIZJ(context, aweme, new C40517FvF(i4, i3), KL0.HIGH);
    }
}
