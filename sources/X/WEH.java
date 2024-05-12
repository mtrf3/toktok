package X;

import java.io.IOException;

/* loaded from: classes15.dex */
public class WEH extends IOException {
    public WEH(String str) {
        super(str);
    }

    public WEH(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
