package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YYL;
import X.YYM;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class TimeStampRange extends Message<TimeStampRange, YYM> {
    public static final ProtoAdapter<TimeStampRange> ADAPTER = new YYL();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    @InterfaceC65349Pkn("end_timestamp")
    public Long endTimestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    @InterfaceC65349Pkn("start_timestamp")
    public Long startTimestamp;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<TimeStampRange, YYM> newBuilder2() {
        YYM yym = new YYM();
        yym.LIZLLL = this.startTimestamp;
        yym.LJ = this.endTimestamp;
        yym.addUnknownFields(unknownFields());
        return yym;
    }

    public TimeStampRange(Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.startTimestamp = l;
        this.endTimestamp = l2;
    }
}
