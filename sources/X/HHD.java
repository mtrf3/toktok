package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.common.applog.AppLog;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.feed.platform.componentmanager.mob.ClickCoreFdmtComponentEvent;
import com.ss.android.ugc.feed.platform.componentmanager.mob.ClickCoreFdmtComponentParamProvider;
import com.ss.android.ugc.feed.platform.componentmanager.mob.ClickCoreFdmtParamProvider;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes8.dex */
public final class HHD implements InterfaceC77774Ufi, O0Z {
    public static final HHD LJLIL = new HHD();

    public static final String LIZLLL(int i) {
        return i == R.string.e32 ? "discard" : i == R.string.e2u ? "discard_edits" : i == R.string.e39 ? "start_over" : i == R.string.e33 ? "continue_record" : i == R.string.e38 ? "save_draft" : i == R.string.e3z ? "back_to_trim" : i == R.string.e40 ? "record_again" : i == R.string.e2v ? "quit_editing" : "";
    }

    public void LJIIJ(C78856UxA c78856UxA) {
        o.LJIIIZ(c78856UxA, "<anonymous parameter 0>");
    }

    @Override // X.O0Z
    public void onComplete() {
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.GPP r10) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HHD.LIZ(X.GPP):void");
    }

    public static final String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int i = videoPublishEditModel.mShootMode;
        if (i == 15) {
            return "quick";
        }
        if (i == 10 || i == 11 || i == 14 || i == 18) {
            return "camera";
        }
        if (o.LJ(videoPublishEditModel.mShootWay, "duet")) {
            return "duet";
        }
        if (o.LJ(videoPublishEditModel.mShootWay, "stitch")) {
            return "stitch";
        }
        if (videoPublishEditModel.isTemplateMv()) {
            return "template";
        }
        return "upload";
    }

    public static final int LJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C43723HDz.LJI(videoPublishEditModel.mShootWay)) {
            return 1;
        }
        return 0;
    }

    public static boolean LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.d("TTVideoEngine", "url null, may not use p2p");
            return false;
        }
        if (!str.contains("http://127.0.0.1") && !str.contains("mdl://")) {
            TTVideoEngineLog.d("TTVideoEngine", "url not 127 or mdl protocol, may not use p2p");
            return false;
        }
        if (!str.contains("cdn_type")) {
            TTVideoEngineLog.d("TTVideoEngine", "url not contain cdntype, may not use p2p");
            return false;
        }
        TTVideoEngineLog.d("TTVideoEngine", "url  may use p2p");
        return true;
    }

    public static final void LJIIIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C145995oB LIZIZ = LIZIZ(model, "video_edit_page");
        LIZIZ.LJI("enter_method_popup", LIZJ(model));
        LIZIZ.LIZ(model.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        LIZIZ.LIZ(H8F.LJIIL(model), "is_multi_content");
        LIZIZ.LJI("shoot_tab_name", H7R.LJJ(model));
        LIZIZ.LIZ(LJI(model), "is_from_external");
        FMX.LJIIL("show_exit_shoot_popup", LIZIZ.LIZ);
    }

    public static java.util.Map LJIIJJI(C47160If6 c47160If6) {
        if (c47160If6 == null || TextUtils.isEmpty(c47160If6.LIZIZ(32))) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(32, c47160If6.LIZIZ(32));
        return hashMap;
    }

    public static final C145995oB LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        C145995oB LIZ = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ.LJI("enter_from", str);
        Q8U.LIZJ(LIZ, "shoot_way", videoPublishEditModel.mShootWay, videoPublishEditModel, "creation_id");
        LIZ.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LIZ.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        return LIZ;
    }

    public static C47160If6 LJ(InterfaceC47616ImS interfaceC47616ImS, long j) {
        List<C47160If6> LIZLLL = interfaceC47616ImS.LIZLLL();
        if (j > 0 && LIZLLL != null) {
            for (C47160If6 c47160If6 : LIZLLL) {
                if (c47160If6 != null && c47160If6.LIZ() != 1 && c47160If6.getResolution() != null && c47160If6.LIZLLL(3) == j) {
                    return c47160If6;
                }
            }
        }
        return null;
    }

    public static boolean LJFF(int i, ViewGroup viewGroup) {
        String str;
        o.LJIIIZ(viewGroup, "viewGroup");
        if (i == 0 && o.LJ("is_avoided", viewGroup.getTag(C8QI.LJ))) {
            C60392Yp.LIZIZ("feed_component_manager", "This customView is avoid by Feed Component Manager, please onCall for Feed RD");
            return true;
        }
        if (8 == i) {
            Object tag = viewGroup.getTag(C8QI.LJIIIIZZ);
            if (!(tag instanceof String) || (str = (String) tag) == null) {
                str = "unknown";
            }
            java.util.Set<String> set = C7WI.LIZIZ;
            if ((set == null || set.contains(str)) && HHG.LIZIZ.add(str)) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("This customView ", str, "  visibility been set gone unexpectedly ");
                LIZIZ.append(android.util.Log.getStackTraceString(new Throwable()));
                C60392Yp.LIZIZ("feed_component_manager", X1D.LIZIZ(LIZIZ));
            }
        }
        return false;
    }

    public static final void LJIIIIZZ(VideoPublishEditModel model, String str) {
        o.LJIIIZ(model, "model");
        C145995oB LIZIZ = LIZIZ(model, "video_edit_page");
        LIZIZ.LJI("enter_method_popup", LIZJ(model));
        LIZIZ.LJI("to_status", str);
        LIZIZ.LIZ(model.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        LIZIZ.LIZ(H8F.LJIIL(model), "is_multi_content");
        LIZIZ.LJI("shoot_tab_name", H7R.LJJ(model));
        LIZIZ.LIZ(LJI(model), "is_from_external");
        FMX.LJIIL("exit_shoot_popup_result", LIZIZ.LIZ);
    }

    public static void LJIIL(MotionEvent motionEvent, ViewGroup viewGroup) {
        Integer valueOf;
        String str;
        String str2;
        String str3;
        InterfaceC88471Ynr<String, C188727au, C76800UCe> interfaceC88471Ynr;
        String str4;
        String str5;
        String str6;
        View LIZIZ;
        o.LJIIIZ(viewGroup, "viewGroup");
        if (FRY.LIZ()) {
            java.util.Map<String, String> map = null;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || valueOf.intValue() == 0 || valueOf.intValue() == 2) {
                return;
            }
            if (valueOf.intValue() == 1) {
                boolean LIZ = C53664L4i.LIZ(C211118Qh.LJ);
                boolean LIZIZ2 = C53664L4i.LIZIZ(C211118Qh.LIZLLL);
                if ((!LIZ && !LIZIZ2) || !C37301EkT.LIZ()) {
                    return;
                }
                View LIZIZ3 = C37301EkT.LIZIZ(viewGroup);
                while ((LIZIZ3 instanceof ViewGroup) && (LIZIZ = C37301EkT.LIZIZ((ViewGroup) LIZIZ3)) != null) {
                    LIZIZ3 = LIZIZ;
                }
                if (LIZIZ3 == null) {
                    return;
                }
                Object tag = viewGroup.getTag(C8QI.LJFF);
                if (!(tag instanceof C211638Sh)) {
                    return;
                }
                C211638Sh c211638Sh = (C211638Sh) tag;
                String str7 = c211638Sh.LJLJJLL;
                Object tag2 = LIZIZ3.getTag(C8QI.LJI);
                if (tag2 == null) {
                    tag2 = "";
                }
                C8T7 e2 = c211638Sh.LJLIL.e2();
                if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(c211638Sh.LJLIL.o0()) || ORZ.LJLJJI(str7, C211118Qh.LIZ) || o.LJ("no_click", tag2) || ORZ.LJLJJI(str7, C210888Pk.LIZJ)) {
                    return;
                }
                String str8 = c211638Sh.LJLJI.matchedContainerKey;
                viewGroup.getContext();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", C211118Qh.LIZLLL);
                Aweme aweme = C211118Qh.LIZJ;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("group_id", str);
                Aweme aweme2 = C211118Qh.LIZJ;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("author_id", str2);
                c188727au.LJIIIZ("component_key", str7);
                c188727au.LJIIIZ("component_type", str8);
                String str9 = "negative";
                if (o.LJ("negative", tag2)) {
                    str3 = "negative";
                } else {
                    str3 = "positive";
                }
                c188727au.LJIIIZ("status", str3);
                String LJIIJ = c188727au.LJIIJ("enter_from");
                String componentKey = c188727au.LJIIJ("component_key");
                if (ujb.o.LJJJJIZL("homepage_hot", LJIIJ, true)) {
                    o.LJIIIIZZ(componentKey, "componentKey");
                    if (s.LJJJLZIJ(componentKey, "anchor", false)) {
                        C211648Si.LJI++;
                    }
                }
                if (e2 != null) {
                    interfaceC88471Ynr = e2.LIZIZ;
                } else {
                    interfaceC88471Ynr = null;
                }
                if (interfaceC88471Ynr != null) {
                    InterfaceC88471Ynr<String, C188727au, C76800UCe> interfaceC88471Ynr2 = e2.LIZIZ;
                    if (interfaceC88471Ynr2 != null) {
                        interfaceC88471Ynr2.invoke("click_core_fdmt_component", c188727au);
                    }
                } else {
                    FMX.LJIIL("click_core_fdmt_component", c188727au.LIZ);
                }
                if (!((Boolean) HHJ.LIZ.getValue()).booleanValue()) {
                    return;
                }
                InterfaceC55235Lm3 interfaceC55235Lm3 = C211118Qh.LJI;
                if (interfaceC55235Lm3 != null) {
                    HHE hhe = new HHE(0);
                    hhe.LJLJJI = C211118Qh.LIZLLL;
                    Aweme aweme3 = C211118Qh.LIZJ;
                    if (aweme3 != null) {
                        str5 = aweme3.getAid();
                    } else {
                        str5 = null;
                    }
                    hhe.LJLJJL = str5;
                    Aweme aweme4 = C211118Qh.LIZJ;
                    if (aweme4 != null) {
                        str6 = aweme4.getAuthorUid();
                    } else {
                        str6 = null;
                    }
                    hhe.LJLIL = str6;
                    hhe.LJLILLLLZI = str7;
                    hhe.LJLJI = str8;
                    if (!o.LJ("negative", tag2)) {
                        str9 = "positive";
                    }
                    hhe.LJLJJLL = str9;
                    C62814Ol0.LJJIIJZLJL(interfaceC55235Lm3, ClickCoreFdmtComponentParamProvider.class, C47261Igj.LJJIJIL(new ClickCoreFdmtParamProvider(interfaceC55235Lm3, hhe)));
                }
                InterfaceC55235Lm3 interfaceC55235Lm32 = C211118Qh.LJI;
                if (interfaceC55235Lm32 != null) {
                    Object newInstance = ClickCoreFdmtComponentEvent.class.newInstance();
                    o.LJIIIIZZ(newInstance, "eventClz.newInstance()");
                    AbstractC63695OzD abstractC63695OzD = (AbstractC63695OzD) newInstance;
                    List LJIJ = C62814Ol0.LJIJ(interfaceC55235Lm32, ClickCoreFdmtComponentParamProvider.class);
                    if (LJIJ != null) {
                        Iterator it = ((ArrayList) LJIJ).iterator();
                        while (it.hasNext()) {
                            InterfaceC54035LIp param = ((EventParamsProtocol) it.next()).getParam();
                            if (param != null) {
                                abstractC63695OzD.LJ(param);
                            }
                        }
                    }
                    if (abstractC63695OzD != null) {
                        java.util.Map<String, String> map2 = c188727au.LIZ;
                        o.LJIIIIZZ(map2, "oldParam.builder()");
                        C227928x2.LIZ("click_core_fdmt_component", map2, abstractC63695OzD);
                        str4 = abstractC63695OzD.LIZ;
                        map = abstractC63695OzD.LIZJ();
                        FMX.LJIIL(str4, map);
                        return;
                    }
                }
                str4 = null;
                FMX.LJIIL(str4, map);
                return;
            }
            valueOf.intValue();
        }
    }

    @Override // X.InterfaceC77774Ufi
    public void onEventV3(String str, JSONObject jSONObject) {
        AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0L, 0L, jSONObject);
    }
}
