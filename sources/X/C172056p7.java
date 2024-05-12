package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.6p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172056p7 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, EnumC45262Hpa directory) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(directory, "directory");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(o.LJIILLIIL("/cutsame", C16880lQ.LLIIJLIL(context).getAbsolutePath()));
        LIZ2.append('/');
        LIZ2.append(directory.getDirName());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C1I0.LIZJ(LIZIZ);
        return LIZIZ;
    }
}
