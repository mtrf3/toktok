package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.EnumC36001EAz;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FeedbackUIRecord extends F9E {

    @InterfaceC65349Pkn("action")
    public final EnumC36001EAz action;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.action};
    }

    public FeedbackUIRecord(EnumC36001EAz action) {
        o.LJIIIZ(action, "action");
        this.action = action;
    }
}
