package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ock, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62302Ock extends AbstractC62304Ocm {
    public String LJLIL;
    public android.net.Uri LJLILLLLZI;

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.twitter.android";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "twitter";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Twitter";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.g_, LJJL);
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

    /* JADX WARN: Can't wrap try/catch for region: R(8:34|(7:44|45|37|38|39|40|41)|36|37|38|39|40|41) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LJJIFFI(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62302Ock.LJJIFFI(android.content.Context):android.content.Intent");
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        this.LJLIL = AbstractC62223ObT.LJIJI(content);
        return LJIJJ(context, LJJIFFI(context));
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        this.LJLIL = C62311Oct.LIZ(content);
        this.LJLILLLLZI = content.LIZIZ;
        return LJIJJ(context, LJJIFFI(context));
    }
}
