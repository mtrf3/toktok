package X;

import com.google.android.gms.common.api.Status;

/* loaded from: classes7.dex */
public class ETK extends Exception {
    public final Status LJLIL;

    public Status getStatus() {
        return this.LJLIL;
    }

    public int getStatusCode() {
        return this.LJLIL.zzc;
    }

    public String getStatusMessage() {
        return this.LJLIL.zzd;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ETK(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r3 = r5.zzc
            java.lang.String r2 = r5.zzd
            if (r2 == 0) goto L2a
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 13
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            r4.LJLIL = r5
            return
        L2a:
            java.lang.String r2 = ""
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETK.<init>(com.google.android.gms.common.api.Status):void");
    }
}
