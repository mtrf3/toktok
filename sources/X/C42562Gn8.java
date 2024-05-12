package X;

import Y.AfS54S0100000_2;
import Y.AfS59S0100000_7;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gn8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42562Gn8 {
    public static final C42562Gn8 LIZIZ;
    public final /* synthetic */ C42563Gn9 LIZ = new C42563Gn9();

    static {
        C42562Gn8 c42562Gn8 = new C42562Gn8();
        LIZIZ = c42562Gn8;
        List processors = C47261Igj.LJJIJIIJI(new C42092GfY(), new C42101Gfh(), new C42103Gfj());
        o.LJIIIZ(processors, "processors");
        C42563Gn9 c42563Gn9 = c42562Gn8.LIZ;
        c42563Gn9.getClass();
        ((ArrayList) c42563Gn9.LIZ).addAll(processors);
        List callbacks = C47261Igj.LJJIJIIJI(new C42568GnE(), new C42569GnF(), new C42570GnG());
        o.LJIIIZ(callbacks, "callbacks");
        C42563Gn9 c42563Gn92 = c42562Gn8.LIZ;
        c42563Gn92.getClass();
        ((ArrayList) c42563Gn92.LIZIZ).addAll(callbacks);
    }

    public final void LIZ(String str) {
        C42563Gn9 c42563Gn9 = this.LIZ;
        if (str == null) {
            c42563Gn9.getClass();
        } else {
            AbstractC73672Svk.LJJIIZ(c42563Gn9.LIZ).LJJL(new C73950T0o(c42563Gn9.LIZJ)).LJJJLIIL(new C42566GnC(str), C73674Svm.LIZLLL);
        }
    }

    public final <T> void LIZIZ(String str, C42097Gfd<T> c42097Gfd, Context context) {
        C42563Gn9 c42563Gn9 = this.LIZ;
        c42563Gn9.getClass();
        AbstractC73672Svk.LJJIJIL(new C42564GnA(str, c42097Gfd, context)).LJJJ(new C73950T0o(c42563Gn9.LIZJ)).LJJJLIIL(new AfS59S0100000_7(c42563Gn9, 63), new AfS54S0100000_2(context, 36));
    }
}
