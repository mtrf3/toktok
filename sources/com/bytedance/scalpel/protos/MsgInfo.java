package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YZ4;
import X.YZ5;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class MsgInfo extends Message<MsgInfo, YZ5> {
    public static final ProtoAdapter<MsgInfo> ADAPTER = new YZ4();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("name")
    public String name;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    @InterfaceC65349Pkn("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    @InterfaceC65349Pkn("what")
    public Integer what;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MsgInfo, YZ5> newBuilder2() {
        YZ5 yz5 = new YZ5();
        yz5.LIZLLL = this.name;
        yz5.LJ = this.what;
        yz5.LJFF = this.timeInfo;
        yz5.addUnknownFields(unknownFields());
        return yz5;
    }

    public MsgInfo(String str, Integer num, TimeInfo timeInfo, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.name = str;
        this.what = num;
        this.timeInfo = timeInfo;
    }
}
