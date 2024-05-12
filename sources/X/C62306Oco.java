package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Oco, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62306Oco extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.reddit.frontpage";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "reddit";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Reddit";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.fw, LJJL);
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
        String str;
        OYP oyp;
        String str2;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://www.reddit.com/submit?url=");
        if ((content instanceof OYP) && (str2 = (oyp = (OYP) content).LJ) != null && str2.length() > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            str = q.LIZIZ(LIZ2, oyp.LJ, ' ', LIZ2);
        } else {
            str = "";
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append(content.LIZIZ);
        LIZ.append(X1D.LIZIZ(LIZ3));
        LIZ.append("&title=");
        LIZ.append(content.LIZJ);
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ)));
        if (Build.VERSION.SDK_INT >= 33) {
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
        }
        return LJIJJ(context, intent);
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        String LIZ = C62311Oct.LIZ(content);
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("image/*");
        intent.setPackage("com.reddit.frontpage");
        intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
        intent.putExtra("android.intent.extra.TEXT", LIZ);
        intent.putExtra("android.intent.extra.SUBJECT", content.LJ);
        return LJIJJ(context, intent);
    }
}
