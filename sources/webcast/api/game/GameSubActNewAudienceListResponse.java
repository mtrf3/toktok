package webcast.api.game;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GameSubActNewAudienceListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("new_audience_list")
        public List<Audience> newAudienceList = new ArrayList();
    }
}
