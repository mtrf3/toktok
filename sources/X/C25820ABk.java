package X;

import com.ss.android.ugc.aweme.service.CaptionSheetServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionSheetService;
import kotlin.jvm.internal.o;

/* renamed from: X.ABk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25820ABk implements ICaptionSheetService {
    public static final C25820ABk LIZIZ = new C25820ABk();
    public final /* synthetic */ ICaptionSheetService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZ(EnumC25835ABz type, C86775Y3v c86775Y3v) {
        o.LJIIIZ(type, "type");
        this.LIZ.LIZ(type, c86775Y3v);
    }

    public C25820ABk() {
        ICaptionSheetService iCaptionSheetService;
        Object LIZ = C58096Mr6.LIZ(ICaptionSheetService.class, false);
        if (LIZ != null) {
            iCaptionSheetService = (ICaptionSheetService) LIZ;
        } else {
            if (C58096Mr6.R4 == null) {
                synchronized (ICaptionSheetService.class) {
                    if (C58096Mr6.R4 == null) {
                        C58096Mr6.R4 = new CaptionSheetServiceImpl();
                    }
                }
            }
            iCaptionSheetService = C58096Mr6.R4;
        }
        this.LIZ = iCaptionSheetService;
    }
}
