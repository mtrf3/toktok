package X;

import Y.IDComparatorS30S0000000_2;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124614un {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrack LIZ(NLEModel nLEModel) {
        int i;
        if (C124574uj.LJIILIIL(nLEModel).isEmpty()) {
            i = 0;
        } else {
            Iterator<NLETrack> it = C124574uj.LJIILIIL(nLEModel).iterator();
            if (it.hasNext()) {
                int layer = it.next().getLayer();
                while (it.hasNext()) {
                    int layer2 = it.next().getLayer();
                    if (layer < layer2) {
                        layer = layer2;
                    }
                }
                i = layer + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.LJJ(false);
        nLETrack.setLayer(i);
        C124574uj.LJJLIIIJILLIZJL(nLETrack, "video_effect");
        nLETrack.LJIL(EnumC123864ta.EFFECT);
        nLETrack.setExtra("EffectTrackType", "NORMAL");
        C124574uj.LJJLI(nLETrack);
        nLEModel.addTrack(nLETrack);
        return nLETrack;
    }

    public static void LIZJ(InterfaceC124924vI editorContext) {
        long j;
        o.LJIIIZ(editorContext, "editorContext");
        NLEModel LJJI = C79057V0z.LJJI(editorContext);
        NLETrack mainTrack = LJJI.getMainTrack();
        if (mainTrack != null) {
            j = mainTrack.LJIIJJI();
        } else {
            j = 0;
        }
        Iterator LIZJ = t1.LIZJ(LJJI, "nleModel.tracks");
        while (LIZJ.hasNext()) {
            NLETrack nLETrack = (NLETrack) LIZJ.next();
            if (!nLETrack.LJIIJ() && !C124574uj.LJJJJIZL(nLETrack) && !C124574uj.LJJJZ(nLETrack)) {
                Iterator<T> it = ORS.LJJLIIIJL(nLETrack.LJIILL()).iterator();
                while (it.hasNext()) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) it.next();
                    if (((int) nLETrackSlot.getEndTime()) != -2 && nLETrackSlot.getEndTime() > j) {
                        if (nLETrackSlot.getStartTime() > j) {
                            if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                                C79057V0z.LJJJJL(editorContext, "value_black_slot_delete_music", C76800UCe.LIZ);
                            } else {
                                nLETrack.LJIJJLI(nLETrackSlot);
                                LIZLLL(C79057V0z.LJJI(editorContext), C79057V0z.LJJIJIL(nLETrack));
                            }
                        } else {
                            NLESegment LJI = nLETrackSlot.LJI();
                            o.LJIIIIZZ(LJI, "slot.mainSegment");
                            long endTime = ((float) (nLETrackSlot.getEndTime() - j)) * C124574uj.LJJI(LJI);
                            nLETrackSlot.setEndTime(j);
                            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                            if (LIZLLL != null) {
                                LIZLLL.LJIJJ(LIZLLL.LJIIL() - endTime);
                                if (LIZLLL.LJIIL() - LIZLLL.LJIILIIL() < 100000) {
                                    nLETrack.LJIJJLI(nLETrackSlot);
                                    LIZLLL(C79057V0z.LJJI(editorContext), C79057V0z.LJJIJIL(nLETrack));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static int LJII(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                LIZ2.add(next);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = LIZ2.iterator();
        while (it3.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it3.next()).LJIILL(), arrayList);
        }
        Iterator it4 = arrayList.iterator();
        int i = 0;
        while (it4.hasNext()) {
            NLENode nLENode = (NLENode) it4.next();
            if (nLENode.hasExtra("audio_record_order")) {
                String extra = nLENode.getExtra("audio_record_order");
                o.LJIIIIZZ(extra, "it.getExtra(AUDIO_RECORD_ORDER)");
                i = Math.max(CastIntegerProtector.parseInt(extra), i);
            }
        }
        return i;
    }

    public static NLEResourceAV LJIIIIZZ(NLETrackSlot slot) {
        NLESegment LJI;
        NLERenderProxySegment LIZLLL;
        o.LJIIIZ(slot, "slot");
        NLETrackSlot LJIIIIZZ = slot.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJI = LJIIIIZZ.LJI()) != null && (LIZLLL = NLERenderProxySegment.LIZLLL(LJI)) != null) {
            return LIZLLL.LJ();
        }
        return null;
    }

    public static boolean LJIIIZ(NLEVideoEffect nLEVideoEffect) {
        NLESegmentEffect LIZIZ;
        String NLESegmentEffect_getJsonParam;
        if (!LJIIJ(nLEVideoEffect) || (LIZIZ = nLEVideoEffect.LIZIZ()) == null || (NLESegmentEffect_getJsonParam = NLEEditorJniJNI.NLESegmentEffect_getJsonParam(LIZIZ.LIZJ, LIZIZ)) == null || TextUtils.isEmpty(NLESegmentEffect_getJsonParam)) {
            return false;
        }
        return !TextUtils.isEmpty(new JSONObject(NLESegmentEffect_getJsonParam).optString("editing_effect_algorithm_cache_url"));
    }

    public static boolean LJIIJ(NLEVideoEffect nLEVideoEffect) {
        String extra;
        if (nLEVideoEffect.hasExtra("ep_magic_resource_id") && (extra = nLEVideoEffect.getExtra("ep_magic_resource_id")) != null && (!ujb.o.LJJJJJL(extra))) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(NLEFilter nLEFilter) {
        String extra;
        if (nLEFilter.hasExtra("ep_magic_resource_id") && (extra = nLEFilter.getExtra("ep_magic_resource_id")) != null && (!ujb.o.LJJJJJL(extra))) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("is_from_ep_magic")) {
            return false;
        }
        return Boolean.parseBoolean(nLETrackSlot.getExtra("is_from_ep_magic"));
    }

    public static boolean LJIILIIL(NLETrackSlot slot) {
        NLESegment LJI;
        NLERenderProxySegment LIZLLL;
        NLEResourceAV LJ;
        String LIZJ;
        o.LJIIIZ(slot, "slot");
        NLETrackSlot LJIIIIZZ = slot.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJI = LJIIIIZZ.LJI()) != null && (LIZLLL = NLERenderProxySegment.LIZLLL(LJI)) != null && (LJ = LIZLLL.LJ()) != null && (LIZJ = LJ.LIZJ()) != null && (!ujb.o.LJJJJJL(LIZJ))) {
            return true;
        }
        return false;
    }

    public static void LJIILJJIL(EditorProContext editorProContext) {
        NLENode stage;
        NLEModel dynamicCast;
        if (editorProContext != null && (stage = C79057V0z.LJJI(editorProContext).getStage()) != null && (dynamicCast = NLEModel.dynamicCast(stage.deepClone(true))) != null) {
            C79057V0z.LJJ(editorProContext).LJII(dynamicCast);
        }
    }

    public static void LJIILL(NLESegmentVideo nLESegmentVideo) {
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.LIZ(EnumC123894td.COLOR);
        NLEEditorJniJNI.NLEStyCanvas_setColor(nLEStyCanvas.LIZ, nLEStyCanvas, ColorProtector.parseColor("#000000"));
        nLESegmentVideo.LJJIII(nLEStyCanvas);
    }

    public static void LJIILLIIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        NLENode nLENode;
        StringBuilder sb = new StringBuilder();
        Iterator<NLETrackSlot> it = nLEModel.getMainTrack().LJIILLIIL().iterator();
        int i = 0;
        while (true) {
            NLETrack nLETrack = null;
            if (it.hasNext()) {
                NLETrackSlot next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    NLETrackSlot nLETrackSlot = next;
                    if (i != nLEModel.getMainTrack().LJIILLIIL().size() - 1) {
                        sb.append(String.valueOf(nLETrackSlot.getEndTime() / 1000));
                    }
                    if (i < nLEModel.getMainTrack().LJIILLIIL().size() - 2) {
                        sb.append(",");
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                o.LJIIIIZZ(sb.toString(), "stickPoint.toString()");
                if ((!ujb.o.LJJJJJL(r1)) && (tracks = nLEModel.getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        NLETrack next2 = it2.next();
                        if (C124574uj.LJJIL(next2)) {
                            nLETrack = next2;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = nLETrack;
                    if (nLETrack2 != null && (nLENode = (NLENode) ORZ.LJLLLL(nLETrack2.LJIILLIIL())) != null) {
                        nLENode.setExtra("audio_stick_points", sb.toString());
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public static void LIZIZ(long j, InterfaceC124924vI editorContext) {
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio LIZLLL;
        long j2;
        long j3;
        long min;
        o.LJIIIZ(editorContext, "editorContext");
        VecNLETrackSPtr tracks = C79057V0z.LJJI(editorContext).getTracks();
        o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                if (C124574uj.LJJIL(nLETrack)) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILLIIL())) != null && (LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI())) != null && j - nLETrackSlot.getEndTime() <= 1000) {
            NLETrack mainTrack = C79057V0z.LJJI(editorContext).getMainTrack();
            if (mainTrack != null) {
                j2 = mainTrack.LJIIJJI();
            } else {
                j2 = 0;
            }
            if (nLETrackSlot.hasExtra("shoot_duration")) {
                String extra = nLETrackSlot.getExtra("shoot_duration");
                o.LJIIIIZZ(extra, "bgmSlot.getExtra(Constants.SHOOT_DURATION)");
                j3 = CastLongProtector.parseLong(extra);
            } else {
                j3 = 0;
            }
            long LJJJI = (((float) C78926UyI.LJJJI(j3)) / LIZLLL.getAbsSpeed()) + ((float) nLETrackSlot.getStartTime());
            long duration = (((float) (LIZLLL.LIZIZ().getDuration() - LIZLLL.LJIILIIL())) / LIZLLL.getAbsSpeed()) + ((float) nLETrackSlot.getStartTime());
            if (j3 == 0) {
                min = Math.min(j2, duration);
            } else {
                min = Math.min(j2, Math.min(LJJJI, duration));
            }
            nLETrackSlot.setEndTime(min);
            LIZLLL.LJIJJ((LIZLLL.getAbsSpeed() * ((float) (nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime()))) + ((float) LIZLLL.LJIILIIL()));
            LIZLLL.LJIJJ(Math.min(LIZLLL.LJIIL(), LIZLLL.LIZIZ().getDuration()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        r11 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r11.hasNext() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r4 = r11.next();
        r3 = (com.bytedance.ies.nle.editor_jni.NLETrack) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        if (r3.getLayer() != (r0.size() - 1)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r3.LJIILL().isEmpty() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        r12.removeTrack(r10);
        r0 = X.C122734rl.LIZ[r13.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r0 == 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
    
        r0 = X.C124574uj.LJII(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        if (r0 == 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r0 = X.C124574uj.LJJIFFI(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        if (r0 == 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        r0 = X.C124574uj.LJIJI(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        if (r0 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        r0 = X.C124574uj.LJIILIIL(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
    
        r1 = r12.getTracks();
        r0 = X.C07080Po.LIZ(r1, "nleModel.tracks");
        r4 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
    
        if (r4.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ce, code lost:
    
        r3 = r4.next();
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
    
        if (r2.getEnable() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00df, code lost:
    
        if (X.C79057V0z.LJJIJIL(r2) != r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.ies.nle.editor_jni.NLEModel r12, X.EnumC123864ta r13) {
        /*
            java.lang.String r0 = "nleTrackType"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            int[] r1 = X.C122734rl.LIZ
            int r0 = r13.ordinal()
            r0 = r1[r0]
            java.lang.String r9 = "nleModel.tracks"
            r8 = 4
            r7 = 3
            r6 = 2
            r5 = 1
            if (r0 == r5) goto L4e
            if (r0 == r6) goto L49
            if (r0 == r7) goto L44
            if (r0 == r8) goto L53
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r1 = r12.getTracks()
            java.util.ArrayList r0 = X.C07080Po.LIZ(r1, r9)
            java.util.Iterator r4 = r1.iterator()
        L27:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            boolean r1 = r2.getEnable()
            if (r1 == 0) goto L27
            X.4ta r1 = X.C79057V0z.LJJIJIL(r2)
            if (r1 != r13) goto L27
            r0.add(r3)
            goto L27
        L44:
            java.util.List r0 = X.C124574uj.LJIJI(r12)
            goto L57
        L49:
            java.util.List r0 = X.C124574uj.LJJIFFI(r12)
            goto L57
        L4e:
            java.util.List r0 = X.C124574uj.LJII(r12)
            goto L57
        L53:
            java.util.List r0 = X.C124574uj.LJIILIIL(r12)
        L57:
            java.util.Iterator r11 = r0.iterator()
        L5b:
            boolean r1 = r11.hasNext()
            r10 = 0
            if (r1 == 0) goto Lfd
            java.lang.Object r4 = r11.next()
            r3 = r4
            com.bytedance.ies.nle.editor_jni.NLETrack r3 = (com.bytedance.ies.nle.editor_jni.NLETrack) r3
            int r2 = r3.getLayer()
            int r1 = r0.size()
            int r1 = r1 - r5
            if (r2 != r1) goto L5b
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r3.LJIILL()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5b
            if (r4 == 0) goto Lfd
            java.util.Iterator r11 = r0.iterator()
        L84:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r4 = r11.next()
            r3 = r4
            com.bytedance.ies.nle.editor_jni.NLETrack r3 = (com.bytedance.ies.nle.editor_jni.NLETrack) r3
            int r2 = r3.getLayer()
            int r1 = r0.size()
            int r1 = r1 - r5
            if (r2 != r1) goto L84
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r3.LJIILL()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L84
            r10 = r4
        La7:
            com.bytedance.ies.nle.editor_jni.NLETrack r10 = (com.bytedance.ies.nle.editor_jni.NLETrack) r10
            r12.removeTrack(r10)
            int[] r1 = X.C122734rl.LIZ
            int r0 = r13.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto Lf7
            if (r0 == r6) goto Lf1
            if (r0 == r7) goto Leb
            if (r0 == r8) goto Le5
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r1 = r12.getTracks()
            java.util.ArrayList r0 = X.C07080Po.LIZ(r1, r9)
            java.util.Iterator r4 = r1.iterator()
        Lc8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            boolean r1 = r2.getEnable()
            if (r1 == 0) goto Lc8
            X.4ta r1 = X.C79057V0z.LJJIJIL(r2)
            if (r1 != r13) goto Lc8
            r0.add(r3)
            goto Lc8
        Le5:
            java.util.List r0 = X.C124574uj.LJIILIIL(r12)
            goto L57
        Leb:
            java.util.List r0 = X.C124574uj.LJIJI(r12)
            goto L57
        Lf1:
            java.util.List r0 = X.C124574uj.LJJIFFI(r12)
            goto L57
        Lf7:
            java.util.List r0 = X.C124574uj.LJII(r12)
            goto L57
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124614un.LIZLLL(com.bytedance.ies.nle.editor_jni.NLEModel, X.4ta):void");
    }

    public static NLETrack LJ(OSZ osz, ArrayList arrayList) {
        long longValue = ((Number) osz.getFirst()).longValue();
        long longValue2 = ((Number) osz.getSecond()).longValue();
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(71));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NLETrack nLETrack = (NLETrack) it.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(nLETrack.LJIILL());
            if (arrayList2.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList2, new IDComparatorS30S0000000_2(72));
            }
            if (arrayList2.isEmpty()) {
                return nLETrack;
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i);
                if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() <= longValue || nLETimeSpaceNode.getStartTime() >= longValue2)) {
                    return nLETrack;
                }
                if (i == 0 && nLETimeSpaceNode.getStartTime() >= longValue2) {
                    return nLETrack;
                }
                if (i == arrayList2.size() - 1) {
                    if (nLETimeSpaceNode.getEndTime() <= longValue) {
                        return nLETrack;
                    }
                } else {
                    NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i + 1);
                    if (nLETimeSpaceNode.getEndTime() <= longValue && longValue2 <= nLETimeSpaceNode2.getStartTime()) {
                        return nLETrack;
                    }
                }
            }
        }
        return null;
    }

    public static void LJI(NLEModel nLEModel, boolean z) {
        if (z) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null) {
                VecNLETrackSlotSPtr LJIILLIIL = mainTrack.LJIILLIIL();
                ArrayList arrayList = new ArrayList();
                Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next.LJI().LIZIZ().LJFF() == EnumC123874tb.IMAGE) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
                    nLETrackSlot.LJI().LIZIZ().setDuration(nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime());
                }
                return;
            }
            return;
        }
        long longValue = ((Number) C5BA.LIZ(EnumC127484zQ.PICTURE_TRACK_TIME, 4000L)).longValue();
        NLETrack mainTrack2 = nLEModel.getMainTrack();
        if (mainTrack2 != null) {
            VecNLETrackSlotSPtr LJIILLIIL2 = mainTrack2.LJIILLIIL();
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrackSlot> it3 = LJIILLIIL2.iterator();
            while (it3.hasNext()) {
                NLETrackSlot next2 = it3.next();
                if (next2.LJI().LIZIZ().LJFF() == EnumC123874tb.IMAGE) {
                    arrayList2.add(next2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((NLETrackSlot) it4.next()).LJI().LIZIZ().setDuration(1000 * longValue);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r3 = r7.LJIILLIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r3.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r10 < ((com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) X.ORZ.LLFF(r3)).getEndTime()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r6 = new java.util.ArrayList();
        r4 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r4.hasNext() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r3 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r3.getStartTime() <= r10) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        r6.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r6.isEmpty() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        r2 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) X.ORZ.LJLLJ(r6);
        r1 = X.C152205yC.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (X.C152205yC.LIZLLL(X.C125444w8.LIZ().LIZ(), null, r12) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        r3 = ((java.lang.Number) X.C5BA.LIZ(X.EnumC127484zQ.PICTURE_TRACK_TIME, 4000L)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        r3 = r3 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if ((r2.getStartTime() - r10) < r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0068, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0029, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dd, code lost:
    
        r3 = r1.LIZJ(X.C125444w8.LIZ().LIZ(), r12).LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0029, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.ies.nle.editor_jni.NLETrack LJFF(X.InterfaceC124924vI r9, long r10, java.lang.String r12) {
        /*
            java.lang.String r0 = "editorContext"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "resourcePath"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r9)
            java.util.List r1 = X.C124574uj.LJIJI(r0)
            if (r1 == 0) goto L1a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1f
        L1a:
            r0 = 1
        L1b:
            r5 = 0
            if (r0 == 0) goto L21
            return r5
        L1f:
            r0 = 0
            goto L1b
        L21:
            int r0 = r1.size()
            java.util.ListIterator r9 = r1.listIterator(r0)
        L29:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L69
            java.lang.Object r8 = r9.previous()
            r7 = r8
            com.bytedance.ies.nle.editor_jni.NLETrack r7 = (com.bytedance.ies.nle.editor_jni.NLETrack) r7
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r7.LJIILLIIL()
            java.util.Iterator r6 = r0.iterator()
        L3e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r4 = r6.next()
            r3 = r4
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r3 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r3
            long r1 = r3.getStartTime()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L3e
            long r1 = r3.getEndTime()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L3e
            if (r4 == 0) goto L5e
            goto L29
        L5e:
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r3 = r7.LJIILLIIL()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L6c
        L68:
            r5 = r8
        L69:
            com.bytedance.ies.nle.editor_jni.NLETrack r5 = (com.bytedance.ies.nle.editor_jni.NLETrack) r5
            return r5
        L6c:
            java.lang.Object r0 = X.ORZ.LLFF(r3)
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            long r1 = r0.getEndTime()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L7b
            goto L68
        L7b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r3.iterator()
        L84:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            long r1 = r0.getStartTime()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L84
            r6.add(r3)
            goto L84
        L9d:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto La4
            goto L29
        La4:
            java.lang.Object r2 = X.ORZ.LJLLJ(r6)
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r2 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r2
            X.5yC r1 = X.C152205yC.LIZ
            X.5ql r0 = X.C125444w8.LIZ()
            android.content.Context r0 = r0.LIZ()
            boolean r0 = X.C152205yC.LIZLLL(r0, r5, r12)
            if (r0 == 0) goto Ldd
            X.4zQ r3 = X.EnumC127484zQ.PICTURE_TRACK_TIME
            r0 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C5BA.LIZ(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
        Lcd:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 * r0
            if (r2 == 0) goto L29
            long r1 = r2.getStartTime()
            long r1 = r1 - r10
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L29
            goto L68
        Ldd:
            X.5ql r0 = X.C125444w8.LIZ()
            android.content.Context r0 = r0.LIZ()
            X.5nj r0 = r1.LIZJ(r0, r12)
            long r3 = r0.LJLJJL
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124614un.LJFF(X.4vI, long, java.lang.String):com.bytedance.ies.nle.editor_jni.NLETrack");
    }
}
