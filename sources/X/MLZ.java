package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MLZ extends C56766MPq {
    public final C5H3 LJLILLLLZI = V1B.LJZI(new AqS159S0100000_9(this, 953));

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // X.C56766MPq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r6 = this;
            boolean r0 = X.AX6.LIZIZ()
            if (r0 == 0) goto L83
            boolean r0 = X.INB.LIZIZ()
            if (r0 == 0) goto L83
            com.ss.android.ugc.aweme.notification.widget.WidgetFragment r0 = r6.LIZ()
            android.os.Bundle r0 = r0.getArguments()
        L14:
            if (r0 != 0) goto L1b
        L16:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L1b:
            java.lang.String r5 = "label"
            java.lang.String r4 = r0.getString(r5)
            java.lang.String r3 = "uid"
            java.lang.String r2 = r0.getString(r3)
            boolean r0 = X.AX6.LIZIZ()
            java.lang.String r1 = ""
            if (r0 == 0) goto L6f
            boolean r0 = X.INB.LIZIZ()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.notification.widget.WidgetFragment r0 = r6.LIZ()
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L42
            r0.putString(r5, r1)
        L42:
            java.lang.String r0 = "follow_request"
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.notification.widget.WidgetFragment r0 = r6.LIZ()
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "aweme://follow_request"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            r0.withParam(r5, r4)
            r0.withParam(r3, r2)
            android.content.Intent r2 = r0.buildIntent()
            com.ss.android.ugc.aweme.notification.widget.WidgetFragment r1 = r6.LIZ()
            X.C78598Ut0.LJIJJ(r2, r1)
            r0 = 1024(0x400, float:1.435E-42)
            r1.startActivityForResult(r2, r0)
        L6e:
            return
        L6f:
            com.ss.android.ugc.aweme.notification.widget.WidgetFragment r0 = r6.LIZ()
            X.1qj r0 = r0.mo49getActivity()
            if (r0 == 0) goto L42
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L42
            r0.putExtra(r5, r1)
            goto L42
        L83:
            com.ss.android.ugc.aweme.notification.widget.WidgetFragment r0 = r6.LIZ()
            X.1qj r0 = r0.mo49getActivity()
            if (r0 == 0) goto L16
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L16
            android.os.Bundle r0 = X.C16880lQ.LLJJIJI(r0)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MLZ.LJII():void");
    }

    @Override // X.C56766MPq
    public final void LIZIZ(int i, int i2, Intent intent) {
        MP2 mp2;
        if (i == 1024) {
            C56757MPh hv0 = ((NotificationVM) this.LJLILLLLZI.getValue()).hv0();
            if ((hv0 instanceof MP2) && (mp2 = (MP2) hv0) != null) {
                mp2.LJIIJ(new AqS159S0100000_9(mp2, 935));
            }
        }
    }
}
