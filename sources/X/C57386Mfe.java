package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.mutual.IProfileShowMutualTabService;
import com.ss.android.ugc.aweme.profile.mutual.ProfileShowMutualTabServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Mfe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57386Mfe {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, User user, String eventType) {
        IProfileShowMutualTabService iProfileShowMutualTabService;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(eventType, "eventType");
        Object LIZ2 = C58096Mr6.LIZ(IProfileShowMutualTabService.class, false);
        if (LIZ2 != null) {
            iProfileShowMutualTabService = (IProfileShowMutualTabService) LIZ2;
        } else {
            if (C58096Mr6.c4 == null) {
                synchronized (IProfileShowMutualTabService.class) {
                    if (C58096Mr6.c4 == null) {
                        C58096Mr6.c4 = new ProfileShowMutualTabServiceImpl();
                    }
                }
            }
            iProfileShowMutualTabService = C58096Mr6.c4;
        }
        iProfileShowMutualTabService.LIZ(context, user, eventType);
    }
}
