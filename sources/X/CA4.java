package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.InRoomBannerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.j;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class CA4 extends CAA implements InterfaceC72822Si2 {
    public final String LJLJL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLJ;

    public void LJIILL() {
    }

    public abstract void LJIIZILJ();

    @Override // X.CAA
    public void LIZIZ() {
        C72818Shy.LJII("js_event_banner_ready_live", this);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLIL = null;
    }

    @Override // X.CAA
    public final long LIZLLL() {
        if (this.LJLJI) {
            return 0L;
        }
        return LiveBannerDegradeSettings.INSTANCE.delayMillis();
    }

    @Override // X.CAA
    public final void LJFF() {
        int i;
        String str = this.LJLJL;
        if (str == null || str.length() == 0) {
            return;
        }
        C72818Shy.LIZLLL("js_event_banner_ready_live", this);
        NewTopRightBannerWidget newTopRightBannerWidget = this.LJLJJL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.LJZL();
        }
        try {
            LJIIZILJ();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setBackgroundColor(0);
            }
            NewTopRightBannerWidget newTopRightBannerWidget2 = this.LJLJJL;
            if (newTopRightBannerWidget2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getOptimization();
                } else {
                    i = -1;
                }
                newTopRightBannerWidget2.LL(i);
            }
        } catch (Exception e) {
            NewTopRightBannerWidget newTopRightBannerWidget3 = this.LJLJJL;
            if (newTopRightBannerWidget3 != null) {
                newTopRightBannerWidget3.LJZI(e.getMessage());
            }
        }
    }

    @Override // X.CAA
    public final void LJIIJJI() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "container_disappear", new JSONObject());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", false));
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "H5_appStateChange", jSONObject);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 instanceof X.AbstractC60811Ntn) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001b, code lost:
    
        return (X.CAB) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((r1 instanceof X.CAB) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1.next();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.CAB LJIILJJIL() {
        /*
            r3 = this;
            X.NtS r0 = r3.LJLJLJ
            r2 = 0
            if (r0 == 0) goto L2b
            com.bytedance.hybrid.spark.SparkContext r1 = r0.getSparkContext()
            if (r1 == 0) goto L2b
            java.lang.Class<X.Ntn> r0 = X.AbstractC60811Ntn.class
            java.lang.Object r1 = r1.LIZIZ(r0)
            X.Ntn r1 = (X.AbstractC60811Ntn) r1
            if (r1 == 0) goto L2b
        L15:
            boolean r0 = r1 instanceof X.CAB
            if (r0 == 0) goto L1c
            X.CAB r1 = (X.CAB) r1
            return r1
        L1c:
            java.lang.Object r1 = r1.next()
            if (r1 == 0) goto L2b
            boolean r0 = r1 instanceof X.AbstractC60811Ntn
            if (r0 == 0) goto L2b
            X.Ntn r1 = (X.AbstractC60811Ntn) r1
            if (r1 == 0) goto L2b
            goto L15
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CA4.LJIILJJIL():X.CAB");
    }

    public final void LJIILLIIL() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "container_appear", new JSONObject());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", true));
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "H5_appStateChange", jSONObject);
        }
    }

    @Override // X.CAA
    public final /* bridge */ /* synthetic */ View LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.CAA
    public final boolean LJ() {
        return this.LJLJI;
    }

    @Override // X.CAA
    public final void LJIIL() {
        LJIILLIIL();
    }

    @Override // X.CAA
    public final void LIZ(IMessage message) {
        String str;
        String str2;
        Long l;
        String str3;
        o.LJIIIZ(message, "message");
        if (!(message instanceof InRoomBannerMessage)) {
            return;
        }
        JSONObject LJ = C47135Ieh.LJ("type", "refresh", "data", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, (j) ((InRoomBannerMessage) message).extra));
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("enter_from_merge", BJM.LJFF()).put("enter_method", BJM.LJIIIIZZ());
        if (this.LJLJI) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        JSONObject put2 = put.put("event_page", str);
        Room room = this.LJLJJI;
        String str4 = null;
        if (room != null) {
            str2 = C17280m4.LIZ(room);
        } else {
            str2 = null;
        }
        JSONObject put3 = put2.put("room_id", str2);
        Room room2 = this.LJLJJI;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        JSONObject put4 = put3.put("anchor_id", String.valueOf(l));
        Room room3 = this.LJLJJI;
        if (room3 != null) {
            str3 = room3.getRequestId();
        } else {
            str3 = null;
        }
        JSONObject put5 = put4.put("request_id", str3);
        Room room4 = this.LJLJJI;
        if (room4 != null) {
            str4 = room4.getLog_pb();
        }
        put5.put("log_pb", str4);
        LJ.put("log", jSONObject);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_roomStatusChange", LJ);
        }
    }

    @Override // X.CAA
    public final void LJII(boolean z) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setFocusable(!z);
    }

    @Override // X.CAA
    public final void LJIIIIZZ(C30898CAs linkState) {
        o.LJIIIZ(linkState, "linkState");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", linkState.LIZ);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_linkMicStatusChanged", jSONObject);
        }
    }

    @Override // X.CAA
    public final void LJIIIZ(C29383Bg3 c29383Bg3) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        String str;
        if (c29383Bg3 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ) != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            EnumC05180Ig enumC05180Ig = c29383Bg3.LIZ;
            if (enumC05180Ig != null) {
                int i = C29584BjI.LIZ[enumC05180Ig.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            str = "3";
                        }
                    } else {
                        str = "2";
                    }
                } else {
                    str = "1";
                }
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_loginStatus", jSONObject.put("args", jSONObject2.put("code", str)));
            }
            str = CardStruct.IStatusCode.DEFAULT;
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_loginStatus", jSONObject.put("args", jSONObject2.put("code", str)));
        }
    }

    @Override // X.CAA
    public final void LJIIJ(boolean z) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if (z && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ) != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_micRoomStateChanged", new JSONObject());
        }
    }

    @Override // X.CAA
    public final boolean LJIILIIL(IMessage message) {
        o.LJIIIZ(message, "message");
        if (!(message instanceof InRoomBannerMessage)) {
            return false;
        }
        int i = ((InRoomBannerMessage) message).position;
        if (i != 2 && i != 5 && i != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        String str2;
        String str3 = "hide";
        if (!o.LJ(c199097rd.LJLIL, "js_event_banner_ready_live")) {
            return;
        }
        try {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns == null || (str2 = u.LJJIJIL(interfaceC78280Uns, "banner_state", "hide")) == null) {
                str2 = "hide";
            }
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            str = "empty_value";
            if (interfaceC78280Uns2 != null) {
                String LJJIJIL = u.LJJIJIL(interfaceC78280Uns2, "fail_reason", "empty_value");
                if (LJJIJIL != null) {
                    str = LJJIJIL;
                }
            }
            str3 = str2;
        } catch (Exception unused) {
            str = "exception";
        }
        if (o.LJ(str3, "show")) {
            LJIILL();
            NewTopRightBannerWidget newTopRightBannerWidget = this.LJLJJL;
            if (newTopRightBannerWidget != null) {
                newTopRightBannerWidget.LLF();
                return;
            }
            return;
        }
        if (this.LJLJJL == null) {
            return;
        }
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJJI = System.currentTimeMillis();
        C6M LIZIZ = C6J.LIZIZ();
        long LIZ = C6J.LIZ(LIZIZ.LJII, LIZIZ.LJIIJJI);
        long LIZ2 = C6J.LIZ(LIZIZ.LJFF, LIZIZ.LJIIJJI);
        HashMap hashMap = new HashMap(LIZIZ.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ));
        hashMap.put("duration_from_network", Long.valueOf(LIZ2));
        hashMap.put("error_message", str);
        C6J.LIZJ(c6j, "container_show", 0, hashMap);
    }

    public CA4(Context context, String str, List<? extends BannerInRoom> list, boolean z, Room room) {
        super(context, list, z, room);
        this.LJLJL = str;
    }
}
