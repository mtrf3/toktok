package com.bytedance.ies.nle.editor_jni;

import X.EnumC123864ta;
import X.EnumC123874tb;

/* loaded from: classes3.dex */
public class NLETrack extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLETrack(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final void LJ() {
        NLEEditorJniJNI.NLETrack_clearSlot(this.LIZ, this);
    }

    public final EnumC123864ta LJII() {
        return EnumC123864ta.swigToEnum(NLEEditorJniJNI.NLETrack_getExtraTrackType(this.LIZ, this));
    }

    public final VecNLEFilterSPtr LJIIIZ() {
        return new VecNLEFilterSPtr(NLEEditorJniJNI.NLETrack_getFilters(this.LIZ, this));
    }

    public final boolean LJIIJ() {
        return NLEEditorJniJNI.NLETrack_getMainTrack(this.LIZ, this);
    }

    public final long LJIIJJI() {
        return NLEEditorJniJNI.NLETrack_getMaxEnd(this.LIZ, this);
    }

    public final EnumC123874tb LJIIL() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLETrack_getResourceType(this.LIZ, this));
    }

    public final VecNLETrackSlotSPtr LJIILL() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getSlots(this.LIZ, this));
    }

    public final VecNLETrackSlotSPtr LJIILLIIL() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getSortedSlots(this.LIZ, this));
    }

    public final EnumC123864ta LJIIZILJ() {
        return EnumC123864ta.swigToEnum(NLEEditorJniJNI.NLETrack_getTrackType(this.LIZ, this));
    }

    public final VecNLETrackSlotSPtr LJIJ() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getVideoEffects(this.LIZ, this));
    }

    public final void LJJIFFI() {
        NLEEditorJniJNI.NLETrack_timeSort(this.LIZ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLETrack_clone = NLEEditorJniJNI.NLETrack_clone(this.LIZ, this);
        if (NLETrack_clone == 0) {
            return null;
        }
        return new NLENode(NLETrack_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public final long getMeasuredEndTime() {
        return NLEEditorJniJNI.NLETrack_getMeasuredEndTime(this.LIZ, this);
    }

    public NLETrack() {
        this(NLEEditorJniJNI.new_NLETrack());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLETrack(long j) {
        super(NLEEditorJniJNI.NLETrack_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static NLETrack LJFF(NLENode nLENode) {
        long NLETrack_dynamicCast = NLEEditorJniJNI.NLETrack_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLETrack_dynamicCast == 0) {
            return null;
        }
        return new NLETrack(NLETrack_dynamicCast);
    }

    public static long LJI(NLETrack nLETrack) {
        if (nLETrack == null) {
            return 0L;
        }
        return nLETrack.LIZ;
    }

    public final void LIZ(NLEFilter nLEFilter) {
        NLEEditorJniJNI.NLETrack_addFilter(this.LIZ, this, NLEFilter.LIZ(nLEFilter), nLEFilter);
    }

    public final void LIZIZ(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_addSlot(this.LIZ, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    public final NLEFilter LJIIIIZZ(String str) {
        long NLETrack_getFilterByName = NLEEditorJniJNI.NLETrack_getFilterByName(this.LIZ, this, str);
        if (NLETrack_getFilterByName == 0) {
            return null;
        }
        return new NLEFilter(NLETrack_getFilterByName);
    }

    public final NLETrackSlot LJIILIIL(int i) {
        long NLETrack_getSlotByIndex = NLEEditorJniJNI.NLETrack_getSlotByIndex(this.LIZ, this, i);
        if (NLETrack_getSlotByIndex == 0) {
            return null;
        }
        return new NLETrackSlot(NLETrack_getSlotByIndex);
    }

    public final int LJIILJJIL(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLETrack_getSlotIndex(this.LIZ, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    public final void LJIJI(NLEFilter nLEFilter) {
        NLEEditorJniJNI.NLETrack_removeFilter(this.LIZ, this, NLEFilter.LIZ(nLEFilter), nLEFilter);
    }

    public final void LJIJJ(String str) {
        long NLETrack_removeFilterByName = NLEEditorJniJNI.NLETrack_removeFilterByName(this.LIZ, this, str);
        if (NLETrack_removeFilterByName == 0) {
            return;
        }
        new NLEFilter(NLETrack_removeFilterByName);
    }

    public final void LJIJJLI(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_removeSlot(this.LIZ, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    public final void LJIL(EnumC123864ta enumC123864ta) {
        NLEEditorJniJNI.NLETrack_setExtraTrackType(this.LIZ, this, enumC123864ta.swigValue());
    }

    public final void LJJ(boolean z) {
        NLEEditorJniJNI.NLETrack_setMainTrack(this.LIZ, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }

    public final void LIZJ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEEditorJniJNI.NLETrack_addSlotAfterSlot(this.LIZ, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot, NLETrackSlot.LIZJ(nLETrackSlot2), nLETrackSlot2);
    }

    public final void LIZLLL(NLETrackSlot nLETrackSlot, int i) {
        NLEEditorJniJNI.NLETrack_addSlotAtIndex__SWIG_0(this.LIZ, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot, i);
    }

    public final PairSlotSlot LJJI(long j, NLETrackSlot nLETrackSlot) {
        return new PairSlotSlot(NLEEditorJniJNI.NLETrack_splitInSpecificSlot(this.LIZ, this, j, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot));
    }
}
