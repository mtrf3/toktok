package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.AbstractC73672Svk;
import X.BCX;
import X.BJM;
import X.BZI;
import X.C01R;
import X.C04330Ez;
import X.C06490Nh;
import X.C15380j0;
import X.C15610jN;
import X.C16880lQ;
import X.C199097rd;
import X.C1Q4;
import X.C259910h;
import X.C28787BRn;
import X.C29306Beo;
import X.C30185Bsz;
import X.C30725C4b;
import X.C47121t6;
import X.C48189Ivh;
import X.C48459J0d;
import X.C5H3;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73943T0h;
import X.C73969T1h;
import X.C78528Urs;
import X.C78996UzQ;
import X.C97;
import X.C98;
import X.C9B;
import X.C9C;
import X.C9D;
import X.C9E;
import X.C9H;
import X.CCJ;
import X.EnumC30738C4o;
import X.EnumC48190Ivi;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterpolatorC83740Wtk;
import X.T16;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveCenterEntranceShow;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableGameNetworkToastAdjustSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterPunishCardOptSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveCenterEntranceWidget extends LiveWidget implements InterfaceC72822Si2 {
    public final EnumC48190Ivi LJLIL = C48189Ivh.LJ(C15380j0.LIZLLL());
    public int LJLILLLLZI = 1;
    public int LJLJI = 1;
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(C9D.LJLIL);
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(C9C.LJLIL);
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(C9E.LJLIL);
    public EnumC30738C4o LJLJL = EnumC30738C4o.DISMISS;
    public final C73318Sq2 LJLJLJ = new C73318Sq2();
    public PunishEventInfo LJLJLLL;
    public final int LJLL;
    public C73411SrX LJLLI;
    public C47121t6 LJLLILLLL;
    public View LJLLJ;
    public ImageView LJLLL;
    public LiveIconView LJLLLL;
    public C47121t6 LJLLLLLL;
    public ImageView LJLZ;
    public C47121t6 LJZ;
    public View LJZI;
    public View LJZL;
    public C47121t6 LL;
    public View LLD;
    public final C5H3 LLF;
    public C9H LLFF;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cuz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        C47121t6 c47121t6 = this.LJLLILLLL;
        C1Q4 c1q4 = null;
        if (c47121t6 != null) {
            c47121t6.setVisibility(0);
            C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.atu, c47121t6.getContext());
            if (LIZLLL != null) {
                LIZLLL.setTint(C15380j0.LIZIZ(R.color.a7i));
                c1q4 = LIZLLL;
            }
            c47121t6.setBackground(c1q4);
            ViewGroup.LayoutParams layoutParams = c47121t6.getLayoutParams();
            layoutParams.height = C15380j0.LIZ(16.0f);
            layoutParams.width = C15380j0.LIZ(16.0f);
            c47121t6.setLayoutParams(layoutParams);
            C29306Beo.LJJLI(C15380j0.LIZ(2.0f), c47121t6);
            return;
        }
        o.LJIJI("mAnchorTimerText");
        throw null;
    }

    public final InterpolatorC83740Wtk LJZ() {
        return (InterpolatorC83740Wtk) this.LLF.getValue();
    }

    public final void LL() {
        C47121t6 c47121t6 = this.LJLLILLLL;
        if (c47121t6 != null) {
            c47121t6.setVisibility(8);
            ImageView imageView = this.LJLLL;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                o.LJIJI("mStatusIcon");
                throw null;
            }
        }
        o.LJIJI("mAnchorTimerText");
        throw null;
    }

    public final void LLF() {
        LiveIconView liveIconView = this.LJLLLL;
        if (liveIconView != null) {
            liveIconView.setVisibility(8);
            C47121t6 c47121t6 = this.LJLLLLLL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
                return;
            } else {
                o.LJIJI("violationText");
                throw null;
            }
        }
        o.LJIJI("violationIcon");
        throw null;
    }

    public final void LLFII() {
        LiveIconView liveIconView = this.LJLLLL;
        if (liveIconView != null) {
            liveIconView.setVisibility(0);
            C47121t6 c47121t6 = this.LJLLLLLL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
                c47121t6.setTextColor(C04330Ez.LIZIZ(c47121t6.getContext(), R.color.c3));
                return;
            } else {
                o.LJIJI("violationText");
                throw null;
            }
        }
        o.LJIJI("violationIcon");
        throw null;
    }

    public LiveCenterEntranceWidget() {
        this.LJLL = C15380j0.LJIIZILJ() ? -1 : 1;
        this.LLF = C78996UzQ.LJJIJIIJI(C9B.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Object obj;
        super.onCreate();
        LiveCenterPunishCardOptSetting liveCenterPunishCardOptSetting = LiveCenterPunishCardOptSetting.INSTANCE;
        if (liveCenterPunishCardOptSetting.isEnable()) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            this.LLFF = new C9H(dataChannel, new C98(this));
        }
        this.dataChannel.pv0(LiveCenterEntranceShow.class);
        if (!liveCenterPunishCardOptSetting.isEnable() && InterfaceC30442Bx8.LLLLLLZ.LIZJ().longValue() - (C30725C4b.LIZ() / 1000) <= 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_center_icon");
            LIZ.LJIIZILJ();
            LIZ.LIZJ("show");
            LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_violation");
            LIZ.LJJIIJZLJL();
        }
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 90), view);
        }
        View findViewById = findViewById(R.id.af5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.background)");
        this.LJZI = findViewById;
        View findViewById2 = findViewById(R.id.af6);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.background2)");
        this.LJZL = findViewById2;
        System.currentTimeMillis();
        View findViewById3 = findViewById(R.id.asz);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.broadcast_timer)");
        this.LJLLILLLL = (C47121t6) findViewById3;
        View findViewById4 = findViewById(R.id.kez);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.status_icon)");
        this.LJLLL = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.nd8);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.violation_icon)");
        this.LJLLLL = (LiveIconView) findViewById5;
        View findViewById6 = findViewById(R.id.nd9);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.violation_text)");
        this.LJLLLLLL = (C47121t6) findViewById6;
        View findViewById7 = findViewById(R.id.bij);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.colorful_background)");
        this.LJLLJ = findViewById7;
        View findViewById8 = findViewById(R.id.anm);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.boost_card_icon)");
        this.LJLZ = (ImageView) findViewById8;
        View findViewById9 = findViewById(R.id.ano);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.boost_card_text)");
        this.LJZ = (C47121t6) findViewById9;
        View findViewById10 = findViewById(R.id.anp);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.boost_card_text_amount)");
        this.LL = (C47121t6) findViewById10;
        View findViewById11 = findViewById(R.id.e89);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.house_area)");
        this.LLD = findViewById11;
        LJLZ();
        if (!liveCenterPunishCardOptSetting.isEnable()) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLLLLZ;
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_CENTER_HAS_VIOLATION.value");
            if (LIZJ.intValue() >= 0) {
                LL();
                LLFII();
                long j = 1000;
                if (c48459J0d.LIZJ().longValue() - (C30725C4b.LIZ() / j) > 0) {
                    this.LJLLI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(c48459J0d.LIZJ().longValue() - (C30725C4b.LIZ() / j), TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 39));
                }
            }
        }
        if (CCJ.LIZ(this.context)) {
            findViewById(R.id.af5).setBackground(C15380j0.LJI(R.drawable.cwm));
            findViewById(R.id.bij).setBackground(C15380j0.LJI(R.drawable.cag));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            obj = dataChannel2.kv0(BCX.class);
        } else {
            obj = null;
        }
        if (EnableGameNetworkToastAdjustSetting.INSTANCE.enable() && obj == LiveMode.SCREEN_RECORD) {
            this.LJLJLJ.LIZ(C73943T0h.LIZ().LJ(C97.class).LJJJ(C73969T1h.LIZIZ()).LJIIL(30000L, TimeUnit.MILLISECONDS).LJJJJZI(new AfS57S0100000_5(this, 40)));
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS41S0100000_5(this, 50), 30000L);
        } else {
            this.LJLJLJ.LIZ(C73943T0h.LIZ().LJ(C97.class).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 41)));
            C72818Shy.LIZLLL("anchor_center_net_quality_request", this);
        }
        this.LJLJLJ.LIZ(C73943T0h.LIZ().LJ(C30185Bsz.class).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 42)));
        if (!liveCenterPunishCardOptSetting.isEnable()) {
            this.dataChannel.ov0(this, PerceptionMessageChannel.class, new AqS171S0100000_5(this, 141));
        }
        this.dataChannel.lv0(this, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 142));
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.lv0(this, NetworkStatus.class, new AqS171S0100000_5(this, UserLevelGeckoUpdateSetting.DEFAULT));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJLJ.LIZLLL();
        C9H c9h = this.LLFF;
        if (c9h != null) {
            C15610jN.LIZ().removeCallbacks(c9h.LJIIIIZZ);
            ((LinkedHashMap) c9h.LIZJ).clear();
            c9h.LJII = 0;
        }
        C72818Shy.LJII("anchor_center_net_quality_request", this);
    }

    public static String LJZL(int i) {
        if (i == 1) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o6p);
            if (LJIILJJIL == null) {
                return "";
            }
            return LJIILJJIL;
        }
        String LJIILL = C15380j0.LJIILL(R.string.o6m, Integer.valueOf(i));
        o.LJIIIIZZ(LJIILL, "{\n            ResUtil.ge…onEntry, count)\n        }");
        return LJIILL;
    }

    public final Drawable LJZI(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return (Drawable) this.LJLJJLL.getValue();
            }
            return (Drawable) this.LJLJJL.getValue();
        }
        return (Drawable) this.LJLJJI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(int r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget.LLFF(int):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "anchor_center_net_quality_request")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            jSONObject.put("quality", this.LJLILLLLZI);
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "anchor_center_net_quality_changed");
        }
    }

    public final void LLFFF(String str, String str2, String str3, String str4) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_center_icon");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LIZJ(str);
        LIZ.LJIJJ("1", "is_violation");
        LIZ.LJIJJ(str2, "record_id");
        C06490Nh.LIZLLL(LIZ, str3, "violation_type", str4, "violation_reason");
    }
}
