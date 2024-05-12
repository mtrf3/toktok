package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;

/* loaded from: classes7.dex */
public final class EJN extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final EJN LJLIL = new EJN();

    public EJN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZIZ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        return eVar.LIZ();
    }
}
