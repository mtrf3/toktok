package com.bytedance.pitaya.api.bean;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PTYApplogEvent extends F9E implements ReflectionCall {
    public final String args;
    public final String eventName;
    public final double timestamp;
    public final PTYApplogEventType type;

    public static /* synthetic */ PTYApplogEvent copy$default(PTYApplogEvent pTYApplogEvent, String str, String str2, PTYApplogEventType pTYApplogEventType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYApplogEvent.eventName;
        }
        if ((i & 2) != 0) {
            str2 = pTYApplogEvent.args;
        }
        if ((i & 4) != 0) {
            pTYApplogEventType = pTYApplogEvent.type;
        }
        return pTYApplogEvent.copy(str, str2, pTYApplogEventType);
    }

    public final PTYApplogEvent copy(String eventName, String str, PTYApplogEventType type) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(type, "type");
        return new PTYApplogEvent(eventName, str, type);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.eventName, this.args, this.type};
    }

    public final String getArgs() {
        return this.args;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    public final PTYApplogEventType getType() {
        return this.type;
    }

    public PTYApplogEvent(String eventName, String str, PTYApplogEventType type) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(type, "type");
        this.eventName = eventName;
        this.args = str;
        this.type = type;
        this.timestamp = System.currentTimeMillis() / 1000.0d;
    }

    public /* synthetic */ PTYApplogEvent(String str, String str2, PTYApplogEventType pTYApplogEventType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? PTYApplogEventType.NORMAL : pTYApplogEventType);
    }
}
