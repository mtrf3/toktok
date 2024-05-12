package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Je7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49647Je7 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public C49647Je7() {
        this(null, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C49647Je7(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = r6 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L7
            r5 = r3
        L7:
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L17
            r1 = r3
        Ld:
            r0 = r6 & 4
            if (r0 == 0) goto L15
        L11:
            r4.<init>(r5, r1, r3)
            return
        L15:
            r3 = r2
            goto L11
        L17:
            r1 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49647Je7.<init>(java.lang.String, int):void");
    }

    public C49647Je7(String str, String str2, String str3) {
        HH1.LIZ(str, "searchId", str2, "innerFlowGroupId", str3, "outerFlowGroupId");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    public static C49647Je7 L(C49647Je7 c49647Je7, String innerFlowGroupId, String outerFlowGroupId, int i) {
        String searchId;
        if ((i & 1) != 0) {
            searchId = c49647Je7.LJLIL;
        } else {
            searchId = null;
        }
        if ((i & 2) != 0) {
            innerFlowGroupId = c49647Je7.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            outerFlowGroupId = c49647Je7.LJLJI;
        }
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(innerFlowGroupId, "innerFlowGroupId");
        o.LJIIIZ(outerFlowGroupId, "outerFlowGroupId");
        return new C49647Je7(searchId, innerFlowGroupId, outerFlowGroupId);
    }
}
