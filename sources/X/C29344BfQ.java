package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.BfQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29344BfQ implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;

    public C29344BfQ(WeakReference<Context> contextRef) {
        o.LJIIIZ(contextRef, "contextRef");
        this.LJLIL = contextRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    @Override // X.InterfaceC38012Evw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void call(X.C38048EwW r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            java.lang.String r3 = "args"
            r1 = 0
            r5 = 1
            if (r9 == 0) goto L9e
            org.json.JSONObject r0 = r9.LIZLLL
            if (r0 == 0) goto L9e
            boolean r0 = r0.has(r3)
            if (r0 != r5) goto L9e
            r0 = 1
        L11:
            r2 = 0
            if (r0 == 0) goto L1e
            if (r9 == 0) goto L1e
            org.json.JSONObject r0 = r9.LIZLLL
            if (r0 == 0) goto L1e
            org.json.JSONObject r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r3)
        L1e:
            java.lang.String r7 = ""
            if (r2 == 0) goto L9c
            java.lang.String r0 = "anchor_layout_type"
            java.lang.String r0 = r2.optString(r0, r7)
            if (r0 != 0) goto L9a
        L2a:
            if (r2 == 0) goto L9c
            java.lang.String r0 = "multi_guest_enable"
            int r6 = r2.optInt(r0, r5)
            java.lang.String r0 = "check_linkmic_permission"
            int r5 = r2.optInt(r0, r5)
        L38:
            java.lang.String r4 = "from_activitypage"
            if (r2 == 0) goto L44
            java.lang.String r0 = "enter_from"
            java.lang.String r3 = r2.optString(r0, r4)
            if (r3 != 0) goto L45
        L44:
            r3 = r4
        L45:
            if (r2 == 0) goto L4f
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r2.optString(r0, r4)
            if (r0 != 0) goto L98
        L4f:
            if (r10 == 0) goto L56
            java.lang.String r0 = "code"
            r10.put(r0, r1)
        L56:
            java.lang.String r2 = "sslocal://one_tap_go_live?anchor_layout_type="
            java.lang.String r1 = "&multi_guest_enable="
            java.lang.String r0 = "&enter_from="
            java.lang.StringBuilder r2 = X.AnonymousClass028.LJ(r2, r7, r1, r6, r0)
            java.lang.String r1 = "&enter_method="
            java.lang.String r0 = "&check_linkmic_permission="
            X.YE1.LIZLLL(r2, r3, r1, r4, r0)
            r2.append(r5)
            java.lang.String r2 = X.X1D.LIZIZ(r2)
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.LJLIL
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L84
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            android.app.Activity r0 = r0.getTopActivity()
            if (r0 == 0) goto L97
        L84:
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r1 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r1
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.LJLIL
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1.handle(r0, r2)
        L97:
            return
        L98:
            r4 = r0
            goto L4f
        L9a:
            r7 = r0
            goto L2a
        L9c:
            r6 = 1
            goto L38
        L9e:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29344BfQ.call(X.EwW, org.json.JSONObject):void");
    }
}
