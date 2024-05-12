package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TsY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76022TsY extends AbstractC31414CUo<C76084TtY, C76023TsZ> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C76023TsZ viewHolder, C76084TtY item) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(item, "item");
        C75642TmQ.LJJLIIIIJ("first_connection_list_show");
    }

    @Override // X.AbstractC31414CUo
    public final C76023TsZ LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(layoutInflater, R.layout.d82, parent, false);
        o.LJIIIIZZ(view, "view");
        return new C76023TsZ(view);
    }
}
