package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NTt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59421NTt {
    public final EnumC59053NFp LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final NIA LJFF;
    public final C59452NUy LJI;
    public final boolean LJII;

    public C59421NTt(EnumC59053NFp adHybridRenderStrategy, String cacheKey, int i, boolean z, NIA nia, C59452NUy c59452NUy, boolean z2, int i2) {
        int i3;
        i = (i2 & 4) != 0 ? 8 : i;
        if ((i2 & 8) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        z = (i2 & 16) != 0 ? false : z;
        nia = (i2 & 32) != 0 ? null : nia;
        c59452NUy = (i2 & 64) != 0 ? null : c59452NUy;
        z2 = (i2 & 128) != 0 ? false : z2;
        o.LJIIIZ(adHybridRenderStrategy, "adHybridRenderStrategy");
        o.LJIIIZ(cacheKey, "cacheKey");
        this.LIZ = adHybridRenderStrategy;
        this.LIZIZ = cacheKey;
        this.LIZJ = i;
        this.LIZLLL = i3;
        this.LJ = z;
        this.LJFF = nia;
        this.LJI = c59452NUy;
        this.LJII = z2;
    }
}
