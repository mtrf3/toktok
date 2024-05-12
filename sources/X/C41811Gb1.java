package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Gb1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41811Gb1 extends C41819Gb9 {
    public final int LJLJJI;
    public final String LJLJJL;

    public final int getCode() {
        return this.LJLJJI;
    }

    public final String getErrorMessage() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41811Gb1(int i, String errorMessage, Throwable th) {
        super(errorMessage, th);
        o.LJIIIZ(errorMessage, "errorMessage");
        this.LJLJJI = i;
        this.LJLJJL = errorMessage;
    }

    public /* synthetic */ C41811Gb1(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : th);
    }
}
