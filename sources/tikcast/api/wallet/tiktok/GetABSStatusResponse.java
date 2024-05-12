package tikcast.api.wallet.tiktok;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetABSStatusResponse {

    @InterfaceC65349Pkn("data")
    public ABSData data;

    /* loaded from: classes17.dex */
    public static final class ABSData {

        @InterfaceC65349Pkn("is_abs_on")
        public boolean isAbsOn;

        @InterfaceC65349Pkn("is_agreed")
        public boolean isAgreed;

        @InterfaceC65349Pkn("is_eligible")
        public boolean isEligible;

        @InterfaceC65349Pkn("abs_pipo_avatars")
        public List<String> absPipoAvatars = new ArrayList();

        @InterfaceC65349Pkn("priority_region")
        public String priorityRegion = "";
    }
}
