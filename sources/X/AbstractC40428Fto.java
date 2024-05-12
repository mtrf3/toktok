package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Fto, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40428Fto {
    public final Activity LIZ;
    public final EnumC40416Ftc LIZIZ;
    public final C40413FtZ LIZJ;
    public C40429Ftp LIZLLL;

    public abstract void LIZ();

    public abstract C40429Ftp LIZIZ();

    public final void LIZJ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("rating_window_type", this.LIZIZ.getValue());
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public AbstractC40428Fto(Activity activity, EnumC40416Ftc dialogType) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialogType, "dialogType");
        this.LIZ = activity;
        this.LIZIZ = dialogType;
        this.LIZJ = new C40413FtZ(dialogType);
    }
}
