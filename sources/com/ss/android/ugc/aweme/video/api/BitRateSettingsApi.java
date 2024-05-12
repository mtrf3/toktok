package com.ss.android.ugc.aweme.video.api;

import X.AbstractC36908Ee8;
import X.C38306F1q;
import X.C38333F2r;
import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.EFJ;
import X.InterfaceC789838c;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class BitRateSettingsApi {
    public static final InterfaceC789838c LIZ = C46104I7o.LJIILL(EFJ.LIZJ);

    /* loaded from: classes7.dex */
    public interface RealApi {
        @E4Q("/aweme/v1/rate/settings/")
        C76L<RateSettingsResponse> fetchRateSettings();
    }

    public static RateSettingsResponse LIZ() {
        int errorCode;
        try {
            return ((RealApi) LIZ.create(RealApi.class)).fetchRateSettings().get();
        } catch (IncompatibleClassChangeError e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            if ((e2.getCause() instanceof C38333F2r) && ((errorCode = ((C38306F1q) e2.getCause()).getErrorCode()) == 9 || errorCode == 14)) {
                return null;
            }
            throw AbstractC36908Ee8.getCompatibleException(e2);
        }
    }
}
