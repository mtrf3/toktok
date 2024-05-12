package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ocx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62315Ocx extends C62307Ocp {
    public final String LJLILLLLZI;

    @Override // X.C62307Ocp, X.InterfaceC62225ObV
    public final String key() {
        return "whatsapp_status";
    }

    @Override // X.C62307Ocp, X.InterfaceC62225ObV
    public final String label() {
        String str = this.LJLILLLLZI;
        if (str == null) {
            return "Status";
        }
        return str;
    }

    public C62315Ocx(String str) {
        super(null);
        this.LJLILLLLZI = str;
    }

    @Override // X.C62307Ocp, X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.gc, LJJL);
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
