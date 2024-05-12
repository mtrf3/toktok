package com.ss.android.ugc.aweme.trace;

import X.C64373POf;
import X.C64374POg;
import X.C64375POh;
import X.C64377POj;
import X.C64390POw;
import X.C66003PvL;
import X.PDY;
import X.PDZ;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.AqS34S1000000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UnsampledTraceLoggerImpl implements IUnsampledTraceLogger {
    public static final /* synthetic */ int LJII = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public C64373POf LJI;

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZIZ() {
        if (!this.LIZLLL) {
            return;
        }
        C64375POh.LJI(new C64374POg(this));
    }

    public UnsampledTraceLoggerImpl() {
        int i;
        int i2;
        int i3;
        C64377POj.LIZ.getClass();
        Integer num = C64377POj.LIZ().unsampledMaxDiskCacheSize;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 557056;
        }
        this.LIZ = i;
        Integer num2 = C64377POj.LIZ().unsampledMaxLogSize;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = LivePlayerResourceReleaseSetting.ENABLE;
        }
        this.LIZIZ = i2;
        Integer num3 = C64377POj.LIZ().unsampledPerSize;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 65536;
        }
        this.LIZJ = i3;
        C64390POw c64390POw = C64390POw.LIZIZ;
        this.LIZLLL = c64390POw.LJI();
        this.LJ = c64390POw.LJFF();
        this.LJFF = o.LJ(C64375POh.LIZIZ().checkAndReportLog, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        if (!this.LIZLLL) {
            return;
        }
        C66003PvL c66003PvL = new C66003PvL(context);
        c66003PvL.LJ = false;
        c66003PvL.LJFF = false;
        c66003PvL.LIZJ = this.LIZJ;
        c66003PvL.LIZIZ = this.LIZ;
        c66003PvL.LIZLLL = str;
        this.LJI = ALog.createInstance("traceAlog", c66003PvL.LIZ());
        PDY.LIZJ.LIZ = new PDZ(this);
        if (this.LJFF) {
            C64375POh.LJI(new AqS34S1000000_11(str, 1));
        }
    }
}
