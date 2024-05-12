package X;

import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabLocalCacheConfig;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.cache.FriendsFeedRespCacheManager$insertFriendsFeed$1$1", f = "FriendsFeedRespCacheManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LVw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54380LVw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ FriendsFeedResponse LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54380LVw(int i, int i2, FriendsFeedResponse friendsFeedResponse, InterfaceC67352kd<? super C54380LVw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = friendsFeedResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54380LVw(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        int i;
        FriendsFeedResponse friendsFeedResponse;
        int i2;
        List<FriendsFeed> subList;
        List<FriendsFeed> list;
        List<FriendsFeed> subList2;
        C141335gf.LIZJ(obj);
        int i3 = this.LJLIL;
        int i4 = this.LJLILLLLZI;
        FriendsFeedResponse friendsFeedResponse2 = this.LJLJI;
        try {
            String uid = ((RBX) HG3.LJIILL()).getCurUserId();
            long currentTimeMillis = System.currentTimeMillis();
            int i5 = ((FriendsTabLocalCacheConfig) LW4.LIZIZ.getValue()).cachedFeedSize;
            if (i3 > i5) {
                i = i5;
            } else {
                i = i3;
            }
            if (i4 == EnumC54377LVt.REFRESH.getType()) {
                C62822Ol8 c62822Ol8 = C54383LVz.LIZ;
                LW5 lw5 = (LW5) c62822Ol8.getValue();
                o.LJIIIIZZ(uid, "uid");
                lw5.LIZIZ(uid);
                ArrayList arrayList = new ArrayList();
                List<FriendsFeed> list2 = friendsFeedResponse2.friendFeedData;
                if (list2 != null && (subList2 = list2.subList(0, i)) != null) {
                    arrayList.addAll(subList2);
                }
                friendsFeedResponse2.friendFeedData = arrayList;
                ((LW5) c62822Ol8.getValue()).LIZJ(new LW0(uid, friendsFeedResponse2, currentTimeMillis));
            } else if (i4 == EnumC54377LVt.LOADMORE.getType()) {
                LW0 LIZ2 = C54383LVz.LIZ();
                if (LIZ2 != null && (friendsFeedResponse = LIZ2.LIZIZ) != null) {
                    List<FriendsFeed> list3 = friendsFeedResponse.friendFeedData;
                    if (list3 != null) {
                        i2 = list3.size();
                    } else {
                        i2 = 0;
                        if (friendsFeedResponse != null) {
                        }
                    }
                    if (friendsFeedResponse.friendFeedData != null) {
                        if (i2 >= i5) {
                            return C76800UCe.LIZ;
                        }
                        int i6 = i5 - i2;
                        if (i3 > i6) {
                            i3 = i6;
                        }
                        List<FriendsFeed> list4 = friendsFeedResponse2.friendFeedData;
                        if (list4 != null && (subList = list4.subList(0, i3)) != null && (list = friendsFeedResponse.friendFeedData) != null) {
                            list.addAll(subList);
                        }
                        friendsFeedResponse.hasMore = friendsFeedResponse2.hasMore;
                        LW5 lw52 = (LW5) C54383LVz.LIZ.getValue();
                        o.LJIIIIZZ(uid, "uid");
                        lw52.LIZJ(new LW0(uid, friendsFeedResponse, currentTimeMillis));
                    }
                }
                return C76800UCe.LIZ;
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIJ(m10exceptionOrNullimpl, "FriendsFeedCache");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
