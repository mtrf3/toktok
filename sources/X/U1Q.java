package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1Q<V extends View, T> implements InterfaceC76501U0r {
    public static final U1Q<V, T> LIZ = new U1Q<>();

    @Override // X.InterfaceC76501U0r
    public final void LIZ(View view, Object obj) {
        U1X view2 = (U1X) view;
        List armies = (List) obj;
        o.LJIIIZ(view2, "view");
        o.LJIIIZ(armies, "armies");
        view2.LJ(armies, true);
    }
}
