package com.ss.ugc.android.editor.base.viewmodel;

import X.C07080Po;
import X.C124574uj;
import X.C125384w2;
import X.C125394w3;
import X.C125404w4;
import X.C125644wS;
import X.C125684wW;
import X.C125764we;
import X.C125774wf;
import X.C125784wg;
import X.C125794wh;
import X.C125804wi;
import X.C125814wj;
import X.C127594zb;
import X.C221108m2;
import X.C5H3;
import X.C79057V0z;
import X.EnumC123864ta;
import X.EnumC124724uy;
import X.ORZ;
import X.QM9;
import X.X1D;
import Y.AObserverS70S0100000_2;
import android.text.TextUtils;
import android.util.SizeF;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.ugc.android.editor.base.viewmodel.adapter.StickerUIViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerGestureViewModel extends ViewModel {
    public static final C125644wS Companion = new Object() { // from class: X.4wS
    };
    public final String tag = "StickerGesture";
    public final C5H3 editorContext$delegate = C221108m2.LIZIZ(C125684wW.LJLIL);
    public final C5H3 lifecycleOwner$delegate = C221108m2.LIZIZ(C125794wh.LJLIL);
    public final C5H3 stickerVE$delegate = C221108m2.LIZIZ(C125384w2.LJLIL);
    public final C5H3 stickerUI$delegate = C221108m2.LIZIZ(C125394w3.LJLIL);
    public final MutableLiveData<C127594zb> textBoundUpdate = new MutableLiveData<>();
    public final MutableLiveData<Long> playPosition = new MutableLiveData<>();
    public final MutableLiveData<Long> selectedViewFrame = new MutableLiveData<>();
    public final MutableLiveData<C125814wj> segmentState = new MutableLiveData<>();
    public final MutableLiveData<Boolean> textPanelVisibility = new MutableLiveData<>();
    public final MutableLiveData<Boolean> stickerPanelVisibility = new MutableLiveData<>();
    public final Map<String, C125774wf> stickers = new LinkedHashMap();
    public final C5H3 undoRedoListener$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 616));
    public final Observer<C127594zb> observer = new AObserverS70S0100000_2(this, 189);

    private final void cancelPlaceholder() {
        C125774wf c125774wf;
        C125814wj value = this.segmentState.getValue();
        if (value != null && (c125774wf = value.LIZ) != null) {
            getStickerUI().getCancelStickerPlaceholderEvent().setValue(new QM9(c125774wf.LIZIZ));
        }
    }

    private final EditorProContext getEditorContext() {
        return (EditorProContext) this.editorContext$delegate.getValue();
    }

    private final LifecycleOwner getLifecycleOwner() {
        return (LifecycleOwner) this.lifecycleOwner$delegate.getValue();
    }

    private final StickerUIViewModel getStickerUI() {
        return (StickerUIViewModel) this.stickerUI$delegate.getValue();
    }

    private final StickerViewModel getStickerVE() {
        return (StickerViewModel) this.stickerVE$delegate.getValue();
    }

    private final C125804wi getUndoRedoListener() {
        return (C125804wi) this.undoRedoListener$delegate.getValue();
    }

    public void copy() {
        C125814wj value = this.segmentState.getValue();
        if (value != null && value.LIZ != null) {
            getStickerVE().copySlot();
        }
    }

    public final List<C125774wf> getStickerSegments() {
        return new ArrayList(this.stickers.values());
    }

    public void remove() {
        C125774wf c125774wf;
        C125814wj value = this.segmentState.getValue();
        if (value != null && (c125774wf = value.LIZ) != null) {
            this.stickers.remove(c125774wf.LIZIZ);
        }
    }

    public final boolean detectDelete() {
        VecNLETrackSPtr tracks = C79057V0z.LJJI(getEditorContext()).getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJLL(it2)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            i += ((NLETrack) it3.next()).LJIILLIIL().size();
        }
        if (i >= this.stickers.size()) {
            return false;
        }
        return true;
    }

    public void flip() {
        cancelPlaceholder();
        StickerViewModel.updateStickerFlip$default(getStickerVE(), null, false, 3, null);
        tryUpdateInfoSticker();
    }

    public final void init() {
        C79057V0z.LJFF(getEditorContext(), getUndoRedoListener());
        MutableLiveData LJII = C79057V0z.LJII(getEditorContext(), "slot_select_change_event");
        if (LJII != null) {
            LJII.observe(getLifecycleOwner(), this.observer);
        }
    }

    public final void onDestroy() {
        C79057V0z.LJJIL(getEditorContext(), getUndoRedoListener());
        MutableLiveData LJII = C79057V0z.LJII(getEditorContext(), "slot_select_change_event");
        if (LJII != null) {
            LJII.removeObserver(this.observer);
        }
    }

    public void onGestureEnd() {
        getStickerVE().commitOnce();
    }

    public final void removeAllPlaceHolder() {
        EditorProContext editorContext = getEditorContext();
        if (!editorContext.getPlayer().isPlaying()) {
            onVideoPositionChange(C124574uj.LJJLIIIJJIZ(editorContext.getPlayer().H9()));
        }
    }

    public final void restoreInfoSticker() {
        NLEModel LJJI = C79057V0z.LJJI(getEditorContext());
        VecNLETrackSPtr tracks = LJJI.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                if (next.LJIIZILJ() == EnumC123864ta.STICKER) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NLETrack nLETrack = (NLETrack) it2.next();
                Iterator<NLETrackSlot> it3 = nLETrack.LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    C125764we.LIZ(nLETrack, next2);
                    C125774wf c125774wf = new C125774wf(next2);
                    if (!ujb.o.LJJJJJL(c125774wf.LIZIZ)) {
                        this.stickers.containsKey(c125774wf.LIZIZ);
                        this.stickers.put(c125774wf.LIZIZ, c125774wf);
                    }
                }
            }
        }
        VecNLETrackSPtr tracks2 = LJJI.getCover().getTracks();
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it4 = tracks2.iterator();
        while (it4.hasNext()) {
            NLETrack next3 = it4.next();
            if (next3.LJIIZILJ() == EnumC123864ta.STICKER) {
                arrayList2.add(next3);
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) it5.next();
            Iterator<NLETrackSlot> it6 = nLETrack2.LJIILL().iterator();
            while (it6.hasNext()) {
                NLETrackSlot next4 = it6.next();
                C125764we.LIZ(nLETrack2, next4);
                C125774wf c125774wf2 = new C125774wf(next4);
                if (!ujb.o.LJJJJJL(c125774wf2.LIZIZ)) {
                    this.stickers.containsKey(c125774wf2.LIZIZ);
                    this.stickers.put(c125774wf2.LIZIZ, c125774wf2);
                }
            }
        }
    }

    public final void tryUpdateInfoSticker() {
        C125814wj LIZ;
        if (C124574uj.LJJIZ(C79057V0z.LJJI(getEditorContext()))) {
            NLETrack LJJJJ = C79057V0z.LJJJJ(getEditorContext());
            if (LJJJJ != null) {
                NLETrackSlot LJJJJI = C79057V0z.LJJJJI(getEditorContext());
                if (LJJJJI != null) {
                    if (getStickerVE().isTrackSticker(LJJJJ)) {
                        C125764we.LIZ(LJJJJ, LJJJJI);
                        LIZ = new C125814wj(new C125774wf(LJJJJI));
                    } else {
                        LIZ = C125784wg.LIZ();
                    }
                } else {
                    LIZ = C125784wg.LIZ();
                }
            } else {
                LIZ = C125784wg.LIZ();
            }
        } else {
            NLETrack selectedTrack = getEditorContext().getSelectedTrack();
            if (selectedTrack != null) {
                NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
                if (selectedTrackSlot != null) {
                    if (getStickerVE().isTrackSticker(selectedTrack)) {
                        C125764we.LIZ(selectedTrack, selectedTrackSlot);
                        LIZ = new C125814wj(new C125774wf(selectedTrackSlot));
                    } else {
                        LIZ = C125784wg.LIZ();
                    }
                } else {
                    LIZ = C125784wg.LIZ();
                }
            } else {
                LIZ = C125784wg.LIZ();
            }
        }
        if (!ujb.o.LJJJJJL(LIZ.LIZ.LIZIZ)) {
            this.stickers.containsKey(LIZ.LIZ.LIZIZ);
            Map<String, C125774wf> map = this.stickers;
            C125774wf c125774wf = LIZ.LIZ;
            map.put(c125774wf.LIZIZ, c125774wf);
        }
        this.segmentState.setValue(LIZ);
    }

    public final void updateSticker() {
        NLEModel LJJI = C79057V0z.LJJI(getEditorContext());
        HashSet hashSet = new HashSet(this.stickers.keySet());
        VecNLETrackSPtr tracks = LJJI.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJLL(it2)) {
                LIZ.add(next);
            }
        }
        Iterator it3 = LIZ.iterator();
        while (it3.hasNext()) {
            Iterator<NLETrackSlot> it4 = ((NLETrack) it3.next()).LJIILL().iterator();
            while (it4.hasNext()) {
                hashSet.remove(String.valueOf(it4.next().getId()));
            }
        }
        NLEVideoFrameModel cover = LJJI.getCover();
        if (cover != null) {
            VecNLETrackSPtr tracks2 = cover.getTracks();
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it5 = tracks2.iterator();
            while (it5.hasNext()) {
                NLETrack next2 = it5.next();
                NLETrack it6 = next2;
                o.LJIIIIZZ(it6, "it");
                if (C124574uj.LJJJLL(it6)) {
                    arrayList.add(next2);
                }
            }
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                Iterator<NLETrackSlot> it8 = ((NLETrack) it7.next()).LJIILL().iterator();
                while (it8.hasNext()) {
                    hashSet.remove(String.valueOf(it8.next().getId()));
                }
            }
        }
        Iterator it9 = ((ArrayList) ORZ.LJLL(hashSet)).iterator();
        while (it9.hasNext()) {
            Object next3 = it9.next();
            this.stickers.remove(next3);
            cancelPlaceholder();
            NLETrack selectedTrack = getEditorContext().getSelectedTrack();
            if (selectedTrack != null) {
                Long l = null;
                if (C124574uj.LJJJLL(selectedTrack)) {
                    NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
                    if (selectedTrackSlot != null) {
                        l = Long.valueOf(selectedTrackSlot.getId());
                    }
                    if (o.LJ(String.valueOf(l), next3)) {
                        this.segmentState.setValue(C125784wg.LIZ());
                    }
                }
            }
        }
        MutableLiveData<Long> mutableLiveData = this.selectedViewFrame;
        Long value = this.playPosition.getValue();
        if (value == null) {
            value = Long.valueOf(getEditorContext().getPlayer().H9());
        }
        mutableLiveData.setValue(value);
    }

    public final MutableLiveData<Long> getPlayPosition() {
        return this.playPosition;
    }

    public final MutableLiveData<C125814wj> getSegmentState() {
        return this.segmentState;
    }

    public final MutableLiveData<Long> getSelectedViewFrame() {
        return this.selectedViewFrame;
    }

    public final MutableLiveData<Boolean> getStickerPanelVisibility() {
        return this.stickerPanelVisibility;
    }

    public final MutableLiveData<C127594zb> getTextBoundUpdate() {
        return this.textBoundUpdate;
    }

    public final MutableLiveData<Boolean> getTextPanelVisibility() {
        return this.textPanelVisibility;
    }

    public void onScaleRotateEnd() {
        onGestureEnd();
    }

    public final void deleteTextStickOnChangeFocus(String id) {
        o.LJIIIZ(id, "id");
        remove();
    }

    public final SizeF getBoundingBox(String id) {
        o.LJIIIZ(id, "id");
        try {
            NLERectF LJII = getEditorContext().getNleSession().O8().LJII(id, false);
            return new SizeF(NLEMediaJniJNI.NLERectF_right_get(LJII.LIZ, LJII) - NLEMediaJniJNI.NLERectF_left_get(LJII.LIZ, LJII), NLEMediaJniJNI.NLERectF_bottom_get(LJII.LIZ, LJII) - NLEMediaJniJNI.NLERectF_top_get(LJII.LIZ, LJII));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getStickerBoundingBox error:");
            LIZ.append(e.getMessage());
            LIZ.append(" segment:");
            LIZ.append(id);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final C125404w4 getSelectInfoSticker(String str) {
        NLETrackSlot nLETrackSlot;
        C125774wf c125774wf = this.stickers.get(str);
        if (c125774wf != null && (nLETrackSlot = c125774wf.LIZ) != null) {
            VecNLETrackSPtr tracks = C79057V0z.LJJI(getEditorContext()).getTracks();
            if (tracks != null) {
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    Iterator<NLETrackSlot> it2 = next.LJIILL().iterator();
                    while (it2.hasNext()) {
                        NLETrackSlot next2 = it2.next();
                        if (getStickerVE().isTrackSticker(next) && o.LJ(next2.getUUID(), nLETrackSlot.getUUID())) {
                            return new C125404w4(next2);
                        }
                    }
                }
            }
            NLEVideoFrameModel cover = C79057V0z.LJJI(getEditorContext()).getCover();
            if (cover != null) {
                Iterator<NLETrack> it3 = cover.getTracks().iterator();
                while (it3.hasNext()) {
                    NLETrack next3 = it3.next();
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLJ(next3.LJIILLIIL());
                    if (getStickerVE().isTrackSticker(next3) && o.LJ(nLETrackSlot2.getUUID(), nLETrackSlot.getUUID())) {
                        return new C125404w4(nLETrackSlot2);
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final TextTemplate getTextTemplateInfo(String id) {
        o.LJIIIZ(id, "id");
        String LJIIJJI = getEditorContext().getNleSession().O8().LJIIJJI(id);
        if (!TextUtils.isEmpty(LJIIJJI)) {
            return (TextTemplate) GsonProtectorUtils.fromJson(new Gson(), LJIIJJI, TextTemplate.class);
        }
        return null;
    }

    public void onVideoPositionChange(long j) {
        this.playPosition.setValue(Long.valueOf(j));
    }

    public void rotate(float f) {
        tryUpdateInfoSticker();
    }

    public void scale(float f) {
        StickerViewModel.updateStickerScale$default(getStickerVE(), Float.valueOf(f), false, 2, null);
        tryUpdateInfoSticker();
    }

    public void changePosition(float f, float f2) {
        StickerViewModel.updateStickPosition$default(getStickerVE(), Float.valueOf(f), Float.valueOf(f2), false, 4, null);
        tryUpdateInfoSticker();
    }

    public void scaleRotate(float f, float f2) {
        StickerViewModel.updateStickerScaleAndRotation$default(getStickerVE(), Float.valueOf(f), Float.valueOf(f2), false, 4, null);
        tryUpdateInfoSticker();
    }

    public final void adjustClipRange(NLETrackSlot slot, long j, long j2, EnumC124724uy commitLevel) {
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(commitLevel, "commitLevel");
        updateClipRange(slot, Long.valueOf(slot.getStartTime() + j), Long.valueOf(slot.getStartTime() + j + j2), commitLevel);
    }

    public final void updateClipRange(NLETrackSlot nLETrackSlot, Long l, Long l2, EnumC124724uy commitLevel) {
        o.LJIIIZ(commitLevel, "commitLevel");
        getStickerVE().updateStickerTimeRange(nLETrackSlot, l, l2, commitLevel);
        tryUpdateInfoSticker();
    }

    public static /* synthetic */ void adjustClipRange$default(StickerGestureViewModel stickerGestureViewModel, NLETrackSlot nLETrackSlot, long j, long j2, EnumC124724uy enumC124724uy, int i, Object obj) {
        if ((i & 8) != 0) {
            enumC124724uy = EnumC124724uy.COMMIT;
        }
        stickerGestureViewModel.adjustClipRange(nLETrackSlot, j, j2, enumC124724uy);
    }

    public static /* synthetic */ void updateClipRange$default(StickerGestureViewModel stickerGestureViewModel, NLETrackSlot nLETrackSlot, Long l, Long l2, EnumC124724uy enumC124724uy, int i, Object obj) {
        if ((i & 1) != 0) {
            nLETrackSlot = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            l2 = null;
        }
        stickerGestureViewModel.updateClipRange(nLETrackSlot, l, l2, enumC124724uy);
    }
}
