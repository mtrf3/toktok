package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.47D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47D implements AnonymousClass479 {
    public final View LIZIZ;

    @Override // X.AnonymousClass479
    public final boolean LIZIZ() {
        return true;
    }

    public C47D(View root) {
        o.LJIIIZ(root, "root");
        this.LIZIZ = root;
    }

    @Override // X.AnonymousClass479
    public final void LIZ(int i) {
        View findViewById = this.LIZIZ.findViewById(i);
        if (findViewById != null) {
            C146035oF.LIZIZ(findViewById);
        }
    }

    @Override // X.AnonymousClass479
    public final <T extends View> T LIZJ(int i) {
        return (T) this.LIZIZ.findViewById(i);
    }
}
