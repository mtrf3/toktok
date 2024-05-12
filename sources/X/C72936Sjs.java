package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sjs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72936Sjs extends AbstractC31414CUo<C72935Sjr, C72937Sjt> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C72937Sjt c72937Sjt, C72935Sjr c72935Sjr) {
        C72937Sjt holder = c72937Sjt;
        C72935Sjr item = c72935Sjr;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.LJLIL.setText(item.LJLIL);
        holder.LJLILLLLZI.setText(item.LJLILLLLZI);
    }

    @Override // X.AbstractC31414CUo
    public final C72937Sjt LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8z, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…nd_answer, parent, false)");
        return new C72937Sjt(LLLLIILL);
    }
}
