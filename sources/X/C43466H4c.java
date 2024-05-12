package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.H4c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43466H4c extends C41819Gb9 {
    public static final C43467H4d Companion = new C43467H4d();
    public final int LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Throwable LJLJL;
    public final String LJLJLJ;

    public static final C43466H4c create(int i, String str, String str2) {
        Companion.getClass();
        return C43467H4d.LIZ(i, str, str2);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishDebugMockException(stage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", stageDescription='");
        LIZ.append(this.LJLJJL);
        LIZ.append("', extra=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.C41819Gb9, java.lang.Throwable
    public Throwable getCause() {
        return this.LJLJL;
    }

    @Override // X.C41819Gb9, java.lang.Throwable
    public String getMessage() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C43466H4c(Throwable cause, String message) {
        this(-1, H1T.COMPILE.getDesc(), null, message, cause);
        o.LJIIIZ(cause, "cause");
        o.LJIIIZ(message, "message");
    }

    public static final C43466H4c create(int i, String stageDescription) {
        Companion.getClass();
        o.LJIIIZ(stageDescription, "stageDescription");
        return C43467H4d.LIZ(i, stageDescription, null);
    }

    public static final C43466H4c createWithCauseAndMessage(Throwable cause, String message) {
        Companion.getClass();
        o.LJIIIZ(cause, "cause");
        o.LJIIIZ(message, "message");
        return new C43466H4c(cause, message);
    }

    public C43466H4c(int i, String str, String str2, String str3, Throwable th) {
        super(null, null, 3, null);
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = th;
        this.LJLJLJ = str3;
    }
}
