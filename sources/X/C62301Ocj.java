package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62301Ocj extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.snapchat.android";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "snapchat";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Snapchat";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.g2, LJJL);
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

    @Override // X.AbstractC62304Ocm, X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return C224878s7.LIZ(context, "com.snapchat.android");
    }
}
