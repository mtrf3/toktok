package X;

import X.AbstractC49253JUr;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.JUr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49253JUr<E extends AbstractC49253JUr<E>> extends JHL<E> {
    public String LJJL;
    public String LJJLI;
    public int LJJLIIIIJ;

    @Override // X.JHL, X.JHM
    public final void LJI() {
        super.LJI();
        if (!TextUtils.isEmpty(this.LJJL)) {
            LJ("search_keyword", this.LJJL, InterfaceC1798974f.LIZ);
        }
        String str = this.LJJLI;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("enter_method", str, c1799074g);
        int i = this.LJJLIIIIJ;
        if (i != -1) {
            LJ("is_fullscreen", String.valueOf(i), c1799074g);
        }
    }

    public AbstractC49253JUr(String str) {
        super(str);
        this.LJJLIIIIJ = -1;
    }

    public final void LJJIIZ(Context context) {
        if (context == null) {
            return;
        }
        this.LJJL = C2S6.LIZ(context).getSearchKeyword();
    }
}
