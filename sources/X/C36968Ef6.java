package X;

import com.bytedance.morpheus.PluginEntity;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ef6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36968Ef6 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends PluginEntity>> {
    public static final C36968Ef6 LJLIL = new C36968Ef6();

    public C36968Ef6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends PluginEntity> invoke() {
        try {
            Object LJ = new Gson().LJ(new InputStreamReader(EF7.LIZIZ().getResources().getAssets().open("plugins.json")), PluginEntity[].class);
            o.LJIIIIZZ(LJ, "Gson().fromJson(pluginsJ…luginEntity>::class.java)");
            return ORY.LJJZZIII((Object[]) LJ);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            return C47261Igj.LJJIJ(new PluginEntity(message, "!!ERROR!!"));
        }
    }
}
