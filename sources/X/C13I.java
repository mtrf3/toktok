package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.13I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13I {
    public Object LIZ;

    public /* synthetic */ C13I(EnumC124054tt tab) {
        o.LJIIIZ(tab, "tab");
        this.LIZ = tab;
    }

    public final AwemeDraft LIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeDraftCaches : query -> creationId = ");
        LIZ.append(creationId);
        H78.LIZ(X1D.LIZIZ(LIZ));
        AwemeDraft LIZJ = GPD.LIZJ(new GPE(new CreativeInfo(creationId, 0, null, 6, null), false));
        if (LIZJ != null) {
            ((java.util.Map) this.LIZ).put(creationId, LIZJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AwemeDraftCaches : query -> draft from db,creationId = ");
            LIZ2.append(LIZJ.LIZJ());
            H78.LIZ(X1D.LIZIZ(LIZ2));
        }
        return LIZJ;
    }

    public /* synthetic */ C13I(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LIZ = effectConfig;
    }

    public /* synthetic */ C13I(Object obj) {
        this.LIZ = obj;
    }
}
