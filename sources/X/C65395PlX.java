package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercebase.utils.BooleanTypeAdapter;
import com.ss.android.ugc.aweme.ecommercebase.utils.MapTypeAdapter;
import java.util.HashMap;

/* renamed from: X.PlX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65395PlX extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C65395PlX LJLIL = new C65395PlX();

    public C65395PlX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        BooleanTypeAdapter booleanTypeAdapter = new BooleanTypeAdapter();
        MapTypeAdapter mapTypeAdapter = new MapTypeAdapter();
        e eVar = new e();
        eVar.LIZIZ(booleanTypeAdapter, Boolean.TYPE);
        eVar.LIZIZ(booleanTypeAdapter, Boolean.class);
        eVar.LIZIZ(mapTypeAdapter, new TypeToken<java.util.Map<String, Object>>() { // from class: X.2Z1
        }.getType());
        eVar.LIZIZ(mapTypeAdapter, new TypeToken<HashMap<String, Object>>() { // from class: X.2Z2
        }.getType());
        return eVar.LIZ();
    }
}
