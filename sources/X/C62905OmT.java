package X;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.OmT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62905OmT extends AbstractC26238ARm<C62905OmT, C62906OmU> {
    public C62907OmV LJIIIIZZ;
    public C62907OmV LJIIIZ;
    public C62907OmV LJIIJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62905OmT(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    public final void LJI(int i) {
        LJIIIIZZ(i, null, false);
    }

    public final void LJII(int i, DialogInterface.OnClickListener onClickListener) {
        LJIIIZ(onClickListener, this.LIZ.getText(i), false);
    }

    public final void LJIIJ(int i, DialogInterface.OnClickListener onClickListener) {
        LJIIL(onClickListener, this.LIZ.getText(i), false);
    }

    public final void LJIIIIZZ(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LJIIIZ(onClickListener, this.LIZ.getText(i), z);
    }

    public final void LJIIIZ(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJIIIZ = new C62907OmV(onClickListener, charSequence, z);
    }

    public final void LJIIJJI(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LJIIL(onClickListener, this.LIZ.getText(i), z);
    }

    public final void LJIIL(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJIIIIZZ = new C62907OmV(onClickListener, charSequence, z);
    }
}
