package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.TJr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74447TJr extends C74448TJs {
    public final int LJII;
    public final int LJIIIIZZ;
    public final double LJIIIZ;
    public final double LJIIJ;
    public final /* synthetic */ C80695Vlj LJIIJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74447TJr(C80695Vlj c80695Vlj) {
        super(c80695Vlj);
        this.LJIIJJI = c80695Vlj;
        this.LJII = C74275TDb.LJ(c80695Vlj.getContext());
        Context context = c80695Vlj.getContext();
        o.LJIIIIZZ(context, "tabLayout.context");
        this.LJIIIIZZ = (int) C74275TDb.LIZIZ(context, 320.0f);
        o.LJIIIIZZ(c80695Vlj.getContext(), "tabLayout.context");
        this.LJIIIZ = C74275TDb.LIZIZ(r1, 32.0f);
        o.LJIIIIZZ(c80695Vlj.getContext(), "tabLayout.context");
        this.LJIIJ = C74275TDb.LIZIZ(r1, 12.0f);
    }
}
