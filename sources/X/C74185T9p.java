package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.T9p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74185T9p extends CancellationException {
    public final InterfaceC79150V4o coroutine;

    /* renamed from: createCopy, reason: merged with bridge method [inline-methods] */
    public C74185T9p m40createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C74185T9p c74185T9p = new C74185T9p(message, this.coroutine);
        c74185T9p.initCause(this);
        return c74185T9p;
    }

    public C74185T9p(String str) {
        this(str, null);
    }

    public C74185T9p(String str, InterfaceC79150V4o interfaceC79150V4o) {
        super(str);
        this.coroutine = interfaceC79150V4o;
    }
}
