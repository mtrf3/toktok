package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OXh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62061OXh extends BroadcastReceiver {
    public final Context LIZ;
    public final InterfaceC88471Ynr<Boolean, String, C76800UCe> LIZIZ;

    public C62061OXh(Context context, AqS192S0100000_10 aqS192S0100000_10) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = aqS192S0100000_10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:7|(11:9|10|(1:42)(1:14)|15|(2:30|(4:32|(1:34)(1:40)|35|(7:37|(1:39)|18|19|20|21|(2:23|24)(2:26|27)))(1:41))|17|18|19|20|21|(0)(0)))(1:44)|43|10|(1:12)|42|15|(0)|17|18|19|20|21|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r2 = 0
            if (r10 == 0) goto L6e
            java.lang.String r1 = r10.getAction()
        L7:
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto Lad
            if (r10 == 0) goto L6b
            android.os.Bundle r4 = X.C16880lQ.LLJJIJI(r10)
            if (r4 == 0) goto L6c
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
            java.lang.Object r1 = X.C16880lQ.LLJJIII(r4, r0)
        L1d:
            boolean r0 = r1 instanceof com.google.android.gms.common.api.Status
            if (r0 == 0) goto L69
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            if (r1 == 0) goto L69
            int r0 = r1.zzc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L2b:
            r5 = 1
            r3 = 0
            if (r6 != 0) goto L35
        L2f:
            r4 = r2
        L30:
            boolean r7 = X.C48479J0x.LIZ(r9)
            goto L70
        L35:
            int r0 = r6.intValue()
            if (r0 != 0) goto L65
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"
            java.lang.Object r1 = X.C16880lQ.LLJJIII(r4, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L63
            java.lang.String r1 = (java.lang.String) r1
        L47:
            java.lang.String r0 = "[0-9]{4,}"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L2f
            java.lang.String r4 = r1.group(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L30
            r3 = 1
            goto L30
        L63:
            r1 = r2
            goto L47
        L65:
            r6.intValue()
            goto L2f
        L69:
            r6 = r2
            goto L2b
        L6b:
            r4 = r2
        L6c:
            r1 = r2
            goto L1d
        L6e:
            r1 = r2
            goto L7
        L70:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Exception -> L78
            int r5 = X.C16880lQ.LLLLLZIL(r0, r9)     // Catch: java.lang.Exception -> L78
        L78:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "statusCode: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", hasSimCard: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", googleAvailability: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", success: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = 4
            X.C36746EbW.LIZ(r0, r1)
            if (r3 == 0) goto Lae
            X.Ynr<java.lang.Boolean, java.lang.String, X.UCe> r1 = r8.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0, r4)
        Lad:
            return
        Lae:
            X.Ynr<java.lang.Boolean, java.lang.String, X.UCe> r1 = r8.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0, r2)
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62061OXh.LIZ(android.content.Context, android.content.Intent):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
