package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138655cL {
    public final InterfaceC139045cy LIZ;
    public final Activity LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC143655kP LIZLLL;
    public final InterfaceC138185ba LJ;
    public final InterfaceC139535dl LJFF;
    public final InterfaceC138705cQ LJI;
    public final InterfaceC138265bi LJII;
    public final InterfaceC65784Pro<C139315dP> LJIIIIZZ;
    public ProgressDialogC43239Gy3 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    public final ShortVideoCommonParams LIZJ() {
        return (ShortVideoCommonParams) this.LJIIJJI.getValue();
    }

    public final void LJIIJJI() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        if (!C84763XOl.LJIIJJI) {
            InterfaceC153045zY value = this.LIZLLL.Kh().getValue();
            if (value != null) {
                value.LLJILJIL(true);
            }
            InterfaceC153045zY value2 = this.LIZLLL.Kh().getValue();
            if (value2 != null) {
                value2.play();
            }
        }
    }

    public static boolean LIZIZ(TextStickerModel textStickerModel) {
        TTSModel ttsModel;
        String str;
        String str2;
        TTSModel ttsModel2 = textStickerModel.getTtsModel();
        if (ttsModel2 == null) {
            return false;
        }
        int i = ttsModel2.audioTrackIndex;
        TTSModel ttsModel3 = textStickerModel.getTtsModel();
        if (ttsModel3 == null || !ttsModel3.hasReadTextAudio || (ttsModel = textStickerModel.getTtsModel()) == null || (str = ttsModel.audioText) == null || !C78685UuP.LJJJZ(str)) {
            return false;
        }
        TTSModel ttsModel4 = textStickerModel.getTtsModel();
        String str3 = null;
        if (ttsModel4 != null) {
            str2 = ttsModel4.audioText;
        } else {
            str2 = null;
        }
        if (o.LJ(str2, textStickerModel.getTextStr())) {
            return false;
        }
        if (i < 0) {
            TTSModel ttsModel5 = textStickerModel.getTtsModel();
            if (ttsModel5 != null) {
                str3 = ttsModel5.nleUuid;
            }
            if (!C78685UuP.LJJJZ(str3)) {
                return false;
            }
        }
        return true;
    }

    public static String LIZLLL(TextStickerModel textStickerModel) {
        o.LJIIIZ(textStickerModel, "<this>");
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
            return "auto";
        }
        return "user_click";
    }

    public static boolean LJ(TextStickerModel model) {
        String str;
        TTSModel ttsModel;
        TTSVoiceModel tTSVoiceModel;
        o.LJIIIZ(model, "model");
        if (LIZIZ(model)) {
            return true;
        }
        TTSModel ttsModel2 = model.getTtsModel();
        if (ttsModel2 != null && (tTSVoiceModel = ttsModel2.ttsVoiceModel) != null) {
            str = tTSVoiceModel.getEffectId();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str) && (ttsModel = model.getTtsModel()) != null && !ttsModel.autoAddTtsFlag) {
            return true;
        }
        return false;
    }

    public static void LJI(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1111, ggo, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final String LIZ(TextStickerData textStickerData) {
        String audioTrackFilePath;
        InterfaceC153045zY value = this.LIZLLL.Kh().getValue();
        String str = "";
        if (value == null || (audioTrackFilePath = textStickerData.getAudioTrackFilePath()) == null || audioTrackFilePath.length() == 0) {
            return "";
        }
        C122034qd LJJI = C17N.LJJI(value);
        if (LJJI != null) {
            InterfaceC123794tT LJFF = LJJI.LJFF();
            if (C78685UuP.LJJJZ(textStickerData.getNleUuid()) && LJFF.get(textStickerData.getNleUuid()) != null) {
                return textStickerData.getNleUuid();
            }
            C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
            c122004qa.LIZ = audioTrackFilePath;
            c122004qa.LIZJ = 0L;
            c122004qa.LIZLLL = textStickerData.getAudioTrackDuration();
            c122004qa.LJ = textStickerData.getStartTime();
            c122004qa.LJFF = -2L;
            c122004qa.LJI = 1.0f;
            LJFF.LJJ(c122004qa, true);
            String str2 = c122004qa.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            textStickerData.setNleUuid(str);
            textStickerData.setHasReadTextAudio(true);
            return textStickerData.getNleUuid();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJII(boolean z) {
        InterfaceC139535dl interfaceC139535dl;
        List<StickerModel> sk0;
        TextStickerModel textStickerModel;
        TTSModel ttsModel;
        int i;
        InterfaceC153045zY value = this.LIZLLL.Kh().getValue();
        if (value != null && (interfaceC139535dl = this.LJFF) != null && (sk0 = interfaceC139535dl.sk0(EnumC157656Gr.TEXT)) != null) {
            for (StickerModel stickerModel : sk0) {
                if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && (ttsModel = textStickerModel.getTtsModel()) != null && (i = ttsModel.audioTrackIndex) != -1) {
                    if (z) {
                        value.LLILZIL(0.0f, i);
                    } else {
                        value.LLILZIL(1.0f, i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(TextStickerModel textStickerModel) {
        if (!C167496hl.LIZIZ(textStickerModel.getTextStr())) {
            C24540xm.LIZ(R.string.e49, this.LIZIZ, 1018);
            return;
        }
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        C138735cT.LIZJ(LIZJ(), "auto", "text_edit_panel", LIZLLL(textStickerModel), null, 16);
        this.LJIILJJIL = true;
        InterfaceC138705cQ interfaceC138705cQ = this.LJI;
        if (interfaceC138705cQ != null) {
            long j = 0;
            C138695cP.LIZ(interfaceC138705cQ, textStickerModel.getTextStr(), SpeakerCenter.LIZLLL(), new SpeakerCenter.KevaSpeakerBean(SpeakerCenter.LJ(), str, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, false, j, j, 510, objArr == true ? 1 : 0), C137045Zk.LIZIZ(textStickerModel));
        }
    }

    public final void LJIIJ(TextStickerModel model) {
        String str;
        String str2;
        TTSModel ttsModel;
        String str3;
        o.LJIIIZ(model, "model");
        if (this.LJIILIIL) {
            return;
        }
        if (!LIZIZ(model) && (ttsModel = model.getTtsModel()) != null && ttsModel.ttsVoiceModel != null) {
            InterfaceC153045zY value = this.LIZLLL.Kh().getValue();
            if (value != null) {
                TTSModel ttsModel2 = model.getTtsModel();
                if (ttsModel2 != null) {
                    ttsModel2.hasReadTextAudio = false;
                }
                TTSModel ttsModel3 = model.getTtsModel();
                if (ttsModel3 != null) {
                    ttsModel3.autoAddTtsFlag = true;
                }
                TTSModel ttsModel4 = model.getTtsModel();
                if (ttsModel4 != null) {
                    ttsModel4.audioText = null;
                }
                TTSModel ttsModel5 = model.getTtsModel();
                if (ttsModel5 != null) {
                    ttsModel5.nleUuid = "";
                }
                TTSModel ttsModel6 = model.getTtsModel();
                if (ttsModel6 != null) {
                    ttsModel6.audioTrackIndex = -1;
                }
                TTSModel ttsModel7 = model.getTtsModel();
                if (ttsModel7 != null) {
                    ttsModel7.audioTrackFilePath = null;
                }
                if (AnonymousClass699.LIZIZ().LIZIZ.LJLJI && model.getTextStr().length() > 0) {
                    LJIIL(model);
                    TTSModel ttsModel8 = model.getTtsModel();
                    if (ttsModel8 != null && ttsModel8.ttsVoiceModel != null) {
                        str3 = "auto";
                    } else {
                        str3 = "user_click";
                    }
                    C138735cT.LIZJ(LIZJ(), null, "bubble", str3, null, 18);
                }
                value.LLJJJIL((int) (model.getBaseStickerModel().getStartTime() * 1000), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                value.play();
            }
            LJIILJJIL(model);
            return;
        }
        InterfaceC153045zY value2 = this.LIZLLL.Kh().getValue();
        if (value2 != null) {
            TTSModel ttsModel9 = model.getTtsModel();
            if (ttsModel9 != null && (str = ttsModel9.nleUuid) != null && C78685UuP.LJJJZ(str)) {
                C122034qd LJJI = C17N.LJJI(value2);
                if (LJJI != null) {
                    InterfaceC123794tT LJFF = LJJI.LJFF();
                    C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                    TTSModel ttsModel10 = model.getTtsModel();
                    if (ttsModel10 != null) {
                        str2 = ttsModel10.nleUuid;
                    } else {
                        str2 = null;
                    }
                    c122004qa.LIZIZ = str2;
                    LJFF.LJFF(c122004qa);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            TTSModel ttsModel11 = model.getTtsModel();
            if (ttsModel11 != null) {
                ttsModel11.hasReadTextAudio = false;
            }
            TTSModel ttsModel12 = model.getTtsModel();
            if (ttsModel12 != null) {
                ttsModel12.audioText = null;
            }
            TTSModel ttsModel13 = model.getTtsModel();
            if (ttsModel13 != null) {
                ttsModel13.nleUuid = "";
            }
            TTSModel ttsModel14 = model.getTtsModel();
            if (ttsModel14 != null) {
                ttsModel14.audioTrackIndex = -1;
            }
            TTSModel ttsModel15 = model.getTtsModel();
            if (ttsModel15 != null) {
                ttsModel15.audioTrackFilePath = null;
            }
            if (AnonymousClass699.LIZIZ().LIZIZ.LJLJI) {
                if (!ujb.o.LJJJJJL(model.getTextStr())) {
                    LJIIL(model);
                }
            } else if (model.getTextStr().length() > 0) {
                C139355dT c139355dT = new C139355dT();
                if (c139355dT.LIZ.getInt("read_text_change_toast", 0) < 3) {
                    TMB tmb = C82890Wg2.LJFF;
                    Activity activity = this.LIZIZ;
                    tmb.getClass();
                    TMB.LIZJ(R.string.e4_, 0, activity).LIZ();
                    C19N.LIZJ(c139355dT.LIZ, "read_text_change_toast", 0, 1, "read_text_change_toast");
                }
            }
            value2.LLJJJIL((int) (model.getBaseStickerModel().getStartTime() * 1000), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            value2.play();
        }
        LJIILJJIL(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(TextStickerModel textStickerModel) {
        String str;
        String str2;
        InterfaceC138705cQ interfaceC138705cQ = this.LJI;
        if (interfaceC138705cQ != null) {
            String textStr = textStickerModel.getTextStr();
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel == null || (str = ttsModel.speakerID) == null) {
                str = "";
            }
            TTSModel ttsModel2 = textStickerModel.getTtsModel();
            if (ttsModel2 != null) {
                str2 = ttsModel2.voiceEffectId;
            } else {
                str2 = null;
            }
            long j = 0;
            C138695cP.LIZ(interfaceC138705cQ, textStr, str, new SpeakerCenter.KevaSpeakerBean(str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, j, j, 510, 0 == true ? 1 : 0), C137045Zk.LIZIZ(textStickerModel));
        }
    }

    public final void LJIILIIL(TextStickerModel model) {
        TTSModel ttsModel;
        String str;
        String str2;
        InterfaceC123794tT LJFF;
        String str3;
        o.LJIIIZ(model, "model");
        InterfaceC153045zY value = this.LIZLLL.Kh().getValue();
        if (value != null && (ttsModel = model.getTtsModel()) != null && ttsModel.hasReadTextAudio) {
            TTSModel ttsModel2 = model.getTtsModel();
            if (ttsModel2 != null) {
                str = ttsModel2.nleUuid;
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                C122034qd LJJI = C17N.LJJI(value);
                if (LJJI != null && (LJFF = LJJI.LJFF()) != null) {
                    C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                    TTSModel ttsModel3 = model.getTtsModel();
                    if (ttsModel3 != null) {
                        str3 = ttsModel3.nleUuid;
                    } else {
                        str3 = null;
                    }
                    c122004qa.LIZIZ = str3;
                    LJFF.LJFF(c122004qa);
                }
                InterfaceC138705cQ interfaceC138705cQ = this.LJI;
                if (interfaceC138705cQ != null) {
                    TTSModel ttsModel4 = model.getTtsModel();
                    if (ttsModel4 == null || (str2 = ttsModel4.speakerID) == null) {
                        str2 = "";
                    }
                    interfaceC138705cQ.Rl(str2, C137045Zk.LIZIZ(model));
                }
                TTSModel ttsModel5 = model.getTtsModel();
                if (ttsModel5 != null) {
                    ttsModel5.hasReadTextAudio = false;
                    ttsModel5.nleUuid = "";
                    ttsModel5.audioTrackFilePath = null;
                    ttsModel5.speakerID = null;
                }
            }
        }
        LJIILJJIL(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(TextStickerModel textStickerModel) {
        InterfaceC138675cN interfaceC138675cN;
        TextStickerModel textStickerModel2;
        InterfaceC139535dl interfaceC139535dl = this.LJFF;
        StickerModel stickerModel = null;
        if (interfaceC139535dl != null) {
            interfaceC138675cN = (InterfaceC138675cN) interfaceC139535dl.T9(EnumC157656Gr.TEXT);
        } else {
            interfaceC138675cN = null;
        }
        int LJJIIJ = C32151Nz.LJJIIJ(textStickerModel);
        if (interfaceC138675cN != null && interfaceC138675cN.LJ(LJJIIJ)) {
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel == null) {
                long j = 0;
                ttsModel = new TTSModel(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 33554431, 0 == true ? 1 : 0);
            }
            interfaceC138675cN.LIZLLL(ttsModel, textStickerModel.getBaseStickerModel().getStartTime(), textStickerModel.getBaseStickerModel().getEndTime());
            return;
        }
        InterfaceC139535dl interfaceC139535dl2 = this.LJFF;
        if (interfaceC139535dl2 != null) {
            stickerModel = interfaceC139535dl2.P4(C32151Nz.LJJIIJ(textStickerModel));
        }
        if (!(stickerModel instanceof TextStickerModel) || (textStickerModel2 = (TextStickerModel) stickerModel) == null) {
            return;
        }
        this.LJFF.N8(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, textStickerModel.getBaseStickerModel().getStartTime(), textStickerModel.getBaseStickerModel().getEndTime(), false, 0.0f, 0.0f, false, 0.0f, -100663297, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, textStickerModel.getTtsModel(), null, null, null, null, null, false, 260094, null));
        StickerModel P4 = this.LJFF.P4(C32151Nz.LJJIIJ(textStickerModel2));
        if (P4 == null) {
            return;
        }
        this.LJFF.xQ(P4);
    }

    public final void LJFF(TextStickerModel textStickerModel, String str) {
        this.LJIILIIL = true;
        InterfaceC138705cQ interfaceC138705cQ = this.LJI;
        if (interfaceC138705cQ != null) {
            C138695cP.LIZIZ(interfaceC138705cQ, true, true, C137045Zk.LIZIZ(textStickerModel), null, null, 56);
        }
        C138735cT.LIZJ(LIZJ(), "manual", "text_edit_panel", str, null, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJIIIIZZ(TextStickerModel textStickerModel, boolean z) {
        String str;
        String audioText;
        InterfaceC153045zY value;
        String str2;
        InterfaceC153045zY value2;
        TTSModel ttsModel;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str3;
        List<C6QO> LLIIJLIL;
        o.LJIIIZ(textStickerModel, "textStickerModel");
        String str4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        boolean z6 = false;
        if (z) {
            new C139355dT().LIZ.storeInt("edit_text_tux_bubble_1", 1);
            TTSModel ttsModel2 = textStickerModel.getTtsModel();
            if (ttsModel2 != null && ttsModel2.hasReadTextAudio) {
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC139535dl interfaceC139535dl = this.LJFF;
            if (interfaceC139535dl != null && (LLIIJLIL = interfaceC139535dl.LLIIJLIL(EnumC157656Gr.TEXT)) != null) {
                Iterator<C6QO> it = LLIIJLIL.iterator();
                while (it.hasNext()) {
                    if (it.next().LJJLIIIJLJLI() == textStickerModel.getId()) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            boolean z7 = !z3;
            if (SpeakerCenter.LJFF() && !this.LJII.RF() && !C138685cO.LIZIZ(this.LIZJ.isApplyVoiceToAllTextOpen())) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean LIZJ = C69C.LIZJ();
            if (SpeakerCenter.LJFF() && !C138685cO.LIZIZ(this.LIZJ.isApplyVoiceToAllTextOpen())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z2) {
                LJFF(textStickerModel, LIZLLL(textStickerModel));
                return 0;
            }
            if (z7) {
                if (z4) {
                    LJIIIZ(textStickerModel);
                    return 1;
                }
                if (LIZJ) {
                    C138735cT.LIZJ(LIZJ(), "manual", "small_icon", LIZLLL(textStickerModel), null, 16);
                    InterfaceC138705cQ interfaceC138705cQ = this.LJI;
                    if (interfaceC138705cQ != null) {
                        long j = 0;
                        interfaceC138705cQ.dH(textStickerModel.getTextStr(), "", new SpeakerCenter.KevaSpeakerBean("", objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, z6, j, j, 510, objArr == true ? 1 : 0), C137045Zk.LIZIZ(textStickerModel), true);
                    }
                    return 1;
                }
                LJFF(textStickerModel, LIZLLL(textStickerModel));
                return 0;
            }
            if (z5) {
                if (!C167496hl.LIZIZ(textStickerModel.getTextStr())) {
                    C24540xm.LIZ(R.string.e49, this.LIZIZ, 1018);
                    return 1;
                }
                String str5 = null;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                C138735cT.LIZJ(LIZJ(), "auto", "text_edit_panel", LIZLLL(textStickerModel), null, 16);
                InterfaceC138705cQ interfaceC138705cQ2 = this.LJI;
                if (interfaceC138705cQ2 == null) {
                    return 1;
                }
                String textStr = textStickerModel.getTextStr();
                TTSModel ttsModel3 = textStickerModel.getTtsModel();
                if (ttsModel3 == null || (str3 = ttsModel3.speakerID) == null) {
                    str3 = "";
                }
                TTSModel ttsModel4 = textStickerModel.getTtsModel();
                if (ttsModel4 != null) {
                    str4 = ttsModel4.voiceEffectId;
                }
                long j2 = 0;
                C138695cP.LIZ(interfaceC138705cQ2, textStr, str3, new SpeakerCenter.KevaSpeakerBean(str4, str5, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, false, j2, j2, 510, objArr7 == true ? 1 : 0), C137045Zk.LIZIZ(textStickerModel));
                return 1;
            }
            if (LIZJ) {
                LJIIIZ(textStickerModel);
                return 1;
            }
            LJFF(textStickerModel, LIZLLL(textStickerModel));
            return 0;
        }
        if (C138515c7.LIZ()) {
            if (this.LJI != null) {
                TTSModel ttsModel5 = textStickerModel.getTtsModel();
                if (ttsModel5 != null && ttsModel5.hasReadTextAudio) {
                    C138735cT.LIZIZ(LIZJ(), LIZLLL(textStickerModel));
                } else {
                    C138735cT.LIZJ(LIZJ(), "auto", "bubble", LIZLLL(textStickerModel), null, 16);
                }
                if (C138685cO.LIZIZ(this.LIZJ.isApplyVoiceToAllTextOpen()) || !SpeakerCenter.LJFF() || ((ttsModel = textStickerModel.getTtsModel()) != null && ttsModel.hasReadTextAudio)) {
                    TTSModel ttsModel6 = textStickerModel.getTtsModel();
                    if (ttsModel6 != null && ttsModel6.hasReadTextAudio) {
                        new C139355dT().LIZ(true);
                    }
                    C138695cP.LIZIZ(this.LJI, true, false, C137045Zk.LIZIZ(textStickerModel), null, null, 56);
                    return 0;
                }
                C138695cP.LIZ(this.LJI, textStickerModel.getTextStr(), SpeakerCenter.LIZ(), SpeakerCenter.LIZIZ(), C137045Zk.LIZIZ(textStickerModel));
            }
            return 1;
        }
        TTSModel ttsModel7 = textStickerModel.getTtsModel();
        if (ttsModel7 != null && ttsModel7.ttsVoiceModel != null) {
            str = "auto";
        } else {
            str = "user_click";
        }
        if (!C47918IrK.LIZ(this.LIZIZ)) {
            C5S1 c5s1 = new C5S1(this.LIZIZ);
            c5s1.LIZLLL(this.LIZIZ.getString(R.string.e45));
            c5s1.LJ();
            return 1;
        }
        TTSModel ttsModel8 = textStickerModel.getTtsModel();
        if (ttsModel8 != null && ttsModel8.hasReadTextAudio) {
            C138735cT.LIZ(LIZJ(), null, null, 6);
            TTSModel ttsModel9 = textStickerModel.getTtsModel();
            if (ttsModel9 != null && (str2 = ttsModel9.nleUuid) != null && C78685UuP.LJJJZ(str2) && (value2 = this.LIZLLL.Kh().getValue()) != null) {
                value2.LLJJJIL((int) textStickerModel.getBaseStickerModel().getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
            LJIILIIL(textStickerModel);
            InterfaceC153045zY value3 = this.LIZLLL.Kh().getValue();
            if (value3 == null) {
                return 1;
            }
            value3.play();
            return 1;
        }
        C138735cT.LIZJ(LIZJ(), null, null, str, null, 22);
        TextStickerData LIZIZ = C137045Zk.LIZIZ(textStickerModel);
        String audioTrackFilePath = LIZIZ.getAudioTrackFilePath();
        if (audioTrackFilePath != null && audioTrackFilePath.length() > 0 && new File(LIZIZ.getAudioTrackFilePath()).exists() && (audioText = LIZIZ.getAudioText()) != null && audioText.length() > 0 && (!LIZIZ.getTextWrapList().isEmpty()) && o.LJ(LIZIZ.getAudioText(), C68W.LJII(LIZIZ.getTextWrapList()))) {
            String audioTrackFilePath2 = LIZIZ.getAudioTrackFilePath();
            if (audioTrackFilePath2 != null && (value = this.LIZLLL.Kh().getValue()) != null && audioTrackFilePath2.length() > 0) {
                value.LLJJJIL(LIZIZ.getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                LIZ(LIZIZ);
            }
            LJIIJJI();
            return 1;
        }
        if (C167496hl.LIZIZ(textStickerModel.getTextStr())) {
            this.LIZLLL.wZ(true);
            ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJIIIZ;
            if (progressDialogC43239Gy3 != null) {
                progressDialogC43239Gy3.cancel();
            }
            ProgressDialogC43239Gy3 LIZJ2 = C42034Gec.LIZJ(this.LIZIZ, EnumC42288Gii.VISIBLE, new InterfaceC43240Gy4() { // from class: X.5bz
                @Override // X.InterfaceC43240Gy4
                public final void LIZIZ() {
                    InterfaceC138185ba interfaceC138185ba = C138655cL.this.LJ;
                    if (interfaceC138185ba != null) {
                        interfaceC138185ba.i0();
                    }
                }
            });
            this.LJIIIZ = LIZJ2;
            LIZJ2.setMessage(this.LIZIZ.getString(R.string.rjz));
            ProgressDialogC43239Gy3 progressDialogC43239Gy32 = this.LJIIIZ;
            if (progressDialogC43239Gy32 != null) {
                if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy32, new Object[0], "void", new C65300Pk0(false, "()V", "7799666479464468287")).LIZ) {
                    progressDialogC43239Gy32.show();
                }
                LJI(true);
                InterfaceC153045zY value4 = this.LIZLLL.Kh().getValue();
                if (value4 != null) {
                    value4.pause();
                }
                InterfaceC138185ba interfaceC138185ba = this.LJ;
                if (interfaceC138185ba == null) {
                    return 1;
                }
                interfaceC138185ba.Rz(C78886Uxe.LJJI(LIZIZ), textStickerModel.getTextStr(), null, (InterfaceC138295bl) this.LJIIJ.getValue());
                return 1;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C5S1 c5s12 = new C5S1(this.LIZIZ);
        c5s12.LIZLLL(this.LIZIZ.getString(R.string.e49));
        c5s12.LJ();
        return 1;
    }

    public C138655cL(C139305dO textNewApi, Activity activity, VideoPublishEditModel editModel, InterfaceC143655kP editPreviewApi, InterfaceC138185ba interfaceC138185ba, InterfaceC139535dl interfaceC139535dl, InterfaceC138705cQ interfaceC138705cQ, InterfaceC138265bi unlockTTSVoiceVoiceApi, AqS152S0100000_2 aqS152S0100000_2) {
        o.LJIIIZ(textNewApi, "textNewApi");
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(unlockTTSVoiceVoiceApi, "unlockTTSVoiceVoiceApi");
        this.LIZ = textNewApi;
        this.LIZIZ = activity;
        this.LIZJ = editModel;
        this.LIZLLL = editPreviewApi;
        this.LJ = interfaceC138185ba;
        this.LJFF = interfaceC139535dl;
        this.LJI = interfaceC138705cQ;
        this.LJII = unlockTTSVoiceVoiceApi;
        this.LJIIIIZZ = aqS152S0100000_2;
        this.LJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 316));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 315));
        this.LJIIL = true;
    }
}
