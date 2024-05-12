package X;

import Y.ARunnableS7S0210000_8;
import android.content.Context;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.SyndicatedSdkImpressionEvent;
import com.twitter.sdk.android.core.internal.scribe.SyndicationClientEvent;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.PiO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65200PiO extends C65187PiB {
    public static volatile ScheduledExecutorService LJIIL;
    public final InterfaceC65283Pjj<? extends Session<TwitterAuthToken>> LJIIIZ;
    public final String LJIIJ;
    public final Context LJIIJJI;

    public C65200PiO() {
        throw null;
    }

    public final void LIZIZ(EventNamespace... eventNamespaceArr) {
        ScribeEvent syndicationClientEvent;
        long j;
        for (EventNamespace eventNamespace : eventNamespaceArr) {
            List emptyList = Collections.emptyList();
            String language = this.LJIIJJI.getResources().getConfiguration().locale.getLanguage();
            long currentTimeMillis = System.currentTimeMillis();
            String str = this.LJIIJ;
            String str2 = eventNamespace.client;
            str2.getClass();
            if (!str2.equals("tfw")) {
                syndicationClientEvent = new SyndicatedSdkImpressionEvent(eventNamespace, currentTimeMillis, language, str, emptyList);
            } else {
                syndicationClientEvent = new SyndicationClientEvent(eventNamespace, "", currentTimeMillis, language, str, emptyList);
            }
            Session LIZIZ = ((C65264PjQ) this.LJIIIZ).LIZIZ();
            if (LIZIZ != null) {
                j = LIZIZ.id;
            } else {
                j = 0;
            }
            try {
                C65191PiF LIZ = LIZ(j);
                LIZ.getClass();
                try {
                    LIZ.LIZIZ.submit(new ARunnableS7S0210000_8(LIZ, syndicationClientEvent, 6));
                } catch (Exception unused) {
                    C78841Uwv.LJJI(LIZ.LIZ);
                }
            } catch (IOException unused2) {
                C78841Uwv.LJJI(this.LIZIZ);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65200PiO(X.C43862HJi r11, X.C65264PjQ r12, X.C65254PjG r13, X.C65266PjS r14, X.C65077PgP r15) {
        /*
            r10 = this;
            X.PjP r0 = X.C65263PjP.LIZIZ()
            com.twitter.sdk.android.core.TwitterAuthConfig r6 = r0.LIZLLL
            java.util.concurrent.ScheduledExecutorService r0 = X.C65200PiO.LJIIL
            if (r0 != 0) goto L2d
            java.lang.Class<X.PiO> r4 = X.C65200PiO.class
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = X.C65200PiO.LJIIL     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L28
            java.lang.String r3 = "scribe"
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            X.FSr r0 = new X.FSr     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils.newSingleThreadScheduledExecutor(r0)     // Catch: java.lang.Throwable -> L2a
            X.FSG.LIZ(r3, r0)     // Catch: java.lang.Throwable -> L2a
            X.C65200PiO.LJIIL = r0     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L2d:
            java.util.concurrent.ScheduledExecutorService r3 = X.C65200PiO.LJIIL
            X.PiG r5 = new X.PiG
            com.google.gson.e r1 = new com.google.gson.e
            r1.<init>()
            com.google.gson.c r0 = com.google.gson.c.LOWER_CASE_WITH_UNDERSCORES
            r1.LIZJ = r0
            com.google.gson.Gson r0 = r1.LIZ()
            r5.<init>(r0)
            r2 = r11
            r1 = r10
            r7 = r12
            r8 = r13
            r4 = r15
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.LJIIJJI = r2
            r1.LJIIIZ = r7
            java.lang.String r0 = r9.LIZ()
            r1.LJIIJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65200PiO.<init>(X.HJi, X.PjQ, X.PjG, X.PjS, X.PgP):void");
    }
}
