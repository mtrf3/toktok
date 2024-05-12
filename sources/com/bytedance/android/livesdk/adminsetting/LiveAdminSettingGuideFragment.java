package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.BBP;
import X.BZI;
import X.C0Y4;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28427BDr;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C3C5;
import X.C41071jL;
import X.C44384HbQ;
import X.C47121t6;
import X.C48459J0d;
import X.C51029K0z;
import X.C5H3;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CN1;
import X.InterfaceC30442Bx8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAdminSettingGuideFragment extends BaseFragment implements View.OnClickListener {
    public C47121t6 LJLILLLLZI;
    public C47121t6 LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public C41071jL LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 82));

    public final boolean vl() {
        return ((Boolean) this.LJLIL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BZI LIZ = C28787BRn.LIZ("livesdk_earphone_monitor_effective_switch");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIJJ(Integer.valueOf(Boolean.compare(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getEchoHelper().LIZ(), false)), "earphone_status");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        BBP bbp;
        String str;
        Room room;
        LiveMode streamType;
        o.LJIIIZ(v, "v");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            int id = v.getId();
            if (id == R.id.ge4) {
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_admin_list_click");
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_moderator_icon");
                LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(this));
                LIZ2.LJIIJJI("live_take_detail");
                LIZ2.LJIJJ("video_live", "live_type");
                LIZ2.LJIJJ("click", "action_type");
                LIZ2.LJJIIJZLJL();
                InterfaceC30442Bx8.LJJL.LIZ(Boolean.FALSE);
                C29306Beo.LJI(this.LJLJJI);
                bbp = BBP.MODERATOR_LIST;
            } else if (id == R.id.guq) {
                C0Y4.LIZ("livesdk_anchor_mute_list_click");
                bbp = BBP.MUTE;
            } else if (id == R.id.feh) {
                C0Y4.LIZ("livesdk_anchor_blocked_list_click");
                bbp = BBP.BLOCK;
            } else if (id == R.id.blp) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_comment_settings_click");
                LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(this));
                DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
                if (LJIILIIL2 != null && (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
                    str = streamType.logStreamingType;
                } else {
                    str = null;
                }
                LIZ3.LJIJ(str);
                LIZ3.LJJIIJZLJL();
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJZI;
                Boolean bool = Boolean.FALSE;
                c48459J0d.LIZ(bool);
                C48459J0d<Map<String, Boolean>> c48459J0d2 = InterfaceC30442Bx8.LLD;
                Map<String, Boolean> LIZJ = c48459J0d2.LIZJ();
                LIZJ.put("1", bool);
                c48459J0d2.LIZ(LIZJ);
                C29306Beo.LJI(this.LJLJJL);
                bbp = BBP.COMMENT_SETTING;
            } else {
                if (id != R.id.in6) {
                    return;
                }
                BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_ranking_icon_click");
                LIZ4.LJIILLIIL(C51029K0z.LJIILIIL(this));
                LIZ4.LJJIIJZLJL();
                bbp = BBP.LIVE_RANK_SWITCH;
            }
            bbp.next();
            LJIILIIL.rv0(BroadcastDialogPageChannel.class, bbp);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Room room;
        boolean z;
        boolean z2;
        boolean z3;
        RoomAuthStatus roomAuthStatus;
        StarCommentConfig starCommentConfig;
        View view2;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_set_page_show");
        LIZ.LJIIZILJ();
        if (C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(C51029K0z.LJIILIIL(this))))) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.mo6);
        this.LJLJI = (C47121t6) view.findViewById(R.id.desc);
        this.LJLJJI = view.findViewById(R.id.glb);
        this.LJLJJL = view.findViewById(R.id.blq);
        this.LJLJJLL = view.findViewById(R.id.cla);
        this.LJLJL = view.findViewById(R.id.in6);
        this.LJLJLJ = view.findViewById(R.id.blp);
        this.LJLJLLL = view.findViewById(R.id.ge4);
        this.LJLL = view.findViewById(R.id.guq);
        this.LJLLI = view.findViewById(R.id.feh);
        this.LJLLILLLL = (C41071jL) view.findViewById(R.id.cl_);
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            if (vl()) {
                i = R.string.me4;
            } else {
                i = R.string.npr;
            }
            c47121t6.setText(i);
        }
        LiveRedDotOfflineEnableSetting liveRedDotOfflineEnableSetting = LiveRedDotOfflineEnableSetting.INSTANCE;
        if (!liveRedDotOfflineEnableSetting.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.LJJL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_ROOM_MODERATOR_SETTING_RED_DOT.value");
            if (LIZJ.booleanValue()) {
                C29306Beo.LJJLJLI(this.LJLJJI);
            }
        }
        if (!liveRedDotOfflineEnableSetting.getValue()) {
            Boolean LIZJ2 = InterfaceC30442Bx8.LJZI.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_ROOM_COMMENT_SETTING_RED_DOT.value");
            if (LIZJ2.booleanValue()) {
                C29306Beo.LJJLJLI(this.LJLJJL);
            }
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            room = (Room) LJIILIIL.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        int i2 = 0;
        if (room != null && (starCommentConfig = room.starCommentConfig) != null && starCommentConfig.starCommentQualification && !o.LJ(InterfaceC30442Bx8.LLD.LIZJ().get("1"), Boolean.FALSE) && (view2 = this.LJLJJL) != null) {
            C29306Beo.LJJLJLI(view2);
        }
        View view3 = this.LJLJLJ;
        if (vl() || C28427BDr.LIZ(1)) {
            z = true;
        } else {
            z = false;
        }
        C29306Beo.LJJLIIIJJI(view3, z);
        View view4 = this.LJLL;
        if (vl() || C28427BDr.LIZ(2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C29306Beo.LJJLIIIJJI(view4, z2);
        View view5 = this.LJLLI;
        if (vl() || C28427BDr.LIZ(3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        C29306Beo.LJJLIIIJJI(view5, z3);
        View view6 = this.LJLJL;
        if (view6 != null) {
            if ((room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.getGiftRankSwitchStatus() == 0) || !vl()) {
                i2 = 8;
            }
            view6.setVisibility(i2);
        }
        View view7 = this.LJLJLJ;
        if (view7 != null) {
            C16880lQ.LJIIJ(this, view7);
        }
        View view8 = this.LJLJLLL;
        if (view8 != null) {
            C16880lQ.LJIIJ(this, view8);
        }
        View view9 = this.LJLJL;
        if (view9 != null) {
            C16880lQ.LJIIJ(this, view9);
        }
        View view10 = this.LJLL;
        if (view10 != null) {
            C16880lQ.LJIIJ(this, view10);
        }
        View view11 = this.LJLLI;
        if (view11 != null) {
            C16880lQ.LJIIJ(this, view11);
        }
        if (C44384HbQ.LJJIJIIJI()) {
            C29306Beo.LJI(this.LJLJI);
            C29306Beo.LJJLJLI(this.LJLJJLL);
        }
        C41071jL c41071jL = this.LJLLILLLL;
        if (c41071jL != null) {
            c41071jL.setChecked(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getEchoHelper().LIZ());
        }
        C41071jL c41071jL2 = this.LJLLILLLL;
        if (c41071jL2 != null) {
            C29306Beo.LJJJLL(c41071jL2, 500L, new AqS171S0100000_5(this, 108));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        if (C44384HbQ.LJJIJ()) {
            i = R.layout.cyl;
        } else if (C44384HbQ.LJJIJIIJI()) {
            i = R.layout.cyi;
        } else {
            i = R.layout.cyk;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
