package com.bytedance.scalpel.protos;

import X.C63685Oz3;
import X.C64537PUn;
import X.C87584YYy;
import X.C87585YYz;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes17.dex */
public final class PerformanceInfo extends Message<PerformanceInfo, C87584YYy> {
    public static final ProtoAdapter<PerformanceInfo> ADAPTER = new C87585YYz();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.scalpel.protos.BinderInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    @InterfaceC65349Pkn("binder_info_list")
    public List<BinderInfo> binderInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.GCRecord#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    @InterfaceC65349Pkn("gc_record_list")
    public List<GCRecord> gcRecordList;

    @WireField(adapter = "com.bytedance.scalpel.protos.IoInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    @InterfaceC65349Pkn("io_info_list")
    public List<IoInfo> ioInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.LockInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    @InterfaceC65349Pkn("lock_info_list")
    public List<LockInfo> lockInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.MsgInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    @InterfaceC65349Pkn("msg_info_list")
    public List<MsgInfo> msgInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.RunnableInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    @InterfaceC65349Pkn("runnable_info_list")
    public List<RunnableInfo> runnableInfoList;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PerformanceInfo, C87584YYy> newBuilder2() {
        C87584YYy c87584YYy = new C87584YYy();
        c87584YYy.LIZLLL = C63685Oz3.LIZJ("gcRecordList", this.gcRecordList);
        c87584YYy.LJ = C63685Oz3.LIZJ("binderInfoList", this.binderInfoList);
        c87584YYy.LJFF = C63685Oz3.LIZJ("lockInfoList", this.lockInfoList);
        c87584YYy.LJI = C63685Oz3.LIZJ("msgInfoList", this.msgInfoList);
        c87584YYy.LJII = C63685Oz3.LIZJ("runnableInfoList", this.runnableInfoList);
        c87584YYy.LJIIIIZZ = C63685Oz3.LIZJ("ioInfoList", this.ioInfoList);
        c87584YYy.addUnknownFields(unknownFields());
        return c87584YYy;
    }

    public PerformanceInfo(List<GCRecord> list, List<BinderInfo> list2, List<LockInfo> list3, List<MsgInfo> list4, List<RunnableInfo> list5, List<IoInfo> list6, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.gcRecordList = C63685Oz3.LJFF("gcRecordList", list);
        this.binderInfoList = C63685Oz3.LJFF("binderInfoList", list2);
        this.lockInfoList = C63685Oz3.LJFF("lockInfoList", list3);
        this.msgInfoList = C63685Oz3.LJFF("msgInfoList", list4);
        this.runnableInfoList = C63685Oz3.LJFF("runnableInfoList", list5);
        this.ioInfoList = C63685Oz3.LJFF("ioInfoList", list6);
    }
}
