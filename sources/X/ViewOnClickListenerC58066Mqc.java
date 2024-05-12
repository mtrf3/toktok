package X;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Mqc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC58066Mqc implements View.OnClickListener {
    public final /* synthetic */ FollowListAdapter.FollowItemViewHolder LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ FollowListAdapter LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public ViewOnClickListenerC58066Mqc(FollowListAdapter.FollowItemViewHolder followItemViewHolder, int i, User user, FollowListAdapter followListAdapter, String str) {
        this.LJLIL = followItemViewHolder;
        this.LJLILLLLZI = i;
        this.LJLJI = user;
        this.LJLJJI = followListAdapter;
        this.LJLJJL = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ListLiveCircleItemVM LIZ;
        if (C44384HbQ.LLFF(this.LJLIL.LJLJI) && (this.LJLIL.LJLLJ instanceof ActivityC45651qj)) {
            C72929Sjl LJIILIIL = LiveOuterService.LJJJLL().LJIILIIL();
            int i = this.LJLILLLLZI;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.LJLIL.LJLLJ;
            LJIILIIL.getClass();
            if (activityC45651qj != null && (LIZ = C55116Lk8.LIZ(i, activityC45651qj)) != null) {
                User curUser = this.LJLJI;
                String enterFromMerge = this.LJLJJI.LLD();
                String enterMethod = this.LJLJJL;
                String liveSortBy = this.LJLJJI.LJLL;
                FollowListAdapter.FollowItemViewHolder followItemViewHolder = this.LJLIL;
                int i2 = followItemViewHolder.latestItemPositionInternal;
                SlimRoom slimRoom = followItemViewHolder.LJLLL;
                o.LJIIIZ(curUser, "curUser");
                o.LJIIIZ(enterFromMerge, "enterFromMerge");
                o.LJIIIZ(enterMethod, "enterMethod");
                o.LJIIIZ(liveSortBy, "liveSortBy");
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                ArrayList arrayList = new ArrayList();
                ArrayList<User> arrayList2 = LIZ.LJLJJI;
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator<User> it = arrayList2.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (hashSet.add(Long.valueOf(next.roomId))) {
                        arrayList3.add(next);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                int i3 = 0;
                int i4 = 0;
                while (it2.hasNext()) {
                    int i5 = i4 + 1;
                    User user = (User) it2.next();
                    long j = user.roomId;
                    if (j != 0) {
                        arrayList.add(Long.valueOf(j));
                    }
                    if (o.LJ(curUser.getUid(), user.getUid())) {
                        i3 = i4;
                    }
                    i4 = i5;
                }
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.enterFromMerge = enterFromMerge;
                roomsData.enterMethod = enterMethod;
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                String uid = curUser.getUid();
                uid.toString();
                logData.anchorId = uid;
                EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                logData2.positionOutsideLiveRoom = i3;
                logData2.liveSortBy = liveSortBy;
                logData2.followListOrder = i2;
                if (slimRoom != null) {
                    C30746C4w.LIZJ(slimRoom, enterRoomConfig);
                }
                LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(LIZ.LJLL, curUser, enterRoomConfig);
            }
        }
    }
}
