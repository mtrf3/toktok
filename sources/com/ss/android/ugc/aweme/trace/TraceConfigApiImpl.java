package com.ss.android.ugc.aweme.trace;

import X.C38995FSd;
import X.C64375POh;
import X.C64382POo;
import X.E5O;
import X.POW;
import X.RunnableC64380POm;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TraceConfigApiImpl implements ITraceConfigApi {
    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZ() {
        return o.LJ(C64375POh.LIZIZ().globalEnable, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZIZ() {
        Integer num = C64375POh.LIZIZ().unsampledTraceControlFlag;
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZJ() {
        List<String> list;
        TraceLogConfig LIZIZ = C64375POh.LIZIZ();
        if (!o.LJ(LIZIZ.globalEnable, Boolean.TRUE) || (list = LIZIZ.apiLogWhitelist) == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final C64382POo LJ() {
        long j;
        Long l = C64375POh.LIZIZ().apiLogTraceExpireTs;
        if (l != null) {
            j = l.longValue();
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        return new C64382POo(j);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJFF() {
        Integer num = C64375POh.LIZIZ().unsampledTraceControlFlag;
        if (num == null || num.intValue() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJI() {
        TraceLogConfig LIZIZ = C64375POh.LIZIZ();
        Integer num = LIZIZ.unsampledTraceControlFlag;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        Integer num2 = LIZIZ.unsampledTraceControlFlag;
        if (num2 != null && num2.intValue() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJIIIIZZ() {
        if (!o.LJ(C64375POh.LIZIZ().globalEnable, Boolean.TRUE)) {
            return false;
        }
        Integer num = C64375POh.LIZIZ().logErrorReportFlag;
        if (num != null && (num.intValue() & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final void LIZLLL(E5O e5o) {
        C64375POh.LJ = e5o;
        if (o.LJ(C64375POh.LIZIZ().globalEnable, Boolean.TRUE)) {
            C38995FSd.LIZJ().execute(RunnableC64380POm.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJII(String str) {
        TraceLogConfig LIZIZ = C64375POh.LIZIZ();
        if (!o.LJ(LIZIZ.globalEnable, Boolean.TRUE) || POW.LIZIZ(str, LIZIZ.apiLogBlacklist) || !POW.LIZIZ(str, LIZIZ.apiLogWhitelist)) {
            return false;
        }
        return true;
    }
}
