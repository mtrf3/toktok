package X;

import X.C0Q9;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.1JE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JE<T, V extends C0Q9> implements InterfaceC24760y8<T> {
    public T LJLIL;
    public T LJLILLLLZI;
    public final C0QC<T, V> LJLJI;
    public C0Q2<T> LJLJJI;
    public final ParcelableSnapshotMutableState LJLJJL;
    public C1J8<T, V> LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public final /* synthetic */ C07190Pz LJLL;

    @Override // X.InterfaceC24760y8
    public final T getValue() {
        return this.LJLJJL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1JE(C07190Pz c07190Pz, Object obj, Object obj2, C1JR typeConverter, C0Q2 c0q2) {
        o.LJIIIZ(typeConverter, "typeConverter");
        this.LJLL = c07190Pz;
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
        this.LJLJI = typeConverter;
        this.LJLJJI = c0q2;
        this.LJLJJL = C78966Uyw.LJJJIL(obj);
        this.LJLJJLL = new C1J8<>(this.LJLJJI, typeConverter, this.LJLIL, this.LJLILLLLZI);
    }
}
