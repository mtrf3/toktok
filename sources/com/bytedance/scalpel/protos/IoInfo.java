package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YZ8;
import X.YZB;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class IoInfo extends Message<IoInfo, YZB> {
    public static final ProtoAdapter<IoInfo> ADAPTER = new YZ8();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("name")
    public String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    @InterfaceC65349Pkn("owner_stack")
    public String ownerStack;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 5)
    @InterfaceC65349Pkn("stack")
    public MethodStack stack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @InterfaceC65349Pkn("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    @InterfaceC65349Pkn("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @InterfaceC65349Pkn("time_stamp_range")
    public TimeStampRange timeStampRange;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<IoInfo, YZB> newBuilder2() {
        YZB yzb = new YZB();
        yzb.LIZLLL = this.name;
        yzb.LJ = this.ownerStack;
        yzb.LJFF = this.threadName;
        yzb.LJI = this.timeInfo;
        yzb.LJII = this.stack;
        yzb.LJIIIIZZ = this.timeStampRange;
        yzb.addUnknownFields(unknownFields());
        return yzb;
    }

    public IoInfo(String str, String str2, String str3, TimeInfo timeInfo, MethodStack methodStack, TimeStampRange timeStampRange, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.name = str;
        this.ownerStack = str2;
        this.threadName = str3;
        this.timeInfo = timeInfo;
        this.stack = methodStack;
        this.timeStampRange = timeStampRange;
    }
}
