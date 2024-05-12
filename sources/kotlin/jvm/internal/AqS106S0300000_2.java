package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C122034qd;
import X.C122334r7;
import X.C122364rA;
import X.C134275Ot;
import X.C140335f3;
import X.C148455s9;
import X.C148605sO;
import X.C1536261e;
import X.C1550566r;
import X.C162466Ze;
import X.C164246cW;
import X.C169236kZ;
import X.C32I;
import X.C34K;
import X.C36396EQe;
import X.C45929I0v;
import X.C51029K0z;
import X.C52G;
import X.C5FC;
import X.C5FN;
import X.C5K1;
import X.C5MG;
import X.C5RT;
import X.C5RV;
import X.C5TK;
import X.C5WD;
import X.C5ZR;
import X.C60903NvH;
import X.C60B;
import X.C63K;
import X.C6F2;
import X.C6F7;
import X.C71897SJp;
import X.C76800UCe;
import X.C78555UsJ;
import X.C79057V0z;
import X.C86793Y4n;
import X.H78;
import X.InterfaceC142545ic;
import X.InterfaceC143655kP;
import X.InterfaceC149485to;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSJ;
import X.OSZ;
import Y.AObjectS26S0301000_2;
import Y.AObjectS41S0101000_2;
import Y.AObserverS66S0200000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS8S0110000_2;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursSuggestTopic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS106S0300000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS106S0300000_2 aqS106S0300000_2, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC65784Pro) aqS106S0300000_2.l0).invoke();
        C60903NvH.LJIIJJI().LJIIJJI().LIZJ((VideoPublishEditModel) aqS106S0300000_2.l1, "continue");
        ((C34K) aqS106S0300000_2.l2).element = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.bg_, new AqS106S0300000_2((InterfaceC65784Pro) aqS106S0300000_2.l0, (InterfaceC65784Pro<C76800UCe>) aqS106S0300000_2.l1, (VideoPublishEditModel) aqS106S0300000_2.l2, (C34K) 0));
        actionGroup.LJIIIIZZ(R.string.bg9, new AqS133S0200000_2((VideoPublishEditModel) aqS106S0300000_2.l1, (C34K) aqS106S0300000_2.l2, 7));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        long j;
        InterfaceC142545ic interfaceC142545ic;
        LiveData<C76800UCe> OU;
        C148455s9 it = (C148455s9) obj;
        o.LJIIIZ(it, "it");
        ((C1536261e) aqS106S0300000_2.l0).setRawIcon(it.LIZLLL);
        ((C1536261e) aqS106S0300000_2.l0).LJ(it.LIZIZ);
        if (it.LIZJ) {
            C148605sO.LIZIZ().storeBoolean("key_show_toast", false);
            C60B c60b = (C60B) aqS106S0300000_2.l1;
            boolean z = it.LIZIZ;
            c60b.getClass();
            ARunnableS8S0110000_2 aRunnableS8S0110000_2 = new ARunnableS8S0110000_2(c60b, z, 5);
            ToolSafeHandler toolSafeHandler = new ToolSafeHandler(((C60B) aqS106S0300000_2.l1).LJIIIIZZ);
            C60B c60b2 = (C60B) aqS106S0300000_2.l1;
            if (C78555UsJ.LJJJ(c60b2.LIZ, c60b2.LIZIZ)) {
                j = 4000;
            } else {
                j = 0;
            }
            toolSafeHandler.removeCallbacksAndMessages(null);
            toolSafeHandler.postDelayed(aRunnableS8S0110000_2, j);
            InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) aqS106S0300000_2.l2;
            if ((interfaceC143655kP instanceof InterfaceC142545ic) && (interfaceC142545ic = (InterfaceC142545ic) interfaceC143655kP) != null && (OU = interfaceC142545ic.OU()) != null) {
                OU.observe(C86793Y4n.LJJIJIIJIL(((C60B) aqS106S0300000_2.l1).LIZJ), new AObserverS66S0200000_2(toolSafeHandler, aRunnableS8S0110000_2, 17));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS106S0300000_2 aqS106S0300000_2, Object it) {
        o.LJIIIZ(it, "it");
        C63K c63k = (C63K) aqS106S0300000_2.l0;
        if (c63k != null) {
            c63k.LJJIII();
        }
        C45929I0v c45929I0v = (C45929I0v) aqS106S0300000_2.l1;
        C63K c63k2 = (C63K) aqS106S0300000_2.l0;
        QaStruct qaStruct = (QaStruct) aqS106S0300000_2.l2;
        c45929I0v.LJJLI();
        EditCommentStickerViewModel editCommentStickerViewModel = c45929I0v.LLJI;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.setState(C1550566r.LJLIL);
            if (c63k2 != null) {
                c63k2.I4(qaStruct);
            }
            c45929I0v.hidePanel();
            return C76800UCe.LIZ;
        }
        o.LJIJI("commentStickerViewModel");
        throw null;
    }

    public static final Object invoke$12(AqS106S0300000_2 aqS106S0300000_2, Object offerPendingAction) {
        o.LJIIIZ(offerPendingAction, "$this$offerPendingAction");
        C6F2 c6f2 = ((C6F7) aqS106S0300000_2.l0).LJLJJI;
        if (c6f2 != null) {
            c6f2.LLJJL((Effect) aqS106S0300000_2.l1, (CustomStickerInfo) aqS106S0300000_2.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        int i;
        Integer type;
        AddYoursStickerModel setState = (AddYoursStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        String charSequence = ((TuxTextView) aqS106S0300000_2.l0).getText().toString();
        String charSequence2 = ((TuxTextView) aqS106S0300000_2.l0).getText().toString();
        AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic = (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) aqS106S0300000_2.l1;
        if (addYoursStickerTopicRepoApi$AddYoursSuggestTopic != null && (type = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getType()) != null) {
            i = type.intValue();
        } else {
            i = 0;
        }
        return AddYoursStickerModel.copy$default(setState, null, null, (Long) aqS106S0300000_2.l2, charSequence2, charSequence, null, false, false, false, null, null, Integer.valueOf(i), 2019, null);
    }

    public static final Object invoke$14(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        String str;
        List<EffectTemplate> effects = (List) obj;
        o.LJIIIZ(effects, "effects");
        H78.LIZIZ("JEFF", "Effects downloaded");
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(effects, 10));
        int i = 16;
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EffectTemplate effectTemplate : effects) {
            linkedHashMap.put(effectTemplate.getEffectId(), effectTemplate);
        }
        List list = (List) aqS106S0300000_2.l0;
        Map map = (Map) aqS106S0300000_2.l2;
        int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ2 >= 16) {
            i = LJJIIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (Object obj2 : list) {
            com.ss.ugc.effectplatform.model.Effect effect = (com.ss.ugc.effectplatform.model.Effect) linkedHashMap.get(map.get(obj2));
            if (effect != null) {
                str = effect.getUnzipPath();
            } else {
                str = null;
            }
            linkedHashMap2.put(obj2, str);
        }
        String json = GsonProtectorUtils.toJson(new Gson(), linkedHashMap2);
        json.toString();
        C5ZR c5zr = ((C36396EQe) aqS106S0300000_2.l1).LJLILLLLZI;
        OSJ<Integer, Long, Long> osj = C36396EQe.LJLJLJ;
        c5zr.LIZ(osj.getFirst().intValue(), osj.getSecond().longValue(), osj.getThird().longValue(), json);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.pql, new AObjectS26S0301000_2((C164246cW) aqS106S0300000_2.l0, 1, (Effect) aqS106S0300000_2.l1, (OSZ) aqS106S0300000_2.l2, 0));
        actionGroup.LJIIIIZZ(R.string.cg_, new AObjectS41S0101000_2(1, (C164246cW) aqS106S0300000_2.l0, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.pql, new AObjectS26S0301000_2((C164246cW) aqS106S0300000_2.l0, 3, (Effect) aqS106S0300000_2.l1, (OSZ) aqS106S0300000_2.l2, 1));
        actionGroup.LJIIIIZZ(R.string.cg_, new AObjectS41S0101000_2(3, (C164246cW) aqS106S0300000_2.l0, 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        String LJJJJ;
        C122034qd editorPro = (C122034qd) obj;
        o.LJIIIZ(editorPro, "editorPro");
        C122334r7 c122334r7 = new C122334r7();
        C5RT c5rt = (C5RT) aqS106S0300000_2.l1;
        c122334r7.LIZIZ = c5rt.LIZJ;
        c122334r7.LIZJ = c5rt.LIZLLL;
        c122334r7.LIZLLL = c5rt.LJIIJJI;
        c122334r7.LJ = c5rt.LJIIZILJ;
        c122334r7.LJFF = c5rt.LJIIL;
        c122334r7.LJI = c5rt.LJIILIIL;
        c122334r7.LJII = c5rt.LJIILJJIL;
        c122334r7.LJIIIIZZ = c5rt.LJIIIIZZ;
        c122334r7.LJIIIZ = 3;
        c122334r7.LJIIJ = c5rt.LJIILLIIL;
        NLEModel LJ = editorPro.LJIIJ.LJ();
        o.LJIIIIZZ(LJ, "editorPro.editor.model");
        c122334r7.LJIIJJI = C122364rA.LIZ(LJ) + 1;
        if (((C5MG) aqS106S0300000_2.l0).LIZ.LJFF) {
            LJJJJ = editorPro.LIZLLL().LJJIJIIJI(c122334r7);
        } else {
            LJJJJ = editorPro.LIZLLL().LJJJJ(c122334r7);
        }
        ((C5RT) aqS106S0300000_2.l1).LIZIZ = new String[]{LJJJJ};
        ((EffectPointModel) aqS106S0300000_2.l2).setUuid(LJJJJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C169236kZ) aqS106S0300000_2.l0).LLFFF().xa();
            InterfaceC143655kP editPreviewApi = ((C169236kZ) aqS106S0300000_2.l0).LLILL();
            C140335f3 previewScaleOp = (C140335f3) aqS106S0300000_2.l1;
            o.LJIIIZ(editPreviewApi, "editPreviewApi");
            o.LJIIIZ(previewScaleOp, "previewScaleOp");
            editPreviewApi.oF(previewScaleOp);
            ((C169236kZ) aqS106S0300000_2.l0).mh0();
        } else {
            InterfaceC143655kP editPreviewApi2 = ((C169236kZ) aqS106S0300000_2.l0).LLILL();
            C140335f3 previewScaleOp2 = (C140335f3) aqS106S0300000_2.l2;
            o.LJIIIZ(editPreviewApi2, "editPreviewApi");
            o.LJIIIZ(previewScaleOp2, "previewScaleOp");
            editPreviewApi2.oF(previewScaleOp2);
            editPreviewApi2.U2(true, false, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        float f;
        AudioRecorderParam it = (AudioRecorderParam) obj;
        o.LJIIIZ(it, "it");
        ((C71897SJp) aqS106S0300000_2.l0).setChecked(it.getNeedOriginalSound());
        ((C71897SJp) aqS106S0300000_2.l0).setEnabled(!it.getMuteByAudioCopyright());
        TuxTextView tuxTextView = (TuxTextView) aqS106S0300000_2.l1;
        if (!it.getMuteByAudioCopyright()) {
            f = 1.0f;
        } else {
            f = 0.66f;
        }
        tuxTextView.setAlpha(f);
        C5TK c5tk = (C5TK) aqS106S0300000_2.l2;
        C5FN c5fn = c5tk.LJLJL;
        if (c5fn != null) {
            c5fn.post(new ARunnableS21S0200000_2(it, c5tk, 13));
            return C76800UCe.LIZ;
        }
        o.LJIJI("audioRecordWaveGroup");
        throw null;
    }

    public static final Object invoke$5(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        C122034qd it = (C122034qd) obj;
        o.LJIIIZ(it, "it");
        C5MG WS = ((C134275Ot) aqS106S0300000_2.l0).LIZ.WS();
        if (WS != null) {
            WS.LJIILJJIL((C5RV) aqS106S0300000_2.l1, (C5RV) aqS106S0300000_2.l2, it.LIZLLL());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        H78.LJI("JDW: AUTO MUSIC: musicActivityDetected end setter");
        if (booleanValue) {
            C162466Ze c162466Ze = (C162466Ze) aqS106S0300000_2.l0;
            AVMusic it = (AVMusic) aqS106S0300000_2.l1;
            o.LJIIIIZZ(it, "it");
            InterfaceC149485to interfaceC149485to = (InterfaceC149485to) aqS106S0300000_2.l2;
            c162466Ze.getClass();
            interfaceC149485to.LIZ(it);
            AqS56S1100000_2 aqS56S1100000_2 = c162466Ze.LIZLLL;
            if (aqS56S1100000_2 != null) {
                aqS56S1100000_2.invoke(it);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS106S0300000_2 aqS106S0300000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.chp, new AqS106S0300000_2((EditorProScene) aqS106S0300000_2.l0, (C52G) aqS106S0300000_2.l1, (InlineCaptionFragment) aqS106S0300000_2.l2, 8));
        actionGroup.LJIIIIZZ(R.string.chm, new AqS168S0100000_2((EditorProScene) aqS106S0300000_2.l0, 333));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS106S0300000_2 aqS106S0300000_2, Object it) {
        o.LJIIIZ(it, "it");
        NLETrack LIZLLL = C5FC.LIZLLL(C79057V0z.LJJI(((EditorProScene) aqS106S0300000_2.l0).getEditorContext()));
        if (LIZLLL != null) {
            LIZLLL.LJ();
        }
        C79057V0z.LJIIL(((EditorProScene) aqS106S0300000_2.l0).getEditorContext());
        C5K1 c5k1 = ((EditorProScene) aqS106S0300000_2.l0).inlineCaptionCaches;
        if (c5k1 != null) {
            ((HashMap) c5k1.LIZ).clear();
        }
        ((EditorProScene) aqS106S0300000_2.l0).inCaptionEditing = true;
        ((C52G) aqS106S0300000_2.l1).LJ((InlineCaptionFragment) aqS106S0300000_2.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS106S0300000_2 aqS106S0300000_2, Object it) {
        o.LJIIIZ(it, "it");
        ((StickerItemModel) aqS106S0300000_2.l0).extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), (TextStickerData) aqS106S0300000_2.l1);
        C5WD c5wd = (C5WD) aqS106S0300000_2.l2;
        int i = c5wd.LJLJL - 1;
        c5wd.LJLJL = i;
        if (i == 0) {
            c5wd.LJJLIIJ().j70(new AqS168S0100000_2((C5WD) aqS106S0300000_2.l2, 355));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C5MG c5mg, C5RT c5rt, EffectPointModel effectPointModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c5mg;
        this.l1 = c5rt;
        this.l2 = effectPointModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C134275Ot c134275Ot, C5RV c5rv, C5RV c5rv2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c134275Ot;
        this.l1 = c5rv;
        this.l2 = c5rv2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C1536261e c1536261e, InterfaceC143655kP interfaceC143655kP, C60B c60b, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1536261e;
        this.l1 = c60b;
        this.l2 = interfaceC143655kP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C6F7 c6f7, Effect effect, CustomStickerInfo customStickerInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c6f7;
        this.l1 = effect;
        this.l2 = customStickerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C162466Ze c162466Ze, AVMusic aVMusic, InterfaceC149485to interfaceC149485to, int i) {
        super(1);
        this.$t = i;
        this.l0 = c162466Ze;
        this.l1 = aVMusic;
        this.l2 = interfaceC149485to;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C164246cW c164246cW, Effect effect, OSZ osz, int i) {
        super(1);
        this.$t = i;
        this.l0 = c164246cW;
        this.l1 = effect;
        this.l2 = osz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C169236kZ c169236kZ, C140335f3 c140335f3, C140335f3 c140335f32, int i) {
        super(1);
        this.$t = i;
        this.l0 = c169236kZ;
        this.l1 = c140335f3;
        this.l2 = c140335f32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS106S0300000_2(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, VideoPublishEditModel videoPublishEditModel, C34K c34k) {
        super(1);
        this.$t = c34k;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C71897SJp c71897SJp, TuxTextView tuxTextView, C5TK c5tk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c71897SJp;
        this.l1 = tuxTextView;
        this.l2 = c5tk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(TuxTextView tuxTextView, AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = addYoursStickerTopicRepoApi$AddYoursSuggestTopic;
        this.l2 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(StickerItemModel stickerItemModel, TextStickerData textStickerData, C5WD c5wd, int i) {
        super(1);
        this.$t = i;
        this.l0 = stickerItemModel;
        this.l1 = textStickerData;
        this.l2 = c5wd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(EditorProScene editorProScene, C52G c52g, InlineCaptionFragment inlineCaptionFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = editorProScene;
        this.l1 = c52g;
        this.l2 = inlineCaptionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS106S0300000_2(List list, List<String> list2, C36396EQe c36396EQe, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c36396EQe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0300000_2(C63K c63k, ARI ari, C45929I0v c45929I0v, QaStruct qaStruct, int i) {
        super(1);
        this.$t = i;
        this.l0 = c63k;
        this.l1 = c45929I0v;
        this.l2 = qaStruct;
    }
}
