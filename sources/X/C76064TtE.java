package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TtE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76064TtE extends AbstractC76213Tvd<C76061TtB> {
    public final C5H3 LJLIL;

    public C76064TtE(View view) {
        super(view);
        this.LJLIL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS163S0100000_13(view, 32));
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        C76059Tt9 data = (C76059Tt9) obj;
        o.LJIIIZ(data, "data");
        View view = (View) this.LJLIL.getValue();
        C018905p c018905p = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C018905p) {
            c018905p = (C018905p) layoutParams;
        }
        if (data.LJLILLLLZI) {
            if (c018905p == null) {
                return;
            }
            c018905p.horizontalBias = 0.8f;
        } else {
            if (c018905p == null) {
                return;
            }
            c018905p.horizontalBias = 0.5f;
        }
    }
}
