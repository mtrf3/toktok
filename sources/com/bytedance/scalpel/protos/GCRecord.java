package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YZ0;
import X.YZ1;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class GCRecord extends Message<GCRecord, YZ1> {
    public static final ProtoAdapter<GCRecord> ADAPTER = new YZ0();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    @InterfaceC65349Pkn("alloc_size")
    public Long allocSize;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 4)
    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("gc_type")
    public Integer gcType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 3)
    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    @InterfaceC65349Pkn("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", tag = 6)
    @InterfaceC65349Pkn("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @InterfaceC65349Pkn("time_stamp_range")
    public TimeStampRange timeStampRange;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GCRecord, YZ1> newBuilder2() {
        YZ1 yz1 = new YZ1();
        yz1.LIZLLL = this.gcType;
        yz1.LJ = this.allocSize;
        yz1.LJFF = this.startTime;
        yz1.LJI = this.endTime;
        yz1.LJII = this.threadName;
        yz1.LJIIIIZZ = this.timeInfo;
        yz1.LJIIIZ = this.timeStampRange;
        yz1.addUnknownFields(unknownFields());
        return yz1;
    }

    public GCRecord(Integer num, Long l, Long l2, Long l3, String str, TimeInfo timeInfo, TimeStampRange timeStampRange, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.gcType = num;
        this.allocSize = l;
        this.startTime = l2;
        this.endTime = l3;
        this.threadName = str;
        this.timeInfo = timeInfo;
        this.timeStampRange = timeStampRange;
    }
}
