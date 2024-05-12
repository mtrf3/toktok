package com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics;

import X.ActivityC45651qj;
import X.C115824gc;
import X.C116694i1;
import X.C34B;
import X.C45804HyK;
import X.C73411SrX;
import X.EnumC112364b2;
import X.InterfaceC53896LDg;
import X.LKR;
import X.LLE;
import X.ORY;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusAccuracyImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActivityStatusAccuracyImpl {
    public static final EnumC112364b2[] LJI = {EnumC112364b2.INBOX_TOP, EnumC112364b2.CHAT_CELL};
    public final EnumC112364b2 LIZ;
    public final LifecycleOwner LIZIZ;
    public C73411SrX LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Boolean LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
    
        if (r14.LIZLLL != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
    
        if (r14.LJ != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r14 = this;
            androidx.lifecycle.LifecycleOwner r0 = r14.LIZIZ
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            boolean r2 = r1.isAtLeast(r0)
            X.4b2 r0 = r14.LIZ
            int[] r1 = X.C112384b4.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L2d
            r0 = 2
            if (r1 == r0) goto L38
        L20:
            java.lang.Boolean r1 = r14.LJFF
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L42
            return
        L2d:
            if (r2 == 0) goto L40
            boolean r0 = r14.LIZLLL
            if (r0 == 0) goto L40
            boolean r0 = r14.LJ
            if (r0 == 0) goto L40
            goto L3e
        L38:
            if (r2 == 0) goto L40
            boolean r0 = r14.LIZLLL
            if (r0 == 0) goto L40
        L3e:
            r2 = 1
            goto L20
        L40:
            r2 = 0
            goto L20
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r14.LJFF = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "check page visibility "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r14.LIZIZ(r0)
            r1 = 0
            if (r2 == 0) goto Ld9
            java.lang.String r0 = "start polling"
            r14.LIZIZ(r0)
            X.SrX r0 = r14.LIZJ
            if (r0 == 0) goto L6a
            r0.dispose()
        L6a:
            java.util.Set<X.4b2> r2 = X.C112354b1.LIZ
            X.4b2 r0 = r14.LIZ
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L75
        L74:
            return
        L75:
            X.Ol8 r0 = X.C35564DxY.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L81:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r6 = r3.next()
            r0 = r6
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig r0 = (com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig) r0
            java.lang.String r2 = r0.position
            X.4b2 r0 = r14.LIZ
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L81
        L9c:
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig r6 = (com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig) r6
            if (r6 != 0) goto Lb0
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig r6 = new com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig
            X.4b2 r0 = X.EnumC112364b2.INBOX_TOP
            java.lang.String r7 = r0.getValue()
            r8 = 0
            r12 = 6
            r13 = 0
            r10 = r8
            r6.<init>(r7, r8, r10, r12, r13)
        Lb0:
            long r4 = r6.initialDelay
            r2 = 1
            long r7 = java.lang.Math.max(r4, r2)
            long r4 = r6.pollingInterval
            r2 = 3
            long r9 = java.lang.Math.max(r4, r2)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            X.T0k r12 = X.T16.LIZIZ
            X.SsD r3 = X.AbstractC73672Svk.LJJIJ(r7, r9, r11, r12)
            kotlin.jvm.internal.AqS167S0100000_1 r2 = new kotlin.jvm.internal.AqS167S0100000_1
            r0 = 523(0x20b, float:7.33E-43)
            r2.<init>(r14, r0)
            r0 = 3
            X.SrX r0 = X.C73542Ste.LJIIIIZZ(r3, r1, r1, r2, r0)
            r14.LIZJ = r0
            goto L74
        Ld7:
            r6 = r1
            goto L9c
        Ld9:
            java.lang.String r0 = "stop polling"
            r14.LIZIZ(r0)
            X.SrX r0 = r14.LIZJ
            if (r0 == 0) goto Le5
            r0.dispose()
        Le5:
            r14.LIZJ = r1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusAccuracyImpl.LIZ():void");
    }

    public final void LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.getValue());
        LIZ.append('_');
        LIZ.append(str);
        C34B.LIZIZ("ActivityStatusAccuracyImpl", X1D.LIZIZ(LIZ));
    }

    public ActivityStatusAccuracyImpl(EnumC112364b2 position, LifecycleOwner lifecycleOwner, Context context) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(position, "position");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = position;
        this.LIZIZ = lifecycleOwner;
        LLE lle = new LLE() { // from class: X.4ga
            @Override // X.LLE
            public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
                ActivityStatusAccuracyImpl.this.LIZLLL = o.LJ(str, "NOTIFICATION");
                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = ActivityStatusAccuracyImpl.this;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mainTabChangeListener_isInInboxPage:");
                LIZ.append(ActivityStatusAccuracyImpl.this.LIZLLL);
                activityStatusAccuracyImpl.LIZIZ(X1D.LIZIZ(LIZ));
                ActivityStatusAccuracyImpl.this.LIZ();
            }
        };
        InterfaceC53896LDg interfaceC53896LDg = new InterfaceC53896LDg() { // from class: X.4gb
            @Override // X.InterfaceC53907LDr
            public final String L6() {
                return "";
            }

            @Override // X.InterfaceC53896LDg
            public final void LLLLILI(Bundle bundle) {
                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = ActivityStatusAccuracyImpl.this;
                activityStatusAccuracyImpl.LIZLLL = false;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mainTabChangeListener_isInInboxPage:");
                LIZ.append(ActivityStatusAccuracyImpl.this.LIZLLL);
                activityStatusAccuracyImpl.LIZIZ(X1D.LIZIZ(LIZ));
                ActivityStatusAccuracyImpl.this.LIZ();
            }

            @Override // X.InterfaceC53896LDg
            public final void LLLLLLZ(Bundle args) {
                o.LJIIIZ(args, "args");
                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = ActivityStatusAccuracyImpl.this;
                activityStatusAccuracyImpl.LIZLLL = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mainTabChangeListener_isInInboxPage:");
                LIZ.append(ActivityStatusAccuracyImpl.this.LIZLLL);
                activityStatusAccuracyImpl.LIZIZ(X1D.LIZIZ(LIZ));
                ActivityStatusAccuracyImpl.this.LIZ();
            }
        };
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusAccuracyImpl.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                int i = C115824gc.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        ActivityStatusAccuracyImpl.this.LIZIZ("on destroy");
                        ActivityStatusAccuracyImpl.this.LIZ();
                        return;
                    }
                    ActivityStatusAccuracyImpl.this.LIZIZ("on pause");
                    ActivityStatusAccuracyImpl.this.LIZ();
                    return;
                }
                ActivityStatusAccuracyImpl.this.LIZIZ("on resume");
                ActivityStatusAccuracyImpl.this.LIZ();
            }
        });
        if (ORY.LJJIJIIJIL(position, LJI) && context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C116694i1.LIZ(LJJIFFI).hv0(lle);
            Hox.LJLLI.LIZ(LJJIFFI).hv0("NOTIFICATION", interfaceC53896LDg);
            this.LIZLLL = LKR.LIZIZ(LJJIFFI, "NOTIFICATION");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isInInboxPage:");
            LIZ.append(this.LIZLLL);
            LIZIZ(X1D.LIZIZ(LIZ));
            LIZ();
        }
    }
}
