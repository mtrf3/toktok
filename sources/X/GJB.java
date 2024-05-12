package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.InfoModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJB {
    public static DynamicAdExplainDialog LIZ(ActivityC45651qj act, AwemeRawAd rawAd, String enterFrom, int i, InfoModel infoModel) {
        o.LJIIIZ(act, "act");
        o.LJIIIZ(rawAd, "rawAd");
        o.LJIIIZ(enterFrom, "enterFrom");
        return new DynamicAdExplainDialog(act, rawAd, enterFrom, i, infoModel);
    }
}
