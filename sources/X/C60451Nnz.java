package X;

import com.lynx.tasm.LynxViewClient;

/* renamed from: X.Nnz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60451Nnz extends AbstractC60815Ntr {
    public final /* synthetic */ LynxViewClient LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (((java.util.ArrayList) r1).contains(r4.LJLILLLLZI) == false) goto L8;
     */
    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.InterfaceC60710NsA r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C60606NqU
            if (r0 == 0) goto L1a
            r2 = r5
            X.NqU r2 = (X.C60606NqU) r2
            java.util.List<com.lynx.tasm.LynxViewClient> r1 = r2.LJJ
            if (r1 == 0) goto L15
            com.lynx.tasm.LynxViewClient r0 = r4.LJLILLLLZI
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1a
        L15:
            com.lynx.tasm.LynxViewClient r0 = r4.LJLILLLLZI
            r2.LJI(r0)
        L1a:
            java.lang.String r0 = r4.LJLJI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4e
            X.Flg r0 = r5.getType()
            int[] r1 = X.C60452No0.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 != r0) goto L4e
            X.NqU r5 = (X.C60606NqU) r5
            java.lang.String r3 = r4.LJLJI
            X.Nnn r2 = new X.Nnn
            r2.<init>()
            java.lang.String r0 = ""
            com.lynx.tasm.TemplateData r0 = com.lynx.tasm.TemplateData.LJFF(r0)
            r2.LIZ = r0
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r3)
            java.lang.String r0 = "initial_data"
            r2.LIZ(r0, r1)
            r5.LJJII = r2
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60451Nnz.LJIL(X.NsA):void");
    }

    public C60451Nnz(LynxViewClient lynxViewClient, String str) {
        this.LJLILLLLZI = lynxViewClient;
        this.LJLJI = str;
    }
}
