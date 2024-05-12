package X;

import Y.ACListenerS40S0200000_5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9X extends AbstractC31414CUo<B9Z, B9Y> {
    public final DataChannel LIZIZ;

    public B9X(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(B9Y b9y, B9Z b9z) {
        B9Y holder = b9y;
        B9Z reserveTitleItem = b9z;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(reserveTitleItem, "reserveTitleItem");
        Object value = holder.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-title>(...)");
        ((TextView) value).setText(reserveTitleItem.LJLIL);
        Object value2 = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-reserveGuideLayout>(...)");
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(reserveTitleItem, this, 88), (View) value2);
    }

    @Override // X.AbstractC31414CUo
    public final B9Y LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d89, parent, false);
        o.LJIIIIZZ(it, "it");
        return new B9Y(it);
    }
}
