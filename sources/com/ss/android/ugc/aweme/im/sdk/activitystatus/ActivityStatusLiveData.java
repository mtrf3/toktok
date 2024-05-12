package com.ss.android.ugc.aweme.im.sdk.activitystatus;

import X.AbstractC73672Svk;
import X.AbstractC73946T0k;
import X.AnonymousClass453;
import X.C73318Sq2;
import X.C73542Ste;
import X.C76800UCe;
import X.C78999UzT;
import X.InterfaceC88472Yns;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ActivityStatusLiveData extends MutableLiveData<ActivityStatus> {
    public final AbstractC73672Svk<ActivityStatus> activeSubject;
    public final AbstractC73946T0k computation;
    public final boolean distinctUntilChanged;
    public final C73318Sq2 hotDisposable;
    public Boolean lastStatus;
    public final AnonymousClass453 log;
    public final InterfaceC88472Yns<ActivityStatusLiveData, C76800UCe> onActive;
    public final InterfaceC88472Yns<ActivityStatusLiveData, C76800UCe> onCleanup;

    private final void subscribeToEvents() {
        this.hotDisposable.LIZLLL();
        C78999UzT.LJFF(C73542Ste.LJ(this.activeSubject.LJJL(this.computation), new AqS175S0100000_9(this, 97), new AqS159S0100000_9(this, 259), new AqS175S0100000_9(this, 98)), this.hotDisposable);
    }

    public final void cleanup() {
        this.hotDisposable.LIZLLL();
        InterfaceC88472Yns<ActivityStatusLiveData, C76800UCe> interfaceC88472Yns = this.onCleanup;
        if (interfaceC88472Yns != null && !hasObservers()) {
            interfaceC88472Yns.invoke(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        subscribeToEvents();
        InterfaceC88472Yns<ActivityStatusLiveData, C76800UCe> interfaceC88472Yns = this.onActive;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        cleanup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStatusLiveData(AbstractC73672Svk<ActivityStatus> activeSubject, boolean z, AnonymousClass453 log, AbstractC73946T0k computation, InterfaceC88472Yns<? super ActivityStatusLiveData, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super ActivityStatusLiveData, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(activeSubject, "activeSubject");
        o.LJIIIZ(log, "log");
        o.LJIIIZ(computation, "computation");
        this.activeSubject = activeSubject;
        this.distinctUntilChanged = z;
        this.log = log;
        this.computation = computation;
        this.onActive = interfaceC88472Yns;
        this.onCleanup = interfaceC88472Yns2;
        this.hotDisposable = new C73318Sq2();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActivityStatusLiveData(X.AbstractC73672Svk r8, boolean r9, X.AnonymousClass453 r10, X.AbstractC73946T0k r11, X.InterfaceC88472Yns r12, X.InterfaceC88472Yns r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r5 = r12
            r4 = r11
            r2 = r9
            r3 = r10
            r0 = r14 & 2
            if (r0 == 0) goto L9
            r2 = 1
        L9:
            r0 = r14 & 4
            if (r0 == 0) goto L14
            X.PO8 r3 = new X.PO8
            java.lang.String r0 = "ActivityStatusLiveData"
            r3.<init>(r0)
        L14:
            r0 = r14 & 8
            if (r0 == 0) goto L1f
            X.T0k r4 = X.T16.LIZIZ
            java.lang.String r0 = "computation()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
        L1f:
            r0 = r14 & 16
            r6 = 0
            if (r0 == 0) goto L25
            r5 = r6
        L25:
            r0 = r14 & 32
            if (r0 == 0) goto L2f
        L29:
            r1 = r8
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L2f:
            r6 = r13
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusLiveData.<init>(X.Svk, boolean, X.453, X.T0k, X.Yns, X.Yns, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
