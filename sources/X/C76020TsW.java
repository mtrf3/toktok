package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TsW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76020TsW extends AbstractC31414CUo<C76050Tt0, C76038Tso> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C76038Tso c76038Tso, C76050Tt0 c76050Tt0) {
        C76038Tso holder = c76038Tso;
        C76050Tt0 item = c76050Tt0;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        Object value = holder.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-title>(...)");
        ((TextView) value).setText(item.LJLIL);
    }

    @Override // X.AbstractC31414CUo
    public final C76038Tso LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d7s, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C76038Tso(it);
    }
}
