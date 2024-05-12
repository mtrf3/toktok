package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159816Oz extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final List<C159636Oh> LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C159816Oz() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, Integer.valueOf(this.LJLJJI), this.LJLJJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C159816Oz(java.lang.String r7, java.util.List r8, int r9) {
        /*
            r6 = this;
            r2 = r7
            r5 = r8
            r1 = 0
            r0 = r9 & 4
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
        L9:
            r0 = r9 & 8
            if (r0 == 0) goto L1e
            r4 = 164(0xa4, float:2.3E-43)
        Lf:
            r0 = r9 & 16
            if (r0 == 0) goto L18
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L18:
            r0 = r6
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1e:
            r4 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159816Oz.<init>(java.lang.String, java.util.List, int):void");
    }

    public C159816Oz(int i, String stickerDir, int i2, int i3, List items) {
        o.LJIIIZ(stickerDir, "stickerDir");
        o.LJIIIZ(items, "items");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = stickerDir;
        this.LJLJJI = i3;
        this.LJLJJL = items;
    }
}
