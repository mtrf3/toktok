package X;

import com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase;

/* loaded from: classes15.dex */
public final class VVS extends AbstractC65781Prl implements InterfaceC65784Pro<FriendsFeeRespDatabase> {
    public static final VVS LJLIL = new VVS();

    public VVS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase, X.0Ba] */
    @Override // X.InterfaceC65784Pro
    public final FriendsFeeRespDatabase invoke() {
        return C0BV.LIZ(EF7.LIZIZ(), FriendsFeeRespDatabase.class, "friends_feed_resp_cache.db").LIZIZ();
    }
}
