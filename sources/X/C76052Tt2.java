package X;

import Y.ACListenerS38S0300000_13;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tt2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76052Tt2 extends AbstractC31414CUo<C76051Tt1, C76053Tt3> {
    public final InterfaceC76055Tt5 LIZIZ;

    public C76052Tt2(InterfaceC76055Tt5 mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LIZIZ = mListener;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76053Tt3 c76053Tt3, C76051Tt1 c76051Tt1) {
        C76053Tt3 holder = c76053Tt3;
        C76051Tt1 item = c76051Tt1;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        int i = C76040Tsq.LIZ[item.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJII(holder, item);
            return;
        }
        LJIIIIZZ(holder, item);
    }

    @Override // X.AbstractC31414CUo
    public final C76053Tt3 LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d9v, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C76053Tt3(it);
    }

    public final void LJI(C76053Tt3 c76053Tt3, C76051Tt1 c76051Tt1) {
        EnumC76041Tsr enumC76041Tsr;
        int i = C76040Tsq.LIZ[c76051Tt1.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJIIIIZZ(c76053Tt3, c76051Tt1);
                enumC76041Tsr = EnumC76041Tsr.SHRINK;
            } else {
                throw new C162476Zf();
            }
        } else {
            LJII(c76053Tt3, c76051Tt1);
            enumC76041Tsr = EnumC76041Tsr.EXTENSION;
        }
        o.LJIIIZ(enumC76041Tsr, "<set-?>");
        c76051Tt1.LJLILLLLZI = enumC76041Tsr;
    }

    public final void LJII(C76053Tt3 c76053Tt3, C76051Tt1 c76051Tt1) {
        Object value = c76053Tt3.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-contentText>(...)");
        ((TextView) value).setText(C15380j0.LJIILJJIL(R.string.lzn));
        c76053Tt3.L().setIconAttr(R.attr.asu);
        c76053Tt3.L().setIconTint(C15380j0.LIZIZ(R.color.cu));
        C16880lQ.LJIIJ(new ACListenerS38S0300000_13(this, c76051Tt1, c76053Tt3, 6), c76053Tt3.itemView);
    }

    public final void LJIIIIZZ(C76053Tt3 c76053Tt3, C76051Tt1 c76051Tt1) {
        Object value = c76053Tt3.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-contentText>(...)");
        ((TextView) value).setText(C15380j0.LJIILJJIL(R.string.lzo));
        c76053Tt3.L().setIconAttr(R.attr.asi);
        c76053Tt3.L().setIconTint(C15380j0.LIZIZ(R.color.cu));
        C16880lQ.LJIIJ(new ACListenerS38S0300000_13(this, c76051Tt1, c76053Tt3, 7), c76053Tt3.itemView);
    }
}
