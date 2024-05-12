package X;

import X.C0Q9;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.1JK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JK<T, V extends C0Q9> implements InterfaceC24760y8<T> {
    public final C0QC<T, V> LJLIL;
    public final ParcelableSnapshotMutableState LJLILLLLZI;
    public V LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC24760y8
    public final T getValue() {
        return this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C1JK(X.C0QC r10, java.lang.Object r11, X.C0Q9 r12, int r13) {
        /*
            r9 = this;
            r3 = r12
            r0 = r13 & 4
            if (r0 == 0) goto L6
            r3 = 0
        L6:
            r0 = r13 & 8
            if (r0 == 0) goto L1d
            r4 = -9223372036854775808
        Lc:
            r0 = r13 & 16
            if (r0 == 0) goto L1a
            r6 = -9223372036854775808
        L12:
            r8 = 0
            r1 = r10
            r0 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6, r8)
            return
        L1a:
            r6 = 0
            goto L12
        L1d:
            r4 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1JK.<init>(X.0QC, java.lang.Object, X.0Q9, int):void");
    }

    public C1JK(C0QC<T, V> typeConverter, T t, V v, long j, long j2, boolean z) {
        V v2;
        o.LJIIIZ(typeConverter, "typeConverter");
        this.LJLIL = typeConverter;
        this.LJLILLLLZI = C78966Uyw.LJJJIL(t);
        this.LJLJI = (v == null || (v2 = (V) C78946Uyc.LJIIIZ(v)) == null) ? (V) C78598Ut0.LJFF(typeConverter, t) : v2;
        this.LJLJJI = j;
        this.LJLJJL = z;
    }
}
