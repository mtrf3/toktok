package X;

import android.content.Context;
import com.ss.android.common.applog.GlobalContext;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JRI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final JRI LJLIL = new JRI();

    public JRI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Context context = GlobalContext.getContext();
        o.LJI(context);
        new C61996OUu(context).LIZ(1);
        return C76800UCe.LIZ;
    }
}
