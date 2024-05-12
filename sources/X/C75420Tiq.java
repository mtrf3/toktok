package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tiq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75420Tiq extends AbstractC31414CUo<C74900TaS, C75421Tir> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C75421Tir c75421Tir, C74900TaS c74900TaS) {
        C75421Tir holder = c75421Tir;
        C74900TaS item = c74900TaS;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        Object value = holder.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-title>(...)");
        ((TextView) value).setText(item.LJLIL);
    }

    @Override // X.AbstractC31414CUo
    public final C75421Tir LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d7r, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C75421Tir(it);
    }
}
