package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUT extends AbstractC65781Prl implements InterfaceC88472Yns<C53489Kyz, C76800UCe> {
    public static final AUT LJLIL = new AUT();

    public AUT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C53489Kyz c53489Kyz) {
        C29701Eo c29701Eo;
        C53489Kyz it = c53489Kyz;
        o.LJIIIZ(it, "it");
        View view = it.LJLILLLLZI;
        if ((view instanceof C77869UhF) && (c29701Eo = (C29701Eo) view) != null) {
            c29701Eo.setProgress(0.0f);
        }
        return C76800UCe.LIZ;
    }
}
