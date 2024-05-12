package com.ss.android.ugc.aweme.friendstab.api;

import X.C76L;
import X.C79061V1d;
import X.E6L;
import X.E8M;
import X.EFJ;
import X.EJ6;
import X.InterfaceC195737mD;
import X.InterfaceC195767mG;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC789838c;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsFeedListApi {
    public static final FriendsFeedApi LIZ;

    /* loaded from: classes10.dex */
    public interface FriendsFeedApi {
        @E6L(3)
        @InterfaceC195787mI
        @E8M("/tiktok/v1/friend/friend_feed")
        C76L<FriendsFeedResponse> getFriendsFeedList(@InterfaceC64987Pex("is_non_personalized") int i, @InterfaceC64987Pex("source") int i2, @InterfaceC64987Pex("max_count") int i3, @InterfaceC64987Pex("pull_type") int i4, @InterfaceC64987Pex("aweme_ids") String str, @InterfaceC64989Pez("insert_relations") String str2, @InterfaceC64987Pex("client_read_gids") String str3, @InterfaceC64987Pex("client_unread_gids") String str4, @InterfaceC64987Pex("client_read_gids_notification") String str5, @InterfaceC64987Pex("client_read_gids_all") String str6, @InterfaceC64987Pex("page_token") String str7, @InterfaceC64987Pex("preload") Integer num, @InterfaceC64987Pex("insert_aweme_asc") boolean z, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

        @E6L(3)
        @InterfaceC195787mI
        @E8M("/tiktok/v1/friend/friend_feed")
        C76L<FriendsFeedResponse> getFriendsFeedListEnhance(@InterfaceC64989Pez("friends_tab_preload") int i, @InterfaceC64989Pez("friends_tab_preload_scene") String str, @InterfaceC64989Pez("friends_tab_pull_type") int i2, @InterfaceC64987Pex("is_non_personalized") int i3, @InterfaceC64987Pex("source") int i4, @InterfaceC64987Pex("max_count") int i5, @InterfaceC64987Pex("pull_type") int i6, @InterfaceC64987Pex("aweme_ids") String str2, @InterfaceC64989Pez("insert_relations") String str3, @InterfaceC64987Pex("client_read_gids") String str4, @InterfaceC64987Pex("client_unread_gids") String str5, @InterfaceC64987Pex("client_read_gids_notification") String str6, @InterfaceC64987Pex("client_read_gids_all") String str7, @InterfaceC64987Pex("page_token") String str8, @InterfaceC64987Pex("preload") Integer num, @InterfaceC64987Pex("insert_aweme_asc") boolean z, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);
    }

    static {
        Object obj;
        String str = EFJ.LIZJ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(FriendsFeedApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LIZ = (FriendsFeedApi) obj;
    }
}
