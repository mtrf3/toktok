package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.o;

/* renamed from: X.MgX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57441MgX implements InterfaceC57445Mgb {
    @Override // X.InterfaceC57445Mgb
    public final C57448Mge LIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return new C57448Mge(ctx);
    }

    @Override // X.InterfaceC57445Mgb
    public final AbstractC57431MgN LIZIZ(InterfaceC57449Mgf view) {
        o.LJIIIZ(view, "view");
        if (view instanceof RelationButton) {
            return new C57432MgO((RelationButton) view);
        }
        if (view instanceof C57446Mgc) {
            return new C57433MgP((C57446Mgc) view);
        }
        "IRelationView is not cast as any".toString();
        throw new IllegalStateException("IRelationView is not cast as any");
    }
}
