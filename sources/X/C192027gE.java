package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192027gE extends F9E implements C33Q {
    public final AbstractC72932td<CollectionDetail> LJLIL;
    public final AbstractC72932td<List<C192217gX>> LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;

    public C192027gE() {
        this((C72912tb) null, 0L, false, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C192027gE(X.C72912tb r7, long r8, boolean r10, int r11) {
        /*
            r6 = this;
            r5 = r10
            r2 = r7
            r3 = r8
            r0 = r11 & 1
            if (r0 == 0) goto L1f
            X.33X r1 = X.C33X.LIZ
        L9:
            r0 = r11 & 2
            if (r0 == 0) goto Lf
            X.33X r2 = X.C33X.LIZ
        Lf:
            r0 = r11 & 4
            if (r0 == 0) goto L15
            r3 = 0
        L15:
            r0 = r11 & 8
            if (r0 == 0) goto L1a
            r5 = 1
        L1a:
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
        L1f:
            r1 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192027gE.<init>(X.2tb, long, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C192027gE(AbstractC72932td<CollectionDetail> detail, AbstractC72932td<? extends List<C192217gX>> data, long j, boolean z) {
        o.LJIIIZ(detail, "detail");
        o.LJIIIZ(data, "data");
        this.LJLIL = detail;
        this.LJLILLLLZI = data;
        this.LJLJI = j;
        this.LJLJJI = z;
    }

    public static C192027gE L(C192027gE c192027gE, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, boolean z, int i) {
        long j;
        boolean z2 = z;
        AbstractC72932td detail = abstractC72932td;
        AbstractC72932td data = abstractC72932td2;
        if ((i & 1) != 0) {
            detail = c192027gE.LJLIL;
        }
        if ((i & 2) != 0) {
            data = c192027gE.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            j = c192027gE.LJLJI;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            z2 = c192027gE.LJLJJI;
        }
        c192027gE.getClass();
        o.LJIIIZ(detail, "detail");
        o.LJIIIZ(data, "data");
        return new C192027gE((AbstractC72932td<CollectionDetail>) detail, (AbstractC72932td<? extends List<C192217gX>>) data, j, z2);
    }
}
