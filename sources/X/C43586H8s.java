package X;

import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.H8s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43586H8s {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C43585H8r c43585H8r, Intent intent) {
        MicroAppModel microAppModel;
        int LIZIZ;
        int i;
        String str;
        Workspace workspace;
        o.LJIIIZ(intent, "intent");
        intent.getLongExtra("min_duration", C44529Hdl.LIZIZ());
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "path");
        if (!TextUtils.isEmpty(LLJJIJIIJIL) && (workspace = c43585H8r.LJIIIZ) != null) {
            workspace.LLILLL(LLJJIJIIJIL);
        }
        if (intent.getSerializableExtra("av_challenge") != null) {
            c43585H8r.LJFF.clear();
            ArrayList<AVChallenge> arrayList = c43585H8r.LJFF;
            Serializable serializableExtra = intent.getSerializableExtra("av_challenge");
            o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
            arrayList.add(serializableExtra);
        }
        if (intent.getSerializableExtra("av_challenge_list") != null) {
            Serializable serializableExtra2 = intent.getSerializableExtra("av_challenge_list");
            o.LJII(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> }");
            c43585H8r.LJFF = (ArrayList) serializableExtra2;
        }
        c43585H8r.LJI = C16880lQ.LLJJIJIIJIL(intent, "micro_app_id");
        String str2 = null;
        if (intent.getSerializableExtra("micro_app_info") == null) {
            microAppModel = null;
        } else {
            Serializable serializableExtra3 = intent.getSerializableExtra("micro_app_info");
            o.LJII(serializableExtra3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
            microAppModel = (MicroAppModel) serializableExtra3;
        }
        c43585H8r.LJII = microAppModel;
        c43585H8r.LJJIIJ.setExtraShareOptions((HashMap) intent.getSerializableExtra("_aweme_open_sdk_extra_share_options"));
        c43585H8r.LJIIIIZZ = intent.getBooleanExtra("enter_record_from_other_platform", false);
        c43585H8r.LJIIJ = (C43722HDy) intent.getSerializableExtra("extra_share_context");
        c43585H8r.LJIIJJI = intent.getIntExtra("extra_stick_point_type", 0);
        c43585H8r.LJIIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
        c43585H8r.LJJIII = (ShoutOutsData) intent.getSerializableExtra("shout_out_data");
        CreativeFlowData creativeFlowData = (CreativeFlowData) intent.getParcelableExtra("creative_flow_data");
        if (creativeFlowData != null) {
            c43585H8r.LJJIIJ = creativeFlowData;
        }
        c43585H8r.LJIJI = C16880lQ.LLJJIJIIJIL(intent, "music_origin");
        c43585H8r.LJIILIIL = intent.getBooleanExtra("from_background_video", false);
        c43585H8r.LJIILJJIL = intent.getBooleanExtra("from_diy_prop_video", false);
        c43585H8r.LJJIJIL = (BackgroundVideoCompileConfigure) intent.getParcelableExtra("background_video_compile_configure");
        c43585H8r.LJJIJL = (DiyPropVideoCompileConfigure) intent.getParcelableExtra("diy_prop_video_compile_configure");
        c43585H8r.LJIILL = intent.getLongExtra("cut_video_max_length", LivePlayEnforceIntervalSetting.DEFAULT);
        c43585H8r.LJIILLIIL = (DiyPropUploadVideoAutoCutConfigure) intent.getParcelableExtra("diy_prop_upload_video_configure");
        c43585H8r.LJIIZILJ = C77412UZs.LJIJI(intent);
        c43585H8r.LJIJ = C78996UzQ.LJIILL(intent);
        c43585H8r.LJJIFFI = C16880lQ.LLJJIJIIJIL(intent, "share_id");
        c43585H8r.LJJII = C16880lQ.LLJJIJIIJIL(intent, "channel");
        if (C41012G7s.LIZ() && !c43585H8r.LJIJ.draftInfoModel.isDraft) {
            LIZIZ = G9D.LIZ();
        } else {
            LIZIZ = G9D.LIZIZ();
        }
        c43585H8r.LJJIIJZLJL = intent.getIntExtra("is_rivate", LIZIZ);
        intent.getBooleanExtra("draft_to_cut", false);
        c43585H8r.LJIJJ = intent.getBooleanExtra("extra_enter_from_live", false);
        c43585H8r.LJJIJ = intent.getLongExtra("extra_start_enter_cut_page", System.currentTimeMillis());
        c43585H8r.LJJIIZ = C16880lQ.LLJJIJIIJIL(intent, "upload_next_method");
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = c43585H8r.LJJIIJ.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos != null && autoSelectedAnchorInfos.getOpenPlatformShareId() != null) {
            i = 5;
            str = "album_import";
        } else {
            i = 3;
            str = "jsb";
        }
        AutoSelectedAnchorInfos autoSelectedAnchorInfos2 = c43585H8r.LJJIIJ.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos2 != null) {
            if (autoSelectedAnchorInfos2.getOpenPlatformClientKey() == null) {
                autoSelectedAnchorInfos2.setOpenPlatformClientKey(C16880lQ.LLJJIJIIJIL(intent, "open_platform_client_key"));
            }
            if (autoSelectedAnchorInfos2.getOpenPlatFormExtra() == null) {
                autoSelectedAnchorInfos2.setOpenPlatFormExtra(C16880lQ.LLJJIJIIJIL(intent, "open_platform_extra"));
            }
            if (autoSelectedAnchorInfos2.getAnchorSourceType() == null) {
                C43722HDy c43722HDy = c43585H8r.LJIIJ;
                if (c43722HDy != null) {
                    str2 = c43722HDy.mAnchorSourceType;
                }
                autoSelectedAnchorInfos2.setAnchorSourceType(str2);
            }
            autoSelectedAnchorInfos2.setOpenPlatformAddFrom(Integer.valueOf(i));
            autoSelectedAnchorInfos2.setAnchorShootWay(str);
        }
    }

    public static Intent LIZIZ(Intent intent, C43585H8r c43585H8r, C43558H7q c43558H7q, long j, boolean z) {
        boolean z2;
        int i;
        int i2;
        List<VideoSegment> list = c43558H7q.LIZ;
        Workspace workspace = c43585H8r.LJIIIZ;
        Intent intent2 = new Intent(intent);
        C77412UZs.LJJIJIL(intent2, c43585H8r.LJIIZILJ);
        C78996UzQ.LJJIZ(intent2, c43585H8r.LJIJ);
        intent2.putExtra("extra_start_enter_edit_page", j);
        intent2.putExtra("extra_import_compile_cost_time", System.currentTimeMillis() - j);
        intent2.putExtra("content_source", "upload");
        intent2.putExtra("content_type", HC8.LIZIZ(c43558H7q.LIZJ));
        intent2.putExtra("enable_music_path_check", false);
        intent2.putExtra("fromCut", true);
        intent2.putExtra("origin", 0);
        intent2.putExtra("extra_stick_point_type", c43585H8r.LJIIJJI);
        intent2.putExtra("shout_out_data", c43585H8r.LJJIII);
        intent2.putExtra("is_rivate", c43585H8r.LJJIIJZLJL);
        intent2.putExtra("share_id", c43585H8r.LJJIFFI);
        intent2.putExtra("channel", c43585H8r.LJJII);
        if (c43585H8r.LJII == null && TextUtils.isEmpty(c43585H8r.LJI)) {
            z2 = true;
        } else {
            z2 = false;
        }
        intent2.putExtra("back_to_main_after_publish", z2);
        ArrayList<AVChallenge> arrayList = c43585H8r.LJFF;
        o.LJII(arrayList, "null cannot be cast to non-null type java.io.Serializable");
        intent2.putExtra("challenge", arrayList);
        intent2.putExtra("enter_record_from_other_platform", C78929UyL.LJIILL(c43585H8r));
        intent2.putExtra("micro_app_id", c43585H8r.LJI);
        intent2.putExtra("micro_app_info", c43585H8r.LJII);
        intent2.putExtra("music_origin", c43585H8r.LJIJI);
        intent2.putExtra("creative_flow_data", (Parcelable) c43585H8r.LJJIIJ);
        intent2.putExtra("upload_video_type", c43558H7q.LIZLLL);
        intent2.putExtra("extra_is_change_speed", c43558H7q.LJ);
        intent2.putExtra("fromMultiCut", c43558H7q.LIZLLL);
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<VideoSegment> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().isImageType && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        int size = list.size() - i;
        intent2.putExtra("extra_photo_count", i);
        intent2.putExtra("extra_video_count", size);
        if (c43558H7q.LIZJ) {
            i2 = -1;
        } else {
            i2 = (int) c43558H7q.LIZIZ;
        }
        intent2.putExtra("preview_video_length", i2);
        List<VideoSegment> list2 = c43558H7q.LIZ;
        StringBuilder sb = new StringBuilder();
        for (VideoSegment videoSegment : list2) {
            if (!TextUtils.isEmpty(videoSegment.md5)) {
                sb.append(videoSegment.md5);
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        if (!TextUtils.isEmpty(sb2)) {
            String substring = sb2.substring(0, sb2.length() - 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            intent2.putExtra("md5", substring);
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "hashtag");
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        C43836HIi.LIZ(c43585H8r.LJII, sb3, arrayList2);
        if (sb3.length() == 0 && C78685UuP.LJJJZ(LLJJIJIIJIL)) {
            String[] strArr = new String[1];
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            strArr[0] = LLJJIJIIJIL;
            ArrayList LJII = C47261Igj.LJII(strArr);
            if (!LJII.isEmpty()) {
                Iterator it2 = LJII.iterator();
                while (it2.hasNext()) {
                    C1DI.LIZIZ(sb3, "#", (String) it2.next(), " ");
                }
            }
        }
        if (!TextUtils.isEmpty(sb3.toString())) {
            intent2.putExtra("video_title", sb3.toString());
        }
        if (!arrayList2.isEmpty()) {
            intent2.putExtra("struct_list", arrayList2);
        }
        intent2.putExtra("extra_stickpoint_mode", c43558H7q.LIZJ);
        if (c43558H7q.LIZJ) {
            String LJ = C45771Hxn.LJ(c43558H7q.LJFF);
            if (C170626mo.LIZJ(C16880lQ.LLLLJI(C60903NvH.LJ), LJ) && workspace != null) {
                workspace.LLILLL(LJ);
            }
            I9T.LJFF(c43558H7q.LJFF);
        }
        if (c43558H7q.LIZLLL) {
            if (c43558H7q.LIZJ) {
                I9T.LJFF(c43558H7q.LJFF);
            } else if (!z) {
                if (workspace != null) {
                    workspace.v();
                }
                I9T.LJFF(null);
            }
        }
        Iterator<VideoSegment> it3 = c43558H7q.LIZ.iterator();
        long j2 = 0;
        while (it3.hasNext()) {
            j2 += it3.next().duration;
        }
        intent2.putExtra("extra_import_total_video_duration", j2);
        EnumC43590H8w enumC43590H8w = EnumC43590H8w.CUT;
        EnumC43590H8w enumC43590H8w2 = EnumC43590H8w.EDIT;
        for (HBR hbr : HBR.values()) {
            String str = hbr.intentKey;
            InterfaceC36085EEf interfaceC36085EEf = (InterfaceC36085EEf) ((ConcurrentHashMap) C43587H8t.LIZ).get(hbr);
            if (interfaceC36085EEf == null) {
                interfaceC36085EEf = C43587H8t.LIZJ;
            }
            intent2.putExtra(str, interfaceC36085EEf.LIZ(C16880lQ.LLJJIJIIJIL(intent, hbr.intentKey), enumC43590H8w, enumC43590H8w2));
        }
        return intent2;
    }
}
