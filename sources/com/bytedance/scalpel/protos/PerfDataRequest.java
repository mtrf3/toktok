package com.bytedance.scalpel.protos;

import X.C63685Oz3;
import X.C64537PUn;
import X.C87573YYn;
import X.C87574YYo;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes17.dex */
public final class PerfDataRequest extends Message<PerfDataRequest, C87574YYo> {
    public static final ProtoAdapter<PerfDataRequest> ADAPTER = new C87573YYn();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 2)
    @InterfaceC65349Pkn("build_time")
    public Long buildTime;

    @WireField(adapter = "com.bytedance.scalpel.protos.PerfData#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    @InterfaceC65349Pkn("datas")
    public List<PerfData> datas;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PerfDataRequest, C87574YYo> newBuilder2() {
        C87574YYo c87574YYo = new C87574YYo();
        c87574YYo.LIZLLL = C63685Oz3.LIZJ("datas", this.datas);
        c87574YYo.LJ = this.buildTime;
        c87574YYo.addUnknownFields(unknownFields());
        return c87574YYo;
    }

    public PerfDataRequest(List<PerfData> list, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.datas = C63685Oz3.LJFF("datas", list);
        this.buildTime = l;
    }
}
