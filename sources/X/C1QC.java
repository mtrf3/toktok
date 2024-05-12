package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1QC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QC extends F9E {
    public final String LJLIL;
    public final List<Object> LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final List<Object> LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1QC(java.lang.String r8, java.lang.String r9, java.util.List r10, java.util.List r11, int r12) {
        /*
            r7 = this;
            r4 = r11
            r0 = r12 & 8
            r1 = 0
            java.lang.String r6 = ""
            if (r0 == 0) goto L1d
            r5 = r6
        L9:
            r0 = r12 & 16
            if (r0 == 0) goto L1b
        Ld:
            r0 = r12 & 32
            if (r0 == 0) goto L13
            X.OQg r4 = X.C61878OQg.INSTANCE
        L13:
            r1 = r8
            r0 = r7
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L1b:
            r6 = r1
            goto Ld
        L1d:
            r5 = r1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1QC.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    public C1QC(String panelName, String panelKey, List effectList, List collectionList, String id, String tagsUpdateAt) {
        o.LJIIIZ(panelName, "panelName");
        o.LJIIIZ(effectList, "effectList");
        o.LJIIIZ(panelKey, "panelKey");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(tagsUpdateAt, "tagsUpdateAt");
        o.LJIIIZ(collectionList, "collectionList");
        this.LJLIL = panelName;
        this.LJLILLLLZI = effectList;
        this.LJLJI = panelKey;
        this.LJLJJI = id;
        this.LJLJJL = tagsUpdateAt;
        this.LJLJJLL = collectionList;
    }
}
