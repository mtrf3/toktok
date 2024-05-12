package com.ss.android.ugc.aweme.comment.likelist.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C79M;
import X.E4T;
import X.EF7;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.X1D;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;

/* loaded from: classes4.dex */
public final class LikeApi {
    public static final String LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes4.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("/tiktok/video/like/list/v1")
        AbstractC73672Svk<LikeListResponse> fetchLikeList(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("offset") long j2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("insert_ids") String str2, @InterfaceC64987Pex("scenario") int i2);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZ = X1D.LIZIZ(LIZ2);
        LIZIZ = C221108m2.LIZIZ(C79M.LJLIL);
    }
}
