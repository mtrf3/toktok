package X;

import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2Y extends S39<TuxTextView, C53608L2e, InterfaceC71465S2z, InterfaceC71454S2o> {
    public final TuxTextView LJFF;
    public Boolean LJI;

    @Override // X.S39
    public final InterfaceC71454S2o LIZLLL() {
        return new C71441S2b();
    }

    public S2Y(TuxTextView tuxTextView) {
        super(tuxTextView);
        this.LJFF = tuxTextView;
    }

    @Override // X.S39
    public final InterfaceC71454S2o LJ(InterfaceC71465S2z interfaceC71465S2z) {
        InterfaceC71465S2z style = interfaceC71465S2z;
        o.LJIIIZ(style, "style");
        return new S2Z(style);
    }

    public final void LJII(C53608L2e c53608L2e) {
        if (o.LJ(this.LJI, Boolean.valueOf(c53608L2e.LIZ))) {
            C36746EbW.LIZ(5, "same state and not init");
            return;
        }
        this.LJI = Boolean.valueOf(c53608L2e.LIZ);
        LJFF().LJIILIIL(this.LJFF, c53608L2e.LIZ);
        if (c53608L2e.LIZ) {
            String str = c53608L2e.LIZJ;
            if (str != null) {
                this.LJFF.setTextColorRes(R.attr.gp);
                this.LJFF.setText(str);
                return;
            }
            return;
        }
        String str2 = c53608L2e.LIZIZ;
        if (str2 == null) {
            return;
        }
        this.LJFF.setTextColorRes(R.attr.cl);
        this.LJFF.setText(str2);
    }
}
