package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.C87575YYp;
import X.C87576YYq;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class PerfData extends Message<PerfData, C87576YYq> {
    public static final ProtoAdapter<PerfData> ADAPTER = new C87575YYp();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    @InterfaceC65349Pkn("data")
    public C64537PUn data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    @InterfaceC65349Pkn("data_type")
    public Integer dataType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("timestamp")
    public Long timestamp;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PerfData, C87576YYq> newBuilder2() {
        C87576YYq c87576YYq = new C87576YYq();
        c87576YYq.LIZLLL = this.timestamp;
        c87576YYq.LJ = this.dataType;
        c87576YYq.LJFF = this.data;
        c87576YYq.addUnknownFields(unknownFields());
        return c87576YYq;
    }

    public PerfData(Long l, Integer num, C64537PUn c64537PUn, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.timestamp = l;
        this.dataType = num;
        this.data = c64537PUn;
    }
}
