package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wnd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83361Wnd extends AbstractC83369Wnl {
    public final EnumC83360Wnc LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Callback type: ");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC83369Wnl
    public final EnumC83358Wna LIZ() {
        return EnumC83358Wna.ACTION_CALLBACK;
    }

    public C83361Wnd(EnumC83360Wnc callbackType, int i) {
        o.LJIIIZ(callbackType, "callbackType");
        this.LIZJ = callbackType;
        this.LIZLLL = i;
    }
}
