package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.BC4;
import X.BCG;
import X.BZI;
import X.C011602u;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C2E0;
import X.C3C5;
import X.C43881HKb;
import X.C51029K0z;
import X.C5H3;
import X.C72818Shy;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.FilterCommentChangeEvent;
import com.bytedance.android.livesdk.dataChannel.MuteDurationEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateEnlargeSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCommentSettingFragment extends BaseFragment {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 93));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 92));
    public final BC4 LJLJJLL = new BC4(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final boolean Al() {
        return ((Boolean) this.LJLILLLLZI.getValue()).booleanValue();
    }

    public final Map vl() {
        long j;
        String str;
        HashMap hashMap = new HashMap();
        Room xl = xl();
        if (xl != null) {
            j = xl.getId();
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

    public final Room xl() {
        return (Room) this.LJLIL.getValue();
    }

    public final void Gl() {
        String str;
        Room xl;
        StarCommentConfig starCommentConfig;
        String str2;
        LiveMode streamType;
        LiveMode liveMode;
        StarCommentConfig starCommentConfig2;
        Context context = getContext();
        if (context != null) {
            Uri uri = UriProtector.parse(LiveStarCommentSchemaConfig.INSTANCE.getSettingValue().anchor_settings_scheme);
            View view = getView();
            if (view != null) {
                int height = view.getHeight();
                if (UriProtector.getQueryParameter(uri, "height") != null) {
                    o.LJIIIIZZ(uri, "uri");
                    uri = C29306Beo.LJJIJL(uri, "height", String.valueOf(((int) C15380j0.LJIJ(height)) + 1));
                } else {
                    uri = uri.buildUpon().appendQueryParameter("height", String.valueOf(((int) C15380j0.LJIJ(height)) + 1)).build();
                }
            }
            Uri.Builder buildUpon = uri.buildUpon();
            boolean LJ = o.LJ(this.LJLJJI, "from_page_preview");
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (!LJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            buildUpon.appendQueryParameter("is_living", str);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.kc9);
            if (_$_findCachedViewById != null && C29306Beo.LJJIIJ(_$_findCachedViewById)) {
                str3 = "1";
            }
            buildUpon.appendQueryParameter("from_reddot", str3);
            if (o.LJ(this.LJLJJI, "from_page_preview") && this.LJLJJL) {
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                if (LJIILIIL != null && (starCommentConfig2 = (StarCommentConfig) LJIILIIL.kv0(C2E0.class)) != null) {
                    buildUpon.appendQueryParameter("star_comment_switch", String.valueOf(starCommentConfig2.starCommentSwitch));
                    buildUpon.appendQueryParameter("grant_group", String.valueOf(starCommentConfig2.grantGroup));
                    buildUpon.appendQueryParameter("grant_level", String.valueOf(starCommentConfig2.grantLevel));
                }
            } else if (!o.LJ(this.LJLJJI, "from_page_preview") && (xl = xl()) != null && (starCommentConfig = xl.starCommentConfig) != null) {
                buildUpon.appendQueryParameter("star_comment_switch", String.valueOf(starCommentConfig.starCommentSwitch));
                buildUpon.appendQueryParameter("grant_group", String.valueOf(starCommentConfig.grantGroup));
                buildUpon.appendQueryParameter("grant_level", String.valueOf(starCommentConfig.grantLevel));
            }
            if (o.LJ(this.LJLJJI, "from_page_preview")) {
                buildUpon.appendQueryParameter("enter_from", "golive_page");
                DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
                if (LJIILIIL2 == null || (liveMode = (LiveMode) LJIILIIL2.kv0(LiveModeChannel.class)) == null) {
                    liveMode = LiveMode.VIDEO;
                }
                buildUpon.appendQueryParameter("live_type", C28509BGv.LIZ(liveMode));
            } else {
                buildUpon.appendQueryParameter("enter_from", "setting_page");
                Room xl2 = xl();
                if (xl2 != null && (streamType = xl2.getStreamType()) != null) {
                    str2 = C28509BGv.LIZ(streamType);
                } else {
                    str2 = "";
                }
                buildUpon.appendQueryParameter("live_type", str2);
            }
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, buildUpon.build());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
        C72818Shy.LJII("star_comment_setting_event", this.LJLJJLL);
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public final void wl() {
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

    public final void Dl(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        StarCommentConfig starCommentConfig;
        Room xl;
        StarCommentConfig starCommentConfig2;
        Room xl2;
        StarCommentConfig starCommentConfig3;
        RoomCreateInfo roomCreateInfo;
        String str;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.d9n);
        int i5 = 8;
        if (z && (Al() || o.LJ(this.LJLJJI, "from_page_preview"))) {
            BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_filter_access_view");
            LIZ.LJIIZILJ();
            if (Al()) {
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
        if (xl() == null || LiveAutoTranslateEnlargeSetting.getValue() == 0 || !Al()) {
            _$_findCachedViewById(R.id.aaw).setVisibility(8);
        }
        if (z) {
            if (o.LJ(this.LJLJJI, "from_page_preview")) {
                View _$_findCachedViewById5 = _$_findCachedViewById(R.id.kc2);
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                if (LJIILIIL != null && (roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class)) != null && roomCreateInfo.anchorStarCommentPermission) {
                    i5 = 0;
                }
                _$_findCachedViewById5.setVisibility(i5);
                return;
            }
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.kc2);
            if (Al() && (xl2 = xl()) != null && (starCommentConfig3 = xl2.starCommentConfig) != null && starCommentConfig3.starCommentQualification) {
                i5 = 0;
            }
            _$_findCachedViewById6.setVisibility(i5);
            Room xl3 = xl();
            if (xl3 == null || (starCommentConfig = xl3.starCommentConfig) == null || starCommentConfig.starCommentQualification || (xl = xl()) == null || (starCommentConfig2 = xl.starCommentConfig) == null || !starCommentConfig2.displayLock) {
                return;
            }
            _$_findCachedViewById(R.id.kc2).setVisibility(0);
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.kc2).findViewById(R.id.kc3);
            C15490jB.LIZJ(imageView, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_pin.png"));
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(0);
            return;
        }
        _$_findCachedViewById(R.id.kc2).setVisibility(8);
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
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (view.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
            view.setLayoutParams(layoutParams);
        }
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), new ACListenerS25S0100000_5(this, 48));
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
        if (xl() != null && LiveAutoTranslateEnlargeSetting.getValue() != 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_translation_show");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
            LIZ.LJJIFFI(vl());
            LIZ.LJJIIJZLJL();
        }
        c011602u.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 2));
        C011602u c011602u2 = (C011602u) _$_findCachedViewById(R.id.bkb);
        if (C29306Beo.LJJII(C51029K0z.LJIILIIL(this))) {
            LJJ = true;
        } else {
            Room xl = xl();
            if (xl != null && (roomAuthStatus = xl.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.enableChat);
            } else {
                bool = null;
            }
            LJJ = C29306Beo.LJJ(bool);
        }
        c011602u2.setChecked(LJJ);
        Dl(c011602u2.isChecked());
        c011602u2.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 3));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.am9), new ACListenerS25S0100000_5(this, 49));
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ2 = InterfaceC30442Bx8.LL.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_MANAGE_TEMPORA…UTE_SETTING_RED_DOT.value");
            if (LIZJ2.booleanValue() && (_$_findCachedViewById3 = _$_findCachedViewById(R.id.l2j)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById3);
            }
        }
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.l2i), new ACListenerS25S0100000_5(this, 50));
        register(((IUserManageService) CN1.LIZ(IUserManageService.class)).af0().LJJIFFI(new AfS57S0100000_5(this, 31)));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, MuteDurationEvent.class, new AqS171S0100000_5(this, 111));
        wl();
        dataChannelGlobal.nv0(this, this, FilterCommentChangeEvent.class, new AqS171S0100000_5(this, 109));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.d9n), new ACListenerS25S0100000_5(this, 46));
        if (o.LJ(this.LJLJJI, "from_page_preview")) {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class)) != null && roomCreateInfo.anchorStarCommentPermission && !o.LJ(InterfaceC30442Bx8.LLD.LIZJ().get("2"), Boolean.FALSE) && (_$_findCachedViewById2 = _$_findCachedViewById(R.id.kc9)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById2);
            }
        } else {
            Room xl2 = xl();
            if (xl2 != null && (starCommentConfig = xl2.starCommentConfig) != null && starCommentConfig.starCommentQualification && !o.LJ(InterfaceC30442Bx8.LLD.LIZJ().get("2"), Boolean.FALSE) && (_$_findCachedViewById = _$_findCachedViewById(R.id.kc9)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById);
            }
        }
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.kc2), new BCG(new ACListenerS25S0100000_5(this, 47)));
        C72818Shy.LIZLLL("star_comment_setting_event", this.LJLJJLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d0o, viewGroup, false);
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
