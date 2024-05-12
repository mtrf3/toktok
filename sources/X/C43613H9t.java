package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H9t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43613H9t extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C44716Hgm LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ List<MyMediaModel> LJLJI;
    public final /* synthetic */ ShortVideoContext LJLJJI;
    public final /* synthetic */ C82622Wbi LJLJJL;
    public final /* synthetic */ ActivityC45651qj LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43613H9t(C44716Hgm c44716Hgm, String str, List<MyMediaModel> list, ShortVideoContext shortVideoContext, C82622Wbi c82622Wbi, ActivityC45651qj activityC45651qj) {
        super(0);
        this.LJLIL = c44716Hgm;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
        this.LJLJJI = shortVideoContext;
        this.LJLJJL = c82622Wbi;
        this.LJLJJLL = activityC45651qj;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Bundle LLJJIJI;
        String str;
        OSZ osz;
        int shootMode;
        String str2;
        C44716Hgm c44716Hgm = this.LJLIL;
        NLEModel nLEModel = c44716Hgm.LJII;
        if (nLEModel != null) {
            String str3 = this.LJLILLLLZI;
            List<MyMediaModel> list = this.LJLJI;
            ShortVideoContext shortVideoContext = this.LJLJJI;
            C82622Wbi c82622Wbi = this.LJLJJL;
            ActivityC45651qj activityC45651qj = this.LJLJJLL;
            List<TextStickerData> LIZJ = C5V8.LIZJ(nLEModel);
            if (LIZJ != null) {
                c44716Hgm.LJIIJ = LIZJ;
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (MyMediaModel myMediaModel : list) {
                MyMediaModel.Companion.getClass();
                arrayList.add(C43966HNi.LIZ(myMediaModel));
            }
            Intent intent = new Intent();
            if (str3 == null) {
                str3 = C45087Hml.LJJIL(nLEModel);
            }
            intent.putExtra("NLE", str3);
            intent.putExtra("extra_request_code", 12347);
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
            C78996UzQ.LJJIZ(intent, creativeModel);
            intent.putExtra("voice_volume", 0.0f);
            ArrayList arrayList2 = null;
            WM7 wm7 = (WM7) c82622Wbi.LJIIIIZZ(null, AbstractC42651GoZ.class);
            if (wm7 == null || (LLJJIJI = wm7.mArguments) == null) {
                LLJJIJI = C16880lQ.LLJJIJI(((Activity) c82622Wbi.LJ(Activity.class, null)).getIntent());
            }
            if (LLJJIJI != null) {
                str = LLJJIJI.getString("extra_edit_effect_uid");
            } else {
                str = null;
            }
            intent.putExtra("extra_edit_effect_uid", str);
            int[] LIZLLL = C44739Hh9.LIZLLL();
            if (LIZLLL != null && LIZLLL.length == 2) {
                osz = new OSZ(Integer.valueOf(LIZLLL[0]), Integer.valueOf(LIZLLL[1]));
            } else {
                osz = new OSZ(1920, 1080);
            }
            VideoFileInfo videoFileInfo = new VideoFileInfo(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), nLEModel.getDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
            StringBuilder LIZ = X1D.LIZ();
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            LIZ.append(C45087Hml.LJIIIIZZ(creativeInfo));
            LIZ.append(C45087Hml.LJIJI());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C78966Uyw.LJJJJZ(new File(LIZIZ));
            intent.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
            AVETParameter LIZLLL2 = shortVideoContext.LIZLLL();
            if (LIZLLL2 != null) {
                intent.putExtra("challenge", (Serializable) C41658GWo.LIZLLL().LIZ);
                intent.putExtra("shoot_way", shortVideoContext.shootWay);
                CreativeInfo creativeInfo2 = shortVideoContext.creativeInfo;
                o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
                C77412UZs.LJJIJIL(intent, creativeInfo2);
                intent.putExtra("is_rivate", shortVideoContext.isPrivate);
                if (LIZLLL2.getShootMode() == 0) {
                    shootMode = shortVideoContext.shootMode;
                } else {
                    shootMode = LIZLLL2.getShootMode();
                }
                intent.putExtra("shoot_mode", shootMode);
                intent.putExtra("draft_id", LIZLLL2.getDraftId());
                if (shortVideoContext.LJJIIJ()) {
                    intent.putExtra("reuse_original_sound_id", shortVideoContext.LJIILLIIL());
                    intent.putExtra("reuse_original_sound_url", shortVideoContext.LJIJ());
                    intent.putExtra("reuse_original_sound_length", shortVideoContext.LJIIZILJ());
                }
                intent.putExtra("new_draft_id", LIZLLL2.getNewDraftId());
                intent.putExtra("origin", 0);
                intent.putExtra("content_source", "upload");
                intent.putExtra("shout_out_data", shortVideoContext.mShoutOutsData);
                intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.creativeFlowData);
                intent.putExtra("share_id", shortVideoContext.mShareId);
                intent.putExtra("channel", shortVideoContext.clientId);
                intent.putExtra("comment_video_model", shortVideoContext.commentVideoModel);
                intent.putExtra("extra_tts_voice_model", (Serializable) shortVideoContext.ttsVoiceModel);
                intent.putExtra("question_answer_video_model", shortVideoContext.qaStruct);
                intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
                intent.putExtra("use_music_before_edit", true);
                if (shortVideoContext.cameraComponentModel.mMusicPath != null && MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel) != null) {
                    intent.putExtra("path", shortVideoContext.cameraComponentModel.mMusicPath);
                    intent.putExtra("music_model", C78934UyQ.LJLIL.getMusicService().LJIILLIIL(MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)));
                    intent.putExtra("music_origin", "auto_cut_music_recommend");
                    intent.putExtra("extra_need_add_recent", true);
                    AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                    if (extractAVMusic != null) {
                        str2 = extractAVMusic.getMusicId();
                    } else {
                        str2 = null;
                    }
                    intent.putExtra("id", str2);
                }
                intent.putExtra("workspace", shortVideoContext.cameraComponentModel.mWorkspace);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        MediaModel mediaModel = (MediaModel) next;
                        int i3 = mediaModel.width;
                        int i4 = mediaModel.height;
                        long j = mediaModel.duration;
                        long j2 = mediaModel.endTime - mediaModel.startTime;
                        String valueOf = String.valueOf(i);
                        String str4 = mediaModel.fileLocalUriPath;
                        arrayList3.add(new ImportVideoInfo(i3, i4, 0, 0, valueOf, j2, j, null, null, 0, 0.0f, str4, str4, false, null, 26508, null));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList3);
                intent.putExtra("commerce_data_in_tools_line", shortVideoContext.extraSession.commerceData);
                intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            }
            intent.putExtra("enter_method", shortVideoContext.enterMethod);
            intent.putExtra("shoot_from", shortVideoContext.mShootFrom);
            String str5 = shortVideoContext.uploadMethod;
            if (str5 == null) {
                str5 = "";
            }
            intent.putExtra("upload_method", str5);
            List<String> list2 = shortVideoContext.uploadTabNameList;
            if (list2 != null) {
                intent.putStringArrayListExtra("upload_tab_name", new ArrayList<>(list2));
            }
            String str6 = shortVideoContext.albumPreviewNextMethod;
            if (str6 == null) {
                str6 = "";
            }
            intent.putExtra("upload_next_method", str6);
            intent.putExtra("is_west_window_exist", shortVideoContext.isWestWindowExistStr);
            if (c44716Hgm.LIZJ == EnumC43998HOo.CUT_SAME.getValue()) {
                intent.putExtra("voice_volume", WUK.LJIIZILJ);
            }
            if (c44716Hgm.LJIIJ != null && (!r4.isEmpty())) {
                InfoStickerModel infoStickerModel = new InfoStickerModel();
                infoStickerModel.stickers = new ArrayList();
                List<TextStickerData> list3 = c44716Hgm.LJIIJ;
                if (list3 != null) {
                    for (TextStickerData textStickerData : list3) {
                        StickerItemModel stickerItemModel = new StickerItemModel();
                        stickerItemModel.type = 2;
                        stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
                        infoStickerModel.stickers.add(stickerItemModel);
                    }
                }
                List<TextStickerData> list4 = c44716Hgm.LJIIJ;
                if (list4 != null) {
                    arrayList2 = new ArrayList(C32I.LJJL(list4, 10));
                    Iterator<TextStickerData> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(C1XY.LIZIZ(it2.next(), ""));
                    }
                }
                shortVideoContext.creativeModel.autoCutModel.curRecommendTitleList = arrayList2;
                intent.putExtra("infosticker_model", (Parcelable) infoStickerModel);
            }
            C42662Gok.LJFF(activityC45651qj, C16880lQ.LLJJIJI(intent));
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
