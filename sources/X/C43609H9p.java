package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H9p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43609H9p implements HKO {
    public final /* synthetic */ C43610H9q LIZ;
    public final /* synthetic */ H7O LIZIZ;
    public final /* synthetic */ ShortVideoContext LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ ArrayList<MediaModel> LJ;

    @Override // X.HKO
    public final void onExit() {
        this.LIZ.onExit();
    }

    @Override // X.HKO
    public final void LIZJ(List<? extends MediaModel> mediaList) {
        o.LJIIIZ(mediaList, "mediaList");
        this.LIZ.LIZJ(mediaList);
    }

    @Override // X.HKO
    public final void LJ(List<HJU> mediaList) {
        o.LJIIIZ(mediaList, "mediaList");
        this.LIZ.LJ(mediaList);
        List<AutoCutMediaModel> list = this.LIZJ.creativeModel.autoCutAnchorModel.mediaList;
        list.clear();
        ArrayList arrayList = new ArrayList(C32I.LJJL(mediaList, 10));
        for (HJU hju : mediaList) {
            arrayList.add(new AutoCutMediaModel(hju.LIZIZ, null, 0, 0, hju.LIZJ, 0L, 0L, 0L, 0.0f, null, 1006, null));
        }
        list.addAll(arrayList);
    }

    @Override // X.HKP
    public final void LIZIZ(C43645HAz c43645HAz, boolean z) {
        this.LIZ.getClass();
        if (c43645HAz != null) {
            C43045Guv.LIZLLL(new AqS107S0101000_7(this.LIZIZ, (int) c43645HAz.LIZIZ, 4), 0L);
        }
    }

    @Override // X.HKP
    public final void LIZLLL(C43611H9r c43611H9r, boolean z) {
        Integer num;
        Serializable serializable;
        OSZ osz;
        String str;
        String str2;
        boolean z2;
        this.LIZ.LIZLLL(c43611H9r, z);
        if (c43611H9r == null) {
            return;
        }
        int value = EnumC43998HOo.AUTOCUT_TEMPLATE.getValue();
        if (((int) c43611H9r.LIZJ) == 4) {
            value = EnumC43998HOo.CUT_SAME.getValue();
        }
        CreativeModel creativeModel = this.LIZJ.creativeModel;
        String str3 = creativeModel.autoCutAnchorModel.templateGroupId;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        AutoCutModel autoCutModel = creativeModel.autoCutModel;
        C63A c63a = C63A.AUTO_CUT;
        AnonymousClass636.LJIJJLI(autoCutModel, 0, c63a, value, c43611H9r.LJII, str3);
        if (value == EnumC43998HOo.CUT_SAME.getValue()) {
            List<AutoCutThemeData> list = this.LIZJ.creativeModel.autoCutModel.templateList;
            int ordinal = c63a.ordinal();
            String str5 = c43611H9r.LJII;
            String str6 = c43611H9r.LJI;
            String str7 = c43611H9r.LIZLLL;
            if (str7 == null) {
                str7 = "";
            }
            list.add(new AutoCutThemeData(ordinal, 0, str5, value, str6, str7, String.valueOf(c43611H9r.LIZIZ), "", c43611H9r.LJ, c43611H9r.LJFF, null, true, "", null, 9216, null));
        } else {
            AVMusic aVMusic = c43611H9r.LJIIIIZZ;
            if (aVMusic != null) {
                List<AutoCutThemeData> list2 = this.LIZJ.creativeModel.autoCutModel.templateList;
                C44727Hgx c44727Hgx = AutoCutThemeData.Companion;
                MusicModel LJJIJIL = C78915Uy7.LJJIJIL(aVMusic);
                C42649GoX c42649GoX = C42649GoX.LJLIL;
                c44727Hgx.getClass();
                list2.add(C44727Hgx.LIZ(LJJIJIL, c63a, value, str3, c42649GoX, true));
            }
        }
        ShortVideoContext shortVideoContext = this.LIZJ;
        AVMusic aVMusic2 = c43611H9r.LJIIIIZZ;
        String str8 = c43611H9r.LJIIIZ;
        Intent intent = null;
        if (aVMusic2 != null) {
            num = Integer.valueOf(aVMusic2.getDuration());
        } else {
            num = null;
        }
        C44703HgZ.LIZ(shortVideoContext, aVMusic2, str8, 0, num);
        NLEModel nLEModel = c43611H9r.LIZIZ;
        if (nLEModel == null || nLEModel.getMainTrack() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutAnchorMediaProcessImpl checkAutoCutNLE: templateId=");
            LIZ.append(c43611H9r.LJII);
            LIZ.append(", templateType=");
            C45243HpH.LIZIZ(LIZ, c43611H9r.LIZLLL, LIZ);
        }
        NLEModel nLEModel2 = c43611H9r.LIZIZ;
        if (nLEModel2 != null && C45087Hml.LJIILJJIL()) {
            System.currentTimeMillis();
            C124144u2.LIZIZ(nLEModel2);
        }
        this.LIZJ.creativeModel.autoCutModel.optimizeLargeNLEId = C36942Eeg.LIZIZ(c43611H9r.LIZIZ);
        H7O h7o = this.LIZIZ;
        Activity activity = this.LIZLLL;
        ShortVideoContext shortVideoContext2 = this.LIZJ;
        ArrayList<MediaModel> arrayList = this.LJ;
        h7o.getClass();
        NLEModel nLEModel3 = c43611H9r.LIZIZ;
        if (nLEModel3 == null) {
            if (0 == 0) {
                C43045Guv.LIZLLL(new AqS157S0100000_7(h7o, 459), 0L);
                return;
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AutoCutTemplate goEditIntent: ");
            LIZ2.append(C45049Hm9.LJI(nLEModel3));
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
            Intent intent2 = new Intent();
            intent2.putExtra("NLE", C45087Hml.LJJIL(nLEModel3));
            intent2.putExtra("extra_request_code", 12350);
            CreativeModel creativeModel2 = shortVideoContext2.creativeModel;
            o.LJIIIIZZ(creativeModel2, "shortVideoContext.creativeModel");
            C78996UzQ.LJJIZ(intent2, creativeModel2);
            if (((int) c43611H9r.LIZJ) == 4) {
                serializable = Float.valueOf(WUK.LJIIZILJ);
            } else {
                serializable = 0;
            }
            intent2.putExtra("voice_volume", serializable);
            int[] LIZLLL = C44739Hh9.LIZLLL();
            if (LIZLLL != null && LIZLLL.length == 2) {
                osz = new OSZ(Integer.valueOf(LIZLLL[0]), Integer.valueOf(LIZLLL[1]));
            } else {
                osz = new OSZ(1920, 1080);
            }
            VideoFileInfo videoFileInfo = new VideoFileInfo(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), nLEModel3.getDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
            StringBuilder LIZ3 = X1D.LIZ();
            CreativeInfo creativeInfo = shortVideoContext2.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            LIZ3.append(C45087Hml.LJIIIIZZ(creativeInfo));
            LIZ3.append(C45087Hml.LJIJI());
            String LIZIZ = X1D.LIZIZ(LIZ3);
            C78966Uyw.LJJJJZ(new File(LIZIZ));
            intent2.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
            AVETParameter LIZLLL2 = shortVideoContext2.LIZLLL();
            if (LIZLLL2 != null) {
                intent2.putExtra("challenge", (Serializable) C41658GWo.LIZLLL().LIZ);
                intent2.putExtra("shoot_way", shortVideoContext2.shootWay);
                CreativeInfo creativeInfo2 = shortVideoContext2.creativeInfo;
                o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
                C77412UZs.LJJIJIL(intent2, creativeInfo2);
                intent2.putExtra("is_rivate", shortVideoContext2.isPrivate);
                intent2.putExtra("shoot_mode", LIZLLL2.getShootMode());
                intent2.putExtra("draft_id", LIZLLL2.getDraftId());
                if (shortVideoContext2.LJJIIJ()) {
                    intent2.putExtra("reuse_original_sound_id", shortVideoContext2.LJIILLIIL());
                    intent2.putExtra("reuse_original_sound_url", shortVideoContext2.LJIJ());
                    intent2.putExtra("reuse_original_sound_length", shortVideoContext2.LJIIZILJ());
                }
                intent2.putExtra("new_draft_id", LIZLLL2.getNewDraftId());
                intent2.putExtra("origin", 0);
                intent2.putExtra("content_source", "upload");
                intent2.putExtra("shout_out_data", shortVideoContext2.mShoutOutsData);
                intent2.putExtra("creative_flow_data", (Parcelable) shortVideoContext2.creativeFlowData);
                intent2.putExtra("share_id", shortVideoContext2.mShareId);
                intent2.putExtra("channel", shortVideoContext2.clientId);
                intent2.putExtra("comment_video_model", shortVideoContext2.commentVideoModel);
                intent2.putExtra("extra_tts_voice_model", (Serializable) shortVideoContext2.ttsVoiceModel);
                intent2.putExtra("question_answer_video_model", shortVideoContext2.qaStruct);
                intent2.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
                intent2.putExtra("use_music_before_edit", true);
                if (shortVideoContext2.cameraComponentModel.mMusicPath != null && MusicBeanUtilKt.extractAVMusic(shortVideoContext2.creativeModel.musicBuzModel) != null) {
                    intent2.putExtra("path", shortVideoContext2.cameraComponentModel.mMusicPath);
                    intent2.putExtra("music_model", C78934UyQ.LJLIL.getMusicService().LJIILLIIL(MusicBeanUtilKt.extractAVMusic(shortVideoContext2.creativeModel.musicBuzModel)));
                    intent2.putExtra("music_origin", "auto_cut_music_recommend");
                    intent2.putExtra("extra_need_add_recent", true);
                    AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext2.creativeModel.musicBuzModel);
                    if (extractAVMusic != null) {
                        str = extractAVMusic.getMusicId();
                    } else {
                        str = null;
                    }
                    intent2.putExtra("id", str);
                }
                intent2.putExtra("workspace", shortVideoContext2.cameraComponentModel.mWorkspace);
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(C32I.LJJL(arrayList, 10));
                Iterator<MediaModel> it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    MediaModel next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        MediaModel mediaModel = next;
                        int i3 = mediaModel.width;
                        int i4 = mediaModel.height;
                        long j = mediaModel.duration;
                        long j2 = mediaModel.endTime - mediaModel.startTime;
                        String valueOf = String.valueOf(i);
                        String str9 = mediaModel.fileLocalUriPath;
                        arrayList2.add(new ImportVideoInfo(i3, i4, 0, 0, valueOf, j2, j, null, null, 0, 0.0f, str9, str9, false, null, 26508, null));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                intent2.putParcelableArrayListExtra("extra_import_video_info_list", arrayList2);
                intent2.putExtra("commerce_data_in_tools_line", shortVideoContext2.extraSession.commerceData);
            }
            intent2.putExtra("enter_method", shortVideoContext2.enterMethod);
            intent2.putExtra("shoot_from", shortVideoContext2.mShootFrom);
            String str10 = shortVideoContext2.uploadMethod;
            if (str10 == null) {
                str10 = "";
            }
            intent2.putExtra("upload_method", str10);
            List<String> list3 = shortVideoContext2.uploadTabNameList;
            if (list3 != null) {
                intent2.putStringArrayListExtra("upload_tab_name", new ArrayList<>(list3));
            }
            String str11 = shortVideoContext2.albumPreviewNextMethod;
            if (str11 == null) {
                str11 = "";
            }
            intent2.putExtra("upload_next_method", str11);
            intent2.putExtra("is_west_window_exist", shortVideoContext2.isWestWindowExistStr);
            intent = intent2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<MediaModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaModel next2 = it2.next();
            if (next2.LJI()) {
                arrayList3.add(next2);
            }
        }
        int size = arrayList3.size();
        ArrayList arrayList4 = new ArrayList();
        Iterator<MediaModel> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MediaModel next3 = it3.next();
            if (!next3.LJI()) {
                arrayList4.add(next3);
            }
        }
        int size2 = arrayList4.size();
        if (size == 0) {
            if (size2 >= 1) {
                str4 = "photo";
            }
        } else if (size >= 1) {
            if (size2 == 0) {
                str4 = "video";
            } else if (size2 >= 1) {
                str4 = "mix";
            }
        }
        if (arrayList.size() > 1) {
            str2 = "multiple_content";
        } else {
            str2 = "single_content";
        }
        if (arrayList.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        H9N h9n = new H9N(shortVideoContext2, "autocut", str2, size, size2, str4, z2, C173606rc.LIZ(arrayList), C79081V1x.LJIIZILJ(arrayList));
        h9n.LIZIZ(shortVideoContext2);
        h9n.LIZ();
        C43045Guv.LIZLLL(new AqS96S0300000_7(h7o, activity, intent, 15), 0L);
    }

    @Override // X.HKP
    public final void LIZ(String str, String str2, boolean z) {
        this.LIZ.LIZ(str, str2, z);
    }

    @Override // X.HKP
    public final void LJFF(int i, String str, boolean z) {
        this.LIZ.LJFF(i, str, z);
        H7O h7o = this.LIZIZ;
        h7o.getClass();
        C43045Guv.LIZLLL(new AqS157S0100000_7(h7o, 459), 0L);
    }

    public C43609H9p(C43610H9q c43610H9q, H7O h7o, ShortVideoContext shortVideoContext, Activity activity, ArrayList<MediaModel> arrayList) {
        this.LIZ = c43610H9q;
        this.LIZIZ = h7o;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = activity;
        this.LJ = arrayList;
    }
}
