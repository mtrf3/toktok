package com.bytedance.pitaya.bdcomponentimpl.monitor;

import X.C64373POf;
import X.InterfaceC93293aOX;
import android.content.Context;
import com.bytedance.pitaya.log.PitayaLogPrinter;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class ALogPrinter implements PitayaLogPrinter {
    public C64373POf ins;

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public void uploadLogToServer(long j, long j2, String scene, InterfaceC93293aOX interfaceC93293aOX) {
        o.LJIIJ(scene, "scene");
    }

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public long getNativeImpl() {
        C64373POf c64373POf = this.ins;
        if (c64373POf != null) {
            return c64373POf.LIZ.LJII;
        }
        return 0L;
    }

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public void init(Context context) {
        o.LJIIJ(context, "context");
        this.ins = ALog.createInstance("pitaya", context);
    }

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public void d(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        C64373POf c64373POf = this.ins;
        if (c64373POf != null && ALog.checkPrioAndTag(3, tag)) {
            c64373POf.LIZ.LJIIJJI(1, tag, msg);
        }
    }

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public void e(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        C64373POf c64373POf = this.ins;
        if (c64373POf != null && ALog.checkPrioAndTag(6, tag)) {
            c64373POf.LIZ.LJIIJJI(4, tag, msg);
        }
    }

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public void i(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        C64373POf c64373POf = this.ins;
        if (c64373POf != null && ALog.checkPrioAndTag(4, tag)) {
            c64373POf.LIZ.LJIIJJI(2, tag, msg);
        }
    }

    @Override // com.bytedance.pitaya.log.PitayaLogPrinter
    public void w(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        C64373POf c64373POf = this.ins;
        if (c64373POf != null && ALog.checkPrioAndTag(5, tag)) {
            c64373POf.LIZ.LJIIJJI(3, tag, msg);
        }
    }
}
