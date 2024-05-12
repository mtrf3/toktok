package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.C16880lQ;
import X.C2A7;
import X.C51029K0z;
import X.C74838TYs;
import X.C77950UiY;
import X.C77955Uid;
import X.CN1;
import X.EnumC31118CJe;
import X.HandlerC28345BAn;
import X.InterfaceC78023Ujj;
import Y.AObserverS81S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class GiftListFragment extends RankListFragment implements InterfaceC78023Ujj {
    public C77955Uid LLIIIILZ;
    public final Map<Integer, View> LLIIIJ = new LinkedHashMap();

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIJ).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        HandlerC28345BAn handlerC28345BAn;
        C77955Uid c77955Uid = this.LLIIIILZ;
        if (c77955Uid != null && (handlerC28345BAn = c77955Uid.LJLJJI) != null) {
            handlerC28345BAn.removeCallbacksAndMessages(null);
        }
        this.LLIIIILZ = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC78023Ujj
    public final boolean C0() {
        return vl();
    }

    @Override // X.InterfaceC78023Ujj
    public final LayoutInflater J2() {
        return getLayoutInflater();
    }

    @Override // X.InterfaceC78023Ujj
    public final View Le() {
        return getView();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public void wl(boolean z) {
        C77955Uid c77955Uid;
        RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra;
        RankListViewModel LJII;
        MutableLiveData<RankListV2Response.RankInfo> mutableLiveData;
        RankListV2Response.RankInfo value;
        super.wl(z);
        if (z && (c77955Uid = this.LLIIIILZ) != null) {
            RankListController rankListController = this.LJLJJLL;
            if (rankListController != null && (LJII = rankListController.LJII()) != null && (mutableLiveData = LJII.LJLJJL) != null && (value = mutableLiveData.getValue()) != null) {
                weeklyRookieRankExtra = value.weeklyRookieRankExtra;
            } else {
                weeklyRookieRankExtra = null;
            }
            c77955Uid.LIZ(weeklyRookieRankExtra);
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void xl(User user) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        EnumC31118CJe enumC31118CJe;
        String str;
        Room room2;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthOffReasons roomAuthOffReasons;
        RankRootViewModel LIZ;
        RankRootViewModel LIZ2;
        RankListController rankListController = this.LJLJJLL;
        boolean z2 = true;
        if (rankListController != null && (LIZ2 = rankListController.LIZ()) != null && LIZ2.LJLJI) {
            C2A7 c2a7 = this.LLFZ;
            if (c2a7 == null) {
                return;
            }
            c2a7.setVisibility(8);
            return;
        }
        C2A7 c2a72 = this.LLFZ;
        if (c2a72 != null) {
            if (getUserVisibleHint() && c2a72.getVisibility() != 0) {
                RankTypeV2 rankType = this.LJLJJI.LIZIZ;
                boolean isEnabled = c2a72.isEnabled();
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                RankListController rankListController2 = this.LJLJJLL;
                if (rankListController2 != null && (LIZ = rankListController2.LIZ()) != null) {
                    z = LIZ.LJLJI;
                } else {
                    z = false;
                }
                o.LJIIIZ(rankType, "rankType");
                IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
                if (LJIILIIL == null || (room2 = (Room) LJIILIIL.kv0(RoomChannel.class)) == null || (roomAuthStatus2 = room2.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus2.getRoomAuthOffReasons()) == null || (enumC31118CJe = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                    enumC31118CJe = EnumC31118CJe.UNKNOWN;
                }
                if (z) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                iGiftService.monitorGiftIconShow(isEnabled, enumC31118CJe, str, rankType.rankName, C74838TYs.LJ().LJJ);
            }
            c2a72.setVisibility(0);
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL2 == null || (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableGift()) {
                z2 = false;
            }
            c2a72.setEnabled(z2);
            C16880lQ.LJJIII(c2a72, new C77950UiY(this, user));
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RankListViewModel LJII;
        MutableLiveData<RankListV2Response.RankInfo> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLIIIILZ = new C77955Uid(this.LJLJL, this.LJLJJLL, this);
        RankListController rankListController = this.LJLJJLL;
        if (rankListController != null && (LJII = rankListController.LJII()) != null && (mutableLiveData = LJII.LJLJJL) != null) {
            mutableLiveData.observe(this, new AObserverS81S0100000_13(this, 44));
        }
    }
}
