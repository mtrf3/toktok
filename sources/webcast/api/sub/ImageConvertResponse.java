package webcast.api.sub;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ImageConvertResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("images")
        public List<Images> images = new ArrayList();
    }

    /* loaded from: classes6.dex */
    public static final class Images {

        @InterfaceC65349Pkn("url")
        public List<String> url = new ArrayList();
    }
}
