package X;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fe9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39457Fe9 extends AbstractC39461FeD {
    public final C31926Cfy LIZJ;
    public final /* synthetic */ C39456Fe8 LIZLLL;

    @Override // X.AbstractC39461FeD
    public final List<EnumC37847EtH> LIZ() {
        return C47261Igj.LJJIJIIJI(EnumC37847EtH.LYNX, EnumC37847EtH.WEB);
    }

    public C39457Fe9(C39456Fe8 c39456Fe8, C31926Cfy c31926Cfy) {
        this.LIZLLL = c39456Fe8;
        this.LIZJ = c31926Cfy;
    }

    @Override // X.AbstractC39461FeD
    public final boolean LIZIZ(Context context, String schema, java.util.Map extraInfo) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(extraInfo, "extraInfo");
        Context context2 = (Context) FCS.LIZIZ(this.LIZJ, Context.class);
        if (!(context2 instanceof Activity)) {
            return false;
        }
        return this.LIZLLL.LIZ().startAdsAppActivity(context2, ujb.o.LJJJJZ(schema, "aweme", "sslocal", false), null);
    }
}
