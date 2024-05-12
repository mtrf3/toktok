package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class FeedbackTagResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("tags")
        public List<FeedbackTag> tags = new ArrayList();

        /* loaded from: classes17.dex */
        public static final class FeedbackTag {

            @InterfaceC65349Pkn("id")
            public String id = "";

            @InterfaceC65349Pkn("name")
            public String name = "";

            @InterfaceC65349Pkn("sub_tags")
            public List<FeedbackSubTag> subTags = new ArrayList();

            /* loaded from: classes17.dex */
            public static final class FeedbackSubTag {

                @InterfaceC65349Pkn("id")
                public String id = "";

                @InterfaceC65349Pkn("name")
                public String name = "";
            }
        }
    }
}
