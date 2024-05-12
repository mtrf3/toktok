package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62293Ocb extends AbstractC62304Ocm {
    public final String LJLIL;

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "more";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return this.LJLIL;
    }

    public C62293Ocb(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.g3, LJJL);
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

    @Override // X.AbstractC62223ObT
    public final boolean LJIJJ(Context context, Intent intent) {
        boolean z;
        Intent createChooser;
        int i;
        o.LJIIIZ(context, "context");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Intent intent2 = new Intent();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context.getPackageName());
            LIZ.append(".systemshare.targetchosen.action");
            intent2.setAction(X1D.LIZIZ(LIZ));
            intent2.setPackage(context.getPackageName());
            if (i2 >= 31) {
                i = 1375731712;
            } else {
                i = 1342177280;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(C16880lQ.LLLLL(context), 0, intent2, i);
            o.LJIIIIZZ(broadcast, "PendingIntent.getBroadca…ntent,\n            flags)");
            createChooser = Intent.createChooser(intent, "", broadcast.getIntentSender());
            o.LJIIIIZZ(createChooser, "Intent.createChooser(int…nt(context).intentSender)");
        } else {
            createChooser = Intent.createChooser(intent, "");
            o.LJIIIIZZ(createChooser, "Intent.createChooser(intent, \"\")");
        }
        return super.LJIJJ(context, createChooser);
    }
}
