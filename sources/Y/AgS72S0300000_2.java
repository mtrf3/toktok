package Y;

import X.C10I;
import X.C10K;
import X.C135115Rz;
import X.C1552367j;
import X.C1558669u;
import X.C156186Ba;
import X.C156556Cl;
import X.C156666Cw;
import X.C157376Fp;
import X.C157766Hc;
import X.C5LS;
import X.C60903NvH;
import X.C63C;
import X.C67C;
import X.C67E;
import X.C67H;
import X.C6BX;
import X.C6BZ;
import X.C6PB;
import X.C76800UCe;
import X.H78;
import X.InterfaceC137115Zr;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.ProgressDialogC173696rl;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AgS72S0300000_2 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS72S0300000_2 agS72S0300000_2, C10K task) {
        o.LJIIIZ(task, "task");
        C5LS c5ls = (C5LS) agS72S0300000_2.l0;
        ProgressDialogC173696rl progressDialogC173696rl = c5ls.LJFF;
        if (progressDialogC173696rl != null && progressDialogC173696rl.isShowing()) {
            C135115Rz.LIZ(c5ls.LJFF);
        }
        c5ls.LJI = 0;
        if (task.LJIILIIL()) {
            Object LJIIJJI = task.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            if (((Boolean) LJIIJJI).booleanValue()) {
                ((InterfaceC65784Pro) agS72S0300000_2.l1).invoke();
                return null;
            }
        }
        ((InterfaceC65784Pro) agS72S0300000_2.l2).invoke();
        return null;
    }

    public static final Object then$1(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        int i;
        for (C6BX c6bx : (List) c10k.LJIIJJI()) {
            C1558669u c1558669u = c6bx.LIZ;
            int duration = ((InterfaceC153045zY) agS72S0300000_2.l0).getDuration();
            int i2 = 0;
            if (c1558669u != null && (i = c1558669u.LJLJI) > 0) {
                i2 = c1558669u.LJLILLLLZI;
                duration = i;
            }
            StickerItemModel stickerItemModel = new StickerItemModel(((C6BZ) agS72S0300000_2.l1).LJLJJLL.LLII, c6bx.stickerPath, "", c6bx.index, false, i2, duration, 9);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = c6bx.viewHash;
            ((InterfaceC137115Zr) agS72S0300000_2.l2).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        int i;
        for (C6BX c6bx : (List) c10k.LJIIJJI()) {
            C1558669u c1558669u = c6bx.LIZ;
            int duration = ((InterfaceC153045zY) agS72S0300000_2.l0).getDuration();
            int i2 = 0;
            if (c1558669u != null && (i = c1558669u.LJLJI) > 0) {
                i2 = c1558669u.LJLILLLLZI;
                duration = i;
            }
            StickerItemModel stickerItemModel = new StickerItemModel(((C156186Ba) agS72S0300000_2.l1).LJLJJLL.LLII, c6bx.stickerPath, "", c6bx.index, false, i2, duration, 8);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = c6bx.viewHash;
            ((InterfaceC137115Zr) agS72S0300000_2.l2).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        int i;
        int duration;
        H78.LIZ("EditStickerScene -> getTextStickerCompileTask success");
        for (TextStickerCompileResult textStickerCompileResult : (List) c10k.LJIIJJI()) {
            TextStickerData textStickerData = textStickerCompileResult.textStickerData;
            textStickerData.setCanvasWidth(((InterfaceC137115Zr) agS72S0300000_2.l0).LJLLL().LIZLLL());
            textStickerData.setCanvasHeight(((InterfaceC137115Zr) agS72S0300000_2.l0).LJLLL().LJI());
            textStickerData.setVideoWidth(((InterfaceC153045zY) agS72S0300000_2.l1).LLILZ().width);
            textStickerData.setVideoHeight(((InterfaceC153045zY) agS72S0300000_2.l1).LLILZ().height);
            textStickerData.setAddToLayoutInPreviewOrCover(false);
            if (textStickerData.getLayoutWidth() == 0.0f || textStickerData.getLayoutHeight() == 0.0f) {
                if (((C63C) agS72S0300000_2.l2).LLIIIL != null) {
                    textStickerData.setLayoutWidth(r0.getWidth());
                    if (((C63C) agS72S0300000_2.l2).LLIIIL != null) {
                        textStickerData.setLayoutHeight(r0.getHeight());
                    } else {
                        o.LJIJI("textPStickerLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("textPStickerLayout");
                    throw null;
                }
            }
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
            if (textStickerData.hasTimeData()) {
                i = textStickerData.getStartTime();
            } else {
                i = 0;
            }
            if (textStickerData.hasTimeData()) {
                duration = textStickerData.getEndTime();
            } else {
                duration = ((InterfaceC153045zY) agS72S0300000_2.l1).getDuration();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("text_sticker_");
            LIZ.append(textStickerCompileResult.index);
            StickerItemModel stickerItemModel = new StickerItemModel(X1D.LIZIZ(LIZ), textStickerCompileResult.stickerPath, json, textStickerCompileResult.index, false, i, duration, 2);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = textStickerCompileResult.viewHash;
            stickerItemModel.adjustTextParagraph = textStickerData.getAdjustTextParagraph();
            stickerItemModel.adjustTextStyleInEditorPro = textStickerData.getAdjustTextStyleInEditorPro();
            stickerItemModel.adjustTextColorInEditorPro = textStickerData.getAdjustTextColorInEditorPro();
            stickerItemModel.adjustTextFontInEditorPro = textStickerData.getAdjustTextFontInEditorPro();
            stickerItemModel.adjustTextPositionInEditorPro = textStickerData.getAdjustTextPositionInEditorPro();
            stickerItemModel.isEditorProTrimLength = textStickerData.isEditorProTrimLength();
            stickerItemModel.isEditorProText = textStickerData.isEditorProText();
            stickerItemModel.isEditorProCopyText = textStickerData.isEditorProCopyText();
            stickerItemModel.isEditorProTTS = textStickerData.isEditorProTTS();
            stickerItemModel.editorProTTSID = textStickerData.getEditorProTTSID();
            stickerItemModel.isEditorProCaption = textStickerData.isEditorProCaption();
            ((InterfaceC137115Zr) agS72S0300000_2.l0).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        PoiData poiData;
        int i;
        C156666Cw c156666Cw = (C156666Cw) c10k.LJIIJJI();
        if (c156666Cw != null) {
            InteractStickerStruct interactStickerStruct = c156666Cw.LIZ;
            Gson retrofitFactoryGson = C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson();
            PoiStickerStruct poiStickerStruct = interactStickerStruct.getPoiStickerStruct();
            if (poiStickerStruct != null) {
                poiData = poiStickerStruct.getPoiData();
            } else {
                poiData = null;
            }
            String json = GsonProtectorUtils.toJson(retrofitFactoryGson, poiData);
            int duration = ((InterfaceC153045zY) agS72S0300000_2.l0).getDuration();
            PoiStickerStruct poiStickerStruct2 = interactStickerStruct.getPoiStickerStruct();
            int i2 = 0;
            if (poiStickerStruct2 != null && poiStickerStruct2.getEndTime() == 0) {
                i = 0;
            } else {
                PoiStickerStruct poiStickerStruct3 = interactStickerStruct.getPoiStickerStruct();
                if (poiStickerStruct3 != null) {
                    i = poiStickerStruct3.getStartTime();
                } else {
                    i = 0;
                }
                PoiStickerStruct poiStickerStruct4 = interactStickerStruct.getPoiStickerStruct();
                if (poiStickerStruct4 != null) {
                    i2 = poiStickerStruct4.getEndTime();
                }
                duration = i2;
            }
            String str = ((C156556Cl) agS72S0300000_2.l1).LLJJI().LLIFFJFJJ;
            if (str == null) {
                str = "";
            }
            StickerItemModel stickerItemModel = new StickerItemModel(str, c156666Cw.stickerPath, json, c156666Cw.index, false, i, duration, 24);
            stickerItemModel.isImageStickerLayer = true;
            ((InterfaceC137115Zr) agS72S0300000_2.l2).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        int i;
        for (C6BX c6bx : (List) c10k.LJIIJJI()) {
            C1558669u c1558669u = c6bx.LIZ;
            int duration = ((InterfaceC153045zY) agS72S0300000_2.l0).getDuration();
            int i2 = 0;
            if (c1558669u != null && (i = c1558669u.LJLJI) > 0) {
                i2 = c1558669u.LJLILLLLZI;
                duration = i;
            }
            StickerItemModel stickerItemModel = new StickerItemModel(((C157376Fp) agS72S0300000_2.l1).LLJJIII().LLIIIL, c6bx.stickerPath, "", c6bx.index, false, i2, duration, 19);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = c6bx.viewHash;
            ((InterfaceC137115Zr) agS72S0300000_2.l2).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$6(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        boolean z;
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) LJIIJJI).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            C1552367j c1552367j = (C1552367j) agS72S0300000_2.l0;
            C157766Hc c157766Hc = (C157766Hc) agS72S0300000_2.l1;
            EffectTextModel effectTextModel = (EffectTextModel) agS72S0300000_2.l2;
            try {
                TextStickerCompileResult textStickerCompileResult = (TextStickerCompileResult) ListProtector.get(arrayList, 0);
                TextStickerData textStickerData = textStickerCompileResult.textStickerData;
                if (c1552367j.LIZJ > c1552367j.LIZIZ) {
                    z = true;
                }
                textStickerData.setCoverExtraData(new TextStickerCoverExtraData(z));
                StickerItemModel stickerItemModel = new StickerItemModel(c157766Hc.LJI().LLJILJILJ, textStickerCompileResult.stickerPath, C6PB.LIZIZ().LJIILL(textStickerCompileResult.textStickerData), textStickerCompileResult.index, false, 0, 0, 2);
                stickerItemModel.isImageStickerLayer = true;
                effectTextModel.setTextSticker(stickerItemModel);
                effectTextModel.setHasCoverText(true);
            } catch (Exception e) {
                C6PB.LIZJ().LIZIZ(e);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$7(AgS72S0300000_2 agS72S0300000_2, C10K c10k) {
        int i;
        C67H c67h = (C67H) c10k.LJIIJJI();
        if (c67h != null) {
            C67E c67e = c67h.LIZ;
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), c67e.LJLIL);
            int duration = ((InterfaceC153045zY) agS72S0300000_2.l0).getDuration();
            int i2 = c67e.LJLJJI;
            if (i2 != 0) {
                i = c67e.LJLJI;
            } else {
                i2 = duration;
                i = 0;
            }
            String str = ((C67C) agS72S0300000_2.l1).LLJJI().LLII;
            if (str == null) {
                str = "";
            }
            StickerItemModel stickerItemModel = new StickerItemModel(str, c67h.stickerPath, json, c67h.index, false, i, i2, 7);
            stickerItemModel.isImageStickerLayer = true;
            ((InterfaceC137115Zr) agS72S0300000_2.l2).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public AgS72S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
