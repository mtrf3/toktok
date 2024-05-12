package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.e1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132385Hm {
    public static C136695Yb LIZ;
    public static C55W LIZIZ;
    public static String LIZJ;
    public static AVMusic LIZLLL;
    public static boolean LJ;
    public static String LJFF = "";
    public static Float LJI;
    public static C156916Dv LJII;
    public static boolean LJIIIIZZ;
    public static C122034qd LJIIIZ;

    public static boolean LJFF(NLEModel nLEModel) {
        boolean z;
        String extra;
        NLESegment LJI2;
        List LIZ2 = C120734oX.LIZ(nLEModel);
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ3 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                LIZ3.add(next);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = LIZ3.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILL(), arrayList);
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                NLETrackSlot it4 = (NLETrackSlot) it3.next();
                o.LJIIIIZZ(it4, "it");
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, it4.LJI());
                if (nLESegmentAudio != null && nLESegmentAudio.LJIILJJIL() > 0.0f) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrackSlot> it5 = LJIILL.iterator();
            while (it5.hasNext()) {
                NLETrackSlot next2 = it5.next();
                NLETrackSlot nLETrackSlot = next2;
                if (!nLETrackSlot.hasExtra("extra_identity_key") || (extra = nLETrackSlot.getExtra("extra_identity_key")) == null || extra.length() == 0) {
                    NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI());
                    if (nLESegmentAudio2 != null && nLESegmentAudio2.LJIILJJIL() > 0.0f) {
                        arrayList2.add(next2);
                    }
                } else if (C124574uj.LJJIJIIJI(nLETrackSlot) && (LJI2 = nLETrackSlot.LJI()) != null && C124574uj.LJJIIZI(LJI2) > 0.0f) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                return true;
            }
        }
        if ((!((ArrayList) LIZ2).isEmpty()) || z) {
            return true;
        }
        return false;
    }

    public static boolean LJI(NLEEditor nLEEditor) {
        NLESegment nLESegment;
        Object obj;
        NLETrackSlot LJIILIIL;
        if (nLEEditor == null) {
            return false;
        }
        Iterator LIZJ2 = C141415gn.LIZJ(nLEEditor, "editor.model.tracks");
        while (true) {
            nLESegment = null;
            if (LIZJ2.hasNext()) {
                obj = LIZJ2.next();
                if (((NLETrack) obj).LJIIJ()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null && (LJIILIIL = nLETrack.LJIILIIL(0)) != null) {
            nLESegment = LJIILIIL.LJI();
        }
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
        if (LJJ == null || LJJ.LJJI() == null) {
            return false;
        }
        return true;
    }

    public static boolean LJII(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        EditorProModel editorProModel = model.getEditorProModel();
        if (editorProModel == null) {
            return false;
        }
        if (model.isRetakeVideo()) {
            return editorProModel.isAdvancedEditDraft();
        }
        if (!model.mIsFromDraft || !editorProModel.isAdvancedEditDraft()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!C127694zl.LIZ) {
            return false;
        }
        if (H7R.LJJJJI(model)) {
            C132465Hu.LIZ.getClass();
            if (!C132465Hu.LIZ(model)) {
                return false;
            }
        } else if (!e1.LIZ(31744, "studio_editor_pro_enable_photo_canvas", true, false) || !C145805ns.LIZ()) {
            return false;
        }
        return true;
    }

    public static NLETrackSlot LJIIL(EditorProContext editorContext) {
        Object obj;
        o.LJIIIZ(editorContext, "editorContext");
        Iterator it = ((ArrayList) C124574uj.LJII(C79057V0z.LJJI(editorContext))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                NLETrack nLETrack = (NLETrack) obj;
                if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack2 = (NLETrack) obj;
        if (nLETrack2 == null || nLETrack2.LJIILLIIL().size() == 0) {
            return null;
        }
        return nLETrack2.LJIILLIIL().get(0);
    }

    public static NLETrack LJIILIIL(EditorProContext editorContext) {
        Object obj;
        o.LJIIIZ(editorContext, "editorContext");
        Iterator it = ((ArrayList) C124574uj.LJII(C79057V0z.LJJI(editorContext))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                NLETrack nLETrack = (NLETrack) obj;
                if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NLETrack) obj;
    }

    public static void LIZJ(NLEModel nLEModel, boolean z) {
        Iterator LIZJ2 = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (LIZJ2.hasNext()) {
            NLETrack it = (NLETrack) LIZJ2.next();
            o.LJIIIIZZ(it, "it");
            if (C124574uj.LJJIJIL(it)) {
                it.setEnable(z);
            }
            if (o.LJ(it.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                it.setEnable(!z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0114, code lost:
    
        if ((!r5.isEmpty()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r14, com.bytedance.ies.nle.editor_jni.NLEModel r15) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132385Hm.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }

    public static void LJ(MagicCombineEffectModel magicCombineEffectModel, NLEModel nLEModel) {
        NLESegmentEffect LIZIZ2;
        String str;
        o.LJIIIZ(magicCombineEffectModel, "magicCombineEffectModel");
        magicCombineEffectModel.magicCombineEffectModelList.clear();
        Iterator<NLETrackSlot> it = nLEModel.getMainTrack().LJIILL().iterator();
        while (it.hasNext()) {
            Iterator<NLEVideoEffect> it2 = it.next().LJIIJ().iterator();
            while (it2.hasNext()) {
                NLEVideoEffect effect = it2.next();
                o.LJIIIIZZ(effect, "effect");
                if (C124614un.LJIIJ(effect) && C124614un.LJIIIZ(effect) && (LIZIZ2 = effect.LIZIZ()) != null && LIZIZ2.hasExtra("magic_effect_id")) {
                    String combineEffectId = LIZIZ2.getExtra("magic_effect_id");
                    if (!TextUtils.isEmpty(combineEffectId)) {
                        CombineEffectPointModel combineEffectPointModel = new CombineEffectPointModel();
                        o.LJIIIIZZ(combineEffectId, "combineEffectId");
                        combineEffectPointModel.setKey(combineEffectId);
                        NLEResourceNode LJ2 = LIZIZ2.LJ();
                        String str2 = "";
                        if (LJ2 == null || (str = LJ2.LIZJ()) == null) {
                            str = "";
                        }
                        combineEffectPointModel.setResDir(str);
                        String NLESegmentEffect_getEffectName = NLEEditorJniJNI.NLESegmentEffect_getEffectName(LIZIZ2.LIZJ, LIZIZ2);
                        if (NLESegmentEffect_getEffectName != null) {
                            str2 = NLESegmentEffect_getEffectName;
                        }
                        combineEffectPointModel.setName(str2);
                        magicCombineEffectModel.magicCombineEffectModelList.add(combineEffectPointModel);
                    }
                }
            }
        }
    }

    public static void LJIIIZ(NLEModel nLEModel, String str) {
        NLEEditor nLEEditor;
        InterfaceC126684y8 interfaceC126684y8;
        C5J1 V8;
        InterfaceC126684y8 interfaceC126684y82;
        C122034qd c122034qd = LJIIIZ;
        if (c122034qd == null || (nLEEditor = c122034qd.LJIIJ) == null || (interfaceC126684y8 = c122034qd.LJIIJJI) == null || (V8 = interfaceC126684y8.V8()) == null) {
            return;
        }
        C122034qd c122034qd2 = LJIIIZ;
        if (c122034qd2 != null && (interfaceC126684y82 = c122034qd2.LJIIJJI) != null) {
            interfaceC126684y82.T8(nLEEditor);
        }
        if (!TextUtils.isEmpty(str) && nLEModel != null) {
            nLEEditor.LJII(NLEModel.dynamicCast(nLEModel.deepClone(false)));
            nLEEditor.LIZIZ();
        }
        V8.LJIJ(0L, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek);
    }

    public static void LJIIJ(String str, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        NLETrack LJIILIIL = LJIILIIL(editorContext);
        if (LJIILIIL != null) {
            if (str == null) {
                str = "";
            }
            LJIILIIL.setExtra("music_origin_for_mod", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        r4 = ((java.util.ArrayList) r15).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (r4.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        r2 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        if (kotlin.jvm.internal.o.LJ(((X.C122334r7) r2).LIZ, r3.getUUID()) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        r2 = (X.C122334r7) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        if (r2 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        r1 = r3.LJI().getExtra("nle_extra_resource_id");
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "slot.mainSegment.getExtr…nt.NLE_EXTRA_RESOURCE_ID)");
        r2.LJIIL = r1;
        r2 = X.C5LQ.LIZ(r2, r7, r10);
        r4 = new X.C5RT();
        r4.LJIIJJI = r2.getResDir();
        r4.LJIIL = r2.getKey();
        r4.LJIILJJIL = r2.getName();
        r4.LJIIIIZZ = r2.getSelectedColor();
        r4.LJIILLIIL = r2.getCategory();
        r4.LJIILL = r2.getDuration();
        r4.LJIIZILJ = r2.getExtra();
        r4.LJ = r2.getUiStartPoint();
        r4.LIZJ = r2.getUiStartPoint();
        r4.LJFF = r2.getUiEndPoint();
        r1 = r2.getUuid();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "model.uuid");
        r4.LIZIZ = new java.lang.String[]{r1};
        r4.LJIJI = r2.getIsNewEngineEffect();
        r4.LJIJ = r2.getAdjustParams();
        r4.LJIILIIL = r2.getResourceId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0173, code lost:
    
        if (X.C132425Hq.LIZ() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017d, code lost:
    
        if (X.C164996dj.LIZIZ(r2.getCategory()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017f, code lost:
    
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        r4.LJI = r0;
        r4.LJII = r7;
        r4.LJIJJ = false;
        r9.setValue(r4);
        r0 = r2.getEndPoint();
        r4 = r3.getUUID();
        kotlin.jvm.internal.o.LJIIIIZZ(r4, "slot.uuid");
        r3 = X.C5RT.LIZJ(r0);
        r3.LJFF = r0;
        r3.LJII = r7;
        r3.LIZIZ = new java.lang.String[]{r4};
        r3.LJIJJ = false;
        r9.setValue(r3);
        r8.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b1, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b3, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C122034qd r24, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25, X.InterfaceC142545ic r26) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132385Hm.LIZ(X.4qd, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.5ic):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.bytedance.ies.nle.editor_jni.NLEEditor r18, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r19, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r20, X.InterfaceC145495nN r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132385Hm.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.5nN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x07d6, code lost:
    
        if ((!r2) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v6, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r8v11, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(X.WM7 r28, X.C122034qd r29, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r30, android.widget.FrameLayout.LayoutParams r31, java.util.List r32, X.C132045Ge r33, X.InterfaceC136115Vv r34) {
        /*
            Method dump skipped, instructions count: 2957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132385Hm.LJIIJJI(X.WM7, X.4qd, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.widget.FrameLayout$LayoutParams, java.util.List, X.5Ge, X.5Vv):void");
    }
}
