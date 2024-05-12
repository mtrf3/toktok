package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Od1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62319Od1 extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.instagram.android";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "instagram";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Instagram";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.fh, LJJL);
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

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return super.LIZ(context, content);
    }
}
