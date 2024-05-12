package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UKp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77019UKp {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final List<Integer> LJFF;

    static {
        int generateViewId = View.generateViewId();
        LIZ = generateViewId;
        int generateViewId2 = View.generateViewId();
        LIZIZ = generateViewId2;
        LIZJ = View.generateViewId();
        LIZLLL = View.generateViewId();
        LJ = View.generateViewId();
        LJFF = C47261Igj.LJJIJIIJI(Integer.valueOf(generateViewId), Integer.valueOf(generateViewId2));
    }

    public static final void LIZ(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        multiElementSpecImpl.registerElement(new C77023UKt(i));
    }
}
