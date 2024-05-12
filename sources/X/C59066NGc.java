package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.NGc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59066NGc extends F9E {
    public final String LJLIL;
    public final EnumC59241NMv LJLILLLLZI;
    public final Context LJLJI;
    public final NGY LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C59066NGc(String scene, EnumC59241NMv adHybridContainerType, Context context, NGY ngy) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(adHybridContainerType, "adHybridContainerType");
        o.LJIIIZ(context, "context");
        this.LJLIL = scene;
        this.LJLILLLLZI = adHybridContainerType;
        this.LJLJI = context;
        this.LJLJJI = ngy;
    }
}
