package X;

import java.io.IOException;

/* renamed from: X.Pdu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64922Pdu extends IOException {
    public static final long serialVersionUID = -5596590843227115865L;

    public C64922Pdu() {
    }

    public C64922Pdu(Throwable th) {
        initCause(th);
    }

    public C64922Pdu(String str) {
        super(str);
    }

    public C64922Pdu(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
