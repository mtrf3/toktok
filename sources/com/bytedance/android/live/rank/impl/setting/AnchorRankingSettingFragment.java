package com.bytedance.android.live.rank.impl.setting;

import X.BJV;
import X.BJW;
import X.BJY;
import X.BJZ;
import X.C16880lQ;
import X.C221108m2;
import X.C28366BBi;
import X.C28566BJa;
import X.C28571BJf;
import X.C41081jM;
import X.C62822Ol8;
import X.CN1;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnchorRankingSettingFragment extends BaseRankSettingFragment {
    public static final /* synthetic */ int LJLJL = 0;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 66));

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Room Il() {
        return (Room) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final BJW vl() {
        long j;
        RoomAuthStatus roomAuthStatus;
        BJV bjv = BJW.Companion;
        Room Il = Il();
        if (Il != null && (roomAuthStatus = Il.mRoomAuthStatus) != null) {
            j = roomAuthStatus.ecRankSwitchStatus;
        } else {
            j = 0;
        }
        bjv.getClass();
        return BJV.LIZ(j);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final BJW wl() {
        long j;
        RoomAuthStatus roomAuthStatus;
        BJV bjv = BJW.Companion;
        Room Il = Il();
        if (Il != null && (roomAuthStatus = Il.mRoomAuthStatus) != null) {
            j = roomAuthStatus.gamerankingswitch;
        } else {
            j = 0;
        }
        bjv.getClass();
        return BJV.LIZ(j);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final BJW xl() {
        long j;
        RoomAuthStatus roomAuthStatus;
        BJV bjv = BJW.Companion;
        Room Il = Il();
        if (Il != null && (roomAuthStatus = Il.mRoomAuthStatus) != null) {
            j = roomAuthStatus.getGiftRankSwitchStatus();
        } else {
            j = 0;
        }
        bjv.getClass();
        return BJV.LIZ(j);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void Dl(BJW value) {
        BJW bjw;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.cko)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        ((IRankService) CN1.LIZ(IRankService.class)).fp0();
        C28571BJf.LJFF(10L, bjw.getValue(), new BJY(this, bjw));
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void Gl(BJW value) {
        BJW bjw;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.dqr)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        ((IRankService) CN1.LIZ(IRankService.class)).fp0();
        C28571BJf.LJFF(13L, bjw.getValue(), new BJZ(this, bjw));
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void Hl(BJW value) {
        BJW bjw;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.duo)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        ((IRankService) CN1.LIZ(IRankService.class)).fp0().LJII(getContext(), 5L, bjw.getValue(), true, new C28566BJa(this, bjw));
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("no_back");
        } else {
            z = false;
        }
        if (!z) {
            C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.aeg), new C28366BBi(this));
        } else {
            ((ImageView) _$_findCachedViewById(R.id.aeg)).setVisibility(8);
        }
    }
}
