package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.web.business.special.AdWebSpecialService;

/* renamed from: X.NdY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59804NdY implements InterfaceC60012Ngu {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ AdSparkHybridContext LIZIZ;

    @Override // X.InterfaceC60012Ngu
    public final C60595NqJ LIZ(C60595NqJ c60595NqJ) {
        String str = this.LIZ;
        AdSparkHybridContext adSparkHybridContext = this.LIZIZ;
        c60595NqJ.LJLILLLLZI = c60595NqJ.LJLILLLLZI;
        c60595NqJ.LJLJI = AdWebSpecialService.LIZIZ().LIZ(str, (java.util.Map) c60595NqJ.LJLJI, (C59222NMc) adSparkHybridContext.LIZIZ(C59222NMc.class));
        return c60595NqJ;
    }

    public C59804NdY(String str, AdSparkHybridContext adSparkHybridContext) {
        this.LIZ = str;
        this.LIZIZ = adSparkHybridContext;
    }
}
