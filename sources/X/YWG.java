package X;

import com.ss.android.ugc.aweme.contact.model.SharePermission;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWG {
    public static final /* synthetic */ int LIZ = 0;

    public static YNU LIZ(SharePermission sharePermission) {
        o.LJIIIZ(sharePermission, "sharePermission");
        return new YNU(sharePermission.getUserId(), sharePermission.getUserShareStatus(), sharePermission.getTtnShareStatus(), sharePermission.getUpdateTime(), sharePermission.getExtra());
    }
}
