package X;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Mna, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57878Mna extends AbstractC65781Prl implements InterfaceC88472Yns<C57866MnO, C76800UCe> {
    public final /* synthetic */ Bundle LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57878Mna(Bundle bundle) {
        super(1);
        this.LJLIL = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List<? extends X.MqI>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57866MnO c57866MnO) {
        EnumC57876MnY enumC57876MnY;
        ?? r3;
        ArrayList arrayList;
        C57866MnO configApi = c57866MnO;
        o.LJIIIZ(configApi, "$this$configApi");
        Serializable serializable = this.LJLIL.getSerializable("maf_scene_key");
        if (!(serializable instanceof EnumC57876MnY) || (enumC57876MnY = (EnumC57876MnY) serializable) == null) {
            enumC57876MnY = EnumC57876MnY.AFTER_PERMISSION_POP_UP;
        }
        configApi.LIZ(enumC57876MnY);
        configApi.LIZIZ = this.LJLIL.getInt("api_max_req_count_key", 1);
        configApi.LIZLLL = 30;
        configApi.LIZJ = 30;
        Serializable serializable2 = this.LJLIL.getSerializable("auth_platform_key");
        if ((serializable2 instanceof ArrayList) && (arrayList = (ArrayList) serializable2) != null) {
            r3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof EnumC58046MqI) {
                    r3.add(next);
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        o.LJIIIZ(r3, "<set-?>");
        configApi.LJ = r3;
        configApi.LJII = this.LJLIL.getBoolean("use_storage_key", false);
        configApi.LJIILLIIL = this.LJLIL.getBoolean("is_after_auth", false);
        return C76800UCe.LIZ;
    }
}
