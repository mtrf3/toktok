package com.ss.android.ugc.aweme.profile.model;

import X.C2U8;
import X.F9E;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectAwemeEvent extends F9E implements IEvent {
    public final int action;
    public final String awemeId;
    public final int awemeType;

    public static /* synthetic */ CollectAwemeEvent copy$default(CollectAwemeEvent collectAwemeEvent, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = collectAwemeEvent.awemeId;
        }
        if ((i3 & 2) != 0) {
            i = collectAwemeEvent.action;
        }
        if ((i3 & 4) != 0) {
            i2 = collectAwemeEvent.awemeType;
        }
        return collectAwemeEvent.copy(str, i, i2);
    }

    public final CollectAwemeEvent copy(String awemeId, int i, int i2) {
        o.LJIIIZ(awemeId, "awemeId");
        return new CollectAwemeEvent(awemeId, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.awemeId, Integer.valueOf(this.action), Integer.valueOf(this.awemeType)};
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public CollectAwemeEvent(String awemeId, int i, int i2) {
        o.LJIIIZ(awemeId, "awemeId");
        this.awemeId = awemeId;
        this.action = i;
        this.awemeType = i2;
    }
}
