package com.bytedance.android.livesdk.pip;

import X.B83;
import X.BJW;
import X.BY6;
import X.BZI;
import X.C011602u;
import X.C15380j0;
import X.C162476Zf;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29025BaH;
import X.C29028BaK;
import X.C29036BaS;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29800Bmm;
import X.C41071jL;
import X.CN1;
import X.EnumC28583BJr;
import X.InterfaceC29882Bo6;
import X.InterfaceC30442Bx8;
import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS206S0100000_5;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.live.gift.IHotWordGiftService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelGlobalEvent;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftSettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveHostIModerateEntranceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveScreenTimeEntranceSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.watch.LiveWatchSettingPageOpenEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ShareSettingsDialog extends LiveDialogFragment {
    public static final String LJLJL = C16880lQ.LJLLJ(ShareSettingsDialog.class);
    public ConstraintLayout LJLIL;
    public C41071jL LJLILLLLZI;
    public FrameLayout LJLJI;
    public View LJLJJI;
    public C41071jL LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return new BY6(R.layout.dic);
    }

    public final void vl() {
        C29800Bmm gr;
        if (!UserLevelEnableSetting.INSTANCE.getValue() || C29306Beo.LJIIJ(this.dataChannel)) {
            ConstraintLayout constraintLayout = this.LJLIL;
            if (constraintLayout == null) {
                return;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29028BaK.class);
        if (l != null) {
            long longValue = l.longValue();
            boolean z = true;
            if (longValue >= EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_HIDE.getValue()) {
                ConstraintLayout constraintLayout2 = this.LJLIL;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                C41071jL c41071jL = this.LJLILLLLZI;
                if (c41071jL != null) {
                    if (longValue != EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_ON.getValue()) {
                        z = false;
                    }
                    c41071jL.setChecked(z);
                }
            } else {
                IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
                if (iUserLevelService != null && (gr = iUserLevelService.gr()) != null) {
                    ConstraintLayout constraintLayout3 = this.LJLIL;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(0);
                    }
                    int i = gr.LJFF;
                    C41071jL c41071jL2 = this.LJLILLLLZI;
                    if (c41071jL2 != null) {
                        if (i == 2) {
                            z = false;
                        }
                        c41071jL2.setChecked(z);
                    }
                }
            }
        }
        FrameLayout frameLayout = this.LJLJI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS25S0100000_5(this, 224));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        int i2;
        int LIZ;
        boolean LJIILLIIL = C15380j0.LJIILLIIL();
        if (LJIILLIIL) {
            i = R.style.rr;
            i2 = 80;
        } else {
            i = R.style.rs;
            i2 = 5;
        }
        int i3 = -1;
        if (LJIILLIIL) {
            LIZ = -1;
            if (LJIILLIIL) {
                i3 = -2;
            } else if (LJIILLIIL) {
                throw new C162476Zf();
            }
        } else {
            LIZ = C15380j0.LIZ(490.0f);
        }
        C28507BGt c28507BGt = new C28507BGt(R.layout.dic);
        c28507BGt.LIZJ = i;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = i2;
        c28507BGt.LJIIIZ = LIZ;
        c28507BGt.LJIIJ = i3;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        int i2;
        long j;
        User owner;
        C29800Bmm gr;
        View _$_findCachedViewById;
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (ConstraintLayout) view.findViewById(R.id.fnk);
        this.LJLILLLLZI = (C41071jL) view.findViewById(R.id.kxl);
        this.LJLJI = (FrameLayout) view.findViewById(R.id.fq3);
        this.LJLJJI = view.findViewById(R.id.aaq);
        this.LJLJJL = (C41071jL) view.findViewById(R.id.aas);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Long l = (Long) dataChannelGlobal.mv0(C29025BaH.class);
        int i3 = 0;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > BJW.RANK_SWITCH_STATUS_HIDE.getValue()) {
                _$_findCachedViewById(R.id.fne).setVisibility(0);
                C011602u c011602u = (C011602u) _$_findCachedViewById(R.id.kxu);
                if (longValue == BJW.RANK_SWITCH_STATUS_ON.getValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c011602u.setChecked(z2);
                C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.in7), new ACListenerS25S0100000_5(this, 17));
            }
        }
        if (!C15380j0.LJIILLIIL()) {
            view.findViewById(R.id.gbi).setBackgroundResource(R.drawable.cgr);
        }
        dataChannelGlobal.nv0(this, this, UserLevelGlobalEvent.class, new AqS171S0100000_5(this, 464));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(LiveWatchSettingPageOpenEvent.class);
        }
        vl();
        if (((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Lq0() || ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).P10() == 1 || ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).P10() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && (room = (Room) dataChannelGlobal.mv0(C29044Baa.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.enableGift) {
            ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).k90();
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.dtg), new ACListenerS25S0100000_5(this, 225));
            _$_findCachedViewById(R.id.dtg).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.dtg).setVisibility(8);
        }
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.s0.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_SHARE_SETTING_GIFT_LIMIT_RED_DOT.value");
            if (LIZJ.booleanValue() && (_$_findCachedViewById = _$_findCachedViewById(R.id.dth)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById);
            }
        }
        if (!C15380j0.LJIILLIIL()) {
            C29306Beo.LJI(_$_findCachedViewById(R.id.dtg));
        }
        if (!o.LJ(dataChannelGlobal.mv0(C29036BaS.class), "setting")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_user_setting");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(dataChannelGlobal.mv0(C29036BaS.class), "entrance");
            LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
            IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
            if (iUserLevelService != null && (gr = iUserLevelService.gr()) != null) {
                i2 = gr.LIZ;
            } else {
                i2 = 0;
            }
            LIZ.LJIJJ(Integer.valueOf(i2), "user_level");
            Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room2 != null && (owner = room2.getOwner()) != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j), "anchor_id");
            LIZ.LJIJJ(Integer.valueOf(HotWordGiftSettings.INSTANCE.isEnabled() ? 1 : 0), "is_comment_suggested_gift_show");
            LIZ.LJJIIJZLJL();
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.be2);
        if (C15380j0.LJIILLIIL() && LiveScreenTimeEntranceSetting.INSTANCE.getValue()) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById2.setVisibility(i);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.be2), new ACListenerS25S0100000_5(this, 226));
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.bd4);
        if (!C15380j0.LJIILLIIL() || !LiveHostIModerateEntranceSetting.INSTANCE.showEntrance()) {
            i3 = 8;
        }
        _$_findCachedViewById3.setVisibility(i3);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.bd4), new ACListenerS25S0100000_5(this, 227));
        if (HotWordGiftSettings.INSTANCE.isEnabled()) {
            IHotWordGiftService iHotWordGiftService = (IHotWordGiftService) CN1.LIZ(IHotWordGiftService.class);
            C29306Beo.LJJLJLI(this.LJLJJI);
            C41071jL c41071jL = this.LJLJJL;
            if (c41071jL != null) {
                c41071jL.setChecked(iHotWordGiftService.isUserEnabled());
            }
            C41071jL c41071jL2 = this.LJLJJL;
            if (c41071jL2 != null) {
                c41071jL2.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(iHotWordGiftService, 0));
                return;
            }
            return;
        }
        C29306Beo.LJI(this.LJLJJI);
    }
}
