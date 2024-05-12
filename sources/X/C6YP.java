package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;

/* renamed from: X.6YP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YP extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C6YP LJLIL = new C6YP();

    public C6YP() {
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
