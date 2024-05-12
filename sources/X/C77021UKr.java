package X;

import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;

/* renamed from: X.UKr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77021UKr extends RxBusSceneObserver<BNL> {
    public final /* synthetic */ C77020UKq LIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<BNL> getType() {
        return BNL.class;
    }

    public C77021UKr(C77020UKq c77020UKq) {
        this.LIZ = c77020UKq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0.get(1) == true) goto L6;
     */
    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(com.bytedance.ies.sdk.widgets.LayeredElementContext r4, com.bytedance.ies.sdk.widgets.ConstraintProperty r5, X.BNL r6) {
        /*
            r3 = this;
            X.BNL r6 = (X.BNL) r6
            java.lang.String r0 = "layeredElementContext"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "constraintProperty"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.UKq r2 = r3.LIZ
            android.util.SparseBooleanArray r0 = r6.LIZ
            if (r0 == 0) goto L25
            r1 = 1
            boolean r0 = r0.get(r1)
            if (r0 != r1) goto L25
        L1e:
            r2.getClass()
            X.C77020UKq.LIZ(r5, r1)
            return
        L25:
            r1 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77021UKr.onEvent(com.bytedance.ies.sdk.widgets.LayeredElementContext, com.bytedance.ies.sdk.widgets.ConstraintProperty, java.lang.Object):void");
    }
}
