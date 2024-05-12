package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixFlowParam extends F9E implements Serializable {
    public final String eventType;
    public final String from;

    public static /* synthetic */ MixFlowParam copy$default(MixFlowParam mixFlowParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mixFlowParam.eventType;
        }
        if ((i & 2) != 0) {
            str2 = mixFlowParam.from;
        }
        return mixFlowParam.copy(str, str2);
    }

    public final MixFlowParam copy(String eventType, String from) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(from, "from");
        return new MixFlowParam(eventType, from);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.eventType, this.from};
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getFrom() {
        return this.from;
    }

    public MixFlowParam(String eventType, String from) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(from, "from");
        this.eventType = eventType;
        this.from = from;
    }
}
