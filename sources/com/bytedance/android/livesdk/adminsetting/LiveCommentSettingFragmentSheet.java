package com.bytedance.android.livesdk.adminsetting;

import X.BC5;
import X.BCG;
import X.BZI;
import X.C011602u;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C30161Gi;
import X.C43881HKb;
import X.C51029K0z;
import X.C5H3;
import X.C72818Shy;
import X.C76800UCe;
import X.C78496UrM;
import X.C78996UzQ;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.FilterCommentChangeEvent;
import com.bytedance.android.livesdk.dataChannel.MuteDurationEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateEnlargeSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import q03.IDaS485S0100000_5;

/* loaded from: classes6.dex */
public final class LiveCommentSettingFragmentSheet extends LiveSheetFragment {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLFF;
    public String LLFFF;
    public boolean LLFZ;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public final C5H3 LLD = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 95));
    public final C5H3 LLF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 94));
    public boolean LLFII = true;
    public final BC5 LLI = new BC5(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.mg1));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    public final Map Ml() {
        long j;
        String str;
        HashMap hashMap = new HashMap();
        Room Ol = Ol();
        if (Ol != null) {
            j = Ol.getId();
        } else {
            j = 0;
        }
        C43881HKb.LIZJ(j, hashMap, "room_id", "type", "global_default_on");
        Boolean LIZJ = InterfaceC30442Bx8.x0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
        if (LIZJ.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        hashMap.put("from_status", str);
        hashMap.put("position", "panel");
        return hashMap;
    }

    public final Room Ol() {
        return (Room) this.LLD.getValue();
    }

    public final boolean Pl() {
        return ((Boolean) this.LLF.getValue()).booleanValue();
    }

    public final void Nl() {
        Resources resources;
        int i;
        TextView textView = (TextView) _$_findCachedViewById(R.id.d9o);
        Boolean LIZJ = InterfaceC30442Bx8.X0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_COMMENT_FILTER_SWITCH_L2_FILTER.value");
        if (!LIZJ.booleanValue()) {
            Boolean LIZJ2 = InterfaceC30442Bx8.Y0.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_COMMENT_FILTER_SWITCH_COMMUNITY_FLAGGED.value");
            if (!LIZJ2.booleanValue()) {
                resources = getResources();
                i = R.string.l8h;
                textView.setText(resources.getText(i));
            }
        }
        resources = getResources();
        i = R.string.l8i;
        textView.setText(resources.getText(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
        C72818Shy.LJII("star_comment_setting_event", this.LLI);
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    public final void Ql(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Room Ol;
        StarCommentConfig starCommentConfig;
        RoomCreateInfo roomCreateInfo;
        String str;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.d9n);
        int i5 = 0;
        if (z && (Pl() || o.LJ(this.LLFFF, "from_page_preview"))) {
            BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_filter_access_view");
            LIZ.LJIIZILJ();
            if (Pl()) {
                str = "anchor";
            } else {
                str = "admin";
            }
            LIZ.LJIJJ(str, "admin_type");
            LIZ.LJJIIJZLJL();
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.l2i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        _$_findCachedViewById2.setVisibility(i2);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.am9);
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        _$_findCachedViewById3.setVisibility(i3);
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.aaw);
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        _$_findCachedViewById4.setVisibility(i4);
        if (Ol() == null || LiveAutoTranslateEnlargeSetting.getValue() == 0 || !Pl()) {
            _$_findCachedViewById(R.id.aaw).setVisibility(8);
        }
        if (z) {
            if (o.LJ(this.LLFFF, "from_page_preview")) {
                View _$_findCachedViewById5 = _$_findCachedViewById(R.id.kc2);
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                if (LJIILIIL == null || (roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class)) == null || !roomCreateInfo.anchorStarCommentPermission) {
                    i5 = 8;
                }
                _$_findCachedViewById5.setVisibility(i5);
                return;
            }
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.kc2);
            if (!Pl() || (Ol = Ol()) == null || (starCommentConfig = Ol.starCommentConfig) == null || !starCommentConfig.starCommentQualification) {
                i5 = 8;
            }
            _$_findCachedViewById6.setVisibility(i5);
            return;
        }
        _$_findCachedViewById(R.id.kc2).setVisibility(8);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d0p, viewGroup, false, "inflater.inflate(\n      …          false\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        boolean LJJ;
        RoomAuthStatus roomAuthStatus;
        StarCommentConfig starCommentConfig;
        View _$_findCachedViewById;
        RoomCreateInfo roomCreateInfo;
        View _$_findCachedViewById2;
        View _$_findCachedViewById3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        int value = LiveAutoTranslateEnlargeSetting.getValue();
        if (value != 0) {
            if (value == 1) {
                ((TextView) _$_findCachedViewById(R.id.lk3)).setText(getString(R.string.kne));
            }
        } else {
            _$_findCachedViewById(R.id.aaw).setVisibility(8);
        }
        C011602u c011602u = (C011602u) _$_findCachedViewById(R.id.aav);
        Boolean LIZJ = InterfaceC30442Bx8.x0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
        c011602u.setChecked(LIZJ.booleanValue());
        if (Ol() != null && LiveAutoTranslateEnlargeSetting.getValue() != 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_translation_show");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
            LIZ.LJJIFFI(Ml());
            LIZ.LJJIIJZLJL();
        }
        c011602u.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 4));
        C011602u c011602u2 = (C011602u) _$_findCachedViewById(R.id.bkb);
        if (o.LJ(this.LLFFF, "from_page_preview")) {
            LJJ = this.LLFII;
        } else {
            Room Ol = Ol();
            if (Ol != null && (roomAuthStatus = Ol.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.enableChat);
            } else {
                bool = null;
            }
            LJJ = C29306Beo.LJJ(bool);
        }
        c011602u2.setChecked(LJJ);
        Ql(c011602u2.isChecked());
        c011602u2.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 5));
        View block_keywords_group = _$_findCachedViewById(R.id.am9);
        o.LJIIIIZZ(block_keywords_group, "block_keywords_group");
        C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 0), block_keywords_group);
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ2 = InterfaceC30442Bx8.LL.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_MANAGE_TEMPORA…UTE_SETTING_RED_DOT.value");
            if (LIZJ2.booleanValue() && (_$_findCachedViewById3 = _$_findCachedViewById(R.id.l2j)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById3);
            }
        }
        View temporary_mute_group = _$_findCachedViewById(R.id.l2i);
        o.LJIIIIZZ(temporary_mute_group, "temporary_mute_group");
        C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 1), temporary_mute_group);
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).af0().LJJIFFI(new AfS57S0100000_5(this, 32));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, MuteDurationEvent.class, new AqS171S0100000_5(this, 112));
        Nl();
        dataChannelGlobal.nv0(this, this, FilterCommentChangeEvent.class, new AqS171S0100000_5(this, 113));
        View filter_comments_group = _$_findCachedViewById(R.id.d9n);
        o.LJIIIIZZ(filter_comments_group, "filter_comments_group");
        C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 2), filter_comments_group);
        if (o.LJ(this.LLFFF, "from_page_preview")) {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class)) != null && roomCreateInfo.anchorStarCommentPermission && !o.LJ(InterfaceC30442Bx8.LLD.LIZJ().get("2"), Boolean.FALSE) && (_$_findCachedViewById2 = _$_findCachedViewById(R.id.kc9)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById2);
            }
        } else {
            Room Ol2 = Ol();
            if (Ol2 != null && (starCommentConfig = Ol2.starCommentConfig) != null && starCommentConfig.starCommentQualification && !o.LJ(InterfaceC30442Bx8.LLD.LIZJ().get("2"), Boolean.FALSE) && (_$_findCachedViewById = _$_findCachedViewById(R.id.kc9)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById);
            }
        }
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.kc2), new BCG(new ACListenerS25S0100000_5(this, 51)));
        C72818Shy.LIZLLL("star_comment_setting_event", this.LLI);
    }
}
