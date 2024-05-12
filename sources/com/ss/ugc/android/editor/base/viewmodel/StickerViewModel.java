package com.ss.ugc.android.editor.base.viewmodel;

import X.C07080Po;
import X.C123224sY;
import X.C124574uj;
import X.C124664us;
import X.C124674ut;
import X.C124694uv;
import X.C124774v3;
import X.C125334vx;
import X.C125354vz;
import X.C125364w0;
import X.C125374w1;
import X.C125404w4;
import X.C125434w7;
import X.C125674wV;
import X.C221108m2;
import X.C2ND;
import X.C39679Fhj;
import X.C5FG;
import X.C5H3;
import X.C68322mC;
import X.C6YK;
import X.C79057V0z;
import X.EnumC123864ta;
import X.EnumC124724uy;
import X.EnumC125884wq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.base.viewmodel.adapter.StickerUIViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.api.params.TextStyleInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerViewModel extends ViewModel {
    public static final C125374w1 Companion = new Object() { // from class: X.4w1
    };
    public final C5H3 stickerUI$delegate = C221108m2.LIZIZ(C125364w0.LJLIL);
    public final C5H3 stickerGes$delegate = C221108m2.LIZIZ(C125354vz.LJLIL);
    public final C5H3 editorContext$delegate = C221108m2.LIZIZ(C125334vx.LJLIL);

    public final void setStickerDefaultTime() {
        long H9 = getEditorContext().getPlayer().H9();
        updateStickerTimeRange$default(this, null, Long.valueOf(C124574uj.LJJLIIIJJIZ(H9)), Long.valueOf(C124574uj.LJJLIIIJJIZ(TimeUnit.SECONDS.toMillis(3L) + H9)), EnumC124724uy.COMMIT, 1, null);
    }

    private final EditorProContext getEditorContext() {
        return (EditorProContext) this.editorContext$delegate.getValue();
    }

    private final StickerGestureViewModel getStickerGes() {
        return (StickerGestureViewModel) this.stickerGes$delegate.getValue();
    }

    private final StickerUIViewModel getStickerUI() {
        return (StickerUIViewModel) this.stickerUI$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.bytedance.ies.nle.editor_jni.NLETrack, T, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.bytedance.ies.nle.editor_jni.NLETrack, T, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.bytedance.ies.nle.editor_jni.NLETrack, T, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    public final NLETrackSlot copySlot() {
        NLETrackSlot selectedTrackSlot;
        NLESegment LJFF;
        NLETrackSlot nLETrackSlot;
        NLESegment LJFF2;
        EditorProContext editorContext = getEditorContext();
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot nLETrackSlot2 = null;
        if (C79057V0z.LJJI(editorContext).getCover().getEnable()) {
            NLETrack nLETrack = (NLETrack) C79057V0z.LJJIIJ(editorContext, "selected_video_cover_track");
            if (nLETrack != null && (nLETrackSlot = (NLETrackSlot) C79057V0z.LJJIIJ(editorContext, "selected_video_cover_track_slot")) != null) {
                C68322mC c68322mC = new C68322mC();
                C68322mC c68322mC2 = new C68322mC();
                EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
                if (LJIIZILJ != null && C123224sY.LIZ[LJIIZILJ.ordinal()] == 1 && ((LJFF2 = NLESegmentTextSticker.LJFF(nLETrackSlot.LJI().deepClone(true))) != null || (LJFF2 = NLESegmentInfoSticker.LJFF(nLETrackSlot.LJI().deepClone(true))) != null)) {
                    ?? nLETrack2 = new NLETrack();
                    C124574uj.LJJLIIIJILLIZJL(nLETrack2, "sticker");
                    nLETrack2.setLayer(C124574uj.LJFF(C79057V0z.LJJI(editorContext)));
                    nLETrack2.LJIL(EnumC123864ta.STICKER);
                    ?? nLETrackSlot3 = new NLETrackSlot();
                    if (LJFF2 instanceof NLESegmentInfoSticker) {
                        String extra = nLETrackSlot.getExtra("previewIconPath");
                        o.LJIIIIZZ(extra, "this.getExtra(PREVIEW_ICON_PATH)");
                        nLETrackSlot3.setExtra("previewIconPath", extra);
                    }
                    nLETrackSlot3.setScale(nLETrackSlot.getScale());
                    nLETrackSlot3.setTransformX(nLETrackSlot.getTransformX());
                    nLETrackSlot3.setTransformY(nLETrackSlot.getTransformY() - 0.05f);
                    nLETrackSlot3.setRotation(nLETrackSlot.getRotation());
                    nLETrackSlot3.setStartTime(nLETrackSlot.getStartTime());
                    nLETrackSlot3.setEndTime(nLETrackSlot.getEndTime());
                    nLETrackSlot3.LJIIL(LJFF2);
                    c68322mC2.element = nLETrackSlot3;
                    nLETrackSlot3.setLayer(nLETrack2.getLayer() + 1);
                    nLETrack2.LIZIZ((NLETrackSlot) c68322mC2.element);
                    c68322mC.element = nLETrack2;
                }
                NLETrack nLETrack3 = (NLETrack) c68322mC.element;
                if (nLETrack3 != null) {
                    NLEVideoFrameModel cover = C79057V0z.LJJI(editorContext).getCover();
                    NLEEditorJniJNI.NLEVideoFrameModel_addTrack(cover.LIZ, cover, NLETrack.LJI(nLETrack3), nLETrack3);
                    C79057V0z.LJIIL(editorContext);
                }
                nLETrackSlot2 = (NLETrackSlot) c68322mC2.element;
            }
        } else {
            NLETrack selectedTrack = editorContext.getSelectedTrack();
            if (selectedTrack != null && (selectedTrackSlot = editorContext.getSelectedTrackSlot()) != null) {
                C68322mC c68322mC3 = new C68322mC();
                C68322mC c68322mC4 = new C68322mC();
                EnumC123864ta LJIIZILJ2 = selectedTrack.LJIIZILJ();
                if (LJIIZILJ2 != null) {
                    int i = C123224sY.LIZ[LJIIZILJ2.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            ?? LJFF3 = NLETrack.LJFF(selectedTrack.deepClone(true));
                            NLEModel LJJI = C79057V0z.LJJI(editorContext);
                            long endTime = selectedTrackSlot.getEndTime();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            VecNLETrackSPtr tracks = LJJI.getTracks();
                            ArrayList LIZ = C07080Po.LIZ(tracks, "tracks");
                            Iterator<NLETrack> it = tracks.iterator();
                            while (it.hasNext()) {
                                NLETrack next = it.next();
                                NLETrack nLETrack4 = next;
                                if (!nLETrack4.LJIIJ() && o.LJ(C124574uj.LJJIIZ(nLETrack4), "audio")) {
                                    LIZ.add(next);
                                }
                            }
                            Iterator it2 = LIZ.iterator();
                            while (it2.hasNext()) {
                                NLETrack nLETrack5 = (NLETrack) it2.next();
                                if (linkedHashMap.get(Integer.valueOf(nLETrack5.getLayer())) == null) {
                                    linkedHashMap.put(Integer.valueOf(nLETrack5.getLayer()), new ArrayList());
                                }
                                List list = (List) linkedHashMap.get(Integer.valueOf(nLETrack5.getLayer()));
                                if (list != null) {
                                    list.addAll(nLETrack5.LJIILLIIL());
                                }
                            }
                            TreeMap treeMap = new TreeMap(new Comparator() { // from class: X.4vy
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    Integer o2 = (Integer) obj2;
                                    int intValue = ((Integer) obj).intValue();
                                    o.LJIIIIZZ(o2, "o2");
                                    return intValue - o2.intValue();
                                }
                            });
                            treeMap.putAll(linkedHashMap);
                            Iterator it3 = treeMap.entrySet().iterator();
                            int i2 = 0;
                            while (it3.hasNext()) {
                                Object value = ((Map.Entry) it3.next()).getValue();
                                o.LJIIIIZZ(value, "it.value");
                                boolean z = true;
                                for (NLETimeSpaceNode nLETimeSpaceNode : (Iterable) value) {
                                    if (nLETimeSpaceNode.getStartTime() >= endTime || nLETimeSpaceNode.getEndTime() > endTime) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                i2++;
                            }
                            LJFF3.setLayer(Math.max(0, i2));
                            ?? LIZ2 = NLETrackSlot.LIZ(selectedTrackSlot.deepClone(true));
                            LIZ2.setStartTime(selectedTrackSlot.getEndTime());
                            LIZ2.setEndTime(selectedTrackSlot.getDuration() + LIZ2.getStartTime());
                            NLEFilter LIZIZ = LIZ2.LIZIZ();
                            if (LIZIZ != null) {
                                LIZIZ.setStartTime(selectedTrackSlot.LIZIZ().getEndTime());
                                LIZIZ.setEndTime(selectedTrackSlot.LIZIZ().getDuration() + LIZIZ.getStartTime());
                            }
                            c68322mC4.element = LIZ2;
                            LJFF3.LJ();
                            LJFF3.LIZIZ((NLETrackSlot) c68322mC4.element);
                            c68322mC3.element = LJFF3;
                        }
                    } else {
                        if (C124574uj.LJJJJZI(selectedTrackSlot)) {
                            LJFF = NLESegmentTextSticker.LJFF(selectedTrackSlot.LJI().deepClone());
                        } else if (NLESegmentInfoSticker.LJFF(selectedTrackSlot.LJI()) != null) {
                            LJFF = NLESegmentInfoSticker.LJFF(selectedTrackSlot.LJI().deepClone());
                        } else if (NLESegmentTextTemplate.LIZLLL(selectedTrackSlot.LJI()) != null) {
                            LJFF = NLESegmentTextTemplate.LIZLLL(selectedTrackSlot.LJI().deepClone());
                        } else if (NLESegmentImageSticker.LJFF(selectedTrackSlot.LJI()) != null) {
                            LJFF = NLESegmentImageSticker.LJFF(selectedTrackSlot.LJI().deepClone());
                        }
                        if (LJFF != null) {
                            ?? nLETrack6 = new NLETrack();
                            C124574uj.LJJLIIIJILLIZJL(nLETrack6, "sticker");
                            nLETrack6.setLayer(C124574uj.LJFF(C79057V0z.LJJI(editorContext)));
                            nLETrack6.LJIL(EnumC123864ta.STICKER);
                            ?? LIZ3 = NLETrackSlot.LIZ(selectedTrackSlot.deepClone(true));
                            LIZ3.setTransformY(selectedTrackSlot.getTransformY() - 0.05f);
                            LIZ3.setLayer(C79057V0z.LJJI(editorContext).getLayerMax() + 1);
                            c68322mC4.element = LIZ3;
                            nLETrack6.LIZIZ(LIZ3);
                            c68322mC3.element = nLETrack6;
                        }
                    }
                }
                NLETrack nLETrack7 = (NLETrack) c68322mC3.element;
                if (nLETrack7 != null) {
                    C79057V0z.LJJI(editorContext).addTrack(nLETrack7);
                    C79057V0z.LJIILJJIL(editorContext, true);
                }
                nLETrackSlot2 = (NLETrackSlot) c68322mC4.element;
            }
        }
        sendSelectEvent(nLETrackSlot2);
        return nLETrackSlot2;
    }

    private final boolean isCoverMode() {
        return C124574uj.LJJIZ(C79057V0z.LJJI(getEditorContext()));
    }

    public final void commitOnce() {
        NLETrack selectedTrack = getEditorContext().getSelectedTrack();
        if (selectedTrack != null && getEditorContext().getSelectedTrackSlot() != null && isTrackSticker(selectedTrack)) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
        }
    }

    public final NLESegmentSticker curInfoOrImageSticker() {
        NLETrackSlot selectedTrackSlot;
        NLETrackSlot LJJJJI;
        if (isCoverMode()) {
            NLETrack LJJJJ = C79057V0z.LJJJJ(getEditorContext());
            if (LJJJJ == null || (LJJJJI = C79057V0z.LJJJJI(getEditorContext())) == null || !C124574uj.LJJJLL(LJJJJ)) {
                return null;
            }
            return NLESegmentSticker.LIZLLL(LJJJJI.LJI());
        }
        NLETrack selectedTrack = getEditorContext().getSelectedTrack();
        if (selectedTrack == null || (selectedTrackSlot = getEditorContext().getSelectedTrackSlot()) == null || !C124574uj.LJJJLL(selectedTrack)) {
            return null;
        }
        return NLESegmentSticker.LIZLLL(selectedTrackSlot.LJI());
    }

    public final NLESegmentTextSticker curSticker() {
        return C124574uj.LJIIJ(getEditorContext());
    }

    public final NLETrackSlot curTrackSlot() {
        if (isCoverMode()) {
            return C79057V0z.LJJJJI(getEditorContext());
        }
        return getEditorContext().getSelectedTrackSlot();
    }

    public final void removeSticker() {
        if (getEditorContext().getPlayer().isPlaying()) {
            getEditorContext().getPlayer().pause();
        }
        if (getEditorContext().getEditor().LJIIJJI(EnumC124724uy.COMMIT)) {
            if (isCoverMode()) {
                sendSelectEvent$default(this, null, 1, null);
            } else {
                C79057V0z.LJIILJJIL(getEditorContext(), true);
                C79057V0z.LJJJJL(getEditorContext(), "selected_track_slot_event", new C125674wV((NLETrack) null, (NLETrackSlot) null, false, 8));
            }
        }
    }

    public final String selectedFlowerPath() {
        NLESegmentTextSticker LJIIJ;
        NLEStyText LJII;
        String LIZJ;
        NLESegmentTextSticker LJIIJ2;
        NLEStyText LJII2;
        String LIZJ2;
        EditorProContext editorContext = getEditorContext();
        o.LJIIIZ(editorContext, "<this>");
        if (C124574uj.LJJIZ(C79057V0z.LJJI(editorContext))) {
            if (C79057V0z.LJJJJ(editorContext) != null && C79057V0z.LJJJJI(editorContext) != null && (LJIIJ2 = C124574uj.LJIIJ(editorContext)) != null && (LJII2 = LJIIJ2.LJII()) != null) {
                long NLEStyText_getFlower = NLEEditorJniJNI.NLEStyText_getFlower(LJII2.LIZ, LJII2);
                if (NLEStyText_getFlower != 0 && (LIZJ2 = new NLEResourceNode(NLEStyText_getFlower).LIZJ()) != null) {
                    return LIZJ2;
                }
            }
        } else if (editorContext.getSelectedTrack() != null && editorContext.getSelectedTrackSlot() != null && (LJIIJ = C124574uj.LJIIJ(editorContext)) != null && (LJII = LJIIJ.LJII()) != null) {
            long NLEStyText_getFlower2 = NLEEditorJniJNI.NLEStyText_getFlower(LJII.LIZ, LJII);
            if (NLEStyText_getFlower2 != 0 && (LIZJ = new NLEResourceNode(NLEStyText_getFlower2).LIZJ()) != null) {
                return LIZJ;
            }
        }
        return "";
    }

    public final String selectedFontPath() {
        NLESegmentTextSticker LJIIJ;
        NLEStyText LJII;
        NLEResourceNode LIZIZ;
        String LIZJ;
        NLESegmentTextSticker LJIIJ2;
        NLEStyText LJII2;
        NLEResourceNode LIZIZ2;
        String LIZJ2;
        EditorProContext editorContext = getEditorContext();
        o.LJIIIZ(editorContext, "<this>");
        if (C124574uj.LJJIZ(C79057V0z.LJJI(editorContext))) {
            if (C79057V0z.LJJJJ(editorContext) != null && C79057V0z.LJJJJI(editorContext) != null && (LJIIJ2 = C124574uj.LJIIJ(editorContext)) != null && (LJII2 = LJIIJ2.LJII()) != null && (LIZIZ2 = LJII2.LIZIZ()) != null && (LIZJ2 = LIZIZ2.LIZJ()) != null) {
                return LIZJ2;
            }
        } else if (editorContext.getSelectedTrack() != null && editorContext.getSelectedTrackSlot() != null && (LJIIJ = C124574uj.LJIIJ(editorContext)) != null && (LJII = LJIIJ.LJII()) != null && (LIZIZ = LJII.LIZIZ()) != null && (LIZJ = LIZIZ.LIZJ()) != null) {
            return LIZJ;
        }
        return "";
    }

    public final void tryDeleteEmptySticker() {
        NLETrackSlot selectedTrackSlot;
        NLESegmentTextSticker LJFF;
        boolean LJ;
        NLETrackSlot LJJJJI;
        NLESegmentTextSticker LJFF2;
        EditorProContext editorContext = getEditorContext();
        o.LJIIIZ(editorContext, "<this>");
        if (C124574uj.LJJIZ(C79057V0z.LJJI(editorContext))) {
            NLETrack LJJJJ = C79057V0z.LJJJJ(editorContext);
            if (LJJJJ != null && (LJJJJI = C79057V0z.LJJJJI(editorContext)) != null && C124574uj.LJJJLL(LJJJJ) && (LJFF2 = NLESegmentTextSticker.LJFF(LJJJJI.LJI())) != null) {
                String content = LJFF2.LJI();
                o.LJIIIIZZ(content, "content");
                LJ = o.LJ(content, "input text");
            } else {
                return;
            }
        } else {
            NLETrack selectedTrack = editorContext.getSelectedTrack();
            if (selectedTrack == null || (selectedTrackSlot = editorContext.getSelectedTrackSlot()) == null || !C124574uj.LJJJLL(selectedTrack) || (LJFF = NLESegmentTextSticker.LJFF(selectedTrackSlot.LJI())) == null) {
                return;
            }
            String content2 = LJFF.LJI();
            o.LJIIIIZZ(content2, "content");
            LJ = o.LJ(content2, "input text");
        }
        if (LJ) {
            getStickerGes().remove();
            getStickerUI().getTextOperation().setValue(new C39679Fhj(EnumC125884wq.DELETE));
        }
    }

    public final NLESegmentTextSticker trySelectStickerOrAdd() {
        NLESegment nLESegment;
        NLESegment nLESegment2;
        NLESegmentTextSticker nLESegmentTextSticker = null;
        if (isCoverMode()) {
            NLESegmentTextSticker LJIIJ = C124574uj.LJIIJ(getEditorContext());
            if (LJIIJ == null) {
                C125674wV LIZ = C124694uv.LIZ(getEditorContext().getEditor(), null, 15);
                NLETrackSlot nLETrackSlot = LIZ.LIZIZ;
                if (nLETrackSlot != null) {
                    nLESegment2 = nLETrackSlot.LJI();
                } else {
                    nLESegment2 = null;
                }
                NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(nLESegment2);
                if (LJFF != null) {
                    nLESegmentTextSticker = LJFF;
                }
                EditorProContext editorContext = getEditorContext();
                C79057V0z.LJJJJL(editorContext, "selected_video_cover_track_slot", LIZ.LIZIZ);
                C79057V0z.LJJJJL(editorContext, "selected_video_cover_track", LIZ.LIZ);
                C2ND.LIZIZ(new AqS149S0200000_2(this, LIZ, 63), 200L);
                return nLESegmentTextSticker;
            }
            sendSelectEvent(C79057V0z.LJJJJI(getEditorContext()));
            return LJIIJ;
        }
        NLESegmentTextSticker LJIIJ2 = C124574uj.LJIIJ(getEditorContext());
        if (LJIIJ2 != null) {
            sendSelectEvent(getEditorContext().getSelectedTrackSlot());
            return LJIIJ2;
        }
        NLETrackSlot nLETrackSlot2 = C124694uv.LIZ(getEditorContext().getEditor(), null, 15).LIZIZ;
        if (nLETrackSlot2 != null) {
            nLESegment = nLETrackSlot2.LJI();
        } else {
            nLESegment = null;
        }
        NLESegmentTextSticker LJFF2 = NLESegmentTextSticker.LJFF(nLESegment);
        if (LJFF2 != null) {
            nLESegmentTextSticker = LJFF2;
        }
        C2ND.LIZIZ(new AqS149S0200000_2(this, nLETrackSlot2, 64), 200L);
        return nLESegmentTextSticker;
    }

    public final void updateInfoOrImageSticker() {
        NLETrackSlot LJJIL = getEditorContext().getEditor().LJJIL(EnumC124724uy.COMMIT);
        if (LJJIL != null) {
            if (!isCoverMode()) {
                C79057V0z.LJIILJJIL(getEditorContext(), true);
                sendSelectEvent(LJJIL);
            } else {
                sendSelectEvent(LJJIL);
            }
        }
    }

    public final void applyEmojiSticker(String utf8Code) {
        o.LJIIIZ(utf8Code, "utf8Code");
        NLETrackSlot LJJIIJ = getEditorContext().getEditor().LJJIIJ(EnumC124724uy.COMMIT, utf8Code);
        if (LJJIIJ != null) {
            sendSelectEvent(LJJIIJ);
        }
    }

    public final String getTextStickerContentBySlot(NLETrackSlot nLETrackSlot) {
        String LJI;
        if (nLETrackSlot == null || (LJI = NLESegmentTextSticker.LJFF(nLETrackSlot.LJI()).LJI()) == null) {
            return "";
        }
        return LJI;
    }

    public final boolean isTrackSticker(NLETrack track) {
        o.LJIIIZ(track, "track");
        return C124574uj.LJJJLL(track);
    }

    public final void sendSelectEvent(NLETrackSlot nLETrackSlot) {
        C125404w4 c125404w4;
        C125404w4 c125404w42;
        boolean isCoverMode = isCoverMode();
        MutableLiveData<C125404w4> selectStickerEvent = getStickerUI().getSelectStickerEvent();
        if (selectStickerEvent == null) {
            return;
        }
        if (nLETrackSlot == null) {
            c125404w42 = null;
            if (isCoverMode) {
                c125404w4 = new C125404w4(null);
            }
            selectStickerEvent.setValue(c125404w42);
        }
        c125404w4 = new C125404w4(nLETrackSlot);
        c125404w42 = c125404w4;
        selectStickerEvent.setValue(c125404w42);
    }

    public final boolean splitSlot(EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        return C124774v3.LIZIZ(editorContext, EnumC124724uy.DONE);
    }

    public final void stopStickerAnimationPreview(NLETrackSlot stickerSlot) {
        o.LJIIIZ(stickerSlot, "stickerSlot");
        getEditorContext().getPlayer().P9(stickerSlot);
    }

    public final void applyInfoSticker(ResourceItem resourceItem, C125434w7 c125434w7) {
        o.LJIIIZ(resourceItem, "resourceItem");
        String icon = resourceItem.getIcon();
        o.LJIIIIZZ(icon, "resourceItem.icon");
        String path = resourceItem.getPath();
        o.LJIIIIZZ(path, "resourceItem.path");
        NLETrackSlot LJIL = getEditorContext().getEditor().LJIL(new C124664us(icon, null, null, path, resourceItem.getEffectId()), EnumC124724uy.COMMIT);
        C79057V0z.LJIILJJIL(getEditorContext(), true);
        sendSelectEvent(LJIL);
    }

    public final void applyInfoStickerToTrack(ResourceItem resourceItem, C125434w7 c125434w7) {
        o.LJIIIZ(resourceItem, "resourceItem");
        String icon = resourceItem.getIcon();
        o.LJIIIIZZ(icon, "resourceItem.icon");
        String path = resourceItem.getPath();
        o.LJIIIIZZ(path, "resourceItem.path");
        NLETrackSlot LJIL = getEditorContext().getEditor().LJIL(new C124664us(icon, 0L, Long.valueOf(getEditorContext().getMainTrack().LJIIJJI()), path, resourceItem.getEffectId()), EnumC124724uy.COMMIT);
        C79057V0z.LJIILJJIL(getEditorContext(), true);
        sendSelectEvent(LJIL);
    }

    public final NLETrackSlot applyTextSticker(TextStyleInfo info, C125434w7 c125434w7) {
        o.LJIIIZ(info, "info");
        C125674wV LIZ = C124694uv.LIZ(getEditorContext().getEditor(), info, 12);
        if (LIZ == null) {
            return null;
        }
        C2ND.LIZIZ(new AqS149S0200000_2(this, LIZ, 62), 300L);
        return LIZ.LIZIZ;
    }

    public final void startStickerAnimationPreview(NLETrackSlot stickerSlot, int i) {
        o.LJIIIZ(stickerSlot, "stickerSlot");
        getEditorContext().getPlayer().S9(stickerSlot, i);
    }

    public final void updateStickerFlip(Boolean bool, boolean z) {
        if (getEditorContext().getEditor().LJJJJJL(bool, z, EnumC124724uy.COMMIT)) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
        }
    }

    public final void updateStickerRotation(Float f, boolean z) {
        if (getEditorContext().getEditor().LJJJJZ(f, EnumC124724uy.COMMIT) && z) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
        }
    }

    public final void updateStickerScale(Float f, boolean z) {
        if (getEditorContext().getEditor().LJJIIZI(f, EnumC124724uy.COMMIT) && z) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
        }
    }

    public final void updateTextSticker(boolean z, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJIJLIJ = getEditorContext().getEditor().LJJIJLIJ(z, enumC124724uy);
        if (LJJIJLIJ != null) {
            if (!isCoverMode()) {
                sendSelectEvent(LJJIJLIJ);
            } else {
                sendSelectEvent(LJJIJLIJ);
            }
        }
    }

    public final void secondaryEditingTextSticker(NLETrackSlot curSlot, TextStyleInfo info, String text) {
        long j;
        long LJIIJJI;
        o.LJIIIZ(curSlot, "curSlot");
        o.LJIIIZ(info, "info");
        o.LJIIIZ(text, "text");
        String LIZ = C6YK.LIZ(info);
        Long startTime = info.getStartTime();
        if (startTime != null) {
            j = startTime.longValue();
        } else {
            j = 0;
        }
        curSlot.setStartTime(j);
        Long endTime = info.getEndTime();
        if (endTime != null) {
            LJIIJJI = endTime.longValue();
        } else {
            LJIIJJI = getEditorContext().getMainTrack().LJIIJJI();
        }
        curSlot.setEndTime(LJIIJJI);
        NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(curSlot.LJI());
        LJFF.LJIIIIZZ(text);
        LJFF.LJIIIZ(new NLEStyText(LIZ));
        updateTextSticker$default(this, false, null, 3, null);
        C79057V0z.LJJJJL(getEditorContext(), "secondary_edit_sticker", Boolean.FALSE);
    }

    public final void updateStickPosition(Float f, Float f2, boolean z) {
        if (getEditorContext().getEditor().LJJJJI(f, f2, EnumC124724uy.COMMIT) && z) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
        }
    }

    public final void updateStickerScaleAndRotation(Float f, Float f2, boolean z) {
        if (getEditorContext().getEditor().LJJJJ(f, f2, EnumC124724uy.COMMIT) && z) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
        }
    }

    public static /* synthetic */ void sendSelectEvent$default(StickerViewModel stickerViewModel, NLETrackSlot nLETrackSlot, int i, Object obj) {
        if ((i & 1) != 0) {
            nLETrackSlot = null;
        }
        stickerViewModel.sendSelectEvent(nLETrackSlot);
    }

    public final void updateStickerTimeRange(NLETrackSlot nLETrackSlot, Long l, Long l2, EnumC124724uy commitLevel) {
        o.LJIIIZ(commitLevel, "commitLevel");
        if (getEditorContext().getEditor().LJJIIZ(nLETrackSlot, l, l2, commitLevel)) {
            if (commitLevel == EnumC124724uy.COMMIT) {
                C79057V0z.LJIIL(getEditorContext());
            } else {
                if (commitLevel != EnumC124724uy.DONE) {
                    return;
                }
                C79057V0z.LJIILJJIL(getEditorContext(), true);
            }
        }
    }

    public static /* synthetic */ void applyInfoSticker$default(StickerViewModel stickerViewModel, ResourceItem resourceItem, C125434w7 c125434w7, int i, Object obj) {
        if ((i & 2) != 0) {
            c125434w7 = null;
        }
        stickerViewModel.applyInfoSticker(resourceItem, c125434w7);
    }

    public static /* synthetic */ void applyInfoStickerToTrack$default(StickerViewModel stickerViewModel, ResourceItem resourceItem, C125434w7 c125434w7, int i, Object obj) {
        if ((i & 2) != 0) {
            c125434w7 = null;
        }
        stickerViewModel.applyInfoStickerToTrack(resourceItem, c125434w7);
    }

    public static /* synthetic */ NLETrackSlot applyTextSticker$default(StickerViewModel stickerViewModel, TextStyleInfo textStyleInfo, C125434w7 c125434w7, int i, Object obj) {
        if ((i & 1) != 0) {
            TextStyleInfo.Companion.getClass();
            textStyleInfo = C5FG.LIZ();
        }
        if ((i & 2) != 0) {
            c125434w7 = null;
        }
        return stickerViewModel.applyTextSticker(textStyleInfo, c125434w7);
    }

    public static /* synthetic */ void updateStickerFlip$default(StickerViewModel stickerViewModel, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        stickerViewModel.updateStickerFlip(bool, z);
    }

    public static /* synthetic */ void updateStickerRotation$default(StickerViewModel stickerViewModel, Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        stickerViewModel.updateStickerRotation(f, z);
    }

    public static /* synthetic */ void updateStickerScale$default(StickerViewModel stickerViewModel, Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        stickerViewModel.updateStickerScale(f, z);
    }

    public static /* synthetic */ void updateTextSticker$default(StickerViewModel stickerViewModel, boolean z, EnumC124724uy enumC124724uy, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            enumC124724uy = EnumC124724uy.DONE;
        }
        stickerViewModel.updateTextSticker(z, enumC124724uy);
    }

    public final void applyImageSticker(String resPath, float f, float f2, float f3, float f4) {
        o.LJIIIZ(resPath, "resPath");
        NLETrackSlot LJJIIJZLJL = getEditorContext().getEditor().LJJIIJZLJL(new C124674ut(resPath, f, f2, Float.valueOf(f3), Float.valueOf(f4)), EnumC124724uy.COMMIT);
        if (LJJIIJZLJL != null) {
            C79057V0z.LJIILJJIL(getEditorContext(), true);
            sendSelectEvent(LJJIIJZLJL);
        }
    }

    public static /* synthetic */ void updateStickPosition$default(StickerViewModel stickerViewModel, Float f, Float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        stickerViewModel.updateStickPosition(f, f2, z);
    }

    public static /* synthetic */ void updateStickerScaleAndRotation$default(StickerViewModel stickerViewModel, Float f, Float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        stickerViewModel.updateStickerScaleAndRotation(f, f2, z);
    }

    public static /* synthetic */ void updateStickerTimeRange$default(StickerViewModel stickerViewModel, NLETrackSlot nLETrackSlot, Long l, Long l2, EnumC124724uy enumC124724uy, int i, Object obj) {
        if ((i & 1) != 0) {
            nLETrackSlot = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            l2 = null;
        }
        if ((i & 8) != 0) {
            enumC124724uy = EnumC124724uy.COMMIT;
        }
        stickerViewModel.updateStickerTimeRange(nLETrackSlot, l, l2, enumC124724uy);
    }

    public static /* synthetic */ void applyImageSticker$default(StickerViewModel stickerViewModel, String str, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        if ((i & 4) != 0) {
            f2 = 0.5f;
        }
        if ((i & 8) != 0) {
            f3 = 0.5f;
        }
        if ((i & 16) != 0) {
            f4 = 0.5f;
        }
        stickerViewModel.applyImageSticker(str, f, f2, f3, f4);
    }
}
