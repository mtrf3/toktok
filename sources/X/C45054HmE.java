package X;

import Y.AObjectS86S0100000_7;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HmE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45054HmE extends AbstractC48231ut<InterfaceC44717Hgn, C85865Xmv, C85871Xn1, C85864Xmu> implements InterfaceC44717Hgn {
    public static final C45083Hmh LLJJJJJIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJJJLIIL;
    public final C82622Wbi LJLL;
    public final WMH LJLLI;
    public final C29901Fi<C76800UCe> LJLLILLLL;
    public final C29901Fi<C76800UCe> LJLLJ;
    public boolean LJLLL;
    public final C45078Hmc LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public C63D LLFFF;
    public InterfaceC139655dx LLFII;
    public C44716Hgm LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public CreativeLoadingDialog LLIIIILZ;
    public AutoCutProgressConfig.AutoCutStepProgressConfig LLIIIJ;
    public AutoCutProgressConfig.AutoCutStepProgressConfig LLIIIL;
    public AutoCutProgressConfig.AutoCutStepProgressConfig LLIIIZ;
    public final C5H3 LLIIJI;
    public C44716Hgm LLIIJLIL;
    public float LLIIL;
    public float LLIILII;
    public String LLIILZL;
    public List<AutoCutMediaModel> LLIIZ;
    public List<AutoCutMediaModel> LLIL;
    public final java.util.Map<OSZ<Integer, C63A>, C44716Hgm> LLILII;
    public final java.util.Map<OSZ<Integer, C63A>, List<AutoCutTitle>> LLILIL;
    public final C5H3 LLILL;
    public final C5H3 LLILLIZIL;
    public final C5H3 LLILLJJLI;
    public final C5H3 LLILLL;
    public final C5H3 LLILZ;
    public final InterfaceC65784Pro<C85871Xn1> LLILZIL;
    public final InterfaceC65784Pro<C85864Xmu> LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C45057HmH LLJJIJIL;
    public List<AutoCutThemeData> LLJJJ;
    public boolean LLJJJIL;
    public final java.util.Map<OSZ<Integer, C63A>, Boolean> LLJJJJ;

    public final void LLIIZ() {
        this.LLIILZL = null;
        this.LLIIJLIL = null;
        this.LLIIL = 0.0f;
        this.LLIILII = 0.0f;
    }

    public final void LLILL() {
        int i;
        C63A c63a;
        int i2;
        String str;
        String str2;
        C63A c63a2;
        String str3;
        LLZLLIL(false);
        u(this, -1, false, 2, null);
        C44716Hgm c44716Hgm = this.LLFZ;
        if (c44716Hgm != null) {
            i = c44716Hgm.LIZIZ;
            c63a = c44716Hgm.LIZ;
            i2 = c44716Hgm.LIZJ;
            str = c44716Hgm.LJIIIZ;
            str2 = c44716Hgm.LJIIJJI;
        } else {
            i = -1;
            c63a = null;
            i2 = -1;
            str = null;
            str2 = null;
        }
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(this.LLJJJ);
        if (autoCutThemeData != null) {
            c63a2 = autoCutThemeData.LIZ();
        } else {
            c63a2 = null;
        }
        if (c63a2 == C63A.SOUND_SYNC) {
            if (LLJLIL().mIsFromDraft) {
                AnonymousClass636.LJIJJLI(LLJLIL().creativeModel.autoCutModel, i, c63a, i2, str, str2);
                LLJLIL().creativeModel.autoCutModel.curRecommendTitleList = this.LLILIL.get(new OSZ(Integer.valueOf(i), c63a));
                C44716Hgm c44716Hgm2 = this.LLILII.get(new OSZ(Integer.valueOf(i), c63a));
                if (c44716Hgm2 != null) {
                    oN(c44716Hgm2);
                } else {
                    LLJJIII().TP();
                }
            } else {
                LLJJIII().Su0();
                AnonymousClass636.LJIJJLI(LLJLIL().creativeModel.autoCutModel, -1, null, -1, null, null);
                LLJLIL().creativeModel.autoCutModel.curRecommendTitleList = null;
            }
        } else {
            AnonymousClass636.LJIJJLI(LLJLIL().creativeModel.autoCutModel, i, c63a, i2, str, str2);
            LLJLIL().creativeModel.autoCutModel.curRecommendTitleList = this.LLILIL.get(new OSZ(Integer.valueOf(i), c63a));
            C44716Hgm c44716Hgm3 = this.LLILII.get(new OSZ(Integer.valueOf(i), c63a));
            if (c44716Hgm3 != null) {
                oN(c44716Hgm3);
            } else {
                LLJJIII().TP();
            }
        }
        LLLLLLIL(true);
        String str4 = LLJLIL().mShootWay;
        String creationId = LLJLIL().getCreationId();
        int i3 = LLJLIL().mOrigin;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", str4);
        if (i3 == 0) {
            str3 = "upload";
        } else {
            str3 = "shoot";
        }
        c145995oB.LJI("content_source", str3);
        c145995oB.LJI("creation_id", creationId);
        FMX.LJIIL("click_autocut_none_button", c145995oB.LIZ);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        this.LLIFFJFJJ = false;
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLLI);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener(LLJLLIL());
        }
        LJJZZI(new AqS173S0100000_7(this, 97));
        InterfaceC142545ic Ll0 = Ll0();
        int LLJI = LLJI();
        int LLLFZ = LLLFZ();
        int LLJZIJLIL = LLJZIJLIL();
        int LLLFFI = LLLFFI();
        AnonymousClass668.LIZIZ().LIZ();
        Ll0.oF(C140345f4.LIZ(LLJI, LLLFZ, LLJZIJLIL, LLLFFI));
        C45057HmH c45057HmH = this.LLJJIJIL;
        if (c45057HmH != null) {
            c45057HmH.cancel();
        }
        if (!LLJLIL().isCurrentAutoCutMode() && C45087Hml.LJIILJJIL()) {
            C124144u2.LIZ.getClass();
            C124144u2.LIZIZ = false;
            C36942Eeg.LIZ();
        }
    }

    static {
        TBT tbt = new TBT(C45054HmE.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC74236TBo[]{tbt, new TBT(C45054HmE.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new TBT(C45054HmE.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0), new TBT(C45054HmE.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new TBT(C45054HmE.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0), new TBT(C45054HmE.class, "editAutoCutSoundSyncApi", "getEditAutoCutSoundSyncApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutSoundSyncApi;", 0), new TBT(C45054HmE.class, "editCutToolbarApi", "getEditCutToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(C45054HmE.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new TBT(C45054HmE.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0)};
        LLJJJJJIL = new C45083Hmh();
    }

    private final InterfaceC142515iZ LLJJ() {
        return (InterfaceC142515iZ) this.LLFF.LIZ(this, LLJJJJLIIL[8]);
    }

    private final InterfaceC137035Zj LLJJIII() {
        return (InterfaceC137035Zj) this.LJZ.LIZ(this, LLJJJJLIIL[2]);
    }

    private final InterfaceC145455nJ LLJJIJI() {
        return (InterfaceC145455nJ) this.LJZL.LIZ(this, LLJJJJLIIL[4]);
    }

    private final InterfaceC153275zv LLJJIJIL() {
        return (InterfaceC153275zv) this.LLD.LIZ(this, LLJJJJLIIL[6]);
    }

    private final InterfaceC145485nM LLJJJIL() {
        return (InterfaceC145485nM) this.LLIIII.getValue();
    }

    private final C5HC LLJLLIL() {
        return (C5HC) this.LLII.getValue();
    }

    private final String LLLI() {
        return (String) this.LLILZ.getValue();
    }

    private final C45091Hmp LLLIIIL() {
        return (C45091Hmp) this.LLIIJI.getValue();
    }

    @Override // X.InterfaceC44717Hgn
    public void Do() {
        this.LJLLILLLL.LJII(C76800UCe.LIZ);
    }

    public final int LLFFF() {
        return (int) C45087Hml.LIZIZ(new C45091Hmp(0.0f, this.LLIILII, this.LLIIL), LLLIIIL());
    }

    public final void LLILZIL() {
        CreativeLoadingDialog creativeLoadingDialog = this.LLIIIILZ;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
    }

    public final int LLJI() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    public final InterfaceC45081Hmf LLJJI() {
        return (InterfaceC45081Hmf) this.LL.LIZ(this, LLJJJJLIIL[5]);
    }

    public final C5XM LLJJL() {
        return (C5XM) this.LLF.LIZ(this, LLJJJJLIIL[7]);
    }

    public final VideoPublishEditModel LLJLIL() {
        return (VideoPublishEditModel) this.LJLLLLLL.LIZ(this, LLJJJJLIIL[0]);
    }

    public final int LLJZIJLIL() {
        return ((Number) this.LLILLIZIL.getValue()).intValue();
    }

    public final int LLLFFI() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    public final int LLLFZ() {
        return ((Number) this.LLILL.getValue()).intValue();
    }

    public final void LLLLLJIL() {
        C45049Hm9.LJIIIIZZ(C45049Hm9.LIZLLL(this.LLIZLLLIL), "source_switch", null, this.LLJIJIL, LLJLIL().mShootWay, 0, LLJLIL().getCreationId(), true);
    }

    public final void LLLLLJLJLL() {
        C63A c63a;
        long LIZLLL = C45049Hm9.LIZLLL(this.LLIZ);
        String str = this.LLJIJIL;
        String str2 = LLJLIL().creativeModel.autoCutModel.taskId;
        List<AutoCutMediaModel> list = this.LLIL;
        String str3 = LLJLIL().mShootWay;
        String creationId = LLJLIL().getCreationId();
        AutoCutModel autoCutModel = LLJLIL().creativeModel.autoCutModel;
        C44716Hgm c44716Hgm = this.LLIIJLIL;
        Integer num = null;
        if (c44716Hgm != null) {
            c63a = c44716Hgm.LIZ;
            num = Integer.valueOf(c44716Hgm.LIZIZ);
        } else {
            c63a = null;
        }
        String LJIL = C45087Hml.LJIL(autoCutModel, c63a, num);
        String str4 = this.LLJILJIL;
        int i = this.LLJILLL;
        String str5 = this.LLJJ;
        boolean z = false;
        if (str5 != null) {
            if (str5.length() > 0) {
                z = true;
            }
        } else {
            z = false;
        }
        C45049Hm9.LJIIZILJ("source_switch", true, 0, Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), null, LIZLLL, str, str2, list, "video_edit_page", str3, creationId, LJIL, str4, i, z, this.LLJILJILJ);
    }

    public final void LLLZZ() {
        boolean z;
        String str;
        int i;
        C63A c63a;
        int i2;
        String str2;
        String str3;
        AutoCutModel autoCutModel = LLJLIL().creativeModel.autoCutModel;
        if (AnonymousClass636.LJJ(autoCutModel.curSource) == C63A.SOUND_SYNC) {
            z = true;
        } else {
            z = false;
        }
        AutoCutThemeData LIZJ = C45063HmN.LIZJ(this.LLJJJ, autoCutModel.curIndexFromSource, AnonymousClass636.LJJ(autoCutModel.curSource));
        if (LIZJ != null) {
            str = LIZJ.musicId;
        } else {
            str = null;
        }
        C44716Hgm c44716Hgm = this.LLFZ;
        if (c44716Hgm != null) {
            i = c44716Hgm.LIZIZ;
            c63a = c44716Hgm.LIZ;
            i2 = c44716Hgm.LIZJ;
            str2 = c44716Hgm.LJIIIZ;
            str3 = c44716Hgm.LJIIJJI;
        } else {
            i = -1;
            c63a = null;
            i2 = -1;
            str2 = null;
            str3 = null;
        }
        AnonymousClass636.LJIJJLI(LLJLIL().creativeModel.autoCutModel, i, c63a, i2, str2, str3);
        LLJLIL().creativeModel.autoCutModel.curRecommendTitleList = this.LLILIL.get(new OSZ(Integer.valueOf(i), c63a));
        C45049Hm9.LJJI(this.LLIL, LLJLIL().mShootWay, LLJLIL().getCreationId(), C45087Hml.LJIIIZ(i, c63a, autoCutModel), String.valueOf(C45063HmN.LIZIZ(this.LLJJJ, i, c63a)), "cancel", z, C45087Hml.LJIL(autoCutModel, null, null), LLJLIL().mOrigin, str, i2, autoCutModel.clickFrom, str2, autoCutModel.taskId, this.LLILIL.get(new OSZ(Integer.valueOf(i), c63a)), autoCutModel, str3);
        LLLZLZ();
        hide();
    }

    public final void LLZ() {
        String str;
        String LJIIIZ;
        String LJIL;
        String str2;
        C63A c63a;
        C63A c63a2;
        float f;
        boolean z;
        AudioRecorderParam audioRecorderParam;
        AutoCutModel autoCutModel = LLJLIL().creativeModel.autoCutModel;
        if (this.LLI) {
            autoCutModel.clickFrom = null;
        }
        I6G i6g = (I6G) ((C1EP) this.LJLL.LJ(C1EP.class, null)).sO(I6G.class);
        C63A LJJ = AnonymousClass636.LJJ(autoCutModel.curSource);
        C63A c63a3 = C63A.SOUND_SYNC;
        if (LJJ == c63a3) {
            LLJLIL().editMusicSyncMode = true;
            if (i6g != null) {
                i6g.aA(true);
            }
        } else {
            LLJLIL().editMusicSyncMode = false;
            if (i6g != null) {
                i6g.aA(false);
            }
        }
        AutoCutThemeData LIZJ = C45063HmN.LIZJ(this.LLJJJ, autoCutModel.curIndexFromSource, AnonymousClass636.LJJ(autoCutModel.curSource));
        if (LIZJ != null) {
            str = LIZJ.musicId;
        } else {
            str = null;
        }
        int i = autoCutModel.curTemplateType;
        List<AutoCutMediaModel> list = this.LLIL;
        String str3 = LLJLIL().mShootWay;
        String creationId = LLJLIL().getCreationId();
        boolean z2 = this.LLI;
        String str4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (z2) {
            LJIIIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            LJIIIZ = C45087Hml.LJIIIZ(autoCutModel.curIndexFromSource, AnonymousClass636.LJJ(autoCutModel.curSource), autoCutModel);
        }
        if (!this.LLI) {
            str4 = String.valueOf(C45063HmN.LIZIZ(this.LLJJJ, autoCutModel.curIndexFromSource, AnonymousClass636.LJJ(autoCutModel.curSource)));
        }
        boolean z3 = LLJLIL().editMusicSyncMode;
        if (this.LLI) {
            LJIL = "other";
        } else {
            LJIL = C45087Hml.LJIL(autoCutModel, null, null);
        }
        C45049Hm9.LJJI(list, str3, creationId, LJIIIZ, str4, "save", z3, LJIL, LLJLIL().mOrigin, str, i, autoCutModel.clickFrom, autoCutModel.curTemplateId, LLJLIL().creativeModel.autoCutModel.taskId, this.LLILIL.get(new OSZ(Integer.valueOf(autoCutModel.curIndexFromSource), AnonymousClass636.LJJ(autoCutModel.curSource))), autoCutModel, autoCutModel.curTemplateGroupId);
        EnumC43998HOo enumC43998HOo = EnumC43998HOo.CUT_SAME;
        if (i == enumC43998HOo.getValue() && MusicBeanUtilKt.extractAVMusic(LLJLIL().creativeModel.musicBuzModel) != null) {
            clearMusic();
        }
        LLIILZL();
        VideoPublishEditModel LLJLIL = LLJLIL();
        C5MG WS = Ll0().WS();
        if (WS != null) {
            str2 = ((C133765Mu) WS.LJJ()).LLJJL();
        } else {
            str2 = null;
        }
        LLJLIL.nleData = str2;
        LLJLIL().creativeModel.autoCutAnchorModel.nleData = LLJLIL().nleData;
        hide();
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(this.LLJJJ);
        if (autoCutThemeData != null) {
            c63a = autoCutThemeData.LIZ();
        } else {
            c63a = null;
        }
        if (c63a != c63a3 && C45087Hml.LJIIL(autoCutModel, this.LLJJJ) == -1) {
            InterfaceC153275zv LLJJIJIL = LLJJIJIL();
            if (LLJJIJIL != null) {
                LLJJIJIL.b2(15, true);
            }
            C5XM LLJJL = LLJJL();
            if (LLJJL != null) {
                LLJJL.RU(true);
                return;
            }
            return;
        }
        AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) ORZ.LJLLLL(this.LLJJJ);
        if (autoCutThemeData2 != null) {
            c63a2 = autoCutThemeData2.LIZ();
        } else {
            c63a2 = null;
        }
        if (c63a2 == c63a3 && C45087Hml.LJIIL(autoCutModel, this.LLJJJ) == -1) {
            this.LJLLILLLL.LJII(C76800UCe.LIZ);
            C5XM LLJJL2 = LLJJL();
            if (LLJJL2 != null) {
                LLJJL2.RU(true);
            }
            InterfaceC153275zv LLJJIJIL2 = LLJJIJIL();
            if (LLJJIJIL2 != null) {
                LLJJIJIL2.refresh();
            }
            InterfaceC153275zv LLJJIJIL3 = LLJJIJIL();
            if (LLJJIJIL3 != null) {
                LLJJIJIL3.b2(15, true);
                return;
            }
            return;
        }
        boolean LJLL = C44384HbQ.LJLL(LLJLIL());
        AudioRecorderParam audioRecorderParam2 = LLJLIL().veAudioRecorderParam;
        if (audioRecorderParam2 != null) {
            audioRecorderParam2.setNeedOriginalSound(LJLL);
        }
        VideoPublishEditModel LLJLIL2 = LLJLIL();
        if (LJLL) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        LLJLIL2.voiceVolume = f;
        if (HRX.LIZLLL() && (audioRecorderParam = LLJLIL().veAudioRecorderParam) != null) {
            audioRecorderParam.setHasOriginalSound(true);
        }
        InterfaceC153275zv LLJJIJIL4 = LLJJIJIL();
        if (LLJJIJIL4 != null) {
            LLJJIJIL4.b2(15, false);
            LLJJIJIL4.b2(19, false);
            if (i != enumC43998HOo.getValue()) {
                z = true;
            } else {
                z = false;
            }
            LLJJIJIL4.Jf(20, z);
            if (!HRX.LIZLLL() || i == enumC43998HOo.getValue()) {
                LLJJIJIL4.fg0(11, false);
                if (H7R.LJJLIIIIJ(LLJLIL())) {
                    LLJJIJIL4.b2(11, false);
                }
            }
        }
        this.LJLLILLLL.LJII(C76800UCe.LIZ);
        InterfaceC145405nE interfaceC145405nE = (InterfaceC145405nE) this.LJLL.LJIIIIZZ(null, InterfaceC145405nE.class);
        if (interfaceC145405nE != null) {
            interfaceC145405nE.Hn0();
        }
        InterfaceC145455nJ interfaceC145455nJ = (InterfaceC145455nJ) this.LJLL.LJIIIIZZ(null, InterfaceC145455nJ.class);
        if (interfaceC145455nJ != null) {
            interfaceC145455nJ.zd();
        }
        C5XM LLJJL3 = LLJJL();
        if (LLJJL3 != null) {
            LLJJL3.I90();
        }
        InterfaceC145485nM LLJJJIL = LLJJJIL();
        if (LLJJJIL != null) {
            LLJJJIL.LJJLIIIJ((int) C45087Hml.LJIIJJI(Ll0()));
        }
        InterfaceC145485nM LLJJJIL2 = LLJJJIL();
        if (LLJJJIL2 != null) {
            LLJJJIL2.bg0();
        }
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLZ.LIZ(this, LLJJJJLIIL[1]);
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJZI.LIZ(this, LLJJJJLIIL[3]);
    }

    @Override // X.InterfaceC44717Hgn
    public void rp() {
        this.LJLLJ.LJII(C76800UCe.LIZ);
    }

    private final void LLIILZL() {
        LLJJIII().P60(false);
    }

    private final void LLLJIL() {
        LLJJIII().Qq();
        Ll0().wf0().observe(this, new AObjectS86S0100000_7(this, 44));
        if (C42000Ge4.LJIILIIL(LLJLIL())) {
            LLJJ().mu().LIZIZ(this, new AObjectS86S0100000_7(this, 45));
        } else {
            LLJJ().PI().LIZIZ(this, new AObjectS86S0100000_7(this, 46));
        }
    }

    private final void LLLZLZ() {
        LLJJIII().Pq(false);
    }

    private final void Nj() {
        LLJJIII().Nj();
    }

    private final void Q70() {
        LLJJIII().Q70();
    }

    public final void LLIFFJFJJ() {
        boolean z;
        int i;
        int i2;
        AutoCutModel autoCutModel = LLJLIL().creativeModel.autoCutModel;
        C44716Hgm c44716Hgm = this.LLFZ;
        if (c44716Hgm != null && autoCutModel.curIndexFromSource == c44716Hgm.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        C63A c63a = null;
        if (z) {
            C63A LJJ = AnonymousClass636.LJJ(autoCutModel.curSource);
            C44716Hgm c44716Hgm2 = this.LLFZ;
            if (c44716Hgm2 != null) {
                c63a = c44716Hgm2.LIZ;
            }
            if (LJJ == c63a && !this.LLI) {
                LLLZZ();
                return;
            }
        }
        C44716Hgm c44716Hgm3 = this.LLFZ;
        if (c44716Hgm3 != null) {
            i = c44716Hgm3.LIZIZ;
            if (i >= 0 && c44716Hgm3 != null && c44716Hgm3.LIZ != null) {
                i2 = R.string.e25;
                C26227ARb LIZ = C3AW.LIZ(getActivity());
                LIZ.LJ(R.string.e28);
                LIZ.LIZ(i2);
                UC0.LIZJ(LIZ, new AqS95S0101000_7(this, i, 1));
                LIZ.LJI().LIZLLL();
            }
        } else {
            i = -1;
        }
        i2 = R.string.e2a;
        C26227ARb LIZ2 = C3AW.LIZ(getActivity());
        LIZ2.LJ(R.string.e28);
        LIZ2.LIZ(i2);
        UC0.LIZJ(LIZ2, new AqS95S0101000_7(this, i, 1));
        LIZ2.LJI().LIZLLL();
    }

    public final void LLIIIL() {
        Y50 y50;
        if (C133625Mg.LIZ() && (y50 = (Y50) this.LJLL.LJIIIIZZ(null, Y50.class)) != null) {
            y50.LIZ();
        }
    }

    public final void LLLLZLLIL() {
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        if (LLJLIL().isCurrentAutoCutMode() && !LLJLIL().mIsFromDraft) {
            ArrayList arrayList = new ArrayList();
            InfoStickerModel infoStickerModel = LLJLIL().infoStickerModel;
            if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
                Iterator<StickerItemModel> it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), it.next().extra, TextStickerData.class);
                        if (textStickerData != null) {
                            arrayList.add(textStickerData);
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            }
            InfoStickerModel infoStickerModel2 = LLJLIL().infoStickerModel;
            if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null) {
                list.clear();
            }
            Integer valueOf = Integer.valueOf(LLJLIL().creativeModel.autoCutModel.curIndexFromSource);
            C63A LJJ = AnonymousClass636.LJJ(LLJLIL().creativeModel.autoCutModel.curSource);
            if (LJJ == null) {
                LJJ = C63A.AUTO_CUT;
            }
            OSZ osz = new OSZ(valueOf, LJJ);
            if (!arrayList.isEmpty()) {
                C5V8.LIZIZ(ORZ.LLJI(arrayList), getActivity(), this.LJLL, osz, this.LLILIL, LLJLIL());
                LLJLIL().creativeModel.autoCutModel.curRecommendTitleList = this.LLILIL.get(osz);
            }
        }
    }

    public final void clearMusic() {
        I9T.LJI(null, false, LLJLIL().creativeModel.musicBuzModel);
        InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) this.LJLL.LJIIIIZZ(null, InterfaceC145495nN.class);
        if (interfaceC145495nN != null) {
            interfaceC145495nN.clearMusic();
        }
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        List<AutoCutMediaModel> LJFF;
        InterfaceC44718Hgo interfaceC44718Hgo;
        super.onCreate();
        if (C44701HgX.LJIIL(LLJLIL()) && !C44701HgX.LJIIJJI(LLJLIL().creativeModel) && (LJFF = C44701HgX.LJFF(getActivity(), LLJLIL(), this.LJLL, true)) != null && (!((ArrayList) LJFF).isEmpty()) && (interfaceC44718Hgo = (InterfaceC44718Hgo) this.LJLL.LJIIIIZZ(null, InterfaceC44718Hgo.class)) != null) {
            int LJIJJ = C45087Hml.LJIJJ();
            CreativeInfo creativeInfo = LLJLIL().creativeInfo;
            boolean LIZ = CommerceMediaServiceImpl.LIZJ().LIZ();
            AutoCutThemeData LJII = AnonymousClass636.LJII(LLJLIL().creativeModel.autoCutModel);
            o.LJIIIIZZ(creativeInfo, "creativeInfo");
            interfaceC44718Hgo.Zl(LJFF, LJII, LJIJJ, LIZ, creativeInfo, new AqS189S0100000_7(this, 14));
        }
        LLLJIL();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C5WP c5wp = (C5WP) C45161Hnx.LIZ.getValue();
        ((LinkedHashMap) c5wp.LIZ).clear();
        ((LinkedHashMap) c5wp.LIZIZ).clear();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        this.LLIFFJFJJ = true;
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLLI);
        if (LIZIZ != null) {
            LIZIZ.registerActivityOnKeyDownListener(LLJLLIL());
        }
        LLZZJLIL(C44701HgX.LIZJ(LLJLIL()));
        LJJZZI(C45068HmS.LJLIL);
        LJJZZI(new AqS173S0100000_7(this, 93));
        InterfaceC142545ic Ll0 = Ll0();
        int LLJI = LLJI();
        int LLLFZ = LLLFZ();
        int LLJZIJLIL = LLJZIJLIL();
        int LLLFFI = LLLFFI();
        AnonymousClass668.LIZIZ().LIZ();
        C140335f3 LIZIZ2 = C140345f4.LIZIZ(LLJI, LLLFZ, LLJZIJLIL, LLLFFI, false, false, 960);
        LIZIZ2.LJI = Boolean.TRUE;
        Ll0.oF(LIZIZ2);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C85871Xn1> LJJLIIIJJI() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C85864Xmu> LJJLIIIJJIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC44717Hgn
    public boolean Qx() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC44717Hgn
    public /* bridge */ /* synthetic */ LiveEvent Ts() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC44717Hgn
    public boolean jW() {
        return this.LLIFFJFJJ;
    }

    @Override // X.InterfaceC44717Hgn
    public List<AutoCutMediaModel> qf0() {
        return this.LLIIZ;
    }

    @Override // X.InterfaceC44717Hgn
    public /* bridge */ /* synthetic */ LiveEvent tb() {
        return this.LJLLILLLL;
    }

    private final void LLLLLZIL(List<AutoCutThemeData> list) {
        C45057HmH c45057HmH;
        C45062HmM c45062HmM;
        String str;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((AutoCutThemeData) ListProtector.get(list, i)).LIZ() != null && ((AutoCutThemeData) ListProtector.get(list, i)).LIZ() != C63A.SOUND_SYNC) {
                OSZ osz = new OSZ(Integer.valueOf(((AutoCutThemeData) ListProtector.get(list, i)).indexFromSource), ((AutoCutThemeData) ListProtector.get(list, i)).LIZ());
                int intValue = ((Number) osz.getFirst()).intValue();
                Object second = osz.getSecond();
                if (second != null && (c45057HmH = this.LLJJIJIL) != null && (c45062HmM = c45057HmH.LIZJ) != null) {
                    OSZ osz2 = new OSZ(Integer.valueOf(intValue), second);
                    if (c45062HmM.LIZIZ.get(osz2) != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("preload: task already exist. task theme=");
                        LIZ.append(osz2);
                        X1D.LIZIZ(LIZ);
                    } else {
                        AutoCutThemeData LIZJ = C45063HmN.LIZJ(c45062HmM.LIZ.creativeModel.autoCutModel.templateList, ((Number) osz2.getFirst()).intValue(), (C63A) osz2.getSecond());
                        if (LIZJ != null && (str = LIZJ.coverUrl) != null) {
                            new C45082Hmg(str);
                            if (str.length() != 0) {
                                if (C78764Uvg.LJIIL(UriProtector.parse(str))) {
                                    C1JX.LJIIIIZZ("execute: already downloaded. url=", str);
                                } else {
                                    W5O LIZIZ = W5O.LIZIZ(str);
                                    o.LJIIIIZZ(LIZIZ, "fromUri(url)");
                                    W8E.LJII().LJI().LJIIL(LIZIZ, null);
                                    C1JX.LJIIIIZZ("execute: url=", str);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void LLLLZLL(int i) {
        OSZ LIZ = C45063HmN.LIZ(i, this.LLJJJ);
        int intValue = ((Number) LIZ.getFirst()).intValue();
        C63A c63a = (C63A) LIZ.getSecond();
        if (c63a == null) {
            return;
        }
        int LJIIL = C45087Hml.LJIIL(LLJLIL().creativeModel.autoCutModel, this.LLJJJ);
        n(i, false);
        e(new AqS107S0101000_7(this, LJIIL, 0));
        LLLZLL(intValue, c63a);
    }

    private final void LLZLLIL(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 4));
    }

    private final void LLZZJLIL(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 5));
    }

    private final void c(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 7));
    }

    private final void e(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C42279GiZ c42279GiZ = C42279GiZ.LIZ;
        ActivityC45651qj activity = getActivity();
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(true);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
        String LLLI = LLLI();
        if (LLLI == null) {
            LLLI = "";
        }
        creativeLoadingDialogBuilder.loadingMessage(LLLI);
        creativeLoadingDialogBuilder.clickCancelListener(new AqS173S0100000_7(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 94));
        CreativeLoadingDialog createLoadingDialog = c42279GiZ.createLoadingDialog(activity, 1101, creativeLoadingDialogBuilder);
        this.LLIIIILZ = createLoadingDialog;
        createLoadingDialog.show();
    }

    private final boolean m(NLEModel nLEModel) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null || (nLEEditor = LJJI.LJIIJ) == null) {
            return false;
        }
        nLEEditor.LJII(nLEModel);
        return nLEEditor.LIZIZ();
    }

    private final void v(List<AutoCutThemeData> list) {
        LJJZZI(new AqS173S0100000_7(list, (List<AutoCutThemeData>) 96));
    }

    @Override // X.InterfaceC44717Hgn
    public void Ed0(C44716Hgm autoCutData) {
        boolean z;
        o.LJIIIZ(autoCutData, "autoCutData");
        if (autoCutData.LIZJ != EnumC43998HOo.CUT_SAME.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!autoCutData.LIZIZ(z, true)) {
            return;
        }
        C44716Hgm c44716Hgm = this.LLILII.get(new OSZ(Integer.valueOf(autoCutData.LIZIZ), autoCutData.LIZ));
        if (c44716Hgm == null) {
            this.LLILII.put(new OSZ<>(Integer.valueOf(autoCutData.LIZIZ), autoCutData.LIZ), autoCutData);
            return;
        }
        c44716Hgm.LJ = autoCutData.LJ;
        c44716Hgm.LJFF = autoCutData.LJFF;
        c44716Hgm.LJII = autoCutData.LJII;
        c44716Hgm.LJIIJ = autoCutData.LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLF(com.bytedance.ies.nle.editor_jni.NLEModel r7) {
        /*
            r6 = this;
            java.lang.String r5 = "Canvas_Width"
            X.5ic r0 = r6.Ll0()
            X.5MG r0 = r0.WS()
            r2 = 1
            if (r0 == 0) goto L44
            X.5zY r3 = r0.LJJ()
            r0 = r3
            X.5Mu r0 = (X.C133765Mu) r0
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = r0.LJFF()
            java.lang.String r0 = r2.getExtra(r5)     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L23
            int r4 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L23
            goto L24
        L23:
            r4 = 0
        L24:
            float r1 = r2.getCanvasRatio()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L73
            r1 = 0
        L2e:
            boolean r0 = X.C45087Hml.LJIILJJIL()
            if (r0 == 0) goto L55
            X.5Mu r3 = (X.C133765Mu) r3
            r3.LJIILIIL(r7)
            if (r4 <= 0) goto L45
            if (r1 <= 0) goto L45
            r3.LJIIJJI(r4, r1)
        L40:
            boolean r2 = r3.LJIIL(r7)
        L44:
            return r2
        L45:
            int r0 = X.C5O6.LJFF
            if (r0 <= 0) goto L40
            int r0 = X.C5O6.LJ
            if (r0 <= 0) goto L40
            int r1 = X.C5O6.LJ
            int r0 = X.C5O6.LJFF
            r3.LJIIJJI(r1, r0)
            goto L40
        L55:
            X.5Mu r3 = (X.C133765Mu) r3
            boolean r2 = r3.LJIIL(r7)
            if (r4 <= 0) goto L63
            if (r1 <= 0) goto L63
            r3.LLJIJIL(r4, r1)
            goto L44
        L63:
            int r0 = X.C5O6.LJFF
            if (r0 <= 0) goto L44
            int r0 = X.C5O6.LJ
            if (r0 <= 0) goto L44
            int r1 = X.C5O6.LJ
            int r0 = X.C5O6.LJFF
            r3.LLJIJIL(r1, r0)
            goto L44
        L73:
            java.lang.String r0 = r2.getExtra(r5)     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L7e
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L7e
            goto L7f
        L7e:
            r0 = 0
        L7f:
            float r1 = (float) r0
            float r0 = r2.getCanvasRatio()
            float r1 = r1 / r0
            int r1 = (int) r1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45054HmE.LLF(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    public final void LLLLLL(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent onCancelSelect: lastIndex = ");
        LIZ.append(i);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        String str = this.LLIILZL;
        if (str != null) {
            C45087Hml.LIZLLL(str);
        }
        LLIIZ();
        u(this, i, false, 2, null);
        LLILZIL();
    }

    public final void LLLLLLIL(boolean z) {
        C5MM LIZJ;
        c(!z);
        MutableLiveData<C5MM> DM = Ll0().DM();
        if (z) {
            LIZJ = C5MM.LIZ();
        } else {
            LIZJ = C5MM.LIZJ();
        }
        DM.setValue(LIZJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        r8 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r24.LLJJJ, r25)).templateGroupId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        r1 = r24.LLIL;
        r1 = LLJLIL().mShootWay;
        r18 = LLJLIL().getCreationId();
        r17 = X.C45087Hml.LJIIIZ(r12, r3, LLJLIL().creativeModel.autoCutModel);
        r9 = r25 + 1;
        r7 = X.C45087Hml.LJIL(LLJLIL().creativeModel.autoCutModel, r3, java.lang.Integer.valueOf(r12));
        r11 = LLJLIL().mOrigin;
        r6 = LLJLIL().creativeModel.autoCutModel.clickFrom;
        r5 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r24.LLJJJ, r25)).musicId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d5, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
    
        r10 = r1.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        r4 = r1.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e1, code lost:
    
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        r1 = LLJLIL().creativeModel.autoCutModel.taskId;
        r1 = r24.LLILIL.get(new X.OSZ(java.lang.Integer.valueOf(r12), r3));
        kotlin.jvm.internal.o.LJIIIZ(r7, "reuseMusicType");
        r3 = X.C45049Hm9.LJ(r1);
        r14 = ((java.lang.Number) r3.getFirst()).intValue();
        r13 = ((java.lang.Number) r3.getSecond()).intValue();
        r12 = ((java.lang.Number) r3.getThird()).intValue();
        r3 = new X.C145995oB();
        r3.LJI("enter_from", "video_edit_page");
        r3.LJI("shoot_way", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0148, code lost:
    
        if (r11 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014a, code lost:
    
        r11 = "upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014c, code lost:
    
        r3.LJI("content_source", r11);
        r3.LJI("creation_id", r18);
        r3.LIZ(r14, "content_cnt");
        r3.LJI("content_form", X.C45049Hm9.LIZJ(r1));
        r3.LJI("autocut_style_name", r17);
        r3.LIZ(r9, "style_order");
        r3.LJI("reuse_music_type", r7);
        r3.LJI("music_id", r5);
        r3.LIZ(r13, "pic_cnt");
        r3.LIZ(r12, "video_cnt");
        r3.LJI("autocut_click_from", r6);
        r3.LIZ(r10, "autocut_template_type");
        r3.LJI("autocut_template_id", r4);
        r3.LJI("autocut_template_group_id", r8);
        r3.LJI("task_id", r1);
        r15 = null;
        X.C77117UOj.LJII(r3, r1, null);
        X.FMX.LJIIL("select_autocut_style", r3.LIZ);
        X.C45161Hnx.LIZIZ(new X.C45051HmB(LLJLIL().mShootWay, LLJLIL().getCreationId()));
        r1 = r24.LLIILZL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01c6, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01c8, code lost:
    
        X.C45087Hml.LIZLLL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01cb, code lost:
    
        LLIIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ce, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01d0, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d2, code lost:
    
        oN(r1);
        r7 = Ll0();
        r8 = LLJI();
        r9 = LLLFZ();
        r10 = LLJZIJLIL();
        r11 = LLLFFI();
        X.AnonymousClass668.LIZIZ().LIZ();
        r5 = X.C140345f4.LIZIZ(r8, r9, r10, r11, false, false, 960);
        r5.LJFF = 0;
        r5.LJI = java.lang.Boolean.TRUE;
        r7.oF(r5);
        u(r24, r25, false, 2, null);
        LLLLLLIL(true);
        r6 = X.C45049Hm9.LIZLLL(r24.LLJI);
        r8 = r24.LLIL;
        r9 = LLJLIL().mShootWay;
        r10 = LLJLIL().getCreationId();
        r12 = r1.LIZJ;
        r13 = r1.LJIIIZ;
        r14 = r1.LJIIJJI;
        r1 = r1.LJIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0237, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0239, code lost:
    
        r15 = java.lang.Integer.valueOf(r1.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0241, code lost:
    
        X.C45049Hm9.LJIJJLI(true, 0, null, r6, r8, r9, r10, true, r12, r13, r14, r15, 6);
        X.C45087Hml.LJJJ(LLJLIL().creativeModel.autoCutModel, r1.LJII);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0256, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0285, code lost:
    
        LLLLZLL(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0257, code lost:
    
        r11 = "shoot";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        r4 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r24.LLJJJ, r25)).templateId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x025b, code lost:
    
        r10 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r24.LLJJJ, r25)).templateType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0281, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLL(int r25) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45054HmE.LLZLL(int):void");
    }

    public final void LLZZLLIL(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 6));
    }

    public final void g(int i) {
        CreativeLoadingDialog creativeLoadingDialog = this.LLIIIILZ;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.updateProgress(i);
        }
    }

    @Override // X.InterfaceC44717Hgn
    public boolean oN(C44716Hgm autoCutData) {
        o.LJIIIZ(autoCutData, "autoCutData");
        NLEModel nLEModel = autoCutData.LJII;
        if (nLEModel == null || nLEModel.getMainTrack() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditAutoCutComponent checkAutoCutNLE: templateId=");
            LIZ.append(autoCutData.LJIIIZ);
            LIZ.append(", templateType=");
            LIZ.append(autoCutData.LIZJ);
            LIZ.append(", source=");
            LIZ.append(autoCutData.LIZ);
            LIZ.append(", indexFromSource=");
            LIZ.append(autoCutData.LIZIZ);
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        }
        NLEModel nLEModel2 = autoCutData.LJII;
        if (nLEModel2 != null && C45087Hml.LJIILJJIL()) {
            System.currentTimeMillis();
            C124144u2.LIZIZ(nLEModel2);
        }
        C34K c34k = new C34K();
        c34k.element = true;
        C6QQ.LIZ(new AqS96S0300000_7(autoCutData, this, c34k, 3));
        return c34k.element;
    }

    public final void w(int i) {
        int i2;
        String str;
        String str2;
        String str3;
        List LJIJ = C45087Hml.LJIJ(LLJLIL().creativeModel.autoCutModel);
        if (i >= 0 && i < LJIJ.size()) {
            AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ListProtector.get(C45087Hml.LJIJ(LLJLIL().creativeModel.autoCutModel), i);
            Integer valueOf = Integer.valueOf(autoCutThemeData.indexFromSource);
            C63A LIZ = autoCutThemeData.LIZ();
            if (LIZ == null) {
                LIZ = C63A.AUTO_CUT;
            }
            OSZ<Integer, C63A> osz = new OSZ<>(valueOf, LIZ);
            if (autoCutThemeData.LIZ() == null) {
                return;
            }
            Boolean bool = this.LLJJJJ.get(osz);
            Boolean bool2 = Boolean.TRUE;
            if (!o.LJ(bool, bool2)) {
                this.LLJJJJ.put(osz, bool2);
                List<AutoCutMediaModel> list = this.LLIL;
                String str4 = LLJLIL().mShootWay;
                String creationId = LLJLIL().getCreationId();
                int i3 = LLJLIL().mOrigin;
                String str5 = autoCutThemeData.musicId;
                String str6 = LLJLIL().creativeModel.autoCutModel.clickFrom;
                String styleOrder = String.valueOf(i + 1);
                C44716Hgm c44716Hgm = this.LLILII.get(osz);
                if (c44716Hgm != null) {
                    i2 = c44716Hgm.LIZJ;
                } else {
                    i2 = autoCutThemeData.templateType;
                }
                C44716Hgm c44716Hgm2 = this.LLILII.get(osz);
                if (c44716Hgm2 == null || (str = c44716Hgm2.LJIIIZ) == null) {
                    str = autoCutThemeData.templateId;
                }
                String str7 = LLJLIL().creativeModel.autoCutModel.taskId;
                List<AutoCutTitle> list2 = this.LLILIL.get(osz);
                C44716Hgm c44716Hgm3 = this.LLILII.get(osz);
                if (c44716Hgm3 == null || (str2 = c44716Hgm3.LJIIJJI) == null) {
                    str2 = autoCutThemeData.templateGroupId;
                }
                o.LJIIIZ(styleOrder, "styleOrder");
                OSJ LJ = C45049Hm9.LJ(list);
                ((Number) LJ.getFirst()).intValue();
                int intValue = ((Number) LJ.getSecond()).intValue();
                int intValue2 = ((Number) LJ.getThird()).intValue();
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "video_edit_page");
                c145995oB.LJI("shoot_way", str4);
                if (i3 == 0) {
                    str3 = "upload";
                } else {
                    str3 = "shoot";
                }
                c145995oB.LJI("content_source", str3);
                c145995oB.LJI("creation_id", creationId);
                c145995oB.LJI("style_order", styleOrder);
                c145995oB.LJI("music_id", str5);
                c145995oB.LIZ(intValue, "pic_cnt");
                c145995oB.LIZ(intValue2, "video_cnt");
                c145995oB.LJI("autocut_click_from", str6);
                c145995oB.LIZ(i2, "autocut_template_type");
                c145995oB.LJI("autocut_template_id", str);
                c145995oB.LJI("autocut_template_group_id", str2);
                c145995oB.LJI("task_id", str7);
                C77117UOj.LJII(c145995oB, list2, null);
                FMX.LJIIL("show_autocut_template", c145995oB.LIZ);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45054HmE(C82622Wbi diContainer, WMH parentScene) {
        super(parentScene);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLL = diContainer;
        this.LJLLI = parentScene;
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = new C29901Fi<>();
        this.LJLLLL = new C45078Hmc();
        this.LJLLLLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLZ = UCI.LJI(diContainer, InterfaceC142545ic.class, null);
        this.LJZ = UCI.LJI(diContainer, InterfaceC137035Zj.class, null);
        this.LJZI = UCI.LJI(diContainer, ActivityC45651qj.class, null);
        this.LJZL = UCI.LJII(diContainer, InterfaceC145455nJ.class, null);
        this.LL = UCI.LJII(diContainer, InterfaceC45081Hmf.class, null);
        this.LLD = UCI.LJII(diContainer, InterfaceC153275zv.class, null);
        this.LLF = UCI.LJII(diContainer, C5XM.class, null);
        this.LLFF = UCI.LJI(diContainer, InterfaceC142515iZ.class, null);
        this.LLII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 190));
        this.LLIIII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 148));
        if (e1.LIZ(31744, "autocut_progress_setting_config", true, false)) {
            AutoCutProgressConfig.AutoCutStepSetting switchProcess = AutoCutProgressConfig.LIZ().getSwitchProcess();
            this.LLIIIJ = switchProcess.getReqMusicListConfig();
            this.LLIIIL = switchProcess.getDownloadConfig();
            this.LLIIIZ = switchProcess.getReqNLEConfig();
        }
        this.LLIIJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 195));
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LLIIZ = c61878OQg;
        this.LLIL = c61878OQg;
        this.LLILII = new LinkedHashMap();
        this.LLILIL = new LinkedHashMap();
        this.LLILL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 193));
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 191));
        this.LLILLJJLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 192));
        this.LLILLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 187));
        this.LLILZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 194));
        this.LLILZIL = C45072HmW.LJLIL;
        this.LLILZLL = new AqS157S0100000_7(this, 186);
        this.LLIZ = -1L;
        this.LLIZLLLIL = -1L;
        this.LLJ = -1L;
        this.LLJI = -1L;
        this.LLJILLL = -1;
        this.LLJJJ = c61878OQg;
        this.LLJJJJ = new LinkedHashMap();
    }

    private final void LLLJL(List<AutoCutThemeData> list, int i) {
        v(ORZ.LLJI(list));
        u(this, i, false, 2, null);
    }

    private final void LLLZLL(int i, C63A c63a) {
        boolean z;
        EnumC45070HmU enumC45070HmU;
        C44716Hgm jH;
        String str;
        AutoCutThemeData LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent requestThemeData: ");
        LIZ.append(i);
        LIZ.append(" - source: ");
        LIZ.append(c63a);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LLJI = System.currentTimeMillis();
        AutoCutThemeData LJIJJLI2 = C45087Hml.LJIJJLI(i, c63a, LLJLIL().creativeModel.autoCutModel);
        if (LJIJJLI2 == null) {
            return;
        }
        int i2 = LJIJJLI2.templateType;
        String str2 = null;
        this.LLIIJLIL = new C44716Hgm(c63a, i, i2, LJIJJLI2.nickName, null, null, 0L, null, LJIJJLI2.templateId, null, null, 7664);
        if (i2 == EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue() || i2 == EnumC43998HOo.ALGORITHM_TEMPLATE.getValue() || i2 == EnumC43998HOo.SOUND_SYNC_TEMPLATE.getValue() || i2 == EnumC43998HOo.AUTOCUT_TEMPLATE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        NLEModel nLEModel = null;
        if (z && ((LJIJJLI = C45087Hml.LJIJJLI(i, c63a, LLJLIL().creativeModel.autoCutModel)) == null || (str2 = LJIJJLI.musicId) == null)) {
            return;
        }
        this.LLJILJIL = LJIJJLI2.templateId;
        this.LLJILJILJ = LJIJJLI2.templateGroupId;
        this.LLJILLL = LJIJJLI2.templateType;
        this.LLJJ = LJIJJLI2.templateData;
        List<AutoCutMediaModel> list = this.LLIL;
        if (list.isEmpty()) {
            return;
        }
        this.LLJIJIL = str2;
        this.LLJJI = this.LLJJI;
        if (z) {
            enumC45070HmU = EnumC45070HmU.TEMPLATE_MUSIC;
        } else {
            enumC45070HmU = EnumC45070HmU.TEMPLATE_CC;
        }
        String str3 = "";
        if (z) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            LLJ(str, i, c63a);
        }
        if (c63a == C63A.SOUND_SYNC) {
            C44716Hgm c44716Hgm = this.LLIIJLIL;
            if (c44716Hgm != null) {
                c44716Hgm.LIZJ = EnumC43998HOo.SOUND_SYNC_TEMPLATE.getValue();
                InterfaceC45081Hmf LLJJI = LLJJI();
                if (LLJJI != null && (jH = LLJJI.jH()) != null) {
                    nLEModel = jH.LJII;
                }
                c44716Hgm.LJII = nLEModel;
            }
        } else {
            String str4 = LLJLIL().creativeModel.autoCutModel.taskId;
            if (str2 == null) {
                str2 = "";
            }
            String str5 = LJIJJLI2.templateId;
            String str6 = LJIJJLI2.templateUrl;
            String str7 = LJIJJLI2.templateData;
            java.util.Set<String> set = LJIJJLI2.preloadUrsSet;
            CreativeInfo creativeInfo = LLJLIL().creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            String str8 = LJIJJLI2.templateGroupId;
            if (str8 != null) {
                str3 = str8;
            }
            LLLZ(str4, str2, str5, i2, str6, str7, enumC45070HmU, list, set, creativeInfo, i, c63a, str3);
        }
        C45057HmH c45057HmH = this.LLJJIJIL;
        if (c45057HmH == null) {
            return;
        }
        c45057HmH.LIZ();
    }

    private final void n(int i, boolean z) {
        boolean z2 = false;
        if (i == -1) {
            LLZLLIL(false);
            z2 = true;
        } else {
            LLZLLIL(true);
        }
        this.LLI = z2;
        LJJZZI(new AqS31S0001000_7(i, 2));
        LLZZLLIL(z);
    }

    public final boolean LLLL(int i, C63A c63a) {
        C44716Hgm c44716Hgm = this.LLIIJLIL;
        if (c44716Hgm != null && i == c44716Hgm.LIZIZ && c63a == c44716Hgm.LIZ) {
            return true;
        }
        return false;
    }

    public final void LLLLZI(int i, int i2) {
        C45057HmH c45057HmH;
        C45058HmI c45058HmI;
        int i3 = i;
        if (i3 > i2) {
            return;
        }
        while (true) {
            OSZ LIZ = C45063HmN.LIZ(i3, this.LLJJJ);
            int intValue = ((Number) LIZ.getFirst()).intValue();
            Object second = LIZ.getSecond();
            if (this.LLILII.get(new OSZ(Integer.valueOf(intValue), second)) == null && second != null && second != C63A.SOUND_SYNC && (c45057HmH = this.LLJJIJIL) != null && (c45058HmI = c45057HmH.LIZIZ) != null) {
                OSZ<Integer, C63A> osz = new OSZ<>(Integer.valueOf(intValue), second);
                C45059HmJ c45059HmJ = c45058HmI.LJ.get(osz);
                if (c45059HmJ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("preload: task already exist. update task theme = ");
                    LIZ2.append(osz);
                    X1D.LIZIZ(LIZ2);
                    c45058HmI.LIZLLL.remove(c45059HmJ);
                    c45058HmI.LIZLLL.addFirst(c45059HmJ);
                } else {
                    AutoCutThemeData LIZJ = C45063HmN.LIZJ(c45058HmI.LIZ.creativeModel.autoCutModel.templateList, osz.getFirst().intValue(), osz.getSecond());
                    if (LIZJ != null) {
                        VideoPublishEditModel videoPublishEditModel = c45058HmI.LIZ;
                        String str = videoPublishEditModel.creativeModel.autoCutModel.taskId;
                        List<AutoCutMediaModel> list = c45058HmI.LIZIZ;
                        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                        C45059HmJ c45059HmJ2 = new C45059HmJ(new C45060HmK(osz, LIZJ, str, list, creativeInfo, c45058HmI.LIZJ, c45058HmI.LIZ.getCreationId(), c45058HmI.LIZ.mShootWay), new AqS154S0200000_7(c45058HmI, (C45058HmI) osz, (OSZ<Integer, ? extends C63A>) 114), new AqS138S0200000_7(c45058HmI, (C45058HmI) osz, (OSZ<Integer, ? extends C63A>) 81));
                        c45058HmI.LJ.put(osz, c45059HmJ2);
                        c45058HmI.LIZLLL.addLast(c45059HmJ2);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("preload: preloadingCount=");
                        LIZ3.append(c45058HmI.LJII);
                        LIZ3.append(". add queue. task theme=");
                        LIZ3.append(osz);
                        X1D.LIZIZ(LIZ3);
                        c45058HmI.LIZJ();
                    }
                }
            }
            if (i3 != i2) {
                i3++;
            } else {
                return;
            }
        }
    }

    public final void LLLLZIL(int i, C63A c63a) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent autocut final success: result: ");
        LIZ.append(this.LLIIJLIL);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C44716Hgm c44716Hgm = this.LLIIJLIL;
        if (c44716Hgm != null) {
            if (c44716Hgm.LIZJ != EnumC43998HOo.CUT_SAME.getValue()) {
                z = true;
            } else {
                z = false;
            }
            if (c44716Hgm.LIZIZ(z, true) && LLLL(i, c63a)) {
                C6QQ.LIZ(new AqS154S0200000_7(this, c44716Hgm, 27));
            }
        }
    }

    private final void LLIZ(long j, Integer num, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C68852n3(num, this, interfaceC88472Yns, j, null), 3);
    }

    private final void LLJ(String str, int i, C63A c63a) {
        long j;
        Integer num;
        StringBuilder LJ = AnonymousClass028.LJ("EditAutoCutComponent start fetchAndDownloadMusic: musicId = ", str, ", indexFromSource = ", i, ", source = ");
        LJ.append(c63a);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LJ));
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LLIIIL;
        if (autoCutStepProgressConfig != null) {
            j = autoCutStepProgressConfig.getUpdateInterval();
        } else {
            j = 20;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LLIIIL;
        MusicBuzModel musicBuzModel = null;
        if (autoCutStepProgressConfig2 != null) {
            num = Integer.valueOf(autoCutStepProgressConfig2.getUpdateCount());
        } else {
            num = null;
        }
        LLIZ(j, num, new AqS173S0100000_7(this, 95));
        this.LLIZLLLIL = System.currentTimeMillis();
        AutoCutThemeData LIZJ = C45063HmN.LIZJ(this.LLJJJ, i, c63a);
        if (LIZJ != null) {
            musicBuzModel = LIZJ.musicBuzModel;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (extractAVMusic != null) {
            LLILZLL(extractAVMusic, i, c63a);
        } else {
            C78934UyQ.LJLIL.getMusicService().requestMusic(str, new C45071HmV(this, i, c63a));
        }
    }

    private final void LLLLJI(int i, String str, int i2) {
        Integer num;
        boolean z;
        C63A c63a;
        java.util.Set<String> set;
        long LIZLLL = C45049Hm9.LIZLLL(this.LLJI);
        List<AutoCutMediaModel> list = this.LLIL;
        String str2 = LLJLIL().mShootWay;
        String creationId = LLJLIL().getCreationId();
        int i3 = this.LLJILLL;
        String str3 = this.LLJILJIL;
        String str4 = this.LLJILJILJ;
        C44716Hgm c44716Hgm = this.LLIIJLIL;
        Integer num2 = null;
        if (c44716Hgm != null && (set = c44716Hgm.LJIIL) != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        C45049Hm9.LJIJJLI(false, i, str, LIZLLL, list, str2, creationId, false, i3, str3, str4, num, 128);
        long LIZLLL2 = C45049Hm9.LIZLLL(this.LLJI);
        List<AutoCutMediaModel> list2 = this.LLIL;
        String str5 = LLJLIL().mShootWay;
        String creationId2 = LLJLIL().getCreationId();
        String str6 = this.LLJILJIL;
        String str7 = this.LLJILJILJ;
        int i4 = this.LLJILLL;
        String str8 = this.LLJIJIL;
        String str9 = this.LLJJ;
        boolean z2 = true;
        if (str9 != null) {
            if (str9.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C45049Hm9.LJIL(false, i, Integer.valueOf(i2), str, LIZLLL2, list2, str5, creationId2, i4, str6, z, str7, str8);
        if (i == SmartMovieErrorCode.COMPRESS_FAILURE.swigValue() || i == SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue() || i == SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue() || i == SmartMovieErrorCode.HANDLE_TEMPLATE_FAILURE.swigValue() || i == SmartMovieErrorCode.INPUT_RESOURCE_EXCEPTION.swigValue()) {
            long LIZLLL3 = C45049Hm9.LIZLLL(this.LLIZ);
            String str10 = this.LLJIJIL;
            String str11 = this.LLJJI;
            List<AutoCutMediaModel> list3 = this.LLIL;
            String str12 = LLJLIL().mShootWay;
            String creationId3 = LLJLIL().getCreationId();
            AutoCutModel autoCutModel = LLJLIL().creativeModel.autoCutModel;
            C44716Hgm c44716Hgm2 = this.LLIIJLIL;
            if (c44716Hgm2 != null) {
                c63a = c44716Hgm2.LIZ;
                num2 = Integer.valueOf(c44716Hgm2.LIZIZ);
            } else {
                c63a = null;
            }
            String LJIL = C45087Hml.LJIL(autoCutModel, c63a, num2);
            String str13 = this.LLJILJIL;
            String str14 = this.LLJILJILJ;
            int i5 = this.LLJILLL;
            String str15 = this.LLJJ;
            if (str15 == null || str15.length() <= 0) {
                z2 = false;
            }
            C45049Hm9.LJIIZILJ("source_switch", false, i, Integer.valueOf(i2), str, LIZLLL3, str10, str11, list3, "video_edit_page", str12, creationId3, LJIL, str13, i5, z2, str14);
            return;
        }
        switch (i) {
            case 1001:
            case 1002:
            case 1003:
                break;
            default:
                if (i != 1007) {
                    return;
                }
                break;
        }
        C45049Hm9.LJIIIIZZ(C45049Hm9.LIZLLL(this.LLIZLLLIL), "source_switch", str, this.LLJIJIL, LLJLIL().mShootWay, i, LLJLIL().getCreationId(), false);
    }

    public final void LJZI(AVMusic aVMusic, String str, long j) {
        C145355n9 LIZ;
        InterfaceC145455nJ LLJJIJI = LLJJIJI();
        if (LLJJIJI != null) {
            LLJJIJI.LJJLIIIJ((int) j);
        }
        aVMusic.setMusicStartFromCut(0);
        InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) this.LJLL.LJIIIIZZ(null, InterfaceC145495nN.class);
        I9T.LJI(aVMusic, false, LLJLIL().creativeModel.musicBuzModel);
        if (C44384HbQ.LJJIFFI()) {
            if (interfaceC145495nN != null) {
                C145505nO.LIZ(interfaceC145495nN, str, aVMusic, true, false, false, false, 0L, j, false, 824);
            }
        } else {
            if (str.length() == 0) {
                LIZ = C145385nC.LIZ(Boolean.TRUE, null, null, null, null, j, 0L, 16);
            } else {
                LIZ = C145385nC.LIZ(Boolean.FALSE, "edit_page_list", aVMusic, str, null, j, 0L, 16);
            }
            if (interfaceC145495nN == null) {
                return;
            }
            interfaceC145495nN.q3(LIZ);
        }
    }

    public final void LLILZLL(AVMusic aVMusic, int i, C63A c63a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent start downloadMusic: musicId = ");
        LIZ.append(aVMusic.getMusicId());
        LIZ.append(", indexFromSource = ");
        LIZ.append(i);
        LIZ.append(", source = ");
        LIZ.append(c63a);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C44716Hgm c44716Hgm = this.LLIIJLIL;
        if (c44716Hgm != null) {
            c44716Hgm.LJ = aVMusic;
        }
        if (this.LJLLI.getSceneContext() == null) {
            return;
        }
        IAnotherMusicService musicService = C78934UyQ.LJLIL.getMusicService();
        Context requireSceneContext = this.LJLLI.requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "parentScene.requireSceneContext()");
        musicService.LJIILL(requireSceneContext, aVMusic, 0, false, new C45056HmG(this, i, c63a));
    }

    public final void LLLILZLLLI(int i, String str, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent handleFailure ");
        LIZ.append(i);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        String str2 = this.LLIILZL;
        if (str2 != null) {
            C45087Hml.LIZLLL(str2);
        }
        LLLLJI(i, str, i2);
        LLIIZ();
        C6QQ.LIZ(new AqS157S0100000_7(this, 189));
    }

    public final void LLLLJ(String str, String str2, int i, String str3) {
        int i2 = this.LLJJIII;
        C45049Hm9.LJIILIIL("source_switch", i2 - this.LLJJIJI, i2, C45049Hm9.LIZLLL(this.LLJ), LLJLIL().mShootWay, LLJLIL().getCreationId(), str, str2, i, str3);
    }

    public static /* synthetic */ void u(C45054HmE c45054HmE, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c45054HmE.n(i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b4, code lost:
    
        if (r28 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b6, code lost:
    
        r1 = r28.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b8, code lost:
    
        if (r1 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c6, code lost:
    
        if (r28 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c8, code lost:
    
        r0 = r28.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ca, code lost:
    
        if (r0 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e6, code lost:
    
        Ed0(new X.C44716Hgm(r5, r17, r4, r7, r1, r10, 0, r0, r3, X.ORZ.LLJI(r9), r2, 4416));
        r3 = new X.C45057HmH(LLJLIL(), r27.LLIL, r27.LLJJIJIIJIL);
        r27.LLJJIJIL = r3;
        r2 = r3.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0318, code lost:
    
        if (r2 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x031a, code lost:
    
        LLLLZI(0, r27.LLJJJ.size() - 1);
        LLLLLZIL(r27.LLJJJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x032d, code lost:
    
        r2.LJIIIIZZ = new kotlin.jvm.internal.AqS189S0100000_7(r27, 13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02cc, code lost:
    
        r0 = Ll0().WS();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d4, code lost:
    
        if (r0 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02d6, code lost:
    
        r8 = r0.LJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02dc, code lost:
    
        if ((r8 instanceof X.C133765Mu) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02de, code lost:
    
        r8 = (X.C133765Mu) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e0, code lost:
    
        if (r8 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e2, code lost:
    
        r0 = r8.LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0337, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0339, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ba, code lost:
    
        r1 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(LLJLIL().creativeModel.musicBuzModel);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ac, code lost:
    
        r10 = LLJLIL().getMMusicPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0256, code lost:
    
        if (r30 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025a, code lost:
    
        if (r31 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0262, code lost:
    
        if (r4 != X.EnumC43998HOo.CUT_SAME.getValue()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0264, code lost:
    
        clearMusic();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x033b, code lost:
    
        LJZI(r30, r31, X.C45087Hml.LJIIJJI(Ll0()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f7, code lost:
    
        r0 = r27.LLFII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f9, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01fb, code lost:
    
        r0 = r0.YU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ff, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0201, code lost:
    
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0209, code lost:
    
        if (r1.hasNext() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020b, code lost:
    
        r9.add(r1.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x021e, code lost:
    
        if (r28 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0231, code lost:
    
        if (r28 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0213, code lost:
    
        r14 = "shoot";
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0217, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00cf, code lost:
    
        r2 = r28.LJIIJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00d1, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r28 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        r2 = r9.curTemplateGroupId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r28 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r7 = r28.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        r1 = r9.curIndexFromSource;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r1 < 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r1 >= r9.templateList.size()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r4 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r4 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9.templateList, r9.curIndexFromSource)).templateType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        if (r7 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        r7 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9.templateList, r9.curIndexFromSource)).nickName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (r3 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (r3.length() != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r2 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r2.length() != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        r2 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9.templateList, r9.curIndexFromSource)).templateGroupId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        r3 = ((com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9.templateList, r9.curIndexFromSource)).templateId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        r0 = r27.LLIL;
        r0 = LLJLIL().mShootWay;
        r13 = LLJLIL().getCreationId();
        r15 = LLJLIL().mOrigin;
        r10 = r9.clickFrom;
        r9 = X.C45049Hm9.LJ(r0);
        r1 = ((java.lang.Number) r9.getFirst()).intValue();
        r12 = ((java.lang.Number) r9.getSecond()).intValue();
        r11 = ((java.lang.Number) r9.getThird()).intValue();
        r9 = new X.C145995oB();
        r9.LJI("enter_from", "video_edit_page");
        r9.LJI("shoot_way", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        if (r15 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
    
        r14 = "upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        r9.LJI("content_source", r14);
        r9.LJI("creation_id", r13);
        r9.LIZ(r1, "content_cnt");
        r9.LJI("content_form", X.C45049Hm9.LIZJ(r0));
        r9.LIZ(r12, "pic_cnt");
        r9.LIZ(r11, "video_cnt");
        r9.LJI("autocut_click_from", r10);
        X.FMX.LJIIL("enter_switch_style_page", r9.LIZ);
        show();
        LLLJL(r27.LLJJJ, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b7, code lost:
    
        if (r28 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c4, code lost:
    
        if (r27.LJLLLL.LIZ.getBoolean("autocut_hint_should_show", true) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c6, code lost:
    
        r27.LJLLLL.LIZ.storeBoolean("autocut_hint_should_show", false);
        X.C78920UyC.LIZLLL(com.zhiliaoapp.musically.R.string.e1o, getActivity(), 1031);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        Nj();
        Q70();
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e9, code lost:
    
        if (X.G3R.LIZ() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01eb, code lost:
    
        if (r28 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ef, code lost:
    
        if (r28.LJII == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r28.LIZ != X.C63A.SOUND_SYNC) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0221, code lost:
    
        r0 = r28.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0223, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0225, code lost:
    
        r0 = X.C5V8.LIZJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0229, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022b, code lost:
    
        r9.addAll(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x022e, code lost:
    
        r28.LJIIJ = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        if (r28.LJII != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x023d, code lost:
    
        if (r28.LJI >= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x023f, code lost:
    
        r28.LJI = X.C45087Hml.LJIIJJI(Ll0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0249, code lost:
    
        oN(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024e, code lost:
    
        if (r28.LJFF == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0252, code lost:
    
        if (r28.LJ != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0267, code lost:
    
        r0 = Ll0().WS();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x026f, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0271, code lost:
    
        ((X.C133765Mu) r0.LJJ()).prepare();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027a, code lost:
    
        Ll0().DM().setValue(X.C5MM.LIZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x028f, code lost:
    
        if (r4 != X.EnumC43998HOo.CUT_SAME.getValue()) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0291, code lost:
    
        r1 = LLJJL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0295, code lost:
    
        if (r1 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0297, code lost:
    
        r1.RU(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x029b, code lost:
    
        r1 = LLJJL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x029f, code lost:
    
        if (r1 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a1, code lost:
    
        r1.vt0(X.WUK.LJIIZILJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a6, code lost:
    
        if (r28 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a8, code lost:
    
        r10 = r28.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02aa, code lost:
    
        if (r10 != null) goto L125;
     */
    @Override // X.InterfaceC44717Hgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q10(X.C44716Hgm r28, X.C44716Hgm r29, com.ss.android.ugc.aweme.shortvideo.AVMusic r30, java.lang.String r31, X.C44704Hga r32) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45054HmE.Q10(X.Hgm, X.Hgm, com.ss.android.ugc.aweme.shortvideo.AVMusic, java.lang.String, X.Hga):void");
    }

    public static /* synthetic */ void LLLJ(C45054HmE c45054HmE, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        c45054HmE.LLLILZLLLI(i, str, i2);
    }

    public static /* synthetic */ void LLLLLIL(C45054HmE c45054HmE, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        c45054HmE.LLLLJI(i, str, i2);
    }

    private final void LLLZ(String str, String str2, String str3, int i, String str4, String str5, EnumC45070HmU enumC45070HmU, List<AutoCutMediaModel> list, java.util.Set<String> set, CreativeInfo creativeInfo, int i2, C63A c63a, String str6) {
        long j;
        Integer num;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("EditAutoCutComponent start requestNLEModel: taskId = ", str, ", musicId = ", str2, ",isFromNLE=");
        LIZLLL.append(this.LLJJIJIIJIL);
        LIZLLL.append("， mediaModelList = ");
        C0EH.LIZLLL(LIZLLL, ORZ.LLD(list, null, null, null, C45069HmT.LJLIL, 31), ", indexFromSource = ", i2, ", source = ");
        LIZLLL.append(c63a);
        LIZLLL.append(", creativeInfo = ");
        LIZLLL.append(creativeInfo);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZLLL));
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LLIIIL;
        if (autoCutStepProgressConfig != null) {
            j = autoCutStepProgressConfig.getUpdateInterval();
        } else {
            j = 20;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LLIIIL;
        if (autoCutStepProgressConfig2 != null) {
            num = Integer.valueOf(autoCutStepProgressConfig2.getUpdateCount());
        } else {
            num = null;
        }
        LLIZ(j, num, new AqS173S0100000_7(this, 98));
        C44716Hgm c44716Hgm = this.LLIIJLIL;
        if (c44716Hgm != null) {
            c44716Hgm.LJIIL = set;
        }
        this.LLIZ = System.currentTimeMillis();
        this.LLIILZL = C45087Hml.LJJIJIIJI(str, str2, str3, str4, str5, enumC45070HmU, list, set, creativeInfo, this.LLJJIJIIJIL, false, i, "source_switch", new C45055HmF(this, i2, c63a, i, str6, enumC45070HmU, str2, str3, C61878OQg.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LLLZIIL(C45054HmE c45054HmE, String str, String str2, String str3, int i, String str4, String str5, EnumC45070HmU enumC45070HmU, List list, java.util.Set set, CreativeInfo creativeInfo, int i2, C63A c63a, String str6, int i3, Object obj) {
        if ((i3 & 256) != 0) {
            set = null;
        }
        c45054HmE.LLLZ(str, str2, str3, i, str4, str5, enumC45070HmU, list, set, creativeInfo, i2, c63a, str6);
    }
}
