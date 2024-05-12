package com.ss.ugc.android.editor.base.viewmodel;

import X.C122684rg;
import X.C124024tq;
import X.C124574uj;
import X.C124614un;
import X.C124804v6;
import X.C124824v8;
import X.C124894vF;
import X.C124954vL;
import X.C125534wH;
import X.C125554wJ;
import X.C125564wK;
import X.C125574wL;
import X.C125584wM;
import X.C127594zb;
import X.C1JD;
import X.C221108m2;
import X.C2ZY;
import X.C38350F3i;
import X.C5BA;
import X.C5H3;
import X.C60632Zn;
import X.C60722Zw;
import X.C79057V0z;
import X.EnumC123864ta;
import X.EnumC123874tb;
import X.EnumC124724uy;
import X.EnumC127484zQ;
import X.InterfaceC124814v7;
import X.InterfaceC125004vQ;
import X.InterfaceC125604wO;
import X.ORZ;
import X.OSZ;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutViewModel extends ViewModel {
    public final C5H3 editorContext$delegate = C221108m2.LIZIZ(C125554wJ.LJLIL);
    public final C5H3 volumeUpdate$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 615));
    public final C5H3 speedUpdate$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 611));
    public final C5H3 slotSelectChangedEvent$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 610));
    public final C5H3 trackSelectChangedEvent$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 612));
    public final C5H3 volumeKeyframe$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 614));
    public final C5H3 seekVideoPositionEvent$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 609));
    public final C5H3 undoRedoListener$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 613));
    public final InterfaceC125004vQ editor = getEditorContext().getEditor();
    public final C5H3 speed$delegate = C221108m2.LIZIZ(C125574wL.LJLIL);
    public final C5H3 changeTone$delegate = C221108m2.LIZIZ(C125564wK.LJLIL);

    private final C125584wM getUndoRedoListener() {
        return (C125584wM) this.undoRedoListener$delegate.getValue();
    }

    public final void cancelReverse() {
        this.editor.LJJIJ();
    }

    public final void checkAbsSpeedAndTone() {
        float LJJJJJ = this.editor.LJJJJJ();
        if (!o.LIZJ(getSpeed().getValue(), LJJJJJ)) {
            getSpeed().setValue(Float.valueOf(LJJJJJ));
        }
        float LJJIJIL = this.editor.LJJIJIL();
        if (!o.LIZJ(getSpeed().getValue(), LJJIJIL)) {
            getSpeed().setValue(Float.valueOf(LJJIJIL));
        }
        boolean z = !this.editor.LJIILIIL();
        if (!o.LJ(getChangeTone().getValue(), Boolean.valueOf(z))) {
            getChangeTone().setValue(Boolean.valueOf(z));
        }
    }

    public final MutableLiveData<Boolean> getChangeTone() {
        return (MutableLiveData) this.changeTone$delegate.getValue();
    }

    public final EditorProContext getEditorContext() {
        return (EditorProContext) this.editorContext$delegate.getValue();
    }

    public final MutableLiveData<Long> getSeekVideoPositionEvent() {
        return (MutableLiveData) this.seekVideoPositionEvent$delegate.getValue();
    }

    public final MutableLiveData<C124894vF> getSlotSelectChangedEvent() {
        return (MutableLiveData) this.slotSelectChangedEvent$delegate.getValue();
    }

    public final MutableLiveData<Float> getSpeed() {
        return (MutableLiveData) this.speed$delegate.getValue();
    }

    public final MutableLiveData<C60632Zn> getSpeedUpdate() {
        return (MutableLiveData) this.speedUpdate$delegate.getValue();
    }

    public final MutableLiveData<C124954vL> getTrackSelectChangedEvent() {
        return (MutableLiveData) this.trackSelectChangedEvent$delegate.getValue();
    }

    public final LiveData<C60722Zw> getVolumeKeyframe() {
        return (LiveData) this.volumeKeyframe$delegate.getValue();
    }

    public final MutableLiveData<C2ZY> getVolumeUpdate() {
        return (MutableLiveData) this.volumeUpdate$delegate.getValue();
    }

    public final void mirror() {
        this.editor.LIZJ(EnumC124724uy.DONE);
    }

    public final void rotate() {
        this.editor.LJJJI(EnumC124724uy.DONE);
    }

    public final void slotCopy() {
        if (this.editor.LJJIJL(EnumC124724uy.DONE)) {
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(7);
        }
    }

    public CutViewModel() {
        C79057V0z.LJFF(getEditorContext(), getUndoRedoListener());
    }

    public final float getCurrentVolumeIntensity() {
        NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
        if (selectedTrackSlot == null) {
            return 0.0f;
        }
        if (getEditorContext().getKeyframeEditor().LIZIZ()) {
            NLESegment LJI = selectedTrackSlot.LJI();
            if (LJI == null) {
                return 0.0f;
            }
            return C124574uj.LJJIIZI(LJI);
        }
        NLESegment LJI2 = selectedTrackSlot.LJI();
        if (LJI2 == null) {
            return 0.0f;
        }
        return C124574uj.LJJIIZI(LJI2);
    }

    public final float getSaveVolumeIntensity() {
        String extra;
        Float LJJIJLIJ;
        EditorProContext editorContext = getEditorContext();
        o.LJIIIZ(editorContext, "<this>");
        NLETrackSlot selectedTrackSlot = editorContext.getSelectedTrackSlot();
        if (selectedTrackSlot != null && (extra = selectedTrackSlot.getExtra("volume_intensity")) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(extra)) != null) {
            return LJJIJLIJ.floatValue();
        }
        return 1.0f;
    }

    public final void restoreAllSlotsVolume() {
        float f;
        Float LJJIJLIJ;
        VecNLETrackSPtr tracks = C79057V0z.LJJI(getEditorContext()).getTracks();
        o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (next.LJIIZILJ() == EnumC123864ta.AUDIO) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILLIIL().iterator();
            while (it3.hasNext()) {
                NLETrackSlot next2 = it3.next();
                String extra = next2.getExtra("volume_intensity");
                if (extra != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(extra)) != null) {
                    f = LJJIJLIJ.floatValue();
                } else if (C1JD.LIZLLL()) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                NLESegment LJI = next2.LJI();
                o.LJIIIIZZ(LJI, "slot.mainSegment");
                C124574uj.LJJLIIIJJI(LJI, f);
                C79057V0z.LJIIL(getEditorContext());
            }
        }
    }

    public final void slotReplace() {
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(8);
    }

    public final boolean splitClip() {
        getEditorContext().getPlayer().pause();
        return this.editor.LJIIL(EnumC124724uy.DONE);
    }

    private final void modifyExtraAfterAudioSpeed(NLETrack nLETrack) {
        if (o.LJ(nLETrack.getExtra("AudioTrackType"), "BGM")) {
            nLETrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
        }
        if (!nLETrack.hasExtra("track_extra_is_audio_edit_speed")) {
            nLETrack.setExtra("track_extra_is_audio_edit_speed", "true");
        }
    }

    public final void adjustAfterVideoSpeed(long j) {
        NLETrackSlot selectedTrackSlot;
        Object obj;
        NLETrackSlot nLETrackSlot;
        NLETrack selectedTrack = getEditorContext().getSelectedTrack();
        if (selectedTrack != null) {
            if (!selectedTrack.hasExtra("track_extra_is_video_edit_speed")) {
                selectedTrack.setExtra("track_extra_is_video_edit_speed", "true");
            }
            if (selectedTrack.LJIIJ()) {
                getEditorContext().getMainTrack().LJJIFFI();
                NLEModel LJJI = C79057V0z.LJJI(getEditorContext());
                Iterator LIZJ = t1.LIZJ(LJJI, "nleModel.tracks");
                while (true) {
                    if (LIZJ.hasNext()) {
                        obj = LIZJ.next();
                        if (C124574uj.LJJIL((NLETrack) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLETrack nLETrack = (NLETrack) obj;
                if (nLETrack != null && nLETrack.LJIILLIIL().size() > 1 && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILLIIL())) != null && ((NLETimeSpaceNode) ORZ.LLFF(nLETrack.LJIILLIIL())).getEndTime() < LJJI.getMainTrack().LJIIJJI()) {
                    ((NLETimeSpaceNode) ORZ.LLFF(nLETrack.LJIILLIIL())).setEndTime(nLETrackSlot.LJI().LIZIZ().getDuration() + ((NLETimeSpaceNode) ORZ.LLFF(nLETrack.LJIILLIIL())).getStartTime());
                    if (((NLETimeSpaceNode) ORZ.LLFF(nLETrack.LJIILLIIL())).getEndTime() < LJJI.getMainTrack().LJIIJJI()) {
                        while (((NLETimeSpaceNode) ORZ.LLFF(nLETrack.LJIILLIIL())).getEndTime() < LJJI.getMainTrack().LJIIJJI()) {
                            NLENode deepClone = nLETrackSlot.deepClone(true);
                            nLETrackSlot.setStartTime(((NLETimeSpaceNode) ORZ.LLFF(nLETrack.LJIILLIIL())).getEndTime());
                            nLETrackSlot.setEndTime(nLETrackSlot.LJI().LIZIZ().getDuration() + nLETrackSlot.getStartTime());
                            nLETrack.LIZIZ(NLETrackSlot.LIZ(deepClone));
                        }
                    }
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(nLETrack.LJIILLIIL());
                    if (nLETimeSpaceNode != null) {
                        nLETimeSpaceNode.setEndTime(LJJI.getMainTrack().LJIIJJI());
                    }
                }
                if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                    C124614un.LIZJ(getEditorContext());
                }
                if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, Boolean.FALSE)).booleanValue() && getEditorContext().getMainTrack().LJIIJJI() > j) {
                    C124614un.LIZIZ(j, getEditorContext());
                    return;
                }
                return;
            }
            if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue() && (selectedTrackSlot = getEditorContext().getSelectedTrackSlot()) != null) {
                long LJIIJJI = getEditorContext().getMainTrack().LJIIJJI();
                if (selectedTrackSlot.getEndTime() > LJIIJJI) {
                    NLESegment LJI = selectedTrackSlot.LJI();
                    o.LJIIIIZZ(LJI, "it.mainSegment");
                    long endTime = ((float) (selectedTrackSlot.getEndTime() - LJIIJJI)) * C124574uj.LJJI(LJI);
                    selectedTrackSlot.setEndTime(LJIIJJI);
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(selectedTrackSlot.LJI());
                    if (LJJ != null) {
                        LJJ.LJIJJ(LJJ.LJIIL() - endTime);
                    }
                }
            }
        }
    }

    public final void reversePlay(InterfaceC125604wO interfaceC125604wO) {
        this.editor.LJII();
    }

    public final void saveVolumeIntensity(float f) {
        EditorProContext editorContext = getEditorContext();
        String extraVal = String.valueOf(f);
        o.LJIIIZ(editorContext, "<this>");
        o.LJIIIZ(extraVal, "extraVal");
        NLETrackSlot selectedTrackSlot = editorContext.getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            selectedTrackSlot.setExtra("volume_intensity", extraVal);
        }
        C79057V0z.LJIILJJIL(getEditorContext(), true);
    }

    public final void slotCrop(C125534wH cropData) {
        o.LJIIIZ(cropData, "cropData");
        if (getEditorContext().getSelectedTrackSlot() == null) {
            return;
        }
        setSlotExtra("ep_crop_scale", String.valueOf(cropData.LJLJJL));
        setSlotExtra("ep_crop_transX", String.valueOf(cropData.LJLJJLL));
        setSlotExtra("ep_crop_transY", String.valueOf(cropData.LJLJL));
        setSlotExtra("ep_crop_degree", String.valueOf(cropData.LJLJLJ));
        setSlotExtra("ep_crop_ratio", String.valueOf(cropData.LJLJLLL));
        this.editor.LJFF(new C124804v6(cropData.LJLIL, cropData.LJLILLLLZI, cropData.LJLJI, cropData.LJLJJI), EnumC124724uy.DONE);
    }

    private final void adjustAfterAudioSpeed(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        EnumC123864ta LJJIJIL = C79057V0z.LJJIJIL(nLETrack);
        EnumC123864ta enumC123864ta = EnumC123864ta.AUDIO;
        if (LJJIJIL == enumC123864ta && !o.LJ(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
            long j = 1000;
            if (nLETrackSlot.getMeasuredEndTime() / j > getEditorContext().getMainTrack().getMeasuredEndTime() / j) {
                nLETrackSlot.setMeasuredEndTime(getEditorContext().getMainTrack().getMeasuredEndTime());
                nLETrackSlot.setEndTime(getEditorContext().getMainTrack().getMeasuredEndTime());
            }
            int size = nLETrack.LJIILLIIL().size();
            int indexOf = nLETrack.LJIILLIIL().indexOf(nLETrackSlot);
            if (indexOf >= 0 && indexOf < size - 1 && nLETrackSlot.getMeasuredEndTime() > nLETrack.LJIILLIIL().get(indexOf + 1).getMeasuredStartTime()) {
                int layer = nLETrack.getLayer() + 1;
                NLEModel LJJI = C79057V0z.LJJI(getEditorContext());
                nLETrack.LJIJJLI(nLETrackSlot);
                if (o.LJ(nLETrack.getExtra("AudioTrackType"), "BGM")) {
                    nLETrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
                }
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.LJJ(false);
                C124574uj.LJJLIIIJILLIZJL(nLETrack2, "audio");
                nLETrack2.LJIL(enumC123864ta);
                nLETrack2.setLayer(layer);
                nLETrack2.LIZIZ(nLETrackSlot);
                nLETrack2.setExtra("track_layer", String.valueOf(layer));
                List<NLETrack> LJII = C124574uj.LJII(LJJI);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) LJII).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((NLETimeSpaceNode) next).getLayer() >= layer) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it2.next();
                        nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
                    }
                }
                LJJI.addTrack(nLETrack2);
                C79057V0z.LJJJJL(getEditorContext(), "select_slot_event", new C127594zb(nLETrackSlot, null, 14));
            }
            NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI());
            if (nLESegmentAudio != null) {
                long j2 = 2;
                if (nLESegmentAudio.LJII() > nLETrackSlot.getDuration() / j2) {
                    nLESegmentAudio.LJIIZILJ(nLETrackSlot.getDuration() / j2);
                }
                if (nLESegmentAudio.LJIIIIZZ() > nLETrackSlot.getDuration() / j2) {
                    nLESegmentAudio.LJIJ(nLETrackSlot.getDuration() / j2);
                }
            }
        }
    }

    private final void setSlotExtra(String str, String str2) {
        NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            selectedTrackSlot.setExtra(str, str2);
        }
    }

    public final void changeVolume(float f, EnumC124724uy commitLevel) {
        o.LJIIIZ(commitLevel, "commitLevel");
        this.editor.LJI(f, commitLevel);
    }

    public final boolean deleteClip(NLETrackSlot nLETrackSlot, EnumC124724uy commitLevel) {
        o.LJIIIZ(commitLevel, "commitLevel");
        OSZ<NLETrack, NLETrackSlot> LJJJJL = this.editor.LJJJJL(nLETrackSlot, commitLevel);
        C79057V0z.LJJJJL(getEditorContext(), "delete_slot_event", new C122684rg(EnumC123864ta.VIDEO, LJJJJL.getFirst(), LJJJJL.getSecond()));
        if (LJJJJL.getFirst() != null && LJJJJL.getSecond() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.4wI] */
    public final void changeSpeed(Float f, Boolean bool, boolean z) {
        NLEResourceNode LIZIZ;
        EnumC123874tb LJFF;
        NLETrack trackBySlot;
        NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
        if (selectedTrackSlot == null) {
            return;
        }
        if (C124614un.LJIILIIL(selectedTrackSlot)) {
            LIZIZ = C124614un.LJIIIIZZ(selectedTrackSlot);
        } else {
            NLESegment LJI = selectedTrackSlot.LJI();
            if (LJI == null) {
                return;
            } else {
                LIZIZ = LJI.LIZIZ();
            }
        }
        if (LIZIZ == null || (LJFF = LIZIZ.LJFF()) == null) {
            return;
        }
        C124824v8 c124824v8 = new C124824v8(f, bool, z, new InterfaceC124814v7() { // from class: X.4wI
            @Override // X.InterfaceC124814v7
            public final void LIZ(float f2, boolean z2) {
                CutViewModel.this.getSpeed().setValue(Float.valueOf(f2));
                CutViewModel.this.getChangeTone().setValue(Boolean.valueOf(z2));
            }
        });
        long LJIIJJI = getEditorContext().getMainTrack().LJIIJJI();
        int i = C124024tq.LIZ[LJFF.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            } else {
                this.editor.LJJJ(c124824v8, EnumC124724uy.NONE);
            }
        } else {
            this.editor.LJJJJZI(c124824v8, EnumC124724uy.NONE);
        }
        NLETrackSlot selectedTrackSlot2 = getEditorContext().getSelectedTrackSlot();
        if (selectedTrackSlot2 != null && (trackBySlot = C79057V0z.LJJI(getEditorContext()).getTrackBySlot(selectedTrackSlot2)) != null) {
            if (C79057V0z.LJJIJIL(trackBySlot) == EnumC123864ta.AUDIO) {
                modifyExtraAfterAudioSpeed(trackBySlot);
                adjustAfterAudioSpeed(trackBySlot, selectedTrackSlot2);
            } else if (C79057V0z.LJJIJIL(trackBySlot) == EnumC123864ta.VIDEO) {
                adjustAfterVideoSpeed(LJIIJJI);
            }
        }
        C79057V0z.LJIIL(getEditorContext());
    }

    public static /* synthetic */ void changeVolume$default(CutViewModel cutViewModel, float f, EnumC124724uy enumC124724uy, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC124724uy = EnumC124724uy.DONE;
        }
        cutViewModel.changeVolume(f, enumC124724uy);
    }

    public static /* synthetic */ boolean deleteClip$default(CutViewModel cutViewModel, NLETrackSlot nLETrackSlot, EnumC124724uy enumC124724uy, int i, Object obj) {
        if ((i & 1) != 0) {
            nLETrackSlot = null;
        }
        if ((i & 2) != 0) {
            enumC124724uy = EnumC124724uy.DONE;
        }
        return cutViewModel.deleteClip(nLETrackSlot, enumC124724uy);
    }

    public static /* synthetic */ void changeSpeed$default(CutViewModel cutViewModel, Float f, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        cutViewModel.changeSpeed(f, bool, z);
    }
}
