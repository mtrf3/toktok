package X;

import com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;

/* renamed from: X.LhE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54936LhE {
    public static volatile IComplianceDependService LIZ;

    public static IComplianceDependService LIZ() {
        IComplianceDependService iComplianceDependService;
        if (LIZ == null) {
            Object LIZ2 = C58096Mr6.LIZ(IComplianceDependService.class, false);
            if (LIZ2 != null) {
                iComplianceDependService = (IComplianceDependService) LIZ2;
            } else {
                if (C58096Mr6.LLLZI == null) {
                    synchronized (IComplianceDependService.class) {
                        if (C58096Mr6.LLLZI == null) {
                            C58096Mr6.LLLZI = new ComplianceDependServiceImpl();
                        }
                    }
                }
                iComplianceDependService = C58096Mr6.LLLZI;
            }
            LIZ = iComplianceDependService;
        }
        return LIZ;
    }
}
