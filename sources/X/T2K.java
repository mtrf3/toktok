package X;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes13.dex */
public class T2K extends FrameLayout implements InterfaceC30717C3t {
    public boolean LJLIL;

    @Override // X.InterfaceC30717C3t
    public boolean LIZIZ() {
        return this.LJLIL;
    }

    public final boolean getMIsNeedIntercept() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2K(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        setLayoutDirection(0);
    }

    public final void setMIsNeedIntercept(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("test release oldValue = ");
        LIZ.append(this.LJLIL);
        LIZ.append(" value = ");
        LIZ.append(z);
        C0NB.LJIIIZ("ViewInterceptFrameLayout", X1D.LIZIZ(LIZ));
        this.LJLIL = z;
    }
}
