package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Wzq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84118Wzq implements X0W {
    public final /* synthetic */ C84094WzS LIZ;

    public C84118Wzq(X0G x0g) {
        this.LIZ = x0g;
    }

    @Override // X.X0W
    public final void LIZ(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((X0W) it.next()).LIZ(z);
        }
    }
}
