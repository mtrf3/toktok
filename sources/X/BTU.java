package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BTU extends BTZ<C28826BTa> {
    public final BTW LIZIZ;

    public abstract List<String> LIZLLL();

    @Override // X.BTZ
    public final List<String> LIZIZ() {
        return LIZLLL();
    }

    public BTU(BTW btw) {
        this.LIZIZ = btw;
    }

    @Override // X.BTZ
    public final boolean LIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return this.LIZIZ.canHandle(uri);
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        if (map == null) {
            return this.LIZIZ.handle(context, c28826BTa.LIZ);
        }
        return this.LIZIZ.LIZJ(context, c28826BTa.LIZ, map);
    }
}
