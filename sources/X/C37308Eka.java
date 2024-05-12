package X;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.Eka, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37308Eka extends CancellationException {
    public final InterfaceC79150V4o job;

    /* renamed from: createCopy, reason: merged with bridge method [inline-methods] */
    public C37308Eka m19createCopy() {
        return null;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int hashCode;
        String message = getMessage();
        o.LJI(message);
        int hashCode2 = (this.job.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause == null) {
            hashCode = 0;
        } else {
            hashCode = cause.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("; job=");
        LIZ.append(this.job);
        return X1D.LIZIZ(LIZ);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C37308Eka) {
                C37308Eka c37308Eka = (C37308Eka) obj;
                if (!o.LJ(c37308Eka.getMessage(), getMessage()) || !o.LJ(c37308Eka.job, this.job) || !o.LJ(c37308Eka.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public C37308Eka(String str, Throwable th, InterfaceC79150V4o interfaceC79150V4o) {
        super(str);
        this.job = interfaceC79150V4o;
        if (th != null) {
            initCause(th);
        }
    }
}
