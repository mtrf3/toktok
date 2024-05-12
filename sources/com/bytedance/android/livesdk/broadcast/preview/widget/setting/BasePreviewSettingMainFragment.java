package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.ActivityC45651qj;
import X.B83;
import X.BHK;
import X.BHW;
import X.BHZ;
import X.BII;
import X.BZI;
import X.C03880Dg;
import X.C06490Nh;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C199097rd;
import X.C221108m2;
import X.C28491BGd;
import X.C28507BGt;
import X.C28509BGv;
import X.C28527BHn;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C3C5;
import X.C40517FvF;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C72818Shy;
import X.C76800UCe;
import X.C77437UaH;
import X.C78977Uz7;
import X.C90903hW;
import X.CN1;
import X.CXJ;
import X.DialogC77438UaI;
import X.InterfaceC29405BgP;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.OSZ;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS159S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.ViolationStatusChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public final class BasePreviewSettingMainFragment extends BasePreviewFragment implements InterfaceC72822Si2 {
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLJJL = true;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 146));

    /* loaded from: classes6.dex */
    public static final class NotionFragment extends LiveDialogFragment {
        public final Map<Integer, View> LJLIL = new LinkedHashMap();

        @Override // com.bytedance.android.livesdk.LiveDialogFragment
        public final void _$_clearFindViewByIdCache() {
            ((LinkedHashMap) this.LJLIL).clear();
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment
        public final View _$_findCachedViewById(int i) {
            View findViewById;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

        @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public final /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            _$_clearFindViewByIdCache();
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment
        public final C28507BGt createParams() {
            C28507BGt c28507BGt = new C28507BGt(R.layout.dib);
            c28507BGt.LJII = 80;
            c28507BGt.LJIIJ = -1;
            c28507BGt.LJIIIZ = -1;
            return c28507BGt;
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            o.LJIIIZ(view, "view");
            super.onViewCreated(view, bundle);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 113), _$_findCachedViewById(R.id.cbx));
            C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.bfp), new ACListenerS25S0100000_5(this, 114));
        }
    }

    public static void xl(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "-2656638566760703452")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Map<String, String> vl() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(B83.LIZ().LIZIZ().getCurrentUserId()));
        hashMap.put("event_page", "live_take_page");
        return hashMap;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
        C72818Shy.LJII("live_goal_update_event", this);
    }

    public final void Dl(String str) {
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("action_type", "click"), new OSZ("click_type", str));
        BZI LIZ = C28787BRn.LIZ("gpppa_popup");
        LIZ.LJIIZILJ();
        LIZ.LJIIJJI("start_broadcast");
        LIZ.LJIIJ("start_broadcast");
        LIZ.LJIIIZ("live");
        LIZ.LJIIL("click");
        LIZ.LJJIFFI(LJJJLZIJ);
        LIZ.LJJIIJZLJL();
    }

    public final void Gl(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_moderator_icon");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIIJJI("live_take_page");
        int i = C28491BGd.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "third_party";
            } else {
                str2 = "screen_share";
            }
        } else {
            str2 = "video_live";
        }
        C06490Nh.LIZLLL(LIZ, str2, "live_type", str, "action_type");
    }

    public final void Hl(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_title_cover_icon");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIIJJI("live_take_page");
        int i = C28491BGd.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "third_party";
            } else {
                str2 = "screen_share";
            }
        } else {
            str2 = "video_live";
        }
        C06490Nh.LIZLLL(LIZ, str2, "live_type", str, "action_type");
    }

    public final void Il(boolean z) {
        Text text;
        ViolationStatusResponse.ResponseData responseData;
        PerceptionDialogInfo perceptionDialogInfo;
        if (z) {
            ((TextView) _$_findCachedViewById(R.id.dsw)).setEnabled(false);
            ((ImageView) _$_findCachedViewById(R.id.dsu)).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.dsx)).setTextColor(C15380j0.LIZIZ(R.color.cn));
            TextView textView = (TextView) _$_findCachedViewById(R.id.dst);
            textView.setTextColor(C15380j0.LIZIZ(R.color.cn));
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (responseData = (ViolationStatusResponse.ResponseData) LJIILIIL.kv0(ViolationStatusChannel.class)) != null && (perceptionDialogInfo = responseData.perceptionDialog) != null) {
                text = perceptionDialogInfo.subTitle;
            } else {
                text = null;
            }
            textView.setText(CXJ.LJFF(text, "").toString());
        }
    }

    public final void Jl(int i) {
        String string = getString(R.string.k88);
        o.LJIIIIZZ(string, "getString(R.string.pm_ag…t_unavailable_modal_desc)");
        String str = "";
        if (i != 5) {
            if (i == 8) {
                string = getString(R.string.k88);
                o.LJIIIIZZ(string, "getString(R.string.pm_ag…t_unavailable_modal_desc)");
                str = getString(R.string.k89);
                o.LJIIIIZZ(str, "getString(R.string.pm_ag…_unavailable_modal_title)");
            }
        } else {
            String string2 = getString(R.string.k5l);
            o.LJIIIIZZ(string2, "getString(R.string.pm_ag…VE_receiveGiftModal_desc)");
            string = ujb.o.LJJJJZ(string2, "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
        }
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LJJII = true;
        c77437UaH.LJI = string;
        c77437UaH.LIZJ = str;
        c77437UaH.LJ(R.string.spm, new IDCListenerS159S0100000_5(this, 0), false);
        c77437UaH.LIZJ(R.string.spn, BHK.LJLIL, false);
        xl(c77437UaH.LIZ());
    }

    public final void Kl(LiveMode liveMode) {
        String LJIILJJIL;
        DataChannel LJIILIIL;
        DataChannel LJIILIIL2;
        BHZ.Companion.getClass();
        BHZ LIZ = BHW.LIZ(liveMode);
        if (LIZ != null) {
            Hashtag hashtag = LIZ.getHashtag();
            GameTag gameTag = LIZ.getGameTag();
            StringBuffer stringBuffer = new StringBuffer();
            if (hashtag != null && C78977Uz7.LJJJLL(hashtag)) {
                LJIILJJIL = hashtag.title;
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.mnp);
            }
            stringBuffer.append(LJIILJJIL);
            if (gameTag != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" | ");
                LIZ2.append(gameTag.showName);
                stringBuffer.append(X1D.LIZIZ(LIZ2));
            }
            if (_$_findCachedViewById(R.id.li3) != null) {
                ((TextView) _$_findCachedViewById(R.id.li3)).setText(stringBuffer);
            }
            Hashtag hashtag2 = LIZ.getHashtag();
            if (hashtag2 != null && (LJIILIIL2 = C51029K0z.LJIILIIL(this)) != null) {
                LJIILIIL2.rv0(HashtagChangedChannel.class, hashtag2);
            }
            GameTag re = ((IGameTopicService) CN1.LIZ(IGameTopicService.class)).re(liveMode);
            if (re != null && (LJIILIIL = C51029K0z.LJIILIIL(this)) != null) {
                LJIILIIL.rv0(PreviewPagerSelectedGameItem.class, re);
            }
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer num;
        if (o.LJ("live_goal_update_event", c199097rd.LJLIL)) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns, "goalStatus", 0));
            } else {
                num = null;
            }
            int code = BII.ONGOING.getCode();
            if (num == null || num.intValue() != code) {
                int code2 = BII.DELETED.getCode();
                if (num == null || num.intValue() != code2) {
                    return;
                }
                this.LJLJLLL = false;
                return;
            }
            this.LJLJLLL = true;
        }
    }

    public final void wl(C28527BHn c28527BHn) {
        Integer valueOf;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        LiveMode liveMode = null;
        if (LJIILIIL != null) {
            liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class);
        }
        C40517FvF c40517FvF = new C40517FvF(0, 2);
        if (liveMode != null && (valueOf = Integer.valueOf(c28527BHn.LIZ(liveMode))) != null && c40517FvF.LJIILJJIL(valueOf.intValue())) {
            _$_findCachedViewById(R.id.ahr).setVisibility(0);
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.ahr), new ACListenerS25S0100000_5(this, 402));
            if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
                Boolean LIZJ = InterfaceC30442Bx8.LJJLI.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_SHOW_BC_TOGGLE_SETTING_RED_DOT.value");
                if (LIZJ.booleanValue()) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.ahs));
                }
            }
        }
    }

    public final void Al(boolean z, boolean z2) {
        String str;
        LiveMode liveMode;
        Long l;
        String str2;
        OSZ[] oszArr = new OSZ[5];
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        oszArr[0] = new OSZ("send_gift_type", str);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        oszArr[1] = new OSZ("live_type", C28509BGv.LIZ(liveMode));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Long l2 = null;
        if (LIZIZ != null) {
            l = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId());
        } else {
            l = null;
        }
        oszArr[2] = new OSZ("anchor_id", String.valueOf(l));
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[3] = new OSZ("is_gpppa_account", str2);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null) {
            l2 = Long.valueOf(((C29374Bfu) LIZIZ2).getCurrentUserId());
        }
        oszArr[4] = new OSZ("user_id", String.valueOf(l2));
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
        BZI LIZ = C28787BRn.LIZ("anchor_click_gift_icon");
        LIZ.LJIIZILJ();
        LIZ.LJIIJJI("live_take_page");
        LIZ.LJIIJ("start_broadcast");
        LIZ.LJIIIZ("live");
        LIZ.LJIIL("click");
        LIZ.LJJIFFI(LJJJLZIJ);
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x073c  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 2351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d57, viewGroup, false);
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
