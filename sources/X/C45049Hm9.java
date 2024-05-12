package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Hm9 */
/* loaded from: classes8.dex */
public final class C45049Hm9 {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ void LIZIZ(String str) {
        LIZ(LogLevel.LEVEL_INFO, str);
    }

    public static String LIZJ(List list) {
        if (list == null || list.isEmpty()) {
            return "empty";
        }
        boolean z = list instanceof Collection;
        if (z && list.isEmpty()) {
            return "videos";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((AutoCutMediaModel) it.next()).isVideoType) {
                if (z && list.isEmpty()) {
                    return "photos";
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!(!((AutoCutMediaModel) it2.next()).isVideoType)) {
                        return "mix";
                    }
                }
                return "photos";
            }
        }
        return "videos";
    }

    public static final long LIZLLL(long j) {
        if (j < 0) {
            return -1L;
        }
        return System.currentTimeMillis() - j;
    }

    public static OSJ LJ(List list) {
        int i;
        int i2 = 0;
        if (list != null) {
            i = list.size();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AutoCutMediaModel) obj).isVideoType) {
                    arrayList.add(obj);
                }
            }
            i2 = arrayList.size();
        } else {
            i = 0;
        }
        return new OSJ(Integer.valueOf(i), Integer.valueOf(i - i2), Integer.valueOf(i2));
    }

    public static String LJFF(Meta meta) {
        String str;
        o.LJIIIZ(meta, "meta");
        StringBuilder LIZ2 = X1D.LIZ();
        if (meta.LJFF()) {
            str = "video";
        } else {
            str = "image";
        }
        LIZ2.append(str);
        LIZ2.append(" | ");
        LIZ2.append(C44687HgJ.LJIIJJI(meta.LIZLLL()));
        LIZ2.append(" | ");
        LIZ2.append(meta.LIZLLL());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJI(NLEModel nLEModel) {
        EnumC123874tb enumC123874tb;
        EnumC123874tb enumC123874tb2;
        if (nLEModel == null) {
            return "NLEModel is null";
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null) {
            return null;
        }
        VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIILL, 10));
        Iterator<NLETrackSlot> it = LJIILL.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJI());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            NLESegment nLESegment = (NLESegment) next;
            NLEResourceNode LIZIZ = nLESegment.LIZIZ();
            if (LIZIZ != null) {
                enumC123874tb = LIZIZ.LJFF();
            } else {
                enumC123874tb = null;
            }
            if (enumC123874tb != EnumC123874tb.VIDEO) {
                NLEResourceNode LIZIZ2 = nLESegment.LIZIZ();
                if (LIZIZ2 != null) {
                    enumC123874tb2 = LIZIZ2.LJFF();
                } else {
                    enumC123874tb2 = null;
                }
                if (enumC123874tb2 == EnumC123874tb.IMAGE) {
                }
            }
            arrayList2.add(next);
        }
        return ORZ.LLD(arrayList2, null, null, null, C122614rZ.LJLIL, 31);
    }

    public static final void LIZ(LogLevel logLevel, String str) {
        o.LJIIIZ(logLevel, "logLevel");
        int i = C134065Ny.LIZ[logLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        FP1.LJ("AutoCutProcess ", str);
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("AutoCutProcess ");
                    LIZ2.append(str);
                    H78.LJII(X1D.LIZIZ(LIZ2));
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AutoCutProcess ");
                LIZ3.append(str);
                H78.LIZJ(X1D.LIZIZ(LIZ3));
                return;
            }
            FP1.LJ("AutoCutProcess ", str);
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("AutoCutProcess ");
        LIZ4.append(str);
        H78.LJI(X1D.LIZIZ(LIZ4));
    }

    public static void LJJIFFI(String str, java.util.Map map, boolean z) {
        int i;
        C6BK c6bk = new C6BK();
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                c6bk.LIZLLL((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C09900aA.LJIIJJI(str, i, c6bk.LJ());
    }

    public static final void LJIJJ(String str, String str2, String str3, String str4) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", str);
        c145995oB.LJI("enter_from", str2);
        c145995oB.LJI("shoot_way", str3);
        c145995oB.LJI("creation_id", str4);
        FMX.LJIIL("show_autocut", c145995oB.LIZ);
    }

    public static final void LJIIL(String str, String str2, int i, String str3, UnorderedMapStrStr unorderedMapStrStr) {
        String str4;
        String str5;
        String str6;
        C145995oB c145995oB;
        String str7;
        android.net.Uri parse;
        String str8 = null;
        try {
            parse = UriProtector.parse(str2);
            str4 = parse.getHost();
            try {
            } catch (Exception unused) {
                str5 = null;
            }
        } catch (Exception unused2) {
            str4 = null;
            str5 = null;
        }
        if (o.LJ(str4, "effect_platform")) {
            str5 = UriProtector.getQueryParameter(parse, "resource_id");
            try {
                str8 = UriProtector.getQueryParameter(parse, "panel");
            } catch (Exception unused3) {
            }
            str6 = str8;
            str8 = str5;
            c145995oB = new C145995oB();
            c145995oB.LJI("source", str);
            c145995oB.LJI("resource_id", str8);
            c145995oB.LJI("panel", str6);
            c145995oB.LJI("host", str4);
            c145995oB.LJI("urs", str2);
            c145995oB.LIZ(i, "error_code");
            c145995oB.LJI("error_msg", str3);
            c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
            if (unorderedMapStrStr != null && (str7 = (String) unorderedMapStrStr.get("effect_error_code")) != null) {
                c145995oB.LIZLLL("effect_error_code", str7);
            }
            FMX.LJIIL("tool_performance_autocut_download_effect_fail", c145995oB.LIZ);
        }
        str6 = null;
        c145995oB = new C145995oB();
        c145995oB.LJI("source", str);
        c145995oB.LJI("resource_id", str8);
        c145995oB.LJI("panel", str6);
        c145995oB.LJI("host", str4);
        c145995oB.LJI("urs", str2);
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str3);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        if (unorderedMapStrStr != null) {
            c145995oB.LIZLLL("effect_error_code", str7);
        }
        FMX.LJIIL("tool_performance_autocut_download_effect_fail", c145995oB.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r7.size() > 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel> r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "enterDM"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            if (r7 == 0) goto L7f
            int r0 = r7.size()
            r6 = 1
            if (r0 <= r6) goto L7f
        Le:
            X.OSJ r2 = LJ(r7)
            java.lang.Object r0 = r2.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r2.getThird()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.5oB r2 = new X.5oB
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.LJI(r0, r8)
            if (r12 != 0) goto L7c
            java.lang.String r5 = "upload"
        L3e:
            java.lang.String r0 = "content_source"
            r2.LJI(r0, r5)
            java.lang.String r0 = "shoot_way"
            r2.LJI(r0, r9)
            java.lang.String r0 = "is_multi_content"
            r2.LIZ(r6, r0)
            java.lang.String r0 = "creation_id"
            r2.LJI(r0, r10)
            java.lang.String r0 = "content_cnt"
            r2.LIZ(r1, r0)
            java.lang.String r1 = LIZJ(r7)
            java.lang.String r0 = "content_form"
            r2.LJI(r0, r1)
            java.lang.String r0 = "pic_cnt"
            r2.LIZ(r4, r0)
            java.lang.String r0 = "video_cnt"
            r2.LIZ(r3, r0)
            java.lang.String r0 = "enter_dm"
            r2.LJI(r0, r13)
            java.lang.String r0 = "has_autocut"
            r2.LIZ(r11, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "click_autocut"
            X.FMX.LJIIL(r0, r1)
            return
        L7c:
            java.lang.String r5 = "shoot"
            goto L3e
        L7f:
            r6 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45049Hm9.LJIIJ(java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String):void");
    }

    public static final void LJIIIIZZ(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str2);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("music_id", str3);
        c145995oB.LJI("shoot_way", str4);
        c145995oB.LJI("creation_id", str5);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c145995oB.LJI("source", str);
        FMX.LJIIL("tool_performance_autocut_download_music", c145995oB.LIZ);
    }

    public static final void LJIILLIIL(boolean z, int i, String str, long j, List list, String str2, String str3, int i2, boolean z2) {
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(intValue, "material_count");
        c145995oB.LIZ(intValue2, "photo_count");
        c145995oB.LIZ(intValue3, "video_count");
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("creation_id", str3);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c145995oB.LIZ(i2, "autocut_template_type");
        c145995oB.LJI("source", "source_auto_cut");
        c145995oB.LIZ(z2 ? 1 : 0, "is_template_json");
        int i3 = 1;
        if (list != null && list.size() == 1 && ((AutoCutMediaModel) ORZ.LJLLJ(list)).duration > LivePlayEnforceIntervalSetting.DEFAULT) {
            if (!C45087Hml.LJJIII()) {
                i3 = 2;
            }
            c145995oB.LIZ(i3, "hit_highlight_condition");
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        FMX.LJIIL("tool_performance_autocut_music", map);
        LJJIFFI("tool_performance_autocut_music", map, z);
    }

    public static final void LJIILIIL(String str, int i, int i2, long j, String str2, String str3, String str4, String str5, int i3, String str6) {
        Object obj;
        long j2;
        C145995oB c145995oB = new C145995oB();
        if (i2 > 0) {
            obj = Float.valueOf(i / i2);
        } else {
            obj = 1;
        }
        c145995oB.LIZJ(obj, "success_rate");
        if (i2 > 0) {
            j2 = j / i2;
        } else {
            j2 = 0;
        }
        c145995oB.LIZIZ(j2, "average_duration");
        c145995oB.LIZ(i, "success_num");
        c145995oB.LIZ(i2, "total_num");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("creation_id", str3);
        c145995oB.LJI("music_id", str4);
        c145995oB.LIZ(i3, "autocut_template_type");
        c145995oB.LJI("autocut_template_id", str5);
        c145995oB.LJI("autocut_template_group_id", str6);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c145995oB.LJI("source", str);
        FMX.LJIIL("tool_performance_autocut_download_effect_finish", c145995oB.LIZ);
    }

    public static final void LJIJI(int i, int i2, boolean z, String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        int i3;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "req_type");
        c145995oB.LIZ(5000, "error_code");
        c145995oB.LIZ(i2, "error_sub_code");
        if (z) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        c145995oB.LIZ(i3, "file_exist");
        c145995oB.LJI("exception_msg", str);
        c145995oB.LJI("exception_cause_msg", str2);
        c145995oB.LJI("ttnet_trace_code", str3);
        c145995oB.LIZJ(num, "ttnet_status_code");
        c145995oB.LJI("ttnet_request_log", str4);
        c145995oB.LJI("log_id", str5);
        c145995oB.LJI("trace_id", str6);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        FMX.LJIIL("tool_performance_autocut_req_nle_or_music_fail", c145995oB.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.5oB] */
    public static void LJIJJLI(boolean z, int i, String str, long j, List list, String str2, String str3, boolean z2, int i2, String str4, String str5, Integer num, int i3) {
        int i4 = 0;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        ?? r14 = z2;
        if ((i3 & 128) != 0) {
            r14 = 0;
        }
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        ?? c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(intValue, "material_count");
        c145995oB.LIZ(intValue2, "photo_count");
        c145995oB.LIZ(intValue3, "video_count");
        c145995oB.LIZ(r14, "has_cached");
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("creation_id", str3);
        c145995oB.LJI("autocut_template_id", str4);
        c145995oB.LJI("autocut_template_group_id", str5);
        c145995oB.LIZ(i2, "autocut_template_type");
        if (num != null) {
            i4 = num.intValue();
        }
        c145995oB.LIZ(i4, "effect_urs_count");
        FMX.LJIIL("tool_performance_autocut_change_template", c145995oB.LIZ);
    }

    public static final void LJIL(boolean z, int i, Integer num, String str, long j, List<AutoCutMediaModel> list, String str2, String str3, int i2, String str4, boolean z2, String str5, String str6) {
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LIZJ(num, "error_sub_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(intValue, "material_count");
        c145995oB.LIZ(intValue2, "photo_count");
        c145995oB.LIZ(intValue3, "video_count");
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("creation_id", str3);
        c145995oB.LIZ(i2, "autocut_template_type");
        c145995oB.LJI("autocut_template_id", str4);
        c145995oB.LJI("autocut_template_group_id", str5);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c145995oB.LIZ(z2 ? 1 : 0, "is_template_json");
        c145995oB.LJI("music_id", str6);
        FMX.LJIIL("tool_performance_autocut_switch_request_template", c145995oB.LIZ);
    }

    public static final void LJII(String str, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<AutoCutMediaModel> list) {
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB LIZ2 = UFE.LIZ(j2, "autocut_duration");
        LIZ2.LIZIZ(j3, "loading_duration");
        LIZ2.LIZIZ(j4, "download_duration");
        LIZ2.LIZ(i, "necessary_download_count");
        LIZ2.LIZ(i2, "necessary_total_count");
        LIZ2.LIZ(i3, "unnecessary_download_count");
        LIZ2.LIZ(i4, "unnecessary_total_count");
        LIZ2.LIZ(i5, "cached_count");
        LIZ2.LIZ(i6, "fail_count");
        LIZ2.LIZ(i7, "success_count");
        LIZ2.LIZ(i8, "download_count");
        LIZ2.LIZ(intValue, "material_count");
        LIZ2.LIZ(intValue2, "photo_count");
        LIZ2.LIZ(intValue3, "video_count");
        LIZ2.LIZIZ(j / 1000, "video_duration");
        LIZ2.LJI("async_render_status", str);
        LIZ2.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        FMX.LJIIL("tool_performance_autocut_async_render", LIZ2.LIZ);
    }

    public static final void LJIILL(boolean z, int i, int i2, String str, long j, String str2, String str3, String str4, String str5, String str6, VecMeta vecMeta, Boolean bool, String str7, String str8) {
        int i3;
        int i4 = 0;
        if (vecMeta != null) {
            i3 = vecMeta.size();
            ArrayList arrayList = new ArrayList();
            Iterator<Meta> it = vecMeta.iterator();
            while (it.hasNext()) {
                Meta next = it.next();
                if (next.LJFF()) {
                    arrayList.add(next);
                }
            }
            i4 = arrayList.size();
        } else {
            i3 = 0;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LIZ(i2, "error_sub_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("rec_config", str2);
        c145995oB.LJI("rec_key", str3);
        c145995oB.LJI("shoot_way", str4);
        c145995oB.LJI("creation_id", str5);
        c145995oB.LJI("log_id", str6);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c145995oB.LJI("autocut_template_type", str7);
        c145995oB.LIZ(i3, "material_count");
        c145995oB.LIZ(i3 - i4, "photo_count");
        c145995oB.LIZ(i4, "video_count");
        c145995oB.LJI("source", str8);
        if (z && C45087Hml.LJJIIJ(vecMeta)) {
            c145995oB.LJ("apply_highlight", o.LJ(bool, Boolean.TRUE));
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        FMX.LJIIL("tool_performance_autocut_nlemodel_request", map);
        LJJIFFI("tool_performance_autocut_nlemodel_request", map, z);
    }

    public static final void LJIIZILJ(String str, boolean z, int i, Integer num, String str2, long j, String str3, String str4, List<AutoCutMediaModel> list, String str5, String str6, String str7, String reuseMusicType, String str8, int i2, boolean z2, String str9) {
        o.LJIIIZ(reuseMusicType, "reuseMusicType");
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LIZJ(num, "error_sub_code");
        c145995oB.LJI("error_msg", str2);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("music_id", str3);
        c145995oB.LJI("task_id", str4);
        c145995oB.LIZ(intValue, "material_count");
        c145995oB.LIZ(intValue2, "photo_count");
        c145995oB.LIZ(intValue3, "video_count");
        c145995oB.LJI("enter_from", str5);
        c145995oB.LJI("shoot_way", str6);
        c145995oB.LJI("creation_id", str7);
        c145995oB.LIZ(i2, "autocut_template_type");
        c145995oB.LJI("autocut_template_id", str8);
        c145995oB.LJI("autocut_template_group_id", str9);
        c145995oB.LJI("reuse_music_type", reuseMusicType);
        c145995oB.LJI("source", str);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c145995oB.LIZ(z2 ? 1 : 0, "is_template_json");
        java.util.Map<String, String> map = c145995oB.LIZ;
        FMX.LJIIL("tool_performance_autocut_nlemodel", map);
        LJJIFFI("tool_performance_autocut_nlemodel", map, z);
    }

    public static final void LJJI(List list, String str, String str2, String str3, String styleOrder, String str4, boolean z, String reuseMusicType, int i, String str5, int i2, String str6, String str7, String str8, List list2, AutoCutModel autoCutModel, String str9) {
        String str10;
        o.LJIIIZ(styleOrder, "styleOrder");
        o.LJIIIZ(reuseMusicType, "reuseMusicType");
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("creation_id", str2);
        if (i == 0) {
            str10 = "upload";
        } else {
            str10 = "shoot";
        }
        c145995oB.LJI("content_source", str10);
        c145995oB.LIZ(intValue, "content_cnt");
        c145995oB.LIZ(intValue2, "pic_cnt");
        c145995oB.LIZ(intValue3, "video_cnt");
        c145995oB.LJI("content_form", LIZJ(list));
        c145995oB.LJI("autocut_style_name", str3);
        c145995oB.LIZ(z ? 1 : 0, "is_soundsync");
        c145995oB.LJI("style_order", styleOrder);
        c145995oB.LJI("status", str4);
        c145995oB.LIZ(o.LJ(styleOrder, CardStruct.IStatusCode.DEFAULT) ? 1 : 0, "is_recommend_style");
        c145995oB.LJI("reuse_music_type", reuseMusicType);
        c145995oB.LJI("music_id", str5);
        c145995oB.LJI("autocut_click_from", str6);
        c145995oB.LIZ(i2, "autocut_template_type");
        c145995oB.LJI("autocut_template_id", str7);
        c145995oB.LJI("autocut_template_group_id", str9);
        c145995oB.LJI("task_id", str8);
        C77117UOj.LJII(c145995oB, list2, null);
        C77117UOj.LJIIIIZZ(c145995oB, autoCutModel.speedVariationType);
        FMX.LJIIL("switch_autocut_style_result", c145995oB.LIZ);
    }

    public static final void LJIILJJIL(boolean z, int i, Integer num, String str, long j, long j2, List<AutoCutMediaModel> list, String str2, String str3, String reuseMusicType, int i2, String str4, int i3, String str5, String str6, String str7, List<AutoCutTitle> list2, AutoCutModel autoCutModel, int i4, boolean z2, String str8, String str9, Integer num2) {
        String str10;
        Integer num3;
        int i5;
        o.LJIIIZ(reuseMusicType, "reuseMusicType");
        OSJ LJ = LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LIZJ(num, "error_sub_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(intValue, "material_count");
        c145995oB.LIZ(intValue2, "photo_count");
        c145995oB.LIZ(intValue3, "video_count");
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("creation_id", str3);
        c145995oB.LJI("reuse_music_type", reuseMusicType);
        if (i2 == 0) {
            str10 = "upload";
        } else {
            str10 = "shoot";
        }
        c145995oB.LJI("content_source", str10);
        c145995oB.LJI("enter_from", str4);
        c145995oB.LJI("autocut_click_from", str5);
        c145995oB.LIZ(i3, "autocut_template_type");
        c145995oB.LJI("autocut_template_id", str6);
        c145995oB.LJI("autocut_template_group_id", str8);
        c145995oB.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        if (autoCutModel != null) {
            num3 = autoCutModel.speedVariationType;
        } else {
            num3 = null;
        }
        C77117UOj.LJIIIIZZ(c145995oB, num3);
        c145995oB.LIZ(z2 ? 1 : 0, "is_template_json");
        c145995oB.LJI("music_id", str9);
        if (num2 != null) {
            i5 = num2.intValue();
        } else {
            i5 = 0;
        }
        c145995oB.LIZ(i5, "effect_urs_count");
        c145995oB.LIZIZ(j2, "duration_exclude_download_music");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (AutoCutMediaModel autoCutMediaModel : list) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(autoCutMediaModel.height);
                LIZ2.append(':');
                LIZ2.append(autoCutMediaModel.width);
                arrayList.add(X1D.LIZIZ(LIZ2));
                arrayList2.add(String.valueOf(autoCutMediaModel.duration));
            }
        }
        c145995oB.LIZLLL("autocut_content_size", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), arrayList));
        c145995oB.LIZLLL("autocut_content_duration", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), arrayList2));
        c145995oB.LIZLLL("task_id", str7);
        C77117UOj.LJII(c145995oB, list2, null);
        c145995oB.LIZ(i4, "text_sticker_duration");
        java.util.Map<String, String> map = c145995oB.LIZ;
        FMX.LJIIL("tool_performance_generate_autocut", map);
        LJJIFFI("tool_performance_generate_autocut", map, z);
    }
}
