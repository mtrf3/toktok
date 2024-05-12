package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.IDd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46249IDd implements IED {
    public static final Aweme LIZ(String str) {
        C2MA viewHolderByAwemeId;
        try {
            InterfaceC46246IDa LIZ = C46248IDc.LIZ();
            if (LIZ != null && (viewHolderByAwemeId = LIZ.getViewHolderByAwemeId(str)) != null) {
                return viewHolderByAwemeId.getCurrentAweme();
            }
            return AwemeService.LIZ().i6(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
