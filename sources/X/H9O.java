package X;

import Y.ACallableS104S0100000_1;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.vesdk.VEUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9O implements InterfaceC45242HpG {
    public final Activity LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 473));

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        final ShortVideoContext shortVideoContext;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AnchorCommonStruct anchorCommonStruct;
        Serializable serializable;
        String str;
        o.LJIIIZ(data, "data");
        if (i != 1) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(data, "extra_edit_effect_uid");
        long longExtra = data.getLongExtra("extra_start_enter_edit_page", -1L);
        int intExtra = data.getIntExtra("extra_stick_point_type", 0);
        final ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty() || (shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context")) == null) {
            return;
        }
        Activity activity = this.LIZ;
        if (C42117Gfx.LJ()) {
            j = 0;
        } else {
            j = this.LIZIZ;
        }
        OSJ LIZ = C41994Gdy.LIZ(activity, parcelableArrayListExtra, j, 3600000L);
        boolean booleanValue = ((Boolean) LIZ.getFirst()).booleanValue();
        final int intValue = ((Number) LIZ.getSecond()).intValue();
        long longValue = ((Number) LIZ.getThird()).longValue();
        if (!booleanValue) {
            return;
        }
        if (C45685HwP.LJFF == null) {
            C45685HwP.LIZIZ(this.LIZ);
        }
        C45685HwP.LJFF.LIZ();
        int size = parcelableArrayListExtra.size();
        for (int i2 = 0; i2 < size; i2++) {
            C45685HwP c45685HwP = C45685HwP.LJFF;
            Object obj = ListProtector.get(parcelableArrayListExtra, i2);
            if (obj == null) {
                c45685HwP.getClass();
            } else if (!((ArrayList) c45685HwP.LIZLLL).contains(obj)) {
                ((ArrayList) c45685HwP.LIZLLL).add(obj);
            }
        }
        if (data.getIntExtra("key_choose_scene", -1) == 18) {
            z = true;
        } else {
            z = false;
        }
        if (data.getIntExtra("key_choose_scene", -1) == 24 || data.getIntExtra("key_choose_scene", -1) == 36) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2 || C78685UuP.LJJJZ(LLJJIJIIJIL)) {
            I9T.LJI((AVMusic) data.getSerializableExtra("aweme_music"), false, shortVideoContext.creativeModel.musicBuzModel);
        }
        if (data.getIntExtra("key_choose_scene", -1) == 31) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            AVMusic aVMusic = (AVMusic) data.getSerializableExtra("aweme_music");
            MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
            musicBuzModel.musicOrigin = "single_song";
            I9T.LJI(aVMusic, false, musicBuzModel);
        }
        String str2 = shortVideoContext.shootWay;
        String LJI = shortVideoContext.LJI();
        String str3 = shortVideoContext.albumPreviewNextMethod;
        HC8.LIZ = str2;
        HC8.LIZIZ = LJI;
        if (str3 != null) {
            HC8.LJFF = str3;
        }
        final int i3 = (int) longValue;
        if (!parcelableArrayListExtra.isEmpty()) {
            C10K.LIZJ(new ACallableS104S0100000_1(parcelableArrayListExtra, 8)).LJ(new C10I() { // from class: X.6rD
                @Override // X.C10I
                public final Object then(C10K<VEUtils.VEVideoFileInfo> c10k) {
                    VEUtils.VEVideoFileInfo vEVideoFileInfo;
                    MediaModel mediaModel;
                    String str4;
                    boolean z5;
                    Integer num;
                    String str5;
                    Integer num2;
                    int i4;
                    int i5;
                    String num3;
                    ShortVideoContext shortVideoContext2 = ShortVideoContext.this;
                    List<MediaModel> list = parcelableArrayListExtra;
                    int i6 = intValue;
                    int i7 = i3;
                    if (c10k != null) {
                        vEVideoFileInfo = c10k.LJIIJJI();
                    } else {
                        vEVideoFileInfo = null;
                    }
                    if (list != null) {
                        Iterator<MediaModel> it = list.iterator();
                        while (it.hasNext()) {
                            mediaModel = it.next();
                            if (mediaModel.LJI()) {
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    mediaModel = null;
                    o.LJI(list);
                    if (list.size() > 1) {
                        str4 = "multiple_content";
                    } else {
                        str4 = "single_content";
                    }
                    int size2 = list.size() - i6;
                    String LJJJJJ = C78977Uz7.LJJJJJ(i6, list.size() - i6);
                    if (list.size() > 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    H9N h9n = new H9N(shortVideoContext2, "video", str4, i6, size2, LJJJJJ, z5, C173606rc.LIZ(list), C79081V1x.LJIIZILJ(list));
                    h9n.LIZ.LIZ(0, "is_add_more");
                    h9n.LIZ.LIZ(i7, "duration_ms");
                    h9n.LIZ.LIZ(i7, "creation_duration");
                    if (vEVideoFileInfo != null) {
                        num = Integer.valueOf(vEVideoFileInfo.fps);
                    } else {
                        num = null;
                    }
                    C145995oB c145995oB = h9n.LIZ;
                    String str6 = "";
                    if (num == null || (str5 = num.toString()) == null) {
                        str5 = "";
                    }
                    c145995oB.LIZLLL("fps", str5);
                    if (vEVideoFileInfo != null) {
                        num2 = Integer.valueOf(vEVideoFileInfo.bitrate);
                    } else {
                        num2 = null;
                    }
                    C145995oB c145995oB2 = h9n.LIZ;
                    if (num2 != null && (num3 = num2.toString()) != null) {
                        str6 = num3;
                    }
                    c145995oB2.LIZLLL("file_bitrate", str6);
                    if (mediaModel != null) {
                        i4 = mediaModel.width;
                        i5 = mediaModel.height;
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(Math.max(0, i4));
                    LIZ2.append('*');
                    LIZ2.append(Math.max(0, i5));
                    String resolution = X1D.LIZIZ(LIZ2);
                    o.LJIIIZ(resolution, "resolution");
                    h9n.LIZ.LIZLLL("resolution", resolution);
                    h9n.LIZIZ(shortVideoContext2);
                    h9n.LIZ();
                    return null;
                }
            }, C10K.LJIIIIZZ, null);
        }
        if (C1DG.LJIIIIZZ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("content_type", "video");
            if (parcelableArrayListExtra.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            c145995oB.LJI("upload_type", str);
            FMX.LJIIL("upload_content_next", c145995oB.LIZ);
        }
        if (HOA.LIZ() && !z && !z2) {
            shortVideoContext.creativeModel.uploadPreviewClipModel.hasMediaClipped = false;
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                if (mediaModel.startTime > 0 || mediaModel.endTime > 0) {
                    shortVideoContext.creativeModel.uploadPreviewClipModel.hasMediaClipped = true;
                    break;
                }
            }
        }
        Activity activity2 = this.LIZ;
        Intent intent = new Intent();
        intent.putExtra("extra_edit_effect_uid", LLJJIJIIJIL);
        intent.putExtra("extra_start_enter_cut_page", longExtra);
        intent.putExtra("enter_method", shortVideoContext.enterMethod);
        intent.putExtra("from_music_detail", o.LJ("single_song", shortVideoContext.shootWay));
        CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        C77412UZs.LJJIJIL(intent, creativeInfo);
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
        intent.putExtra("shoot_way", shortVideoContext.shootWay);
        intent.putExtra("shoot_mode", shortVideoContext.shootMode);
        intent.putExtra("shoot_from", shortVideoContext.mShootFrom);
        intent.putExtra("shout_out_data", shortVideoContext.mShoutOutsData);
        intent.putExtra("extra_stick_point_type", intExtra);
        intent.putExtra("comment_video_model", shortVideoContext.commentVideoModel);
        intent.putExtra("question_answer_video_model", shortVideoContext.qaStruct);
        QAStickerModel qAStickerModel = shortVideoContext.qaStickerModel;
        if (!(qAStickerModel instanceof Parcelable)) {
            qAStickerModel = null;
        }
        intent.putExtra("question_answer_video_model_new", (Parcelable) qAStickerModel);
        intent.putExtra("library_video_model", (Serializable) shortVideoContext.libraryContext.libraryMaterialInfo);
        intent.putExtra("share_id", shortVideoContext.mShareId);
        intent.putExtra("channel", shortVideoContext.clientId);
        intent.putExtra("is_rivate", shortVideoContext.isPrivate);
        if (C170626mo.LIZJ(activity2, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
            intent.putExtra("path", shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath());
        }
        List<AVChallenge> list = C41658GWo.LIZLLL().LIZ;
        o.LJIIIIZZ(list, "inst().challenges");
        intent.putExtra("extra_tts_voice_model", (Serializable) shortVideoContext.ttsVoiceModel);
        if (!C32151Nz.LJJIIJZLJL(list)) {
            Object obj2 = ListProtector.get(list, 0);
            if (obj2 instanceof Serializable) {
                serializable = (Serializable) obj2;
            } else {
                serializable = null;
            }
            intent.putExtra("av_challenge", serializable);
        }
        intent.putExtra("micro_app_info", shortVideoContext.microAppModel);
        intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.creativeFlowData);
        C43587H8t.LIZIZ(intent, new HB0(shortVideoContext), EnumC43590H8w.RECORD, EnumC43590H8w.CUT);
        if (TextUtils.equals(shortVideoContext.enterFrom, "douplus")) {
            intent.putExtra("extra_mention_user_model", shortVideoContext.mentionUserModel);
            intent.putExtra("enter_from", "douplus");
        } else if (!TextUtils.isEmpty(shortVideoContext.enterFrom)) {
            intent.putExtra("enter_from", shortVideoContext.enterFrom);
        }
        intent.putExtra("upload_method", shortVideoContext.uploadMethod);
        List<String> list2 = shortVideoContext.uploadTabNameList;
        if (list2 != null) {
            intent.putStringArrayListExtra("upload_tab_name", new ArrayList<>(list2));
        }
        intent.putExtra("upload_next_method", shortVideoContext.albumPreviewNextMethod);
        intent.putExtra("reuse_original_sound_url", shortVideoContext.LJIJ());
        intent.putExtra("reuse_original_sound_id", shortVideoContext.LJIILLIIL());
        intent.putExtra("reuse_original_sound_length", shortVideoContext.LJIIZILJ());
        intent.putExtra("music_origin", shortVideoContext.LJIIL());
        if ((shortVideoContext.LJJIJIL() && C145595nX.LIZ()) || shortVideoContext.LJJIJ() || shortVideoContext.LJJIJIIJIL()) {
            intent.putExtra("music_start", shortVideoContext.cameraComponentModel.mMusicStart);
            intent.putExtra("extra_music_end", shortVideoContext.cameraComponentModel.musicEndTime);
        }
        String str4 = shortVideoContext.creativeModel.initialModel.profileParametersModel.guideWording;
        if (!TextUtils.isEmpty(str4)) {
            intent.putExtra("wording", str4);
        }
        V16.LJJJLL(intent, shortVideoContext);
        if (z2) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(data, "key_ugc_template_id");
            Serializable serializableExtra = data.getSerializableExtra("key_ugc_template_anchor");
            if (serializableExtra instanceof AnchorCommonStruct) {
                anchorCommonStruct = (AnchorCommonStruct) serializableExtra;
            } else {
                anchorCommonStruct = null;
            }
            C78996UzQ.LJIILL(intent).ugcTemplateData.ugcTemplateId = LLJJIJIIJIL2;
            C78996UzQ.LJIILL(intent).ugcTemplateData.ugcTemplateOriginAnchor = anchorCommonStruct;
            C78996UzQ.LJIILL(intent).ugcTemplateData.isUgcTemplateFromAnchor = z2;
            C78996UzQ.LJIILL(intent).ugcTemplateData.ugcTemplateTag = C16880lQ.LLJJIJIIJIL(data, "ugc_template_tag");
            C78996UzQ.LJIILL(intent).followUpPublishTrackerModel.followUpFirstItemId = C78983UzD.LJLJLLL;
            C78996UzQ.LJIILL(intent).followUpPublishTrackerModel.followUpItemIdGroups = C78983UzD.LJLL;
            C78996UzQ.LJIILL(intent).followUpPublishTrackerModel.enterRecordFromFeed = true;
        }
        if (data.getIntExtra("key_choose_scene", -1) == 36) {
            z4 = true;
        } else {
            z4 = false;
        }
        C78996UzQ.LJIILL(intent).ugcTemplateData.isPUgcTemplateFromAnchor = z4;
        ((InterfaceC42119Gfz) this.LIZLLL.getValue()).LIZ(parcelableArrayListExtra, data, intent, null);
    }

    public H9O(Activity activity, long j, long j2) {
        this.LIZ = activity;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
