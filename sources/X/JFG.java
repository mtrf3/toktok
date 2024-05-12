package X;

import java.util.List;

/* loaded from: classes9.dex */
public abstract class JFG implements InterfaceC66819QKh {
    public JFF LIZ;

    @Override // X.InterfaceC66819QKh
    public abstract String LIZ(String str);

    @Override // X.InterfaceC66819QKh
    public abstract void LIZJ(String str, String str2);

    public void LIZLLL(List<String> list) {
        JFF jff = this.LIZ;
        if (jff != null) {
            jff.LIZLLL(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r7)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r7.equals(r3) == false) goto L30;
     */
    @Override // X.InterfaceC66819QKh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            X.JFF r4 = r5.LIZ
            java.lang.String r2 = "device_id"
            java.lang.String r3 = r5.LIZ(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r0 = r0 ^ 1
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            r6 = r3
        L19:
            if (r4 == 0) goto L38
            java.lang.String r7 = r4.LIZIZ(r6, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L2b
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L33
        L2b:
            if (r7 == 0) goto L34
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L34
        L33:
            return r7
        L34:
            r5.LIZJ(r2, r7)
            goto L33
        L38:
            if (r1 != 0) goto L5b
            if (r0 != 0) goto L5b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r0 = r0 ^ 1
            if (r0 != 0) goto L5d
        L44:
            if (r1 == 0) goto L33
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L52
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L33
        L52:
            if (r7 == 0) goto L5d
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L5d
            goto L33
        L5b:
            r7 = r6
            goto L44
        L5d:
            r5.LIZJ(r2, r7)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JFG.LIZIZ(java.lang.String, java.lang.String):java.lang.String");
    }
}
