package com.bytedance.scalpel.protos;

import X.C64537PUn;
import X.InterfaceC65349Pkn;
import X.YZ6;
import X.YZ7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes17.dex */
public final class BinderInfo extends Message<BinderInfo, YZ7> {
    public static final ProtoAdapter<BinderInfo> ADAPTER = new YZ6();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("interface_name")
    public String interfaceName;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 6)
    @InterfaceC65349Pkn("stack")
    public MethodStack stack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    @InterfaceC65349Pkn("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    @InterfaceC65349Pkn("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @InterfaceC65349Pkn("time_stamp_range")
    public TimeStampRange timeStampRange;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    @InterfaceC65349Pkn("transact_code")
    public Integer transactCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @InterfaceC65349Pkn("transact_name")
    public String transactName;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BinderInfo, YZ7> newBuilder2() {
        YZ7 yz7 = new YZ7();
        yz7.LIZLLL = this.interfaceName;
        yz7.LJ = this.transactCode;
        yz7.LJFF = this.transactName;
        yz7.LJI = this.threadName;
        yz7.LJII = this.timeInfo;
        yz7.LJIIIIZZ = this.stack;
        yz7.LJIIIZ = this.timeStampRange;
        yz7.addUnknownFields(unknownFields());
        return yz7;
    }

    public BinderInfo(String str, Integer num, String str2, String str3, TimeInfo timeInfo, MethodStack methodStack, TimeStampRange timeStampRange, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.interfaceName = str;
        this.transactCode = num;
        this.transactName = str2;
        this.threadName = str3;
        this.timeInfo = timeInfo;
        this.stack = methodStack;
        this.timeStampRange = timeStampRange;
    }
}
