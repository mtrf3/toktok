package X;

import android.content.DialogInterface;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog;

/* renamed from: X.GyW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnDismissListenerC43268GyW implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DynamicAdExplainDialog LJLIL;

    public DialogInterfaceOnDismissListenerC43268GyW(DynamicAdExplainDialog dynamicAdExplainDialog) {
        this.LJLIL = dynamicAdExplainDialog;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0.getBoolean("is_not_other_exit") == false) goto L15;
     */
    @Override // android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r9) {
        /*
            r8 = this;
            com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog r7 = r8.LJLIL
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LJLLILLLL
            r5 = 0
            java.lang.String r2 = "sheet"
            if (r0 == 0) goto L6e
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r1 = "is_not_other_exit"
            if (r0 == 0) goto L68
            boolean r0 = r0.getBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L19:
            r4 = 0
            if (r0 == 0) goto L2c
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LJLLILLLL
            if (r0 == 0) goto L6a
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L57
            boolean r0 = r0.getBoolean(r1)
            if (r0 != 0) goto L57
        L2c:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r7.LJLIL
            java.lang.String r1 = "about_this_ad"
            java.lang.String r0 = "exit"
            X.N0h r6 = X.C58704N2e.LIZLLL(r1, r0, r2)
            java.lang.String r1 = "close_method"
            java.lang.String r0 = "all_others"
            r6.LIZIZ(r0, r1)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.LLF
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "page_stay_time"
            r6.LIZIZ(r1, r0)
            java.lang.String r1 = "toggle_final_status"
            java.lang.Integer r0 = r7.LJLJLJ
            r6.LIZIZ(r0, r1)
            r6.LJI()
        L57:
            r7.vl()
            com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog r0 = r8.LJLIL
            X.1qj r0 = r0.LJLJJI
            X.LRe r1 = X.LRD.LIZ(r0)
            java.lang.String r0 = "ad_explain_static_dynamic"
            r1.LJIIJ(r0, r4, r5)
            return
        L68:
            r0 = r5
            goto L19
        L6a:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r5
        L6e:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC43268GyW.onDismiss(android.content.DialogInterface):void");
    }
}
