package X;

import android.text.TextUtils;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Miq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57584Miq implements TextUtils.EllipsizeCallback {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C57584Miq(String str, String str2, String str3, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    @Override // android.text.TextUtils.EllipsizeCallback
    public final void ellipsized(int i, int i2) {
        if (i == i2 || i < 0 || i2 < 0) {
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ;
            String LLLZ = C16880lQ.LLLZ(this.LIZIZ, Arrays.copyOf(new Object[]{this.LIZJ}, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            interfaceC88472Yns.invoke(LLLZ);
            return;
        }
        if (i2 > this.LIZLLL.length()) {
            this.LIZ.invoke(null);
            C221018lt.LJFF("ExtReason", "ellipsize full name!");
        } else {
            int length = this.LIZJ.length();
            this.LIZ.invoke(Q8U.LIZIZ(new Object[]{s.LJLIL(this.LIZJ, length - i2, length - i, "…").toString()}, 1, this.LIZIZ, "format(this, *args)"));
        }
    }
}
