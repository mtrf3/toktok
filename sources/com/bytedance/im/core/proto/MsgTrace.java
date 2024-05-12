package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC69901Rc1;
import X.InterfaceC65349Pkn;
import X.RTB;
import X.RTC;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class MsgTrace extends Message<MsgTrace, RTC> {
    public static final ProtoAdapter<MsgTrace> ADAPTER = new RTB();
    public static final EnumC69901Rc1 DEFAULT_PATH = EnumC69901Rc1.FROM_UNKNOWN;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("metrics")
    public final Map<Integer, Long> metrics;

    @InterfaceC65349Pkn("path")
    public final EnumC69901Rc1 path;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MsgTrace, RTC> newBuilder2() {
        RTC rtc = new RTC();
        rtc.LIZLLL = C63685Oz3.LIZLLL("metrics", this.metrics);
        rtc.LJ = this.path;
        rtc.addUnknownFields(unknownFields());
        return rtc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Long> map = this.metrics;
        if (map != null && !map.isEmpty()) {
            sb.append(", metrics=");
            sb.append(this.metrics);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        return DIX.LIZLLL(sb, 0, 2, "MsgTrace{", '}');
    }

    public MsgTrace(Map<Integer, Long> map, EnumC69901Rc1 enumC69901Rc1) {
        this(map, enumC69901Rc1, C64537PUn.EMPTY);
    }

    public MsgTrace(Map<Integer, Long> map, EnumC69901Rc1 enumC69901Rc1, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.metrics = C63685Oz3.LJI("metrics", map);
        this.path = enumC69901Rc1;
    }
}
