package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FeB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39459FeB extends AbstractC39461FeD {
    public final /* synthetic */ C39456Fe8 LIZJ;

    @Override // X.AbstractC39461FeD
    public final List<EnumC37847EtH> LIZ() {
        return C47261Igj.LJJIJIIJI(EnumC37847EtH.LYNX, EnumC37847EtH.WEB);
    }

    public C39459FeB(C39456Fe8 c39456Fe8) {
        this.LIZJ = c39456Fe8;
    }

    @Override // X.AbstractC39461FeD
    public final boolean LIZIZ(Context context, String schema, java.util.Map extraInfo) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(extraInfo, "extraInfo");
        return this.LIZJ.LIZ().handleLiveSchema(schema, context);
    }
}
