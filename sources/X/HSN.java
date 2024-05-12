package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HSN {
    public static boolean LIZ(Aweme aweme) {
        boolean mvThemeRecordMode;
        boolean z;
        List<AnchorCommonStruct> anchors;
        o.LJIIIZ(aweme, "aweme");
        if (C58122Pw.LIZ) {
            mvThemeRecordMode = ((Boolean) HSO.LIZ.getValue()).booleanValue();
        } else {
            mvThemeRecordMode = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getMvThemeRecordMode();
        }
        boolean shieldTemplateExp = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getShieldTemplateExp();
        boolean enableShowMvAnchor = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableShowMvAnchor();
        boolean enableShowCutsameAnchor = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableShowCutsameAnchor();
        if (mvThemeRecordMode && !shieldTemplateExp && (anchors = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnchorCommonStruct next = it.next();
                if (next.getType() == 29) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
        }
        z = false;
        if (!TextUtils.isEmpty(aweme.getUploadMiscInfoStruct().mvThemeId)) {
            if (aweme.getUploadMiscInfoStruct().mvType == 2) {
                if (z && enableShowCutsameAnchor) {
                    return true;
                }
                return false;
            }
            if (z && enableShowMvAnchor) {
                return true;
            }
            return false;
        }
        return z;
    }
}
