package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.B83;
import X.BCN;
import X.BHL;
import X.BHW;
import X.BHZ;
import X.BII;
import X.BZI;
import X.C03880Dg;
import X.C06490Nh;
import X.C0KB;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C199097rd;
import X.C221108m2;
import X.C28492BGe;
import X.C28507BGt;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29745Blt;
import X.C41071jL;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C72818Shy;
import X.C77437UaH;
import X.C78496UrM;
import X.C78977Uz7;
import X.C79045V0n;
import X.CN1;
import X.CXJ;
import X.DialogC77438UaI;
import X.InterfaceC29405BgP;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.OSZ;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.IDCListenerS159S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.ViolationStatusChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.LiveGoalPreviewViewModel;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalAnchorV2Setting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import o3.h0;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public final class BasePreviewSettingMainFragmentSheet extends LiveSheetFragment implements InterfaceC72822Si2 {
    public int LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public boolean LLFFF = true;
    public final C62822Ol8 LLI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 147));

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
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 115), _$_findCachedViewById(R.id.cbx));
            C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.bfp), new ACListenerS25S0100000_5(this, 116));
        }
    }

    public static void Ol(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "2641494249615460763")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
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

    public BasePreviewSettingMainFragmentSheet() {
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.svw));
        return c0kb;
    }

    public final Map<String, String> Nl() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(B83.LIZ().LIZIZ().getCurrentUserId()));
        hashMap.put("event_page", "live_take_page");
        return hashMap;
    }

    public final void Ql() {
        Wl("show");
        _$_findCachedViewById(R.id.l_m).setVisibility(0);
        View title_cover_group = _$_findCachedViewById(R.id.l_m);
        o.LJIIIIZZ(title_cover_group, "title_cover_group");
        C29306Beo.LJJJLL(title_cover_group, 500L, new AqS171S0100000_5(this, 225));
    }

    public final void Pl() {
        LiveMode liveMode;
        String str;
        long j;
        Long l;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_settings_goal_icon_show");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIIJJI("live_take_page");
        int i = C28492BGe.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "third_party";
            } else {
                str = "screen_share";
            }
        } else {
            str = "video_live";
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJJIIJZLJL();
        _$_findCachedViewById(R.id.fx1).setVisibility(0);
        ((IGiftService) CN1.LIZ(IGiftService.class)).syncGiftList(1);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (LIZJ == null) {
            LIZJ = "";
        }
        if (LiveGiftGoalAnchorV2Setting.INSTANCE.getValue()) {
            C72818Shy.LIZLLL("live_goal_update_event", this);
            ((LiveGoalPreviewViewModel) this.LLI.getValue()).LJLILLLLZI.observe(this, new AObserverS73S0100000_5(this, 19));
            LiveGoalPreviewViewModel liveGoalPreviewViewModel = (LiveGoalPreviewViewModel) this.LLI.getValue();
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL2 != null && (l = (Long) LJIILIIL2.kv0(BCN.class)) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            liveGoalPreviewViewModel.gv0(j, LIZJ);
        } else {
            this.LLIFFJFJJ = false;
        }
        View live_goal_group = _$_findCachedViewById(R.id.fx1);
        o.LJIIIIZZ(live_goal_group, "live_goal_group");
        C29306Beo.LJJJLL(live_goal_group, 500L, new AqS171S0100000_5(this, 224));
    }

    public final void Rl() {
        LiveMode liveMode;
        String str;
        LiveMode liveMode2;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_settings_topic_icon_show");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIIJJI("live_take_page");
        int i = C28492BGe.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "third_party";
            } else {
                str = "screen_share";
            }
        } else {
            str = "video_live";
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJJIIJZLJL();
        _$_findCachedViewById(R.id.lhw).setVisibility(0);
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL2 == null || (liveMode2 = (LiveMode) LJIILIIL2.kv0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        Zl(liveMode2);
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL3 != null) {
            LJIILIIL3.lv0(this, HashTagResp.class, new AqS136S0200000_5(this, liveMode2, 6));
        }
        View topic_group = _$_findCachedViewById(R.id.lhw);
        o.LJIIIIZZ(topic_group, "topic_group");
        C29306Beo.LJJJLL(topic_group, 500L, new AqS136S0200000_5(this, liveMode2, 7));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
        C72818Shy.LJII("live_goal_update_event", this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    public final void Tl(String str) {
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

    public final void Vl(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_moderator_icon");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIIJJI("live_take_page");
        int i = C28492BGe.LIZ[liveMode.ordinal()];
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

    public final void Wl(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_title_cover_icon");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIIJJI("live_take_page");
        int i = C28492BGe.LIZ[liveMode.ordinal()];
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

    public final void Xl(boolean z) {
        Text text;
        ViolationStatusResponse.ResponseData responseData;
        PerceptionDialogInfo perceptionDialogInfo;
        Integer LJI;
        Integer LJI2;
        if (z) {
            ((TextView) _$_findCachedViewById(R.id.dsw)).setEnabled(false);
            ((ImageView) _$_findCachedViewById(R.id.dsu)).setVisibility(0);
            Context LIZLLL = C15380j0.LIZLLL();
            if (LIZLLL != null && (LJI2 = C79045V0n.LJI(R.attr.gp, LIZLLL)) != null) {
                ((TextView) _$_findCachedViewById(R.id.dsx)).setTextColor(LJI2.intValue());
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.dst);
            Context LIZLLL2 = C15380j0.LIZLLL();
            if (LIZLLL2 != null && (LJI = C79045V0n.LJI(R.attr.gp, LIZLLL2)) != null) {
                textView.setTextColor(LJI.intValue());
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (responseData = (ViolationStatusResponse.ResponseData) LJIILIIL.kv0(ViolationStatusChannel.class)) != null && (perceptionDialogInfo = responseData.perceptionDialog) != null) {
                text = perceptionDialogInfo.subTitle;
            } else {
                text = null;
            }
            textView.setText(CXJ.LJFF(text, "").toString());
        }
    }

    public final void Yl(int i) {
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
        c77437UaH.LJ(R.string.k5j, new IDCListenerS159S0100000_5(this, 1), false);
        c77437UaH.LIZJ(R.string.k5k, BHL.LJLIL, false);
        Ol(c77437UaH.LIZ());
    }

    public final void Zl(LiveMode liveMode) {
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
                this.LLIFFJFJJ = false;
                return;
            }
            this.LLIFFJFJJ = true;
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d58, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    public final void Sl(boolean z, boolean z2) {
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

    /* JADX WARN: Removed duplicated region for block: B:111:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06d3  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 2399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void Ml(View view, C41071jL c41071jL, CharSequence charSequence) {
        String string = getString(R.string.ojz);
        o.LJIIIIZZ(string, "getString(R.string.pm_switch)");
        String string2 = getString(R.string.k47);
        o.LJIIIIZZ(string2, "getString(R.string.pm_accessibilityLabels_tux_on)");
        String string3 = getString(R.string.k46);
        o.LJIIIIZZ(string3, "getString(R.string.pm_accessibilityLabels_tux_off)");
        c41071jL.setImportantForAccessibility(2);
        h0.LJIJI(view, new C29745Blt(view, c41071jL, charSequence, string, string2, string3));
    }
}
