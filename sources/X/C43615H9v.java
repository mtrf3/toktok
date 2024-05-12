package X;

import Y.ACallableS9S0500000_7;
import Y.ARunnableS3S1100000_2;
import Y.AgS110S0200000_7;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H9v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43615H9v implements InterfaceC45242HpG {
    public final ActivityC45651qj LIZ;
    public MvThemeData LIZJ;
    public AVETParameter LIZLLL;
    public ShortVideoContext LJ;
    public C173166qu LJFF;
    public AVChallenge LJI;
    public boolean LJII;
    public long LJIIJ;
    public long LJIIJJI;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 642));
    public final java.util.Map<String, String> LJIIIIZZ = new LinkedHashMap();
    public final List<MvNetFileBean> LJIIIZ = new ArrayList();
    public final ArrayList<ImportVideoInfo> LJIIL = new ArrayList<>();
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 643));

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
    }

    public final ProgressDialogC173706rm LJ() {
        return (ProgressDialogC173706rm) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
        C10K.LIZJ(new CallableC42106Gfm(this));
    }

    public C43615H9v(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    public final void LJFF(MvCreateVideoData mvCreateVideoData) {
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        String str5;
        List<String> list2;
        List<String> list3;
        Effect effect;
        Effect effect2;
        String str6;
        String str7;
        C173166qu c173166qu = this.LJFF;
        if (c173166qu != null) {
            c173166qu.LIZLLL = System.currentTimeMillis() - this.LJIIJJI;
            if (C60903NvH.LJIIJJI().getAccountService() != null && C1DG.LJIIIIZZ()) {
                C173166qu c173166qu2 = this.LJFF;
                if (c173166qu2 != null) {
                    c173166qu2.LIZ = 1;
                    c173166qu2.LIZIZ = 101;
                    c173166qu2.LIZJ = "teen mode";
                    MvThemeData mvThemeData = this.LIZJ;
                    if (mvThemeData == null || (str7 = mvThemeData.LJIIJ()) == null) {
                        str7 = "";
                    }
                    C173156qt.LJ(c173166qu2, str7, "", C78855Ux9.LJLJL, "mv");
                    HAQ.LIZIZ(false, this.LIZJ, new OSZ(101, "teen mode"));
                    return;
                }
                o.LJIJI("initMvMobParams");
                throw null;
            }
            if (mvCreateVideoData.selectMediaList.isEmpty()) {
                ActivityC45651qj activityC45651qj = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                String string = this.LIZ.getString(R.string.h_w);
                o.LJIIIIZZ(string, "activity.getString(R.string.image_process_failed)");
                creativeToastBuilder.message(string);
                C78915Uy7.LJJIIZI(activityC45651qj, 3003, creativeToastBuilder);
                C173166qu c173166qu3 = this.LJFF;
                if (c173166qu3 != null) {
                    c173166qu3.LIZ = 1;
                    c173166qu3.LIZIZ = 100;
                    c173166qu3.LIZJ = "media list is empty";
                    MvThemeData mvThemeData2 = this.LIZJ;
                    if (mvThemeData2 == null || (str6 = mvThemeData2.LJIIJ()) == null) {
                        str6 = "";
                    }
                    C173156qt.LJ(c173166qu3, str6, "", C78855Ux9.LJLJL, "mv");
                    HAQ.LIZIZ(false, this.LIZJ, new OSZ(100, "media list is empty"));
                    return;
                }
                o.LJIJI("initMvMobParams");
                throw null;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJIIJJI;
            MvThemeData mvThemeData3 = this.LIZJ;
            if (mvThemeData3 != null) {
                str = mvThemeData3.LJIIJJI();
            } else {
                str = null;
            }
            boolean z = this.LJII;
            if (!C77413UZt.LJIILL(mvCreateVideoData.selectMediaList) && str != null) {
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("duration", Long.valueOf(currentTimeMillis));
                c6bk.LIZ.put("pictureCount", Integer.valueOf(mvCreateVideoData.selectMediaList.size()));
                c6bk.LIZ.put("needServer", Boolean.valueOf(z));
                c6bk.LIZ.put("mvID", str);
                C43882HKc.LIZLLL(0, "aweme_mv_generate_duration", c6bk.LJ(), true);
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("content_type", "photo");
            c145995oB.LJI("upload_type", "mv");
            FMX.LJIIL("upload_event_next", c145995oB.LIZ);
            MvThemeData mvThemeData4 = this.LIZJ;
            if (mvThemeData4 != null) {
                str2 = mvThemeData4.LJIIJJI();
            } else {
                str2 = null;
            }
            C46104I7o.LJJJI(str2, 2);
            MvThemeData mvThemeData5 = this.LIZJ;
            if (mvThemeData5 != null && (effect2 = mvThemeData5.effect) != null) {
                str3 = effect2.getResourceId();
            } else {
                str3 = null;
            }
            C46104I7o.LJJJI(str3, 6);
            MvThemeData mvThemeData6 = this.LIZJ;
            if (mvThemeData6 != null) {
                str4 = mvThemeData6.LJIIJJI();
            } else {
                str4 = null;
            }
            C46104I7o.LJJJI(str4, 7);
            ActivityC45651qj context = this.LIZ;
            MvThemeData mvThemeData7 = this.LIZJ;
            AVChallenge aVChallenge = this.LJI;
            ShortVideoContext shortVideoContext = this.LJ;
            if (shortVideoContext != null) {
                AVETParameter aVETParameter = this.LIZLLL;
                long j = this.LJIIJ;
                ArrayList<ImportVideoInfo> arrayList = this.LJIIL;
                o.LJIIIZ(context, "context");
                Intent intent = new Intent();
                if (mvThemeData7 != null && (effect = mvThemeData7.effect) != null) {
                    list = effect.getMusic();
                } else {
                    list = null;
                }
                mvCreateVideoData.musicIds = list;
                if (mvThemeData7 != null && !TextUtils.isEmpty(mvThemeData7.LJIIJJI())) {
                    AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
                    aVUploadMiscInfoStruct.mvThemeId = mvThemeData7.LJIIJJI();
                    aVUploadMiscInfoStruct.mvType = EnumC43998HOo.MV_TEMPLATE.getValue();
                    MvModel mvModel = new MvModel();
                    mvModel.setMvId(mvThemeData7.LJIIJJI());
                    mvModel.setName(mvThemeData7.effect.getName());
                    mvModel.setMvAnchor(mvThemeData7.isMvAnchor);
                    aVUploadMiscInfoStruct.mvInfo = mvModel;
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(mvThemeData7.effect.getIconUrl().getUrlList());
                    mvModel.setIconUrl(urlModel);
                    aVUploadMiscInfoStruct.sourceId = mvThemeData7.sourceId;
                    intent.putExtra("av_upload_struct", aVUploadMiscInfoStruct);
                    String LJIIJJI = mvThemeData7.LJIIJJI();
                    if (LJIIJJI == null) {
                        LJIIJJI = "";
                    }
                    intent.putExtra("template_id", LJIIJJI);
                    Effect effect3 = mvThemeData7.effect;
                    if (effect3 != null) {
                        list2 = effect3.getMusic();
                    } else {
                        list2 = null;
                    }
                    if (!C77413UZt.LJIILL(list2)) {
                        Gson gson = new Gson();
                        Effect effect4 = mvThemeData7.effect;
                        if (effect4 != null) {
                            list3 = effect4.getMusic();
                        } else {
                            list3 = null;
                        }
                        intent.putExtra("first_sticker_music_ids", GsonProtectorUtils.toJson(gson, list3));
                    }
                    if (TextUtils.equals(mvThemeData7.LJIIJJI(), shortVideoContext.mBindMovieId)) {
                        intent.putExtra("extra_bind_mv_id", shortVideoContext.mBindMovieId);
                    }
                    mvCreateVideoData.mvResUnzipPath = mvThemeData7.LJIIIZ();
                    mvCreateVideoData.mvType = mvThemeData7.mvType;
                    mvCreateVideoData.mvId = mvThemeData7.LJIIJJI();
                    mvCreateVideoData.mvAutoSaveToast = mvThemeData7.mvAutoSaveToast;
                }
                StringBuilder LIZ = X1D.LIZ();
                String LIZ2 = HJC.LIZ(shortVideoContext.creativeInfo);
                o.LJIIIIZZ(LIZ2, "getMvConcatDir(shortVideoContext.creativeInfo)");
                LIZ.append(C78966Uyw.LJIJJLI(LIZ2));
                LIZ.append(HJC.LIZJ(".mp4"));
                String LIZIZ = X1D.LIZIZ(LIZ);
                C78966Uyw.LJJJJZ(new File(LIZIZ));
                mvCreateVideoData.contactVideoPath = LIZIZ;
                intent.putExtra("key_mv_theme_data", mvCreateVideoData);
                intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.creativeFlowData);
                CreativeModel creativeModel = shortVideoContext.creativeModel;
                o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
                C78996UzQ.LJJIZ(intent, creativeModel);
                intent.putExtra("key_mv_theme_enter", true);
                if (arrayList != null && !arrayList.isEmpty()) {
                    intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
                }
                V16.LJJJLL(intent, shortVideoContext);
                if (aVETParameter != null) {
                    List list4 = C41658GWo.LIZLLL().LIZ;
                    if (aVChallenge != null) {
                        if (list4 == null) {
                            list4 = new ArrayList();
                        }
                        list4.add(aVChallenge);
                    }
                    intent.putExtra("extra_edit_preview_info", (Parcelable) new HA0(720, 1280).LIZ(mvCreateVideoData));
                    o.LJII(list4, "null cannot be cast to non-null type java.io.Serializable");
                    intent.putExtra("challenge", (Serializable) list4);
                    intent.putExtra("shoot_way", aVETParameter.getShootWay());
                    CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                    C77412UZs.LJJIJIL(intent, creativeInfo);
                    intent.putExtra("shoot_mode", aVETParameter.getShootMode());
                    intent.putExtra("draft_id", aVETParameter.getDraftId());
                    intent.putExtra("new_draft_id", aVETParameter.getNewDraftId());
                    intent.putExtra("origin", 0);
                    intent.putExtra("content_type", "mv");
                    intent.putExtra("content_source", "upload");
                    intent.putExtra("comment_video_model", shortVideoContext.commentVideoModel);
                    intent.putExtra("question_answer_video_model", shortVideoContext.qaStruct);
                    QAStickerModel qAStickerModel = shortVideoContext.qaStickerModel;
                    if (!(qAStickerModel instanceof Parcelable)) {
                        qAStickerModel = null;
                    }
                    intent.putExtra("question_answer_video_model_new", (Parcelable) qAStickerModel);
                    LibraryMaterialInfoSv libraryMaterialInfoSv = shortVideoContext.libraryContext.libraryMaterialInfo;
                    if (!(libraryMaterialInfoSv instanceof Serializable)) {
                        libraryMaterialInfoSv = null;
                    }
                    intent.putExtra("library_video_model", (Serializable) libraryMaterialInfoSv);
                    intent.putExtra("extra_tts_voice_model", (Serializable) shortVideoContext.ttsVoiceModel);
                    intent.putExtra("extra_start_enter_edit_page", j);
                    intent.putExtra("micro_app_info", shortVideoContext.microAppModel);
                    intent.putExtra("enter_method", shortVideoContext.enterMethod);
                    intent.putExtra("commerce_data_in_tools_line", shortVideoContext.extraSession.commerceData);
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    intent.putExtra("extra_music_use_in_record_page_mv", extractAVMusic);
                }
                C173166qu c173166qu4 = this.LJFF;
                if (c173166qu4 != null) {
                    c173166qu4.LIZ = 0;
                    MvThemeData mvThemeData8 = this.LIZJ;
                    if (mvThemeData8 == null || (str5 = mvThemeData8.LJIIJ()) == null) {
                        str5 = "";
                    }
                    C173156qt.LJ(c173166qu4, str5, "", C78855Ux9.LJLJL, "mv");
                    C42662Gok.LJ(this.LIZ, C16880lQ.LLJJIJI(intent));
                    HAQ.LIZIZ(true, this.LIZJ, null);
                    return;
                }
                o.LJIJI("initMvMobParams");
                throw null;
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
        o.LJIJI("initMvMobParams");
        throw null;
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        Serializable serializable;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        Integer num;
        MvThemeData mvThemeData;
        String LJIIIZ;
        int i2;
        o.LJIIIZ(data, "data");
        if (i == 10001) {
            ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
            o.LJI(parcelableArrayListExtra);
            this.LJIIL.clear();
            int size = parcelableArrayListExtra.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MediaModel mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, i3);
                if (!mediaModel.LJI()) {
                    ArrayList<ImportVideoInfo> arrayList = this.LJIIL;
                    int i4 = mediaModel.width;
                    int i5 = mediaModel.height;
                    String valueOf = String.valueOf(i3);
                    long j = mediaModel.duration;
                    long j2 = mediaModel.endTime - mediaModel.startTime;
                    String str4 = mediaModel.fileLocalUriPath;
                    arrayList.add(new ImportVideoInfo(i4, i5, 0, 0, valueOf, j, j2, "", "", 0, 0.0f, str4, str4, false, null, 24576, null));
                    i3++;
                } else {
                    this.LJIIL.clear();
                    break;
                }
            }
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(data, "key_extra_info");
            if (LJJLIIIIJ != null) {
                serializable = LJJLIIIIJ.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.LJI = (AVChallenge) serializable;
            this.LJIIJ = data.getLongExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            MvCreateVideoData mvCreateVideoData = new MvCreateVideoData();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                mvCreateVideoData.selectMediaList.add(((MediaModel) it.next()).fileLocalUriPath);
            }
            if (data.getIntExtra("key_choose_scene", -1) == 31) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                AVMusic aVMusic = (AVMusic) data.getSerializableExtra("aweme_music");
                ShortVideoContext shortVideoContext = this.LJ;
                if (shortVideoContext != null) {
                    MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
                    musicBuzModel.musicOrigin = "single_song";
                    I9T.LJI(aVMusic, false, musicBuzModel);
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            }
            MvThemeData mvThemeData2 = (MvThemeData) data.getParcelableExtra("key_select_mv_data");
            this.LIZJ = mvThemeData2;
            if (mvThemeData2 != null) {
                z2 = mvThemeData2.needServerExecute;
            } else {
                z2 = false;
            }
            this.LJII = z2;
            Parcelable parcelableExtra = data.getParcelableExtra("key_short_video_context");
            o.LJI(parcelableExtra);
            this.LJ = (ShortVideoContext) parcelableExtra;
            ShortVideoContext shortVideoContext2 = this.LJ;
            if (shortVideoContext2 != null) {
                String LJI = shortVideoContext2.LJI();
                ShortVideoContext shortVideoContext3 = this.LJ;
                if (shortVideoContext3 != null) {
                    String str5 = shortVideoContext3.shootWay;
                    String str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    MvThemeData mvThemeData3 = this.LIZJ;
                    if (mvThemeData3 == null || (str = mvThemeData3.LJIIJJI()) == null) {
                        str = "";
                    }
                    this.LJFF = new C173166qu(LJI, str5, str, 15);
                    ShortVideoContext shortVideoContext4 = this.LJ;
                    if (shortVideoContext4 != null) {
                        this.LIZLLL = shortVideoContext4.LIZLLL();
                        ShortVideoContext shortVideoContext5 = this.LJ;
                        if (shortVideoContext5 != null) {
                            String str7 = "mv";
                            if (parcelableArrayListExtra.size() > 1) {
                                str2 = "multiple_content";
                            } else {
                                str2 = "single_content";
                            }
                            int i6 = 0;
                            int size2 = parcelableArrayListExtra.size();
                            String str8 = "photo";
                            if (parcelableArrayListExtra.size() > 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            H9N h9n = new H9N(shortVideoContext5, str7, str2, i6, size2, str8, z3, C173606rc.LIZ(parcelableArrayListExtra), C79081V1x.LJIIZILJ(parcelableArrayListExtra));
                            MvThemeData mvThemeData4 = this.LIZJ;
                            if (mvThemeData4 != null) {
                                str3 = mvThemeData4.LJIIJJI();
                            } else {
                                str3 = null;
                            }
                            C145995oB c145995oB = h9n.LIZ;
                            if (str3 != null) {
                                str6 = str3;
                            }
                            c145995oB.LIZLLL("mv_id", str6);
                            h9n.LIZ.LIZ(0, "is_capcut");
                            MvThemeData mvThemeData5 = this.LIZJ;
                            if (mvThemeData5 != null) {
                                num = Integer.valueOf(mvThemeData5.isMvAnchor);
                            } else {
                                num = null;
                            }
                            h9n.LIZ.LIZJ(num, "is_mv_anchor");
                            h9n.LIZ();
                            if (!C77413UZt.LJIILL(mvCreateVideoData.selectMediaList) && (mvThemeData = this.LIZJ) != null && (LJIIIZ = mvThemeData.LJIIIZ()) != null && LJIIIZ.length() > 0) {
                                this.LJIIJJI = System.currentTimeMillis();
                                if (this.LJII) {
                                    ProgressDialogC173706rm LJ = LJ();
                                    String string = this.LIZ.getString(R.string.qi);
                                    o.LJIIIIZZ(string, "activity.getString(R.string.Pic_video_loading)");
                                    LJ.LJLJLLL.postDelayed(new ARunnableS3S1100000_2(LJ, string, 3), 500L);
                                } else {
                                    ProgressDialogC173706rm LJ2 = LJ();
                                    String string2 = this.LIZ.getString(R.string.ra6);
                                    o.LJIIIIZZ(string2, "activity.getString(R.str…g.short_video_processing)");
                                    LJ2.LJLJLLL.postDelayed(new ARunnableS3S1100000_2(LJ2, string2, 3), 500L);
                                }
                                C76732zl c76732zl = new C76732zl();
                                c76732zl.element = 720;
                                C76732zl c76732zl2 = new C76732zl();
                                c76732zl2.element = 1280;
                                C76732zl c76732zl3 = new C76732zl();
                                c76732zl3.element = 1;
                                MvThemeData mvThemeData6 = this.LIZJ;
                                if (mvThemeData6 != null) {
                                    int i7 = mvThemeData6.resWidth;
                                    if (i7 != 0 && (i2 = mvThemeData6.resHeight) != 0) {
                                        c76732zl.element = i7;
                                        c76732zl2.element = i2;
                                        mvCreateVideoData.resDestWidth = i7;
                                        mvCreateVideoData.resDestHeight = i2;
                                    }
                                    if (o.LJ("AspectFill", mvThemeData6.resFillMode)) {
                                        c76732zl3.element = 1;
                                    } else if (o.LJ("AspectFit", mvThemeData6.resFillMode)) {
                                        c76732zl3.element = 3;
                                    } else if (o.LJ("AspectWidth", mvThemeData6.resFillMode)) {
                                        c76732zl3.element = 2;
                                    } else if (o.LJ("FreeMode", mvThemeData6.resFillMode)) {
                                        c76732zl3.element = 4;
                                    } else if (o.LJ("CenterZoom", mvThemeData6.resFillMode)) {
                                        c76732zl3.element = 5;
                                    }
                                }
                                mvCreateVideoData.resFillMode = c76732zl3.element;
                                mvCreateVideoData.srcSelectMediaList.clear();
                                mvCreateVideoData.srcSelectMediaList.addAll(mvCreateVideoData.selectMediaList);
                                C10K.LIZJ(new ACallableS9S0500000_7(this, mvCreateVideoData, c76732zl, c76732zl2, c76732zl3, 1)).LJ(new AgS110S0200000_7(this, mvCreateVideoData, 16), C10K.LJIIIIZZ, null);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
                o.LJIJI("shortVideoContext");
                throw null;
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
