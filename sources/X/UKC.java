package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKC {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final List<Integer> LJ;

    static {
        int generateViewId = View.generateViewId();
        LIZ = generateViewId;
        LIZIZ = View.generateViewId();
        int generateViewId2 = View.generateViewId();
        LIZJ = generateViewId2;
        LIZLLL = View.generateViewId();
        LJ = C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZ), Integer.valueOf(generateViewId), Integer.valueOf(generateViewId2));
    }

    public static final void LIZ(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        multiElementSpecImpl.registerElement(new UK5(i));
    }
}
