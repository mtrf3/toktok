package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Nk9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60213Nk9<T extends View> {
    public final java.util.Set<InterfaceC60214NkA<T>> LIZ;
    public final T LIZIZ;
    public final ViewGroup.LayoutParams LIZJ;

    public C60213Nk9() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C60213Nk9(View view) {
        InterfaceC60212Nk8.LJJLIIIJL.getClass();
        ViewGroup.LayoutParams layoutParams = C60215NkB.LIZ;
        o.LJIIJ(view, "view");
        this.LIZIZ = view;
        this.LIZJ = layoutParams;
        this.LIZ = new LinkedHashSet();
    }

    public final void LIZIZ(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
        Iterator it = ORZ.LLJI(this.LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC60214NkA) it.next()).LIZIZ(this, uri);
            } catch (FCQ unused) {
            }
        }
    }

    public final void LIZJ(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
        Iterator it = ORZ.LLJI(this.LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC60214NkA) it.next()).LIZ(this, uri);
            } catch (FCQ unused) {
            }
        }
    }

    public final void LIZ(android.net.Uri uri, Throwable th) {
        o.LJIIJ(uri, "uri");
        Iterator it = ORZ.LLJI(this.LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC60214NkA) it.next()).LIZJ(this, uri, th);
            } catch (FCQ unused) {
            }
        }
    }
}
