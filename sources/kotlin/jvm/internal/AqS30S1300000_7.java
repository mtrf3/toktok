package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C00F;
import X.C145595nX;
import X.C145995oB;
import X.C163786bm;
import X.C16880lQ;
import X.C1DG;
import X.C32I;
import X.C35N;
import X.C41658GWo;
import X.C42662Gok;
import X.C43015GuR;
import X.C43617H9x;
import X.C43882HKc;
import X.C43933HMb;
import X.C44172HVg;
import X.C45500HtQ;
import X.C45501HtR;
import X.C46104I7o;
import X.C47261Igj;
import X.C5Z5;
import X.C60903NvH;
import X.C76800UCe;
import X.C77412UZs;
import X.C78685UuP;
import X.C78915Uy7;
import X.C78966Uyw;
import X.C78996UzQ;
import X.FMX;
import X.GLA;
import X.HA0;
import X.HA2;
import X.HAE;
import X.HJC;
import X.HVO;
import X.InterfaceC42275GiV;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OHI;
import X.OSZ;
import X.V16;
import X.X1D;
import Y.AObjectS136S0100000_7;
import Y.AObjectS30S0000000_7;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.composer.model.MusicComposerModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS30S1300000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        String str;
        String str2;
        int i;
        String str3;
        View it = (View) obj;
        o.LJIIIZ(it, "it");
        int i2 = 0;
        C60903NvH.LJIIJJI().LJJIL().setReactDuetSettingCurrent(0);
        MutableLiveData<Boolean> mutableLiveData = ((CommonSettingItemStatus) aqS30S1300000_7.l1)._checked;
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(Boolean.valueOf(!o.LJ(value, bool)));
        if (it instanceof C35N) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.p7h);
            C78915Uy7.LJJIJ(it, 2025, creativeToastBuilder);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", aqS30S1300000_7.s0);
        c145995oB.LJI("enter_from", "video_post_page");
        if (o.LJ(((CommonSettingItemStatus) aqS30S1300000_7.l1)._checked.getValue(), bool)) {
            str = "on";
        } else {
            str = "off";
        }
        c145995oB.LJI("to_status", str);
        HashMap hashMap = (HashMap) aqS30S1300000_7.l2;
        if (hashMap != null) {
            str2 = (String) hashMap.get("shoot_way");
        } else {
            str2 = null;
        }
        c145995oB.LJI("shoot_way", str2);
        BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) aqS30S1300000_7.l3;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && ((VideoPublishEditModel) baseShortVideoContext).isDuet()) {
            i = ((VideoPublishEditModel) ((BaseShortVideoContext) aqS30S1300000_7.l3)).duetVideoDuration;
        } else {
            i = 0;
        }
        c145995oB.LIZ(i, "duet_video_duration");
        BaseShortVideoContext baseShortVideoContext2 = (BaseShortVideoContext) aqS30S1300000_7.l3;
        if (baseShortVideoContext2 instanceof VideoPublishEditModel) {
            i2 = ((VideoPublishEditModel) baseShortVideoContext2).mDuetFromDuetButton;
        }
        c145995oB.LIZ(i2, "is_from_duet_button");
        BaseShortVideoContext baseShortVideoContext3 = (BaseShortVideoContext) aqS30S1300000_7.l3;
        if ((baseShortVideoContext3 instanceof VideoPublishEditModel) && ((VideoPublishEditModel) baseShortVideoContext3).isDuet()) {
            str3 = ((VideoPublishEditModel) ((BaseShortVideoContext) aqS30S1300000_7.l3)).duetLayout;
        } else {
            str3 = "";
        }
        c145995oB.LJI("duet_layout", str3);
        c145995oB.LIZ(((BaseShortVideoContext) aqS30S1300000_7.l3).getVideoLength(), "creation_duration");
        FMX.LJIIL("click_react_duet_control", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        HVO.LJ((String[]) aqS30S1300000_7.l1, (ActivityC45651qj) aqS30S1300000_7.l2, true, aqS30S1300000_7.s0);
        it.LIZJ = false;
        OHI ohi = OHI.LIZ;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS30S1300000_7.l2;
        ohi.getClass();
        OHI.LJII(activityC45651qj);
        ((InterfaceC65784Pro) aqS30S1300000_7.l3).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ = true;
        HVO.LJ((String[]) aqS30S1300000_7.l1, (ActivityC45651qj) aqS30S1300000_7.l2, false, aqS30S1300000_7.s0);
        ((InterfaceC65784Pro) aqS30S1300000_7.l3).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        AvatarUri it = (AvatarUri) obj;
        o.LJIIIZ(it, "it");
        IProfileService LIZ = ProfileServiceImpl.LIZ();
        GLA gla = (GLA) aqS30S1300000_7.l1;
        LIZ.updateSavePostChoose(gla.LIZ, gla.LIZIZ.creativeModel.changeAvatarModel.realEnterMethod, it, aqS30S1300000_7.s0, new AqS96S0300000_7(gla, (GLA) it, (AvatarUri) aqS30S1300000_7.l2, (InterfaceC65784Pro<C76800UCe>) 8), new AqS138S0200000_7((GLA) aqS30S1300000_7.l1, (GLA) aqS30S1300000_7.l3, (InterfaceC88472Yns<? super Exception, C76800UCe>) 35));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        C43933HMb info = (C43933HMb) obj;
        o.LJIIIZ(info, "info");
        ChooseMediaExtensionKt.LIZIZ(info, (MediaModel) aqS30S1300000_7.l1);
        C43882HKc.LIZLLL(0, "aweme_movie_import_error_rate", null, true);
        C45501HtR.LLJLLIL((MediaModel) aqS30S1300000_7.l1, info.LJLILLLLZI, 0, 0, info.LJLJI, aqS30S1300000_7.s0);
        C45501HtR c45501HtR = (C45501HtR) aqS30S1300000_7.l2;
        if (c45501HtR.mActivity == null || !c45501HtR.LJLIL) {
            c45501HtR.LLIL = false;
        } else {
            ((InterfaceC65784Pro) aqS30S1300000_7.l3).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        C43933HMb info = (C43933HMb) obj;
        o.LJIIIZ(info, "info");
        ChooseMediaExtensionKt.LIZIZ(info, (MediaModel) aqS30S1300000_7.l1);
        C43882HKc.LIZLLL(0, "aweme_movie_import_error_rate", null, true);
        C45500HtQ.LLJLLL((MediaModel) aqS30S1300000_7.l1, info.LJLILLLLZI, 0, 0, info.LJLJI, aqS30S1300000_7.s0);
        C45500HtQ c45500HtQ = (C45500HtQ) aqS30S1300000_7.l2;
        if (c45500HtQ.mActivity == null || !c45500HtQ.LJLIL) {
            c45500HtQ.LLILIL = false;
        } else {
            ((InterfaceC65784Pro) aqS30S1300000_7.l3).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        AsyncAVService loadService = (AsyncAVService) obj;
        o.LJIIIZ(loadService, "$this$loadService");
        if (((MusicShootAssem) aqS30S1300000_7.l1).getContext() != null) {
            IUIService uiService = loadService.uiService();
            Context context = ((MusicShootAssem) aqS30S1300000_7.l1).getContext();
            if (context != null) {
                CreationComposerDsl creationComposerDsl = new CreationComposerDsl();
                String str = aqS30S1300000_7.s0;
                MusicModel musicModel = (MusicModel) aqS30S1300000_7.l2;
                MusicShootAssem musicShootAssem = (MusicShootAssem) aqS30S1300000_7.l1;
                UrlModel urlModel = (UrlModel) aqS30S1300000_7.l3;
                creationComposerDsl.basic(new AqS173S0100000_7(musicShootAssem, 358));
                creationComposerDsl.musicShareStory(new AqS111S0300000_7(urlModel, musicModel, musicShootAssem, 34));
                creationComposerDsl.callback(new AqS173S0100000_7(musicShootAssem, 359));
                int duration = musicModel.getDuration();
                if (duration > 3000) {
                    duration = 3000;
                }
                creationComposerDsl.setMusic(new MusicComposerModel(str, 0, duration, musicModel));
                uiService.startCreation(context, creationComposerDsl);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS30S1300000_7 aqS30S1300000_7, Object obj) {
        List<String> list;
        String str;
        String str2;
        String str3;
        String l;
        String str4;
        ArrayList<? extends Parcelable> arrayList;
        String str5;
        Effect effect;
        Effect effect2;
        Effect effect3;
        Effect effect4;
        ArrayList<? extends Parcelable> arrayList2 = (ArrayList) obj;
        InterfaceC42275GiV interfaceC42275GiV = ((C43617H9x) aqS30S1300000_7.l1).LJIIIZ;
        if (interfaceC42275GiV != null) {
            interfaceC42275GiV.onFinish(true);
        }
        C43617H9x c43617H9x = (C43617H9x) aqS30S1300000_7.l1;
        MvCreateVideoData mvCreateVideoData = (MvCreateVideoData) aqS30S1300000_7.l2;
        c43617H9x.getClass();
        if (C43015GuR.LIZ() && !C1DG.LJIIIIZZ() && !AVCommerceServiceImpl.LJIIJ().LIZ() && C44172HVg.LJIJ.isLogin()) {
            new HA2(new HAE(null, new WeakReference(c43617H9x.LIZ), null, null, mvCreateVideoData.srcSelectMediaList, "", 960)).LIZ(null);
        }
        C43617H9x c43617H9x2 = (C43617H9x) aqS30S1300000_7.l1;
        MvCreateVideoData mvCreateVideoData2 = (MvCreateVideoData) aqS30S1300000_7.l2;
        OSZ osz = (OSZ) aqS30S1300000_7.l3;
        String str6 = aqS30S1300000_7.s0;
        c43617H9x2.getClass();
        if (mvCreateVideoData2.selectMediaList.isEmpty()) {
            ActivityC45651qj activityC45651qj = c43617H9x2.LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            String string = c43617H9x2.LIZ.getString(R.string.h_w);
            o.LJIIIIZZ(string, "activity.getString(R.string.image_process_failed)");
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIIZI(activityC45651qj, 3070, creativeToastBuilder);
        } else {
            if (C1DG.LJIIIIZZ()) {
                C43617H9x.LIZIZ(mvCreateVideoData2);
            } else {
                c43617H9x2.LIZ(mvCreateVideoData2);
            }
            Intent intent = new Intent();
            MvThemeData mvThemeData = c43617H9x2.LJ;
            if (mvThemeData != null && (effect4 = mvThemeData.effect) != null) {
                list = effect4.getMusic();
            } else {
                list = null;
            }
            mvCreateVideoData2.musicIds = list;
            intent.putExtra("extra_edit_effect_uid", C60903NvH.LJIIJJI().LJIL().LIZJ(c43617H9x2.LIZ).getString("extra_edit_effect_uid"));
            MvThemeData mvThemeData2 = c43617H9x2.LJ;
            if (mvThemeData2 != null && (effect3 = mvThemeData2.effect) != null) {
                str = effect3.getEffectId();
            } else {
                str = null;
            }
            C46104I7o.LJJJI(str, 2);
            MvThemeData mvThemeData3 = c43617H9x2.LJ;
            if (mvThemeData3 != null && (effect2 = mvThemeData3.effect) != null) {
                str2 = effect2.getEffectId();
            } else {
                str2 = null;
            }
            C46104I7o.LJJJI(str2, 7);
            MvThemeData mvThemeData4 = c43617H9x2.LJ;
            if (mvThemeData4 != null && (effect = mvThemeData4.effect) != null) {
                str3 = effect.getResourceId();
            } else {
                str3 = null;
            }
            C46104I7o.LJJJI(str3, 6);
            MvThemeData mvThemeData5 = c43617H9x2.LJ;
            if (mvThemeData5 != null && !TextUtils.isEmpty(mvThemeData5.LJIIJJI())) {
                AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
                aVUploadMiscInfoStruct.mvThemeId = mvThemeData5.LJIIJJI();
                MvModel mvModel = new MvModel();
                mvModel.setMvId(mvThemeData5.LJIIJJI());
                mvModel.setName(mvThemeData5.effect.getName());
                mvModel.setMvAnchor(mvThemeData5.isMvAnchor);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(mvThemeData5.effect.getIconUrl().getUrlList());
                mvModel.setIconUrl(urlModel);
                aVUploadMiscInfoStruct.mvInfo = mvModel;
                aVUploadMiscInfoStruct.sourceId = mvThemeData5.sourceId;
                intent.putExtra("av_upload_struct", aVUploadMiscInfoStruct);
                String LJIIJJI = mvThemeData5.LJIIJJI();
                ShortVideoContext shortVideoContext = c43617H9x2.LJIIIIZZ;
                if (shortVideoContext != null) {
                    if (TextUtils.equals(LJIIJJI, shortVideoContext.mBindMovieId)) {
                        ShortVideoContext shortVideoContext2 = c43617H9x2.LJIIIIZZ;
                        if (shortVideoContext2 != null) {
                            intent.putExtra("extra_bind_mv_id", shortVideoContext2.mBindMovieId);
                        } else {
                            o.LJIJI("shortVideoContext");
                            throw null;
                        }
                    }
                    mvCreateVideoData2.mvResUnzipPath = mvThemeData5.LJIIIZ();
                    mvCreateVideoData2.mvType = mvThemeData5.mvType;
                    mvCreateVideoData2.mvAutoSaveToast = mvThemeData5.mvAutoSaveToast;
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            ShortVideoContext shortVideoContext3 = c43617H9x2.LJIIIIZZ;
            if (shortVideoContext3 != null) {
                String LIZ2 = HJC.LIZ(shortVideoContext3.creativeInfo);
                o.LJIIIIZZ(LIZ2, "getMvConcatDir(shortVideoContext.creativeInfo)");
                LIZ.append(C78966Uyw.LJIJJLI(LIZ2));
                LIZ.append(HJC.LIZJ(".mp4"));
                String LIZIZ = X1D.LIZIZ(LIZ);
                C78966Uyw.LJJJJZ(new File(LIZIZ));
                mvCreateVideoData2.contactVideoPath = LIZIZ;
                intent.putExtra("key_mv_theme_data", mvCreateVideoData2);
                intent.putExtra("key_mv_theme_enter", true);
                intent.putExtra("extra_need_add_recent", true);
                AVETParameter aVETParameter = c43617H9x2.LJFF;
                String str7 = "";
                if (aVETParameter != null) {
                    List<AVChallenge> list2 = C41658GWo.LIZLLL().LIZ;
                    intent.putExtra("extra_edit_preview_info", new HA0(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue()).LIZ(mvCreateVideoData2));
                    intent.putExtra("challenge", (Serializable) list2);
                    ShortVideoContext shortVideoContext4 = c43617H9x2.LJIIIIZZ;
                    if (shortVideoContext4 != null) {
                        if (TextUtils.equals(shortVideoContext4.enterFrom, "open_platform_share")) {
                            ShortVideoContext shortVideoContext5 = c43617H9x2.LJIIIIZZ;
                            if (shortVideoContext5 != null) {
                                intent.putExtra("shoot_way", shortVideoContext5.shootWay);
                                ShortVideoContext shortVideoContext6 = c43617H9x2.LJIIIIZZ;
                                if (shortVideoContext6 != null) {
                                    CreativeInfo creativeInfo = shortVideoContext6.creativeInfo;
                                    o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                                    C77412UZs.LJJIJIL(intent, creativeInfo);
                                    ShortVideoContext shortVideoContext7 = c43617H9x2.LJIIIIZZ;
                                    if (shortVideoContext7 != null) {
                                        Serializable serializable = shortVideoContext7.shareContext;
                                        if (serializable != null) {
                                            intent.putExtra("extra_share_context", serializable);
                                        }
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        } else {
                            ShortVideoContext shortVideoContext8 = c43617H9x2.LJIIIIZZ;
                            if (shortVideoContext8 != null) {
                                if (!TextUtils.isEmpty(shortVideoContext8.shootWay)) {
                                    ShortVideoContext shortVideoContext9 = c43617H9x2.LJIIIIZZ;
                                    if (shortVideoContext9 != null) {
                                        intent.putExtra("shoot_way", shortVideoContext9.shootWay);
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    intent.putExtra("shoot_way", aVETParameter.getShootWay());
                                }
                                ShortVideoContext shortVideoContext10 = c43617H9x2.LJIIIIZZ;
                                if (shortVideoContext10 != null) {
                                    CreativeInfo creativeInfo2 = shortVideoContext10.creativeInfo;
                                    o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
                                    C77412UZs.LJJIJIL(intent, creativeInfo2);
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        }
                        ShortVideoContext shortVideoContext11 = c43617H9x2.LJIIIIZZ;
                        if (shortVideoContext11 != null) {
                            intent.putExtra("is_rivate", shortVideoContext11.isPrivate);
                            ShortVideoContext shortVideoContext12 = c43617H9x2.LJIIIIZZ;
                            if (shortVideoContext12 != null) {
                                intent.putExtra("shoot_mode", shortVideoContext12.shootMode);
                                intent.putExtra("draft_id", aVETParameter.getDraftId());
                                ShortVideoContext shortVideoContext13 = c43617H9x2.LJIIIIZZ;
                                if (shortVideoContext13 != null) {
                                    if (shortVideoContext13.LJJIIJ()) {
                                        ShortVideoContext shortVideoContext14 = c43617H9x2.LJIIIIZZ;
                                        if (shortVideoContext14 != null) {
                                            intent.putExtra("reuse_original_sound_id", shortVideoContext14.LJIILLIIL());
                                            ShortVideoContext shortVideoContext15 = c43617H9x2.LJIIIIZZ;
                                            if (shortVideoContext15 != null) {
                                                intent.putExtra("reuse_original_sound_url", shortVideoContext15.LJIJ());
                                                ShortVideoContext shortVideoContext16 = c43617H9x2.LJIIIIZZ;
                                                if (shortVideoContext16 != null) {
                                                    intent.putExtra("reuse_original_sound_length", shortVideoContext16.LJIIZILJ());
                                                } else {
                                                    o.LJIJI("shortVideoContext");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("shortVideoContext");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("shortVideoContext");
                                            throw null;
                                        }
                                    }
                                    intent.putExtra("new_draft_id", aVETParameter.getNewDraftId());
                                    intent.putExtra("origin", c43617H9x2.LIZIZ ? 1 : 0);
                                    intent.putExtra("content_type", "slideshow");
                                    intent.putExtra("content_source", "upload");
                                    ShortVideoContext shortVideoContext17 = c43617H9x2.LJIIIIZZ;
                                    if (shortVideoContext17 != null) {
                                        intent.putExtra("shout_out_data", shortVideoContext17.mShoutOutsData);
                                        ShortVideoContext shortVideoContext18 = c43617H9x2.LJIIIIZZ;
                                        if (shortVideoContext18 != null) {
                                            intent.putExtra("creative_flow_data", shortVideoContext18.creativeFlowData);
                                            ShortVideoContext shortVideoContext19 = c43617H9x2.LJIIIIZZ;
                                            if (shortVideoContext19 != null) {
                                                intent.putExtra("share_id", shortVideoContext19.mShareId);
                                                ShortVideoContext shortVideoContext20 = c43617H9x2.LJIIIIZZ;
                                                if (shortVideoContext20 != null) {
                                                    intent.putExtra("channel", shortVideoContext20.clientId);
                                                    ShortVideoContext shortVideoContext21 = c43617H9x2.LJIIIIZZ;
                                                    if (shortVideoContext21 != null) {
                                                        intent.putExtra("comment_video_model", shortVideoContext21.commentVideoModel);
                                                        ShortVideoContext shortVideoContext22 = c43617H9x2.LJIIIIZZ;
                                                        if (shortVideoContext22 != null) {
                                                            intent.putExtra("extra_tts_voice_model", shortVideoContext22.ttsVoiceModel);
                                                            ShortVideoContext shortVideoContext23 = c43617H9x2.LJIIIIZZ;
                                                            if (shortVideoContext23 != null) {
                                                                intent.putExtra("question_answer_video_model", shortVideoContext23.qaStruct);
                                                                intent.putExtra("extra_start_enter_edit_page", c43617H9x2.LIZLLL);
                                                                intent.putExtra("use_music_before_edit", true);
                                                                ShortVideoContext shortVideoContext24 = c43617H9x2.LJIIIIZZ;
                                                                if (shortVideoContext24 != null) {
                                                                    intent.putExtra("enter_from", shortVideoContext24.enterFrom);
                                                                    FaceStickerBean faceStickerBean = c43617H9x2.LJIIJ;
                                                                    if (faceStickerBean != null) {
                                                                        String l2 = Long.valueOf(faceStickerBean.getStickerId()).toString();
                                                                        if (l2 == null) {
                                                                            l2 = "";
                                                                        }
                                                                        intent.putExtra("sticker_id", l2);
                                                                    }
                                                                    String str8 = c43617H9x2.LJII;
                                                                    if (str8 != null && c43617H9x2.LJI != null) {
                                                                        intent.putExtra("path", str8);
                                                                        intent.putExtra("music_model", c43617H9x2.LJI);
                                                                        if (c43617H9x2.LJIIL) {
                                                                            ShortVideoContext shortVideoContext25 = c43617H9x2.LJIIIIZZ;
                                                                            if (shortVideoContext25 != null) {
                                                                                str5 = shortVideoContext25.LJIIL();
                                                                            } else {
                                                                                o.LJIJI("shortVideoContext");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            str5 = "slideshow_rec";
                                                                        }
                                                                        intent.putExtra("music_origin", str5);
                                                                        Gson gson = new Gson();
                                                                        MusicModel musicModel = c43617H9x2.LJI;
                                                                        o.LJI(musicModel);
                                                                        intent.putExtra("first_sticker_music_ids", GsonProtectorUtils.toJson(gson, C47261Igj.LJJIJ(musicModel.getMusicId())));
                                                                        MusicModel musicModel2 = c43617H9x2.LJI;
                                                                        o.LJI(musicModel2);
                                                                        intent.putExtra("id", musicModel2.getMusicId());
                                                                    }
                                                                    ShortVideoContext shortVideoContext26 = c43617H9x2.LJIIIIZZ;
                                                                    if (shortVideoContext26 != null) {
                                                                        intent.putExtra("workspace", shortVideoContext26.cameraComponentModel.mWorkspace);
                                                                        intent.putExtra("extra_photo_mv_mode", true);
                                                                        intent.putExtra("extra_photo_mv_mode_1080p", C47261Igj.LJIJI());
                                                                        StringBuilder LIZ3 = X1D.LIZ();
                                                                        LIZ3.append("PhotoMvGoNextImpl: enable_photo_to_1080p = ");
                                                                        LIZ3.append(C47261Igj.LJIJI());
                                                                        C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
                                                                        ShortVideoContext shortVideoContext27 = c43617H9x2.LJIIIIZZ;
                                                                        if (shortVideoContext27 != null) {
                                                                            intent.putExtra("is_photo_mv_music", shortVideoContext27.mIsPhotoMvModeMusic);
                                                                            ArrayList<MediaModel> arrayList3 = c43617H9x2.LJIIJJI;
                                                                            if (arrayList3 != null) {
                                                                                arrayList = new ArrayList<>(C32I.LJJL(arrayList3, 10));
                                                                                Iterator<MediaModel> it = arrayList3.iterator();
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
                                                                                        arrayList.add(new ImportVideoInfo(i3, i4, 0, 0, valueOf, j2, j, null, null, 0, 0.0f, str9, str9, false, null, 26508, null));
                                                                                        i = i2;
                                                                                    } else {
                                                                                        C47261Igj.LJJJJJ();
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList = null;
                                                                            }
                                                                            if ((arrayList instanceof ArrayList) && arrayList != null) {
                                                                                intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
                                                                            }
                                                                            ShortVideoContext shortVideoContext28 = c43617H9x2.LJIIIIZZ;
                                                                            if (shortVideoContext28 != null) {
                                                                                intent.putExtra("commerce_data_in_tools_line", shortVideoContext28.extraSession.commerceData);
                                                                            } else {
                                                                                o.LJIJI("shortVideoContext");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("shortVideoContext");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("shortVideoContext");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("shortVideoContext");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("shortVideoContext");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("shortVideoContext");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("shortVideoContext");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("shortVideoContext");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("shortVideoContext");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("shortVideoContext");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        } else {
                            o.LJIJI("shortVideoContext");
                            throw null;
                        }
                    } else {
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                }
                ShortVideoContext shortVideoContext29 = c43617H9x2.LJIIIIZZ;
                if (shortVideoContext29 != null) {
                    CreativeModel creativeModel = shortVideoContext29.creativeModel;
                    o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
                    C78996UzQ.LJJIZ(intent, creativeModel);
                    ShortVideoContext shortVideoContext30 = c43617H9x2.LJIIIIZZ;
                    if (shortVideoContext30 != null) {
                        if (shortVideoContext30.LJJIJIL() && C145595nX.LIZ()) {
                            ShortVideoContext shortVideoContext31 = c43617H9x2.LJIIIIZZ;
                            if (shortVideoContext31 != null) {
                                intent.putExtra("music_start", shortVideoContext31.cameraComponentModel.mMusicStart);
                                ShortVideoContext shortVideoContext32 = c43617H9x2.LJIIIIZZ;
                                if (shortVideoContext32 != null) {
                                    intent.putExtra("extra_music_end", shortVideoContext32.cameraComponentModel.musicEndTime);
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        }
                        intent.putExtra("extra_request_code", 12346);
                        ShortVideoContext shortVideoContext33 = c43617H9x2.LJIIIIZZ;
                        if (shortVideoContext33 != null) {
                            intent.putExtra("enter_method", shortVideoContext33.enterMethod);
                            ShortVideoContext shortVideoContext34 = c43617H9x2.LJIIIIZZ;
                            if (shortVideoContext34 != null) {
                                intent.putExtra("shoot_from", shortVideoContext34.mShootFrom);
                                ShortVideoContext shortVideoContext35 = c43617H9x2.LJIIIIZZ;
                                if (shortVideoContext35 != null) {
                                    String str10 = shortVideoContext35.uploadMethod;
                                    if (str10 == null) {
                                        str10 = "";
                                    }
                                    intent.putExtra("upload_method", str10);
                                    ShortVideoContext shortVideoContext36 = c43617H9x2.LJIIIIZZ;
                                    if (shortVideoContext36 != null) {
                                        List<String> list3 = shortVideoContext36.uploadTabNameList;
                                        if (list3 != null) {
                                            intent.putStringArrayListExtra("upload_tab_name", new ArrayList<>(list3));
                                        }
                                        if (arrayList2 == null) {
                                            arrayList2 = c43617H9x2.LJIIJJI;
                                        }
                                        intent.putParcelableArrayListExtra("extra_image_model_media_list", arrayList2);
                                        ShortVideoContext shortVideoContext37 = c43617H9x2.LJIIIIZZ;
                                        if (shortVideoContext37 != null) {
                                            String str11 = shortVideoContext37.albumPreviewNextMethod;
                                            if (str11 == null) {
                                                str11 = "";
                                            }
                                            intent.putExtra("upload_next_method", str11);
                                            ShortVideoContext shortVideoContext38 = c43617H9x2.LJIIIIZZ;
                                            if (shortVideoContext38 != null) {
                                                V16.LJJJLL(intent, shortVideoContext38);
                                                ShortVideoContext shortVideoContext39 = c43617H9x2.LJIIIIZZ;
                                                if (shortVideoContext39 != null) {
                                                    DefaultPostContentModel defaultPostContentModel = shortVideoContext39.creativeModel.initialModel.defaultPostContentModel;
                                                    if (defaultPostContentModel != null) {
                                                        int LIZ4 = C00F.LIZ(31744, 50, "photo_mode_title_max_length", true);
                                                        if (defaultPostContentModel.defaultTitle.length() > LIZ4) {
                                                            StringBuilder LIZ5 = X1D.LIZ();
                                                            String substring = defaultPostContentModel.defaultTitle.substring(0, LIZ4 - 3);
                                                            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                                            LIZ5.append(substring);
                                                            LIZ5.append("...");
                                                            str4 = X1D.LIZIZ(LIZ5);
                                                        } else {
                                                            str4 = defaultPostContentModel.defaultTitle;
                                                        }
                                                        intent.putExtra("photo_mode_heading", str4);
                                                        intent.putExtra("video_title", defaultPostContentModel.defaultDescription);
                                                    }
                                                    ShortVideoContext shortVideoContext40 = c43617H9x2.LJIIIIZZ;
                                                    if (shortVideoContext40 != null) {
                                                        if (shortVideoContext40.LJJI() && C78685UuP.LJJJZ(str6)) {
                                                            intent.putExtra("id", str6);
                                                            intent.putExtra("extra_request_code", 10087);
                                                            ShortVideoContext shortVideoContext41 = c43617H9x2.LJIIIIZZ;
                                                            if (shortVideoContext41 != null) {
                                                                MusicObject musicObject = shortVideoContext41.creativeModel.musicBuzModel.music;
                                                                if (musicObject != null && (l = Long.valueOf(musicObject.id).toString()) != null) {
                                                                    str7 = l;
                                                                }
                                                                intent.putExtra("music_id", str7);
                                                            } else {
                                                                o.LJIJI("shortVideoContext");
                                                                throw null;
                                                            }
                                                        }
                                                        if (c43617H9x2.LIZLLL(mvCreateVideoData2.srcSelectMediaList.size())) {
                                                            C163786bm.LIZ(c43617H9x2.LIZ, intent);
                                                        } else {
                                                            C42662Gok.LJFF(c43617H9x2.LIZ, C16880lQ.LLJJIJI(intent));
                                                        }
                                                    } else {
                                                        o.LJIJI("shortVideoContext");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("shortVideoContext");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("shortVideoContext");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("shortVideoContext");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        } else {
                            o.LJIJI("shortVideoContext");
                            throw null;
                        }
                    } else {
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            } else {
                o.LJIJI("shortVideoContext");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S1300000_7(GLA gla, String str, AObjectS136S0100000_7 aObjectS136S0100000_7, AObjectS30S0000000_7 aObjectS30S0000000_7, int i) {
        super(1);
        this.$t = i;
        this.l1 = gla;
        this.s0 = str;
        this.l2 = aObjectS136S0100000_7;
        this.l3 = aObjectS30S0000000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS30S1300000_7(C43617H9x c43617H9x, C43617H9x c43617H9x2, MvCreateVideoData mvCreateVideoData, OSZ<Integer, Integer> osz, String str) {
        super(1);
        this.$t = str;
        this.l1 = c43617H9x;
        this.l2 = c43617H9x2;
        this.l3 = mvCreateVideoData;
        this.s0 = osz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS30S1300000_7(MediaModel mediaModel, MediaModel mediaModel2, C45500HtQ c45500HtQ, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l1 = mediaModel;
        this.l2 = mediaModel2;
        this.s0 = c45500HtQ;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS30S1300000_7(MediaModel mediaModel, MediaModel mediaModel2, C45501HtR c45501HtR, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l1 = mediaModel;
        this.l2 = mediaModel2;
        this.s0 = c45501HtR;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S1300000_7(MusicShootAssem musicShootAssem, String str, MusicModel musicModel, UrlModel urlModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = musicShootAssem;
        this.s0 = str;
        this.l2 = musicModel;
        this.l3 = urlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S1300000_7(BaseShortVideoContext baseShortVideoContext, CommonSettingItemStatus commonSettingItemStatus, String str, HashMap hashMap, int i) {
        super(1);
        this.$t = i;
        this.l1 = commonSettingItemStatus;
        this.s0 = str;
        this.l2 = hashMap;
        this.l3 = baseShortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS30S1300000_7(String[] strArr, String[] strArr2, ActivityC45651qj activityC45651qj, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l1 = strArr;
        this.l2 = strArr2;
        this.s0 = activityC45651qj;
        this.l3 = str;
    }
}
