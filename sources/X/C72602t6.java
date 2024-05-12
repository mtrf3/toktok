package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72602t6 {
    public static final C78774Uvq LIZ = new C78774Uvq();

    public static void LIZ(Context context, Aweme aweme, String str, String str2) {
        ArrayList arrayList;
        List<PhotoModeImageUrlModel> imageList;
        Object obj;
        List<String> urlList;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        dialogC25756A8y.LIZIZ(R.string.tm7);
        dialogC25756A8y.LIZ(false);
        dialogC25756A8y.LIZLLL(false);
        V1B.LJLJJL(dialogC25756A8y);
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            arrayList = new ArrayList(C32I.LJJL(imageList, 10));
            Iterator<PhotoModeImageUrlModel> it = imageList.iterator();
            while (it.hasNext()) {
                UrlModel displayImageNoWatermark = it.next().getDisplayImageNoWatermark();
                if (displayImageNoWatermark == null || (urlList = displayImageNoWatermark.getUrlList()) == null || (obj = ORZ.LJLLLLLL(0, urlList)) == null) {
                    obj = "";
                }
                arrayList.add(obj);
            }
        } else {
            arrayList = null;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C72592t5(dialogC25756A8y, context, aweme, str, str2, arrayList, null), 3);
    }
}
