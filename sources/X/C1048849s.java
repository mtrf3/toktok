package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.49s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1048849s {
    public static final /* synthetic */ int LIZ = 0;

    public static C1049249w LIZIZ(Context context) {
        Drawable drawable;
        C1045248i c1045248i = C49R.LIZ;
        Integer LJI = C79045V0n.LJI(c1045248i.LIZLLL, context);
        if (LJI != null) {
            LJI.intValue();
        }
        Integer num = c1045248i.LJIILIIL.LIZJ;
        if (num != null) {
            int intValue = num.intValue();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(intValue);
            drawable = c110614Vt.LIZ(context);
        } else {
            drawable = null;
        }
        Integer num2 = c1045248i.LJIILIIL.LIZLLL;
        if (num2 != null) {
            C04270Et.LIZIZ(context, num2.intValue());
        }
        return new C1049249w(drawable);
    }

    public static C1048949t LIZJ(Context context) {
        int i;
        C1045248i c1045248i = C49R.LIZ;
        Integer LJI = C79045V0n.LJI(c1045248i.LIZLLL, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        int i2 = c1045248i.LJIILIIL.LIZ;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(c1045248i.LJIILIIL.LIZIZ);
        return new C1048949t(i, i2, c110614Vt.LIZ(context));
    }

    public static void LIZ(C62846OlW imgView, UrlModel urlModel, String scene, Drawable drawable) {
        o.LJIIIZ(imgView, "imgView");
        o.LJIIIZ(scene, "scene");
        if (drawable == null) {
            C45S.LIZJ(imgView, urlModel, scene);
        } else {
            C45S.LIZLLL(imgView, urlModel, scene, drawable, drawable, null, null);
        }
    }
}
