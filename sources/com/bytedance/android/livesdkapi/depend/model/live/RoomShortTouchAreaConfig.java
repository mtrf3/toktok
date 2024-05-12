package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes14.dex */
public final class RoomShortTouchAreaConfig extends F9E {

    @InterfaceC65349Pkn("elements")
    public Map<Integer, Element> elements;

    /* loaded from: classes14.dex */
    public static final class Element extends F9E {

        @InterfaceC65349Pkn("priority")
        public Integer priority;

        @InterfaceC65349Pkn("type")
        public Integer type;

        @Override // X.F9E
        public final Object[] getObjects() {
            Integer num = this.type;
            Integer num2 = this.priority;
            return new Object[]{num, num, num2, num2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Map<Integer, Element> map = this.elements;
        return new Object[]{map, map, map};
    }
}
