package com.ss.android.ugc.aweme.profile.edit.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC789838c;
import com.ss.android.ugc.aweme.app.api.Api;
import java.util.concurrent.ExecutionException;

/* loaded from: classes12.dex */
public final class TwitterApi {
    public static final InterfaceC789838c LIZ = C46104I7o.LJIILL(Api.LIZ);

    /* loaded from: classes12.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/twitter/bind/")
        C76L<String> bindTwitter(@InterfaceC64987Pex("twitter_id") String str, @InterfaceC64987Pex("twitter_name") String str2, @InterfaceC64987Pex("access_token") String str3, @InterfaceC64987Pex("secret_token") String str4);

        @E4Q("/aweme/v1/twitter/unbind/")
        C76L<String> unbindYouTube();
    }

    public static String LIZIZ() {
        try {
            return ((RealApi) LIZ.create(RealApi.class)).unbindYouTube().get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static String LIZ(String str, String str2, String str3, String str4) {
        try {
            return ((RealApi) LIZ.create(RealApi.class)).bindTwitter(str, str2, str3, str4).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
