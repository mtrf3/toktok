package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162486Zg extends RuntimeException {
    public final String LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C162486Zg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    public C162486Zg(String str) {
        this.LJLIL = str;
    }

    public /* synthetic */ C162486Zg(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
