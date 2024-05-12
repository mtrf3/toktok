package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Eae, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36692Eae extends Exception {
    public final String LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C36692Eae() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    public C36692Eae(String str) {
        this.LJLIL = str;
    }

    public /* synthetic */ C36692Eae(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
