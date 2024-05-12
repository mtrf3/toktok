package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54727Ldr extends AbstractC31414CUo<LYR, C54728Lds> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C54728Lds holder, LYR item) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
    }

    @Override // X.AbstractC31414CUo
    public final C54728Lds LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d9j, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C54728Lds(it);
    }
}
