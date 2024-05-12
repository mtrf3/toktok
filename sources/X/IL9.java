package X;

import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IL9 {
    public static final /* synthetic */ IL9 LIZ = new IL9();

    public static IPlayerEventReportService LIZ(ILB type) {
        o.LJIIIZ(type, "type");
        int i = ILA.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return (IPlayerEventReportService) ESN.LIZ("com.ss.android.ugc.aweme.playereventreporter.service.PlayerReportServiceWrapper");
                }
                throw new C162476Zf();
            }
            return (IPlayerEventReportService) ESN.LIZ("com.ss.android.ugc.aweme.simreporterconvia.ConviaReportService");
        }
        Object value = IZ8.Z.getValue();
        o.LJIIIIZZ(value, "<get-enableReportServiceV2>(...)");
        boolean booleanValue = ((Boolean) value).booleanValue();
        if (!booleanValue) {
            return (IPlayerEventReportService) ESN.LIZ("com.ss.android.ugc.aweme.simreporterdt.SimDtReportService");
        }
        if (booleanValue) {
            return (IPlayerEventReportService) ESN.LIZ("com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2");
        }
        throw new C162476Zf();
    }
}
