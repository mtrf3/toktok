package com.ss.android.ugc.aweme.feed.assem.music.artistprofile;

import X.A2F;
import X.A2G;
import X.C175046tw;
import X.C32I;
import X.C33Q;
import X.C42625Go9;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C7YO;
import X.C7YP;
import X.C7YQ;
import X.C87743cQ;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.QD3;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class ArtistProfileTuxSheetViewModel extends AssemListViewModel<C87743cQ, InterfaceC57784Mm4, Long> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C7YO.class, "hierarchy_data_key"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87743cQ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 42));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onBlockUserEvent(C175046tw c175046tw) {
        User user;
        List<ITEM> listGetAll;
        if (c175046tw == null || (user = c175046tw.LJLIL) == null || (listGetAll = listGetAll()) == 0) {
            return;
        }
        int i = 0;
        for (Object obj : listGetAll) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
                if (interfaceC57784Mm4 instanceof C7YP) {
                    C7YP c7yp = (C7YP) interfaceC57784Mm4;
                    if (o.LJ(user.getUid(), c7yp.LJLILLLLZI)) {
                        listSetItemAt(i, (int) C7YP.LIZ(c7yp, Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.isBlock, user.isBlocked(), 62079));
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        List<ITEM> listGetAll;
        C7YP LIZ;
        if (followStatusEvent != null && (listGetAll = listGetAll()) != 0) {
            int i = 0;
            for (Object obj : listGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
                    if (interfaceC57784Mm4 instanceof C7YP) {
                        C7YP c7yp = (C7YP) interfaceC57784Mm4;
                        if (o.LJ(followStatusEvent.status.userId, c7yp.LJLILLLLZI)) {
                            int i3 = followStatusEvent.status.followStatus;
                            if (i3 != 0 && i3 != -1) {
                                LIZ = C7YP.LIZ(c7yp, Integer.valueOf(i3), null, false, false, 62335);
                            } else {
                                LIZ = C7YP.LIZ(c7yp, Integer.valueOf(i3), null, false, false, 65407);
                            }
                            listSetItemAt(i, (int) LIZ);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        List<MusicOwnerInfo> list;
        String str;
        Boolean bool;
        String str2;
        Aweme aweme;
        C7YO c7yo = (C7YO) this.LJLIL.getValue();
        if (c7yo == null || (list = c7yo.LJLJI) == null || list.isEmpty()) {
            A2F a2f = A2G.LIZ;
            Exception exc = new Exception();
            a2f.getClass();
            return A2F.LIZJ(exc);
        }
        A2F a2f2 = A2G.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (MusicOwnerInfo musicOwnerInfo : list) {
            C7YO c7yo2 = (C7YO) this.LJLIL.getValue();
            if (c7yo2 != null && (aweme = c7yo2.LJLIL) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            String uid = musicOwnerInfo.getUid();
            String secUid = musicOwnerInfo.getSecUid();
            UrlModel avatar = musicOwnerInfo.getAvatar();
            String nickName = musicOwnerInfo.getNickName();
            boolean verified = musicOwnerInfo.getVerified();
            String handle = musicOwnerInfo.getHandle();
            Integer followStatus = musicOwnerInfo.getFollowStatus();
            Integer followerStatus = musicOwnerInfo.getFollowerStatus();
            boolean isPrivateAccount = musicOwnerInfo.isPrivateAccount();
            boolean isBlock = musicOwnerInfo.isBlock();
            boolean isBlocked = musicOwnerInfo.isBlocked();
            Integer status = musicOwnerInfo.getStatus();
            C7YO c7yo3 = (C7YO) this.LJLIL.getValue();
            if (c7yo3 != null) {
                bool = Boolean.valueOf(c7yo3.LJLJJLL);
            } else {
                bool = null;
            }
            if (musicOwnerInfo.getEnterType() == 1) {
                str2 = "spotlight";
            } else {
                str2 = "musician";
            }
            arrayList.add(new C7YP(str, uid, secUid, avatar, nickName, verified, handle, followStatus, followerStatus, isPrivateAccount, isBlock, isBlocked, status, bool, str2, (C7YO) this.LJLIL.getValue()));
        }
        a2f2.getClass();
        return A2F.LIZ(arrayList);
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onUnBlockUserEvent(C7YQ c7yq) {
        User user;
        List<ITEM> listGetAll;
        if (c7yq == null || (user = c7yq.LJLIL) == null || (listGetAll = listGetAll()) == 0) {
            return;
        }
        int i = 0;
        for (Object obj : listGetAll) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
                if (interfaceC57784Mm4 instanceof C7YP) {
                    C7YP c7yp = (C7YP) interfaceC57784Mm4;
                    if (o.LJ(user.getUid(), c7yp.LJLILLLLZI)) {
                        listSetItemAt(i, (int) C7YP.LIZ(c7yp, Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.isBlock, user.isBlocked(), 62079));
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
