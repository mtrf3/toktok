package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YZ9;
import X.YZA;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class LockInfo extends Message<LockInfo, YZA> {
    public static final ProtoAdapter<LockInfo> ADAPTER = new YZ9();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    @InterfaceC65349Pkn("extra")
    public String extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    @InterfaceC65349Pkn("owner_stack")
    public String ownerStack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    @InterfaceC65349Pkn("owner_thread")
    public String ownerThread;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 6)
    @InterfaceC65349Pkn("stack")
    public MethodStack stack;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    @InterfaceC65349Pkn("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @InterfaceC65349Pkn("time_stamp_range")
    public TimeStampRange timeStampRange;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("waiter_stack")
    public String waiterStack;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<LockInfo, YZA> newBuilder2() {
        YZA yza = new YZA();
        yza.LIZLLL = this.waiterStack;
        yza.LJ = this.ownerThread;
        yza.LJFF = this.ownerStack;
        yza.LJI = this.timeInfo;
        yza.LJII = this.extra;
        yza.LJIIIIZZ = this.stack;
        yza.LJIIIZ = this.timeStampRange;
        yza.addUnknownFields(unknownFields());
        return yza;
    }

    public LockInfo(String str, String str2, String str3, TimeInfo timeInfo, String str4, MethodStack methodStack, TimeStampRange timeStampRange, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.waiterStack = str;
        this.ownerThread = str2;
        this.ownerStack = str3;
        this.timeInfo = timeInfo;
        this.extra = str4;
        this.stack = methodStack;
        this.timeStampRange = timeStampRange;
    }
}
