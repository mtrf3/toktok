package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKW implements InterfaceC71908SKa {
    public final /* synthetic */ int LIZ;

    public SKW(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC71908SKa
    public final SKV LIZ(Context context, ViewGroup parent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), this.LIZ, parent, false);
        o.LJIIIIZZ(view, "view");
        return new SKV(view);
    }
}
