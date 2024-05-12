package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* renamed from: X.Occ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62294Occ extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.nhn.android.band";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "band";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Band";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.et, LJJL);
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
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        String encode = URLEncoder.encode(String.valueOf(AbstractC62223ObT.LJIJI(content)), "UTF-8");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bandapp://create/post?text=");
        LIZ.append(encode);
        return LJIJJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ))));
    }
}
