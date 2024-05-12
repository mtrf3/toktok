package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class H0H extends C41819Gb9 {
    public final String LJLJJI;
    public final Throwable LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public H0H() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H0H(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @Override // X.C41819Gb9, java.lang.Throwable
    public Throwable getCause() {
        return this.LJLJJL;
    }

    public final String getCoverPath() {
        return this.LJLJJI;
    }

    public H0H(String str, Throwable th) {
        super(null, th, 1, null);
        this.LJLJJI = str;
        this.LJLJJL = th;
    }

    public /* synthetic */ H0H(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
