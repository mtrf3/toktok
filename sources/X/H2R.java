package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H2R implements InterfaceC43351Gzr {
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, String, C6ZI, C76800UCe> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public H2R(InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super Boolean, ? super String, ? super C6ZI, C76800UCe> interfaceC88473Ynt) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC43351Gzr
    public final void LIZ(Object obj, boolean z) {
        SynthetiseResult synthetiseResult;
        if ((obj instanceof SynthetiseResult) && (synthetiseResult = (SynthetiseResult) obj) != null) {
            this.LIZIZ.invoke(Boolean.TRUE, synthetiseResult.outputFile, null);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZIZ.invoke(Boolean.FALSE, null, new C6ZI(1000, null, 6));
    }

    @Override // X.InterfaceC43351Gzr
    public final void LIZIZ(int i, Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZIZ.invoke(Boolean.FALSE, null, new C6ZI(i, t, 2));
    }

    @Override // X.InterfaceC43351Gzr
    public final void LIZJ(Object obj, EnumC43531H6p dispatchPath) {
        o.LJIIIZ(dispatchPath, "dispatchPath");
        if (obj instanceof C41855Gbj) {
            this.LIZ.invoke(Float.valueOf(((C41855Gbj) obj).LIZ));
        }
    }
}
