package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tsy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76048Tsy extends AbstractC31414CUo<C76047Tsx, C76049Tsz> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C76049Tsz c76049Tsz, C76047Tsx c76047Tsx) {
        C76049Tsz holder = c76049Tsz;
        C76047Tsx item = c76047Tsx;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        Object value = holder.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-contentText>(...)");
        ((TextView) value).setText(item.LJLIL);
    }

    @Override // X.AbstractC31414CUo
    public final C76049Tsz LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d7v, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C76049Tsz(it);
    }
}
