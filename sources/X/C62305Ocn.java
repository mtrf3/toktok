package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62305Ocn extends AbstractC62223ObT {
    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "email";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Email";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.f6, LJJL);
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

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        List<ResolveInfo> queryIntentActivities;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "1247596345260366870"));
        if (LIZJ.LIZ) {
            queryIntentActivities = (List) LIZJ.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        }
        o.LJIIIIZZ(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", content.LIZIZ);
        intent.putExtra("android.intent.extra.SUBJECT", content.LIZJ);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return LJIJJ(context, intent);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        String LIZ = C62311Oct.LIZ(content);
        if (LIZ != null && LIZ.length() != 0) {
            intent.putExtra("android.intent.extra.TEXT", LIZ);
        }
        intent.putExtra("android.intent.extra.SUBJECT", content.LJ);
        intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return LJIJJ(context, intent);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        String LIZ = C62311Oct.LIZ(content);
        if (LIZ != null && LIZ.length() != 0) {
            intent.putExtra("android.intent.extra.TEXT", LIZ);
        }
        intent.putExtra("android.intent.extra.SUBJECT", content.LIZLLL);
        intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return LJIJJ(context, intent);
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        String str;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        String str2 = content.LJ;
        if (str2 == null || str2.length() == 0) {
            str = content.LIZLLL;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(content.LJ);
            LIZ.append(' ');
            LIZ.append(content.LIZLLL);
            str = X1D.LIZIZ(LIZ);
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", content.LIZJ);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return LJIJJ(context, intent);
    }
}
