package X;

import com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;

/* renamed from: X.PlK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65382PlK extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C65382PlK LJLIL = new C65382PlK();

    public C65382PlK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LIZ = eVar.LIZ.LJ(new C65383PlL(), true, false);
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        eVar.LIZIZ(new BooleanTypeAdapter(), Boolean.TYPE);
        return eVar.LIZ();
    }
}
