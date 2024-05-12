package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YZ2;
import X.YZ3;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class RunnableInfo extends Message<RunnableInfo, YZ3> {
    public static final ProtoAdapter<RunnableInfo> ADAPTER = new YZ2();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 4)
    @InterfaceC65349Pkn("method_stack")
    public MethodStack methodStack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("name")
    public String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    @InterfaceC65349Pkn("nameIsMethod")
    public Boolean nameismethod;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    @InterfaceC65349Pkn("tag")
    public Integer tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    @InterfaceC65349Pkn("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    @InterfaceC65349Pkn("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @InterfaceC65349Pkn("time_stamp_range")
    public TimeStampRange timeStampRange;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RunnableInfo, YZ3> newBuilder2() {
        YZ3 yz3 = new YZ3();
        yz3.LIZLLL = this.name;
        yz3.LJ = this.threadName;
        yz3.LJFF = this.timeInfo;
        yz3.LJI = this.methodStack;
        yz3.LJII = this.tag;
        yz3.LJIIIIZZ = this.nameismethod;
        yz3.LJIIIZ = this.timeStampRange;
        yz3.addUnknownFields(unknownFields());
        return yz3;
    }

    public RunnableInfo(String str, String str2, TimeInfo timeInfo, MethodStack methodStack, Integer num, Boolean bool, TimeStampRange timeStampRange, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.name = str;
        this.threadName = str2;
        this.timeInfo = timeInfo;
        this.methodStack = methodStack;
        this.tag = num;
        this.nameismethod = bool;
        this.timeStampRange = timeStampRange;
    }
}
