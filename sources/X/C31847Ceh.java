package X;

import Y.ARunnableS0S1400000_5;
import Y.ARunnableS24S0200000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ceh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31847Ceh {
    public static final java.util.Map<EnumC31856Ceq, C48459J0d<java.util.Map<String, String>>> LIZ;

    public static void LIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-1589062154671385225")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC31856Ceq enumC31856Ceq = EnumC31856Ceq.INNER;
        C48459J0d<java.util.Map<String, String>> LIVE_SUBSCRIBE_LINK_SHARE_INNER = InterfaceC30442Bx8.LJLJJI;
        o.LJIIIIZZ(LIVE_SUBSCRIBE_LINK_SHARE_INNER, "LIVE_SUBSCRIBE_LINK_SHARE_INNER");
        linkedHashMap.put(enumC31856Ceq, LIVE_SUBSCRIBE_LINK_SHARE_INNER);
        EnumC31856Ceq enumC31856Ceq2 = EnumC31856Ceq.OUTER;
        C48459J0d<java.util.Map<String, String>> LIVE_SUBSCRIBE_LINK_SHARE_OUTER = InterfaceC30442Bx8.LJLJJL;
        o.LJIIIIZZ(LIVE_SUBSCRIBE_LINK_SHARE_OUTER, "LIVE_SUBSCRIBE_LINK_SHARE_OUTER");
        linkedHashMap.put(enumC31856Ceq2, LIVE_SUBSCRIBE_LINK_SHARE_OUTER);
        LIZ = linkedHashMap;
    }

    public static String LIZIZ() {
        C65124PhA.LIZLLL().getClass();
        java.util.Map LIZIZ = C65124PhA.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = C113554cx.LJJJLIIL();
        }
        String str = (String) LIZIZ.get("fake_region");
        String str2 = (String) LIZIZ.get("carrier_region");
        String str3 = (String) LIZIZ.get("sys_region");
        String str4 = (String) LIZIZ.get("app_language");
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str3)) {
                    str = str4;
                } else {
                    str = str3;
                }
            } else {
                str = str2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        o.LJI(str);
        Locale locale = Locale.US;
        return OKG.LIZJ(locale, "US", str, locale, "this as java.lang.String).toUpperCase(locale)");
    }

    public static void LIZJ(InterfaceC88472Yns interfaceC88472Yns) {
        C31859Cet failCB = C31859Cet.LJLIL;
        o.LJIIIZ(failCB, "failCB");
        C65814PsI.LIZ().getClass();
        ((SubscribeApi) C65814PsI.LIZJ(SubscribeApi.class)).getSpotlightInfo(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId())).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 333), new AfS57S0100000_5(failCB, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 333));
    }

    public static Bitmap LIZLLL(Context context, View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(context.getResources().getDisplayMetrics().densityDpi);
        if (view.getDrawingCacheBackgroundColor() != 0) {
            createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
        }
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(view, canvas);
        return createBitmap;
    }

    public static List LJ(InterfaceC88472Yns predicate, List list) {
        o.LJIIIZ(predicate, "predicate");
        for (Object obj : list) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (obj != null) {
                    List LLJILJILJ = ORZ.LLJILJILJ(list);
                    ((ArrayList) LLJILJILJ).remove(obj);
                    ListProtector.add(LLJILJILJ, 0, obj);
                    return LLJILJILJ;
                }
                return list;
            }
        }
        return list;
    }

    public static Object LJIIL(Bitmap bitmap, UFU ufu) {
        if (bitmap == null) {
            return null;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(ufu));
        C38995FSd.LIZLLL().execute(new ARunnableS24S0200000_5(bitmap, new C31857Cer(c84654XKg), 86));
        return c84654XKg.LIZ();
    }

    public static C28467BFf LJIILIIL(String str, byte[] bArr) {
        C65126PhC LIZ2;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("https://");
        LIZ3.append(((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getHostDomain());
        LIZ3.append("/webcast/resource/upload/");
        String LIZIZ = X1D.LIZIZ(LIZ3);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, str));
        Uri.Builder buildUpon = UriProtector.parse(LIZIZ).buildUpon();
        buildUpon.appendQueryParameter(WM7.SCENE_SERVICE, "tikcast_subscription");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("SubLinkShareImgLoadListener uploadFile error: ");
            LIZ4.append(e);
            C0NB.LIZ(X1D.LIZIZ(LIZ4));
        }
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "formatUriBuilder.build().toString()");
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String mimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String md5Stub = multipartTypedOutput.md5Stub();
        LIZLLL.getClass();
        try {
            LIZ2 = ((C65123Ph9) C65124PhA.LJI(-1, uri, arrayList, mimeType, byteArray, length, md5Stub)).LIZ();
        } catch (Exception e2) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("SubLinkShareImgLoadListener uploadFile error: ");
            LIZ5.append(e2);
            C0NB.LIZ(X1D.LIZIZ(LIZ5));
        }
        if (LIZ2 == null) {
            return null;
        }
        byte[] bArr2 = LIZ2.LJ;
        o.LJIIIIZZ(bArr2, "httpResponse.body");
        String str2 = new String(bArr2, PVC.LIZ);
        if (LIZ2.LIZIZ != 200) {
            return null;
        }
        Gson gson = C09650Zl.LIZIZ;
        C28467BFf c28467BFf = (C28467BFf) GsonProtectorUtils.fromJson(gson, str2, new C31858Ces().getType());
        try {
            if (c28467BFf.statusCode != 0) {
                c28467BFf.LJ = (RequestError) gson.LJI(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "data").toString(), RequestError.class);
            }
        } catch (Exception e3) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("SubLinkShareImgLoadListener uploadFile error: ");
            LIZ6.append(e3);
            C0NB.LIZ(X1D.LIZIZ(LIZ6));
        }
        return c28467BFf;
    }

    public static void LJI(Context context, String showEntrance, String str) {
        o.LJIIIZ(showEntrance, "showEntrance");
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveSubscriptionAnchorUrlSetting.c2cTransGuidePage());
        c32364Cn2.LIZJ("c2c_trans_page_info", str);
        c32364Cn2.LIZJ("show_entrance", showEntrance);
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("priority_region", LIZIZ());
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(c32364Cn2.LIZLLL()));
    }

    public static void LJIIIIZZ(Context context, String url, java.util.Map map) {
        o.LJIIIZ(url, "url");
        if (context == null) {
            return;
        }
        C29714BlO c29714BlO = new C29714BlO();
        android.net.Uri parse = UriProtector.parse(url);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        Uri.Builder builder = c29714BlO.LIZIZ;
        if (builder != null) {
            builder.scheme(parse.getScheme());
        }
        Uri.Builder builder2 = c29714BlO.LIZIZ;
        if (builder2 != null) {
            builder2.authority(parse.getAuthority());
        }
        Iterator LIZ2 = C47117IeP.LIZ(parse, "uri.queryParameterNames");
        while (LIZ2.hasNext()) {
            String key = (String) LIZ2.next();
            String queryParameter = UriProtector.getQueryParameter(parse, key);
            if (queryParameter != null) {
                o.LJIIIIZZ(key, "key");
                c29714BlO.LJIIIIZZ(key, queryParameter);
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c29714BlO.LJIIIIZZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(c29714BlO.LIZ().toString()));
    }

    public static void LJIIJJI(boolean z, C30988CEe c30988CEe, InterfaceC31860Ceu interfaceC31860Ceu) {
        if (z) {
            if (c30988CEe.LIZ.length() > 0 && c30988CEe.LIZIZ.length() > 0 && interfaceC31860Ceu != null) {
                interfaceC31860Ceu.LIZ(c30988CEe);
                return;
            }
            return;
        }
        if (interfaceC31860Ceu == null) {
            return;
        }
        interfaceC31860Ceu.LIZLLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0069, code lost:
    
        if (r0.isSubscribed() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(android.content.Context r4, com.bytedance.android.livesdkapi.depend.model.live.Room r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.Cn2 r2 = new X.Cn2
            r2.<init>(r6)
            X.B83 r0 = X.B83.LIZ()
            X.BgP r3 = r0.LIZIZ()
            long r0 = r5.getOwnerUserId()
            X.Bfu r3 = (X.C29374Bfu) r3
            java.lang.String r1 = r3.LIZJ(r0)
            java.lang.String r0 = "anchor_id"
            r2.LIZJ(r0, r1)
            java.lang.String r3 = "room_id"
            long r0 = r5.getId()
            r2.LIZIZ(r0, r3)
            java.lang.String r1 = X.BJM.LJFF()
            java.lang.String r0 = "enter_from_merge"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = X.BJM.LJIIIIZZ()
            java.lang.String r0 = "enter_method"
            r2.LIZJ(r0, r1)
            java.lang.String r0 = "show_entrance"
            r2.LIZJ(r0, r7)
            java.lang.String r1 = X.BJM.LJIILIIL()
            java.lang.String r0 = "request_id"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = X.BJM.LJIJ()
            java.lang.String r0 = "video_id"
            r2.LIZJ(r0, r1)
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L89
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L89
            boolean r0 = r0.isSubscribed()
            r1 = 1
            if (r0 != r1) goto L89
        L6b:
            java.lang.String r0 = "is_subscribe"
            r2.LIZ(r1, r0)
            java.lang.String r0 = r2.LIZLLL()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "parse(builder.build())"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r4, r1)
            return
        L89:
            r1 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31847Ceh.LJII(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.String):void");
    }

    public static void LJIIJ(int i, int i2, View view, Context context, String str, EnumC31856Ceq enumC31856Ceq, C39579Fg7 c39579Fg7) {
        if (i != i2) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS0S1400000_5(view, context, c39579Fg7, enumC31856Ceq, str, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(androidx.constraintlayout.widget.ConstraintLayout r18, X.C47061t0 r19, X.C47061t0 r20, androidx.constraintlayout.widget.ConstraintLayout r21, X.C47061t0 r22, X.C47061t0 r23, X.C47061t0 r24, android.content.Context r25, X.InterfaceC31860Ceu r26) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31847Ceh.LJIIIZ(androidx.constraintlayout.widget.ConstraintLayout, X.1t0, X.1t0, androidx.constraintlayout.widget.ConstraintLayout, X.1t0, X.1t0, X.1t0, android.content.Context, X.Ceu):void");
    }

    public static void LJFF(Context context, String url, String previousPage, String enterFrom, String eventPage, String anchorID, String roomID, String clickPosition, boolean z, java.util.Map map, String containerType, String liveType, int i) {
        if ((i & 32) != 0) {
            anchorID = "";
        }
        if ((i & 64) != 0) {
            roomID = "";
        }
        if ((i & 128) != 0) {
            clickPosition = "";
        }
        if ((i & 256) != 0) {
            z = false;
        }
        if ((i & 512) != 0) {
            map = null;
        }
        if ((i & 1024) != 0) {
            containerType = "page";
        }
        if ((i & 2048) != 0) {
            liveType = "";
        }
        o.LJIIIZ(url, "url");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventPage, "eventPage");
        o.LJIIIZ(anchorID, "anchorID");
        o.LJIIIZ(roomID, "roomID");
        o.LJIIIZ(clickPosition, "clickPosition");
        o.LJIIIZ(containerType, "containerType");
        o.LJIIIZ(liveType, "liveType");
        C32364Cn2 c32364Cn2 = new C32364Cn2(url);
        c32364Cn2.LIZJ("previous_page", previousPage);
        c32364Cn2.LIZJ("show_entrance", enterFrom);
        c32364Cn2.LIZJ("entrance_from", enterFrom);
        c32364Cn2.LIZJ("container_type", containerType);
        c32364Cn2.LIZJ("priority_region", LIZIZ());
        c32364Cn2.LIZJ("event_page", eventPage);
        if (!z) {
            c32364Cn2.LIZJ("mask_bg_color", "00000000");
        }
        c32364Cn2.LIZJ("anchor_id", anchorID);
        c32364Cn2.LIZJ("room_id", roomID);
        c32364Cn2.LIZJ("click_position", clickPosition);
        c32364Cn2.LIZJ("live_type", liveType);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c32364Cn2.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(c32364Cn2.LIZLLL()));
    }
}
