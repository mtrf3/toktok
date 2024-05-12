package com.ss.android.ugc.aweme.dsp.common.utils;

import X.C16880lQ;
import X.EF7;
import X.IUT;
import X.InterfaceC63764P0u;
import X.SV7;
import X.SV9;
import X.SVA;
import X.SVF;
import X.SVG;
import X.SVH;
import android.content.Context;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReportQueueManager implements InterfaceC63764P0u {
    public static final ReportQueueManager INSTANCE;
    public static SVG eventType;
    public static final IUT<String> queue;
    public static SVA targetApp;

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
    }

    static {
        ReportQueueManager reportQueueManager = new ReportQueueManager();
        INSTANCE = reportQueueManager;
        ActivityStack.addAppBackGroundListener(reportQueueManager);
        SV9.LIZ.getClass();
        int afReportNum = SV9.LJIIIIZZ.getAfReportNum();
        if (afReportNum > 100) {
            afReportNum = 100;
        }
        queue = new IUT<>(afReportNum);
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
        SVA sva;
        SVG svg;
        boolean z;
        IUT<String> iut = queue;
        ArrayList arrayList = new ArrayList(iut.LIZ());
        synchronized (iut) {
            ((LinkedList) iut.LIZIZ).clear();
        }
        if (arrayList.isEmpty() || (sva = targetApp) == null || (svg = eventType) == null) {
            return;
        }
        Context LIZIZ = EF7.LIZIZ();
        SV7 sv7 = SV7.LIZ;
        Context LLLLL = C16880lQ.LLLLL(LIZIZ);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        if (svg.getActionType() == SVH.DSP_ACTION_CLICK) {
            z = true;
        } else {
            z = false;
        }
        sv7.getClass();
        if (!SV7.LJ(sva, LLLLL, z)) {
            return;
        }
        SVF.LIZ(new AqS162S0100000_12(arrayList, (List<String>) 1085));
    }

    public final SVG getEventType() {
        return eventType;
    }

    public final SVA getTargetApp() {
        return targetApp;
    }

    public final void enqueue(String item) {
        o.LJIIIZ(item, "item");
        queue.LIZIZ(item);
    }

    public final void setEventType(SVG svg) {
        eventType = svg;
    }

    public final void setTargetApp(SVA sva) {
        targetApp = sva;
    }
}
