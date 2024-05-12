package X;

import Y.ACallableS8S1400000_2;
import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.smartmovie.jni.CompressMetaCallback;
import com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.ItemCrop;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS11S0500000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5oG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146045oG {
    public static final C146045oG LIZ = new C146045oG();
    public static final java.util.Map<CutSource, VecMeta> LIZIZ = new LinkedHashMap();

    public static void LJ(VecMeta vecMeta) {
        if (vecMeta.isEmpty()) {
            return;
        }
        if (vecMeta.size() > 1) {
            Iterator<Meta> it = vecMeta.iterator();
            while (it.hasNext()) {
                Meta next = it.next();
                next.LJI(Math.min(10000L, next.LIZIZ()));
            }
            return;
        }
        Meta meta = (Meta) ORZ.LJLLLL(vecMeta);
        if (meta != null) {
            meta.LJI(Math.min(100000L, meta.LIZIZ()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static void LIZIZ(Context context, NLETemplateModel nLETemplateModel, List list) {
        VecNLETrackSlotSPtr nleSlots;
        ?? LLILLL;
        Object obj;
        boolean z;
        float LJJJI;
        ItemCrop LIZ2;
        o.LJIIIZ(context, "context");
        if (nLETemplateModel != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty() || (nleSlots = nLETemplateModel.getMutableAssetItems()) == null || nleSlots.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            if (((Boolean) C146055oH.LIZ.getValue()).booleanValue()) {
                o.LJIIIIZZ(nleSlots, "nleSlots");
                ?? arrayList3 = new ArrayList();
                Iterator<NLETrackSlot> it = nleSlots.iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (NLESegmentVideo.LJJ(next.LJI()) != null) {
                        arrayList3.add(next);
                    }
                }
                nleSlots = arrayList3;
            } else {
                o.LJIIIIZZ(nleSlots, "{\n            nleSlots\n        }");
            }
            Iterator<NLETrackSlot> it2 = nleSlots.iterator();
            int i = 0;
            while (true) {
                long j = 0;
                Throwable th = null;
                if (it2.hasNext()) {
                    NLETrackSlot next2 = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next2.LJI());
                        if (LJJ != null) {
                            C5SB c5sb = (C5SB) ListProtector.get(list, i % arrayList.size());
                            arrayList2.add(c5sb);
                            String str = c5sb.LIZ;
                            long NLESegmentVideo_getClip = NLEEditorJniJNI.NLESegmentVideo_getClip(LJJ.LJ, LJJ);
                            if (NLESegmentVideo_getClip == 0) {
                                NLEStyCrop LJJIFFI = LJJ.LJJIFFI();
                                if (LJJIFFI != null) {
                                    LIZ2 = C120644oO.LIZJ(LJJIFFI);
                                } else {
                                    LIZ2 = C120644oO.LIZ(new NLEStyClip());
                                }
                            } else {
                                LIZ2 = C120644oO.LIZ(new NLEStyClip(NLESegmentVideo_getClip));
                            }
                            String alignMode = nLETemplateModel.getAlignMode();
                            o.LJIIIIZZ(alignMode, "model.alignMode");
                            ItemCrop LIZIZ2 = C120644oO.LIZIZ(context, LIZ2, alignMode, str, (int) LJJ.LIZIZ().LJI(), (int) LJJ.LIZIZ().LIZIZ());
                            StringBuilder LIZIZ3 = C07780Sg.LIZIZ("AutoCutTemplateUtils insertMediaItems: compress path = ", str, "，alignMode = ");
                            LIZIZ3.append(nLETemplateModel.getAlignMode());
                            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, LIZIZ3.toString());
                            LJJ.LIZIZ().LJIIIZ(str);
                            NLEStyClip LJ = C120644oO.LJ(LIZIZ2);
                            NLEEditorJniJNI.NLESegmentVideo_setClip(LJJ.LJ, LJJ, LJ.LIZ, LJ);
                            LJJ.LJJIIJ(C120644oO.LJFF(LIZIZ2));
                            LJJ.setExtra("is_mutable", "true");
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                } else {
                    VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                    if (tracks != null) {
                        Iterator<NLETrack> it3 = tracks.iterator();
                        while (it3.hasNext()) {
                            NLETrack track = it3.next();
                            o.LJIIIIZZ(track, "track");
                            if (o.LJ(C77357UXp.LJIILL(track), "cutsame")) {
                                Iterator<NLETrackSlot> it4 = track.LJIILL().iterator();
                                while (it4.hasNext()) {
                                    NLETrackSlot slot = it4.next();
                                    o.LJIIIIZZ(slot, "slot");
                                    NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(slot.LJI());
                                    if (LJJ2 != null) {
                                        if (LJJ2.LJIILJJIL() == 0.0f) {
                                            String audioType = EnumC122254qz.CUTSAME_MUTE.name();
                                            o.LJIIIZ(audioType, "audioType");
                                            slot.setExtra("AudioTrackType", audioType);
                                        }
                                        if (o.LJ(LJJ2.getExtra("is_mutable"), "true")) {
                                            LJJ2.LJIL(0.0f);
                                            String audioType2 = EnumC122254qz.CUTSAME_USER.name();
                                            o.LJIIIZ(audioType2, "audioType");
                                            slot.setExtra("AudioTrackType", audioType2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (((Boolean) C146055oH.LIZ.getValue()).booleanValue()) {
                        VecNLETrackSlotSPtr mutableAssetItems = nLETemplateModel.getMutableAssetItems();
                        o.LJIIIIZZ(mutableAssetItems, "nleTemplateModel.mutableAssetItems");
                        LLILLL = new ArrayList();
                        Iterator<NLETrackSlot> it5 = mutableAssetItems.iterator();
                        while (it5.hasNext()) {
                            NLETrackSlot next3 = it5.next();
                            if (NLESegmentVideo.LJJ(next3.LJI()) != null) {
                                LLILLL.add(next3);
                            }
                        }
                    } else {
                        VecNLETrackSlotSPtr mutableAssetItems2 = nLETemplateModel.getMutableAssetItems();
                        o.LJIIIIZZ(mutableAssetItems2, "nleTemplateModel.mutableAssetItems");
                        LLILLL = ORZ.LLILLL(mutableAssetItems2, arrayList2.size());
                    }
                    int i3 = 0;
                    for (Object obj2 : LLILLL) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            NLESegmentVideo LJJ3 = NLESegmentVideo.LJJ(((NLETrackSlot) obj2).LJI());
                            if (LJJ3 != null) {
                                C5SB c5sb2 = (C5SB) ListProtector.get(arrayList2, i3);
                                NLEResourceNode LIZIZ4 = LJJ3.LIZIZ();
                                if (LIZIZ4 != null) {
                                    LIZIZ4.LJIIIZ(c5sb2.LIZ);
                                }
                                NLEResourceNode LIZIZ5 = LJJ3.LIZIZ();
                                if (LIZIZ5 != null) {
                                    LIZIZ5.LJIILIIL(c5sb2.LIZIZ);
                                }
                                NLEResourceNode LIZIZ6 = LJJ3.LIZIZ();
                                if (LIZIZ6 != null) {
                                    LIZIZ6.setDuration(C78926UyI.LJJJI(c5sb2.LIZJ));
                                }
                                ?? LIZ3 = X1D.LIZ();
                                LIZ3.append("AutoCutTemplate adjustSourceSpeed: resType = ");
                                NLEResourceNode LIZIZ7 = LJJ3.LIZIZ();
                                if (LIZIZ7 != null) {
                                    obj = LIZIZ7.LJFF();
                                } else {
                                    obj = th;
                                }
                                LIZ3.append(obj);
                                LIZ3.append(", resFile = ");
                                NLEResourceNode LIZIZ8 = LJJ3.LIZIZ();
                                ?? r4 = th;
                                if (LIZIZ8 != null) {
                                    r4 = LIZIZ8.LIZJ();
                                }
                                LIZ3.append(r4);
                                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
                                long LJIIL = LJJ3.LJIIL() - LJJ3.LJIILIIL();
                                if (LJIIL > j) {
                                    if (c5sb2.LIZJ < C78926UyI.LJJIZ(LJIIL)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    boolean z2 = !LJJ3.LJI().isEmpty();
                                    long j2 = c5sb2.LIZJ;
                                    if (j2 == j) {
                                        LJJJI = 1.0f;
                                    } else {
                                        LJJJI = ((float) C78926UyI.LJJJI(j2)) / ((float) LJIIL);
                                    }
                                    if (z2) {
                                        if (z) {
                                            double LJFF = LJJJI / LJJ3.LJFF();
                                            VecNLEPointSPtr vecNLEPointSPtr = new VecNLEPointSPtr();
                                            Iterator<NLEPoint> it6 = LJJ3.LJI().iterator();
                                            while (it6.hasNext()) {
                                                NLEPoint next4 = it6.next();
                                                NLEPoint nLEPoint = new NLEPoint();
                                                nLEPoint.LIZIZ(NLEEditorJniJNI.NLEPoint_getX(next4.LIZ, next4));
                                                double d = 100;
                                                nLEPoint.LIZJ((float) C7MY.LIZ(NLEEditorJniJNI.NLEPoint_getY(next4.LIZ, next4) * LJFF, d, 0.5d, d));
                                                vecNLEPointSPtr.LIZJ(nLEPoint);
                                            }
                                            NLEEditorJniJNI.NLESegmentAudio_setCurveSpeedPoints(LJJ3.LIZJ, LJJ3, vecNLEPointSPtr.LJLIL, vecNLEPointSPtr);
                                            LJJ3.setSpeed(1.0f);
                                            j = 0;
                                            LJJ3.LJIJJLI(0L);
                                            long j3 = c5sb2.LIZJ;
                                            if (j3 != 0) {
                                                LJIIL = C78926UyI.LJJJI(j3);
                                            }
                                            LJJ3.LJIJJ(LJIIL);
                                        }
                                        LJJ3.LJIJJLI(j);
                                        LJJ3.LJIJJ(LJIIL);
                                    } else {
                                        if (z) {
                                            LJJ3.LJIJJLI(j);
                                            long j4 = c5sb2.LIZJ;
                                            if (j4 != j) {
                                                LJIIL = C78926UyI.LJJJI(j4);
                                            }
                                            LJJ3.LJIJJ(LJIIL);
                                            LJJ3.setSpeed(LJJJI);
                                        }
                                        LJJ3.LJIJJLI(j);
                                        LJJ3.LJIJJ(LJIIL);
                                    }
                                }
                            }
                            th = null;
                            i3 = i4;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw th;
                        }
                    }
                    return;
                }
            }
        }
    }

    public static void LIZ(CutSource cutSource, Context context, String str, NLEPrepareListener nLEPrepareListener, ICutReporter iCutReporter) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutTemplateUtils, fetchTemplateResource[] value = ");
        LIZ2.append(cutSource.value);
        LIZ2.append(", md5 = ");
        LIZ2.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
        if (cutSource.value.length() == 0) {
            nLEPrepareListener.onError(-1, "empty url");
            return;
        }
        NLETemplateSource nLETemplateSource = new NLETemplateSource(context, cutSource, str);
        nLETemplateSource.LJ(new C82876Wfo(new C82869Wfh(context)));
        nLETemplateSource.LJI((NLEModelDownloader) C45161Hnx.LJII.getValue());
        nLETemplateSource.LJFF(iCutReporter);
        nLETemplateSource.LIZ(nLEPrepareListener);
        nLETemplateSource.LIZJ();
    }

    public final synchronized void LIZLLL(CutSource cutSource, NLETemplateModel nLETemplateModel, Context context, List<? extends Meta> list, C45131HnT c45131HnT) {
        EnumC123874tb enumC123874tb;
        if (nLETemplateModel == null || list == null) {
            return;
        }
        java.util.Map<CutSource, VecMeta> map = LIZIZ;
        map.remove(cutSource);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutTemplateUtils template source response templateMetaMap size=");
        LIZ2.append(map.size());
        C45049Hm9.LIZ(LogLevel.LEVEL_DEBUG, X1D.LIZIZ(LIZ2));
        for (Meta meta : list) {
            if (!C44687HgJ.LIZIZ(meta.LIZLLL())) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AutoCutTemplateUtils -----------prepareTemplateSource: fail, checkCompress error, path = ");
                LIZ3.append(meta.LIZLLL());
                C45049Hm9.LIZ(LogLevel.LEVEL_ERROR, X1D.LIZIZ(LIZ3));
                c45131HnT.onFailure("", SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "checkCompress error", new UnorderedMapStrStr());
                return;
            }
        }
        for (InterfaceC45209Hoj interfaceC45209Hoj : c45131HnT.LIZ) {
            if (interfaceC45209Hoj != null) {
                interfaceC45209Hoj.LJFF("fill_media");
            }
        }
        C45087Hml.LJII(nLETemplateModel);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (Meta meta2 : list) {
            String LIZLLL = meta2.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "it.path");
            if (meta2.LJFF()) {
                enumC123874tb = EnumC123874tb.VIDEO;
            } else {
                enumC123874tb = EnumC123874tb.IMAGE;
            }
            arrayList.add(new C5SB(LIZLLL, enumC123874tb, meta2.LIZIZ(), 1.0f, 0L, meta2.LIZIZ()));
        }
        LIZIZ(context, nLETemplateModel, arrayList);
        NLEModel saveToDraft = NLETemplateModel.saveToDraft(nLETemplateModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateUtils -----------prepareTemplateSource: end ------------");
        for (InterfaceC45209Hoj interfaceC45209Hoj2 : c45131HnT.LIZ) {
            if (interfaceC45209Hoj2 != null) {
                interfaceC45209Hoj2.LJIIJ("fill_media");
            }
        }
        c45131HnT.onSuccess(saveToDraft, new UnorderedMapStrStr());
    }

    public static void LIZJ(final Context context, final CutSource cutSource, String str, final VecMeta vecMeta, final String str2, final C45131HnT c45131HnT, final String templateId) {
        o.LJIIIZ(templateId, "templateId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutTemplateUtils ----------- prepareTemplateSource: start, templateId = ");
        LIZ2.append(templateId);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
        final C68322mC c68322mC = new C68322mC();
        final C68322mC c68322mC2 = new C68322mC();
        LIZIZ.put(cutSource, vecMeta);
        LIZ(cutSource, context, str, new NLEPrepareListener() { // from class: X.5oM
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                int i;
                VecNLETrackSlotSPtr mutableAssetItems;
                C45131HnT.this.onResponse(nLETemplateModel, new UnorderedMapStrStr());
                for (InterfaceC45209Hoj interfaceC45209Hoj : C45131HnT.this.LIZ) {
                    if (interfaceC45209Hoj != null) {
                        interfaceC45209Hoj.LJFF("compress");
                    }
                }
                VecMeta vecMeta2 = vecMeta;
                if (nLETemplateModel != null && (mutableAssetItems = nLETemplateModel.getMutableAssetItems()) != null) {
                    i = mutableAssetItems.size();
                } else {
                    i = 0;
                }
                List LLILLL = ORZ.LLILLL(vecMeta2, i);
                String str3 = str2;
                final AqS11S0500000_2 aqS11S0500000_2 = new AqS11S0500000_2(C45131HnT.this, (C45131HnT) c68322mC2, (C68322mC<List<Meta>>) cutSource, (CutSource) c68322mC, (C68322mC<NLETemplateModel>) context, (Context) 2);
                final AqS184S0100000_2 aqS184S0100000_2 = new AqS184S0100000_2(C45131HnT.this, 68);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AutoCutTemplateUtils startCompressMeta: metaList size = ");
                LIZ3.append(LLILLL.size());
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
                if (e1.LIZ(31744, "autocut_enable_cc_compress_opt", true, false)) {
                    VecMeta vecMeta3 = new VecMeta();
                    Iterator it = LLILLL.iterator();
                    while (it.hasNext()) {
                        vecMeta3.LIZJ((Meta) it.next());
                    }
                    C45154Hnq c45154Hnq = C45154Hnq.LIZJ;
                    CompressMetaCallback compressMetaCallback = new CompressMetaCallback() { // from class: X.5oO
                        @Override // com.bytedance.ies.smartmovie.jni.CompressMetaCallback
                        public final void onSuccess(VecMeta vecMeta4) {
                            Integer num;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("AutoCutTemplateUtils startCompressMeta: compressMeta onSuccess size = ");
                            if (vecMeta4 != null) {
                                num = Integer.valueOf(vecMeta4.size());
                            } else {
                                num = null;
                            }
                            LIZ4.append(num);
                            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ4));
                            aqS11S0500000_2.invoke(vecMeta4);
                        }

                        @Override // com.bytedance.ies.smartmovie.jni.CompressMetaCallback
                        public final void onFailure(int i2, String str4, UnorderedMapStrStr unorderedMapStrStr) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("AutoCutTemplateUtils startCompressMeta: compressMeta onFailure code=");
                            LIZ4.append(i2);
                            LIZ4.append(", msg=");
                            LIZ4.append(str4);
                            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ4));
                            aqS184S0100000_2.invoke(Integer.valueOf(i2), str4);
                        }
                    };
                    c45154Hnq.getClass();
                    C45154Hnq.LIZIZ(vecMeta3, str3, compressMetaCallback);
                } else {
                    VecMeta vecMeta4 = new VecMeta();
                    Iterator it2 = LLILLL.iterator();
                    while (it2.hasNext()) {
                        vecMeta4.LIZJ(((IMetaInfoDelegate) C45161Hnx.LJ.getValue()).getCompressMetaInfo((Meta) it2.next(), str3));
                    }
                    C10K.LIZJ(new ACallableS8S1400000_2(LLILLL, aqS11S0500000_2, vecMeta4, str3, aqS184S0100000_2, 1));
                }
                for (InterfaceC45209Hoj interfaceC45209Hoj2 : C45131HnT.this.LIZ) {
                    if (interfaceC45209Hoj2 != null) {
                        interfaceC45209Hoj2.LJFF("download_effect");
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                for (InterfaceC45209Hoj interfaceC45209Hoj : C45131HnT.this.LIZ) {
                    if (interfaceC45209Hoj != null) {
                        interfaceC45209Hoj.LJIIJ("download_effect");
                    }
                }
                c68322mC.element = nLETemplateModel;
                if (nLETemplateModel == 0 || nLETemplateModel.getMainTrack() == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("AutoCutTemplateUtils checkAutoCutNLE: templateId=");
                    LIZ3.append(templateId);
                    LIZ3.append(", cutSource=");
                    C45243HpH.LIZIZ(LIZ3, cutSource.value, LIZ3);
                }
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateUtils template source prepare onSuccess");
                C146045oG.LIZ.LIZLLL(cutSource, c68322mC.element, context, c68322mC2.element, C45131HnT.this);
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i, String str3) {
                java.util.Map<CutSource, VecMeta> map = C146045oG.LIZIZ;
                map.remove(cutSource);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AutoCutTemplateUtils template source prepare compress onFailure: code = ");
                LIZ3.append(i);
                LIZ3.append(", msg = ");
                LIZ3.append(str3);
                LIZ3.append(", templateMetaMap size=");
                LIZ3.append(map.size());
                C45049Hm9.LIZ(LogLevel.LEVEL_ERROR, X1D.LIZIZ(LIZ3));
                C45131HnT.this.LIZIZ(SmartMovieErrorCode.HANDLE_TEMPLATE_FAILURE.swigValue(), i, str3);
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str3) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AutoCutTemplateUtils template source prepare onProgress: ");
                LIZ3.append(f);
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
                C45131HnT.this.onFetchProgress(f);
            }
        }, new BinderC172246pQ("autocut_capcut", templateId, 4));
    }
}
