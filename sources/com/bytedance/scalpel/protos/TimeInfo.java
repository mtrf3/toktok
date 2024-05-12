package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.C87582YYw;
import X.C87583YYx;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class TimeInfo extends Message<TimeInfo, C87582YYw> {
    public static final ProtoAdapter<TimeInfo> ADAPTER = new C87583YYx();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    @InterfaceC65349Pkn("end_cpu_time")
    public Long endCpuTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    @InterfaceC65349Pkn("end_wall_time")
    public Long endWallTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    @InterfaceC65349Pkn("start_cpu_time")
    public Long startCpuTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    @InterfaceC65349Pkn("start_wall_time")
    public Long startWallTime;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<TimeInfo, C87582YYw> newBuilder2() {
        C87582YYw c87582YYw = new C87582YYw();
        c87582YYw.LIZLLL = this.startWallTime;
        c87582YYw.LJ = this.endWallTime;
        c87582YYw.LJFF = this.startCpuTime;
        c87582YYw.LJI = this.endCpuTime;
        c87582YYw.addUnknownFields(unknownFields());
        return c87582YYw;
    }

    public TimeInfo(Long l, Long l2, Long l3, Long l4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.startWallTime = l;
        this.endWallTime = l2;
        this.startCpuTime = l3;
        this.endCpuTime = l4;
    }
}
