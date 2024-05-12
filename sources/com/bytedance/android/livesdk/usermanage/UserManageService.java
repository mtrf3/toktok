package com.bytedance.android.livesdk.usermanage;

import X.AbstractC73547Stj;
import X.AbstractC73638SvC;
import X.B83;
import X.BEO;
import X.BEX;
import X.BFA;
import X.BFC;
import X.BJB;
import X.BJL;
import X.BJM;
import X.BK8;
import X.BY3;
import X.BZI;
import X.C05490Jl;
import X.C0F1;
import X.C0K2;
import X.C15380j0;
import X.C18230nb;
import X.C1A;
import X.C1EW;
import X.C28246B6s;
import X.C28427BDr;
import X.C28457BEv;
import X.C28554BIo;
import X.C28555BIp;
import X.C28557BIr;
import X.C28565BIz;
import X.C28594BKc;
import X.C28787BRn;
import X.C28835BTj;
import X.C28837BTl;
import X.C29047Bad;
import X.C29374Bfu;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29702BlC;
import X.C29930Bos;
import X.C38354F3m;
import X.C73318Sq2;
import X.C73867Syt;
import X.C73969T1h;
import X.C76800UCe;
import X.CN1;
import X.CNJ;
import X.CallableC28556BIq;
import X.DialogC28454BEs;
import X.InterfaceC05190Ih;
import X.InterfaceC28453BEr;
import X.InterfaceC28456BEu;
import X.InterfaceC28459BEx;
import X.InterfaceC28558BIs;
import X.InterfaceC29405BgP;
import X.InterfaceC88472Yns;
import X.T16;
import X.WM7;
import Y.AfS0S0110200_5;
import Y.AfS0S1110200_5;
import Y.AfS1S0200100_5;
import Y.AfS20S0400000_5;
import Y.AfS25S0110000_5;
import Y.AfS36S0101000_5;
import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import Y.IDaS216S0100000_5;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.dataChannel.MuteDurationEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsListSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportOptimizeUrlSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class UserManageService implements IUserManageService {
    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean ef0() {
        return C28427BDr.LIZ(2);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean jf0() {
        return C28427BDr.LIZ(3);
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean qZ() {
        return C28427BDr.LIZ(4);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final String Ab0() {
        if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            return "manual_pk";
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            return "anchor";
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Yu0() > 0) {
            return "audience";
        }
        return "regular";
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean X00() {
        return C28427BDr.LIZ(8);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final AbstractC73638SvC<C05490Jl> af0() {
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        Object obj = ((LinkedHashMap) C28557BIr.LIZ).get(Long.valueOf(currentUserId));
        if (obj != null) {
            return AbstractC73638SvC.LJIJ(obj);
        }
        return new C73867Syt(AbstractC73638SvC.LJIILLIIL(new CallableC28556BIq(currentUserId)), null, C05490Jl.LIZIZ).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ());
    }

    public static String LIZ(C28555BIp c28555BIp) {
        InterfaceC05190Ih interfaceC05190Ih;
        if (B83.LIZ().LIZIZ() == null || (interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ) == null) {
            return "";
        }
        if (interfaceC05190Ih.getId() == c28555BIp.LIZJ) {
            return "anchor";
        }
        if (interfaceC05190Ih.getUserAttr() != null && interfaceC05190Ih.getUserAttr().isAdmin) {
            return "admin";
        }
        if (c28555BIp.LJJ) {
            return "guest_viewer";
        }
        return "viewer";
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Zo0(InterfaceC88472Yns<? super List<C05490Jl>, C76800UCe> interfaceC88472Yns) {
        double[] value = LiveMuteCommentsListSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList(value.length);
        for (double d : value) {
            arrayList.add(new C05490Jl((long) d));
        }
        interfaceC88472Yns.invoke(arrayList);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void fk0(BEO iHostIModerateView) {
        o.LJIIIZ(iHostIModerateView, "iHostIModerateView");
        WeakReference weakReference = new WeakReference(iHostIModerateView);
        C1EW.LIZ(((AdminApi) C1A.LIZJ(AdminApi.class)).requestModeratorIHostList()).LJJJLIIL(new AfS57S0100000_5(weakReference, 173), new AfS57S0100000_5(weakReference, 174));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void zr(C05490Jl duration) {
        o.LJIIIZ(duration, "duration");
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        Map<Long, C05490Jl> map = C28557BIr.LIZ;
        if (o.LJ(((LinkedHashMap) map).get(Long.valueOf(currentUserId)), duration)) {
            return;
        }
        map.put(Long.valueOf(currentUserId), duration);
        DataChannelGlobal.LJLJJI.sv0(MuteDurationEvent.class, duration);
        AbstractC73547Stj.LJFF(new IDaS216S0100000_5(duration, 4)).LJIILIIL(T16.LIZ()).LJIIIIZZ().LJIIJJI();
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void EG(InterfaceC28456BEu iAdminView, long j) {
        String str;
        InterfaceC05190Ih interfaceC05190Ih;
        o.LJIIIZ(iAdminView, "iAdminView");
        WeakReference weakReference = new WeakReference(iAdminView);
        AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(j);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            str = interfaceC05190Ih.getSecUid();
        } else {
            str = null;
        }
        C1EW.LIZ(adminApi.fetchAdministrators(j, LIZJ, str)).LJJJLIIL(new AfS57S0100000_5(weakReference, 171), new AfS57S0100000_5(weakReference, 172));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Qp0(Context context, C28555BIp model) {
        String str;
        String str2;
        String str3;
        String str4;
        BJL bjl;
        Map<String, String> map;
        String str5;
        BJL bjl2;
        Map<String, String> map2;
        boolean z;
        int LJFF;
        o.LJIIIZ(model, "model");
        Long l = null;
        if (model.LJIILIIL && TextUtils.equals("report_anchor", model.LJIILJJIL)) {
            oo(context, model, null);
            return;
        }
        String value = LiveReportOptimizeUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            C29702BlC LIZIZ = C18230nb.LIZIZ("ttlive_report_user_error");
            LIZIZ.LIZIZ(-1L, "error_code");
            LIZIZ.LIZLLL("error_msg", "live report url is empty");
            LIZIZ.LJI = true;
            LIZIZ.LJIIIZ();
            return;
        }
        String str6 = "";
        if (!TextUtils.isEmpty(value)) {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            buildUpon.appendQueryParameter("room_id", String.valueOf(model.LIZIZ));
            buildUpon.appendQueryParameter("anchor_id", String.valueOf(model.LIZJ));
            if (TextUtils.isEmpty(model.LJFF)) {
                buildUpon.appendQueryParameter("reported_user_id", String.valueOf(model.LIZLLL));
            } else {
                buildUpon.appendQueryParameter("sec_reported_user_id", model.LJFF);
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C29047Bad.class) == null) {
                str = "";
                str2 = "";
            } else {
                Hashtag hashtag = (Hashtag) dataChannelGlobal.mv0(C29047Bad.class);
                if (hashtag != null) {
                    str2 = hashtag.title;
                } else {
                    str2 = null;
                }
                Hashtag hashtag2 = (Hashtag) dataChannelGlobal.mv0(C29047Bad.class);
                if (hashtag2 != null) {
                    l = hashtag2.id;
                }
                str = String.valueOf(l);
            }
            buildUpon.appendQueryParameter("to_user_id", String.valueOf(model.LIZLLL));
            buildUpon.appendQueryParameter("admin_type", LIZ(model));
            buildUpon.appendQueryParameter("report_type", model.LJIILJJIL);
            buildUpon.appendQueryParameter("request_page", model.LJI);
            buildUpon.appendQueryParameter("enter_from_merge", model.LJII);
            buildUpon.appendQueryParameter("enter_method", model.LJIIIIZZ);
            if (model.LJIIL) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str3 = "1";
            }
            buildUpon.appendQueryParameter("landscape", str3);
            buildUpon.appendQueryParameter("action_type", model.LJIIIZ);
            buildUpon.appendQueryParameter("event_page", "live_detail");
            buildUpon.appendQueryParameter("hashtag_type", str2);
            buildUpon.appendQueryParameter("hashtag_id", str);
            buildUpon.appendQueryParameter("event_page", "live_detail");
            buildUpon.appendQueryParameter("page_style", model.LIZ);
            buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(model.LJJI)) {
                buildUpon.appendQueryParameter(WM7.SCENE_SERVICE, model.LJJI);
            }
            if (!TextUtils.isEmpty(model.LJIIJ)) {
                buildUpon.appendQueryParameter("request_id", model.LJIIJ);
            }
            if (!TextUtils.isEmpty(model.LJIL)) {
                buildUpon.appendQueryParameter("video_id", model.LJIL);
            }
            if ("report_message".equals(model.LJIILJJIL) || "report_question".equals(model.LJIILJJIL) || "live_star_comment".equals(model.LJIILJJIL)) {
                String str7 = model.LJIILLIIL;
                str7.toString();
                buildUpon.appendQueryParameter("chat_type", str7);
                long j = model.LJIIZILJ;
                if (j > 0) {
                    buildUpon.appendQueryParameter("msg_id", String.valueOf(j));
                }
                if (!TextUtils.isEmpty(model.LJIJ)) {
                    buildUpon.appendQueryParameter("content", model.LJIJ);
                }
            }
            if (!TextUtils.isEmpty(model.LJIILL)) {
                buildUpon.appendQueryParameter("report_content", model.LJIILL);
            }
            long j2 = model.LJIJI;
            if (j2 != 0) {
                buildUpon.appendQueryParameter("pin_id", String.valueOf(j2));
            }
            long j3 = model.LJIJJ;
            if (j3 != 0) {
                buildUpon.appendQueryParameter("pin_msg_id", String.valueOf(j3));
            }
            C28246B6s LJIJI = BJM.LJIJI();
            if (LJIJI == null || (bjl2 = LJIJI.LJFF) == null || (map2 = bjl2.LJJIL) == null || (str4 = map2.get("toplive_position")) == null) {
                str4 = "";
            }
            if (!TextUtils.isEmpty(str4)) {
                C28246B6s LJIJI2 = BJM.LJIJI();
                if (LJIJI2 != null && (bjl = LJIJI2.LJFF) != null && (map = bjl.LJJIL) != null && (str5 = map.get("toplive_position")) != null) {
                    str6 = str5;
                }
                buildUpon.appendQueryParameter("toplive_position", str6);
            }
            C28837BTl c28837BTl = model.LJIIJJI;
            if (c28837BTl != null) {
                HashMap<String, String> LJI = C28835BTj.LJI(c28837BTl);
                JSONObject jSONObject = new JSONObject();
                for (String str8 : LJI.keySet()) {
                    try {
                        jSONObject.put(str8, LJI.get(str8));
                    } catch (Exception unused) {
                    }
                }
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
                buildUpon.appendQueryParameter("ad_info", jSONObject2);
            }
            str6 = buildUpon.toString();
            o.LJIIIIZZ(str6, "builder.toString()");
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            z = iHostAction.hostInterceptSpark(str6);
        } else {
            z = false;
        }
        if (context != null) {
            String str9 = "bottom";
            if (z) {
                C29682Bks LIZJ = C29683Bkt.LIZJ(str6);
                C29682Bks.LJIJI(LIZJ, 8);
                if (o.LJ(model.LJIILJJIL, "report_anchor")) {
                    int i = model.LJ;
                    if (i != 0) {
                        C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ(i));
                    } else {
                        BY3 by3 = BY3.PERCENT;
                        LIZJ.LJIIJ(73, by3);
                        LIZJ.LJIILL(100, by3);
                    }
                    LIZJ.LJIILIIL(1);
                } else {
                    int i2 = model.LJ;
                    if (i2 != 0) {
                        C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ(i2));
                    } else {
                        BY3 by32 = BY3.PERCENT;
                        LIZJ.LJIIJ(50, by32);
                        LIZJ.LJIILL(100, by32);
                    }
                }
                C29682Bks.LJIIZILJ(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJFF(R.dimen.ad9)));
                BY3 by33 = BY3.PERCENT;
                LIZJ.LJIL(100, by33);
                if (model.LJIIL) {
                    LIZJ.LJIJ(by33);
                }
                LIZJ.LJIILJJIL("end");
                LIZJ.LJIJJ("bottom");
                LIZJ.LJIILLIIL("end");
                LIZJ.LJ(0);
                String uri = LIZJ.LIZ().toString();
                o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder.…      .build().toString()");
                ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(context, uri, new BK8(this, str6, model));
                LIZLLL(str6, model, true);
                return;
            }
            PopupConfig popupConfig = new PopupConfig(C0F1.LIZ("sslocal").authority(CNJ.LIZIZ).appendQueryParameter("url", str6).build());
            int i3 = -1;
            if (o.LJ(model.LJIILJJIL, "report_anchor")) {
                int i4 = model.LJ;
                if (i4 != 0) {
                    i3 = i4;
                } else if (model.LJIIL) {
                    i3 = (int) (C15380j0.LJIIJJI() * 0.73f);
                }
                popupConfig.setHeight(i3);
                LivePopupConfig livePopupConfig = new LivePopupConfig();
                livePopupConfig.setSoftInputMode("adjustPan");
                popupConfig.setExtraConfig(livePopupConfig);
            } else {
                int i5 = model.LJ;
                if (i5 != 0) {
                    i3 = i5;
                } else if (model.LJIIL) {
                    i3 = (int) ((C15380j0.LJIIJJI() * 1.0f) / 2);
                }
                popupConfig.setHeight(i3);
            }
            if (model.LJIIL) {
                LJFF = C15380j0.LJIIL();
            } else {
                LJFF = C15380j0.LJFF(R.dimen.ad9);
            }
            popupConfig.setWidth(LJFF);
            if (model.LJIIL && TextUtils.equals(popupConfig.getGravity(), "center")) {
                str9 = "center";
            } else if (!model.LJIIL) {
                str9 = "right";
            }
            popupConfig.setAnimation(str9);
            IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
            if (iBrowserService != null) {
                iBrowserService.kD(context, popupConfig);
            } else {
                LJ(str6, model, false, "service is null");
            }
            LIZLLL(str6, model, false);
        }
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Us(Context context, C29930Bos params) {
        String str;
        o.LJIIIZ(params, "params");
        String LJFF = BJM.LJFF();
        String LJIIIIZZ = BJM.LJIIIIZZ();
        String str2 = params.LJJI;
        if (str2 == null || str2.length() == 0) {
            str = "share";
        } else {
            str = params.LJJI;
        }
        long j = params.LIZJ;
        long j2 = params.LIZLLL;
        C28555BIp c28555BIp = new C28555BIp(j, j2, j2, params.LJIJI, str, LJFF, LJIIIIZZ, BJM.LIZLLL(), params.LJIIZILJ, C28835BTj.LIZIZ(null, null, "user_live_duration"), params.LJJJJL);
        c28555BIp.LJJI = params.LJJIJIL;
        c28555BIp.LJIIL = params.LJJIL;
        Qp0(context, c28555BIp);
    }

    public static void LIZLLL(String str, C28555BIp c28555BIp, boolean z) {
        HashMap hashMap = new HashMap();
        String valueOf = String.valueOf(c28555BIp.LIZLLL);
        o.LJIIIIZZ(valueOf, "valueOf(model.reportedUserId)");
        hashMap.put("to_user_id", valueOf);
        String str2 = c28555BIp.LJI;
        o.LJIIIIZZ(str2, "model.requestPage");
        hashMap.put("request_page", str2);
        hashMap.put("event_page", "live_detail");
        hashMap.put("admin_type", LIZ(c28555BIp));
        if (o.LJ(c28555BIp.LJIILLIIL, "3")) {
            hashMap.put("report_type", "report_question");
        } else if (!TextUtils.isEmpty(c28555BIp.LJIILJJIL)) {
            String str3 = c28555BIp.LJIILJJIL;
            o.LJIIIIZZ(str3, "model.reportType");
            hashMap.put("report_type", str3);
        }
        if (!TextUtils.isEmpty(c28555BIp.LJIILL)) {
            String str4 = c28555BIp.LJIILL;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("report_content", str4);
        }
        if (!TextUtils.isEmpty(c28555BIp.LJIL)) {
            String str5 = c28555BIp.LJIL;
            o.LJIIIIZZ(str5, "model.videoId");
            hashMap.put("video_id", str5);
        }
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            String LIZLLL = C28594BKc.LIZJ().LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
            hashMap.put("enter_live_method", LIZLLL);
        }
        hashMap.put("small_picture_order", BJM.LJIILLIIL());
        hashMap.put("live_window_mode", BJM.LJIIJ());
        if (C15380j0.LJIILLIIL()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        long j = c28555BIp.LJIJI;
        if (j != 0) {
            hashMap.put("pin_id", String.valueOf(j));
            hashMap.put("pin_msg_id", String.valueOf(c28555BIp.LJIJJ));
        }
        long j2 = c28555BIp.LJIIZILJ;
        if (j2 > 0) {
            hashMap.put("message_id", String.valueOf(j2));
        }
        long j3 = c28555BIp.LJIJJLI;
        if (j3 > 0) {
            hashMap.put("message_release_id", String.valueOf(j3));
        }
        hashMap.put("report_click_time", String.valueOf(System.currentTimeMillis()));
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.putAll(BJB.LIZ());
        BZI LIZ = C28787BRn.LIZ("livesdk_live_user_report");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIJJ(c28555BIp.LJJI, WM7.SCENE_SERVICE);
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJJIIJZLJL();
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_report_user");
        LIZ2.LIZLLL("report_url", str);
        LIZ2.LJIIIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", c28555BIp.LJII);
        jSONObject.put("enter_method", c28555BIp.LJIIIIZZ);
        jSONObject.put("use_spark", z);
        jSONObject.put("report_url", str);
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C0K2.LJIIJJI(0, "ttlive_live_report_click", jSONObject);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Qu(long j, User user, InterfaceC28558BIs callback) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(callback, "callback");
        WeakReference weakReference = new WeakReference(callback);
        C1EW.LIZ(((MuteApi) C1A.LIZJ(MuteApi.class)).unmute(j, user.getId(), user.getSecUid())).LJJJLIIL(new AfS1S0200100_5(j, user, weakReference, 4), new AfS1S0200100_5(j, user, weakReference, 5));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void TI(BEX iKickOutView, long j, int i) {
        String str;
        InterfaceC05190Ih interfaceC05190Ih;
        o.LJIIIZ(iKickOutView, "iKickOutView");
        WeakReference weakReference = new WeakReference(iKickOutView);
        iKickOutView.LIZJ();
        KickOutApi kickOutApi = (KickOutApi) C1A.LIZJ(KickOutApi.class);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            str = interfaceC05190Ih.getSecUid();
        } else {
            str = null;
        }
        C1EW.LIZ(kickOutApi.getKickedOutList(j, 20, i, str)).LJJJLIIL(new AfS57S0100000_5(weakReference, 178), new AfS57S0100000_5(weakReference, 179));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final C28565BIz UZ(BaseFragment fragment, DataChannel dataChannel, C73318Sq2 compositeSubscription) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(compositeSubscription, "compositeSubscription");
        return new C28565BIz(fragment, dataChannel, compositeSubscription);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Ye0(long j, DataChannel dataChannel, int i) {
        ((AdminApi) C1A.LIZJ(AdminApi.class)).requestReportViolation(i, j).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS36S0101000_5(i, dataChannel, 17));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Z20(long j, long j2, BEO iHostIModerateView) {
        o.LJIIIZ(iHostIModerateView, "iHostIModerateView");
        WeakReference weakReference = new WeakReference(iHostIModerateView);
        C1EW.LIZ(((AdminApi) C1A.LIZJ(AdminApi.class)).delHostIModerator(j, j2)).LJJJLIIL(new AfS4S0100100_5(j, weakReference, 9), new AfS4S0100100_5(j, weakReference, 10));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void ar(BEX iMuteView, long j, int i) {
        String str;
        InterfaceC05190Ih interfaceC05190Ih;
        o.LJIIIZ(iMuteView, "iMuteView");
        WeakReference weakReference = new WeakReference(iMuteView);
        iMuteView.LIZJ();
        MuteApi muteApi = (MuteApi) C1A.LIZJ(MuteApi.class);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            str = interfaceC05190Ih.getSecUid();
        } else {
            str = null;
        }
        C1EW.LIZ(muteApi.getMuteList(j, 20, i, str)).LJJJLIIL(new AfS57S0100000_5(weakReference, 180), new AfS57S0100000_5(weakReference, 181));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void oo(Context context, C28555BIp model, DataChannel dataChannel) {
        o.LJIIIZ(model, "model");
        model.LJIILIIL = false;
        ((AdminApi) C1A.LIZJ(AdminApi.class)).requestReportViolation(6, model.LIZIZ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS20S0400000_5(this, context, model, dataChannel, 0), C28554BIo.LJLIL);
    }

    public static void LJ(String str, C28555BIp c28555BIp, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        String valueOf = String.valueOf(c28555BIp.LIZLLL);
        o.LJIIIIZZ(valueOf, "valueOf(model.reportedUserId)");
        hashMap.put("to_user_id", valueOf);
        String str3 = c28555BIp.LJI;
        o.LJIIIIZZ(str3, "model.requestPage");
        hashMap.put("request_page", str3);
        hashMap.put("event_page", "live_detail");
        hashMap.put("admin_type", LIZ(c28555BIp));
        if (o.LJ(c28555BIp.LJIILLIIL, "3")) {
            hashMap.put("report_type", "report_question");
        } else if (!TextUtils.isEmpty(c28555BIp.LJIILJJIL)) {
            String str4 = c28555BIp.LJIILJJIL;
            o.LJIIIIZZ(str4, "model.reportType");
            hashMap.put("report_type", str4);
        }
        if (!TextUtils.isEmpty(c28555BIp.LJIL)) {
            String str5 = c28555BIp.LJIL;
            o.LJIIIIZZ(str5, "model.videoId");
            hashMap.put("video_id", str5);
        }
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            String LIZLLL = C28594BKc.LIZJ().LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
            hashMap.put("enter_live_method", LIZLLL);
        }
        hashMap.put("small_picture_order", BJM.LJIILLIIL());
        hashMap.put("live_window_mode", BJM.LJIIJ());
        if (C15380j0.LJIILLIIL()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("enter_from", c28555BIp.LJII);
        jSONObject.put("enter_method", c28555BIp.LJIIIIZZ);
        jSONObject.put("use_spark", z);
        jSONObject.put("report_url", str);
        jSONObject.put("fail_reason", str2);
        C0K2.LJIIJJI(0, "ttlive_live_report_load_fail", jSONObject);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Ns(long j, User user, C05490Jl duration, InterfaceC28558BIs callback) {
        long j2;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(duration, "duration");
        o.LJIIIZ(callback, "callback");
        if (o.LJ(duration, C05490Jl.LIZIZ)) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        WeakReference weakReference = new WeakReference(callback);
        C1EW.LIZ(((MuteApi) C1A.LIZJ(MuteApi.class)).mute(j, user.getId(), j2, user.getSecUid(), duration.LIZ)).LJJJLIIL(new AfS1S0200100_5(j, user, weakReference, 2), new AfS1S0200100_5(j, user, weakReference, 3));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final DialogC28454BEs XI(Context context, long j, long j2, long j3, InterfaceC28453BEr interfaceC28453BEr) {
        return new DialogC28454BEs(context, j, j2, j3, interfaceC28453BEr);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void cW(InterfaceC28459BEx interfaceC28459BEx, boolean z, long j, long j2, String str) {
        WeakReference weakReference = new WeakReference(interfaceC28459BEx);
        if (z) {
            C1EW.LIZ(((KickOutApi) C1A.LIZJ(KickOutApi.class)).kickOut(j, j2)).LJJJLIIL(new AfS0S1110200_5(weakReference, z, str, j2, j, 0), new AfS0S0110200_5(weakReference, z, j, j2, 0));
        } else {
            C1EW.LIZ(((KickOutApi) C1A.LIZJ(KickOutApi.class)).unKickOut(j, j2)).LJJJLIIL(new AfS0S1110200_5(weakReference, false, str, j2, j, 1), new AfS0S0110200_5(weakReference, false, j, j2, 1));
        }
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void HR(BFA bfa, boolean z, BFC bfc, long j, long j2, String str) {
        int i;
        WeakReference weakReference = new WeakReference(bfa);
        AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        C1EW.LIZ(adminApi.updateAdmin(i, bfc.LIZ, j, j2)).LJJJLIIL(new C28457BEv(weakReference, z, bfc, j, j2, str), new AfS25S0110000_5(weakReference, z, 7));
    }
}
