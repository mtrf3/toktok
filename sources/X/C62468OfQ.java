package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OfQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62468OfQ {
    public static long LIZJ;
    public static long LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static String LJIILJJIL;
    public static String LJIILL;
    public static Boolean LJIILLIIL;
    public static Boolean LJIIZILJ;
    public static boolean LJIJ;
    public static String LJIJI;
    public static String LJIJJ;
    public static String LJIL;
    public static String LJJ;
    public static int LJJII;
    public static final ArrayList<JSONObject> LIZ = new ArrayList<>();
    public static final ArrayList<JSONObject> LIZIZ = new ArrayList<>();
    public static int LJIJJLI = 1;
    public static String LJJI = "";
    public static String LJJIFFI = "";
    public static String LJJIII = "";
    public static int LJJIIJ = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC62225ObV interfaceC62225ObV) {
        String str;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (interfaceC62225ObV != null) {
            str = interfaceC62225ObV.key();
        } else {
            str = null;
        }
        jSONObject.put("platform", str);
        jSONObject.put("expose_time", System.currentTimeMillis());
        if (interfaceC62225ObV != null) {
            z = interfaceC62225ObV.LJIILJJIL();
        } else {
            z = 0;
        }
        jSONObject.put("enabled", !z);
        LIZ.add(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r2) {
        /*
            X.Ofg r1 = X.C62494Ofq.LIZ
            r0 = 0
            if (r1 == 0) goto L21
            if (r2 == 0) goto L9
            java.lang.String r0 = r2.itemType
        L9:
            boolean r1 = r1.LJIIIIZZ(r0)
            r0 = 1
            if (r1 != r0) goto L21
            if (r2 == 0) goto L1e
            android.os.Bundle r1 = r2.extras
            if (r1 == 0) goto L1e
            java.lang.String r0 = "aid"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L20
        L1e:
            java.lang.String r0 = ""
        L20:
            return r0
        L21:
            if (r2 == 0) goto L1e
            java.lang.String r0 = r2.identifier
            if (r0 != 0) goto L20
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62468OfQ.LIZJ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):java.lang.String");
    }

    public static void LIZLLL(boolean z) {
        LIZ.clear();
        LIZIZ.clear();
        LIZLLL = 0L;
        LJ = null;
        LJFF = null;
        LJI = null;
        LJII = null;
        LJIIIIZZ = null;
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = null;
        LJIIL = null;
        LJIILIIL = null;
        LJIILJJIL = null;
        LJIILL = null;
        LJIILLIIL = null;
        LJIIZILJ = null;
        LJIJ = z;
        LJIJI = null;
        LJJI = "";
        LJJIFFI = "";
        LJJII = 0;
        LJJIII = "";
    }

    public static void LJIIIIZZ(C62387Oe7 c62387Oe7) {
        BaseSharePackage baseSharePackage;
        Bundle bundle;
        String string;
        Bundle bundle2;
        InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
        if (interfaceC62736Ojk != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("open share panel cost: ");
            LIZ2.append(LIZLLL - LIZJ);
            interfaceC62736Ojk.i("SharePanelExposure", X1D.LIZIZ(LIZ2));
        }
        String str = null;
        if (c62387Oe7 != null) {
            baseSharePackage = c62387Oe7.LJIIJ;
        } else {
            baseSharePackage = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("enter_method", LJFF);
        linkedHashMap.put("panel_source", LJI);
        linkedHashMap.put("item_type", LJII);
        linkedHashMap.put("item_id", LJIIIIZZ);
        linkedHashMap.put("show_performance_duration", Long.valueOf(LIZLLL - LIZJ));
        linkedHashMap.put("group_id", LJIIIZ);
        linkedHashMap.put("function_show", LJIIJ);
        if (C113944da.LIZ(c62387Oe7)) {
            linkedHashMap.put("full_channel_list", LJIIJJI);
        }
        linkedHashMap.put("is_new_panel", Integer.valueOf(LJIJ ? 1 : 0));
        linkedHashMap.put("author_id", LJIJI);
        linkedHashMap.put("now_type", LJIJJ);
        if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
            str = bundle2.getString("share_campaign_id");
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("holiday_id", str);
        linkedHashMap.put("is_today", Integer.valueOf(LJIJJLI));
        linkedHashMap.put("is_self", LJJI);
        linkedHashMap.put("privacy_setting", LJJIFFI);
        linkedHashMap.put("detail_tab_name", LJJIII);
        linkedHashMap.put("is_first_show_after_cold_launch", Integer.valueOf(LJJIIJ));
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("l8_user_edit_status")) != null) {
            str2 = string;
        }
        linkedHashMap.put("l8_user_edit_status", str2);
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("show_panel_function", linkedHashMap);
        }
        LIZLLL = 0L;
        LIZJ = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0120, code lost:
    
        if (r0 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0091, code lost:
    
        if (r0 != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.C62387Oe7 r6) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62468OfQ.LJIIIZ(X.Oe7):void");
    }

    public static void LJIIJ(TuxSheet tuxSheet) {
        if (LIZJ == 0) {
            LIZJ = System.currentTimeMillis();
        }
        if (tuxSheet != null) {
            int hashCode = tuxSheet.hashCode();
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                Integer valueOf = Integer.valueOf(hashCode);
                ((HashMap) C19560pk.LIZ).put(valueOf, Boolean.TRUE);
                return;
            }
            " Must run on the main thread: set dialogFragment can expose".toString();
            throw new IllegalStateException(" Must run on the main thread: set dialogFragment can expose");
        }
    }

    public static void LIZIZ(TuxSheet tuxSheet, C62387Oe7 c62387Oe7) {
        Dialog dialog;
        int i;
        View decorView;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null) {
            Window window = dialog.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                i = decorView.hashCode();
            } else {
                i = 0;
            }
            Integer tag = Integer.valueOf(i);
            o.LJIIIZ(tag, "tag");
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                Iterator it = C13930gf.LJ(C13930gf.LJII()).entrySet().iterator();
                while (it.hasNext()) {
                    if (o.LJ(((C15210ij) ((Map.Entry) it.next()).getValue()).LIZLLL, tag)) {
                        it.remove();
                    }
                }
                Iterator it2 = C13930gf.LJFF(C13930gf.LJII()).iterator();
                while (it2.hasNext()) {
                    if (o.LJ(((C17040lg) it2.next()).getDialogTag$btm_release(), tag)) {
                        it2.remove();
                    }
                }
            } else {
                throw new Exception("clearWithGroupTag must run on the main thread");
            }
        }
        LJIJ = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("panel_source", LJI);
        linkedHashMap.put("item_type", LJII);
        linkedHashMap.put("item_id", LJIIIIZZ);
        linkedHashMap.put("exposed_channel_list", LIZ.toString());
        if (C113944da.LIZ(c62387Oe7)) {
            linkedHashMap.put("full_channel_list", LJIIJJI);
        }
        linkedHashMap.put("detail_tab_name", LJJIII);
        linkedHashMap.put("is_expand", Integer.valueOf(LJJII));
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("exposed_share_panel_channels", linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", LJ);
        linkedHashMap2.put("panel_source", LJI);
        linkedHashMap2.put("item_type", LJII);
        linkedHashMap2.put("item_id", LJIIIIZZ);
        linkedHashMap2.put("exposed_action_list", LIZIZ.toString());
        linkedHashMap2.put("function_show", LJIIJ);
        linkedHashMap2.put("detail_tab_name", LJJIII);
        InterfaceC114054dl interfaceC114054dl2 = C62494Ofq.LIZIZ;
        if (interfaceC114054dl2 != null) {
            interfaceC114054dl2.LIZIZ("exposed_share_panel_actions", linkedHashMap2);
        }
    }

    public static void LJ(boolean z, BaseSharePackage baseSharePackage) {
        String str;
        String str2;
        String str3;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Integer num = null;
        if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null) {
            str = bundle3.getString("share_template_id");
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (baseSharePackage == null || (bundle2 = baseSharePackage.extras) == null || (str2 = bundle2.getString("enter_from")) == null) {
            str2 = "";
        }
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("panel_source")) != null) {
            str4 = string;
        }
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            str3 = interfaceC62484Ofg.LJIIJJI(baseSharePackage);
        } else {
            str3 = null;
        }
        LinkedHashMap LIZIZ2 = JF1.LIZIZ("enter_from", str2, "panel_source", str4);
        LIZIZ2.put("item_type", str3);
        LIZIZ2.put("item_id", LIZJ(baseSharePackage));
        LIZIZ2.put("unique_id", LJIILIIL);
        if (str.length() > 0) {
            LIZIZ2.put("cover_template_id", str);
        }
        LIZIZ2.put("platform", LJIILJJIL);
        Boolean bool = LJIILLIIL;
        if (bool != null) {
            num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        LIZIZ2.put("enabled", num);
        LIZIZ2.put("is_new_panel", Integer.valueOf(z ? 1 : 0));
        LIZIZ2.put("detail_tab_name", LJJIII);
        LIZIZ2.put("is_expand", Integer.valueOf(LJJII));
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("channel_clicked_end", LIZIZ2);
        }
    }

    public static final void LJI(AST reason, BaseSharePackage baseSharePackage) {
        String str;
        o.LJIIIZ(reason, "reason");
        if (reason instanceof C62551Ogl) {
            str = "click_function";
        } else if (reason instanceof C62553Ogn) {
            str = "share_video_out";
        } else if (reason instanceof C107694Kn) {
            str = "share_video";
        } else if (reason instanceof C62554Ogo) {
            str = "click_outside";
        } else if (reason instanceof C62552Ogm) {
            str = "ai_avatar_share_icon";
        } else {
            str = "slide_down";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("panel_source", LJI);
        linkedHashMap.put("group_id", LJIIIZ);
        linkedHashMap.put("enter_method", str);
        if (baseSharePackage != null) {
            Bundle bundle = baseSharePackage.extras;
            if (bundle.containsKey("longPressDownX")) {
                linkedHashMap.put("x", Integer.valueOf(bundle.getInt("longPressDownX")));
            }
            if (bundle.containsKey("longPressDownY")) {
                linkedHashMap.put("y", Integer.valueOf(bundle.getInt("longPressDownY")));
            }
        }
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("close_panel", linkedHashMap);
        }
    }

    public static void LJFF(BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        LJIILIIL = UUID.randomUUID().toString();
        Integer num = null;
        if (interfaceC62225ObV != null) {
            str = interfaceC62225ObV.key();
        } else {
            str = null;
        }
        String str6 = "";
        if (str == null) {
            str = "";
        }
        LJIILJJIL = str;
        if (interfaceC62225ObV != null) {
            z2 = interfaceC62225ObV.LJIILJJIL();
        } else {
            z2 = true;
        }
        LJIILLIIL = Boolean.valueOf(!z2);
        if (baseSharePackage == null || (bundle4 = baseSharePackage.extras) == null || (str2 = bundle4.getString("share_template_id")) == null) {
            str2 = "";
        }
        if (baseSharePackage == null || (bundle3 = baseSharePackage.extras) == null || (str3 = bundle3.getString("enter_from")) == null) {
            str3 = "";
        }
        if (baseSharePackage == null || (bundle2 = baseSharePackage.extras) == null || (str4 = bundle2.getString("enter_method")) == null) {
            str4 = "";
        }
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("panel_source")) != null) {
            str6 = string;
        }
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            str5 = interfaceC62484Ofg.LJIIJJI(baseSharePackage);
        } else {
            str5 = null;
        }
        LinkedHashMap LIZIZ2 = JF1.LIZIZ("enter_from", str3, "enter_method", str4);
        LIZIZ2.put("panel_source", str6);
        LIZIZ2.put("item_type", str5);
        LIZIZ2.put("item_id", LIZJ(baseSharePackage));
        LIZIZ2.put("unique_id", LJIILIIL);
        LIZIZ2.put("platform", LJIILJJIL);
        Boolean bool = LJIILLIIL;
        if (bool != null) {
            num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        LIZIZ2.put("enabled", num);
        LIZIZ2.put("is_new_panel", Integer.valueOf(z ? 1 : 0));
        LIZIZ2.put("OG_type", LJIL);
        if (str2.length() > 0) {
            LIZIZ2.put("cover_template_id", str2);
        }
        LIZIZ2.put("position", LJJ);
        LIZIZ2.put("is_today", Integer.valueOf(LJIJJLI));
        LIZIZ2.put("is_self", LJJI);
        LIZIZ2.put("privacy_setting", LJJIFFI);
        LIZIZ2.put("is_expand", Integer.valueOf(LJJII));
        LIZIZ2.put("detail_tab_name", LJJIII);
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("channel_clicked_start", LIZIZ2);
        }
    }

    public static void LJII(BaseSharePackage baseSharePackage, String sharePlatform, String str, String str2, String isSelf, int i) {
        String privacySetting;
        Bundle bundle;
        if ((i & 16) != 0) {
            isSelf = "1";
        }
        String str3 = null;
        if ((i & 32) != 0) {
            privacySetting = "";
        } else {
            privacySetting = null;
        }
        o.LJIIIZ(sharePlatform, "sharePlatform");
        o.LJIIIZ(isSelf, "isSelf");
        o.LJIIIZ(privacySetting, "privacySetting");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("share_platform", sharePlatform);
        linkedHashMap.put("share_result", str);
        linkedHashMap.put("share_device_id", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        linkedHashMap.put("now_type", str2);
        linkedHashMap.put("is_self", isSelf);
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            str3 = bundle.getString("is_today");
        }
        linkedHashMap.put("is_today", str3);
        linkedHashMap.put("privacy_setting", privacySetting);
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("share_video_finish", linkedHashMap);
        }
    }
}
