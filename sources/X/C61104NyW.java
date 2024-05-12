package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.NyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61104NyW extends AbstractC61106NyY {
    public final AbstractC61106NyY LIZIZ;

    public C61104NyW(AbstractC61106NyY interceptorImpl) {
        o.LJIIIZ(interceptorImpl, "interceptorImpl");
        this.LIZIZ = interceptorImpl;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        this.LIZIZ.LIZ(c61101NyT, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
