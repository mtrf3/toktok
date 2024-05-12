package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CA7 extends CA4 {
    @Override // X.CA4
    public final void LJIILL() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        Object kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && C78598Ut0.LJII(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null && (kitView instanceof WebKitView)) {
            ((OM1) kitView).onResume();
        }
    }

    @Override // X.CA4
    public final void LJIIZILJ() {
        String str;
        String str2;
        View view;
        WebView webView;
        User owner;
        String LIZIZ;
        String str3 = this.LJLJL;
        String LJIIZILJ = BJM.LJIIZILJ();
        String.valueOf(BJM.LJ());
        String LJIIJJI = BJM.LJIIJJI();
        String LJIILIIL = BJM.LJIILIIL();
        C32364Cn2 c32364Cn2 = new C32364Cn2(str3);
        Room room = this.LJLJJI;
        if (room != null) {
            c32364Cn2.LIZIZ(room.getId(), "room_id");
            c32364Cn2.LIZIZ(room.getOwner().getId(), "anchor_id");
        }
        c32364Cn2.LIZJ("mode", "live_room");
        c32364Cn2.LIZJ("is_anchor", String.valueOf(this.LJLJI));
        c32364Cn2.LIZJ("enter_from", "");
        c32364Cn2.LIZJ("source_v3", LJIIZILJ);
        c32364Cn2.LIZJ("log_pb", LJIIJJI);
        c32364Cn2.LIZJ("request_id", LJIILIIL);
        if (this.LJLJI) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        c32364Cn2.LIZJ("event_page", str);
        c32364Cn2.LIZJ("event_belong", "live_interact");
        c32364Cn2.LIZJ("request_page", "bottomright");
        c32364Cn2.LIZJ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        String LIZLLL = c32364Cn2.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "urlBuilder.build()");
        Iterator<BannerInRoom> it = this.LJLILLLLZI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BannerInRoom next = it.next();
            Long l = next.businessType;
            if (l != null && l.longValue() == 4) {
                if (next != null) {
                    C32364Cn2 c32364Cn22 = new C32364Cn2(LIZLLL);
                    c32364Cn22.LIZJ("action_type", BJM.LIZLLL());
                    c32364Cn22.LIZIZ(BM1.LIZLLL, "back_up_room_id");
                    c32364Cn22.LIZIZ(BM1.LJ, "back_up_anchor_id");
                    LIZLLL = c32364Cn22.LIZLLL();
                    o.LJIIIIZZ(LIZLLL, "urlBuilder.build()");
                }
            }
        }
        C29714BlO LIZ = C29715BlP.LIZ(LIZLLL);
        LIZ.LJI(true);
        LIZ.LJIIIIZZ("bdhm_bid", "tiktok_live_fundamental_banner_container_web");
        String uri = LIZ.LIZ().toString();
        o.LJIIIIZZ(uri, "SparkSchemaBuilder.useWe…)\n            .toString()");
        Context context = this.LJLIL;
        if (!this.LJLJI && context != null) {
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            ActivityC45651qj LIZ2 = C29306Beo.LIZ(context);
            if (LIZ2 != null) {
                context = LIZ2;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS R70 = iHybridContainerService.R70(context, uri, "live_top_right_banner", new AqS171S0100000_5(this, 510));
            this.LJLJLJ = R70;
            if (R70 != null && C78598Ut0.LJII(R70)) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                String str4 = CardStruct.IStatusCode.DEFAULT;
                if (room2 == null || (str2 = C17280m4.LIZ(room2)) == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                if (room3 != null && (owner = room3.getOwner()) != null && (LIZIZ = C278817o.LIZIZ(owner)) != null) {
                    str4 = LIZIZ;
                }
                java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("room_id", str2), new OSZ("user_id", valueOf), new OSZ("anchor_id", str4));
                InterfaceC60761Nsz interfaceC60761Nsz = R70.LJLIL;
                if (interfaceC60761Nsz != null) {
                    interfaceC60761Nsz.LIZ(LJJLIIIIJ);
                }
                CAB LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    List<BannerInRoom> bannerList = this.LJLILLLLZI;
                    NewTopRightBannerWidget newTopRightBannerWidget = this.LJLJJL;
                    o.LJIIIZ(bannerList, "bannerList");
                    LJIILJJIL.LJLILLLLZI = bannerList;
                    LJIILJJIL.LJLJI = newTopRightBannerWidget;
                }
                NewTopRightBannerWidget newTopRightBannerWidget2 = this.LJLJJL;
                if (newTopRightBannerWidget2 != null) {
                    newTopRightBannerWidget2.LJJZZIII(LIZLLL);
                }
                InterfaceC60761Nsz kitView = R70.getKitView();
                if (kitView != null) {
                    view = kitView.LIZJ();
                } else {
                    view = null;
                }
                if ((view instanceof WebView) && (webView = (WebView) view) != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("window.location.replace(\"");
                    LIZ3.append(LIZLLL);
                    LIZ3.append("\")");
                    webView.evaluateJavascript(X1D.LIZIZ(LIZ3), null);
                }
            }
        }
        if (this.LJLJLJ == null) {
            InterfaceC06390Mx LIZ4 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ4, "getService(IHybridContainerService::class.java)");
            this.LJLJLJ = C05590Jv.LIZIZ((IHybridContainerService) LIZ4, new MutableContextWrapper(this.LJLIL), uri, false, new AqS171S0100000_5(this, 511), 4);
        }
    }

    @Override // X.CA4, X.CAA
    public final void LIZIZ() {
        super.LIZIZ();
        CAB LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LJLILLLLZI = null;
            LJIILJJIL.LJLJI = null;
        }
    }

    public CA7(Context context, String str, List<? extends BannerInRoom> list, boolean z, Room room) {
        super(context, str, list, z, room);
    }
}
