package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class FeatureCheckRequest {

    @InterfaceC65349Pkn("feature_list")
    public List<Integer> featureList = new ArrayList();

    @InterfaceC65349Pkn("is_fail_retry")
    public boolean isFailRetry;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;
}
