package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.He0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44544He0 extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0099 A[EDGE_INSN: B:77:0x0099->B:78:0x0099 BREAK  A[LOOP:0: B:45:0x0113->B:75:0x0113], SYNTHETIC] */
    @Override // X.AbstractC44652Hfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44544He0.LIZIZ(com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44544He0(InterfaceC44653Hfl strategy, C44537Hdt initParams) {
        super(strategy);
        C44576HeW c44576HeW = C44576HeW.LIZ;
        String name = c44576HeW.key;
        int i = c44576HeW.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
