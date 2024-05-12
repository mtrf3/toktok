package X;

import com.ss.android.ugc.aweme.commercialize.service.CommerceCommonServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5W implements ICommerceCommonService {
    public static final N5W LIZIZ = new N5W();
    public final /* synthetic */ ICommerceCommonService LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final InterfaceC55686LtK LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final String LIZJ(String from) {
        o.LJIIIZ(from, "from");
        return this.LIZ.LIZJ(from);
    }

    public N5W() {
        ICommerceCommonService iCommerceCommonService;
        Object LIZ = C58096Mr6.LIZ(ICommerceCommonService.class, false);
        if (LIZ != null) {
            iCommerceCommonService = (ICommerceCommonService) LIZ;
        } else {
            if (C58096Mr6.LLLLZI == null) {
                synchronized (ICommerceCommonService.class) {
                    if (C58096Mr6.LLLLZI == null) {
                        C58096Mr6.LLLLZI = new CommerceCommonServiceImpl();
                    }
                }
            }
            iCommerceCommonService = C58096Mr6.LLLLZI;
        }
        this.LIZ = iCommerceCommonService;
    }
}
