package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRL {
    public static final String LIZ(ShortVideoContext shortVideoContext) {
        Integer num;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            num = null;
        }
        int type = HR3.AIGC.getType();
        if (num == null || num.intValue() != type) {
            int type2 = HR3.PHOTO_SEARCH.getType();
            if (num == null || num.intValue() != type2) {
                return "ecommerce_comment";
            }
            return "ecommerce_photo_search";
        }
        return "aigc_take_selfie";
    }
}
