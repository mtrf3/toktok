package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OdE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62332OdE extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm, X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return true;
    }

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "lemon8";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Lemon8";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.fk, LJJL);
            if (LJIIIZ != null) {
                i = LJIIIZ.intValue();
            } else {
                i = 0;
            }
            c2068389v.LIZ = i;
            return c2068389v.LIZ(LJJL);
        }
        return null;
    }
}
