package com.bytedance.scalpel.protos;

import X.C63685Oz3;
import X.C64537PUn;
import X.C87578YYs;
import X.C87579YYt;
import X.C87580YYu;
import X.C87581YYv;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes17.dex */
public final class BigJankMsg extends Message<BigJankMsg, C87581YYv> {
    public static final ProtoAdapter<BigJankMsg> ADAPTER = new C87580YYu();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.scalpel.protos.BigJankMsg$MessageDispatch#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    @InterfaceC65349Pkn("big_jank_msg")
    public List<MessageDispatch> bigJankMsg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @InterfaceC65349Pkn("method_mapping")
    public String methodMapping;

    /* loaded from: classes17.dex */
    public static final class MessageDispatch extends Message<MessageDispatch, C87578YYs> {
        public static final ProtoAdapter<MessageDispatch> ADAPTER = new C87579YYt();
        public static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
        @InterfaceC65349Pkn("custom_scene")
        public String customScene;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
        @InterfaceC65349Pkn("interval_time")
        public Long intervalTime;

        @WireField(adapter = "com.bytedance.scalpel.protos.PerformanceInfo#ADAPTER", tag = 4)
        @InterfaceC65349Pkn("performance_info")
        public PerformanceInfo performanceInfo;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public String scene;

        @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
        @InterfaceC65349Pkn("stacks")
        public List<MethodStack> stacks;

        @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", tag = 5)
        @InterfaceC65349Pkn("time_info")
        public TimeInfo timeInfo;

        @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
        @InterfaceC65349Pkn("time_stamp_range")
        public TimeStampRange timeStampRange;

        @Override // com.squareup.wire.Message
        /* renamed from: newBuilder */
        public Message.Builder<MessageDispatch, C87578YYs> newBuilder2() {
            C87578YYs c87578YYs = new C87578YYs();
            c87578YYs.LIZLLL = C63685Oz3.LIZJ("stacks", this.stacks);
            c87578YYs.LJ = this.intervalTime;
            c87578YYs.LJFF = this.scene;
            c87578YYs.LJI = this.performanceInfo;
            c87578YYs.LJII = this.timeInfo;
            c87578YYs.LJIIIIZZ = this.customScene;
            c87578YYs.LJIIIZ = this.timeStampRange;
            c87578YYs.addUnknownFields(unknownFields());
            return c87578YYs;
        }

        public MessageDispatch(List<MethodStack> list, Long l, String str, PerformanceInfo performanceInfo, TimeInfo timeInfo, String str2, TimeStampRange timeStampRange, C64537PUn c64537PUn) {
            super(ADAPTER, c64537PUn);
            this.stacks = C63685Oz3.LJFF("stacks", list);
            this.intervalTime = l;
            this.scene = str;
            this.performanceInfo = performanceInfo;
            this.timeInfo = timeInfo;
            this.customScene = str2;
            this.timeStampRange = timeStampRange;
        }
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BigJankMsg, C87581YYv> newBuilder2() {
        C87581YYv c87581YYv = new C87581YYv();
        c87581YYv.LIZLLL = this.methodMapping;
        c87581YYv.LJ = C63685Oz3.LIZJ("bigJankMsg", this.bigJankMsg);
        c87581YYv.addUnknownFields(unknownFields());
        return c87581YYv;
    }

    public BigJankMsg(String str, List<MessageDispatch> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.methodMapping = str;
        this.bigJankMsg = C63685Oz3.LJFF("bigJankMsg", list);
    }
}
