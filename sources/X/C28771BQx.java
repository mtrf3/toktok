package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BQx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28771BQx implements InterfaceC72822Si2 {
    public final /* synthetic */ BR1 LJLIL;

    public C28771BQx(BR1 br1) {
        this.LJLIL = br1;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        Long l;
        Long l2;
        String str2;
        java.util.Map<String, Object> LIZIZ;
        Context LJFF;
        IBrowserService iBrowserService;
        Context LJFF2;
        Activity LJIJJ;
        InterfaceC78280Uns interfaceC78280Uns;
        java.util.Map<String, Object> LIZIZ2;
        String str3;
        Boolean bool;
        BR1 br1 = this.LJLIL;
        br1.getClass();
        String str4 = c199097rd.LJLIL;
        int hashCode = str4.hashCode();
        boolean z = true;
        if (hashCode != -932658980) {
            if (hashCode != 1912105183) {
                if (hashCode == 2058562843 && str4.equals("EVENT_GOODY_BAG_SHARE_EVENT")) {
                    C0NB.LIZIZ("GoodyBagPresenter", "handleEvent: EVENT_GOODY_BAG_CREATE_SUCCESS");
                    InterfaceC28772BQy interfaceC28772BQy = br1.LIZIZ;
                    if (interfaceC28772BQy == null || (LJFF2 = interfaceC28772BQy.LJFF()) == null || (LJIJJ = C45804HyK.LJIJJ(LJFF2)) == null || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null || (LIZIZ2 = interfaceC78280Uns.LIZIZ()) == null) {
                        return;
                    }
                    DataChannel dataChannel = br1.LIZ;
                    if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCW.class)) != null) {
                        z = bool.booleanValue();
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("openSharePanel: ");
                    LIZ.append(z);
                    C0NB.LIZIZ("GoodyBagPresenter", X1D.LIZIZ(LIZ));
                    Object obj = LIZIZ2.get("track_info");
                    if (obj == null || (str3 = obj.toString()) == null) {
                        str3 = "";
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        java.util.Map<String, String> LJIILJJIL = C28787BRn.LIZ("").LJIILJJIL();
                        IShareService iShareService = (IShareService) CN1.LIZ(IShareService.class);
                        C29929Bor c29929Bor = new C29929Bor(br1.LIZLLL);
                        c29929Bor.LJIJJLI = LJIILJJIL;
                        c29929Bor.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
                        c29929Bor.LJJIL = z;
                        LiveShareDialog RQ = iShareService.RQ(new C29930Bos(c29929Bor), new BND(room, br1, jSONObject));
                        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LJIJJ);
                        if (LJJIFFI == null || RQ == null) {
                            return;
                        }
                        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
                        o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
                        RQ.show(supportFragmentManager, "LiveShareDialog");
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } else if (str4.equals("EVENT_GOODY_BAG_CREATE_SUCCESS")) {
                C0NB.LIZIZ("GoodyBagPresenter", "handleEvent: EVENT_GOODY_BAG_CREATE_SUCCESS");
                if (br1.LJFF) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null && (LIZIZ = interfaceC78280Uns2.LIZIZ()) != null) {
                    Object obj2 = LIZIZ.get("base_info");
                    Gson gson = C09650Zl.LIZIZ;
                    GoodyBagBaseInfo goodyBagBaseInfo = (GoodyBagBaseInfo) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, obj2), GoodyBagBaseInfo.class);
                    String LJIIIIZZ = br1.LJIIIIZZ(goodyBagBaseInfo);
                    if (LJIIIIZZ != null) {
                        br1.LJFF = true;
                        InterfaceC28772BQy interfaceC28772BQy2 = br1.LIZIZ;
                        if (interfaceC28772BQy2 != null && (LJFF = interfaceC28772BQy2.LJFF()) != null && (iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class)) != null) {
                            iBrowserService.qk0(LJFF, Boolean.FALSE, "ANCHOR_OPENED_GOODY_BAG_PANEL");
                        }
                        InterfaceC28772BQy interfaceC28772BQy3 = br1.LIZIZ;
                        if (interfaceC28772BQy3 != null) {
                            interfaceC28772BQy3.LJJIJL(LJIIIIZZ);
                        }
                        br1.LJIIJ = goodyBagBaseInfo;
                        br1.LJIIJ("fe");
                        C0NB.LIZIZ("GoodyBagPresenter", "receive goodybag send event: updateCurrentGoodyBag");
                        C28773BQz.LIZ = br1.LJIIJ;
                    }
                }
                XKX.LIZLLL(C780334l.LJLIL, null, null, new C28764BQq(null), 3);
                return;
            }
        } else if (str4.equals("EVENT_GOODY_BAG_END")) {
            C0NB.LIZIZ("GoodyBagPresenter", "handleEvent: EVENT_GOODY_BAG_END");
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 != null) {
                str = u.LJJIJIL(interfaceC78280Uns3, "goody_bag_id", "");
            } else {
                str = null;
            }
            GoodyBagBaseInfo goodyBagBaseInfo2 = br1.LJIIJ;
            if (goodyBagBaseInfo2 != null && (str2 = goodyBagBaseInfo2.goodyBagId) != null) {
                l = Long.valueOf(CastLongProtector.parseLong(str2));
            } else {
                l = null;
            }
            if (str != null) {
                l2 = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                l2 = null;
            }
            if (!o.LJ(l, l2) || br1.LJIIL) {
                return;
            }
            br1.LJIIL = true;
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C28750BQc(br1, null), 3);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleEvent: unknown event->");
        C1EW.LIZLLL(LIZ2, c199097rd.LJLIL, LIZ2, "GoodyBagPresenter");
    }
}
