package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.21y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C519021y extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C519021y INSTANCE = new C519021y();

    public C519021y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String path;
        Context LIZLLL = C15380j0.LIZLLL();
        File LLIIIZ = C16880lQ.LLIIIZ(LIZLLL);
        if ((LLIIIZ != null && (path = LLIIIZ.getPath()) != null) || (path = C16880lQ.LLIIIL(LIZLLL).getPath()) != null) {
            return path;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
