package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.creative.model.json.adapter.BooleanAsIntTypeAdapter;

/* renamed from: X.Plj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65407Plj extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C65407Plj LJLIL = new C65407Plj();

    public C65407Plj() {
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
