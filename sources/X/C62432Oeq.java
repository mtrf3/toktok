package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import kotlin.jvm.internal.o;

/* renamed from: X.Oeq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62432Oeq {
    public static Integer LIZ(Aweme aweme) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadMaskPanel;
        if (o.LJ(C62443Of1.LIZ, "long_press_download")) {
            AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
            if (awemeACLShare != null && (downloadMaskPanel = awemeACLShare.getDownloadMaskPanel()) != null) {
                return Integer.valueOf(downloadMaskPanel.getCode());
            }
        } else {
            AwemeACLShare awemeACLShare2 = aweme.awemeACLShareInfo;
            if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null) {
                return Integer.valueOf(downloadGeneral.getCode());
            }
        }
        return null;
    }
}
