package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Y4n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86793Y4n implements InterfaceC126624y2, InterfaceC81635W2d {
    public static InterfaceC29074Bb4 LJLIL;

    public static final CompileConfigResolution LJ() {
        CompileConfigResolution LIZ = new C44641HfZ(new C44639HfX("", false, 1)).LIZ();
        C60903NvH.LJIIJJI().LJJIIJ();
        return LIZ;
    }

    public static java.util.Map LJIJI() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        C19U.LIZLLL(arrayList, "BB", "BM", "BS", "CA");
        C19U.LIZLLL(arrayList, "DM", "DO", "GD", "GU");
        C19U.LIZLLL(arrayList, "JM", "KN", "KY", "LC");
        C19U.LIZLLL(arrayList, "MP", "MS", "PR", "SX");
        C19U.LIZLLL(arrayList, "TC", "TT", "VC", "VG");
        ArrayList LJII = JBR.LJII(arrayList, "VI", 1, hashMap, arrayList, 2);
        LJII.add("RU");
        LJII.add("KZ");
        hashMap.put(7, LJII);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("EG");
        hashMap.put(36, C47959Irz.LJ(34, hashMap, C47959Irz.LJ(33, hashMap, C47959Irz.LJ(32, hashMap, C47959Irz.LJ(31, hashMap, C47959Irz.LJ(30, hashMap, C47959Irz.LJ(27, hashMap, C47959Irz.LJ(20, hashMap, arrayList2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add("IT");
        arrayList3.add("VA");
        hashMap.put(43, C47959Irz.LJ(41, hashMap, C47959Irz.LJ(40, hashMap, C47959Irz.LJ(39, hashMap, arrayList3, 1, "RO"), 1, "CH"), 1, "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, C47959Irz.LJ(45, hashMap, arrayList5, 1, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, C47959Irz.LJ(58, hashMap, C47959Irz.LJ(57, hashMap, C47959Irz.LJ(56, hashMap, C47959Irz.LJ(55, hashMap, C47959Irz.LJ(54, hashMap, C47959Irz.LJ(53, hashMap, C47959Irz.LJ(52, hashMap, C47959Irz.LJ(51, hashMap, C47959Irz.LJ(49, hashMap, C47959Irz.LJ(48, hashMap, C47959Irz.LJ(47, hashMap, arrayList6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        ArrayList LJII2 = JBR.LJII(arrayList7, "CX", 61, hashMap, arrayList7, 1);
        ArrayList LJII3 = JBR.LJII(LJII2, "ID", 62, hashMap, LJII2, 1);
        ArrayList LJII4 = JBR.LJII(LJII3, "PH", 63, hashMap, LJII3, 1);
        ArrayList LJII5 = JBR.LJII(LJII4, "NZ", 64, hashMap, LJII4, 1);
        ArrayList LJII6 = JBR.LJII(LJII5, "SG", 65, hashMap, LJII5, 1);
        ArrayList LJII7 = JBR.LJII(LJII6, "TH", 66, hashMap, LJII6, 1);
        ArrayList LJII8 = JBR.LJII(LJII7, "JP", 81, hashMap, LJII7, 1);
        ArrayList LJII9 = JBR.LJII(LJII8, "KR", 82, hashMap, LJII8, 1);
        ArrayList LJII10 = JBR.LJII(LJII9, "VN", 84, hashMap, LJII9, 1);
        ArrayList LJII11 = JBR.LJII(LJII10, "CN", 86, hashMap, LJII10, 1);
        ArrayList LJII12 = JBR.LJII(LJII11, "TR", 90, hashMap, LJII11, 1);
        ArrayList LJII13 = JBR.LJII(LJII12, "IN", 91, hashMap, LJII12, 1);
        ArrayList LJII14 = JBR.LJII(LJII13, "PK", 92, hashMap, LJII13, 1);
        ArrayList LJII15 = JBR.LJII(LJII14, "AF", 93, hashMap, LJII14, 1);
        ArrayList LJII16 = JBR.LJII(LJII15, "LK", 94, hashMap, LJII15, 1);
        ArrayList LJII17 = JBR.LJII(LJII16, "MM", 95, hashMap, LJII16, 1);
        ArrayList LJII18 = JBR.LJII(LJII17, "IR", 98, hashMap, LJII17, 1);
        ArrayList LJII19 = JBR.LJII(LJII18, "SS", 211, hashMap, LJII18, 2);
        LJII19.add("MA");
        LJII19.add("EH");
        hashMap.put(212, LJII19);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("DZ");
        hashMap.put(261, C47959Irz.LJ(260, hashMap, C47959Irz.LJ(258, hashMap, C47959Irz.LJ(257, hashMap, C47959Irz.LJ(256, hashMap, C47959Irz.LJ(255, hashMap, C47959Irz.LJ(254, hashMap, C47959Irz.LJ(253, hashMap, C47959Irz.LJ(252, hashMap, C47959Irz.LJ(251, hashMap, C47959Irz.LJ(LiveCoverMinSizeSetting.DEFAULT, hashMap, C47959Irz.LJ(249, hashMap, C47959Irz.LJ(248, hashMap, C47959Irz.LJ(247, hashMap, C47959Irz.LJ(246, hashMap, C47959Irz.LJ(245, hashMap, C47959Irz.LJ(244, hashMap, C47959Irz.LJ(243, hashMap, C47959Irz.LJ(242, hashMap, C47959Irz.LJ(241, hashMap, C47959Irz.LJ(240, hashMap, C47959Irz.LJ(239, hashMap, C47959Irz.LJ(238, hashMap, C47959Irz.LJ(237, hashMap, C47959Irz.LJ(236, hashMap, C47959Irz.LJ(235, hashMap, C47959Irz.LJ(234, hashMap, C47959Irz.LJ(233, hashMap, C47959Irz.LJ(232, hashMap, C47959Irz.LJ(231, hashMap, C47959Irz.LJ(230, hashMap, C47959Irz.LJ(229, hashMap, C47959Irz.LJ(228, hashMap, C47959Irz.LJ(227, hashMap, C47959Irz.LJ(226, hashMap, C47959Irz.LJ(225, hashMap, C47959Irz.LJ(224, hashMap, C47959Irz.LJ(223, hashMap, C47959Irz.LJ(222, hashMap, C47959Irz.LJ(221, hashMap, C47959Irz.LJ(220, hashMap, C47959Irz.LJ(218, hashMap, C47959Irz.LJ(216, hashMap, C47959Irz.LJ(213, hashMap, arrayList8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        ArrayList arrayList9 = new ArrayList(2);
        arrayList9.add("RE");
        arrayList9.add("YT");
        hashMap.put(269, C47959Irz.LJ(268, hashMap, C47959Irz.LJ(267, hashMap, C47959Irz.LJ(266, hashMap, C47959Irz.LJ(265, hashMap, C47959Irz.LJ(264, hashMap, C47959Irz.LJ(263, hashMap, C47959Irz.LJ(262, hashMap, arrayList9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        ArrayList arrayList10 = new ArrayList(2);
        arrayList10.add("SH");
        arrayList10.add("TA");
        hashMap.put(357, C47959Irz.LJ(356, hashMap, C47959Irz.LJ(355, hashMap, C47959Irz.LJ(354, hashMap, C47959Irz.LJ(353, hashMap, C47959Irz.LJ(352, hashMap, C47959Irz.LJ(351, hashMap, C47959Irz.LJ(350, hashMap, C47959Irz.LJ(299, hashMap, C47959Irz.LJ(298, hashMap, C47959Irz.LJ(297, hashMap, C47959Irz.LJ(291, hashMap, C47959Irz.LJ(BuildConfig.VERSION_CODE, hashMap, arrayList10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("FI");
        arrayList11.add("AX");
        hashMap.put(509, C47959Irz.LJ(508, hashMap, C47959Irz.LJ(507, hashMap, C47959Irz.LJ(506, hashMap, C47959Irz.LJ(505, hashMap, C47959Irz.LJ(504, hashMap, C47959Irz.LJ(503, hashMap, C47959Irz.LJ(502, hashMap, C47959Irz.LJ(501, hashMap, C47959Irz.LJ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, hashMap, C47959Irz.LJ(423, hashMap, C47959Irz.LJ(421, hashMap, C47959Irz.LJ(420, hashMap, C47959Irz.LJ(389, hashMap, C47959Irz.LJ(387, hashMap, C47959Irz.LJ(386, hashMap, C47959Irz.LJ(385, hashMap, C47959Irz.LJ(383, hashMap, C47959Irz.LJ(382, hashMap, C47959Irz.LJ(381, hashMap, C47959Irz.LJ(380, hashMap, C47959Irz.LJ(378, hashMap, C47959Irz.LJ(377, hashMap, C47959Irz.LJ(376, hashMap, C47959Irz.LJ(375, hashMap, C47959Irz.LJ(374, hashMap, C47959Irz.LJ(373, hashMap, C47959Irz.LJ(372, hashMap, C47959Irz.LJ(371, hashMap, C47959Irz.LJ(370, hashMap, C47959Irz.LJ(359, hashMap, C47959Irz.LJ(358, hashMap, arrayList11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        ArrayList arrayList12 = new ArrayList(3);
        arrayList12.add("GP");
        arrayList12.add("BL");
        ArrayList LJII20 = JBR.LJII(arrayList12, "MF", 590, hashMap, arrayList12, 1);
        ArrayList LJII21 = JBR.LJII(LJII20, "BO", 591, hashMap, LJII20, 1);
        ArrayList LJII22 = JBR.LJII(LJII21, "GY", 592, hashMap, LJII21, 1);
        ArrayList LJII23 = JBR.LJII(LJII22, "EC", 593, hashMap, LJII22, 1);
        ArrayList LJII24 = JBR.LJII(LJII23, "GF", 594, hashMap, LJII23, 1);
        ArrayList LJII25 = JBR.LJII(LJII24, "PY", 595, hashMap, LJII24, 1);
        ArrayList LJII26 = JBR.LJII(LJII25, "MQ", 596, hashMap, LJII25, 1);
        ArrayList LJII27 = JBR.LJII(LJII26, "SR", 597, hashMap, LJII26, 1);
        ArrayList LJII28 = JBR.LJII(LJII27, "UY", 598, hashMap, LJII27, 2);
        LJII28.add("CW");
        LJII28.add("BQ");
        hashMap.put(599, LJII28);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("TL");
        hashMap.put(998, C47959Irz.LJ(996, hashMap, C47959Irz.LJ(995, hashMap, C47959Irz.LJ(994, hashMap, C47959Irz.LJ(993, hashMap, C47959Irz.LJ(992, hashMap, C47959Irz.LJ(979, hashMap, C47959Irz.LJ(977, hashMap, C47959Irz.LJ(976, hashMap, C47959Irz.LJ(975, hashMap, C47959Irz.LJ(974, hashMap, C47959Irz.LJ(973, hashMap, C47959Irz.LJ(972, hashMap, C47959Irz.LJ(971, hashMap, C47959Irz.LJ(970, hashMap, C47959Irz.LJ(968, hashMap, C47959Irz.LJ(967, hashMap, C47959Irz.LJ(966, hashMap, C47959Irz.LJ(965, hashMap, C47959Irz.LJ(964, hashMap, C47959Irz.LJ(963, hashMap, C47959Irz.LJ(962, hashMap, C47959Irz.LJ(961, hashMap, C47959Irz.LJ(960, hashMap, C47959Irz.LJ(888, hashMap, C47959Irz.LJ(886, hashMap, C47959Irz.LJ(883, hashMap, C47959Irz.LJ(882, hashMap, C47959Irz.LJ(881, hashMap, C47959Irz.LJ(880, hashMap, C47959Irz.LJ(878, hashMap, C47959Irz.LJ(870, hashMap, C47959Irz.LJ(856, hashMap, C47959Irz.LJ(855, hashMap, C47959Irz.LJ(853, hashMap, C47959Irz.LJ(852, hashMap, C47959Irz.LJ(850, hashMap, C47959Irz.LJ(808, hashMap, C47959Irz.LJ(800, hashMap, C47959Irz.LJ(692, hashMap, C47959Irz.LJ(691, hashMap, C47959Irz.LJ(690, hashMap, C47959Irz.LJ(689, hashMap, C47959Irz.LJ(688, hashMap, C47959Irz.LJ(687, hashMap, C47959Irz.LJ(686, hashMap, C47959Irz.LJ(685, hashMap, C47959Irz.LJ(683, hashMap, C47959Irz.LJ(682, hashMap, C47959Irz.LJ(681, hashMap, C47959Irz.LJ(680, hashMap, C47959Irz.LJ(679, hashMap, C47959Irz.LJ(678, hashMap, C47959Irz.LJ(677, hashMap, C47959Irz.LJ(676, hashMap, C47959Irz.LJ(675, hashMap, C47959Irz.LJ(674, hashMap, C47959Irz.LJ(673, hashMap, C47959Irz.LJ(672, hashMap, C47959Irz.LJ(670, hashMap, arrayList13, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CompileConfigResolution LJIIIIZZ() {
        if (C44762HhW.LIZ()) {
            return new CompileConfigResolution(1080, 1920, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
        }
        return new CompileConfigResolution(720, 1280, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
    }

    public /* synthetic */ C86793Y4n() {
    }

    public /* synthetic */ C86793Y4n(InterfaceC124924vI editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        new C126634y3(editorContext);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0U4, X.0UC] */
    public static Object LIZ(C0X3 c0x3) {
        boolean z;
        ?? r0;
        C0U7 LIZJ = C0U7.LIZJ();
        ?? r1 = LIZJ.LIZ;
        if ((r1 != 0 && r1.LIZJ(c0x3.LJLIL)) || LIZJ.LIZIZ.LIZJ(c0x3.LJLIL)) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            if (!c0x3.LJLJJL) {
                C0UD LIZLLL = C0U7.LIZJ().LIZLLL(c0x3);
                if (LIZLLL != null && (r0 = LIZLLL.LIZIZ) != 0) {
                    obj = r0.LIZ(LIZLLL);
                }
            } else {
                obj = C0U7.LIZJ().LIZIZ(c0x3);
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("not support this capability!");
            LIZ.append(c0x3.LJLIL);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(5);
        }
        C09010Wz c09010Wz = C09000Wy.LIZ;
        c09010Wz.getClass();
        C0YN.LIZ(3);
        c09010Wz.LIZIZ.lock();
        try {
            c09010Wz.LJ.remove(c0x3);
            ((HashMap) c09010Wz.LIZJ).remove(c0x3.LJLIL);
            return obj;
        } finally {
            c09010Wz.LIZIZ.unlock();
        }
    }

    public static final void LJIIIZ(TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene) {
        SAAActivity sAAActivity;
        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(tikTokCameraBaseGroupScene);
        if (LJIIJJI != null && LJIIJJI.LLJJIJIIJIL(tikTokCameraBaseGroupScene)) {
            LJIIJJI.LLJJ(tikTokCameraBaseGroupScene, EnumC146655pF.FROM_TRANSLUCENT);
            Activity activity = tikTokCameraBaseGroupScene.mActivity;
            if ((activity instanceof SAAActivity) && (sAAActivity = (SAAActivity) activity) != null) {
                sAAActivity.LLIIIJ(tikTokCameraBaseGroupScene);
            }
        }
    }

    public static final C1JQ LJIIJ(double d) {
        if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return new C1JQ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, Math.sqrt(Math.abs(d)));
        }
        return new C1JQ(Math.sqrt(d), LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }

    public static int LJIILIIL(double d) {
        Context applicationContext;
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg == null || (applicationContext = interfaceC62484Ofg.getApplicationContext()) == null || applicationContext.getResources() == null || applicationContext.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        return (int) ((d * applicationContext.getResources().getDisplayMetrics().density) + 0.5d);
    }

    public static final boolean LJIILL(AVMusic aVMusic) {
        boolean z;
        o.LJIIIZ(aVMusic, "<this>");
        String LJIILLIIL = LJIILLIIL(aVMusic);
        if (LJIILLIIL == null || LJIILLIIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final String LJIILLIIL(AVMusic aVMusic) {
        String str;
        o.LJIIIZ(aVMusic, "<this>");
        if (aVMusic.isLocalMusic()) {
            str = aVMusic.path;
        } else {
            int i = aVMusic.musicType;
            if (i == MusicModel.MusicType.ONLINE.ordinal() || i == MusicModel.MusicType.REUSE_AUDIO.ordinal()) {
                str = C78934UyQ.LJLIL.getMusicService().LJIIJJI(aVMusic);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str) || TEVideoUtils.nativeCheckAudioFile(str) != 0) {
            return null;
        }
        return str;
    }

    public static final AbstractC42651GoZ LJIJ(WM7 wm7) {
        o.LJIIIZ(wm7, "<this>");
        while (wm7 != null) {
            if (wm7 instanceof AbstractC42651GoZ) {
                return (AbstractC42651GoZ) wm7;
            }
            wm7 = wm7.mParentScene;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Effect LJIJJ(AbstractC77373UYf abstractC77373UYf) {
        o.LJIIIZ(abstractC77373UYf, "<this>");
        if (abstractC77373UYf instanceof UYY) {
            return ((UYY) abstractC77373UYf).LIZ();
        }
        return new Effect(null, 1, 0 == true ? 1 : 0);
    }

    public static final ActivityC45651qj LJIJJLI(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            o.LJII(baseContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return (ActivityC45651qj) baseContext;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("can not convert ");
        LIZ.append(context);
        LIZ.append(" to activity.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public static final Fragment LJIL(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof C8W0) {
            Fragment LIZLLL = C212428Vi.LIZLLL(lifecycleOwner);
            if (LIZLLL != null) {
                return LIZLLL;
            }
            throw new IllegalStateException("can not find fragment.");
        }
        throw new IllegalStateException("can not find fragment.");
    }

    public static final EnumC74991Tbv LJJ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        o.LJIIIZ(multiLiveAnchorPanelSettings, "<this>");
        int i = multiLiveAnchorPanelSettings.layoutType;
        if (i == 1) {
            if (multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                return EnumC74991Tbv.FLOAT_FIX;
            }
        } else if (i != 1) {
            if (i == 0) {
                if (multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                    return EnumC74991Tbv.GRID_FIX;
                }
                if (multiLiveAnchorPanelSettings.fixMicNumAction == 1) {
                    return EnumC74991Tbv.GRID_FLOAT;
                }
                return null;
            }
            return null;
        }
        if (multiLiveAnchorPanelSettings.fixMicNumAction == 1) {
            return EnumC74991Tbv.FLOAT;
        }
        return null;
    }

    public static final EnumC74991Tbv LJJI(MultiLiveLayoutInfo multiLiveLayoutInfo) {
        o.LJIIIZ(multiLiveLayoutInfo, "<this>");
        int i = multiLiveLayoutInfo.anchorNewLayout;
        if (i == 1) {
            if (multiLiveLayoutInfo.fixSwitchOn == 0) {
                return EnumC74991Tbv.FLOAT_FIX;
            }
        } else if (i != 1) {
            if (i == 0) {
                if (multiLiveLayoutInfo.fixSwitchOn == 0) {
                    return EnumC74991Tbv.GRID_FIX;
                }
                if (multiLiveLayoutInfo.fixSwitchOn == 1) {
                    return EnumC74991Tbv.GRID_FLOAT;
                }
                return null;
            }
            return null;
        }
        if (multiLiveLayoutInfo.fixSwitchOn == 1) {
            return EnumC74991Tbv.FLOAT;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJJIFFI(AbstractC77373UYf abstractC77373UYf) {
        String str;
        o.LJIIIZ(abstractC77373UYf, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tabName=");
        if (abstractC77373UYf instanceof UYY) {
            str = ((UYY) abstractC77373UYf).getTabName();
        } else {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(", effect= name=");
        LIZ.append(LJIJJ(abstractC77373UYf).getName());
        LIZ.append(", effect_id=");
        LIZ.append(LJIJJ(abstractC77373UYf).getEffect_id());
        LIZ.append(", svc_speaker_id=");
        LIZ.append(OUP.LJJJLZIJ(LJIJJ(abstractC77373UYf)));
        return X1D.LIZIZ(LIZ);
    }

    public static String LJJII(String str) {
        String str2;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            e = e;
            str2 = "";
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key is:");
            LIZ.append(str);
            LIZ.append(" prop is: ");
            LIZ.append(str2);
            C0NB.LIZIZ("SystemPropertiesUtil", X1D.LIZIZ(LIZ));
        } catch (Exception e2) {
            e = e2;
            C0NB.LJFF("SystemPropertiesUtil", "read the content of build.prop exception.", e);
            return str2;
        }
        return str2;
    }

    public static final RootCellComponent LJJIII(C2MA c2ma) {
        VideoViewCell videoViewCell;
        if (!(c2ma instanceof VideoViewCell) || (videoViewCell = (VideoViewCell) c2ma) == null) {
            return null;
        }
        return videoViewCell.LLLLIIIILLL;
    }

    public static final C80796VnM LJJIIJ(IViewPagerAbility iViewPagerAbility) {
        View view = iViewPagerAbility.getView();
        if (view instanceof C80796VnM) {
            return (C80796VnM) view;
        }
        return null;
    }

    public static final AbstractC42651GoZ LJJIJIIJIL(WM7 wm7) {
        o.LJIIIZ(wm7, "<this>");
        AbstractC42651GoZ LJIJ = LJIJ(wm7);
        if (LJIJ != null) {
            return LJIJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String LJJIL(AbstractC77373UYf abstractC77373UYf) {
        o.LJIIIZ(abstractC77373UYf, "<this>");
        return OUP.LJJJLZIJ(LJIJJ(abstractC77373UYf));
    }

    public static final EnumC60689Nrp LJJIZ(android.net.Uri toKitType) {
        String host;
        o.LJIIJ(toKitType, "$this$toKitType");
        if (toKitType.isHierarchical() && (host = toKitType.getHost()) != null) {
            if (s.LJJJLZIJ(host, "lynxview", false)) {
                return EnumC60689Nrp.LYNX;
            }
            if (s.LJJJLZIJ(host, "webview", false)) {
                return EnumC60689Nrp.WEB;
            }
        }
        return EnumC60689Nrp.UNKNOWN;
    }

    public static void LIZIZ(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
    }

    public static final AbstractC40333FsH LJIIJJI(Class cls, InterfaceC88472Yns interfaceC88472Yns) {
        try {
            AbstractC40333FsH abstractC40333FsH = (AbstractC40333FsH) cls.newInstance();
            Bundle bundle = new Bundle();
            interfaceC88472Yns.invoke(bundle);
            abstractC40333FsH.LIZ = bundle;
            return abstractC40333FsH;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return null;
        }
    }

    public static final List LJIIZILJ(int i, List list) {
        o.LJIIIZ(list, "<this>");
        if (list.size() <= i) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        float size = ((list.size() - 1) * 1.0f) / (i - 1);
        int i2 = i - 2;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                arrayList.add(ListProtector.get(list, Math.round(i3 * size)));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        arrayList.add(ORZ.LLFF(list));
        return arrayList;
    }

    public static final boolean LJJIIZ(AbstractC77373UYf abstractC77373UYf, AbstractC77373UYf item) {
        o.LJIIIZ(abstractC77373UYf, "<this>");
        o.LJIIIZ(item, "item");
        return !LJJIIZI(abstractC77373UYf, item);
    }

    public static final boolean LJJIIZI(AbstractC77373UYf abstractC77373UYf, AbstractC77373UYf item) {
        o.LJIIIZ(abstractC77373UYf, "<this>");
        o.LJIIIZ(item, "item");
        if (o.LJ(abstractC77373UYf, item) || o.LJ(LJIJJ(abstractC77373UYf).getEffect_id(), LJIJJ(item).getEffect_id())) {
            return true;
        }
        return false;
    }

    public static final long LJJIJIIJI(float f, long j) {
        if (Float.isNaN(f) || f >= 1.0f) {
            return j;
        }
        return C11850dJ.LIZIZ(j, C11850dJ.LIZLLL(j) * f);
    }

    @Override // X.InterfaceC81635W2d
    public void LIZLLL(C8HR c8hr, C74365TGn c74365TGn) {
        if (c74365TGn != null) {
            c74365TGn.show();
        }
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(0);
    }

    @Override // X.InterfaceC81635W2d
    public void LJI(BottomSheetBehavior bottomSheetBehavior, C8HR c8hr) {
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                return;
            } else {
                bottomSheetBehavior.setState(5);
            }
        }
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }

    public static void LIZJ(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            sb.append(str);
            sb.append(".\"");
            sb.append(str2);
            sb.append('\"');
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(X.ActivityC45651qj r5, java.lang.String r6, X.IBE r7) {
        /*
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = new com.ss.android.socialbase.downloader.model.DownloadInfo
            r0.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r0 == 0) goto L18
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.String r0 = "url=null"
            r1.<init>(r2, r0)
        L18:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L20
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto L27
        L20:
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.String r0 = "network error"
            r1.<init>(r2, r0)
        L27:
            java.nio.charset.Charset r0 = X.PVC.LIZ
            byte[] r1 = r6.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.io.File r0 = com.ss.android.ugc.aweme.effectplatform.EffectPlatform.LJLJJI
            java.lang.String r0 = r0.getAbsolutePath()
            r1.append(r0)
            java.lang.String r4 = java.io.File.separator
            java.lang.String r0 = X.JBR.LJFF(r1, r4, r2, r1)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = X.C84261X5d.with(r5)
            r2.url(r6)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r3.getParent()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.savePath(r0)
            java.lang.String r0 = r3.getName()
            r2.name(r0)
            r2.mainThreadListener(r7)
            r0 = 1
            r2.retryCount(r0)
            r2.download()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86793Y4n.LJIIL(X.1qj, java.lang.String, X.IBE):void");
    }

    public static final void LJJIJ(VideoPublishEditModel model, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(model, "model");
        if (z) {
            str = "click_draft";
        } else {
            str = "click_publish";
        }
        long currentTimeMillis = System.currentTimeMillis() - model.creativeModel.transientPostPageModel.LJIIIIZZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", model.mShootWay);
        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(model));
        c188727au.LJIIIZ("content_type", H7R.LJIIIZ(model));
        c188727au.LJIIIZ("creation_id", model.getCreationId());
        c188727au.LJIIIZ("save_draft_scene", str);
        c188727au.LJ(currentTimeMillis, "save_draft_duration");
        c188727au.LIZLLL(!z2 ? 1 : 0, "save_draft_success");
        FMX.LJIIL("publish_page_finish", c188727au.LIZ);
    }

    public static final Bitmap LJJIJIL(Bitmap bitmap, float f, float f2) {
        float width = f / bitmap.getWidth();
        float height = f2 / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(width, height);
        Bitmap result = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        o.LJIIIIZZ(result, "result");
        return result;
    }

    public static final void LJJIJLIJ(int i, int i2, C62846OlW c62846OlW) {
        ViewGroup.LayoutParams layoutParams = c62846OlW.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        c62846OlW.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // X.InterfaceC81635W2d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJII(com.google.android.material.bottomsheet.BottomSheetBehavior r3, X.C8HR r4, X.C74365TGn r5) {
        /*
            r2 = this;
            r1 = 5
            if (r3 == 0) goto L15
            int r0 = r3.getState()
            if (r0 != r1) goto L12
        L9:
            if (r4 != 0) goto Lc
        Lb:
            return
        Lc:
            r0 = 8
            r4.setVisibility(r0)
            goto Lb
        L12:
            r3.setState(r1)
        L15:
            if (r5 == 0) goto L9
            r5.hide()
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86793Y4n.LJII(com.google.android.material.bottomsheet.BottomSheetBehavior, X.8HR, X.TGn):void");
    }

    public static final void LJIILJJIL(StaticLayout staticLayout, Canvas canvas, float f, float f2) {
        o.LJIIIZ(canvas, "canvas");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            staticLayout.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
    
        if (r4 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJZLJL(X.R2P r4, X.InterfaceC88472Yns r5, kotlin.jvm.internal.AqS17S0500000_13 r6, int r7) {
        /*
            r0 = r7 & 2
            r3 = 0
            if (r0 == 0) goto L6
            r5 = r3
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r6 = r3
        Lb:
            if (r4 == 0) goto L36
            int r0 = r4.statusCode
            if (r0 != 0) goto L23
            T r0 = r4.data
            if (r0 == 0) goto L23
            T r0 = r4.data
            if (r0 == 0) goto L21
            if (r5 == 0) goto L20
            T r0 = r4.data
            r5.invoke(r0)
        L20:
            return
        L21:
            if (r4 == 0) goto L36
        L23:
            com.bytedance.android.live.network.response.RequestError r0 = r4.LJ
            if (r0 == 0) goto L36
            java.lang.String r1 = r0.message
            if (r1 == 0) goto L36
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            if (r6 == 0) goto L20
            r6.invoke(r0)
            goto L20
        L36:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "change state failed: "
            r1.append(r0)
            if (r4 == 0) goto L49
            int r0 = r4.statusCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L49:
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86793Y4n.LJJIIJZLJL(X.R2P, X.Yns, kotlin.jvm.internal.AqS17S0500000_13, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.graphics.Bitmap, java.lang.Object] */
    public static final boolean LJJIJL(Bitmap bitmap, String str, String str2, boolean z) {
        FileOutputStream fileOutputStream;
        o.LJIIIZ(bitmap, "<this>");
        if (!o.LJ("mounted", C16880lQ.LLLLLLLZIL())) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(file);
        LIZ.append('/');
        LIZ.append(str2);
        File file2 = new File(X1D.LIZIZ(LIZ));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
                r2 = 90;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = r2;
        }
        try {
            if (z) {
                if (Build.VERSION.SDK_INT >= 30) {
                    bitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, 90, fileOutputStream);
                } else {
                    bitmap.compress(Bitmap.CompressFormat.WEBP, 90, fileOutputStream);
                }
            } else {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            }
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
                return true;
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            r2 = fileOutputStream;
            C16880lQ.LLLLIIL(e);
            try {
                o.LJI(r2);
                r2.close();
            } catch (Exception e5) {
                C16880lQ.LLLLIIL(e5);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            try {
                o.LJI(fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e6) {
                C16880lQ.LLLLIIL(e6);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC81635W2d
    public void LJFF(BottomSheetBehavior bottomSheetBehavior, C8HR c8hr, C74365TGn c74365TGn, Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            if (bottomSheetBehavior != null) {
                if (bottomSheetBehavior.getState() == 5) {
                    return;
                } else {
                    bottomSheetBehavior.setState(5);
                }
            }
            if (c74365TGn != null) {
                c74365TGn.LLJILJIL(0);
            }
            if (c8hr == null) {
                return;
            }
            c8hr.setVisibility(0);
            return;
        }
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                return;
            } else {
                bottomSheetBehavior.setState(5);
            }
        }
        if (c74365TGn != null) {
            c74365TGn.LLJILJIL(0);
        }
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }
}
