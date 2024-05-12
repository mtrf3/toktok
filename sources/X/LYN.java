package X;

import Y.AfS61S0100000_9;
import Y.IDhS70S0200000_9;
import android.os.Looper;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.feed.ui.LiveFollowFragment;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import webcast.api.feed.FollowRecommendItem;
import yq4.a;

/* loaded from: classes10.dex */
public final class LYN {
    public final LiveFollowFragment LIZ;
    public final C73318Sq2 LIZIZ;
    public final AtomicBoolean LIZJ;
    public final List<Object> LIZLLL;
    public final List<FollowRecommendItem> LJ;

    public final void LIZ() {
        Room room;
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL);
        if (!C79004UzY.LJJIFFI(this.LJ)) {
            arrayList.add(new LYR());
            arrayList.addAll(this.LJ);
        }
        LiveFollowFragment liveFollowFragment = this.LIZ;
        liveFollowFragment.getClass();
        C73353Sqb.LJ().LJIIJJI();
        C81335Vw3 c81335Vw3 = liveFollowFragment.LJLJJL;
        if (c81335Vw3 != null) {
            c81335Vw3.setRefreshing(false);
        }
        C31413CUn c31413CUn = liveFollowFragment.LJLJJI;
        c31413CUn.LJLIL = arrayList;
        c31413CUn.notifyDataSetChanged();
        C73353Sqb.LJ().LJIIIIZZ();
        C73345SqT LJ = C73353Sqb.LJ();
        if (!LJ.LIZLLL) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_cnt", String.valueOf(((ArrayList) this.LJ).size() + ((ArrayList) this.LIZLLL).size()));
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = (ArrayList) this.LIZLLL;
            if (!arrayList4.isEmpty()) {
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Class<?> cls = next.getClass();
                    if (o.LJ(cls, LYQ.class)) {
                        LYQ lyq = (LYQ) next;
                        if (u.LJJ(lyq.LIZ)) {
                            arrayList2.add(String.valueOf(lyq.LIZ.getUser().roomId));
                            String uid = lyq.LIZ.getUser().getUid();
                            o.LJIIIIZZ(uid, "itemDoubleHeadItem.followingInterestUser.user.uid");
                            arrayList3.add(uid);
                        }
                    } else if (o.LJ(cls, LYP.class)) {
                        LYP lyp = (LYP) next;
                        if (u.LJJ(lyp.LJLIL)) {
                            arrayList2.add(String.valueOf(lyp.LJLIL.getUser().roomId));
                            String uid2 = lyp.LJLIL.getUser().getUid();
                            o.LJIIIIZZ(uid2, "itemFollowUserItem.followingInterestUser.user.uid");
                            arrayList3.add(uid2);
                        }
                    }
                }
            }
            ArrayList arrayList5 = (ArrayList) this.LJ;
            if (!arrayList5.isEmpty()) {
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    FollowRecommendItem followRecommendItem = (FollowRecommendItem) it2.next();
                    Room room2 = followRecommendItem.data;
                    long j2 = 0;
                    if (room2 != null && room2.getId() > 0 && (room = followRecommendItem.data) != null && room.getOwnerUserId() > 0) {
                        Room room3 = followRecommendItem.data;
                        if (room3 != null) {
                            j = room3.getId();
                        } else {
                            j = 0;
                        }
                        arrayList2.add(String.valueOf(j));
                        Room room4 = followRecommendItem.data;
                        if (room4 != null) {
                            j2 = room4.getOwnerUserId();
                        }
                        arrayList3.add(String.valueOf(j2));
                    }
                }
            }
            hashMap.put("room_id_list", arrayList2.toString());
            hashMap.put("anchor_id_list", arrayList3.toString());
            C73343SqR.LJFF(LJ, hashMap, 7);
        }
    }

    public final void LIZIZ() {
        int i;
        AbstractC73672Svk<FollowingInterestUsersResponse> interestUsers;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        C76732zl c76732zl = new C76732zl();
        if (o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE) && C35971E9v.LIZ()) {
            i = 1;
        } else {
            i = 0;
        }
        c76732zl.element = i;
        if (!this.LIZJ.get() && o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && C33808DOq.LIZ()) {
            interestUsers = AbstractC73672Svk.LJJIJIL(1).LJJIII(new IDhS70S0200000_9(c76732zl, this, 1), false);
        } else {
            FollowFeedApi.LIZ.getClass();
            interestUsers = LY5.LIZ().getInterestUsers(2, 0L, 2, c76732zl.element);
            this.LIZJ.set(true);
        }
        this.LIZIZ.LIZ(interestUsers.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 49), LYF.LJLIL));
    }

    public final void LIZJ() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        C73353Sqb.LJ().LJIIJ();
        LiveOuterService.LJJJLL().LJJIJIL().LJJL().bm0().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 50), LYO.LJLIL);
    }

    public LYN(LiveFollowFragment view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = new C73318Sq2();
        this.LIZJ = new AtomicBoolean(false);
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
    }

    public final void LIZLLL(Collection<FollowingInterestUser> collection) {
        SlimRoom.LinkMic linkMic;
        List<User> list;
        if (collection != null) {
            ((ArrayList) this.LIZLLL).clear();
            Iterator it = ((ArrayList) collection).iterator();
            while (it.hasNext()) {
                FollowingInterestUser followingInterestUser = (FollowingInterestUser) it.next();
                SlimRoom LJIIIZ = LYU.LJIIIZ(followingInterestUser);
                if (LJIIIZ != null && (linkMic = LJIIIZ.getLinkMic()) != null && (list = linkMic.followedList) != null && list.size() >= 2) {
                    ((ArrayList) this.LIZLLL).add(new LYQ(followingInterestUser));
                } else {
                    ((ArrayList) this.LIZLLL).add(new LYP(followingInterestUser));
                }
            }
        }
    }
}
