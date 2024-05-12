package androidx.work;

import X.AbstractC08530Vd;
import X.C0CU;
import X.C0CW;
import X.C0VW;
import X.C1OU;
import X.InterfaceC270914n;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC270914n<AbstractC08530Vd> {
    static {
        C0VW.LIZIZ("WrkMgrInitializer");
    }

    @Override // X.InterfaceC270914n
    public final List<Class<? extends InterfaceC270914n<?>>> LIZ() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC270914n
    public final AbstractC08530Vd create(Context context) {
        C0VW.LIZ().getClass();
        C1OU.LJFF(context, new C0CW(new C0CU()));
        return C1OU.LJ(context);
    }
}
