package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GetNewAnchorGuideFeedbackConfigResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("display_interval")
        public int displayInterval;

        @InterfaceC65349Pkn("guide_style")
        public int guideStyle;

        @InterfaceC65349Pkn("identity")
        public int identity;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public List<String> scene = new ArrayList();
    }
}
