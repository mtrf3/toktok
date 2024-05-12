package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hew, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44602Hew extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44537Hdt LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        int i;
        C44609Hf3 c44609Hf3 = this.LIZIZ.LIZIZ.LJFF;
        boolean z = C34066DYo.LIZ;
        int i2 = 0;
        if (z) {
            i = 30;
        } else {
            i = 0;
        }
        c44609Hf3.LIZ = i;
        if (z) {
            i2 = 10;
        }
        c44609Hf3.LIZIZ = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44602Hew(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44611Hf5 c44611Hf5 = C44611Hf5.LIZ;
        String name = c44611Hf5.key;
        int i = c44611Hf5.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
