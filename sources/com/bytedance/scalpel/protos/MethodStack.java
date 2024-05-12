package com.bytedance.scalpel.protos;

import X.C63685Oz3;
import X.C64537PUn;
import X.C87571YYl;
import X.C87572YYm;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes17.dex */
public final class MethodStack extends Message<MethodStack, C87572YYm> {
    public static final ProtoAdapter<MethodStack> ADAPTER = new C87571YYl();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 2)
    @InterfaceC65349Pkn("ids")
    public List<Long> ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    @InterfaceC65349Pkn("methods")
    public List<String> methods;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 6)
    @InterfaceC65349Pkn("native_stack")
    public List<String> nativeStack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    @InterfaceC65349Pkn("stack_type")
    public Integer stackType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    @InterfaceC65349Pkn("thread_name")
    public String threadName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("time")
    public Long time;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MethodStack, C87572YYm> newBuilder2() {
        C87572YYm c87572YYm = new C87572YYm();
        c87572YYm.LIZLLL = this.time;
        c87572YYm.LJ = C63685Oz3.LIZJ("ids", this.ids);
        c87572YYm.LJFF = this.stackType;
        c87572YYm.LJI = this.threadName;
        c87572YYm.LJII = C63685Oz3.LIZJ("methods", this.methods);
        c87572YYm.LJIIIIZZ = C63685Oz3.LIZJ("nativeStack", this.nativeStack);
        c87572YYm.addUnknownFields(unknownFields());
        return c87572YYm;
    }

    public MethodStack(Long l, List<Long> list, Integer num, String str, List<String> list2, List<String> list3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.time = l;
        this.ids = C63685Oz3.LJFF("ids", list);
        this.stackType = num;
        this.threadName = str;
        this.methods = C63685Oz3.LJFF("methods", list2);
        this.nativeStack = C63685Oz3.LJFF("nativeStack", list3);
    }
}
