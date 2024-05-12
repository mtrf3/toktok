package X;

import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.web.business.special.AdWebSpecialService;

/* renamed from: X.NdZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59805NdZ implements InterfaceC60012Ngu {
    public final /* synthetic */ AdSparkContext LIZ;

    public C59805NdZ(AdSparkContext adSparkContext) {
        this.LIZ = adSparkContext;
    }

    @Override // X.InterfaceC60012Ngu
    public final C60595NqJ LIZ(C60595NqJ c60595NqJ) {
        AdSparkContext adSparkContext = this.LIZ;
        c60595NqJ.LJLILLLLZI = c60595NqJ.LJLILLLLZI;
        c60595NqJ.LJLJI = AdWebSpecialService.LIZIZ().LIZ((String) c60595NqJ.LJLILLLLZI, (java.util.Map) c60595NqJ.LJLJI, (C59222NMc) adSparkContext.LIZIZ(C59222NMc.class));
        return c60595NqJ;
    }
}
