package X;

import android.app.Application;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6ZN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZN {
    public final C169096kL LIZ;
    public final List<InterfaceC168706ji> LIZIZ;

    public C6ZN(final C169096kL c169096kL) {
        this.LIZ = c169096kL;
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        this.LIZIZ = C47261Igj.LJII(new C169076kJ(c169096kL), new C134965Rk(c169096kL), new C168956k7(c169096kL), new C168666je(c169096kL), new C168966k8(c169096kL), new AbstractC168846jw<MvCreateVideoData>(c169096kL) { // from class: X.6jc
            public final C169096kL LIZJ;
            public final InterfaceC84498XEg LIZLLL;
            public final int LJ;
            public final int LJFF;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
            }

            @Override // X.AbstractC168846jw
            public final List<MvCreateVideoData> LJIIJ() {
                MvCreateVideoData mvCreateVideoData = ((AwemeDraft) this.LIZJ.LIZLLL).LJJJJI.mvCreateVideoData;
                if (mvCreateVideoData != null && !C78688UuS.LJJJJIZL(mvCreateVideoData.mvId) && (!C78966Uyw.LJJIJIL(mvCreateVideoData.mvResUnzipPath) || TEVideoUtils.nativeCheckMVResourceIntegrity(mvCreateVideoData.mvResUnzipPath) != 0)) {
                    return C47261Igj.LJII(mvCreateVideoData);
                }
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC168846jw
            public final InterfaceC84498XEg LJII() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJFF;
            }

            {
                InterfaceC84498XEg LIZ;
                this.LIZJ = c169096kL;
                if (C43941HMj.LIZIZ()) {
                    Application application = C60903NvH.LJ;
                    o.LJIIIIZZ(application, "getApplication()");
                    LIZ = C84488XDw.LIZ(application, null);
                } else {
                    Application application2 = C60903NvH.LJ;
                    o.LJIIIIZZ(application2, "getApplication()");
                    LIZ = C84488XDw.LIZ(application2, C6ZP.LJLIL);
                }
                this.LIZLLL = LIZ;
                this.LJ = 6;
                this.LJFF = 900;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(MvCreateVideoData mvCreateVideoData) {
                MvCreateVideoData model = mvCreateVideoData;
                o.LJIIIZ(model, "model");
                String str = model.mvId;
                o.LJIIIIZZ(str, "model.mvId");
                return str;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, MvCreateVideoData mvCreateVideoData) {
                MvCreateVideoData model = mvCreateVideoData;
                o.LJIIIZ(model, "model");
                model.mvResUnzipPath = effect.getUnzipPath();
            }

            @Override // X.AbstractC168856jx, X.InterfaceC168706ji
            public final DraftFileRestoreResult LIZJ(Integer num, boolean z, DraftFileRestoreException restoreException) {
                o.LJIIIZ(restoreException, "restoreException");
                return C168716jj.LIZ(this, Integer.valueOf(R.string.ezh), true, restoreException);
            }
        }, new AbstractC168846jw<StickerItemModel>(c169096kL) { // from class: X.5Sw
            public final C169096kL LIZJ;
            public final int LIZLLL = 7;
            public final int LJ = LiveCoverMinSizeSetting.DEFAULT;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
                List<StickerItemModel> list;
                InfoStickerModel LJI = ((AwemeDraft) this.LIZJ.LIZLLL).LJI();
                if (LJI != null && (list = LJI.stickers) != null) {
                    list.removeAll(this.LIZ);
                }
            }

            @Override // X.AbstractC168846jw
            public final List<StickerItemModel> LJIIJ() {
                List<StickerItemModel> list;
                InfoStickerModel LJI = ((AwemeDraft) this.LIZJ.LIZLLL).LJI();
                if (LJI != null && (list = LJI.stickers) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (StickerItemModel stickerItemModel : list) {
                        StickerItemModel it = stickerItemModel;
                        o.LJIIIIZZ(it, "it");
                        if (C1535160t.LIZIZ(it) && !C78688UuS.LJJJJIZL(it.stickerId) && !C78966Uyw.LJJIJIL(it.path)) {
                            arrayList.add(stickerItemModel);
                        }
                    }
                    return arrayList;
                }
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJ;
            }

            {
                this.LIZJ = c169096kL;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(StickerItemModel stickerItemModel) {
                StickerItemModel model = stickerItemModel;
                o.LJIIIZ(model, "model");
                String str = model.stickerId;
                o.LJIIIIZZ(str, "model.stickerId");
                return str;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, StickerItemModel stickerItemModel) {
                StickerItemModel model = stickerItemModel;
                o.LJIIIZ(model, "model");
                model.path = effect.getUnzipPath();
            }
        }, new AbstractC168846jw<DraftVEAudioEffectParam>(c169096kL) { // from class: X.6ZQ
            public final C169096kL LIZJ;
            public final int LIZLLL = 8;
            public final int LJ = 300;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
                ((AwemeDraft) this.LIZJ.LIZLLL).LJJJJI.draftVEAudioEffectParam = null;
            }

            @Override // X.AbstractC168846jw
            public final List<DraftVEAudioEffectParam> LJIIJ() {
                String str;
                DraftVEAudioEffectParam LIZLLL = ((AwemeDraft) this.LIZJ.LIZLLL).LIZLLL();
                if (LIZLLL != null && !C78688UuS.LJJJJIZL(LIZLLL.uploadId) && (str = LIZLLL.effectPath) != null && str.length() != 0) {
                    String str2 = LIZLLL.effectPath;
                    o.LJI(str2);
                    if (!C78966Uyw.LJJIJIL(str2)) {
                        return C47261Igj.LJII(LIZLLL);
                    }
                }
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJ;
            }

            {
                this.LIZJ = c169096kL;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(DraftVEAudioEffectParam draftVEAudioEffectParam) {
                DraftVEAudioEffectParam model = draftVEAudioEffectParam;
                o.LJIIIZ(model, "model");
                String str = model.uploadId;
                o.LJI(str);
                return str;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, DraftVEAudioEffectParam draftVEAudioEffectParam) {
                DraftVEAudioEffectParam model = draftVEAudioEffectParam;
                o.LJIIIZ(model, "model");
                model.effectPath = effect.getUnzipPath();
            }
        }, new AbstractC168846jw<StickerItemModel>(c169096kL) { // from class: X.5jR
            public final C169096kL LIZJ;
            public final int LIZLLL = 9;
            public final int LJ = 350;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
                EffectTextModel effectTextModel;
                CoverPublishModel coverPublishModel = ((AwemeDraft) this.LIZJ.LIZLLL).LJJJJI.coverPublishModel;
                if (coverPublishModel == null || (effectTextModel = coverPublishModel.getEffectTextModel()) == null) {
                    return;
                }
                effectTextModel.setHasCoverText(false);
            }

            @Override // X.AbstractC168846jw
            public final List<StickerItemModel> LJIIJ() {
                EffectTextModel effectTextModel;
                StickerItemModel textSticker;
                CoverPublishModel coverPublishModel = ((AwemeDraft) this.LIZJ.LIZLLL).LJJJJI.coverPublishModel;
                if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && !C78688UuS.LJJJJIZL(textSticker.stickerId) && !C78966Uyw.LJJIJIL(textSticker.path) && textSticker != null) {
                    return C47261Igj.LJII(textSticker);
                }
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJ;
            }

            {
                this.LIZJ = c169096kL;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(StickerItemModel stickerItemModel) {
                StickerItemModel model = stickerItemModel;
                o.LJIIIZ(model, "model");
                String str = model.stickerId;
                o.LJIIIIZZ(str, "model.stickerId");
                return str;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, StickerItemModel stickerItemModel) {
                StickerItemModel model = stickerItemModel;
                o.LJIIIZ(model, "model");
                model.path = effect.getUnzipPath();
            }
        }, new AbstractC168846jw<OSZ<? extends TextStickerModel, ? extends TextFontModel>>(c169096kL) { // from class: X.5Wv
            public final C169096kL LIZJ;
            public final InterfaceC84498XEg LIZLLL;
            public final int LJ;
            public final int LJFF;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
            }

            @Override // X.AbstractC168846jw
            public final List<OSZ<? extends TextStickerModel, ? extends TextFontModel>> LJIIJ() {
                String fontId;
                String fontPath;
                List<TextStickerModel> list = ((AwemeDraft) this.LIZJ.LIZLLL).LIZ.stickerModel.textStickerModels;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                for (TextStickerModel textStickerModel : list) {
                    TextStickerData LIZIZ = C137045Zk.LIZIZ(textStickerModel);
                    String fontType = LIZIZ.getFontType();
                    if (fontType != null && fontType.length() != 0 && ((fontId = LIZIZ.getFontId()) == null || fontId.length() == 0 || (fontPath = LIZIZ.getFontPath()) == null || fontPath.length() == 0)) {
                        LIZIZ.setFontType(LIZIZ.getFontType());
                    }
                    arrayList.add(new OSZ(textStickerModel, textStickerModel.getFontModel()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    TextFontModel textFontModel = (TextFontModel) ((OSZ) next).getSecond();
                    if (!C78688UuS.LJJJJIZL(textFontModel.fontId) && !C78966Uyw.LJJIJIL(textFontModel.localPath)) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC168846jw
            public final InterfaceC84498XEg LJII() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJFF;
            }

            {
                InterfaceC84498XEg LIZ;
                this.LIZJ = c169096kL;
                if (C43941HMj.LIZIZ()) {
                    Application application = C60903NvH.LJ;
                    o.LJIIIIZZ(application, "getApplication()");
                    LIZ = C84488XDw.LIZ(application, null);
                } else {
                    Application application2 = C60903NvH.LJ;
                    o.LJIIIIZZ(application2, "getApplication()");
                    LIZ = C84488XDw.LIZ(application2, C5X6.LJLIL);
                }
                this.LIZLLL = LIZ;
                this.LJ = 10;
                this.LJFF = LiveChatShowDelayForHotLiveSetting.DEFAULT;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(OSZ<? extends TextStickerModel, ? extends TextFontModel> osz) {
                OSZ<? extends TextStickerModel, ? extends TextFontModel> model = osz;
                o.LJIIIZ(model, "model");
                return model.getSecond().fontId;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, OSZ<? extends TextStickerModel, ? extends TextFontModel> osz) {
                OSZ<? extends TextStickerModel, ? extends TextFontModel> model = osz;
                o.LJIIIZ(model, "model");
                List<TextStickerModel> list = ((AwemeDraft) this.LIZJ.LIZLLL).LIZ.stickerModel.textStickerModels;
                C6H4.LJII(new AqS168S0100000_2(model, (OSZ<Integer, Integer>) 490), list);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(effect.getUnzipPath());
                LIZ.append(File.separator);
                LIZ.append(model.getSecond().fontName);
                list.add(TextStickerModel.copy$default(model.getFirst(), null, null, null, 0, 0, 0, 0.0f, TextFontModel.L(model.getFirst().getFontModel(), null, null, null, 0, null, X1D.LIZIZ(LIZ), false, false, 447), false, false, false, null, null, null, null, null, null, false, 262015, null));
            }
        }, new AbstractC168846jw<OSZ<? extends StickerItemModel, ? extends TextStickerData>>(c169096kL) { // from class: X.5Wu
            public final C169096kL LIZJ;
            public final InterfaceC84498XEg LIZLLL;
            public final int LJ;
            public final int LJFF;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
            }

            @Override // X.AbstractC168846jw
            public final List<OSZ<? extends StickerItemModel, ? extends TextStickerData>> LJIIJ() {
                List<StickerItemModel> list;
                String fontId;
                String fontPath;
                InfoStickerModel LJI = ((AwemeDraft) this.LIZJ.LIZLLL).LJI();
                if (LJI != null && (list = LJI.stickers) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (StickerItemModel stickerItemModel : list) {
                        if (stickerItemModel.isTextSticker()) {
                            arrayList.add(stickerItemModel);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        StickerItemModel stickerItemModel2 = (StickerItemModel) it.next();
                        Object fromJson = GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel2.extra, (Class<Object>) TextStickerData.class);
                        o.LJIIIIZZ(fromJson, "getAPI().getGson().fromJ…tStickerData::class.java)");
                        TextStickerData textStickerData = (TextStickerData) fromJson;
                        String fontType = textStickerData.getFontType();
                        if (fontType != null && fontType.length() != 0 && ((fontId = textStickerData.getFontId()) == null || fontId.length() == 0 || (fontPath = textStickerData.getFontPath()) == null || fontPath.length() == 0)) {
                            textStickerData.setFontType(textStickerData.getFontType());
                        }
                        arrayList2.add(new OSZ(stickerItemModel2, textStickerData));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        TextStickerData textStickerData2 = (TextStickerData) ((OSZ) next).getSecond();
                        if (!C78688UuS.LJJJJIZL(textStickerData2.getFontId())) {
                            if (textStickerData2.getFontPath() != null) {
                                String fontPath2 = textStickerData2.getFontPath();
                                o.LJI(fontPath2);
                                if (!C78966Uyw.LJJIJIL(fontPath2)) {
                                }
                            }
                            arrayList3.add(next);
                        }
                    }
                    return arrayList3;
                }
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC168846jw
            public final InterfaceC84498XEg LJII() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJFF;
            }

            {
                InterfaceC84498XEg LIZ;
                this.LIZJ = c169096kL;
                if (C43941HMj.LIZIZ()) {
                    Application application = C60903NvH.LJ;
                    o.LJIIIIZZ(application, "getApplication()");
                    LIZ = C84488XDw.LIZ(application, null);
                } else {
                    Application application2 = C60903NvH.LJ;
                    o.LJIIIIZZ(application2, "getApplication()");
                    LIZ = C84488XDw.LIZ(application2, C5X7.LJLIL);
                }
                this.LIZLLL = LIZ;
                this.LJ = 10;
                this.LJFF = LiveChatShowDelayForHotLiveSetting.DEFAULT;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(OSZ<? extends StickerItemModel, ? extends TextStickerData> osz) {
                OSZ<? extends StickerItemModel, ? extends TextStickerData> model = osz;
                o.LJIIIZ(model, "model");
                String fontId = model.getSecond().getFontId();
                o.LJI(fontId);
                return fontId;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, OSZ<? extends StickerItemModel, ? extends TextStickerData> osz) {
                OSZ<? extends StickerItemModel, ? extends TextStickerData> model = osz;
                o.LJIIIZ(model, "model");
                model.getSecond().setFontPath(effect.getUnzipPath());
                model.getFirst().extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), model.getSecond());
            }
        }, new AbstractC168846jw<CanvasFilterParam>(c169096kL) { // from class: X.6ZO
            public final C169096kL LIZJ;
            public final int LIZLLL = 12;
            public final int LJ = 1000;

            @Override // X.AbstractC168846jw
            public final void LJIIIIZZ() {
            }

            @Override // X.AbstractC168846jw
            public final List<CanvasFilterParam> LJIIJ() {
                List<CanvasFilterParam> transformList;
                String animPath;
                CanvasVideoData canvasVideoData = ((AwemeDraft) this.LIZJ.LIZLLL).LJJJJI.canvasVideoData;
                if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (CanvasFilterParam canvasFilterParam : transformList) {
                        CanvasFilterParam canvasFilterParam2 = canvasFilterParam;
                        String animPath2 = canvasFilterParam2.getAnimPath();
                        if (animPath2 != null && animPath2.length() != 0 && (animPath = canvasFilterParam2.getAnimPath()) != null && !C78966Uyw.LJJIJIL(animPath)) {
                            arrayList.add(canvasFilterParam);
                        }
                    }
                    return arrayList;
                }
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJ;
            }

            {
                this.LIZJ = c169096kL;
            }

            @Override // X.AbstractC168846jw
            public final String LJIIIZ(CanvasFilterParam canvasFilterParam) {
                CanvasFilterParam model = canvasFilterParam;
                o.LJIIIZ(model, "model");
                String effectId = model.getEffectId();
                if (effectId == null) {
                    return "";
                }
                return effectId;
            }

            @Override // X.AbstractC168846jw
            public final void LJI(Effect effect, CanvasFilterParam canvasFilterParam) {
                CanvasFilterParam model = canvasFilterParam;
                o.LJIIIZ(model, "model");
                model.setAnimPath(effect.getUnzipPath());
            }
        }, new InterfaceC168706ji(c169096kL) { // from class: X.6jd
            public final C169096kL LIZ;
            public final int LIZIZ = 13;
            public final int LIZJ = 1000;

            @Override // X.InterfaceC168706ji
            public final int LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LIZ;
            }

            @Override // X.InterfaceC168706ji
            public final int getPriority() {
                return this.LIZJ;
            }

            {
                this.LIZ = c169096kL;
            }

            @Override // X.InterfaceC168706ji
            public final Object LIZIZ(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC168706ji
            public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                C43543H7b.LJ(((AwemeDraft) this.LIZ.LIZLLL).LJJJJI.canvasVideoData);
                return Boolean.TRUE;
            }

            @Override // X.InterfaceC168706ji
            public final DraftFileRestoreResult LIZJ(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
                return C168716jj.LIZ(this, num, z, draftFileRestoreException);
            }
        }, new C169086kK(c169096kL), new C134965Rk(c169096kL) { // from class: X.5Rf
            public final C169096kL LJFF;
            public final int LJI;
            public final int LJII;

            @Override // X.C134965Rk, X.AbstractC168846jw
            public final List<EffectPointModel> LJIIJ() {
                List<CombineEffectPointModel> list = ((AwemeDraft) this.LJFF.LIZLLL).LIZ.magicCombineEffectModel.magicCombineEffectModelList;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                for (CombineEffectPointModel combineEffectPointModel : list) {
                    EffectPointModel effectPointModel = new EffectPointModel();
                    effectPointModel.setKey(combineEffectPointModel.getKey());
                    effectPointModel.setName(combineEffectPointModel.getName());
                    effectPointModel.setResDir(combineEffectPointModel.getResDir());
                    arrayList.add(effectPointModel);
                }
                return arrayList;
            }

            @Override // X.C134965Rk, X.InterfaceC168706ji
            public final int LIZ() {
                return this.LJI;
            }

            @Override // X.C134965Rk, X.InterfaceC168706ji
            public final C169096kL getParams() {
                return this.LJFF;
            }

            @Override // X.C134965Rk, X.InterfaceC168706ji
            public final int getPriority() {
                return this.LJII;
            }

            {
                super(c169096kL);
                this.LJFF = c169096kL;
                this.LJI = 16;
                this.LJII = 1400;
            }
        });
    }
}
