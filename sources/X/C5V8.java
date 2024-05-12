package X;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.t1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5V8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5V8 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZJ(NLEModel nLEModel) {
        NLESegment nLESegment;
        NLEStyText nLEStyText;
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        TextFontStyleData textFontStyleData;
        String str4;
        C76800UCe c76800UCe;
        boolean z4;
        NLESegment nLESegment2 = null;
        if (!G3R.LIZ()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator LIZJ = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (LIZJ.hasNext()) {
            NLETrack nLETrack = (NLETrack) LIZJ.next();
            if (nLETrack.LJIIZILJ() == EnumC123864ta.STICKER) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack.LJIILL());
                if (nLETrackSlot != null) {
                    nLESegment = nLETrackSlot.LJI();
                } else {
                    nLESegment = nLESegment2;
                }
                if (NLESegmentTextSticker.LJFF(nLESegment) != null) {
                    C5WP c5wp = (C5WP) C45161Hnx.LIZ.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
                    NLESegment nLESegment3 = nLESegment2;
                    while (it.hasNext()) {
                        NLETrackSlot next = it.next();
                        NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(next.LJI());
                        if (LJFF != null) {
                            nLEStyText = LJFF.LJII();
                        } else {
                            nLEStyText = nLESegment3;
                        }
                        if (nLEStyText == null) {
                            H78.LJII("AutoCutReLoadTextSticker text style is null");
                        } else {
                            OSZ<String, String> LIZJ2 = C134305Ow.LIZJ(nLEStyText.LIZIZ().LIZLLL());
                            if (LIZJ2 != null) {
                                str = LIZJ2.getFirst();
                            } else {
                                str = nLESegment3;
                            }
                            if (LIZJ2 != null) {
                                str2 = LIZJ2.getSecond();
                            } else {
                                str2 = nLESegment3;
                            }
                            Effect LIZ2 = c5wp.LIZ(str, str2);
                            String str5 = nLESegment3;
                            if (LIZ2 == null) {
                                if (LIZJ2 != null) {
                                    str5 = LIZJ2.getSecond();
                                }
                                if (str5 == 0 || str5.length() == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    String valueOf = String.valueOf(LIZJ2);
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("AutoCutReLoadTextSticker not found ep model in cache:  ");
                                    LIZ3.append(valueOf);
                                    H78.LJII(X1D.LIZIZ(LIZ3));
                                }
                            }
                            TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null);
                            long j = 1000;
                            textStickerData.setStartTime((int) (next.getStartTime() / j));
                            textStickerData.setEndTime((int) (next.getEndTime() / j));
                            textStickerData.setScale(next.getScale());
                            textStickerData.setX(C44384HbQ.LLILZIL(next.getTransformX()));
                            textStickerData.setY(C44384HbQ.LLILZLL(next.getTransformY()));
                            textStickerData.setRotation(-next.getRotation());
                            NLESegmentTextSticker LJFF2 = NLESegmentTextSticker.LJFF(next.LJI());
                            if (LJFF2 == null || (str3 = LJFF2.LJI()) == null) {
                                str3 = "";
                            }
                            textStickerData.setTextStr(str3);
                            if (NLEEditorJniJNI.NLEStyText_hasBackground(nLEStyText.LIZ, nLEStyText) && NLEEditorJniJNI.NLEStyText_getBackground(nLEStyText.LIZ, nLEStyText)) {
                                if (Color.alpha((int) nLEStyText.LIZ()) == 153) {
                                    textStickerData.setBgMode(3);
                                    int LIZ4 = (int) nLEStyText.LIZ();
                                    textStickerData.setColor(Color.rgb((LIZ4 & 16711680) >> 16, (65280 & LIZ4) >> 8, LIZ4 & 255));
                                } else {
                                    textStickerData.setBgMode(2);
                                    textStickerData.setColor((int) nLEStyText.LIZ());
                                }
                            } else {
                                long LIZJ3 = nLEStyText.LIZJ();
                                int[] iArr = C1556068u.LJLLILLLL;
                                long j2 = (16711680 & LIZJ3) >> 16;
                                long j3 = (LIZJ3 & 65280) >> 8;
                                long j4 = LIZJ3 & 255;
                                int i4 = 16;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < i4) {
                                        i = iArr[i5];
                                        float f = (16711680 & i) >> 16;
                                        float f2 = f - 2.56f;
                                        if (0.0f >= f2) {
                                            f2 = 0.0f;
                                        }
                                        float f3 = f + 2.56f;
                                        if (f3 > 255.0f) {
                                            f3 = 255.0f;
                                        }
                                        float f4 = (65280 & i) >> 8;
                                        float max = Math.max(0.0f, f4 - 2.56f);
                                        float min = Math.min(f4 + 2.56f, 255.0f);
                                        float f5 = i & 255;
                                        float max2 = Math.max(0.0f, f5 - 2.56f);
                                        float min2 = Math.min(f5 + 2.56f, 255.0f);
                                        float f6 = (float) j2;
                                        if (f2 <= f6 && f6 <= f3) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            float f7 = (float) j3;
                                            if (max <= f7 && f7 <= min) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                float f8 = (float) j4;
                                                if (max2 <= f8 && f8 <= min2) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                        i5++;
                                        i4 = 16;
                                    } else {
                                        i = (int) LIZJ3;
                                        break;
                                    }
                                }
                                textStickerData.setColor(i);
                                if (NLEEditorJniJNI.NLEStyText_hasOutline(nLEStyText.LIZ, nLEStyText) && NLEEditorJniJNI.NLEStyText_getOutline(nLEStyText.LIZ, nLEStyText)) {
                                    i2 = 4;
                                } else {
                                    i2 = 1;
                                }
                                textStickerData.setBgMode(i2);
                            }
                            int NLEStyText_getAlignType = NLEEditorJniJNI.NLEStyText_getAlignType(nLEStyText.LIZ, nLEStyText);
                            if (NLEStyText_getAlignType != 0) {
                                if (NLEStyText_getAlignType != 2) {
                                    i3 = 2;
                                } else {
                                    i3 = 3;
                                }
                            } else {
                                i3 = 1;
                            }
                            textStickerData.setAlign(i3);
                            if (LIZ2 != null) {
                                try {
                                    textFontStyleData = (TextFontStyleData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), LIZ2.getExtra(), TextFontStyleData.class);
                                } catch (RuntimeException unused) {
                                    textFontStyleData = null;
                                }
                                if (textFontStyleData != null) {
                                    str4 = textFontStyleData.fileName;
                                } else {
                                    str4 = null;
                                }
                                textStickerData.setFontType(str4);
                                textStickerData.setFontId(LIZ2.getEffectId());
                                textStickerData.setFontPath(LIZ2.getUnzipPath());
                                textStickerData.setFontResId(LIZ2.getResource_id());
                                c76800UCe = C76800UCe.LIZ;
                            } else {
                                c76800UCe = null;
                            }
                            if (c76800UCe == null) {
                                textStickerData.setFontType("default");
                            }
                            arrayList2.add(textStickerData);
                        }
                        nLESegment3 = null;
                    }
                    List LLJI = ORZ.LLJI(arrayList2);
                    nLEModel.removeTrack(nLETrack);
                    arrayList.addAll(LLJI);
                }
            }
            nLESegment2 = null;
        }
        return ORZ.LLJI(arrayList);
    }

    public static void LIZLLL(NLEModel nLEModel, boolean z) {
        VecNLETrackSPtr tracks;
        if (!G3R.LIZ() || z || nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return;
        }
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.TEXT_SPEAK.name())) {
                nLEModel.removeTrack(next);
            }
        }
    }

    public static void LJ(NLEModel nLEModel, boolean z) {
        VecNLETrackSPtr tracks;
        NLESegment nLESegment;
        if (!G3R.LIZ() || z || nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return;
        }
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (next.LJIIZILJ() == EnumC123864ta.STICKER) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, next.LJIILL());
                if (nLETrackSlot != null) {
                    nLESegment = nLETrackSlot.LJI();
                } else {
                    nLESegment = null;
                }
                if (NLESegmentTextSticker.LJFF(nLESegment) != null) {
                    nLEModel.removeTrack(next);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Throwable, kotlin.jvm.internal.AqS168S0100000_2] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static void LIZIZ(List list, ActivityC45651qj context, C82622Wbi diContainer, OSZ osz, java.util.Map recommendTitleMap, VideoPublishEditModel editModel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(recommendTitleMap, "recommendTitleMap");
        o.LJIIIZ(editModel, "editModel");
        if (!G3R.LIZ()) {
            return;
        }
        ?? r8 = 0;
        InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) diContainer.LJ(InterfaceC143655kP.class, null);
        InterfaceC142515iZ interfaceC142515iZ = (InterfaceC142515iZ) diContainer.LJ(InterfaceC142515iZ.class, null);
        InterfaceC139655dx LIZ2 = interfaceC142515iZ.mu().LIZ();
        if (LIZ2 != null) {
            LIZ2.M6();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        InfoStickerModel infoStickerModel = new InfoStickerModel();
        infoStickerModel.stickers = new ArrayList();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                TextStickerData textStickerData = (TextStickerData) obj;
                if (o.LJ(textStickerData.getType(), "type_text_sticker")) {
                    if (C42000Ge4.LJIILIIL(editModel)) {
                        LIZ(interfaceC143655kP, textStickerData, i, size, arrayList, osz, recommendTitleMap);
                        InterfaceC139045cy LIZ3 = interfaceC142515iZ.vF().LIZ();
                        if (LIZ3 != null) {
                            C139055cz.LIZ(LIZ3, textStickerData, true, r8, 4);
                        }
                    } else {
                        StickerItemModel stickerItemModel = new StickerItemModel();
                        stickerItemModel.type = 2;
                        stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
                        infoStickerModel.stickers.add(stickerItemModel);
                        if (i == size - 1 && C68W.LJIIJJI(textStickerData.getTextWrapList())) {
                            C63D LIZ4 = interfaceC142515iZ.PI().LIZ();
                            if (LIZ4 != null) {
                                LIZ4.b1(infoStickerModel);
                            }
                        } else if (!C68W.LJIIJJI(textStickerData.getTextWrapList())) {
                            LIZ(interfaceC143655kP, textStickerData, i, size, arrayList, osz, recommendTitleMap);
                            textStickerData.setFontSize(28);
                            C137045Zk.LJ(context, interfaceC143655kP, "AutoCutReLoadTextSticker", textStickerData, new C5V9(textStickerData, stickerItemModel, i, size, interfaceC142515iZ, infoStickerModel));
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("AutoCutReLoadTextSticker addToProcessSplitTextTask fontType: ");
                            LIZ5.append(textStickerData.getFontType());
                            LIZ5.append(" text ");
                            LIZ5.append(textStickerData.getTextStr());
                            H78.LJI(X1D.LIZIZ(LIZ5));
                        }
                    }
                }
                i = i2;
                r8 = 0;
            } else {
                C47261Igj.LJJJJJ();
                throw r8;
            }
        }
    }

    public static void LIZ(InterfaceC143655kP interfaceC143655kP, TextStickerData textStickerData, int i, int i2, List list, OSZ osz, java.util.Map map) {
        Typeface LJIILL;
        InterfaceC153045zY value = interfaceC143655kP.Kh().getValue();
        if (value == null || o.LJ(textStickerData.getType(), "type_inline_caption")) {
            return;
        }
        Effect LIZ2 = ((C5WP) C45161Hnx.LIZ.getValue()).LIZ("textfont", textStickerData.getFontResId());
        if (LIZ2 != null) {
            C68M LJIIJ = C68M.LJIIJ();
            LJIIJ.getClass();
            try {
                TextFontStyleData textFontStyleData = (TextFontStyleData) GsonProtectorUtils.fromJson(C6PB.LIZIZ(), LIZ2.getExtra(), TextFontStyleData.class);
                if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                    if (((ConcurrentHashMap) LJIIJ.LIZIZ).get(textFontStyleData.fileName) == null && !TextUtils.isEmpty(LIZ2.getUnzipPath())) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZ2.getUnzipPath());
                        String str = File.separator;
                        LIZ3.append(str);
                        LIZ3.append(textFontStyleData.fileName);
                        Typeface LJIILL2 = C68M.LJIILL(X1D.LIZIZ(LIZ3));
                        if (LJIILL2 != null) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(LIZ2.getUnzipPath());
                            LIZ4.append(str);
                            LIZ4.append(textFontStyleData.fileName);
                            textFontStyleData.LIZ = X1D.LIZIZ(LIZ4);
                            textFontStyleData.LIZIZ = 1;
                            ((ConcurrentHashMap) LJIIJ.LIZIZ).put(textFontStyleData.fileName, LJIILL2);
                            LJIIJ.LIZ(textFontStyleData, LIZ2);
                            C68M.LJIILLIIL(textFontStyleData, true, null);
                        } else {
                            File[] listFiles = new File(LIZ2.getUnzipPath()).listFiles();
                            if (listFiles != null) {
                                int length = listFiles.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    File file = listFiles[i3];
                                    if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (LJIILL = C68M.LJIILL(file.getAbsolutePath())) != null) {
                                        textFontStyleData.LIZ = file.getAbsolutePath();
                                        textFontStyleData.LIZIZ = 1;
                                        ((ConcurrentHashMap) LJIIJ.LIZIZ).put(textFontStyleData.fileName, LJIILL);
                                        LJIIJ.LIZ(textFontStyleData, LIZ2);
                                        C68M.LJIILLIIL(textFontStyleData, true, null);
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("parseTextFontStyleData err: ");
                LIZ5.append(e.getMessage());
                H7B.LIZJ(X1D.LIZIZ(LIZ5));
                C16880lQ.LLLLIIL(e);
            }
        }
        int i4 = value.LLILZ().width;
        int i5 = value.LLILZ().height;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append('(');
        float f = i4;
        LIZ6.append(textStickerData.getX() * f);
        LIZ6.append(", ");
        float f2 = i5;
        LIZ6.append(textStickerData.getY() * f2);
        LIZ6.append(')');
        ((ArrayList) list).add(C1XY.LIZIZ(textStickerData, X1D.LIZIZ(LIZ6)));
        if (i == i2 - 1) {
            map.put(osz, list);
        }
        textStickerData.setX(textStickerData.getX() * f);
        textStickerData.setY(textStickerData.getY() * f2);
    }
}
