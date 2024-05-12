package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.BCX;
import X.BI9;
import X.BZI;
import X.C0K2;
import X.C0N3;
import X.C0NB;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C199097rd;
import X.C23010vJ;
import X.C24150x9;
import X.C28509BGv;
import X.C30579BzL;
import X.C30582BzO;
import X.C32537Cpp;
import X.C32I;
import X.C47261Igj;
import X.C48459J0d;
import X.C72818Shy;
import X.C77339UWx;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.OSZ;
import X.Q8U;
import X.QZZ;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.PartnershipEventPermissionChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameEventPreviewBanner extends BannerWidget implements InterfaceC72822Si2 {
    public boolean LJLL;
    public List<PartnershipGameEvent> LJLLI;
    public boolean LJLLILLLL;
    public PartnershipGameEvent LJLLJ;
    public boolean LJLJLLL = true;
    public final String LJLLL = "game_partnership_event_banner";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.doe;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        Long l;
        Long l2;
        Integer num;
        String str;
        String str2;
        C48459J0d<Map<Long, Integer>> c48459J0d = InterfaceC30442Bx8.q1;
        Map<Long, Integer> LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_PARTNERSHIP_BANNER_SHOW_COUNT.value");
        Map<Long, Integer> map = LIZJ;
        PartnershipGameEvent partnershipGameEvent = this.LJLLJ;
        String str3 = null;
        if (partnershipGameEvent != null) {
            l = Long.valueOf(partnershipGameEvent.gameTagId);
        } else {
            l = null;
        }
        Map<Long, Integer> LIZJ2 = c48459J0d.LIZJ();
        PartnershipGameEvent partnershipGameEvent2 = this.LJLLJ;
        if (partnershipGameEvent2 != null) {
            l2 = Long.valueOf(partnershipGameEvent2.gameTagId);
        } else {
            l2 = null;
        }
        Integer num2 = LIZJ2.get(l2);
        if (num2 != null) {
            num = C77339UWx.LIZIZ(num2, 1);
        } else {
            num = null;
        }
        map.put(l, num);
        BZI LIZIZ = C0N3.LIZIZ("livesdk_gamepad_btn_show", "live_start", "page_name");
        LIZIZ.LJIJJ(this.LJLJJI, "live_type");
        LIZIZ.LJIJJ("activity_banner", "btn_name");
        PartnershipGameEvent partnershipGameEvent3 = this.LJLLJ;
        if (partnershipGameEvent3 == null || (str = partnershipGameEvent3.gameName) == null) {
            str = "";
        }
        LIZIZ.LJIJJ(str, "game_name");
        PartnershipGameEvent partnershipGameEvent4 = this.LJLLJ;
        if (partnershipGameEvent4 != null) {
            str2 = partnershipGameEvent4.gameIdStr;
        } else {
            str2 = null;
        }
        LIZIZ.LJIJJ(Long.valueOf(LLFII(str2)), "game_id");
        PartnershipGameEvent partnershipGameEvent5 = this.LJLLJ;
        if (partnershipGameEvent5 != null) {
            str3 = partnershipGameEvent5.taskIdStr;
        }
        LIZIZ.LJIJJ(Long.valueOf(LLFII(str3)), "game_task_id");
        LIZIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.bytedance.android.livesdk.game.model.PartnershipGameEvent>, O] */
    public final void LLFFF() {
        LiveMode liveMode;
        GameTag gameTag;
        C30579BzL S00 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).S00();
        if (S00 != null) {
            S00.LIZ(LiveMode.SCREEN_RECORD, LiveMode.THIRD_PARTY);
        }
        DataChannel dataChannel = this.dataChannel;
        PartnershipGameEvent partnershipGameEvent = null;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.kv0(BCX.class);
        } else {
            liveMode = null;
        }
        if (S00 != null) {
            S00.LIZIZ(liveMode, "game_event");
        }
        List<PartnershipGameEvent> list = this.LJLLI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (PartnershipGameEvent partnershipGameEvent2 : list) {
                PartnershipGameEvent partnershipGameEvent3 = partnershipGameEvent2;
                if (partnershipGameEvent3.anchorHasJoined && partnershipGameEvent3.incentivetype == 0) {
                    arrayList.add(partnershipGameEvent2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PartnershipGameEvent partnershipGameEvent4 = (PartnershipGameEvent) it.next();
                String str = partnershipGameEvent4.gameIdStr;
                o.LJIIIIZZ(str, "it.gameIdStr");
                arrayList2.add(new C30582BzO(str, String.valueOf(partnershipGameEvent4.gameTagId), false, true, false, 20));
            }
            if (S00 != null) {
                S00.LJI(arrayList2, "game_event", null);
            }
        }
        ((C32537Cpp) this.dataChannel.gv0(BI9.class)).LIZ = this.LJLLI;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            gameTag = (GameTag) dataChannel2.kv0(PreviewPagerSelectedGameItem.class);
        } else {
            gameTag = null;
        }
        List<PartnershipGameEvent> list2 = this.LJLLI;
        if (list2 != null) {
            Iterator<PartnershipGameEvent> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PartnershipGameEvent next = it2.next();
                PartnershipGameEvent partnershipGameEvent5 = next;
                if (gameTag != null) {
                    long j = partnershipGameEvent5.gameTagId;
                    Long l = gameTag.id;
                    if (l != null && j == l.longValue()) {
                        partnershipGameEvent = next;
                        break;
                    }
                }
            }
            PartnershipGameEvent partnershipGameEvent6 = partnershipGameEvent;
            if (partnershipGameEvent6 != null) {
                this.LJLLJ = partnershipGameEvent6;
                if (!this.LJLL && this.LJLJLLL && !partnershipGameEvent6.anchorHasJoined) {
                    this.LJLL = true;
                    show();
                }
                this.LJLJLLL = false;
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Long l;
        Long l2;
        if (this.LJLL) {
            C48459J0d<Map<Long, Integer>> c48459J0d = InterfaceC30442Bx8.q1;
            Map<Long, Integer> LIZJ = c48459J0d.LIZJ();
            PartnershipGameEvent partnershipGameEvent = this.LJLLJ;
            Long l3 = null;
            if (partnershipGameEvent != null) {
                l = Long.valueOf(partnershipGameEvent.gameTagId);
            } else {
                l = null;
            }
            Integer num = LIZJ.get(l);
            if (num == null) {
                num = 0;
                Map<Long, Integer> LIZJ2 = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_GAME_PARTNERSHIP_BANNER_SHOW_COUNT.value");
                Map<Long, Integer> map = LIZJ2;
                PartnershipGameEvent partnershipGameEvent2 = this.LJLLJ;
                if (partnershipGameEvent2 != null) {
                    l2 = Long.valueOf(partnershipGameEvent2.gameTagId);
                } else {
                    l2 = null;
                }
                map.put(l2, num);
            }
            Map<Long, Boolean> LIZJ3 = InterfaceC30442Bx8.r1.LIZJ();
            PartnershipGameEvent partnershipGameEvent3 = this.LJLLJ;
            if (partnershipGameEvent3 != null) {
                l3 = Long.valueOf(partnershipGameEvent3.gameTagId);
            }
            if (o.LJ(LIZJ3.get(l3), Boolean.TRUE) || num.intValue() < 2) {
                super.show();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        LiveIconView liveIconView;
        TextView textView;
        super.LJZL();
        hide();
        View view = getView();
        if (view != null && (textView = (TextView) view.findViewById(R.id.d0a)) != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lgo);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_gamepad_event_banner)");
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lgp);
            o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_ga…event_button_placeholder)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q8U.LIZIZ(new Object[]{QZZ.LIZIZ('\n', LJIILJJIL2)}, 1, LJIILJJIL, "format(format, *args)"));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
            try {
                C23010vJ.LIZJ(this.context, spannableStringBuilder, spannableStringBuilder.length() - LJIILJJIL2.length(), spannableStringBuilder.length(), 33, 6, 600);
                spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - LJIILJJIL2.length(), spannableStringBuilder.length(), 33);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("index error: ");
                LIZ.append(e);
                C0NB.LIZLLL(X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("index error: ");
                LIZ2.append(e);
                C0K2.LIZ(X1D.LIZIZ(LIZ2), e);
            }
            textView.setText(spannableStringBuilder);
        }
        View view2 = getView();
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 105), view2);
        }
        View view3 = getView();
        if (view3 != null && (liveIconView = (LiveIconView) view3.findViewById(R.id.d0k)) != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 106));
        }
        this.dataChannel.ov0(this, PartnershipEventPermissionChannel.class, new AqS171S0100000_5(this, 216));
        C72818Shy.LIZLLL("signInPartnershipEvent", this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("signInPartnershipEvent", this);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLLL;
    }

    public final long LLFII(String str) {
        Long l = -1L;
        if (str == null) {
            return -1L;
        }
        try {
            l = Long.valueOf(CastLongProtector.parseLong(str));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("gameId is not number, e:");
            LIZ.append(e);
            C0NB.LIZLLL(X1D.LIZIZ(LIZ));
        }
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final void LLFZ(String str) {
        String str2;
        String str3;
        LiveMode liveMode;
        PartnershipGameEvent partnershipGameEvent = this.LJLLJ;
        String str4 = null;
        if (partnershipGameEvent != null) {
            str4 = partnershipGameEvent.eventDetailUrl;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String encode = URLEncoder.encode(str4, "UTF-8");
        OSZ[] oszArr = new OSZ[5];
        PartnershipGameEvent partnershipGameEvent2 = this.LJLLJ;
        if (partnershipGameEvent2 == null || (str2 = partnershipGameEvent2.eventIdStr) == null) {
            str2 = "";
        }
        oszArr[0] = new OSZ("event_id", str2);
        oszArr[1] = new OSZ("event_detail_url", encode);
        PartnershipGameEvent partnershipGameEvent3 = this.LJLLJ;
        if (partnershipGameEvent3 == null || (str3 = partnershipGameEvent3.gameIdStr) == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ("game_id", str3);
        oszArr[3] = new OSZ("page_from", str);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str5 = C28509BGv.LIZ(liveMode);
        }
        oszArr[4] = new OSZ("live_type", str5);
        Map LJJL = C113554cx.LJJL(oszArr);
        if (this.context != null) {
            ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
            Context LLLLL = C16880lQ.LLLLL(this.context);
            o.LJIIIIZZ(LLLLL, "context.applicationContext");
            C24150x9.LJII(LLLLL, LJJL);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        C30579BzL S00;
        String str2;
        String str3;
        String LJJIJIL;
        if (o.LJ(c199097rd.LJLIL, "signInPartnershipEvent")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            String str4 = "";
            if (interfaceC78280Uns != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "eventID", "")) != null) {
                str4 = LJJIJIL;
            }
            PartnershipGameEvent partnershipGameEvent = this.LJLLJ;
            if (partnershipGameEvent != null) {
                str = partnershipGameEvent.eventIdStr;
            } else {
                str = null;
            }
            if (o.LJ(str4, str)) {
                hide();
                this.LJLL = false;
            }
            PartnershipGameEvent partnershipGameEvent2 = this.LJLLJ;
            if (partnershipGameEvent2 != null && partnershipGameEvent2.incentivetype == 0 && (S00 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).S00()) != null) {
                PartnershipGameEvent partnershipGameEvent3 = this.LJLLJ;
                if (partnershipGameEvent3 != null) {
                    str2 = partnershipGameEvent3.taskIdStr;
                } else {
                    str2 = null;
                }
                String valueOf = String.valueOf(str2);
                PartnershipGameEvent partnershipGameEvent4 = this.LJLLJ;
                if (partnershipGameEvent4 != null) {
                    str3 = partnershipGameEvent4.gameIdStr;
                } else {
                    str3 = null;
                }
                S00.LJI(C47261Igj.LJJIJ(new C30582BzO(valueOf, String.valueOf(str3), false, true, false, 20)), "game_event", null);
            }
        }
    }
}
