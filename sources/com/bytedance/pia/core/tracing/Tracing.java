package com.bytedance.pia.core.tracing;

import X.C37613EpV;
import X.InterfaceC37416EmK;
import X.InterfaceC37466En8;
import X.InterfaceC65349Pkn;
import Y.IDRunnableS0S0201000;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public final class Tracing {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<Event> LIZ = new ArrayList();
    public final Set<InterfaceC37466En8> LIZIZ = new HashSet();
    public final AtomicLong LIZJ = new AtomicLong(0);

    /* loaded from: classes7.dex */
    public class Event {

        @InterfaceC65349Pkn("id")
        public long id;

        @InterfaceC65349Pkn("name")
        public final EventName name;

        @InterfaceC37416EmK
        public boolean LIZ = false;

        @InterfaceC65349Pkn("ts")
        public final Long timestamp = Long.valueOf(System.currentTimeMillis());

        @InterfaceC65349Pkn("args")
        public final Map<String, Object> args = new HashMap();

        public final void LIZ() {
            Tracing tracing = Tracing.this;
            tracing.getClass();
            C37613EpV.LIZJ(new IDRunnableS0S0201000(2, tracing, this, 5));
        }

        public Event(EventName eventName) {
            this.id = Tracing.this.LIZJ.getAndIncrement();
            this.name = eventName;
        }
    }

    public final Event LIZ(EventName eventName) {
        return new Event(eventName);
    }
}
