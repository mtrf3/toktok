package com.ss.android.ugc.aweme.profile.mutual;

import X.A06;
import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfileShowMutualTabServiceImpl implements IProfileShowMutualTabService {
    @Override // com.ss.android.ugc.aweme.profile.mutual.IProfileShowMutualTabService
    public final void LIZ(Context context, User user, String eventType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(eventType, "eventType");
        A06.LIZ(context, user, "mutual_relation", null, eventType);
    }
}
