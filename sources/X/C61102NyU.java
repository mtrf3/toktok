package X;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.NyU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61102NyU extends AbstractC61106NyY {
    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        WeakReference<InterfaceC61105NyX> weakReference;
        InterfaceC61105NyX interfaceC61105NyX;
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        if (c61101NyT != null && (weakReference = c61101NyT.LIZLLL) != null && (interfaceC61105NyX = weakReference.get()) != null) {
            interfaceC61105NyX.Ig(C47261Igj.LJJIJIIJI(Arrays.copyOf(strArr, strArr.length)));
        }
    }
}
