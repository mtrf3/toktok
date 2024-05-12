package com.ss.android.ugc.aweme.shortvideo.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C76L;
import X.E8L;
import X.InterfaceC789838c;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes16.dex */
public final class MusicChoicesApi {
    public static final InterfaceC789838c LIZ = C46104I7o.LJIILL(Api.LIZ);

    /* loaded from: classes16.dex */
    public interface RealApi {
        @E8L("/aweme/v1/commerce/music/choices/")
        C76L<MusicList> getCommerceMusicList();

        @E8L("/aweme/v1/music/choices/")
        C76L<MusicList> getMusicList();
    }

    public static MusicList LIZ() {
        try {
            if (CommerceMediaServiceImpl.LIZJ().LIZ()) {
                return ((RealApi) LIZ.create(RealApi.class)).getCommerceMusicList().get();
            }
            return ((RealApi) LIZ.create(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
