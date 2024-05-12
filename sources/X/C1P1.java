package X;

import android.content.Context;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.1P1, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1P1 implements InterfaceC38069Ewr, InterfaceC67207QZf {
    @Override // X.InterfaceC38069Ewr
    public void LIZ() {
    }

    public static /* synthetic */ InterfaceC07790Sh LIZLLL(InterfaceC07790Sh interfaceC07790Sh) {
        return C1P2.LIZ.LIZIZ(interfaceC07790Sh, true);
    }

    @Override // X.InterfaceC67207QZf
    public String LIZIZ(Object obj) {
        Context context = (Context) obj;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                return "auto";
            }
            if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                return "embedded";
            }
        }
        return "";
    }

    public static ConstraintLayout LIZJ(Context context, int i) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(i);
        return constraintLayout;
    }
}
