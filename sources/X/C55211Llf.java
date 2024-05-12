package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Llf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55211Llf extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final C55211Llf INSTANCE = new C55211Llf();

    public C55211Llf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC params) {
        o.LJIIIZ(params, "params");
        View LLLLIILL = C16880lQ.LLLLIILL(params.LIZJ, R.layout.bxi, params.LIZ, false);
        o.LJIIIIZZ(LLLLIILL, "with(params) {\n        i…out, parent, false)\n    }");
        return LLLLIILL;
    }
}
