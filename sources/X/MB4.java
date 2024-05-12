package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MB4 implements MBD {
    public static final C56373MAn LJLJI = new C56373MAn();
    public C56364MAe LJLIL;
    public Bitmap LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RefreshWidgetContext(storyWidgetBean=");
        LIZ.append(this.LJLIL);
        LIZ.append(", storyWidgetBitmap=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.MBD
    public final InterfaceC48698J9i<?> getKey() {
        return LJLJI;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> interfaceC48698J9i) {
        return (E) MBC.LIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> interfaceC48698J9i) {
        return MBC.LIZIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
